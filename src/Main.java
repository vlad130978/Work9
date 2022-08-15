public class Main {
    public static void main(String[] args) {
        Autor autor1 = new Autor("Name1", "LastName1");
        Autor autor2 = new Autor("Name2", "LastName2");

        Book book1 = new Book("Title1", 2021, autor1);
        Book book2 = new Book("Title2", 2020, autor2);
        System.out.println("Имя автора "+ autor1.getName());
        System.out.println("Фамилия автора "+ autor1.getLastName());
        System.out.println("Название книги "+ book1.getName()+" Год "+ book1.getYear()+" Автор " + book1.getAutor().getLastName());
        System.out.println("Название книги "+ book2.getName()+" Год "+ book2.getYear()+" Автор " + book2.getAutor().getLastName());
        System.out.println();

    }
}