package controller;

import java.util.*;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.bean.*;
import model.bo.PostBO;

/**
 * Servlet implementation class ShowListLocationServlet
 */
//@WebServlet("/ShowListLocationServlet")
public class ShowListLocationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowListLocationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.sendRedirect("listLocation.jsp");
		//RequestDispatcher rd=request.getRequestDispatcher("listLocation.jsp");
		//rd.forward(request, response);
		ArrayList<Post> listPost=new ArrayList<Post>();
		
		//get list location
		PostBO postBO=new PostBO();
		listPost=postBO.getListPost();
		
		//sent location to view
		RequestDispatcher rd=request.getRequestDispatcher("listLocation.jsp");
		rd.forward(request, response);
	}

}
