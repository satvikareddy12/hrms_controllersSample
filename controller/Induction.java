package controller;

public class Induction {
	
	//those who received and accepted offere letter
	
	@RequestMapping(value = "/inductionCandidates")
	public String inductionAdd(Model model) {
		
			return "inductionAdd";
		
	}
	
	//Documents that should be submitted at the time of induction
	
	@RequestMapping(value = "/inductionDocuments")
	public String inductionDocuments(Model model) {
		
			return "inductionDocuments";
		
	}
	
	//If candidate submits all the proper documents
	
	@RequestMapping(value = "/inductionToEmployee")
	public String inductionToEmployee(Model model) {
		
			return "inductionToEmployee";
		
	}

}
