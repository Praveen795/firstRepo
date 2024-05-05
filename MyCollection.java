import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

class MyCollection {

    public static void main(String[] args) {
    	
    	MyClass objClass=new MyClass();
    	
    	Thread aThread=new Thread(objClass);
    	aThread.start();
    	
    	System.out.println("hii");
    	
    		}
}