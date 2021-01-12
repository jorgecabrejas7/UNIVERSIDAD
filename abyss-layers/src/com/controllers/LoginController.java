package com.controllers;

import com.interfaces.iDisposable;
import com.interfaces.iLoginInteractor;

public class LoginController implements iDisposable{
	private iLoginInteractor lgIn = null;
	
	public LoginController(iLoginInteractor lgIn) {
		
		this.lgIn = lgIn;
	}
	public boolean logInApp(String username, String password) {
		return this.lgIn.login(username,password);
	}
	public void dispose() {
		this.lgIn.dispose();
		this.lgIn = null;
	}
}
