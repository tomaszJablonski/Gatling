package io.gatling.demo;

import java.time.Duration;
import java.util.*;

import io.gatling.javaapi.core.*;
import io.gatling.javaapi.http.*;
import io.gatling.javaapi.jdbc.*;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.*;
import static io.gatling.javaapi.jdbc.JdbcDsl.*;

public class RecordedSimulationByProxy3 extends Simulation {

  private HttpProtocolBuilder httpProtocol = http
    .baseUrl("https://clients4.google.com")
    .inferHtmlResources(AllowList(), DenyList(".*\\.js", ".*\\.css", ".*\\.gif", ".*\\.jpeg", ".*\\.jpg", ".*\\.ico", ".*\\.woff", ".*\\.woff2", ".*\\.(t|o)tf", ".*\\.png", ".*\\.svg", ".*detectportal\\.firefox\\.com.*"))
  ;
  
  private Map<CharSequence, String> headers_0 = Map.ofEntries(
    Map.entry("Accept-Encoding", "gzip, deflate, br, zstd"),
    Map.entry("Accept-Language", "pl-PL,pl;q=0.9,en-US;q=0.8,en;q=0.7"),
    Map.entry("Sec-Fetch-Dest", "empty"),
    Map.entry("Sec-Fetch-Mode", "no-cors"),
    Map.entry("Sec-Fetch-Site", "none"),
    Map.entry("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/125.0.0.0 Safari/537.36")
  );
  
  private Map<CharSequence, String> headers_1 = Map.ofEntries(
    Map.entry("Accept-Encoding", "gzip, deflate, br, zstd"),
    Map.entry("Accept-Language", "pl-PL,pl;q=0.9,en-US;q=0.8,en;q=0.7"),
    Map.entry("Cache-Control", "no-cache"),
    Map.entry("Content-Type", "application/octet-stream"),
    Map.entry("Pragma", "no-cache"),
    Map.entry("Sec-Fetch-Dest", "empty"),
    Map.entry("Sec-Fetch-Mode", "no-cors"),
    Map.entry("Sec-Fetch-Site", "none"),
    Map.entry("User-Agent", "Chrome WIN 125.0.6422.112 (e099925e675bbb19c42822548f5175ab03a36a32-refs/branch-heads/6422_76@{#3}) channel(stable)"),
    Map.entry("X-Client-Data", "CJK2yQEIorbJAQipncoBCPH2ygEIkqHLAQiFoM0BCPamzQEI3uzNAQjg9c0BCJGHzgEI8IjOAQibic4BCMuKzgEI4ZPOAQjpk84B"),
    Map.entry("authorization", "Bearer ya29.a0AXooCgtfHJoyL2NcAiJwt_ymdDM6hLJzbFf-migi5BopKa9evTt0MrOcbnyU2mpv9KFG6LDR3xJf9xJXFDbvGJ-Y_6eBxLz_GBncAwKnJPhyIgXxdiipN9UgmdlzOQKlMeQ9-cOMkhZmvo2mb6O_-7U66fnBmb1X47gQ3AtJVuk20eCDNM9tE7XbI9Nh6JPCCNbofnh3wio0yEjRQudWBNzGxiHJ_FC-BeYNK0fbdLqCCwgCSfa1bfGyt4tOyICNznmhISNVm2oSp5IaCgYKAR0SARESFQHGX2Mi4uo9j_kjlFWGasCf3zwnnw0278")
  );
  
  private Map<CharSequence, String> headers_3 = Map.ofEntries(
    Map.entry("Accept-Encoding", "gzip, deflate, br, zstd"),
    Map.entry("Accept-Language", "pl-PL,pl;q=0.9,en-US;q=0.8,en;q=0.7"),
    Map.entry("Sec-Fetch-Dest", "empty"),
    Map.entry("Sec-Fetch-Mode", "no-cors"),
    Map.entry("Sec-Fetch-Site", "none"),
    Map.entry("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/125.0.0.0 Safari/537.36"),
    Map.entry("X-Client-Data", "CJK2yQEIorbJAQipncoBCPH2ygEIkqHLAQiFoM0BCPamzQEI3uzNAQjg9c0BCJGHzgEI8IjOAQibic4BCMuKzgEI4ZPOAQjpk84B")
  );
  
  private Map<CharSequence, String> headers_5 = Map.ofEntries(
    Map.entry("Accept-Encoding", "gzip, deflate, br, zstd"),
    Map.entry("Accept-Language", "pl-PL,pl;q=0.9,en-US;q=0.8,en;q=0.7"),
    Map.entry("Content-Type", "application/x-protobuf"),
    Map.entry("Sec-Fetch-Dest", "empty"),
    Map.entry("Sec-Fetch-Mode", "no-cors"),
    Map.entry("Sec-Fetch-Site", "none"),
    Map.entry("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/125.0.0.0 Safari/537.36"),
    Map.entry("X-Client-Data", "CJK2yQEIorbJAQipncoBCPH2ygEIkqHLAQiFoM0BCPamzQEI3uzNAQjg9c0BCJGHzgEI8IjOAQibic4BCMuKzgEI4ZPOAQjpk84B"),
    Map.entry("X-Goog-Api-Key", "AIzaSyBOti4mM-6x9WDnZIjIeyEU21OpBXqWBgw")
  );
  
  private Map<CharSequence, String> headers_6 = Map.ofEntries(
    Map.entry("Accept-Encoding", "gzip, deflate, br, zstd"),
    Map.entry("Accept-Language", "pl-PL,pl;q=0.9,en-US;q=0.8,en;q=0.7"),
    Map.entry("Content-Type", "application/x-protobuf"),
    Map.entry("Sec-Fetch-Dest", "empty"),
    Map.entry("Sec-Fetch-Mode", "no-cors"),
    Map.entry("Sec-Fetch-Site", "none"),
    Map.entry("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/125.0.0.0 Safari/537.36"),
    Map.entry("authorization", "Bearer ya29.a0AXooCgsO7KyvOQBMlpa0hoQu3vO10eUmzqDuNWnEo0mTReXFZnCg7im8pOGt4vHEi_7F2rXQWYulSZ5v_nO11BhZAWe_1ETfwwOarMZ--06WKhQQLef0I8N7s0zoETvR6U31XmYY3oeZfDGwva6hjwUh-nkKwbLu88rXc7n-zBXGWi5jSuGPUChVN3-wMAkySIb6A0ndtnZprXCjQyQQkndPLaLNIOUp9zvxT971vJLExdLnWTJ9fTcKsW5yQ5xT7Ih-BWOD7SYaCgYKATcSARESFQHGX2Miai1b12skhZ17KynLcyz_uQ0274")
  );
  
  private Map<CharSequence, String> headers_9 = Map.ofEntries(
    Map.entry("Accept-Encoding", "gzip, deflate, br, zstd"),
    Map.entry("Content-Type", "application/octet-stream"),
    Map.entry("Sec-Fetch-Dest", "empty"),
    Map.entry("Sec-Fetch-Mode", "no-cors"),
    Map.entry("Sec-Fetch-Site", "none"),
    Map.entry("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/125.0.0.0 Safari/537.36"),
    Map.entry("authorization", "Bearer ya29.a0AXooCgtLFAWIuEc0ocwYbTBSw1_nfMCCi6nSDG03IEN8g9eHSNCrqAh7zIKZVcsrOqTrqKtzJfbGfqmn0dXqf4x7wSTas5S547mPpo_ITfIiK0vyGD2j75YV2CRqbVcVHRlU7Sh5aZ1pnvguTMX2iD-I_oyMUlAwGp_mhLmL04G65URYvuQQ_vOSPnANRvVgt8QBholLWxzhtDHQYhU93nbP9h2CWP4JFQxEY6ddkgzVpUaEJCjoMqYlhOlPMNVt8T-UbsIYIZkaCgYKAdkSARESFQHGX2MiVFtYihueNjCOem1WdP_giQ0274")
  );
  
  private Map<CharSequence, String> headers_10 = Map.ofEntries(
    Map.entry("Accept-Encoding", "gzip, deflate, br, zstd"),
    Map.entry("Accept-Language", "pl-PL,pl;q=0.9,en-US;q=0.8,en;q=0.7"),
    Map.entry("Sec-Fetch-Dest", "empty"),
    Map.entry("Sec-Fetch-Mode", "no-cors"),
    Map.entry("Sec-Fetch-Site", "none"),
    Map.entry("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/125.0.0.0 Safari/537.36"),
    Map.entry("authorization", "Bearer ya29.a0AXooCgvsP6n6-n_IwiARz851AcNvbdAF1ujW9UcFN4z-LFawDuZnAgUa4uZ8A5Ck2wQ7yixo-CNntamwTGhsjFMQ6Ua0DR5tiSkz7Jd5qH9JOK3RvB9GubpMtS-lpxY-2WYBLyrzu5YUUUbU8ClEoWMNBq5hpJcu4hBgZN2HFw_RTTnz6eqRiyf-R1nsuNIGadLlJZ53UQkwCmzIQGMtN68scBnsMNuisD0apaHHTf31hAmrHs0DUHz0pBVQ6j8h7-vbDlWqroUaCgYKAc4SARESFQHGX2Mi1y_bJAVljhh3Ja4QZ1gPZw0274")
  );
  
  private Map<CharSequence, String> headers_11 = Map.ofEntries(
    Map.entry("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7"),
    Map.entry("Accept-Encoding", "gzip, deflate, br, zstd"),
    Map.entry("Accept-Language", "pl-PL,pl;q=0.9,en-US;q=0.8,en;q=0.7"),
    Map.entry("Sec-Fetch-Dest", "document"),
    Map.entry("Sec-Fetch-Mode", "navigate"),
    Map.entry("Sec-Fetch-Site", "none"),
    Map.entry("Sec-Fetch-User", "?1"),
    Map.entry("Upgrade-Insecure-Requests", "1"),
    Map.entry("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/125.0.0.0 Safari/537.36"),
    Map.entry("sec-ch-ua", "\"Google Chrome\";v=\"125\", \"Chromium\";v=\"125\", \"Not.A/Brand\";v=\"24\""),
    Map.entry("sec-ch-ua-mobile", "?0"),
    Map.entry("sec-ch-ua-platform", "\"Windows\"")
  );
  
  private Map<CharSequence, String> headers_12 = Map.ofEntries(
    Map.entry("Accept-Encoding", "gzip, deflate, br, zstd"),
    Map.entry("Sec-Fetch-Dest", "empty"),
    Map.entry("Sec-Fetch-Mode", "no-cors"),
    Map.entry("Sec-Fetch-Site", "none"),
    Map.entry("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/125.0.0.0 Safari/537.36")
  );
  
  private Map<CharSequence, String> headers_17 = Map.ofEntries(
    Map.entry("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7"),
    Map.entry("Accept-Encoding", "gzip, deflate, br, zstd"),
    Map.entry("Accept-Language", "pl-PL,pl;q=0.9,en-US;q=0.8,en;q=0.7"),
    Map.entry("Sec-Fetch-Dest", "document"),
    Map.entry("Sec-Fetch-Mode", "navigate"),
    Map.entry("Sec-Fetch-Site", "same-origin"),
    Map.entry("Sec-Fetch-User", "?1"),
    Map.entry("Upgrade-Insecure-Requests", "1"),
    Map.entry("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/125.0.0.0 Safari/537.36"),
    Map.entry("sec-ch-ua", "\"Google Chrome\";v=\"125\", \"Chromium\";v=\"125\", \"Not.A/Brand\";v=\"24\""),
    Map.entry("sec-ch-ua-mobile", "?0"),
    Map.entry("sec-ch-ua-platform", "\"Windows\"")
  );
  
  private Map<CharSequence, String> headers_18 = Map.ofEntries(
    Map.entry("Accept-Encoding", "gzip, deflate, br, zstd"),
    Map.entry("Accept-Language", "pl-PL,pl;q=0.9,en-US;q=0.8,en;q=0.7"),
    Map.entry("Origin", "https://www.google.com"),
    Map.entry("Sec-Fetch-Dest", "empty"),
    Map.entry("Sec-Fetch-Mode", "no-cors"),
    Map.entry("Sec-Fetch-Site", "none"),
    Map.entry("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/125.0.0.0 Safari/537.36")
  );
  
  private Map<CharSequence, String> headers_19 = Map.ofEntries(
    Map.entry("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7"),
    Map.entry("Accept-Encoding", "gzip, deflate, br, zstd"),
    Map.entry("Accept-Language", "pl-PL,pl;q=0.9,en-US;q=0.8,en;q=0.7"),
    Map.entry("Cache-Control", "max-age=0"),
    Map.entry("Origin", "https://computer-database.gatling.io"),
    Map.entry("Sec-Fetch-Dest", "document"),
    Map.entry("Sec-Fetch-Mode", "navigate"),
    Map.entry("Sec-Fetch-Site", "same-origin"),
    Map.entry("Sec-Fetch-User", "?1"),
    Map.entry("Upgrade-Insecure-Requests", "1"),
    Map.entry("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/125.0.0.0 Safari/537.36"),
    Map.entry("sec-ch-ua", "\"Google Chrome\";v=\"125\", \"Chromium\";v=\"125\", \"Not.A/Brand\";v=\"24\""),
    Map.entry("sec-ch-ua-mobile", "?0"),
    Map.entry("sec-ch-ua-platform", "\"Windows\"")
  );
  
  private String uri01 = "https://accounts.google.com/ListAccounts";
  
  private String uri02 = "https://translate.googleapis.com/translate_a/l";
  
  private String uri03 = "https://kidsmanagement-pa.googleapis.com/kidsmanagement/v1";
  
  private String uri04 = "https://safebrowsing.google.com/safebrowsing/clientreport/realtime";
  
  private String uri05 = "https://optimizationguide-pa.googleapis.com/v1:GetHints";
  
  private String uri06 = "https://www.googleapis.com/oauth2/v4/token";
  
  private String uri07 = "https://go.microsoft.com/fwlink";
  
  private String uri08 = "https://computer-database.gatling.io/computers";
  
  private String uri09 = "https://www.google.com/complete/search";

  private ScenarioBuilder scn = scenario("RecordedSimulationByProxy3")
    .exec(
      http("request_0")
        .post(uri06)
        .headers(headers_0)
        .formParam("client_id", "77185425430.apps.googleusercontent.com")
        .formParam("client_secret", "OTJgUOQcT7lO7GsGZq2G4IlT")
        .formParam("grant_type", "refresh_token")
        .formParam("refresh_token", "1//03mgyAFuUzKZSCgYIARAAGAMSNwF-L9IrhHzw-kr6WBGh4KKWK7mbXpQo1Ey9RAEgIa7LeE17ZncPuc1Qjy1jjCIS6DSdD22HbDo")
        .formParam("scope", "https://www.googleapis.com/auth/chromesync")
        .resources(
          http("request_1")
            .post("/chrome-sync/command/?client=Google+Chrome&client_id=U%2BxzbXTT%2BYQFmFwU4xcZow%3D%3D")
            .headers(headers_1)
            .body(RawFileBody("io/gatling/demo/recordedsimulationbyproxy3/0001_request.dat")),
          http("request_2")
            .post("/chrome-sync/command/?client=Google+Chrome&client_id=U%2BxzbXTT%2BYQFmFwU4xcZow%3D%3D")
            .headers(headers_1)
            .body(RawFileBody("io/gatling/demo/recordedsimulationbyproxy3/0002_request.dat"))
        ),
      pause(7),
      // Home,
      http("request_3")
        .get(uri09 + "?client=chrome-omni&gs_ri=chrome-ext-ansg&xssi=t&q=&oit=0&gs_rn=42&sugkey=AIzaSyBOti4mM-6x9WDnZIjIeyEU21OpBXqWBgw")
        .headers(headers_3)
        .resources(
          http("request_4")
            .post(uri06)
            .headers(headers_0)
            .formParam("client_id", "77185425430.apps.googleusercontent.com")
            .formParam("client_secret", "OTJgUOQcT7lO7GsGZq2G4IlT")
            .formParam("grant_type", "refresh_token")
            .formParam("refresh_token", "1//03mgyAFuUzKZSCgYIARAAGAMSNwF-L9IrhHzw-kr6WBGh4KKWK7mbXpQo1Ey9RAEgIa7LeE17ZncPuc1Qjy1jjCIS6DSdD22HbDo")
            .formParam("scope", "https://www.googleapis.com/auth/kid.permission"),
          http("request_5")
            .post(uri05 + "?")
            .headers(headers_5)
            .body(RawFileBody("io/gatling/demo/recordedsimulationbyproxy3/0005_request.dat")),
          http("request_6")
            .post(uri03 + "/people/me:classifyUrl?alt=proto")
            .headers(headers_6)
            .body(RawFileBody("io/gatling/demo/recordedsimulationbyproxy3/0006_request.dat")),
          http("request_7")
            .post(uri06)
            .headers(headers_0)
            .formParam("client_id", "77185425430.apps.googleusercontent.com")
            .formParam("client_secret", "OTJgUOQcT7lO7GsGZq2G4IlT")
            .formParam("grant_type", "refresh_token")
            .formParam("refresh_token", "1//03mgyAFuUzKZSCgYIARAAGAMSNwF-L9IrhHzw-kr6WBGh4KKWK7mbXpQo1Ey9RAEgIa7LeE17ZncPuc1Qjy1jjCIS6DSdD22HbDo")
            .formParam("scope", "https://www.googleapis.com/auth/chrome-safe-browsing"),
          http("request_8")
            .post(uri06)
            .headers(headers_0)
            .formParam("client_id", "77185425430.apps.googleusercontent.com")
            .formParam("client_secret", "OTJgUOQcT7lO7GsGZq2G4IlT")
            .formParam("grant_type", "refresh_token")
            .formParam("refresh_token", "1//03mgyAFuUzKZSCgYIARAAGAMSNwF-L9IrhHzw-kr6WBGh4KKWK7mbXpQo1Ey9RAEgIa7LeE17ZncPuc1Qjy1jjCIS6DSdD22HbDo")
            .formParam("scope", "https://www.googleapis.com/auth/kid.family.readonly"),
          http("request_9")
            .post(uri04)
            .headers(headers_9)
            .body(RawFileBody("io/gatling/demo/recordedsimulationbyproxy3/0009_request.bin")),
          http("request_10")
            .get(uri03 + "/families/mine/members?alt=proto")
            .headers(headers_10),
          http("request_11")
            .get(uri08)
            .headers(headers_11),
          http("request_12")
            .get(uri02 + "?client=chrome&hl=pl&key=AIzaSyBOti4mM-6x9WDnZIjIeyEU21OpBXqWBgw")
            .headers(headers_12)
        ),
      pause(5),
      http("request_13")
        .post("/chrome-sync/command/?client=Google+Chrome&client_id=U%2BxzbXTT%2BYQFmFwU4xcZow%3D%3D")
        .headers(headers_1)
        .body(RawFileBody("io/gatling/demo/recordedsimulationbyproxy3/0013_request.dat")),
      pause(10),
      // Create new Computer,
      http("request_14")
        .post(uri05 + "?")
        .headers(headers_5)
        .body(RawFileBody("io/gatling/demo/recordedsimulationbyproxy3/0014_request.dat"))
        .resources(
          http("request_15")
            .post(uri03 + "/people/me:classifyUrl?alt=proto")
            .headers(headers_6)
            .body(RawFileBody("io/gatling/demo/recordedsimulationbyproxy3/0015_request.dat")),
          http("request_16")
            .post(uri04)
            .headers(headers_9)
            .body(RawFileBody("io/gatling/demo/recordedsimulationbyproxy3/0016_request.bin")),
          http("request_17")
            .get(uri08 + "/new")
            .headers(headers_17)
        ),
      pause(6),
      http("request_18")
        .post(uri01 + "?gpsia=1&source=ChromiumBrowser&json=standard")
        .headers(headers_18)
        .formParam(" ", ""),
      pause(7),
      http("request_19")
        .post(uri08)
        .headers(headers_19)
        .formParam("name", "com1")
        .formParam("introduced", "1960-01-27")
        .formParam("discontinued", "1960-01-27")
        .formParam("company", "12")
        .check(status().is(400)),
      pause(1),
      http("request_20")
        .post("/chrome-sync/command/?client=Google+Chrome&client_id=U%2BxzbXTT%2BYQFmFwU4xcZow%3D%3D")
        .headers(headers_1)
        .body(RawFileBody("io/gatling/demo/recordedsimulationbyproxy3/0020_request.dat")),
      pause(9),
      http("request_21")
        .get(uri07 + "/?linkid=2169928"),
      pause(15),
      // End Test,
      http("request_22")
        .post("/chrome-sync/command/?client=Google+Chrome&client_id=U%2BxzbXTT%2BYQFmFwU4xcZow%3D%3D")
        .headers(headers_1)
        .body(RawFileBody("io/gatling/demo/recordedsimulationbyproxy3/0022_request.dat"))
    );

  {
	  setUp(scn.injectOpen(atOnceUsers(1))).protocols(httpProtocol);
  }
}
