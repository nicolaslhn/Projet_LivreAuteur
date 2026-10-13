package entity;

public class Livre {
	private int id;
	private String titre;
	private int anneePublication;
	private Auteur auteur;
	
	public Livre(int id, String titre, int anneePublication, Auteur auteur) {
		this.id = id;
		this.titre = titre;
		this.anneePublication = anneePublication;
		this.auteur = auteur;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public int getAnneePublication() {
		return anneePublication;
	}

	public void setAnneePublication(int anneePublication) {
		this.anneePublication = anneePublication;
	}

	public Auteur getAuteur() {
		return auteur;
	}

	public void setAuteur(Auteur auteur) {
		this.auteur = auteur;
	}
	
	
}
