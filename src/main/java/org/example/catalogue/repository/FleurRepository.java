package org.example.catalogue.repository;

import org.example.catalogue.model.Fleur;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FleurRepository extends MongoRepository<Fleur, String> {
}
