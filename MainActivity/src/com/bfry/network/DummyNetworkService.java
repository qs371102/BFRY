package com.bfry.network;

import com.fishjord.irwidget.ir.codes.IRCommand;

import android.util.Log;

public class DummyNetworkService implements NetworkService {
	
	private static String TAG="MJRY";
	@Override
	public void SendCommand(IRCommand command) {
		// TODO Auto-generated method stub
		Log.d(TAG, "SendCommand");
		GetCommandExeResult();
		
	}

	@Override
	public String GetCommandExeResult() {
		// TODO Auto-generated method stub
		Log.d("MJRY","GetResult");
		return "E0";
	}


}
