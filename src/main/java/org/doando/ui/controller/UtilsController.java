package org.doando.ui.controller;

import org.doando.domain.AccessRole;
import org.doando.domain.Institution;
import org.doando.domain.Person;
import org.doando.service.InstitutionService;
import org.doando.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/utils")
public class UtilsController {

	@Autowired
	private PersonService personService;
	@Autowired
	private InstitutionService institutionService;

	@RequestMapping("/user/create")
	public @ResponseBody
	Person createDefaultUser() {
		Person person = new Person();
		person.setEmail("panthro.rafael@gmail.com");
		person.setPassword(new Md5PasswordEncoder().encodePassword(
				"MinhaSenha01", null));
		person.setAccessRole(AccessRole.ADMIN);
		person.setCpf("349.170.578-92");
		person.setName("Rafael Roman");
		person.setEnabled(true);
		personService.savePerson(person);

		return person;
	}

	@RequestMapping("/institution/create")
	public @ResponseBody
	Institution createSampleInstitution() {
		Institution institution = new Institution();
		institution.setName("Uma Instituição legal");
		institution.setCnpj("39.833.692/0001-94");
		institution.setEmail("email@inst.com");

		institutionService.saveInstitution(institution);
		return institution;
	}
}
