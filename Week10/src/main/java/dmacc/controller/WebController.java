package dmacc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import dmacc.beans.Sandwich;
import dmacc.repository.SandwichRepository;

/**
 * @author Ben Sanders - bsanders3
 * CIS 175 Fall 2021
 */
@Controller
public class WebController {
	@Autowired
	SandwichRepository repo;
	
	@GetMapping({"/", "/viewAll"})
	public String viewAllSandwiches(Model model) {
		if(repo.findAll().isEmpty()) {
			return addNewSandwich(model);
		}
		
		model.addAttribute("sandwiches", repo.findAll());
		return "results";
	}
	@GetMapping("/addSandwich")
	public String addNewSandwich(Model model) {
		Sandwich s = new Sandwich();
		model.addAttribute("newSandwich", s);
		return "input";
	}
	@PostMapping("/addSandwich")
	public String addNewSandwich(@ModelAttribute Sandwich s, Model model) {
		repo.save(s);
		return viewAllSandwiches(model);
	}
	@GetMapping("/edit/{id}")
	public String showUpdateSandwich(@PathVariable("id") long id, Model model) {
		Sandwich s = repo.findById(id).orElse(null);
		model.addAttribute("newSandwich", s);
		return "input";
	}
	@PostMapping("/update/{id}")
	public String reviseSandwich(Sandwich s, Model model) {
		repo.save(s);
		return viewAllSandwiches(model);
	}
	@GetMapping("/delete/{id}")
	public String deleteSandwich(@PathVariable("id") long id, Model model) {
		Sandwich s = repo.findById(id).orElse(null);
		repo.delete(s);
		return viewAllSandwiches(model);
	}
}
