class Author {
    private String firstName;
    private String lastName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }
}

class Book {
    private String title;
    private Author author;
    private int publicationYear;

    public Book(String title, Author author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public void printInfo() {
        System.out.println("Название: " + title);
        System.out.println("Автор: " + author.getFullName());
        System.out.println("Год публикации: " + publicationYear);
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Лев", "Толстой");
        Author author2 = new Author("Фёдор", "Достоевский");

        Book book1 = new Book("Война и мир", author1, 1869);
        Book book2 = new Book("Преступление и наказание", author2, 1866);

        System.out.println("=== Информация о книгах (до изменений) ===");
        book1.printInfo();
        book2.printInfo();
        book1.setPublicationYear(1873);
        System.out.println("=== Информация о книгах (после изменений) ===");
        book1.printInfo();
        book2.printInfo();
        System.out.println("=== Проверка работы геттеров ===");
        System.out.println("Название первой книги: " + book1.getTitle());
        System.out.println("Автор первой книги: " + book1.getAuthor().getFullName());
        System.out.println("Год публикации первой книги: " + book1.getPublicationYear());

        System.out.println("\nИмя автора второй книги: " + book2.getAuthor().getFirstName());
        System.out.println("Фамилия автора второй книги: " + book2.getAuthor().getLastName());
    }
}