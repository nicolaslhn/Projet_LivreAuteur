package bibliotheque;

public class NonExistAuthorException extends Exception {
	
	public NonExistAuthorException() {
		super("Enregistrement impossible : auteur inexistant");
	}
}
