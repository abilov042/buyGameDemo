package buyGameDemo.business.concretes;

import buyGameDemo.business.abstracts.CampaignService;
import buyGameDemo.entities.concretes.Campaign;
import buyGameDemo.entities.concretes.Game;

public class CampaignManager implements CampaignService {

	@Override
	public void addCampaign(Campaign campaign) {
		System.out.println("Kampanya eklendi "+campaign.getCampaingName());
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Kampanya silindi "+campaign.getCampaingName());
		
	}

	@Override
	public void updata(Campaign campaign) {
		System.out.println("Kampanya guncellendi "+campaign.getCampaingName());
		
	}

	@Override
	public void applyCampaign(Campaign campaign, Game game) {
		System.out.println(campaign.getCampaingName()+"sina ozel "+(game.getGamePrice()-campaign.getCompaingAmount()));
		
	}

}
