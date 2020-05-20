public class FizzBuzz {

	public static void main(String[] args) {
		
		fizzBuzz();

	}
	
	public static void fizzBuzz() {
		
		for(int n = 1; n <= 100; n++) {
			
			if(n % 3 == 0 && n % 5 == 0) { //n % (5*3) == 0
				
				System.out.println("Fizzbuzz");
				//System.out.println(n + " Fizzbuzz");
				
			}else if(n % 5 == 0) {
				
				System.out.println("Buzz");
				//System.out.println(n + " Buzz");
				
			}else if(n % 3 == 0){
				
				System.out.println("Fizz");
				//System.out.println(n + " Fizz");
				
			}else{
				System.out.println(n);
			}
			
		}
		
	}

}
