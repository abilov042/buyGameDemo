package buyGameDemo.core.concretes;

import buyGameDemo.core.abstracts.GamerCheckServise;
import buyGameDemo.entities.concretes.Gamer;
import buyGameDemo.mernisServiceReferense.KPSPublicSoapClient;

public class GamerValidatorAdapter implements GamerCheckServise{

	@Override
	public boolean checkData(Gamer gamer) {
		KPSPublicSoapClient client = new KPSPublicSoapClient();
		if(client.checkDate(gamer.getNationalityId(), gamer.getFirstName().toUpperCase(), gamer.getLastName().toUpperCase(), gamer.getDateOfBirth())) {
			return true;
		}
		return false;
	}

}
