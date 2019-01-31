package io.github.julianlfs.futebol.repository;

import io.github.julianlfs.futebol.domain.Time;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TimeRepository extends MongoRepository<Time, Long> {

}
