package com.interactors;

import com.database.PressInsDB;
import com.interfaces.iDataReceiver;
import com.interfaces.iDisposable;

public class PressureReceiver implements iDataReceiver, iDisposable {
	PressInsDB pidb = new PressInsDB();

	@Override
	public boolean insertData(double value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

}
