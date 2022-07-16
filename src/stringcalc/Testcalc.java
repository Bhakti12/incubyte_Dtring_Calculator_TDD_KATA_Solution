package stringcalc;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

import org.testng.annotations.Test;
import org.testng.asserts.*;

@Test
public class Testcalc 
{
	@Test
	public void returnemptystring()
	{
		assertEquals(0, Calculator.add(""));
	}
	
	@Test
	public void singlenumber()
	{
		assertEquals(1, Calculator.add("1"));
	}
	
	@Test
	public void twonumber()
	{
		assertEquals(3, Calculator.add("1,2"));
	}
	
	@Test
	public void sumofallnumbers()
	{
		assertEquals(6,Calculator.add("1,2,3"));
	}
	
	@Test
	public void LinesDelimiter()
	{
		assertEquals(6,Calculator.add("1\n2,3"));
	}
	
	@Test
	public void differentdelimiters()
	{
		assertEquals(3,Calculator.add("//;\n1;2"));
	}
	
	@Test
	public void fornegativenumbers()
	{
		try {
			Calculator.add("1,-2,3");
			fail("Exception expected");
		}
		catch(RuntimeException e)
		{
			
		}
	}
	
	@Test
	public void negativemessage()
	{
		try {
			Calculator.add("-1,-2,3");
			fail("Exception expected");
		}
		catch(RuntimeException e)
		{
			assertEquals("negative not allowed: -1,-2",e.getMessage());
		}
	}
}
