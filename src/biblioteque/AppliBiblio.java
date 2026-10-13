package biblioteque;

import java.util.ArrayList;
import java.util.List;
public class AppliBiblio {
	
	// TODO 2) Partie 2 : Implémenter les méthodes indiquées dans la partie
	public static void main(String[] args){
	/* TODO 3) Partie 2 Tester les méthodes d’affichage ci dessus pour vérifier le bon fonctionnement de l’appli.*/
		DataLivres infoLivre;
		
		
		DataLivresJeuEssai essaie = new DataLivresJeuEssai();
		Auteur auteur11 = new Auteur(67,"Guellati","Ilian");
		Livre livretest = new Livre(500,"Être délégué", 2026,auteur11);
		essaie.saveAuteur(auteur11);
		essaie.saveLivre(livretest);

		System.out.println(essaie.findAuteurById(67).getNom());
		System.out.println(essaie.findAuteurByNom("Guellati").getPrenom());
		System.out.println(essaie.findLivreById(5).getTitre());
		displayLivres(essaie.findLivreByAuteurId(67));
		

	}
	
	
	
	public static void displayAuteursEtLivres(List<Auteur> listeAuteurs,
		List<Livre> listeLivres) {
		for (Auteur auteur : listeAuteurs) {
			System.out.println("Auteur : " + auteur.getPrenom() + " " +
			auteur.getNom() + " Livres :");
			for (Livre l:listeLivres){
				if(l.getAuteur().getId()==auteur.getId()){
					System.out.println("Livres : " + l.getTitre() + " " + l.getAnneePublication()) ;
				}
			 }
			 System.out.println();
		 }
	 }

	
	
	public static void displayLivres(List<Livre> l) {
		for(Livre livre : l) {
			System.out.println("Livre : " + livre.getTitre() + " | Auteur : " + livre.getAuteur().getNom() + " " + livre.getAuteur().getPrenom());
		}
	}
	
	
	public static void displayAuteurs(List<Auteur> l) {
		for(Auteur auteur : l) {
			System.out.println(auteur.getNom() + " " + auteur.getPrenom());
		}
	}
}

