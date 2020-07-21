package java8Lambdasandstreams;

import java.util.Arrays; 
class Arrayaverage { 
    public static void main(String[] args) 
    { 
        int a[] = {10,11,12,13,14,15,16,17,18,19,20,21}; 
  
        
        int s = 0; 
        
        s = Arrays.stream(a) 
                  .sum(); 
        System.out.println("Average of array using streams : " + (s / a.length)); 
    } 
} 