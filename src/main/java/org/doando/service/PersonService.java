package org.doando.service;
import org.springframework.roo.addon.layers.service.RooService;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

@RooService(domainTypes = { org.doando.domain.Person.class })
public interface PersonService extends UserDetailsService{
}
