package com.gcu.business;

import com.gcu.model.LoginModel;
import com.gcu.model.RegisterModel;

public interface IUserBusinessService 
{
	public int createUser(RegisterModel newUser);
	//public boolean login(LoginModel model);
}
