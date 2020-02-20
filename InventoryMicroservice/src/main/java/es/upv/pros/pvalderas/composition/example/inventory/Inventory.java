package es.upv.pros.pvalderas.composition.example.inventory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import es.upv.pros.pvalderas.compositioncoordinator.CompositionCoordinator;

@EnableDiscoveryClient
@CompositionCoordinator(serviceAPIClass=InventoryHTTPController.class)
@SpringBootApplication(scanBasePackages = {"es.upv.pros.pvalderas.compositioncoordinator","es.upv.pros.pvalderas.composition.example.inventory"})
public class Inventory {
	
	
	public static void main(String[] args) {
		SpringApplication.run(Inventory.class, args);
	}
	
		
}