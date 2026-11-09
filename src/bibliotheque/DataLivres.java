package bibliotheque;

import java.util.ArrayList;
import java.util.List;

import entity.Auteur;
import entity.Livre;
import entity.*;
import entity.*;
import entity.*;
import entity.*;
import entity.*;
import entity.*;
import entity.*;
import entity.*;
import entity.*;
import entity.*;
import entity.*;
import entity.*;
import entity.*;
import entity.*;
import entity.*;
import entity.*;

public interface DataLivres {
	
	public List<Auteur> getListeAuteurs() ;
	public List<Livre> getListeLivres() ;
	public Livre findLivreById(int id) ;
	public Auteur findAuteurByNom(String nom);
	public Auteur findAuteurById(int id);
	public List<Livre> findLivreByAuteurId(int auteurId);
	public List findLivreByAuteurNom(String nomAuteur);
	public Livre findLivreByTitre(String titre);
	public Livre removeLivre(int id);
	public Livre saveLivre(Livre l) throws NonExistAuthorException; 
	public void saveAuteur(Auteur a);
	public Auteur findAuteurNomLike(String nom);
	public Livre FindLivreTitreLike(String nom );

	private void genereJeuEssai() {
		
	}
	
}

