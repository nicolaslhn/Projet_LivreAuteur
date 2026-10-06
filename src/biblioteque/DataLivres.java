package biblioteque;

import java.util.ArrayList;
import java.util.List;


public interface DataLivres {
	
	public List<Auteur> getListeAuteurs() ;
	public List<Livre> getListeLivres() ;
	public Livre findLivreById(int id) ;
	public Auteur findAuteurByNom(String nom);
	public Auteur findAuteurById(int id);
	public List findLivreByAuteurId(int auteurId);
	public List findLivreByAuteurNom(String nomAuteur);
	public Livre findLivreByTitre(String titre);
	public boolean removeLivre(int id);
	public boolean saveLivre(Livre l);
	public void saveAuteur(Auteur a);
	
	
	private void genereJeuEssai() {
		
	}
	
}

