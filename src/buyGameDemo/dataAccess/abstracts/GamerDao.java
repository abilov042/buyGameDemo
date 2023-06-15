package buyGameDemo.dataAccess.abstracts;

import java.util.List;

import buyGameDemo.entities.concretes.Gamer;

public interface GamerDao {
	void add(Gamer gamer);
	void delete(Gamer gamer);
	void updata(Gamer gamer);
	Gamer getId(int id);
	List<Gamer> getAll();

}
