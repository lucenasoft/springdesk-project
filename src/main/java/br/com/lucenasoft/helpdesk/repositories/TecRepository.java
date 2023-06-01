package br.com.lucenasoft.helpdesk.repositories;

import br.com.lucenasoft.helpdesk.models.TecModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TecRepository extends JpaRepository<TecModel, Long> {
}
