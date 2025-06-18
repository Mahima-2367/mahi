package TestNG;

import java.io.IOException;
import java.util.Date;

import org.junit.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Demo.BaseClassMethods;

public class TestNGDemo  extends BaseClassMethods{

	
	
@BeforeClass
	
	private void startpoint() {
		   
		   launchcrome() ;
		   winmax();
	   }
		  
	   
		   @BeforeMethod
	 
		   private void starttime() throws IOException  {
			   
			   loadurl(getData("Login2", 0,1));
			   Date d = new Date();
			   System.out.println(d);
		   }
		   
		   @AfterMethod
		   
		   private void Stoptime() {
		     
			   Date d = new Date ();
		   
		       System.out.println(d);
		   
		   }   
		   
		   @AfterClass
		   private void close() {
		   
			   browserClse();
		   
		   } 
		   
		@Test		
		private void myplanner () throws IOException {
		 
			TestNGPojoClass tng = new TestNGPojoClass();
			
			btnClick(tng.getBtn());
			fill(tng.getId(), getData("Login2", 1,1));
			fill(tng.getPw(),getData("Login2", 2, 1));
			btnClick(tng.getSubmit());
			
			
			
			
			
			
		   
		}	   
	

	
	
}
