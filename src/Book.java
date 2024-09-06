import java.util.Objects;

public class Book {
    private String name;
    private Author author;
    private int yearOfPublication;

    //Конструктор книги
    public Book(String name, Author author, int yearOfPublication) {
        this.name = name;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    // Геттер на название
    public String getName() {
        return this.name;
    }

    // Геттер на год публикации
    public int getYearOfPublication() {
        return this.yearOfPublication;
    }

    // Сеттер на год публикации
    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    // Геттер на автора
    public String getAuthorName() {
        return this.author.getFirstName() + ' ' + this.author.getLastName();
    }

    @Override
    public String toString() {
        return "Книга{" +
                "Название='" + name + '\'' +
                ", " + author.toString() +
                ", Год публикации=" + yearOfPublication +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearOfPublication == book.yearOfPublication && Objects.equals(name, book.name) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author, yearOfPublication);
    }
}
