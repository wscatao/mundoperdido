package com.dinossauros.mundoperdido.stepdefinition;

import com.dinossauros.mundoperdido.entity.Dinossauro;
import com.dinossauros.mundoperdido.service.DinossauroService;
import com.dinossauros.mundoperdido.state.DinossauroInformationScope;
import io.cucumber.java.pt.Quando;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.hasSize;

public class ExecutionSteps {

    @Autowired
    private DinossauroService service;

    @Autowired
    private DinossauroInformationScope scope;

    @Quando("o cliente chama o endpoint {string} para consulta")
    public void oClienteChamaOEndpointParaConsulta(String endpoint) {
        var response = service.getData(endpoint);
        response.then().body("_embedded.dinossauros", hasSize(greaterThan(0)));
        scope.setResponse(response);
    }

    @Quando("o cliente chama o endpoint {string} para inclusao")
    public void oClienteChamaOEndpointParaInserir(String endpoint) {
        var dinossauros = scope.getDinossauros();
        dinossauros.forEach(dinossauro -> service.saveDinossauro(dinossauro, endpoint));
    }

}
