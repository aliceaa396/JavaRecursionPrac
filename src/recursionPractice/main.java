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

        //6. prints how many speakers a phone has
        System.out.println("These mobile devices have: " + mobileSpeakers(4) + " phone speakers all together.");

        //7. prints out the sum of the numbers input added all together,
        System.out.println("Sum of integers:" + sum(11));

        //8. prints the number 5 and on the right prints the number of times 5 appears
        System.out.println("Count the fives:" + countFive(23535155));

        //9. Binary Search divides array into two parts,
        // and checks if that value is greater than the middle val of the array
        int [] array = {11,34,56,77,88,99,123,456,2345};
        System.out.println("Binary Search:" + binarySearch(array, 34, 0, array.length - 1));
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
    public static int mobileSpeakers(int mobiles) {
        //Every phone has two speakers, this function takes the number of cell phones
        //And outputs the number of speakers they have total
        if(mobiles == 0){
            return 0;
        } else {
            if(mobiles % 2 == 0) {
                return 2 + mobileSpeakers(mobiles -  1);
            } else {
                return 1 + mobileSpeakers(mobiles -1 );
            }
        }
    }
    public static int sum (int num) {
        //Send an int to a function and return the sum of all digits
        //ex: 321 would be 3 + 2 + 1 which == 6
        //When that number is divided by 10 it gives you the result removing the last digit
        //ex: 321/10 == 32.1 => 32
        //base case
        if(num <= 9){
            return num;
        } else {
            return num % 10 + sum(num / 10);
        }
    }
    public static int countFive (int num) {
        //base case
        if (num <= 9){
            if(num == 5){
                return 1;
            } else {
                return 0;
            }
        } else {
            //separates the last digit and checks if its = to 5
            if(num % 10 == 5){
                return 1 + countFive(num / 10);
            } else {
                return 0 + countFive(num /10);
            }
        }

    }

    public static int binarySearch(int[] array, int key, int start, int end){
        if(start <= end){
            int middle = (start + end)/2;
            if (array[middle] > key){
                return binarySearch(array,key,start,middle - 1);
            } else if (array[middle] < key){
                return binarySearch(array, key, middle + 1, end);
            } else {
                return middle;
            }
        } else {
            return - 1;
        }
    }

}
