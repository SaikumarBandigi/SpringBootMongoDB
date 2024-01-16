package SB.SpringBootMongoDB.repository;

import SB.SpringBootMongoDB.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeRepository extends MongoRepository<Employee, Long> {
    // Custom queries if needed
}
