package SeleniumtestNG;

import org.testng.annotations.Test;

public class dependency {
	//dependencies
	    @Test(enabled = true)
	    public void tenth() {
	    	System.out.println("tenth");
	    }//final
	    @Test(dependsOnMethods = "tenth")
	    public void highschool() {
	    	System.out.println("12th");
	    }
	    @Test(dependsOnMethods = "highschool")
	    public void college() {
	    	System.out.println("college");
	    }
	    
}
