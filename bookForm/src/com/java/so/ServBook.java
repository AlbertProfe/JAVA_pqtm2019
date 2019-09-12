package com.java.so;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServBook extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter pw = response.getWriter();
		pw.println(request.getParameter("bookTitle"));
		pw.println(request.getParameter("author"));
		pw.println(request.getParameter("isbn"));

		pw.println(request.getParameter("lang"));

		String[] list = request.getParameterValues("typeBook");

		for (int j = 0; j < list.length; j++) {
			pw.println(list[j]);
		}
//CLOSE
		pw.close();

	}
}
