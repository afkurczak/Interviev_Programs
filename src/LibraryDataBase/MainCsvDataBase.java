package LibraryDataBase;

import LibraryDataBase.Frame.StartWindow;
import com.sun.tools.javac.Main;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.awt.EventQueue;


public class MainCsvDataBase {
    static InFileDataBase inFileDataBase = new InFileDataBase();
    static List<Book> books = new ArrayList<>();
    public static void MainDataBase(){
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new StartWindow();
            }
        });
        LibraryDataBase.Frame.MainFrame.MainFrame();
        //MenuDataBase();

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
        System.out.println("0. Exit");

        Scanner scanner = new Scanner(System.in);
        int menuKey = scanner.nextInt();

        switch (menuKey) {
            case 1 -> add();
            case 2 -> getById();
            case 3 -> findByIsbn();
            case 4 -> findByAuthor();
            case 5 -> findByTitle();
            case 6 -> deleteById();
            case 7 -> updateById();
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

        static void getById (){
            System.out.println("Enter Id: ");
            Scanner scanner = new Scanner(System.in);
            Long idIn = scanner.nextLong();
            System.out.println(inFileDataBase.getById(idIn));
        }

        static void findByIsbn(){
            System.out.println("Enter ISBN: ");
            Scanner scanner = new Scanner(System.in);
            String isbn = scanner.nextLine();
            System.out.println(inFileDataBase.findByIsbn(isbn));
        }

        static void findByAuthor() {
            System.out.println("Enter author firstname: ");
            Scanner scanner = new Scanner(System.in);
            String firstName = scanner.nextLine();
            System.out.println("Enter author lastname: ");
            Scanner scanner1 = new Scanner(System.in);
            String lastName = scanner1.nextLine();


            for (Book book : inFileDataBase.findByAuthor(new Author(firstName, lastName))) {
                System.out.println(book);
            }
        }

            static void findByTitle() {
                System.out.println("Enter Title");
                Scanner scanner = new Scanner(System.in);
                String title = scanner.nextLine();
                for (Book book : inFileDataBase.findByTitle(title)) {
                    System.out.println(book);
                }
            }

            static void deleteById(){
                System.out.println("Enter ID");
                Scanner scanner = new Scanner(System.in);
                String title = scanner.nextLine();

            }

            static void updateById(){

            }
}

