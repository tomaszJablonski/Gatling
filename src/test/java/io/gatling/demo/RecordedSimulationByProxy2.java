package io.gatling.demo;

import java.time.Duration;
import java.util.*;

import io.gatling.javaapi.core.*;
import io.gatling.javaapi.http.*;
import io.gatling.javaapi.jdbc.*;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.*;
import static io.gatling.javaapi.jdbc.JdbcDsl.*;

public class RecordedSimulationByProxy2 extends Simulation {

  private HttpProtocolBuilder httpProtocol = http
    .baseUrl("https://www.googleapis.com")
    .inferHtmlResources()
    .acceptEncodingHeader("gzip, deflate, br")
    .userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/125.0.0.0 Safari/537.36");
  
  private Map<CharSequence, String> headers_0 = Map.ofEntries(
    Map.entry("Accept-Language", "pl-PL,pl;q=0.9,en-US;q=0.8,en;q=0.7"),
    Map.entry("Sec-Fetch-Dest", "empty"),
    Map.entry("Sec-Fetch-Mode", "no-cors"),
    Map.entry("Sec-Fetch-Site", "none")
  );
  
  private Map<CharSequence, String> headers_2 = Map.ofEntries(
    Map.entry("Accept-Language", "pl-PL,pl;q=0.9,en-US;q=0.8,en;q=0.7"),
    Map.entry("Sec-Fetch-Dest", "empty"),
    Map.entry("Sec-Fetch-Mode", "no-cors"),
    Map.entry("Sec-Fetch-Site", "none"),
    Map.entry("authorization", "Bearer ya29.a0AXooCgvKlAAD8o5WK3tEnJFieq_RaQivYmDMKWYF3BzmFwDM4cMy0vnv_lLW5-e6RTaq1jncG-hGRF12XVNz7B_SzTBEe8vCyghrxo6T2N0Mfz5Yt7Ui7mIGFnTXU8JU9tmsLhpDrVWMe3L-X7ZWCQTeODT0kHzMQDfiqTxbwMbunIN4AYZ6VdRAvhWUZjMBEYCUG29BC0Y_lx7yvxDDjPROifeELcXdT_z-S34O5YNAtNzdOP_ujDzpBPTgvxX1KwNftN3r9G0aCgYKARwSARESFQHGX2MiYInpcbuIS2hUghH-K1-h4Q0274")
  );
  
  private Map<CharSequence, String> headers_3 = Map.ofEntries(
    Map.entry("Accept-Language", "pl-PL,pl;q=0.9,en-US;q=0.8,en;q=0.7"),
    Map.entry("Sec-Fetch-Dest", "empty"),
    Map.entry("Sec-Fetch-Mode", "no-cors"),
    Map.entry("Sec-Fetch-Site", "none"),
    Map.entry("X-Client-Data", "CJK2yQEIorbJAQipncoBCPH2ygEIlKHLAQiFoM0BCPamzQEI3uzNAQjg9c0BCJGHzgEI8IjOAQibic4BCMuKzgEI4ZPOAQjpk84B")
  );
  
  private Map<CharSequence, String> headers_4 = Map.ofEntries(
    Map.entry("Accept-Language", "pl-PL,pl;q=0.9,en-US;q=0.8,en;q=0.7"),
    Map.entry("Content-Type", "application/x-protobuf"),
    Map.entry("Sec-Fetch-Dest", "empty"),
    Map.entry("Sec-Fetch-Mode", "no-cors"),
    Map.entry("Sec-Fetch-Site", "none"),
    Map.entry("X-Client-Data", "CJK2yQEIorbJAQipncoBCPH2ygEIlKHLAQiFoM0BCPamzQEI3uzNAQjg9c0BCJGHzgEI8IjOAQibic4BCMuKzgEI4ZPOAQjpk84B"),
    Map.entry("X-Goog-Api-Key", "AIzaSyBOti4mM-6x9WDnZIjIeyEU21OpBXqWBgw")
  );
  
  private Map<CharSequence, String> headers_5 = Map.ofEntries(
    Map.entry("Content-Type", "application/json"),
    Map.entry("Sec-Fetch-Dest", "empty"),
    Map.entry("Sec-Fetch-Mode", "no-cors"),
    Map.entry("Sec-Fetch-Site", "none"),
    Map.entry("X-Goog-Update-AppId", "niikhdgajlphfehepabhhblakbdgeefj,ihnlcenocehgdaegdmhbidjhnhdchfmm,neifaoindggfcjicffkgpmnlppeffabd,oimompecagnajdejgnnjijobebaeigek,gcmjkmgdlgnkkcocmoeiminaijmmjnii,obedbbhbpmojnkanicioggnmelmoomoc,lmelglejhemejginpboagddgdfbepgmp,kiabhabjdbkjdpjbpigfodbdjmbglcoo,giekcmmlnklenlaomppkphknjmnnpneh,khaoiebndkojlmppeemjhbpbandiljpe,laoigpblnllgcgjnjnllmfolckpjlhki,llkgjffcdpffmhiakmfcdcblohccpfmo,ehgidpndbllacpjalkiimkbadgjfnnmc,efniojlnjndmcbiieegkicadnoecjjef,jflookgnkcckhobaglndicnbbgbonegd,ggkkehgbnfjpeggfpleeakpidbkibbmn,jamhcnnkihinmdlkakkaopbjbbcngflc,hfnkpimlhhgieaddgfemjhofmfblmnib,ojhpjlocmbogdgmfpkhlaaeamibhnphh,eeigpngbgcognadeebkilcpcaedhellh,jflhchccmppkfebkiaminageehmchikm,gonpemdgkjcecdgbnaabipppbmgfggbe"),
    Map.entry("X-Goog-Update-Interactivity", "bg"),
    Map.entry("X-Goog-Update-Updater", "chrome-125.0.6422.112")
  );
  
  private Map<CharSequence, String> headers_7 = Map.ofEntries(
    Map.entry("Accept-Language", "pl-PL,pl;q=0.9,en-US;q=0.8,en;q=0.7"),
    Map.entry("Content-Type", "application/x-protobuf"),
    Map.entry("Sec-Fetch-Dest", "empty"),
    Map.entry("Sec-Fetch-Mode", "no-cors"),
    Map.entry("Sec-Fetch-Site", "none"),
    Map.entry("authorization", "Bearer ya29.a0AXooCgvO4Q8I0AFW_NXgvN8DCSd5HvYArrA_aQcdakPS71e8j-XNZ6NavsrTebe-b5l4rASvTHfoHbABINNP2XaCCOPZIvkWWDSmbL8JF6PbA4LnJxAv5VMsY_6fitj4mml2TSNoOel_1rzif7-J1HsaJuttCp3agq70TePOTQIp9edrjcQcji4_3SGwj38ZSY_IxEXV5g9_oQkGmXD-PQbsCGeApNl-hAbcsGWkw0rF_6MNWMGhKCZkt3hNShOi7RpHpBbwsgEaCgYKAUkSARESFQHGX2MiOMeegEL5MYqNh6518g6ZBg0274")
  );
  
  private Map<CharSequence, String> headers_8 = Map.ofEntries(
    Map.entry("Content-Type", "application/octet-stream"),
    Map.entry("Sec-Fetch-Dest", "empty"),
    Map.entry("Sec-Fetch-Mode", "no-cors"),
    Map.entry("Sec-Fetch-Site", "none")
  );
  
  private Map<CharSequence, String> headers_9 = Map.ofEntries(
    Map.entry("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7"),
    Map.entry("Accept-Language", "pl-PL,pl;q=0.9,en-US;q=0.8,en;q=0.7"),
    Map.entry("Sec-Fetch-Dest", "document"),
    Map.entry("Sec-Fetch-Mode", "navigate"),
    Map.entry("Sec-Fetch-Site", "none"),
    Map.entry("Sec-Fetch-User", "?1"),
    Map.entry("Upgrade-Insecure-Requests", "1"),
    Map.entry("sec-ch-ua", "\"Google Chrome\";v=\"125\", \"Chromium\";v=\"125\", \"Not.A/Brand\";v=\"24\""),
    Map.entry("sec-ch-ua-mobile", "?0"),
    Map.entry("sec-ch-ua-platform", "\"Windows\"")
  );
  
  private Map<CharSequence, String> headers_10 = Map.ofEntries(
    Map.entry("Accept", "text/css,*/*;q=0.1"),
    Map.entry("Accept-Language", "pl-PL,pl;q=0.9,en-US;q=0.8,en;q=0.7"),
    Map.entry("Sec-Fetch-Dest", "style"),
    Map.entry("Sec-Fetch-Mode", "no-cors"),
    Map.entry("Sec-Fetch-Site", "same-origin"),
    Map.entry("sec-ch-ua", "\"Google Chrome\";v=\"125\", \"Chromium\";v=\"125\", \"Not.A/Brand\";v=\"24\""),
    Map.entry("sec-ch-ua-mobile", "?0"),
    Map.entry("sec-ch-ua-platform", "\"Windows\"")
  );
  
  private Map<CharSequence, String> headers_11 = Map.ofEntries(
    Map.entry("Accept-Language", "pl-PL,pl;q=0.9,en-US;q=0.8,en;q=0.7"),
    Map.entry("Sec-Fetch-Dest", "empty"),
    Map.entry("Sec-Fetch-Mode", "no-cors"),
    Map.entry("Sec-Fetch-Site", "none"),
    Map.entry("X-Client-Data", "CJK2yQEIorbJAQipncoBCPH2ygEIlKHLAQiFoM0BCPamzQEI3uzNAQjg9c0BCJGHzgEI8IjOAQibic4BCMuKzgEI4ZPOAQjpk84B"),
    Map.entry("X-Goog-Api-Key", "AIzaSyBOti4mM-6x9WDnZIjIeyEU21OpBXqWBgw"),
    Map.entry("X-Goog-Encode-Response-If-Executable", "base64")
  );
  
  private Map<CharSequence, String> headers_13 = Map.ofEntries(
    Map.entry("Sec-Fetch-Dest", "empty"),
    Map.entry("Sec-Fetch-Mode", "no-cors"),
    Map.entry("Sec-Fetch-Site", "none")
  );
  
  private Map<CharSequence, String> headers_14 = Map.ofEntries(
    Map.entry("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8"),
    Map.entry("Accept-Language", "pl-PL,pl;q=0.9,en-US;q=0.8,en;q=0.7"),
    Map.entry("Sec-Fetch-Dest", "image"),
    Map.entry("Sec-Fetch-Mode", "no-cors"),
    Map.entry("Sec-Fetch-Site", "same-origin"),
    Map.entry("sec-ch-ua", "\"Google Chrome\";v=\"125\", \"Chromium\";v=\"125\", \"Not.A/Brand\";v=\"24\""),
    Map.entry("sec-ch-ua-mobile", "?0"),
    Map.entry("sec-ch-ua-platform", "\"Windows\"")
  );
  
  private Map<CharSequence, String> headers_18 = Map.ofEntries(
    Map.entry("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7"),
    Map.entry("Accept-Language", "pl-PL,pl;q=0.9,en-US;q=0.8,en;q=0.7"),
    Map.entry("Sec-Fetch-Dest", "document"),
    Map.entry("Sec-Fetch-Mode", "navigate"),
    Map.entry("Sec-Fetch-Site", "same-origin"),
    Map.entry("Sec-Fetch-User", "?1"),
    Map.entry("Upgrade-Insecure-Requests", "1"),
    Map.entry("sec-ch-ua", "\"Google Chrome\";v=\"125\", \"Chromium\";v=\"125\", \"Not.A/Brand\";v=\"24\""),
    Map.entry("sec-ch-ua-mobile", "?0"),
    Map.entry("sec-ch-ua-platform", "\"Windows\"")
  );
  
  private Map<CharSequence, String> headers_22 = Map.ofEntries(
    Map.entry("Accept-Language", "pl-PL,pl;q=0.9,en-US;q=0.8,en;q=0.7"),
    Map.entry("Cache-Control", "no-cache"),
    Map.entry("Content-Type", "application/octet-stream"),
    Map.entry("Pragma", "no-cache"),
    Map.entry("Sec-Fetch-Dest", "empty"),
    Map.entry("Sec-Fetch-Mode", "no-cors"),
    Map.entry("Sec-Fetch-Site", "none"),
    Map.entry("User-Agent", "Chrome WIN 125.0.6422.112 (e099925e675bbb19c42822548f5175ab03a36a32-refs/branch-heads/6422_76@{#3}) channel(stable)"),
    Map.entry("X-Client-Data", "CJK2yQEIorbJAQipncoBCPH2ygEIlKHLAQiFoM0BCPamzQEI3uzNAQjg9c0BCJGHzgEI8IjOAQibic4BCMuKzgEI4ZPOAQjpk84B"),
    Map.entry("authorization", "Bearer ya29.a0AXooCguZ1DpETb9_GM2nRtVL98LHd9hHbsNZx5CJhqgqbOZajU9Xo46aIrelITmyNm8HvCvNx1ULBkKOkwd3Up6ATWd_m2BomQlKv7_g83_9V9428QTT8E7unoqOMvQDZSBFM8SQeTSSWjWyAFrEG98PyiiSZnFCDVyaTWl3Wjk5UstLIQApE0mY6Iaw-zZWRUnb-4tKs3YGt7KhqWivMtKIBDkk_63JOCp1hRaiOI-tq4_d8uptT3Eros1tkrGVhSYFZFqOvyTmsIUaCgYKAcESARESFQHGX2Mi4JIXGcfrxuc_BP8nQMhUSw0278")
  );
  
  private Map<CharSequence, String> headers_24 = Map.ofEntries(
    Map.entry("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7"),
    Map.entry("Accept-Language", "pl-PL,pl;q=0.9,en-US;q=0.8,en;q=0.7"),
    Map.entry("Cache-Control", "max-age=0"),
    Map.entry("Origin", "https://computer-database.gatling.io"),
    Map.entry("Sec-Fetch-Dest", "document"),
    Map.entry("Sec-Fetch-Mode", "navigate"),
    Map.entry("Sec-Fetch-Site", "same-origin"),
    Map.entry("Sec-Fetch-User", "?1"),
    Map.entry("Upgrade-Insecure-Requests", "1"),
    Map.entry("sec-ch-ua", "\"Google Chrome\";v=\"125\", \"Chromium\";v=\"125\", \"Not.A/Brand\";v=\"24\""),
    Map.entry("sec-ch-ua-mobile", "?0"),
    Map.entry("sec-ch-ua-platform", "\"Windows\"")
  );
  
  private String uri01 = "https://translate.googleapis.com/translate_a/l";
  
  private String uri02 = "https://computer-database.gatling.io";
  
  private String uri03 = "https://kidsmanagement-pa.googleapis.com/kidsmanagement/v1";
  
  private String uri04 = "https://safebrowsing.google.com/safebrowsing/clientreport/realtime";
  
  private String uri05 = "https://optimizationguide-pa.googleapis.com/v1:GetHints";
  
  private String uri06 = "https://update.googleapis.com/service/update2/json";
  
  private String uri07 = "https://www.google.com/complete/search";
  
  private String uri08 = "https://clients4.google.com/chrome-sync/command";
  
  private String uri09 = "https://content-autofill.googleapis.com/v1/pages";

  private ScenarioBuilder scn = scenario("RecordedSimulationByProxy2")
    .exec(
      http("request_0")
        .post("/oauth2/v4/token")
        .headers(headers_0)
        .formParam("client_id", "77185425430.apps.googleusercontent.com")
        .formParam("client_secret", "OTJgUOQcT7lO7GsGZq2G4IlT")
        .formParam("grant_type", "refresh_token")
        .formParam("refresh_token", "1//03mgyAFuUzKZSCgYIARAAGAMSNwF-L9IrhHzw-kr6WBGh4KKWK7mbXpQo1Ey9RAEgIa7LeE17ZncPuc1Qjy1jjCIS6DSdD22HbDo")
        .formParam("scope", "https://www.googleapis.com/auth/kid.family.readonly")
        .resources(
          http("request_1")
            .post("/oauth2/v4/token")
            .headers(headers_0)
            .formParam("client_id", "77185425430.apps.googleusercontent.com")
            .formParam("client_secret", "OTJgUOQcT7lO7GsGZq2G4IlT")
            .formParam("grant_type", "refresh_token")
            .formParam("refresh_token", "1//03mgyAFuUzKZSCgYIARAAGAMSNwF-L9IrhHzw-kr6WBGh4KKWK7mbXpQo1Ey9RAEgIa7LeE17ZncPuc1Qjy1jjCIS6DSdD22HbDo")
            .formParam("scope", "https://www.googleapis.com/auth/chromesync"),
          http("request_2")
            .get(uri03 + "/families/mine/members?alt=proto")
            .headers(headers_2)
        ),
      pause(1),
      http("request_3")
        .get(uri07 + "?client=chrome-omni&gs_ri=chrome-ext-ansg&xssi=t&q=&oit=0&gs_rn=42&sugkey=AIzaSyBOti4mM-6x9WDnZIjIeyEU21OpBXqWBgw")
        .headers(headers_3)
        .resources(
          http("request_4")
            .post(uri05 + "?")
            .headers(headers_4)
            .body(RawFileBody("io/gatling/demo/recordedsimulationbyproxy2/0004_request.dat")),
          http("request_5")
            .post(uri06 + "?cup2key=14:ZqloqEi3fyqkrsfRrvYq8GkAaQ5kb8kLLRocSUjR21k&cup2hreq=4f2f225806c6300c263161a834783ce21621bd336e6449d2ce8669c56a46f70d")
            .headers(headers_5)
            .body(RawFileBody("io/gatling/demo/recordedsimulationbyproxy2/0005_request.json"))
        ),
      pause(3),
      http("request_6")
        .post("/oauth2/v4/token")
        .headers(headers_0)
        .formParam("client_id", "77185425430.apps.googleusercontent.com")
        .formParam("client_secret", "OTJgUOQcT7lO7GsGZq2G4IlT")
        .formParam("grant_type", "refresh_token")
        .formParam("refresh_token", "1//03mgyAFuUzKZSCgYIARAAGAMSNwF-L9IrhHzw-kr6WBGh4KKWK7mbXpQo1Ey9RAEgIa7LeE17ZncPuc1Qjy1jjCIS6DSdD22HbDo")
        .formParam("scope", "https://www.googleapis.com/auth/kid.permission")
        .resources(
          http("request_7")
            .post(uri03 + "/people/me:classifyUrl?alt=proto")
            .headers(headers_7)
            .body(RawFileBody("io/gatling/demo/recordedsimulationbyproxy2/0007_request.dat")),
          http("request_8")
            .post(uri04)
            .headers(headers_8)
            .body(RawFileBody("io/gatling/demo/recordedsimulationbyproxy2/0008_request.bin")),
          http("request_9")
            .get(uri02 + "/computers")
            .headers(headers_9),
          http("request_10")
            .get(uri02 + "/assets/css/bootstrap.min.css")
            .headers(headers_10),
          http("request_11")
            .get(uri09 + "/ChVDaHJvbWUvMTI1LjAuNjQyMi4xMTISGQluVclO87p4cxIFDYVb0Toha2nqlUwKTzE=?alt=proto")
            .headers(headers_11),
          http("request_12")
            .get(uri02 + "/assets/css/main.css")
            .headers(headers_10),
          http("request_13")
            .get(uri01 + "?client=chrome&hl=pl&key=AIzaSyBOti4mM-6x9WDnZIjIeyEU21OpBXqWBgw")
            .headers(headers_13),
          http("request_14")
            .get(uri02 + "/favicon.ico")
            .headers(headers_14)
            .check(status().is(404))
        ),
      pause(10),
      http("request_15")
        .post(uri03 + "/people/me:classifyUrl?alt=proto")
        .headers(headers_7)
        .body(RawFileBody("io/gatling/demo/recordedsimulationbyproxy2/0015_request.dat"))
        .resources(
          http("request_16")
            .post(uri05 + "?")
            .headers(headers_4)
            .body(RawFileBody("io/gatling/demo/recordedsimulationbyproxy2/0016_request.dat")),
          http("request_17")
            .post(uri04)
            .headers(headers_8)
            .body(RawFileBody("io/gatling/demo/recordedsimulationbyproxy2/0017_request.bin")),
          http("request_18")
            .get(uri02 + "/computers/501")
            .headers(headers_18),
          http("request_19")
            .get(uri09 + "/ChVDaHJvbWUvMTI1LjAuNjQyMi4xMTISLgkXdU98BVFCiBIFDZRU-s8SBQ3cJH1EEgUNpQx5EBIFDZEV3D4h-ZZb2p4NB9U=?alt=proto")
            .headers(headers_11),
          http("request_20")
            .get(uri02 + "/assets/css/main.css")
            .headers(headers_10),
          http("request_21")
            .get(uri02 + "/assets/css/bootstrap.min.css")
            .headers(headers_10)
        ),
      pause(3),
      http("request_22")
        .post(uri08 + "/?client=Google+Chrome&client_id=U%2BxzbXTT%2BYQFmFwU4xcZow%3D%3D")
        .headers(headers_22)
        .body(RawFileBody("io/gatling/demo/recordedsimulationbyproxy2/0022_request.dat"))
        .resources(
          http("request_23")
            .post(uri08 + "/?client=Google+Chrome&client_id=U%2BxzbXTT%2BYQFmFwU4xcZow%3D%3D")
            .headers(headers_22)
            .body(RawFileBody("io/gatling/demo/recordedsimulationbyproxy2/0023_request.dat")),
          http("request_24")
            .post(uri02 + "/computers/501")
            .headers(headers_24)
            .formParam("name", "AN/FSQ-32")
            .formParam("introduced", "1960-01-02")
            .formParam("discontinued", "")
            .formParam("company", "13"),
          http("request_25")
            .get(uri02 + "/assets/css/main.css")
            .headers(headers_10),
          http("request_26")
            .get(uri02 + "/assets/css/bootstrap.min.css")
            .headers(headers_10)
        )
    );

  {
	  setUp(scn.injectOpen(atOnceUsers(1))).protocols(httpProtocol);
  }
}
