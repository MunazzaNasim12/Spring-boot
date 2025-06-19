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
		
//		VaccineService service = container.getBean(VaccineService.class);
		
//		service.fechVaccineInfoBySorting(false, "vaccineName").forEach(v->System.out.println(v));
		
//		service.fechVaccineInfoBySorting(false, "VaccineName").forEach(vc->System.out.println(vc));
	
	}
}
