package com.dinossauros.mundoperdido.stepdefinition;

import com.dinossauros.mundoperdido.service.DinossauroService;
import com.dinossauros.mundoperdido.state.DinossauroInformationScope;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import org.assertj.core.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.Assertions.*;

public class AssertionSteps {

    @Autowired
    private DinossauroService service;

    @Autowired
    private DinossauroInformationScope scope;

    @Dado("que temos dinossauros cadastrados no sistema")
    public void queTemosDinossaurosCadastradosNoSistema() {
        service.isDinossaurosCadastrados();
    }

    @Entao("o cliente recebe como resposta o status {int}")
    public void oClienteRecebeOStatusComoResposta(int status) {
        var responseStatus = scope.getResponse().getStatusCode();
        assertThat(status).isEqualTo(responseStatus);
    }
    @E("o cliente recebe dados validos")
    public void oClienteRecebeDadosValidos() {

    }
}
