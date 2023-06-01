package Encapsulation;
public class Main {
    public static void main(String[] args) {
        MyDate md = new MyDate(11, 5, 2002);
        md.setDay(30);
        md.setMonth(5);
        md.setYear(2023);

        System.out.println("Day: " + md.getDay());
        System.out.println("Month: " + md.getMonth());
        System.out.println("Year: " + md.getYear());

    }
}

