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
		connexion = myconnexion.getConnection();
		Auteur a = null;
		String rsql = "SELECT id, nom, prenom FROM auteur WHERE id = ?";
		try {
			PreparedStatement pstmt = connexion.prepareStatement(rsql);
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				a = new Auteur(rs.getInt("id"), rs.getString("nom"), rs.getString("prenom"));
			}
			connexion.close();

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
		connexion = myconnexion.getConnection();
		String rsql = "INSERT INTO livre(id,titre,anneePublication, auteur_id) VALUES (?,?,?,?)";
		try {
			PreparedStatement pstmt = connexion.prepareStatement(rsql);
			pstmt.setInt(1, l.getId());
			pstmt.setString(2, l.getTitre());
			pstmt.setInt(3, l.getAnneePublication());
			pstmt.setInt(4, l.getAuteur().getId());
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				l = new Livre(rs.getInt("id"), rs.getString("titre"), rs.getInt("anneePublication"), l.getAuteur());
			}
			connexion.close();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return l;
	}

	@Override
	public Auteur saveAuteur(Auteur a) {
		Connection c = myconnexion.getConnection();
	
		try {
			Auteur ar = null;
		
			PreparedStatement pstm = c.prepareStatement("SELECT * FROM auteur WHERE id = ?");
			pstm.setInt(1, a.getId());
			ResultSet rs = pstm.executeQuery();
			if (rs.next()) {
				int idfordb = rs.getInt("id");
				PreparedStatement ps = c.prepareStatement("UPDATE auteur SET nom = ?, prenom = ? WHERE id = ?");
				ps.setString(1, a.getNom());
				ps.setString(2, a.getPrenom());
				ps.setInt(3, idfordb);	
				if (ps.executeUpdate() > 0) {
					ar = findAuteurById(idfordb);
				}
			} else {
				String sql = "INSERT INTO auteur VALUES (0, ?, ?)";
			
				PreparedStatement ps = c.prepareStatement(
				sql, Statement.RETURN_GENERATED_KEYS
				);
				ps.setString(1, a.getNom());
				ps.setString(2, a.getPrenom());
			
				int nbLignesAffectee = ps.executeUpdate();
				int newid = 0;
			
				if (nbLignesAffectee > 0) {
					ResultSet rsgk = ps.getGeneratedKeys();
					if (rsgk.next()) {
						newid = (int) rsgk.getLong(1);
					}
				ar = findAuteurById(newid);
				}
			}
			return ar;
		} catch (SQLException e) {
			e.printStackTrace();
		return null;
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

