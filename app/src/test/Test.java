package test;

import java.util.List;

import mapper.AppCategoryMapper;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import entity.AppCategory;
import service.AppCategoryService;


public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		AppCategoryService service=(AppCategoryService)context.getBean("appCategoryService");
		List<AppCategory> list=service.getAll();
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i).getCategoryName());
		}
	} 

}
