package Test;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import ICompute;
import Compute;

public class ComputeTest<ICompute> 
{
	ICompute iobj;
	
	ComputeTest impobj;
	 
	int a;
	int b;
	@Before
	
	public void setUp() throws Exception{
		
		a = 5;
		b = 8;
		impobj = new ComputeTest<Object>();
		
		iobj= Mockito.mock(ICompute.class);
		Mockito.when(impobj.Multiply(a,b)), thenReturn(40));
		impobj.setobj(iobj);
		
	}
	@After
	public void tearDown() throws Exception
	{
		iobj = null;
		impobj = null;
		
	}
	@Test
	 
	public void Multiplytest()
	{
		assertEquals(40,impobj.Multiply(a,b));
		
	}
		
		
}

