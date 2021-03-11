package recursionPractice;

public class main {
    public static void main(String[] args){
        //1. print nums
        printNums(10);
        //2. print cat eyes
        System.out.println("Cat eyes:" + catEyes(5));
        //3. print the power of the numbers inputted
        System.out.println("Power:" + power(3,3));
        //4. prints factorials
        System.out.println("Factorial:" + factorial(4));
        //5. prints out the fibanacci numbers
        System.out.println("Fibonacci Sequence:" + fibonacci(6));

    }
    public static void printNums(int num){
        //base case, print from the number above to 1
        if(num ==0) {
            return;
        } else {
            System.out.println(num);
            printNums(num -1);
        }
    }
    public static int catEyes(int cats){
        //base case, if there are 0 cats, there are 0 cat eyes
        if(cats == 0){
            return 0;
        } else return 2 + catEyes(cats - 1);
    }
    public static int power(int base, int num){
        //base case: if the num is == to 1 return the base number
        if(num == 1){
            return base;
        } else {
            return base * power(base, num -1);
        }
    }
    public static int factorial(int num){
        //base case
        if(num == 0 || num == 1){
            return 1;
        } else {
            return num * factorial(num-1);
        }
    }
    public static int fibonacci(int num) {
        //Fibonacci Series: 0,1,1,1,2,3,5,8,13,21...
        // any number is the sum of the previous two nums
        // base case
        if(num == 0){
            return 0;
        } else if (num == 1){
            return 1;
        } else {
            return fibonacci(num - 1) + fibonacci(num - 2);
        }
    }
}
