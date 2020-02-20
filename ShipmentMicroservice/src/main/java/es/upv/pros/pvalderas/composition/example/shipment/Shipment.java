package es.upv.pros.pvalderas.composition.example.shipment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import es.upv.pros.pvalderas.compositioncoordinator.CompositionCoordinator;

@EnableDiscoveryClient
@CompositionCoordinator(serviceAPIClass=ShipmentHTTPController.class)
@SpringBootApplication(scanBasePackages = {"es.upv.pros.pvalderas.compositioncoordinator","es.upv.pros.pvalderas.composition.example.shipment"})
public class Shipment {
	
	
	public static void main(String[] args) {
		SpringApplication.run(Shipment.class, args);
	}
	
		
}