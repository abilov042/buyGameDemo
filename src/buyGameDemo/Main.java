package buyGameDemo;

import java.time.LocalDate;

import buyGameDemo.business.abstracts.CampaignService;
import buyGameDemo.business.abstracts.GameService;
import buyGameDemo.business.abstracts.GamerService;
import buyGameDemo.business.concretes.CampaignManager;
import buyGameDemo.business.concretes.GameManager;
import buyGameDemo.business.concretes.GamerManager;
import buyGameDemo.core.concretes.GamerValidatorAdapter;
import buyGameDemo.dataAccess.concretes.HibernateGamerDao;
import buyGameDemo.entities.concretes.Campaign;
import buyGameDemo.entities.concretes.Game;
import buyGameDemo.entities.concretes.Gamer;

public class Main {

	public static void main(String[] args) {
		Gamer gamer = new Gamer(1, 1234, "Shamil", "Abilov", LocalDate.of(2004, 11, 8));
		Game game = new Game(2, "TheLastOfUs", 110.3);
		Campaign campaign = new Campaign(3, "Novruz kampanyasi", 50.4);
		
		GamerService gamerService = new GamerManager(new GamerValidatorAdapter(), new HibernateGamerDao());
		GameService gameService = new GameManager();
		CampaignService campaignService = new CampaignManager();
		
		gamerService.register(gamer);
		gameService.buy(game, gamer);
		campaignService.applyCampaign(campaign, game);
	}

}
