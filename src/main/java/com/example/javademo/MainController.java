package com.example.javademo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
@RequestMapping(path = "/controller")

public class MainController {
	
	public static boolean isDouble(String num) {
		if (num == null) {
			return false;
		}
		try {
			double DoubleNum = Double.parseDouble(num);
		}
		catch (NumberFormatException err) {
			return false;
		}
		return true;
	}

	@RequestMapping(path = "/add/{num1}/{num2}")
	public String Add(@PathVariable String num1, @PathVariable String num2) {
		if (isDouble(num1) && isDouble(num2)) {
			Double ans =  CalculatorLibrary.Add(num1, num2);
			return Double.toString(ans);
		}
		return "Please enter valid response";
	}
	
	@RequestMapping(path = "/sub/{num1}/{num2}")
	public String Sub(@PathVariable String num1, @PathVariable String num2) {
		if (isDouble(num1) && isDouble(num2)) {
			Double ans =  CalculatorLibrary.Sub(num1, num2);
			return Double.toString(ans);
		}
		return "Please enter valid response";
	}
	
	@RequestMapping(path = "/mul/{num1}/{num2}")
	public String Mul(@PathVariable String num1, @PathVariable String num2) {
		if (isDouble(num1) && isDouble(num2)) {
			Double ans =  CalculatorLibrary.Mul(num1, num2);
			return Double.toString(ans);
		}
		return "Please enter valid response";
	}
	
	@RequestMapping(path = "/div/{num1}/{num2}")
	public String Div(@PathVariable String num1, @PathVariable String num2) {
		if (isDouble(num1) && isDouble(num2)) {
			Double ans =  CalculatorLibrary.Div(num1, num2);
			return Double.toString(ans);
		}
		return "Please enter valid response";
	}
	
}
