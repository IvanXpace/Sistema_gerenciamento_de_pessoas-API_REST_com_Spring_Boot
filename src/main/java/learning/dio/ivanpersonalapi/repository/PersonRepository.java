package learning.dio.ivanpersonalapi.repository;

import learning.dio.ivanpersonalapi.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
