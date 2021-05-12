package kodlamaio.Hrms.entities.concretes;
import javax.persistence.Column; 

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@Table(name="job_titles")
@AllArgsConstructor
@NoArgsConstructor
public class JobTitle { // varlık olduğu için entities kısmına ekledik
	
	@Id // TABLODAKİ İD BU DİYORUZ
	@GeneratedValue(strategy=GenerationType.IDENTITY)	// OTOMATİK ARTMASI İÇİN
	
	@Column(name="id")	
	private int id;		
		
	@Column(name="title")
	private String title;
	
	

}