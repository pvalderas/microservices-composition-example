package es.upv.pros.pvalderas.composition.example.customers;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
public class CustomersHTTPController {
	
	@RequestMapping(
			  value = "/checkcustomer", 
			  method = RequestMethod.GET)
	 public String checkCustomer() {
		 return "Check Customers OK";
	 }
	
	@RequestMapping(
			  value = "/logrequest", 
			  method = RequestMethod.GET)
	 public String logRequest() {
		 return "Request logged";
	 }
	
	@RequestMapping(
			  value = "/cancelorder", 
			  method = RequestMethod.GET)
	 public String cancelOrder() {
		 return "Order Cancelled";
	 }
	
	@RequestMapping(
			  value = "/updatecustomerrecord", 
			  method = RequestMethod.GET)
	 public String updateCustomerRecord() {
		 return "Customer Recorde Updated";
	 }
	
	@RequestMapping(
			  value = "/processvip", 
			  method = RequestMethod.GET)
	 public String processVIP() {
		 return "VIP processed";
	 }
	
	
	@RequestMapping(
			  value = "/showadvertising", 
			  method = RequestMethod.GET)
	 public String showAdvertising() {
		 return "Advertising Shown";
	 }
	
	@RequestMapping(
			  value = "/offervipoptions", 
			  method = RequestMethod.GET)
	 public String offerVIPOptions() {
		 return "Advertising Shown";
	 }
	
	@RequestMapping(
			  value = "/informcustomer", 
			  method = RequestMethod.GET)
	 public String informCustomer() {
		 return "Customer Informed";
	 }
}
