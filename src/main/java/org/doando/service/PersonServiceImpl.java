package org.doando.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class PersonServiceImpl implements PersonService {
	@Override
	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException {
		return personRepository.findOne(1L);
	}
}
