package lesson03;

public class Task02 {
    public static void main(String[] args) {
        int dayOfWeek = 5;
        if (dayOfWeek == 1) {
            System.out.println("This is Monday.");
        } else if (dayOfWeek == 2) {
            System.out.println("This is Tuesday.");
        } else if (dayOfWeek == 3) {
            System.out.println("This is Wednesday.");
        } else if (dayOfWeek == 4) {
            System.out.println("This is Thursday.");
        } else if (dayOfWeek == 5) {
            System.out.println("This is Friday.");
        } else if (dayOfWeek == 6) {
            System.out.println("This is Saturday.");
        } else if (dayOfWeek == 7){
            System.out.println("This is Sunday.");
        } else {
            System.out.println("This is not a day of the week.");
        }
    }
}
