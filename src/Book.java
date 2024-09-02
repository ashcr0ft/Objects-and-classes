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
}
