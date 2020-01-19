package pl.sda.academy.intermediate.basic.Basic8Files_Streams;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Spliterator;

public class BookStoreInitializer {

    List<Book> initBookStore() {
        List<Book> books = new ArrayList<>();
        String booksFilePathRelative = getClass().getClassLoader().getResource("book.txt").getFile();
        File booksFile = new File(booksFilePathRelative);
        try {
            Scanner scanner = new Scanner(booksFile);
            while (scanner.hasNext()) {
                String bookLine = scanner.nextLine();
//                String [] books Split

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return books;
    }


}







