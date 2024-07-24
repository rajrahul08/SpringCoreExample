package org.sjm.project.springcore.main;

import org.sjm.project.springcore.example.Employee;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ClassPathResource;

public class Main {

	public static void main(String args[]) {
		Resource resource = new ClassPathResource("bean.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		
		Employee emp = (Employee) factory.getBean("employee");
		emp.setAge(32);
		emp.setEmployeeName("Reena");
		emp.setDepartment("Testing");
		emp.setEmployeeId(1550882);
		emp.setSalary(45000f);
		
		System.out.println("Spring Managed Bean");
		System.out.println(emp);
	}
}
