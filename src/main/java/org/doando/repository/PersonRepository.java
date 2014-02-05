package org.doando.repository;

import org.doando.domain.Person;
import org.springframework.roo.addon.layers.repository.jpa.RooJpaRepository;

@RooJpaRepository(domainType = Person.class)
public interface PersonRepository {

	Person findByEmail(String email);
}
