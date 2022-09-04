package com.utkarsh.medicine.prescriptor;

import com.utkarsh.medicine.prescriptor.Objects.Medicine;
import com.utkarsh.medicine.prescriptor.Service.MedicineService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MedicinePrescriptorApplication {

	public static void main(String[] args) {
		SpringApplication.run(MedicinePrescriptorApplication.class, args);
	}


	@Bean
	public CommandLineRunner initialCreate(MedicineService medicineService) {
		return (args) -> {
			Medicine medicine =
					new Medicine("Fever","Dolo","Basil");
			Medicine medicine2 = new Medicine("Pain","Flexon","haldi+milk");
//
//			book1.addAuthor(author1);
//			book1.addCategory(category1);
//			book1.addPublisher(publisher1);
//			bookService.createBook(book1);
//
			medicineService.createMedicine(medicine);
			medicineService.createMedicine(medicine2);

		};
	}
}