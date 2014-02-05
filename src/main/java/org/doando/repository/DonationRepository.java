package org.doando.repository;
import org.doando.domain.Donation;
import org.springframework.roo.addon.layers.repository.jpa.RooJpaRepository;

@RooJpaRepository(domainType = Donation.class)
public interface DonationRepository {
}
