package com.dinossauros.mundoperdido.stepdefinition;

import com.dinossauros.mundoperdido.entity.Dinossauro;
import com.dinossauros.mundoperdido.service.DinossauroService;
import com.dinossauros.mundoperdido.state.DinossauroInformationScope;
import io.cucumber.java.DataTableType;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

import static org.hamcrest.Matchers.*;

public class ParameterSteps {

    @Autowired
    private DinossauroService service;

    @Autowired
    private DinossauroInformationScope scope;

    @DataTableType
    public Dinossauro dinossauroEntry(Map<String, String> entry) {
        return new Dinossauro(entry.get("nome"),
                Double.parseDouble(entry.get("altura")),
                Double.parseDouble(entry.get("peso")),
                entry.get("especie"),
                entry.get("localizacao"));
    }
    @E("que o cliente quer inserir os dinossauros")
    public void queOClienteQuerInserirOsDinossauros(List<Dinossauro> dinossauros) {
    }

}
