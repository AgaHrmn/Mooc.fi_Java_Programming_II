
public class Book {

    String name;
    int age;

    public Book(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String toString() {
        return this.name + "(recommended for " + this.age +" year-olds or older)";
    }
    
//    @Override
//    public int compareTo(Book b) {
//        return this.getAge() - b.getAge();
//    }
}
