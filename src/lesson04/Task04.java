package lesson04;

public class Task04 {
    public static void main(String[] args) {
        int lineNumber = 1;
        int columnNumber = 1;
        while (lineNumber <= 10) {
            while (columnNumber <= 10) {
                System.out.print(lineNumber * columnNumber + "  ");
                columnNumber += 1;
            }
            System.out.println("");
            columnNumber = 1;
            lineNumber += 1;
        }
    }
}
