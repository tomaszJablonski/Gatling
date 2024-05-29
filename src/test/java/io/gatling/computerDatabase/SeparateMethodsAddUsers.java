package io.gatling.computerDatabase;

import io.gatling.javaapi.core.ChainBuilder;
import io.gatling.javaapi.core.ScenarioBuilder;
import io.gatling.javaapi.core.Simulation;
import io.gatling.javaapi.http.HttpProtocolBuilder;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.http;

/*Kiedy powstanie jeden duży Scenariusz trzeba wyrzucić headers
i podzielić go na mniejsze tak jak zrobiłem poniżej żeby to nie był
jeden monolityczny scenariusz

 */

public class SeparateMethodsAddUsers extends Simulation {

    private HttpProtocolBuilder httpProtocol = http
            .baseUrl("https://computer-database.gatling.io")
            .inferHtmlResources(AllowList(), DenyList(".*\\.js", ".*\\.css", ".*\\.gif", ".*\\.jpeg", ".*\\.jpg", ".*\\.ico", ".*\\.woff", ".*\\.woff2", ".*\\.(t|o)tf", ".*\\.png", ".*\\.svg", ".*detectportal\\.firefox\\.com.*"))
            .acceptHeader("text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7")
            .acceptEncodingHeader("gzip, deflate, br")
            .acceptLanguageHeader("pl,en;q=0.9,en-GB;q=0.8,en-US;q=0.7")
            .upgradeInsecureRequestsHeader("1")
            .userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/125.0.0.0 Safari/537.36 Edg/125.0.0.0");

    private ChainBuilder clickAddNewComputer =
            exec(http("Click add new Computer")
                            .get("/computers/new"),
                    pause(4));

    private ChainBuilder addNewComputer =
            exec(http("Add new computer")
                            .post("/computers")
                            .formParam("name", "Test1")
                            .formParam("introduced", "2024-05-27")
                            .formParam("discontinued", "2024-05-31")
                            .formParam("company", "1"),
                    pause(4));

    private ChainBuilder chooseOneRandomComputer =
            exec(http("Choose one random computer")
                            .get("/computers/500"),
                    pause(3));

    private ChainBuilder deleteRandomComputer =
            exec(http("Delete the random computer")
                    .post("/computers/500/delete"));

    private ScenarioBuilder users = scenario("Users")
            .exec(chooseOneRandomComputer
            );

    private ScenarioBuilder admin = scenario("Admin")
            .exec(clickAddNewComputer,
                    addNewComputer,
                    chooseOneRandomComputer,
                    deleteRandomComputer
            );

//  {
//	  setUp(admin.injectOpen(atOnceUsers(10))).protocols(httpProtocol);
//  }


    //setup virtual users - przypisujemy userów i patrzymy jak zachowuje się na wykresach

    {

        setUp(
                users.injectOpen(
                        nothingFor(4), // 1
                        atOnceUsers(10), // 2
                        rampUsers(10).during(5), // 3
                        constantUsersPerSec(20).during(15), // 4
                        constantUsersPerSec(20).during(15).randomized(), // 5
                        rampUsersPerSec(10).to(20).during(10), // 6
                        rampUsersPerSec(10).to(20).during(10).randomized(), // 7
                        stressPeakUsers(1000).during(20) // 8// 2
                ),

                admin.injectClosed(
                        constantConcurrentUsers(10).during(10), // 1
                        rampConcurrentUsers(10).to(20).during(10) // 2
                )

//                users.injectOpen(rampUsers(10).during(5)),
//                admin.injectOpen(rampUsers(10).during(10))
        ).protocols(httpProtocol);

    }
}
