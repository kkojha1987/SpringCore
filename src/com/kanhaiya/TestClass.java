package com.kanhaiya;


import java.util.List;
import java.util.Set;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kanhaiya.bean.Employee;
import com.kanhaiya.bean.OrgInfo;

public class TestClass {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
		OrgInfo org = context.getBean("orgInfo", OrgInfo.class);
		String [] strArr=org.getNameArr();
		
		for(String str: strArr)
		{
			System.out.println(str);
		}
		System.out.println("List--------------");
		
		List<String> listData=org.getEmployeeNamelist();
		for(String str: listData)
		{
			System.out.println(str);
		}
		System.out.println("Set--------------");
		Set<Integer> setData=org.getEmpIdsSet();
		for(Integer intdata: setData)
		{
			System.out.println(intdata);
		}
		context.close();
	}

}
