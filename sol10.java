// You are using Java
//Create a method greetUser(String name) that prints “Hello, [name]!” Call it from main().
//Write a method isEven(int n) that returns true if the number is even. Take input and test it.


	public class Main {
        public static void greetUser(String name){
            System.out.println("Hello, "+name+"!");
        }
        public static boolean isEven(int n){
            return n%2==0;
        }
        
		public static void main(String[] args) {
            greetUser("Himanshu");
            int n=7;
            if(isEven(n)){
                System.out.println(n+" is even.");
            }else{
                System.out.println(n+" is odd.");
            }

		
		}
	}
