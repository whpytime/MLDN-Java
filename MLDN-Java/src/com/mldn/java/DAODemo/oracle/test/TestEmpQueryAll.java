package com.mldn.java.DAODemo.oracle.test;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.mldn.java.DAODemo.oracle.factory.ServiceFactory;
import com.mldn.java.DAODemo.oracle.vo.Emp;

public class TestEmpQueryAll {

	public static void main(String[] args) throws Exception {
		Map<String, Object> map = ServiceFactory.getIEmpServiceInstance()
				.findAll("empno", "", 1, 10);// 每页10条记录，只显示第1页
		System.out.println("数据量：" + map.get("allcount"));
		List<Emp> allEmp = (List<Emp>) map.get("allemp");
		Iterator<Emp> iter = allEmp.iterator();
		while (iter.hasNext()) {
			Emp emp = iter.next();
			System.out.println(emp.getEmpno() + ", " + emp.getEname() + ", "
					+ emp.getJob() + ", " + emp.getMgr().getEname() + ", "
					+ emp.getDept().getDname());
		}
	}

}
