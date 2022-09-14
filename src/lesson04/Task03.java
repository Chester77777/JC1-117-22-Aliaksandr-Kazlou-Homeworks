package lesson04;

public class Task03 {
    public static void main(String[] args) {
        int numberOfFibonacciFirst = 0;
        int numberOfFibonacciSecond = 1;
        int numberOfFibonacciNext = 0;
        int amountOfNumbers = 10;
        while (amountOfNumbers > 0) {
            System.out.println(numberOfFibonacciFirst);
            numberOfFibonacciNext = numberOfFibonacciFirst + numberOfFibonacciSecond;
            numberOfFibonacciFirst = numberOfFibonacciSecond;
            numberOfFibonacciSecond = numberOfFibonacciNext;
            amountOfNumbers -= 1;
        }
    }
}
