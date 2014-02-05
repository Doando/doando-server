package org.doando.service;
import org.springframework.roo.addon.layers.service.RooService;
import org.springframework.security.core.userdetails.UserDetailsService;

@RooService(domainTypes = { org.doando.domain.Person.class })
public interface PersonService extends UserDetailsService{
}
