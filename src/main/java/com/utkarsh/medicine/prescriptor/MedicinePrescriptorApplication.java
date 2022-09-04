package com.utkarsh.medicine.prescriptor;

import com.utkarsh.medicine.prescriptor.Objects.Medicine;
import com.utkarsh.medicine.prescriptor.Service.MedicineService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.context.PropertyPlaceholderAutoConfiguration;
import org.springframework.boot.autoconfigure.http.HttpMessageConvertersAutoConfiguration;
import org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration;
import org.springframework.boot.autoconfigure.thymeleaf.ThymeleafAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.DispatcherServletAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.HttpEncodingAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Configuration
@Import({
		DispatcherServletAutoConfiguration.class,
		ErrorMvcAutoConfiguration.class,
		HttpEncodingAutoConfiguration.class,
		HttpMessageConvertersAutoConfiguration.class,
		JacksonAutoConfiguration.class,
		PropertyPlaceholderAutoConfiguration.class,
		ThymeleafAutoConfiguration.class,
		WebMvcAutoConfiguration.class,

})
public class MedicinePrescriptorApplication {

	public static void main(String[] args) {
		SpringApplication.run(MedicinePrescriptorApplication.class, args);
	}


	@Bean
	public CommandLineRunner initialCreate(MedicineService medicineService) {
		return (args) -> {

              Medicine medicine = new Medicine("Fever","Aspirin,Paracetamol","Ginger,giloy,tulsi");
			Medicine medicine2 = new Medicine("Chest Pain","ibuprofen,Flexon","Amalaki,Lasuna");
			Medicine medicine3 = new Medicine("Back Pain","","Ginger,giloy,tulsi");
			Medicine medicine4 = new Medicine("Piles","Docusate, Lidocian","Kshara Karma");
			Medicine medicine5 = new Medicine("High Blood Pressure","Norvasc , Lotrel","Amla ,Ashwagandha");
			Medicine medicine6 = new Medicine("Diabetes","Insuline,Metformin","Shilajit,Turmeric");
			Medicine medicine7 = new Medicine("Hair Fall","Minoxidil,Finasteride","Amla,Shikakai");
			Medicine medicine8 = new Medicine("Pimples","Tetracylinc,Macrolide","Haridra Khanda");
			Medicine medicine9 = new Medicine("Vomiting","Arepitant","Honey Roasted gram");
			Medicine medicine10 = new Medicine("Headache","Aspirin,Paracetamol","Brahmi ghitam");
			Medicine medicine11 = new Medicine("Cough","Mucinex DM","Tulsi,Pippali");



			medicineService.createMedicine(medicine);
			medicineService.createMedicine(medicine2);
			medicineService.createMedicine(medicine3);
			medicineService.createMedicine(medicine4);
			medicineService.createMedicine(medicine5);
			medicineService.createMedicine(medicine11);
			medicineService.createMedicine(medicine10);
			medicineService.createMedicine(medicine9);
			medicineService.createMedicine(medicine8);
			medicineService.createMedicine(medicine7);
			medicineService.createMedicine(medicine6);





		};
	}
}