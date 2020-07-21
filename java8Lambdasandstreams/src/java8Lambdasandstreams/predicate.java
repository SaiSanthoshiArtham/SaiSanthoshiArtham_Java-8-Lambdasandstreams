package java8Lambdasandstreams;
import java.util.*; 
import java.util.function.Predicate; 

public class predicate {//Here conditions are string starting with a and contain only 3 letters
	public static void main(String args[]) {
        List<String> names = Arrays.asList("apple","Apple","abcdef","app","mlhngo","mango"); 
        
  
        Predicate<String> p =((s)->(s.length()==3) && s.startsWith("a") ); 
       
        for (String st:names) { 
            if (p.test(st)) 
                System.out.println(st); 
        } 
    } 
}
