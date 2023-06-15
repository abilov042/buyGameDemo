package buyGameDemo.mernisServiceReferense;

import java.time.LocalDate;

public class KPSPublicSoapClient {
		public boolean checkDate(long nationalityId,String firtsName,String lastName, LocalDate dateOfYear) {
			if(dateOfYear.getYear()<2005) {
				return true;
			}
			return false;
		}
}
