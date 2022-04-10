package lastjavaexam;



	import java.util.Random;
	class GenerateRandom {
	    public static void main( String args[] ) {
	      Random rand = new Random(); //instance of random class
	      int upperbound = 1000;
	        //generate random values from 0-999
	      int int_random = rand.nextInt(upperbound); 
	   
	      
	      System.out.println(int_random);
	   
	    }
	}
  



