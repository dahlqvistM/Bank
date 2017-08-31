package BankApplication;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import BankApplication.Customer;
import BankApplication.CustomerManager;


// TODO: return results in JSON

@Controller 
public class TesterController {
	
	
/*	@RequestMapping(value = "/")
	public String home() {
		System.out.println("HomeController: Passing through...");
		return "index.jsp";
	}*/
	
	/*@RequestMapping("/bank")
	public @ResponseBody String welcome(){
		return "Welcome to the Bank";
	}*/
	
	@RequestMapping("/bank/login")	
	//public @ResponseBody String login(@RequestParam Integer customerId,@RequestParam String password){
	public @ResponseBody String login(@RequestParam Integer customerId){
		Customer customer = new CustomerManager().getCustomer(customerId);
		return "Welcome " + customer.getName();
	}
	
	@RequestMapping("/bank/signin")	
	public @ResponseBody String login(@RequestParam String name){
		Customer customer = new CustomerManager().setCustomer(4444,"user1","password1",name,"address1");
		return "Created acount for: " + customer.getName();
	}

}
