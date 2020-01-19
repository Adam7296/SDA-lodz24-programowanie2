package pl.sda.academy.intermediate.basic.Basic8Files_Streams;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
@Builder

public class Book {

    private String title;
    private String author;
    private int yearsPublished;
    private int numberOfPages;
    private double price;


}
