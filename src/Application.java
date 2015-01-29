import com.pluralsight.service.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by daniel.arlitt on 1/27/15.
 */
public class Application {

  public static void main(String[] args) {
//    CustomerService service = new CustomerServiceImpl();

    ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");

    CustomerService service = appContext.getBean("customerService", CustomerService.class);

    System.out.println(service.findAll().get(0).getFirstname());

  }

}
