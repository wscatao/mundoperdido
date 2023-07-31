package com.dinossauros.mundoperdido.service;

import com.dinossauros.mundoperdido.client.DinossauroClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DinossauroService {

    @Autowired
    private DinossauroClient client;
    public void isDinossaurosCadastrados() {

        client.isDinossauriosCadastrados();
    }
}
