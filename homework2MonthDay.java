import java.util.Scanner;

public class homework2MonthDay {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please type name of the month with lower case and press enter. ");
        System.out.println("Then also type day of that month and press enter");

        String month = scanner.nextLine().toLowerCase();
        int day = scanner.nextInt();

        switch (month) {
            case "january":
                if (day > 0 && day < 31) {
                    System.out.print("Yes correct that is such day in january");
                } else {
                    System.out.println("There is no such day in january");
                }
                break;
            case "february":
                if (day > 0 && day < 28) {
                    System.out.print("Yes correct that is such day in february");
                } else {
                    System.out.println("There is no such day in february");
                }
                break;
            case "march":
                if (day > 0 && day < 31) {
                    System.out.print("Yes correct that is such day in march");
                } else {
                    System.out.println("There is no such day in march");
                }
                break;
            case "april":
                if (day > 0 && day < 30) {
                    System.out.print("Yes correct that is such day in april");
                } else {
                    System.out.println("There is no such day in april");
                }
                break;
            case "may":
                if (day > 0 && day < 31) {
                    System.out.print("Yes correct that is such day in may");
                } else {
                    System.out.println("There is no such day in may");
                }
                break;
            case "june":
                if (day > 0 && day < 30) {
                    System.out.print("Yes correct that is such day in june");
                } else {
                    System.out.println("There is no such day in june");
                }
                break;
            case "july":
                if (day > 0 && day < 31) {
                    System.out.print("Yes correct that is such day in july");
                } else {
                    System.out.println("There is no such day in july");
                }
                break;
            case "august":
                if (day > 0 && day < 31) {
                    System.out.print("Yes correct that is such day in august");
                } else {
                    System.out.println("There is no such day in august");
                }
                break;
            case "september":
                if (day > 0 && day < 30) {
                    System.out.print("Yes correct that is such day in september");
                } else {
                    System.out.println("There is no such day in september");
                }
                break;
            case "october":
                if (day > 0 && day < 31) {
                    System.out.print("Yes correct that is such day in october");
                } else {
                    System.out.println("There is no such day in october");
                }
                break;
            case "november":
                if (day > 0 && day < 30) {
                    System.out.print("Yes correct that is such day in november");
                } else {
                    System.out.println("There is no such day in november");
                }
                break;
            case "december":
                if (day > 0 && day < 31) {
                    System.out.print("Yes correct that is such day in december");
                } else {
                    System.out.println("There is no such day in december");
                }
                break;
            default:
                System.out.println("There is no such month in our calendar");
        }
    }
}