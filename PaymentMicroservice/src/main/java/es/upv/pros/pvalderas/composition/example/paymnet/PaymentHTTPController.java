package es.upv.pros.pvalderas.composition.example.paymnet;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
public class PaymentHTTPController {
	
	@RequestMapping(
			  value = "/changepaymentdetails", 
			  method = RequestMethod.GET)
	 public String changePaymentDetails() {
		 return "Payment details changed";
	 }
	
	@RequestMapping(
			  value = "/paymentprocess", 
			  method = RequestMethod.GET)
	 public String paymentProcess() {
		 return "Payment processes";
	 }
	
	@RequestMapping(
			  value = "/cancelorder", 
			  method = RequestMethod.GET)
	 public String cancelOrder() {
		 return "Order Cancelled";
	 }
	
	@RequestMapping(
			  value = "/showpaymentoptions", 
			  method = RequestMethod.GET)
	 public String showPaymentOptions() {
		 return "Payment Options Shown";
	 }
	
	@RequestMapping(
			  value = "/informcustomer", 
			  method = RequestMethod.GET)
	 public String informCustomer() {
		 return "Customer Informed";
	 }
}
