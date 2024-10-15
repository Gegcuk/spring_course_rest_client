package uk.gegc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import uk.gegc.configuration.MyConfig;
import uk.gegc.entity.Employee;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Communication communication = context.getBean("communication", Communication.class);
        List<Employee> allEmployees = communication.getAllEmployees();
        System.out.println(allEmployees);

        Employee empById = communication.getEmployee(2);
        System.out.println(empById);

//        Employee employee = new Employee("Svetlana", "Sokolova", "IT", 1500);
//        communication.saveEmployee(employee);

//        communication.deleteEmployee(17);
    }
}
