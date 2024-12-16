package com.registration;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/regform")
public class Register extends HttpServlet{
	
	public static void main(String[] args) {
		
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String firstName = request.getParameter("fname");
		String lastName = request.getParameter("lname");
		String mobile = request.getParameter("mob");
		String email = request.getParameter("email");
		String dob = request.getParameter("dob");
		String age = request.getParameter("age");
		String gender = request.getParameter("gender");
		String city = request.getParameter("city");
		String state = request.getParameter("state");
		String pin = request.getParameter("pin");
		String country = request.getParameter("country");
		String degree = request.getParameter("degree");
		String passYear = request.getParameter("passy");
		String password = request.getParameter("pass");
		
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(mobile);
		System.out.println(email);
		System.out.println(dob);
		System.out.println(age);
		System.out.println(gender);
		System.out.println(city);
		System.out.println(state);
		System.out.println(pin);
		System.out.println(country);
		System.out.println(degree);
		System.out.println(passYear);
		System.out.println(password);
		
		PrintWriter out = response.getWriter();
		
		out.println(firstName);
		out.println(lastName);
		out.println(mobile);
		out.println(email);
		out.println(dob);
		out.println(age);
		out.println(gender);
		out.println(city);
		out.println(state);
		out.println(pin);
		out.println(country);
		out.println(degree);
		out.println(passYear);
		out.println(password);
	}

}
