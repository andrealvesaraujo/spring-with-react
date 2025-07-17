package baeldung.spring_with_react.repository;

import baeldung.spring_with_react.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
