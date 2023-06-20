import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld beanHW =
                (HelloWorld) applicationContext.getBean("helloworld");

        Cat beanC =
                (Cat) applicationContext.getBean("cat");
        Cat beanCat =
                (Cat) applicationContext.getBean("cat");

        System.out.println(bean.equals(beanHW));
        System.out.println(beanC.equals(beanCat));
    }
}