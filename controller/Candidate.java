package controller;

import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import models.User;

public class Candidate {

	//Adding new candidate to the candidate table
	@RequestMapping(value = "/candidateAdd")
	public String candidateAdd(Model model) {
		
			return "candidateAdd";
		
	}
		
	//Can view all the candidates in a list
	@RequestMapping(value = "/candidateView")
	public String candidateView(Model model) {
		
			return "candidateView";
		
	}
	
	
	//for all the candidates who received offer letter
	@RequestMapping(value = "/candidatesReceivedOfferLetter")
	public String candidatesReceivedOfferLetter(Model model) {
		
			return "candidatesReceivedOfferLetter";
		
	}
	
	//for all the candidates who didn't received offer letter
	@RequestMapping(value = "/candidatesDidnotOfferLetter")
	public String candidatesDidnotOfferLetter(Model model) {
		
			return "candidatesDidnotOfferLetter";
		
	}
	
	
}
