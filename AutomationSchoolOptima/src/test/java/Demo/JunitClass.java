package Demo;

import java.io.IOException;
import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class JunitClass extends BaseClassMethods {
	
	
	@BeforeClass
    public static void browserlaunch() {
		launchcrome();
		winmax();
		
    }
    @Before
    public void starttime() throws IOException {
     // driver.get("http://192.168.2.222:5055/schooloptima/");
    	loadurl(getData("Login2", 0, 1));
       Date d=new Date();
       System.out.println(d);
    }
    @After
    public void endtime() {
        Date d=new Date();
        System.out.println(d);
    }
    @AfterClass
    public static void closingbrowser() throws InterruptedException {
        Thread.sleep(2000);
        browserClse();
    }
    @Test
    public void click() throws InterruptedException, IOException {
        PojoClass po=new PojoClass();
        	
        Thread.sleep(2000);
        btnClick(po.getBtn());
      
       Thread.sleep(2000);
       
        fill(po.getId(),getData("Login2",1,1));
      
        fill(po.getPw(),getData("Login2",2,1));
     
        btnClick(po.getSubmit());
       
		
		jClick(po.getStuclick());
          
        
        
        
        
        
        
        
        
        
    }
	
	
	

}
