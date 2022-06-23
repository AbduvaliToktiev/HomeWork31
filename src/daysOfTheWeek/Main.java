package daysOfTheWeek;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DayOfTheWeek monday = DayOfTheWeek.valueOf("MONDAY");
        DayOfTheWeek tuesday = DayOfTheWeek.valueOf("TUESDAY");
        DayOfTheWeek wednesday = DayOfTheWeek.valueOf("WEDNESDAY");
        DayOfTheWeek thursday = DayOfTheWeek.valueOf("THURSDAY");
        DayOfTheWeek friday = DayOfTheWeek.valueOf("FRIDAY");
        DayOfTheWeek saturday = DayOfTheWeek.valueOf("SATURDAY");
        DayOfTheWeek sunday = DayOfTheWeek.valueOf("SUNDAY");
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите день недели на английском: ");
        String choice = sc.nextLine();
        System.out.print("День недели на русском языке: ");
        switch (choice) {
            case "monday":
                System.out.println(monday.getTranslate());
                break;
            case "tuesday":
                System.out.println(tuesday.getTranslate());
                break;
            case "wednesday":
                System.out.println(wednesday.getTranslate());
                break;
            case "thursday":
                System.out.println(thursday.getTranslate());
                break;
            case "friday":
                System.out.println(friday.getTranslate());
                break;
            case "saturday":
                System.out.println(saturday.getTranslate());
                break;
            case "Sunday":
                System.out.println(sunday.getTranslate());
                break;
            default:
        }
    }
}
