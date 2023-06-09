package ceyhunonac.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import ceyhunonac.hrms.entities.concretes.JobPosition;

public interface JobPositionDao extends JpaRepository<JobPosition, Integer> {

}
