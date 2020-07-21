package java8Lambdasandstreams;
import java.util.*; 
import java.util.function.Predicate; 
import java.lang.*;
import java.io.*;
public class ispalindrome {
	 

	static boolean Palindrome(String s){
		int i = 0, j = s.length() - 1; 
		  
        
        while (i < j) {  
             
            if (s.charAt(i) != s.charAt(j)) 
                return false; 
           
            i++; 
            j--; 
        } 
  
        return true; 
	}
	public static void main(String args[]) {
		
        List<String> names = Arrays.asList("madam","sir","lol","abba","abs"); 
       
        
        Predicate<String> pal = ((s)->(Palindrome(s))); 
       
        for (String str:names) { 
            if (pal.test(str)) 
                System.out.println(str); 
        } 
    } 
}

