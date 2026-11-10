package testDao;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

import bibliotheque.DataLivres;
import bibliotheque.DataLivresMySQL;
import bibliotheque.CachingDao;
import entity.Auteur;

public abstract class TestCachingDao {

	
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
