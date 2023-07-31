package com.dinossauros.mundoperdido.client;

import io.restassured.response.Response;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import static io.restassured.RestAssured.get;
import static org.hamcrest.Matchers.notNullValue;

@Component
public class DinossauroClient {
    public void isDinossauriosCadastrados() {
        get("/dinossauros").then().body("_embedded.dinossauros", notNullValue()).statusCode(HttpStatus.OK.value());
    }

    public Response getDinossauros(String endpoint) {
        return get(endpoint).thenReturn();
    }
}
