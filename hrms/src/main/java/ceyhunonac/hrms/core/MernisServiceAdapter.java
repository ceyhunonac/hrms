package ceyhunonac.hrms.core;

import java.rmi.RemoteException;


import ceyhunonac.hrms.entities.concretes.JobSeeker;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter  {
	public boolean checkRealPerson(JobSeeker seekers) {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		try {
			return client.TCKimlikNoDogrula(Long.parseLong(seekers.getTcNo()), seekers.getName().toUpperCase(),
					seekers.getSurname().toUpperCase(), seekers.getBirthYear());
		} catch (NumberFormatException | RemoteException e) {
			
			e.printStackTrace();
		}	
		return true;
	}
}