package rvt;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Book implements Packable {
    private String author;
    private String bookName;
    private Double weight;

    public Book (String author, String bookName, Double weight){
        this.author = author;
        this.bookName = bookName;
        this.weight = weight;
    }

    @Override
    public double weight() {
        return this.weight;
    }

    public String toString() {
        return this.author + " - " + this.bookName;
    }
}
