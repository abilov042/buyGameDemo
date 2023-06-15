package buyGameDemo.dataAccess.concretes;

import java.util.List;

import buyGameDemo.dataAccess.abstracts.GamerDao;
import buyGameDemo.entities.concretes.Gamer;

public class HibernateGamerDao implements GamerDao{

	@Override
	public void add(Gamer gamer) {
		System.out.println("Oyuncu giris etdi " + gamer.getFirstName());
		
	}

	@Override
	public void delete(Gamer gamer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updata(Gamer gamer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Gamer getId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Gamer> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
