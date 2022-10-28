package aop;

import aop.AbstractLibrary;
import org.springframework.stereotype.Component;

@Component("schoolLibraryBean")
public class SchoolLibrary extends AbstractLibrary {

    public void getBook() {
        System.out.println("take book from  from the schoolLibrary");
    }

}
