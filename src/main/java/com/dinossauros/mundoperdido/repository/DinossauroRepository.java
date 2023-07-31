package com.dinossauros.mundoperdido.repository;

import com.dinossauros.mundoperdido.entity.Dinossauro;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "dinossauros", path = "dinossauros")
public interface DinossauroRepository extends PagingAndSortingRepository<Dinossauro, Long>,
        CrudRepository<Dinossauro, Long> {
}

