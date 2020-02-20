package es.upv.pros.pvalderas.composition.example.shipment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
public class ShipmentHTTPController {
	
	@RequestMapping(
			  value = "/createshipment", 
			  method = RequestMethod.GET)
	 public String createShipment() {
		 return "Shipment Created";
	 }
	
	@RequestMapping(
			  value = "/assigndriver", 
			  method = RequestMethod.GET)
	 public String assignDriver() {
		 return "Driver Assigned";
	 }

}
