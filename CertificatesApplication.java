package com.jsw.certificates;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CertificatesApplication {

	public static void main(String[] args) {
		SpringApplication.run(CertificatesApplication.class, args);
		System.out.println("Certificates");
	}

}
