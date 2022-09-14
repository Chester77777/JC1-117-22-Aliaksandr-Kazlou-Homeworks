package lesson03;

public class Task03 {
    public static void main(String[] args) {
        int whatTimeNow = 24;
        if (whatTimeNow >= 0 && whatTimeNow < 6 | whatTimeNow == 24) {
            System.out.println("Good night!");
        } else if (whatTimeNow >= 6 && whatTimeNow < 12) {
            System.out.println("Good morning!");
        } else if (whatTimeNow >= 12 && whatTimeNow < 18) {
            System.out.println("Good day!");
        } else if (whatTimeNow >= 18 && whatTimeNow < 24) {
            System.out.println("Good evening!");
        } else {
            System.out.println("This is not a time.");
        }
    }
}
