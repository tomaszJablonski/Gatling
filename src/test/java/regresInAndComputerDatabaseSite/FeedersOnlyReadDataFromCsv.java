package regresInAndComputerDatabaseSite;

import io.gatling.javaapi.core.FeederBuilder;
import io.gatling.javaapi.core.ScenarioBuilder;
import io.gatling.javaapi.core.Simulation;

import static io.gatling.javaapi.core.CoreDsl.*;

public class FeedersOnlyReadDataFromCsv extends Simulation {

    //protocol

    //scenario
    private final FeederBuilder.Batchable<String> feeder =
            csv("feeders/data.csv").circular();

    private ScenarioBuilder scenarioFeeder = scenario("Use Feeder")
            .repeat(1).on(
                    feed(feeder)
                            .exec(session -> {
                                System.out.println("Name: " + session.getString("name"));
                                System.out.println("Job: " + session.getString("job"));
                                System.out.println("Id: " + session.getString("id"));
                                return session;
                            })
                            .pause(1));

    //setup

    {
        setUp(scenarioFeeder.injectOpen(atOnceUsers(4)));
    }
}