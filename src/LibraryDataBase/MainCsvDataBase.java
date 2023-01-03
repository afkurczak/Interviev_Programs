package LibraryDataBase;

import com.sun.tools.javac.Main;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainCsvDataBase {
    static MainCsvDataBase db = new MainCsvDataBase();
    public static void MainDataBase(){

        //MenuDataBase();
        GetByHtml.gettingHtml();
    }

    public static void MenuDataBase () {
        System.out.println("Library Data Base(CSV File)");
        System.out.println("Choose option");
        System.out.println("1. Add new Book");
        System.out.println("2. Get by Id");
        System.out.println("3. Find by ISBN");
        System.out.println("4. Find by Author");
        System.out.println("5. Find by Title");
        System.out.println("6. Delete by Id");
        System.out.println("7. Update by Id");

        Scanner scanner = new Scanner(System.in);
        int menuKey = scanner.nextInt();

        switch (menuKey) {
            case 1 -> add();
        }
    }

    private static void add(){
        System.out.print("Write title: ");
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();

        System.out.print("Write ISBN: ");
        Scanner scanner1 = new Scanner(System.in);
        String isbn = scanner1.nextLine();

        System.out.println("Write release Date: ");
        System.out.print("Year: ");
        Scanner scanner2a = new Scanner(System.in);
        int yearReleaseDate = scanner2a.nextInt();

        System.out.print("Month: ");
        Scanner scanner2b = new Scanner(System.in);
        int monthReleaseDate = scanner2b.nextInt();

        System.out.print("Day: ");
        Scanner scanner2c = new Scanner(System.in);
        int dayReleaseDate = scanner2c.nextInt();

        LocalDate releaseDate = LocalDate.of(yearReleaseDate, monthReleaseDate, dayReleaseDate);

        System.out.println("Write author: ");
        System.out.print("First Name: ");
        Scanner scanner3a = new Scanner(System.in);
        String firstName = scanner3a.nextLine();

        System.out.print("Last Name:");
        Scanner scanner3b = new Scanner(System.in);
        String lastName = scanner3b.nextLine();

        Book book = new Book(title,isbn,releaseDate,new Author(firstName,lastName));
        InFileDataBase inFileDataBase = new InFileDataBase();
        inFileDataBase.add(book);
        }
}
