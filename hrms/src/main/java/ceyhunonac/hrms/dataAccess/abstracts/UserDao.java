package ceyhunonac.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import ceyhunonac.hrms.entities.abstracts.User;

public interface UserDao extends JpaRepository<User, Integer>{ 

	
	
}
