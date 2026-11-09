package testDao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import bibliotheque.*;
import entity.*;

class TestDataLivres {

	@Test
	void findAuteurByIdExistant() {
		DataLivres donnees = new DataLivresJeuEssai();
		Auteur auteurTrouve = donnees.findAuteurById(1);
		assertNotNull(auteurTrouve);
		assertEquals(1,auteurTrouve.getId());
		
	}
	
	
	@Test
	void findAuteurByIdInexistant() {
		DataLivres donnees = new DataLivresJeuEssai();
		Auteur auteurTrouve = donnees.findAuteurById(1000);
		assertNull(auteurTrouve);
		
	}
	
	@Test
	void saveAuteurAjoutUnNouvelAuteur() {
		DataLivres donnees = new DataLivresJeuEssai();
		Auteur nouvelAuteur = new Auteur(100,"Nom", "Prenom");
		donnees.saveAuteur(nouvelAuteur);
		Auteur auteurTrouve = donnees.findAuteurById(100);
		assertNotNull(auteurTrouve);
		assertEquals("Nom",auteurTrouve.getNom());
	}
	@Test
	void saveAuteurModifieUnAuteurExistant() {
		DataLivres donnees = new DataLivresJeuEssai();
		Auteur auteurModifie = new Auteur(1, "autreNom", "autrePrenom");
		int nombreAvant = donnees.getListeAuteurs().size();
		donnees.saveAuteur(auteurModifie);
		Auteur auteurTrouve = donnees.findAuteurById(1);
		assertNotNull(auteurTrouve);
		assertEquals("autreNom", auteurTrouve.getNom());
		assertEquals(nombreAvant,donnees.getListeAuteurs().size());
	}
}
