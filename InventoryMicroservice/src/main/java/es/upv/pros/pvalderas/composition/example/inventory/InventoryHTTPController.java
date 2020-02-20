package es.upv.pros.pvalderas.composition.example.inventory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
public class InventoryHTTPController {
	
	@RequestMapping(
			  value = "/checkavailability", 
			  method = RequestMethod.GET)
	 public String checkAvailabity() {
		 return "Check availbility OK";
	 }
	
	@RequestMapping(
			  value = "/updateStock", 
			  method = RequestMethod.GET)
	 public String updateStock() {
		 return "Stock Updated";
	 }
	
	@RequestMapping(
			  value = "/cancelorder", 
			  method = RequestMethod.GET)
	 public String cancelOrder() {
		 return "Order Cancelled";
	 }
	
	@RequestMapping(
			  value = "/bookproducts", 
			  method = RequestMethod.GET)
	 public String bookProducts() {
		 return "Products Booked";
	 }
	
	@RequestMapping(
			  value = "/releaseproducts", 
			  method = RequestMethod.GET)
	 public String releaseProducts() {
		 return "Products Released";
	 }
	
	@RequestMapping(
			  value = "/informcustomer", 
			  method = RequestMethod.GET)
	 public String informCustomer() {
		 return "Customer Informed";
	 }

}
