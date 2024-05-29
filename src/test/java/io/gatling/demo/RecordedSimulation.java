package io.gatling.demo;

import java.time.Duration;
import java.util.*;

import io.gatling.javaapi.core.*;
import io.gatling.javaapi.http.*;
import io.gatling.javaapi.jdbc.*;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.*;
import static io.gatling.javaapi.jdbc.JdbcDsl.*;

public class RecordedSimulation extends Simulation {

  private HttpProtocolBuilder httpProtocol = http
    .baseUrl("https://computer-database.gatling.io")
    .inferHtmlResources()
    .acceptHeader("text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7")
    .acceptEncodingHeader("gzip, deflate, br")
    .acceptLanguageHeader("pl,en;q=0.9,en-GB;q=0.8,en-US;q=0.7")
    .upgradeInsecureRequestsHeader("1")
    .userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/125.0.0.0 Safari/537.36 Edg/125.0.0.0");
  
  private Map<CharSequence, String> headers_0 = Map.ofEntries(
    Map.entry("priority", "u=0, i"),
    Map.entry("sec-ch-ua", "Microsoft Edge\";v=\"125\", \"Chromium\";v=\"125\", \"Not.A/Brand\";v=\"24"),
    Map.entry("sec-ch-ua-mobile", "?0"),
    Map.entry("sec-ch-ua-platform", "Windows"),
    Map.entry("sec-fetch-dest", "document"),
    Map.entry("sec-fetch-mode", "navigate"),
    Map.entry("sec-fetch-site", "none"),
    Map.entry("sec-fetch-user", "?1")
  );
  
  private Map<CharSequence, String> headers_1 = Map.ofEntries(
    Map.entry("priority", "u=0, i"),
    Map.entry("sec-ch-ua", "Microsoft Edge\";v=\"125\", \"Chromium\";v=\"125\", \"Not.A/Brand\";v=\"24"),
    Map.entry("sec-ch-ua-mobile", "?0"),
    Map.entry("sec-ch-ua-platform", "Windows"),
    Map.entry("sec-fetch-dest", "document"),
    Map.entry("sec-fetch-mode", "navigate"),
    Map.entry("sec-fetch-site", "same-origin"),
    Map.entry("sec-fetch-user", "?1")
  );
  
  private Map<CharSequence, String> headers_2 = Map.ofEntries(
    Map.entry("origin", "https://computer-database.gatling.io"),
    Map.entry("priority", "u=0, i"),
    Map.entry("sec-ch-ua", "Microsoft Edge\";v=\"125\", \"Chromium\";v=\"125\", \"Not.A/Brand\";v=\"24"),
    Map.entry("sec-ch-ua-mobile", "?0"),
    Map.entry("sec-ch-ua-platform", "Windows"),
    Map.entry("sec-fetch-dest", "document"),
    Map.entry("sec-fetch-mode", "navigate"),
    Map.entry("sec-fetch-site", "same-origin"),
    Map.entry("sec-fetch-user", "?1")
  );


  private ScenarioBuilder scn = scenario("RecordedSimulation")
    .exec(
      http("request_0")
        .get("/computers")
        .headers(headers_0),
      pause(10),
      http("request_1")
        .get("/computers/new")
        .headers(headers_1),
      pause(36),
      http("request_2")
        .post("/computers")
        .headers(headers_2)
        .formParam("name", "MyComputer1")
        .formParam("introduced", "2024-05-27")
        .formParam("discontinued", "2024-05-31")
        .formParam("company", "1")
    );

  {
	  setUp(scn.injectOpen(atOnceUsers(1))).protocols(httpProtocol);
  }
}
