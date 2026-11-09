package testDao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import bibliotheque.DataLivres;
import bibliotheque.DataLivresMySQL;
import entity.Auteur;

class TestDataLivresMySQL {

	@Test
	void saveAuteurAjoutUnNouvelAuteur() {
		DataLivres donnees = new DataLivresMySQL();
		Auteur nouvelAuteur = new Auteur(100,"Nom", "Prenom");
		donnees.saveAuteur(nouvelAuteur);
		Auteur auteurTrouve = donnees.findAuteurById(100);
		assertNotNull(auteurTrouve);
		assertEquals("Nom",auteurTrouve.getNom());
	}

}
