package com.interactors;

import com.database.SignInDB;
import com.interfaces.iDisposable;
import com.interfaces.iSigninInteractor;

public class SignInInteractor implements iDisposable, iSigninInteractor{
	private SignInDB signInDatabase = new SignInDB();
	
	public SignInInteractor() {
	}

	@Override
	public boolean signin(String username, String password) {
		return signInDatabase.signin(username, password);
	}

	@Override
	public void dispose() {
		this.signInDatabase.dispose();
		this.signInDatabase = null;
		
	}
}
