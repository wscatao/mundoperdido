package com.dinossauros.mundoperdido.client;

import com.dinossauros.mundoperdido.entity.Dinossauro;
import com.google.gson.Gson;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import static io.restassured.RestAssured.delete;
import static io.restassured.RestAssured.get;
import static org.hamcrest.Matchers.*;

@Component
public class DinossauroClient {
    public void isDinossauriosCadastrados() {
        get("/dinossauros").then().body("_embedded.dinossauros", hasSize(greaterThan(0))).statusCode(HttpStatus.OK.value());
    }

    public Response getDinossauros(String endpoint) {
        return get(endpoint).thenReturn();
    }

    public void saveDinossauro(Dinossauro dinossauro, String endpoint) {

        var data = new Gson().toJson(dinossauro, Dinossauro.class);

        RestAssured.given()
                .header("Content-Type", "application/json")
                .body(data)
                .post(endpoint)
                .then()
                .statusCode(HttpStatus.CREATED.value());
    }

    public Response deleteDinossauro(int id) {
        return delete(String.format("/dinossauros/%s", id)).thenReturn();
    }
}
