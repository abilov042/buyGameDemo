package buyGameDemo.business.abstracts;

import buyGameDemo.entities.concretes.Campaign;
import buyGameDemo.entities.concretes.Game;

public interface CampaignService {
	void addCampaign(Campaign campaign);
	void delete(Campaign campaign);
	void updata(Campaign campaign);
	void applyCampaign (Campaign campaign, Game game);

}
