package regresInAndComputerDatabaseSite;

import java.time.Duration;
import java.util.*;

import io.gatling.javaapi.core.*;
import io.gatling.javaapi.http.*;
import io.gatling.javaapi.jdbc.*;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.*;
import static io.gatling.javaapi.jdbc.JdbcDsl.*;

public class Chaining extends Simulation {

  private HttpProtocolBuilder httpProtocol = http
    .baseUrl("https://computer-database.gatling.io")
    .inferHtmlResources(AllowList(), DenyList(".*\\.js", ".*\\.css", ".*\\.gif", ".*\\.jpeg", ".*\\.jpg", ".*\\.ico", ".*\\.woff", ".*\\.woff2", ".*\\.(t|o)tf", ".*\\.png", ".*\\.svg", ".*detectportal\\.firefox\\.com.*"))
    .acceptHeader("text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7")
    .acceptEncodingHeader("gzip, deflate, br")
    .acceptLanguageHeader("pl,en;q=0.9,en-GB;q=0.8,en-US;q=0.7")
    .upgradeInsecureRequestsHeader("1")
    .userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/125.0.0.0 Safari/537.36 Edg/125.0.0.0");


  private ScenarioBuilder scn = scenario("Chaining")
    .exec(
      http("Load Home Page")
        .get("/computers"),
      pause(2),
      http("New Computer Page")
        .get("/computers/new"),
      pause(4),
      http("Created the computer")
        .post("/computers")
        .formParam("name", "Mycomp1")
        .formParam("introduced", "2024-05-27")
        .formParam("discontinued", "2024-05-31")
        .formParam("company", "17"),
      pause(4),
      http("Search computer ACE")
        .get("/computers?f=ace")
              //wyszukiwanie po ID dla xmli
            .check(regex("computers/\\d+").exists().saveAs("computerId")),
           // wyszukiwanie po jsonPath
           //.check(jsonPath().exists().saveAs("Id"))
      pause(1),
      http("Select computer #{computerId}")
        .get("/#{computerId}"),
      pause(3),
      http("Deleting computer #{computerId}")
        .post("/#{computerId}/delete")
    );

  {
	  setUp(scn.injectOpen(atOnceUsers(1))).protocols(httpProtocol);
  }
}