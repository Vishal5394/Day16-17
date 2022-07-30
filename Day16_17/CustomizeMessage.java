package com.BridgeLabz.Day16_17;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

		public class CustomizeMessage {
			String name ="<<name>>";
		    String mobileNumber="xxxxxxxxxx";
		    String fullName ="<<full name>>";
		    static String date="30/7/2022";

		    String message;
		public void firstName(String input) {
	        Pattern pattern = Pattern.compile(name);
	        Matcher matcher = pattern.matcher(input);
	        message = matcher.replaceAll("Vishal");
	    }
	    public void fullName(String input) {
	        Pattern pattern = Pattern.compile(fullName);
	        Matcher matcher = pattern.matcher(message);
	        message = matcher.replaceAll("Vishal Jadyal");
	    }
	    public void mobileNumber(String input) {
	        Pattern pattern = Pattern.compile(mobileNumber);
	        Matcher matcher = pattern.matcher(message);
	        message = matcher.replaceAll("9586742657");
	    }
	    public void date(String input) {
	        DateTimeFormatter presentDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	        LocalDateTime localDate = LocalDateTime.now();
	
	        Pattern pattern = Pattern.compile(date);
	        Matcher matcher = pattern.matcher(message);
	        message = matcher.replaceAll(presentDate.format(localDate));
	    }

	    public void displayMessage() {
	        System.out.println(message);
	    }
	
	    public static void main(String[] args) {
	        CustomizeMessage customize = new CustomizeMessage();
	        String input = "Hello <<name>>,\n  your fullname is <<full name>> in our system. \n your contact number is 91-xxxxxxxxxx."
	                +"\n Please,let us know in case of any clarification \n Thank you BridgeLabz " + date;
	        customize.firstName(input);
	        customize.fullName(input);
	        customize.mobileNumber(input);
	        customize.date(input);
	        customize.displayMessage();
    }
}
