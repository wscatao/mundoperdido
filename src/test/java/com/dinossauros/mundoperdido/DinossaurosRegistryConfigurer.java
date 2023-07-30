package com.dinossauros.mundoperdido;

import com.dinossauros.mundoperdido.entity.Dinossauro;
import io.cucumber.core.api.TypeRegistry;
import io.cucumber.core.api.TypeRegistryConfigurer;
import io.cucumber.datatable.DataTable;
import io.cucumber.datatable.DataTableType;
import io.cucumber.datatable.TableTransformer;

import java.util.ArrayList;
import java.util.List;

public class DinossaurosRegistryConfigurer implements TypeRegistryConfigurer {

    @Override
    public void configureTypeRegistry(TypeRegistry typeRegistry) {
        typeRegistry.defineDataTableType(
                new DataTableType(Dinossauro.class, new DinossauroTransformer())
        );
    }

    private static class DinossauroTransformer implements TableTransformer<List<Dinossauro>> {

        @Override
        public List<Dinossauro> transform(DataTable table) throws Throwable {

            List<Dinossauro> dinossauros = new ArrayList<>();

            table.cells()
                    .stream()
                    .skip(1)        // Skip header row
                    .map(fields -> new Dinossauro(fields.get(0),
                            Double.parseDouble(fields.get(1)),
                            Double.parseDouble(fields.get(2)),
                            fields.get(3),
                            fields.get(4)))
                    .forEach(dinossauros::add);

            return dinossauros;
        }
    }
}