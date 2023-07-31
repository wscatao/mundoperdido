package com.dinossauros.mundoperdido.stepdefinition;

import com.dinossauros.mundoperdido.service.DinossauroService;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.springframework.beans.factory.annotation.Autowired;

public class StepDefinitions {

    @Autowired
    private DinossauroService service;

    @Dado("que temos dinossauros cadastrados no sistema")
    public void queTemosDinossaurosCadastradosNoSistema() {

        service.isDinossaurosCadastrados();
    }

    @Quando("o cliente chama o endpoint {string} para consulta")
    public void oClienteChamaOEndpointParaConsulta(String endpoint) {

    }

    @Quando("o cliente chama o endpoint {string} para inclusao")
    public void oClienteChamaOEndpointParaInserir(String endpoint) {

    }

    @Quando("o cliente chama o endpoint {string} para remocao com id {int}")
    public void oClienteChamaOEndpointDinossaurosParaRemocaoComIdId(String endpoint, int id) {
        System.out.println(endpoint + " " + id);
    }

    @Entao("o cliente recebe como resposta o status {int}")
    public void oClienteRecebeOStatusComoResposta(int status) {
        System.out.println(status);

    }

    @E("o cliente recebe dados validos")
    public void oClienteRecebeDadosValidos() {

    }

    @E("que o cliente quer inserir os dinossauros")
    public void queOClienteQuerInserirOsDinossauros(DataTable dataTable) {
    }

}
