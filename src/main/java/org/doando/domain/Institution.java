package org.doando.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.br.CNPJ;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.entity.RooJpaEntity;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooJpaEntity
public class Institution {
	private String address;

	/**
     */

	private String city;

	/**
     */
	@NotNull
	@CNPJ
	private String cnpj;

	/**
	 * c
	 */

	private String country;

	/**
     */
	@NotNull
	private String email;

	/**
     */
	@NotNull
	private String name;

	/**
     */

	private String state;

	/**
     */

	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<Person> users = new HashSet<Person>();
}
