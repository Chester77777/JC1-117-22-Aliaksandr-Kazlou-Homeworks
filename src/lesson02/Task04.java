package lesson02;

public class Task04 {
    public static void main(String[] args) {
        int n = 789;
        int sumDigits =n / 100 + n % 100 / 10 + n % 10;
        System.out.println("sumDigits = " + sumDigits);
    }
}
