package com.mldn.java.DAODemo.oracle.factory;

import com.mldn.java.DAODemo.oracle.service.IEmpService;
import com.mldn.java.DAODemo.oracle.service.impl.EmpServiceImpl;

public class ServiceFactory {
	public static IEmpService getIEmpServiceInstance() {
		return new EmpServiceImpl();
	}

}
