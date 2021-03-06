package kodlamaio.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.Hrms.business.abstracts.JobTitleService;
import kodlamaio.Hrms.dataAccess.abstracts.JobTitleDao;
import kodlamaio.Hrms.entities.concretes.JobTitle;

@Service // SERVİS KATMANI OLDUĞUNU SÖYLÜYORUZ // İŞLERİ BURDA YAPTIĞIMIZ İÇİN
public class JobTitleManager implements JobTitleService{
	 // newliyor ve constructor görmesini sağlıyor
	
	
	private JobTitleDao jobTitleDao; // ADD, UPDATE DELETE GİBİ İŞLERMLERİ KULANMAK İÇİN
	
	@Autowired
	public JobTitleManager(JobTitleDao jobTitleDao) {
		this.jobTitleDao = jobTitleDao;
	}

	@Override
	public List<JobTitle> getAll() {
		
		return this.jobTitleDao.findAll();
	}

}
