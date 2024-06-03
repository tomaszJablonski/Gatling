package regresInAndComputerDatabaseSite;

import io.gatling.javaapi.core.FeederBuilder;
import io.gatling.javaapi.core.OpenInjectionStep;
import io.gatling.javaapi.core.ScenarioBuilder;
import io.gatling.javaapi.core.Simulation;
import io.gatling.javaapi.http.HttpProtocolBuilder;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.http;
import static io.gatling.javaapi.http.HttpDsl.status;

public class FeedersPostRegresIn extends Simulation {

    //protocol

    //scenario
    private final FeederBuilder<String> feeder = csv("feeders/dataForPostRegresIn.csv").random();

    // Konfiguracja HTTP
    private final HttpProtocolBuilder httpProtocol = http
            .baseUrl("https://reqres.in/api") // Podstawowy URL serwera
            .acceptHeader("application/json") // Nagłówek akceptujący JSON
            .contentTypeHeader("application/json"); // Nagłówek Content-Type jako JSON

    // Definicja scenariusza
    private final ScenarioBuilder scn = scenario("CSV Feeder Scenario")
            .feed(feeder)
            .exec(
                    http("Post JSON Request")
                            .post("/users")
                            .asJson()
                            .body(StringBody("{\n" +
                                    "    \"name\": \"${name}\",\n" +
                                    "    \"job\": \"${job}\"\n" +
                                    "}"))
                            .check(status().is(201))); // Sprawdzenie, czy status odpowiedzi to 200

    // Uruchomienie symulacji

    {
        setUp(scn.injectOpen(OpenInjectionStep.atOnceUsers(10))).protocols(httpProtocol);
    }
}