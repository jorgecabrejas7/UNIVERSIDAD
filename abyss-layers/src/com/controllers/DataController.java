package com.controllers;

import com.interfaces.iDataReceiver;
import com.interfaces.iDisposable;

public class DataController implements iDisposable {
	private iDataReceiver drcv = null;
	
	public DataController(iDataReceiver drcv) {
		this.drcv = drcv;
	}
	public boolean insertData(double value) {
		return this.drcv.insertData(value);
	};
	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}
	

}
