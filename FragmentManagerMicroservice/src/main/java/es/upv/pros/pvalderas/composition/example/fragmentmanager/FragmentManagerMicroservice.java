package es.upv.pros.pvalderas.composition.example.fragmentmanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import es.upv.pros.pvalderas.fragmentmanager.FragmentManager;

@FragmentManager
@SpringBootApplication(scanBasePackages = {"es.upv.pros.pvalderas.fragmentmanager"})
public class FragmentManagerMicroservice {

	public static void main(String[] args) {
		SpringApplication.run(FragmentManagerMicroservice.class, args);
	}
	

}
