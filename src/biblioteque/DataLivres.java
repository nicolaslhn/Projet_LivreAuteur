package biblioteque;

import java.util.ArrayList;
import java.util.List;


public interface DataLivres {
	
	public Livre findLivreById(int id) ;
	public List<Auteur> getListeAuteurs() ;
	public List<Livre> getListeLivres() ;
	//TODO Cf. Travail à faire.
	
	private void genereJeuEssai() {
		
	}
}
