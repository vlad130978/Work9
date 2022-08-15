public class Book {
    private String name;
    private int year;
    private Autor autor;

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public Autor getAutor() {
        return autor;
    }

    public Book(String name, int year, Autor autor) {
        this.name = name;
        this.year = year;
        this.autor = autor;
    }
}
