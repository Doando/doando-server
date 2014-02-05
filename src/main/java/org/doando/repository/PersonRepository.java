package org.doando.repository;

import org.doando.domain.Person;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.roo.addon.layers.repository.jpa.RooJpaRepository;
import org.springframework.transaction.annotation.Transactional;

@RooJpaRepository(domainType = Person.class)
public interface PersonRepository {

	@Query("select p from Person as p where p.email = :email")
	@Transactional(readOnly = true)
	public Person findPersonByEmail(@Param("email") String email);
}
