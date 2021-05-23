package com.mysticmart.online.controller.controllerimpl;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mysticmart.online.controller.SignInService;
import com.mysticmart.online.dao.SignInDao;
import com.mysticmart.online.dao.daoimpl.SignInDaoImpl;
import com.mysticmart.online.model.SignIn;

public class SignInServiceImpl extends HttpServlet implements SignInService {

	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response) {
		String name = request.getParameter("name");
		String emaill = request.getParameter("email");
		String password = request.getParameter("pass");

		SignIn signIn = new SignIn();
		SignInDao signInDao = new SignInDaoImpl();

		signIn.setUserName(name);
		signIn.setUserName(emaill);
		signIn.setPass(password);

		try {
			boolean userValidate = signInDao.validateUser(signIn);

			if (userValidate) {

				HttpSession session = request.getSession();
				session.setAttribute("username", name);
				request.setAttribute("email", emaill);

				request.getRequestDispatcher("products.jsp").forward(request, response);

			} else {
				System.out.println("Error message = " + userValidate);
				request.setAttribute("errMessage", userValidate);

				request.getRequestDispatcher("signin.jsp").forward(request, response);
			}
		} catch (IOException e1) {
			e1.printStackTrace();
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}

}
