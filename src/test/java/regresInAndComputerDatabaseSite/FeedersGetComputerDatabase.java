package regresInAndComputerDatabaseSite;

import io.gatling.javaapi.core.FeederBuilder;
import io.gatling.javaapi.core.ScenarioBuilder;
import io.gatling.javaapi.core.Simulation;
import io.gatling.javaapi.http.HttpProtocolBuilder;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.http;

public class FeedersGetComputerDatabase extends Simulation {

    //protocol

    private final HttpProtocolBuilder httpProtocol = http.baseUrl("https://computer-database.gatling.io");

    //scenario
    private final FeederBuilder.Batchable<String> feeder =
            csv("feeders/dataComputerDatabase.csv").circular();

    private final ScenarioBuilder scenarioGetByFeeder = scenario("Use Feeder in CD")
            .repeat(1).on(
                    feed(feeder)
                            .exec(session -> {
                                System.out.println("Page: " + session.getString("pages"));
                                return session;
                            })
                            .exec(http("Page Get #{pages}")
                                    .get("/#{pages}")))
            .pause(1);

    //setup

    {
        setUp(scenarioGetByFeeder.injectOpen(atOnceUsers(3))).protocols(httpProtocol);
    }
}