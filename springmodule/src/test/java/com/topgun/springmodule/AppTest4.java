package com.topgun.springmodule;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * Unit test for simple App.
 */
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("classpath:com/topgun/springmodule/container.xml")
public class AppTest4 
{
//	@Autowired
//	Person person;
	   
//	@Test
//	public void testName() throws Exception {
//		person.sayHello();
//	}
	
	@Test
	public void testBeanFactory() throws Exception {
		Resource resource = new ClassPathResource("com/topgun/springmodule/container.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		System.out.println("------- before -----------");
		Object bean = factory.getBean("person");
		System.out.println("------- after -----------");
	}
	
	@Test
	public void testApplicationContext() throws Exception {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/topgun/springmodule/container.xml");
		System.out.println("------- before -----------");
		Object bean = ctx.getBean("person",Person.class);
		System.out.println("------- after -----------");
	}
	
	
}


