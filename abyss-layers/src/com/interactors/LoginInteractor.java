package com.interactors;

import com.database.LoginDB;
import com.interfaces.*;

public class LoginInteractor implements iDisposable, iLoginInteractor{
	LoginDB logOnDatabase = new LoginDB();
	
	@Override
	public boolean login(String usename, String password) {
		return this.logOnDatabase.login(usename, password);		
	}

	@Override
	public void dispose() {
		this.logOnDatabase.dispose();
		this.logOnDatabase = null;
	}

}
