package LibraryDataBase;

import java.time.LocalDate;

public class MainCsvDataBase {
    public static void MainDataBase(){
        InFileDataBase db = new InFileDataBase();

        Book book = new Book("Krzyżacy", "1171", LocalDate.of(1900, 7, 1), new Author("Henryk", "Sienkiewicz"));

        try{
            db.add(book);
        }catch (IllegalArgumentException e){
            System.out.println("ISBN Double - cannot add record");
        }
    }
}
