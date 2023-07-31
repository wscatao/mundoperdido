package com.dinossauros.mundoperdido.client;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import static io.restassured.RestAssured.get;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.notNullValue;

@Component
public class DinossauroClient {
    public void isDinossauriosCadastrados() {
        get("/dinossauros").then().body("_embedded.dinossauros", notNullValue()).statusCode(HttpStatus.OK.value());
    }
}
