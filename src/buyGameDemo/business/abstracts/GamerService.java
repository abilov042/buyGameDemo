package buyGameDemo.business.abstracts;

import buyGameDemo.entities.concretes.Gamer;

public interface GamerService {
	void register(Gamer gamer);
	void delete(Gamer gamer);
	void updata(Gamer gamer);

}
