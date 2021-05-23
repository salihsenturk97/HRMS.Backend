package kodlamaio.Hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;


import kodlamaio.Hrms.entities.concretes.JobTitle;


public interface JobTitleDao extends JpaRepository<JobTitle, Integer>{
	
	// OLUŞTURMA SİLME GÜNCELLEME OLAYINI Jpa yapıyor, bu methodları Jpa sağlıyor
	
}
