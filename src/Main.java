public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Джером", "Сэлинджер");
        Book book1 = new Book("Над пропастью во ржи", author1, 1951);
        Author author2 = new Author("Дмитрий", "Глуховский");
        Book book2 = new Book("Метро 2033", author2, 2003);
        System.out.println(book1.getAuthorName() + " " + book1.getName() + " " + book1.getYearOfPublication());
        System.out.println(book2.getAuthorName() + " " + book2.getName() + " " + book2.getYearOfPublication());
        book2.setYearOfPublication(2005);
        System.out.println(book2.getAuthorName() + " " + book2.getName() + " " + book2.getYearOfPublication());

    }
}