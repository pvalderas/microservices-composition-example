package es.upv.pros.pvalderas.composition.example.customers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import es.upv.pros.pvalderas.compositioncoordinator.CompositionCoordinator;

@EnableDiscoveryClient
@CompositionCoordinator(serviceAPIClass=CustomersHTTPController.class)
@SpringBootApplication(scanBasePackages = {"es.upv.pros.pvalderas.compositioncoordinator","es.upv.pros.pvalderas.composition.example.customers"})
public class Customers {
	
	public static void main(String[] args) {
		SpringApplication.run(Customers.class, args);
	}
	
		
}