package org.example;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) throws IOException {

        String file = "book.json";
        String booklist = "booklist.json";
        String file2 = "home.json";
        String gitHubWebHookfile = "githubwebhook.json";

        ObjectMapper objectMapper = new ObjectMapper();

        Book book = objectMapper.readValue(new File(file), Book.class);
        System.out.println(book);

        Book [] bookArray = objectMapper.readValue(new File(booklist), Book[].class);
        System.out.println(Arrays.asList(bookArray));

        List<Book> bookList = objectMapper
                .readValue(new File(booklist), new TypeReference<>() {});
        System.out.println(bookList);

        Home home = objectMapper.readValue(new File(file2), Home.class);
        System.out.println(home);

        List<Pet> pets = home.getPets();

        for (Pet data: pets) {
            System.out.println(data.getName() + " " + data.getColor());
        }

        home.getPets()
                .forEach((data) -> System.out.println(data.getName() + " " + data.getColor()));


        GitHubWebHook gitHubWebHook = objectMapper.readValue(new File(gitHubWebHookfile), GitHubWebHook.class);
        System.out.println(gitHubWebHook);


    }
}
