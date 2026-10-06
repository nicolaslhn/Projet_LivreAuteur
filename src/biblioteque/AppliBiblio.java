package biblioteque;

import java.util.ArrayList;
import java.util.List;
public class AppliBiblio {
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
	// TODO 2) Partie 2 : Implémenter les méthodes indiquées dans la partie
	public static void main(String[] args){
	/* TODO 3) Partie 2 Tester les méthodes d’affichage ci dessus pour vérifier le
	bon fonctionnement de l’appli.*/
		DataLivres infoLivre;
	}
}

