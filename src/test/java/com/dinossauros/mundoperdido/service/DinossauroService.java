package com.dinossauros.mundoperdido.service;

import com.dinossauros.mundoperdido.client.DinossauroClient;
import com.dinossauros.mundoperdido.entity.Dinossauro;
import io.restassured.response.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DinossauroService {

    @Autowired
    private DinossauroClient client;

    public void isDinossaurosCadastrados() {
        client.isDinossauriosCadastrados();
    }

    public Response getData(String endpoint) {
        return client.getDinossauros(endpoint);
    }

    public void saveDinossauro(Dinossauro dinossauro, String endpoint) {
        client.saveDinossauro(dinossauro, endpoint);
    }

    public Response deleteDinossauro(int id) {
        return client.deleteDinossauro(id);
    }
}
