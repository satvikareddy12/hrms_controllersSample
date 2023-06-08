package controller;

public class EmpReferenceDocument {
	
	//employee will have permission only to view  the reference documents
	
	@RequestMapping(value = "/empreferenceDocuments")
	public String empreferenceDocuments(Model model) {
		
			return "empreferenceDocuments";
		
	}

}
