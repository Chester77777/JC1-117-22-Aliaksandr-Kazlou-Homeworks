package lesson03;

public class Task01 {
    public static void main(String[] args) {
        int dayOfWeek = 5;
        switch (dayOfWeek) {
            case 1:
                System.out.println("This is Monday.");
                break;
            case 2:
                System.out.println("This is Tuesday.");
                break;
            case 3:
                System.out.println("This is Wednesday.");
                break;
            case 4:
                System.out.println("This is Thursday.");
                break;
            case 5:
                System.out.println("This is Friday.");
                break;
            case 6:
                System.out.println("This is Saturday.");
                break;
            case 7:
                System.out.println("This is Sunday.");
                break;
            default:
                System.out.println("This is not a day of the week.");
        }
    }
}
