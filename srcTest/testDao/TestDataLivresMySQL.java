package testDao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import bibliotheque.DataLivres;
import bibliotheque.DataLivresMySQL;
import entity.Auteur;

class TestDataLivresMySQL {

	@Test
	void saveAuteurModif() {
	   DataLivres donnees = new DataLivresMySQL();
	   Auteur auteurModifie = new Auteur(20, "autreNom", "autrePrenom");
	   donnees.saveAuteur(auteurModifie);
	   Auteur auteurTrouve = donnees.findAuteurById(20);
	   assertNotNull(auteurTrouve);
	   assertEquals("autreNom", auteurTrouve.getNom());
	}

}
