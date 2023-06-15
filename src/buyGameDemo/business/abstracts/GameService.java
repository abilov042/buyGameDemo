package buyGameDemo.business.abstracts;

import buyGameDemo.entities.concretes.Game;
import buyGameDemo.entities.concretes.Gamer;

public interface GameService {
	void buy(Game game, Gamer gamer);

}
