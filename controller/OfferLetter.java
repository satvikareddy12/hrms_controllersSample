package controller;

public class OfferLetter {
	
	//check for candidates that didnot receive offer letters,based on certain range of date
	
	@RequestMapping(value = "/issueOfferLetters")
	public String issueOfferLetters(Model model) {
		
		//call candidatesDidnotOfferLetter from Candidate controller
			return "issueOfferLetters";
		
	}
	
	


}
