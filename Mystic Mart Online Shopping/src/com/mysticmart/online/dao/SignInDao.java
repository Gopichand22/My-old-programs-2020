package com.mysticmart.online.dao;

import com.mysticmart.online.model.SignIn;

public interface SignInDao {
	Boolean validateUser(SignIn signIn);
}
