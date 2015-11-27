package com.bfry.network;

import com.fishjord.irwidget.ir.codes.IRCommand;

public interface NetworkService {

	public void SendCommand(IRCommand command);
	
	public String GetCommandExeResult();
}
