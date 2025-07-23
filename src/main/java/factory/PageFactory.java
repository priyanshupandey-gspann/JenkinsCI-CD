package factory;

import pages.LoginPage;
import pages.AccountsPage;

public class PageFactory {

	static ThreadLocal<LoginPage> LoginPageTL = new ThreadLocal<LoginPage>();
	static ThreadLocal<AccountsPage> AccountsPageTL = new ThreadLocal<AccountsPage>();
	
	public static LoginPage getLoginPage() {
		if(LoginPageTL.get()==null) {
			LoginPageTL.set(new LoginPage());
		}
		return LoginPageTL.get();
	}
	
	public static AccountsPage getAccountsPage() {
		if(AccountsPageTL.get()==null) {
			AccountsPageTL.set(new AccountsPage());
		}
		return AccountsPageTL.get();
	}
}
