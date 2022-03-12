package aw;
//autowiring byConstructor
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Bmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		A a=context.getBean("a",A.class);
		a.displayA();
	}

}
