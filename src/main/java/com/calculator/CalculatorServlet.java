package com.calculator;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class CalculatorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public String n1,n2;
	CalClass m=new CalClass();

	String op="";
       
   
    public CalculatorServlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	  response.setContentType("text/html;charset=UTF-8");
		double result=0.0;
		PrintWriter out = response.getWriter();
		int number1=Integer.parseInt(request.getParameter("txt1"));
		int number2=Integer.parseInt(request.getParameter("txt2"));
		
		
		
		String operator=request.getParameter("op");
		switch (operator) {
		case "Addition":
			result=m.addition(number1, number2);
			break;
		case "Subtraction":
			result=m.subtraction(number1, number2);
			break;
		case "multiplication":
		result=m.multiply(number1, number2);
		break;
		case "division":
			result=m.division(number1, number2);
			break;
		default:
			break;
		}
		out.println("<html>\r\n" + 
				"<head>\r\n" + 
				"<style>\r\n" + 
				"body {\r\n" + 
				"	background:\r\n" + 
				"		url('https://www.askalender.com/globalassets/article-images/home-mortgages/2018/aal-hm-biweeklypayments.jpg')\r\n" + 
				"		no-repeat center center fixed;\r\n" + 
				"	-webkit-background-size: cover;\r\n" + 
				"	-moz-background-size: cover;\r\n" + 
				"	-o-background-size: cover;\r\n" + 
				"	background-size: cover;\r\n" + 
				"}\r\n" + 
				"</style>\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"<link\r\n" + 
				"	href=\"//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css\"\r\n" + 
				"	rel=\"stylesheet\" id=\"bootstrap-css\">\r\n" + 
				"<script\r\n" + 
				"	src=\"//netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js\"></script>\r\n" + 
				"<script src=\"//code.jquery.com/jquery-1.11.1.min.js\"></script>\r\n" + 
				"<!------ Include the above in your HEAD tag ---------->\r\n" + 
				"<script type=\"text/javascript\">\r\n" + 
				"	$(document).ready(function() {\r\n" + 
				"		toggleFields();\r\n" + 
				"\r\n" + 
				"		$(\"#emailTo\").change(function() {\r\n" + 
				"			toggleFields();\r\n" + 
				"		});\r\n" + 
				"\r\n" + 
				"		function toggleFields() {\r\n" + 
				"			if ($(\"#emailTo\").val() == 0)\r\n" + 
				"				$(\".emailAlternate\").show();\r\n" + 
				"			else\r\n" + 
				"				$(\".emailAlternate\").hide();\r\n" + 
				"		}\r\n" + 
				"\r\n" + 
				"	});\r\n" + 
				"</script>\r\n" + 
				"</head>\r\n" + 
				"<body>\r\n" + 
				"	<div class=\"container\">\r\n" + 
				"		<div class=\"row\">\r\n" + 
				"			<h2></h2>\r\n" + 
				"		</div>\r\n" + 
				"\r\n" + 
				"	</div>\r\n" + 
				"	<div class=\"container\">\r\n" + 
				"		<div class=\"row\">\r\n" + 
				"			<h2></h2>\r\n" + 
				"		</div>\r\n" + 
				"\r\n" + 
				"	</div>\r\n" + 
				"	<div class=\"container\">\r\n" + 
				"		<div class=\"row\">\r\n" + 
				"			<h2></h2>\r\n" + 
				"		</div>\r\n" + 
				"\r\n" + 
				"	</div>\r\n" + 
				"	<div class=\"container\">\r\n" + 
				"		<div class=\"row\">\r\n" + 
				"			<div class=\"col-md-5 col-md-offset-5\">\r\n" + 
				"				<div class=\"panel panel-default\">\r\n" + 
				"					<div class=\"panel-heading\">\r\n" + 
				"						<span class=\"glyphicon glyphicon-list-alt\r\n" + 
				"content: \"\\e032\"\r\n" + 
				"&#xe032;\" ></span>\r\n" + 
				"						Calculator\r\n" + 
				"					</div>\r\n" + 
				"					<div class=\"panel-body\">\r\n" + 
				"						<form action=\"CalculatorServlet\" class=\"form-horizontal\"\r\n" + 
				"							role=\"form\" method=\"post\">\r\n" + 
				"							<div class=\"form-group\">\r\n" + 
				"								<label for=\"inputEmail3\" class=\"col-sm-3 control-label\">\r\n" + 
				"									First No</label>\r\n" + 
				"								<div class=\"col-sm-7\">\r\n" + 
				"									<input type=\"number\" class=\"form-control\" id=\"txt1\"\r\n" + 
				"									name=\"txt1\"\r\n" + 
				"										 placeholder=\"Enter Number\" required>\r\n" + 
				"								</div>\r\n" + 
				"							</div>\r\n" + 
				"\r\n" + 
				"							<div class=\"form-group\">\r\n" + 
				"								<label for=\"emailFrom\" class=\"col-lg-5 control-label\"></label>\r\n" + 
				"								<div class=\"col-sm-3\">\r\n" + 
				"									<select class=\"form-control\" id=\"op\" value=\"op\" name=\"op\">\r\n" + 
				"										<option value=\"Addition\">+</option>\r\n" + 
				"										<option value=\"Subtraction\">-</option>\r\n" + 
				"										<option value=\"multiplication\">*</option>\r\n" + 
				"										<option value=\"division\">/</option>\r\n" + 
				"									</select>\r\n" + 
				"								</div>\r\n" + 
				"							</div>\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"							<div class=\"form-group\">\r\n" + 
				"								<label for=\"number\" class=\"col-sm-3 control-label\">\r\n" + 
				"									Second No</label>\r\n" + 
				"								<div class=\"col-sm-7\">\r\n" + 
				"									<input type=\"number\" class=\"form-control\" id=\"txt2\" name=\"txt2\"\r\n" + 
				"										placeholder=\"Enter Number\" required>\r\n" + 
				"								</div>\r\n" + 
				"							</div>\r\n" + 
				"							<!--                     <div class=\"form-group\"> -->\r\n" + 
				"							<!--                         <div class=\"col-sm-offset-3 col-sm-9\"> -->\r\n" + 
				"							<!--                             <div class=\"checkbox\"> -->\r\n" + 
				"							<!--                                 <label> -->\r\n" + 
				"							<!--                                     <input type=\"checkbox\"/> -->\r\n" + 
				"							<!--                                     Remember me -->\r\n" + 
				"							<!--                                 </label> -->\r\n" + 
				"							<!--                             </div> -->\r\n" + 
				"							<!--                         </div> -->\r\n" + 
				"							<!--                     </div> -->\r\n" + 
				"							<div class=\"form-group last\">\r\n" + 
				"								<div class=\"col-sm-offset-5 col-sm-9\">\r\n" + 
				"									<button type=\"submit\" class=\"btn btn-success btn-sm\"\r\n" + 
				"										value=\"submit\">Submit</button>\r\n" + 
				"										\r\n" + 
				"										\r\n" + 
				"										\r\n" + 
				"										\r\n" + 
				"									<!--                                  <button type=\"reset\" class=\"btn btn-default btn-sm\"> -->\r\n" + 
				"									<!--                                 Reset</button> -->\r\n" + 
				"								</div>\r\n" + 
				"							</div>\r\n" + 
				"						</form>\r\n" + 
				"					</div>\r\n" + 
				"					<div class=\"panel-footer\" id=\"result\" >\r\n" + 
								 
				"						Result is = "+ result
											 + 
				"					</div>\r\n" + 
				"				</div>\r\n" + 
				"			</div>\r\n" + 
				"		</div>\r\n" + 
				"	</div>\r\n" + 
				"</body>\r\n" + 
				"</html>");
		
		
		
		
	}


}
