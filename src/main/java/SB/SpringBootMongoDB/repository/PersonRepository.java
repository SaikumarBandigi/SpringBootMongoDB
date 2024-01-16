package SB.SpringBootMongoDB.repository;

import SB.SpringBootMongoDB.model.Person;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PersonRepository extends MongoRepository<Person, String> {

    // Custom queries can be added here if needed

}
