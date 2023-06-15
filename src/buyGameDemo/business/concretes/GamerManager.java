package buyGameDemo.business.concretes;

import buyGameDemo.business.abstracts.GamerService;
import buyGameDemo.core.abstracts.GamerCheckServise;
import buyGameDemo.dataAccess.concretes.HibernateGamerDao;
import buyGameDemo.entities.concretes.Gamer;

public class GamerManager implements GamerService{
	private GamerCheckServise checkServise;
	private HibernateGamerDao hibernateGamerDao;

	public GamerManager(GamerCheckServise checkServise,HibernateGamerDao hibernateGamerDao) {
		this.checkServise = checkServise;
		this.hibernateGamerDao = hibernateGamerDao;
	}

	@Override
	public void register(Gamer gamer) {
		if(checkServise.checkData(gamer)) {
			hibernateGamerDao.add(gamer);
			
		}
		else {
			System.out.println("Giris etmek mumkun olmadi");
		}
		
	}

	@Override
	public void delete(Gamer gamer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updata(Gamer gamer) {
		// TODO Auto-generated method stub
		
	}

}
