package org.doando.domain;

import java.math.BigDecimal;

import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.entity.RooJpaEntity;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooJpaEntity
public class Donation {
	@NotNull
	private Boolean anonymous;

	@NotNull
	@ManyToOne
	private Person donor;

	/**
     */

	@NotNull
	private BigDecimal gross;

	@NotNull
	@ManyToOne
	private Institution institution;

	/**
     */

	@ManyToOne
	private Payment payment;
}
