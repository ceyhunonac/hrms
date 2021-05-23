package com.campday6.hrms.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import com.campday6.hrms.dataAccess.abstracts.EmployerDao;
import com.campday6.hrms.entities.concretes.Employers;


public class EmployerDaoManager  implements EmployerDao{


	 public List<Employers> employers;

	   public EmployerDaoManager(){
	       this.employers = new ArrayList<Employers>();
	   }

	@Override
	public void add(Employers employers) {
		 this.employers.add(employers);
	       System.out.println(employers.getCompanyName() + "  adlı şirketin sahibi veritabanına eklenmiştir.");
		
	}

	@Override
	public void delete(Employers employers) {
		 this.employers.remove(employers);
	       System.out.println(employers.getCompanyName() + " adlı şirketin sahibi veritabanından silinmiştir.");
		
	}

	@Override
	public void update(Employers employers) {
	       System.out.println(employers.getCompanyName() + " adlı şirketin sahibi veritabanında güncellenmiştir.");
		
	}

	@Override
	public List<Employers> getAll() {
		
		  return this.employers;
	}

}
