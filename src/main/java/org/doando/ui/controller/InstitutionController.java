package org.doando.ui.controller;

import org.doando.domain.Institution;
import org.doando.service.InstitutionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.Assert;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/institutions")
public class InstitutionController {

	@Autowired
	private InstitutionService institutionService;

	@RequestMapping("/{id}/donate")
	public ModelAndView donate(@PathVariable Long id, ModelAndView model,
			BindingResult bindingResult) {
		Assert.notNull(id);

		Institution institution = institutionService.findInstitution(id);
		model.addObject("institution", institution);

		model.addObject(
				"paypal_link",
				"https://www.paypal.com/cgi-bin/webscr?cmd=_donations&business=panthro%2erafael%40gmail%2ecom&lc=BR&item_name=Doando%2eorg&item_number=123456&no_note=0&currency_code=BRL&bn=PP%2dDonationsBF%3abtn_donateCC_LG%2egif%3aNonHostedGuest");

		model.setViewName("donate");
		return model;
	}

}
