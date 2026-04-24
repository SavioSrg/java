package exercicio_05.model;

public class Book {
    public String title;
    public String author;
    public double price;

    public Book() {
        this.title = "Titulo não registrado";
        this.author = "Autor não cadastrado";
        this.price = 0.0;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.price = 0.0;
    }

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    @Override
    public String toString() {
        return "título: " + title + ", " +
                "autor: " + author + ", " +
                "valor: " + price;
    }
}
