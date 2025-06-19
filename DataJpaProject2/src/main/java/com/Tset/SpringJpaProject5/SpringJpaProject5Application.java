package com.Tset.SpringJpaProject5;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.Tset.SpringJpaProject5.model.Vaccine;
import com.Tset.SpringJpaProject5.service.VaccineService;

@SpringBootApplication
public class SpringJpaProject5Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(SpringJpaProject5Application.class, args);
		
		VaccineService service = container.getBean(VaccineService.class);
		
//		String status=service.registerVaccineDetail(new Vaccine("Covaxin","BharatBoi",444.4));
//		System.out.println(status);
		
//		List<Vaccine> arryList=new ArrayList<Vaccine>();
//		arryList.add(new Vaccine("Moderena","Pfizer",454556.4));
//		arryList.add(new Vaccine("Influenza","Cipla",4545.4));
//		arryList.add(new Vaccine("Comirnaty","BioNTech",674.3));
//		arryList.add(new Vaccine("Sinovac", "Biotech" ,4563.8));
//		arryList.add(new Vaccine("Measles","Merck",4564.3));
//		
//		Iterable<Vaccine>vac=service.registerMultipleVaccine(arryList);
//		for(Vaccine v:vac)
//		{
//			System.out.println(v);
//		}

		
//		Long count = service.getCount();
//		System.out.println("Number of vaccine info in recourds "+count);
//		
//		int id=55;
//		Boolean status = service.checkAvalible(id);
//		if(status) 
//			System.out.println("Vaccine with id is avalible "+id );
//			else 
//				System.out.println("Vaccine with id is unavalible "+id);
//		
	}

}
