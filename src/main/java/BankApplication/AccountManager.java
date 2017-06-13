package BankApplication;

import javax.annotation.Resource;
import javax.sql.DataSource;

public class AccountManager {

	@Resource(mappedName="java:/bank")
	DataSource ds;
}
