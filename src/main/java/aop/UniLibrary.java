package aop;

import org.springframework.stereotype.Component;

@Component("uniLibraryBean")
public class UniLibrary extends AbstractLibrary {

    public void addBook(String personName, Book book) {
        System.out.println("add book to the unilibrary");
        System.out.println("--------------------------------------------------");
    }

    public void getBook() {
        System.out.println("take book from the uniLibrary");
        System.out.println("--------------------------------------------------");
    }

    public String returnBook() {
        int i = 10 / 0;//exception
        System.out.println("return book to the uniLibrary");
        System.out.println("--------------------------------------------------");
        return "War and Piece";
    }

    public void addMagazine() {
        System.out.println("add book to the uniLibrary");
        System.out.println("--------------------------------------------------");
    }

    public void getMagazine() {
        System.out.println("take magazine from the uniLibrary");
        System.out.println("--------------------------------------------------");
    }

    public void returnMagazine() {
        System.out.println("return magazine to the uniLibrary");
        System.out.println("--------------------------------------------------");
    }

}
