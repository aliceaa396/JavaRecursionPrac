package recursionPractice;

public class mainTwo {
    public static void main(String[] args) {
        //FizzBuzz should print Fizz when a number is divisible by 3
        //should print Buzz when a number is divisible by 5
        //and should print FizzBuzz when a number is divisible by both 3 and 5
        //1.
        FizzBuzz(20);


    }
    public static void FizzBuzz(int n) {
        //Create a for loop to loop through i - n
        // i = 1 && n = user input
        //The first conditional statement has to check both 3 and 5 so the loop
        // wont only find Fizz or Buzz (nums divisible by 3 and 5)
        for(int i = 1; i <= n; i++) {
            if((i % 3 == 0) && (i % 5 == 0)){
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0){
                System.out.println("Fizz");
            } else if (i % 5 == 0){
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }



}
