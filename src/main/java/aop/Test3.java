package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        System.out.println("method main start");

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        UniLibrary uniLibraty = context.getBean("uniLibraryBean", UniLibrary.class);
        String book = uniLibraty.returnBook();
        System.out.println("book " + book + " was returned to library");

        System.out.println("method main ends");

        context.close();
    }
}
