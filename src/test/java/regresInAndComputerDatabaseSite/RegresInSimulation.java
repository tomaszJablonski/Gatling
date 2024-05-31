package regresInAndComputerDatabaseSite;

import io.gatling.javaapi.core.ScenarioBuilder;
import io.gatling.javaapi.core.Simulation;
import io.gatling.javaapi.http.HttpProtocolBuilder;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.http;
import static io.gatling.javaapi.http.HttpDsl.status;

public class RegresInSimulation extends Simulation {

    //protocol
    private HttpProtocolBuilder httpProtocol = http
            .baseUrl("https://reqres.in/api");

    //scenario
    private ScenarioBuilder scenarioGetUser = scenario("Get single user")
            .exec(http("Get user")
                    //tutaj podajemy path i query paramas
                    .get("/users/2")
                    .check(
                            //tutaj sprawdzamy status jaki ma przyjść
                            status().is(200),
                            //tutaj sprawdzamy konkretnie jsona czy przychodzi w nim wartość taka jaka chcemy
                            //jsonpathfinder.com - wkleić tam jsona i łatwiej jest wyznaczyć ścieżkę
                            //do value jakie nas interesuje
                            jsonPath("$.data.first_name").is("Janet")
                    )
            );

    private ScenarioBuilder scenarioPostUser = scenario("Post user")
            .exec(http("Create user")
                    .post("/users")
                    .header("content-type", "application/json")
                    .asJson()
                    .body(StringBody("{\n" +
                            "    \"name\": \"morpheus\",\n" +
                            "    \"job\": \"leader\"\n" +
                            "}"))
                    .check(status().is(201),
                            jsonPath("$.name").is("morpheus")
                    )
            );

    private ScenarioBuilder scenarioPostUserFromFile = scenario("Post user from File")
            .exec(http("Create user from File")
                    .post("/users")
                    .header("content-type", "application/json")
                    .asJson()
                    .body(RawFileBody("regresInAndComputerDatabaseSite/postRegresIn.json"))
                    .check(status().is(201),
                            jsonPath("$.name").is("morpheus")
                    )
            );

    private ScenarioBuilder scenarioPutUserFromFile = scenario("Put user from File")
            .exec(http("Update user from File")
                    .put("/users/394")
                    .header("content-type", "application/json")
                    .asJson()
                    .body(RawFileBody("regresInAndComputerDatabaseSite/putRegresIn.json"))
                    .check(status().is(200),
                            jsonPath("$.name").is("Neo")
                    )
            );

    private ScenarioBuilder scenarioDeleteUser = scenario("Delete user")
            .exec(http("Delete user")
                    .delete("/users/2")
                    .check(
                            status().is(204)
                    )
            );

    //setup
    {
        setUp(scenarioGetUser.injectOpen(atOnceUsers(10)),
                scenarioPostUser.injectOpen(atOnceUsers(10)),
                scenarioPostUserFromFile.injectOpen((atOnceUsers(10))),
                scenarioPutUserFromFile.injectOpen(atOnceUsers(10)),
                scenarioDeleteUser.injectOpen(atOnceUsers(10))
        ).protocols(httpProtocol);
    }
}
