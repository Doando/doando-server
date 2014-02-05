package org.doando.repository;
import org.doando.domain.Institution;
import org.springframework.roo.addon.layers.repository.jpa.RooJpaRepository;

@RooJpaRepository(domainType = Institution.class)
public interface InstitutionRepository {
}
