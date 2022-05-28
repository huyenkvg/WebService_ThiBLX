package com.example.WebService;

import com.example.WebService.Entity_BLX.Cauhoi;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class WebServiceApplication {
	@Bean
	public ModelMapper modelMapper(){
		return new ModelMapper();
	}

	public static void main(String[] args) {
		SpringApplication.run(WebServiceApplication.class, args);
		com.example.WebService.Entity_BLX.Cauhoi ch = new Cauhoi();

		System.out.println("HuyenkuteHEHE");

	}

}
