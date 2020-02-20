package es.upv.pros.pvalderas.composition.example.paymnet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import es.upv.pros.pvalderas.compositioncoordinator.CompositionCoordinator;

@EnableDiscoveryClient
@CompositionCoordinator(serviceAPIClass=PaymentHTTPController.class)
@SpringBootApplication(scanBasePackages = {"es.upv.pros.pvalderas.compositioncoordinator","es.upv.pros.pvalderas.composition.example.paymnet"})
public class Payment {
	
	
	public static void main(String[] args) {
		SpringApplication.run(Payment.class, args);
	}
	
		
}