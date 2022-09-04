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





		};
	}
}