package bibliotheque;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import entity.Auteur;
import entity.Livre;

public class CachingDao implements DataLivres{
	private DataLivresMySQL dao;
	private Map<Integer, Auteur> cache;
	public CachingDao() {
		dao=new DataLivresMySQL();
		cache=new HashMap<Integer, Auteur>();
		
	}
	
	@Override
	public Auteur findAuteurById(int id) {
		Integer idinteger=Integer.valueOf(id);
		Auteur a =cache.get(idinteger);
		if(a != null) {
			return a;
		}else {
			a=dao.findAuteurById(id);
			cache.put(idinteger, a);
			return a;
		}
	}
	
	@Override
	public Auteur saveAuteur(Auteur a) {
		Auteur as=dao.saveAuteur(a);
		if(as != null) {
			cache.put(Integer.valueOf(as.getId() ), as);
			return as;
		}else return null;
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
	public Livre findLivreById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Auteur findAuteurByNom(String nom) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Livre> findLivreByAuteurId(int auteurId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List findLivreByAuteurNom(String nomAuteur) {
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
	public Livre saveLivre(Livre l) throws NonExistAuthorException {
		// TODO Auto-generated method stub
		return null;
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
