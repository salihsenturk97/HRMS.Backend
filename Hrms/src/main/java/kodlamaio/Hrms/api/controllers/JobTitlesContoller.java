package kodlamaio.Hrms.api.controllers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.Hrms.business.abstracts.JobTitleService;
import kodlamaio.Hrms.entities.concretes.JobTitle;

@RestController // TELEFON,TABLET, HEPSİNE UYGUN HALE GETİRİYOR / HER ORTAMA UYGUN HAL
@RequestMapping("/api/jobtitles") //domainden sonraki yolu belirliyoruz

public class JobTitlesContoller {
	
	private JobTitleService jobTitleService;
	@Autowired // PARAMETREDEKİ JOBTİTLESERVİCESİ KİM İMPLEMENTE EDİYOR ONA BAKIYOR VE ONUN REFERANSINI VERİYOR
	public JobTitlesContoller(JobTitleService jobTitleService) {
		this.jobTitleService= jobTitleService; 
	}
	@GetMapping("/getall")
	public List<JobTitle> getAll(){
		return jobTitleService.getAll();		
		
	}
	
	

}
