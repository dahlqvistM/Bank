package BankApplication;



import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


// TODO: return results in JSON

@RestController 
public class Controller {
	
	@RequestMapping("/bank")
	public @ResponseBody String welcome(){
		return "Welcome to the Bank";
	}
	
	@RequestMapping("/bank/login")
	public @ResponseBody String login(@RequestParam Integer customerId, @RequestParam String password){
		Customer customer = new CustomerManager().getCustomer(customerId);
		return "Welcome " + customer.getName();
	}

}
iuashgas