package com.excelr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.excelr.service.Addressworkerservice;



@SpringBootApplication
public class MySecondAppJpa5to8pmApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext con=SpringApplication.run(MySecondAppJpa5to8pmApplication.class, args);
		
		Addressworkerservice ser=con.getBean(Addressworkerservice.class);
		ser.SaveData();
	}

}
