package buyGameDemo.business.concretes;

import buyGameDemo.business.abstracts.GameService;
import buyGameDemo.entities.concretes.Game;
import buyGameDemo.entities.concretes.Gamer;

public class GameManager implements GameService {

	@Override
	public void buy(Game game, Gamer gamer) {
		System.out.println(gamer.getFirstName()+", "+game.getGameName()+" Oyununu "+game.getGamePrice()+" qiymete aldiniz");
		
	}

}
