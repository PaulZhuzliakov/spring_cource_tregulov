package spring_introduction;

import org.springframework.context.annotation.*;

@Configuration
//@ComponentScan("spring_introduction")
@PropertySource("classpath:application.properties")
public class MyConfig {

    @Bean
    @Scope("prototype")
    public Pet catBean() {
            return new Cat();
    }

    @Bean
    @Scope("singleton")
    public Person personBean() {
        return new Person(catBean());
    }

}
