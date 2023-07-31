package com.dinossauros.mundoperdido.state;

import io.cucumber.spring.ScenarioScope;
import io.restassured.response.Response;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@ScenarioScope
@Getter
@Setter
public class DinossauroInformationScope {

    private Response response;
}
