package com.dinossauros.mundoperdido.state;

import com.dinossauros.mundoperdido.entity.Dinossauro;
import io.cucumber.spring.ScenarioScope;
import io.restassured.response.Response;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@ScenarioScope
@Getter
@Setter
public class DinossauroInformationScope {

    private Response response;

    private List<Dinossauro> dinossauros;
}
