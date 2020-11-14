package com.xd.Interfaces;

import java.rmi.Remote;

public interface UsersI extends Remote {
	public String login(String user,String pass) throws Exception; 
}
