package br.com.lucenasoft.helpdesk.repositories;

import br.com.lucenasoft.helpdesk.models.ClientModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<ClientModel, Long> {
}
