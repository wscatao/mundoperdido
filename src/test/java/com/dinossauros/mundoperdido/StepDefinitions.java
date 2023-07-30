package com.dinossauros.mundoperdido;

import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class StepDefinitions {
    @Quando("o cliente chama o endpoint {string}")
    public void oClienteChamaOEndpoint(String endpoint) {

    }

    @Entao("o cliente recebe como resposta o status (\\d+)$")
    public void oClienteRecebeOStatusComoResposta(int status) {

    }

    @E("o cliente receber uma lista de {string}")
    public void oClienteReceberUmaListaDeItems(String definition) {

    }
}
