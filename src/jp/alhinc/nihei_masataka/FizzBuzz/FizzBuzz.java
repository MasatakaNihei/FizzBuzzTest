package jp.alhinc.nihei_masataka.FizzBuzz;

import java.math.BigDecimal;

public class FizzBuzz {

	public static void plintFizzBuzz(double d){
		System.out.println(fizzBuzz(d));
	}
	
	
	public static String fizzBuzz(double d) {
		StringBuilder ret = new StringBuilder();
		
		if(d != Math.floor(d)){
			return BigDecimal.valueOf(d).toPlainString();
		}
		
		if(d%3 == 0){
			ret.append("Fizz");
		}
		
		if(d%5 == 0){
			ret.append("Buzz");
		}

		if(ret.toString().isEmpty()){
			return String.valueOf((int)d);
		}
		
		return ret.toString();
	}
	
	
	

}
