import java.util.*;

public class main {
	
	  static long iterativeFibo (int iterations) {
			
		  long startTime = 0;
		  
		  int firstNum = 0;
		  int secondNum = 1;
		  int fN = 1;
		  for (int i = 0; i < iterations; i++) {
		  
			firstNum = secondNum;
			secondNum = fN;
			fN = firstNum + secondNum;
			  
			
			 // System.out.println(fN);
			
		}
		  startTime = System.nanoTime();
		  
     	 return startTime;
     	 
		}
	  
	  static long recursiveFibo (int iterations) {
			
		  long startTime = 0;
		  
		  if ((iterations == 1) || (iterations == 0)) {
	            return iterations;
	        }
	       
		  startTime = System.nanoTime();
		  
		  long fN = recursiveFibo(iterations - 1) + recursiveFibo(iterations - 2);
			  
			 // System.out.println(fN);
		 
     	 return startTime;
     	 
		}
		
	public static void main(String[] args) {
		
	  Scanner sc = new Scanner(System.in);
		
	  System.out.println("Please a number of iterations:");
	  
	  int iterations = sc.nextInt();
		
      long iterativeFiboTime = iterativeFibo(iterations);
	  
	  System.out.println("The runtime for the Fibonacci function on iterative fashion is " + iterativeFiboTime + " nano seconds");
       
	  long recursiveFiboTime = recursiveFibo(iterations);
	 
	  System.out.println("The runtime for the Fibonacci function on recursive fashion is " + recursiveFiboTime + " nano seconds");
		
	}
	
}
