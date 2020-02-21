package es.upv.pros.pvalderas.composition.example.globalcompositionmanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import es.upv.pros.pvalderas.globalcompositionmanager.GlobalCompositionManager;

@GlobalCompositionManager
@SpringBootApplication(scanBasePackages = {"es.upv.pros.pvalderas.globalcompositionmanager"})
public class GlobalCompositionManagerMicroservice {

	public static void main(String[] args) {
		SpringApplication.run(GlobalCompositionManagerMicroservice.class, args);
	}
	
}
 