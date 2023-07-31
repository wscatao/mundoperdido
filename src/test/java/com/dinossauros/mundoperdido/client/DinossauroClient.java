package com.dinossauros.mundoperdido.client;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import static io.restassured.RestAssured.get;
import static org.hamcrest.Matchers.greaterThan;

@Component
public class DinossauroClient {
    public void isDinossauriosCadastrados() {

        get("/dinossauros").then().body("_embedded.dinossauros", greaterThan(0)).statusCode(HttpStatus.OK.value());
    }
}
