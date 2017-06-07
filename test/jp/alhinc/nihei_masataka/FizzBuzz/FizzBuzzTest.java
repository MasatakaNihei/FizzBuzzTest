package jp.alhinc.nihei_masataka.FizzBuzz;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class FizzBuzzTest {
	
	double argument;
	String expexcted;
	
	public FizzBuzzTest(String d, String str){
		this.argument = Double.parseDouble(d);
		this.expexcted = str;
	}
	
	@Parameters
	public static List<String[]> parameter(){
		List<String[]> ret = new ArrayList<String[]>();
		ret.add(new String[]{"0", "FizzBuzz"});
		ret.add(new String[]{"3", "Fizz"});
		ret.add(new String[]{"9", "Fizz"});
		ret.add(new String[]{"5", "Buzz"});
		ret.add(new String[]{"25", "Buzz"});
		ret.add(new String[]{"15", "FizzBuzz"});
		ret.add(new String[]{"90", "FizzBuzz"});
		ret.add(new String[]{"22", "22"});
		ret.add(new String[]{"-15", "FizzBuzz"});
		ret.add(new String[]{"-19", "-19"});
		ret.add(new String[]{"1.5", "1.5"});
		ret.add(new String[]{"-1.5", "-1.5"});
		return ret;
	}
	
	@Test
	public void testFizzBuzzTest() {
		String actual = FizzBuzz.fizzBuzz(this.argument);
		assertThat(actual, is(this.expexcted));
	}

}
