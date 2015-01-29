import com.pluralsight.service.CustomerService;
import com.pluralsight.service.CustomerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by daniel.arlitt on 1/27/15.
 */
public class Application {

  public static void main(String[] args) {
//    CustomerService service = new CustomerServiceImpl();

    ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);

    CustomerService service = appContext.getBean("customerService", CustomerService.class);
    System.out.println(service);

    CustomerService service2 = appContext.getBean("customerService", CustomerService.class);
    System.out.println(service2);

    System.out.println(service.findAll().get(0).getFirstname());
    System.out.println(service.findAll().get(0).getLastname());
  }

}
