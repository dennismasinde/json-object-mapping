package org.example;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) throws IOException {

        String file = "book.json";
        String file1 = "booklist.json";
        String file2 = "home.json";

        ObjectMapper objectMapper = new ObjectMapper();
        Book book = objectMapper.readValue(new File(file), Book.class);

        System.out.println(book);

        Book [] bookArray = objectMapper.readValue(new File(file1), Book[].class);

        System.out.println(Arrays.asList(bookArray));

        List<Book> bookList = objectMapper
                .readValue(new File(file1), new TypeReference<List<Book>>() {});

        System.out.println(bookList);

        Home home = objectMapper.readValue(new File(file2), Home.class);
        System.out.println(home);

        List<Pet> pets = home.getPets();

        for (Pet data: pets) {
            System.out.println(data.getName() + " " + data.getColor());
        }

    }
}