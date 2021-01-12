package com.controllers;

import com.interfaces.iDisposable;
import com.interfaces.iSigninInteractor;

public class SignInController implements iDisposable {
	private iSigninInteractor siIn = null;

	public SignInController(iSigninInteractor siIn) {
		this.siIn = siIn;
	}
	
	public boolean signInApp(String username, String password) {
		return this.siIn.signin(username, password);
	}
	public void dispose() {
		
	}
	
}
