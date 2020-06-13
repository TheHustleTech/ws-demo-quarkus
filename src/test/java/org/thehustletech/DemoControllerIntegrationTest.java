package org.thehustletech;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class DemoControllerIntegrationTest {

    @Test
    public void testTestEndpoint() {
        given()
          .when().get("/test")
          .then()
             .statusCode(200)
             .body(is("hello"));
    }

}