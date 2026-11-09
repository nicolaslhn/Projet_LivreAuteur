package bibliotheque;

import java.util.ArrayList;
import java.util.List;

import entity.Auteur;
import entity.Livre;

public class DataLivresJeuEssai implements DataLivres{
	 private List<Auteur> listeAuteurs;
	 private List<Livre> listeLivres;
	 public DataLivresJeuEssai() {
		 this.listeAuteurs = new ArrayList<>();
		 this.listeLivres = new ArrayList<>();
		 this.genereJeuEssai();
	 }
	 private void genereJeuEssai() {
		 // Création des auteurs
		 Auteur auteur1 = new Auteur(1, "Rowling", "J.K.");
		 Auteur auteur2 = new Auteur(2, "Tolkien", "J.R.R.");
		 Auteur auteur3 = new Auteur(3, "Martin", "George R.R.");
		 Auteur auteur4 = new Auteur(4, "King", "Stephen");
		 Auteur auteur5 = new Auteur(5, "Asimov", "Isaac");
		 Auteur auteur6 = new Auteur(6, "Orwell", "George");
		 Auteur auteur7 = new Auteur(7, "Hugo", "Victor");
		 Auteur auteur8 = new Auteur(8, "Dumas", "Alexandre");
		 Auteur auteur9 = new Auteur(9, "Camus", "Albert");
		 Auteur auteur10 = new Auteur(10, "Sartre", "Jean-Paul");
		 // Ajout des auteurs à la liste
		 listeAuteurs.add(auteur1);
		 listeAuteurs.add(auteur2);
		 listeAuteurs.add(auteur3);
		 listeAuteurs.add(auteur4);
		 listeAuteurs.add(auteur5);
		 listeAuteurs.add(auteur6);
		 listeAuteurs.add(auteur7);
		 listeAuteurs.add(auteur8);
		 listeAuteurs.add(auteur9);
		 listeAuteurs.add(auteur10);
		 // Création des livres avec des ID séquentiels
		 
		 // Livres de J.K. Rowling (ID 1 à 4)
		 listeLivres.add(new Livre(1, "Harry Potter à l'école des sorciers", 1997, auteur1));
		 listeLivres.add(new Livre(2, "Harry Potter et la Chambre des Secrets", 1998, auteur1));
		 listeLivres.add(new Livre(3, "Harry Potter et le Prisonnier d'Azkaban", 1999, auteur1));
		 listeLivres.add(new Livre(4, "Harry Potter et la Coupe de Feu", 2000, auteur1));
		 
		 // Livres de J.R.R. Tolkien
		 listeLivres.add(new Livre(5, "Le Hobbit", 1937, auteur2));
		 listeLivres.add(new Livre(6, "Le Seigneur des Anneaux - La Communauté de l'Anneau", 1954, auteur2));
		 listeLivres.add(new Livre(7, "Le Seigneur des Anneaux - Les Deux Tours", 1954, auteur2));
		 listeLivres.add(new Livre(8, "Le Seigneur des Anneaux - Le Retour du Roi", 1955, auteur2));
		 
		 // Livres de George R.R. Martin
		 listeLivres.add(new Livre(9, "Le Trône de Fer - Le Donjon rouge", 1996, auteur3));
		 listeLivres.add(new Livre(10, "Le Trône de Fer - Le Donjon de l'effroi", 1998, auteur3));
		 listeLivres.add(new Livre(11, "Le Trône de Fer - La Tempête d'épées", 2000, auteur3));
		 
		 // Livres de Stephen King
		 listeLivres.add(new Livre(12, "Ça", 1986, auteur4));
		 listeLivres.add(new Livre(13, "Shining", 1977, auteur4));
		 listeLivres.add(new Livre(14, "Misery", 1987, auteur4));
		 
		 // Livres de Isaac Asimov
		 listeLivres.add(new Livre(15, "Fondation", 1951, auteur5));
		 listeLivres.add(new Livre(16, "Fondation et Empire", 1952, auteur5));
		 listeLivres.add(new Livre(17, "Seconde Fondation", 1953, auteur5));
		 listeLivres.add(new Livre(18, "C'est déjà demain", 1951, auteur5));
		 listeLivres.add(new Livre(19, "Les Caves d'acier", 1954, auteur5));
		 listeLivres.add(new Livre(20, "Face aux feux du soleil", 1957, auteur5));
		 
		 // Livres de George Orwell
		 listeLivres.add(new Livre(21, "1984", 1949, auteur6));
		 listeLivres.add(new Livre(22, "La Ferme des animaux", 1945, auteur6));
		 
		 // Livres de Victor Hugo
		 listeLivres.add(new Livre(23, "Les Misérables", 1862, auteur7));
		 listeLivres.add(new Livre(24, "Notre-Dame de Paris", 1831, auteur7));
		 
		 // Livres de Alexandre Dumas (ID 25 à 26)
		 listeLivres.add(new Livre(25, "Les Trois Mousquetaires", 1844, auteur8));
		 listeLivres.add(new Livre(26, "Le Comte de Monte-Cristo", 1844, auteur8));
		 
		 // Livres de Albert Camus
		 listeLivres.add(new Livre(27, "L'Étranger", 1942, auteur9));
		 listeLivres.add(new Livre(28, "La Peste", 1947, auteur9));
		 
		 // Livres de Jean-Paul Sartre
		 listeLivres.add(new Livre(29, "La Nausée", 1938, auteur10));
		 listeLivres.add(new Livre(30, "Huis Clos", 1944, auteur10));
		 
		 // Livres supplémentaires
		 listeLivres.add(new Livre(31, "Le Petit Prince", 1942, new Auteur(11, "De SaintExupéry", "Antoine")));
		 
		//Erreur volontaire année 1943
		 listeLivres.add(new Livre(32, "Vingt mille lieues sous les mers", 1870, new Auteur(12, "Verne", "Jules")));
		 listeLivres.add(new Livre(33, "Les Fleurs du Mal", 1857, new Auteur(13, "Baudelaire", "Charles")));
		 
		 
		}
		@Override
		 public List<Auteur> getListeAuteurs() {
		 return listeAuteurs;
		 }
		
		
		// TO IMPLEMENTS
		@Override
		public List<Livre> getListeLivres() {
		return null ;
		}
		
		// TODO 1) Partie 2 : Implémenter les méthodes indiquées dans la partie Travail à faire.
		
		
		@Override
		public Livre findLivreById(int id) {
			// TODO Auto-generated method stub
			for(Livre livre : listeLivres) {
				if(livre.getId()==id) {
					return livre;
				}
			}
			return null;
		}
		
		
		@Override
		public Auteur findAuteurByNom(String nom) {
			// TODO Auto-generated method stub
			for(Auteur auteur : listeAuteurs) {
				if(auteur.getNom().equals(nom)) {
					return auteur;
				}
			}
			return null;
		}
		
		
		@Override
		public Auteur findAuteurById(int id) {
			// TODO Auto-generated method stub
			for(Auteur auteur : listeAuteurs) {
				if(auteur.getId()==id) {
					return auteur;
				}
			}
			return null;
		}
		
		
		@Override
		public List<Livre> findLivreByAuteurId(int auteurId) {
			// TODO Auto-generated method stub
			List<Livre> l = new ArrayList<>();
			for(Livre livre : listeLivres) {
				if(livre.getAuteur().getId() == auteurId) {
					l.add(livre);
				}
			}
			return l;
		}
		
		
		@Override
		public List findLivreByAuteurNom(String nomAuteur) {
			// TODO Auto-generated method stub
			List<Livre> l = new ArrayList<>();
			for(Livre livre : listeLivres) {
				if(livre.getAuteur().getNom() == nomAuteur) {
					l.add(livre);
				}
			}
			return l;
		}
		
		
		@Override
		public Livre findLivreByTitre(String titre) {
			// TODO Auto-generated method stub
			for(Livre livre : listeLivres) {
				if(livre.getTitre() == titre) {
					return livre;
				}
			}
			return null;
		}
		
		
		@Override
		public Livre removeLivre(int id) {
			// TODO Auto-generated method stub
			for(Livre livre : listeLivres) {
				if(livre.getId() == id) {
					listeLivres.remove(livre);
					return livre;
				}
			}
			return null;
		}
		
		
		@Override
		public Livre saveLivre(Livre l) throws NonExistAuthorException{
			// TODO Auto-generated method stub
			try {
				boolean ajout = true;
				for(Auteur auteur : listeAuteurs) {
					if(l.getAuteur().equals(auteur)) {
						listeLivres.add(l);
						return l;
					}
				}
				for(Livre livre : listeLivres) {
					if(livre.equals(l)) {
						System.out.println("Livre déjà existant");
						ajout = false;
					}
				}
				if(ajout == true) {
					listeLivres.remove(l);
					listeLivres.add(l);
				}
				
				
				
			} catch(Exception e) {
				System.out.println("Impossible");
			}
			return null;
		}
		
		
		@Override
		public void saveAuteur(Auteur a) {
			// TODO Auto-generated method stub
			boolean ajout = true;
			for(Auteur auteur : listeAuteurs) {
				if(auteur.equals(a)) {
					System.out.println("Auteur déjà existant");
					ajout = false;
				}
			}
			if(ajout == true) {
				listeAuteurs.remove(a);
				listeAuteurs.add(a);
			}
		}
		
		
		@Override
		public Auteur findAuteurNomLike(String nom) {
			// TODO Auto-generated method stub
			for(Auteur auteur : listeAuteurs) {
				if(auteur.getNom().contains(nom)) {
					return auteur;
				}
			}
			return null;
		}
		
		
		@Override
		public Livre FindLivreTitreLike(String nom) {
			// TODO Auto-generated method stub
			for(Livre livre : listeLivres) {
				if(livre.getTitre().contains(nom)) {
					return livre;
				}
			}
			return null;
		}
		
}