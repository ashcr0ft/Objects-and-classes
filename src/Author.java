public class Author {
    private String firstName;
    private String lastName;

    //Конструктор Автора
    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //Геттер на Имя
    public String getFirstName() {
        return this.firstName;
    }

    //Геттер на Фамилию
    public String getLastName() {
        return this.lastName;
    }

}
