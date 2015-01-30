package com.mldn.java.DAODemo.oracle.test;

import java.util.Date;

import com.mldn.java.DAODemo.oracle.factory.ServiceFactory;
import com.mldn.java.DAODemo.oracle.vo.Emp;

public class TestEmpInsert {

	public static void main(String[] args) throws Exception {
		Emp emp = new Emp();
		emp.setEmpno(8989);
		emp.setEname("уехЩ");
		emp.setJob("CEO");
		emp.setHiredate(new Date());
		emp.setSal(9000.0);
		emp.setComm(0.0);
		System.out.println(ServiceFactory.getIEmpServiceInstance().insert(emp));
	}

}
