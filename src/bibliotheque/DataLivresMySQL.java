package bibliotheque;

import java.sql.*;
import java.util.List;

import entity.Auteur;
import entity.Livre;

public class DataLivresMySQL implements DataLivres {

	public Connection connexion;
	public MyConnection myconnexion;
	
	public DataLivresMySQL(String url, String user, String password) {
	myconnexion = new MyConnection(url,user,password);
	}
	
	public DataLivresMySQL() {
	myconnexion = new MyConnection();
	}
	
	@Override
	public Livre findLivreById(int id) {
		Livre a = null;
		String rsql = "SELECT id, titre, anneePublication, auteur_id, FROM livre WHERE id = ?";
		try {
			PreparedStatement pstmt = connexion.prepareStatement(rsql);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
			a = new Livre(rs.getInt("id"), rs.getString("titre"), rs.getInt("anneePublication"), findAuteurById(rs.getInt("auteur_id")));
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
			return a;
	}
	
	@Override
	public List<Auteur> getListeAuteurs() {
	// TODO Auto-generated method stub
	return null;
	}
	
	@Override
	public List<Livre> getListeLivres() {
	// TODO Auto-generated method stub
	return null;
	}
	
	@Override
	public Auteur findAuteurByNom(String nom) {
	// TODO Auto-generated method stub
	return null;
	}
	
	@Override
	public Auteur findAuteurById(int id) {
	Auteur a = null;
	String rsql = "SELECT id, nom, prenom, FROM auteur WHERE id = ?";
	try {
		PreparedStatement pstmt = connexion.prepareStatement(rsql);
		ResultSet rs = pstmt.executeQuery();
		if(rs.next()) {
			a = new Auteur(rs.getInt("id"), rs.getString("nom"), rs.getString("prenom"));
		}
	} catch(SQLException e) {
		e.printStackTrace();
	}
		return a;
	}
	
	@Override
	public List<Livre> findLivreByAuteurId(int auteurId) {
	// TODO Auto-generated method stub
	return null;
	}
	
	@Override
	public List<Livre> findLivreByAuteurNom(String nomAuteur) {
	// TODO Auto-generated method stub
	return null;
	}
	
	@Override
	public Livre findLivreByTitre(String titre) {
	// TODO Auto-generated method stub
	return null;
	}
	
	@Override
	public Livre removeLivre(int id) {
	// TODO Auto-generated method stub
	return null;
	}
	
	@Override
	public Livre saveLivre(Livre l) throws NonExistAuthorException{
	// TODO Auto-generated method stub
	return null;
	}

	@Override
	public void saveAuteur(Auteur a) {
		// TODO Auto-generated method stub
		String rsql = "INSERT INTO auteur(id,nom,prenom) VALUES (?,?,?)";
		try {
			PreparedStatement pstmt = connexion.prepareStatement(rsql);
			pstmt.setInt(1, a.getId());
			pstmt.setString(2, a.getNom());
			pstmt.setString(3, a.getPrenom());
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				a = new Auteur(rs.getInt("id"), rs.getString("nom"), rs.getString("prenom"));
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public Auteur findAuteurNomLike(String nom) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Livre FindLivreTitreLike(String nom) {
		// TODO Auto-generated method stub
		return null;
	}
	
}

