package com.mldn.java.DAODemo.oracle.factory;

import java.sql.Connection;

import com.mldn.java.DAODemo.oracle.dao.IEmpDAO;
import com.mldn.java.DAODemo.oracle.dao.impl.EmpDAOImpl;

public class DAOFactory {
	public static IEmpDAO getIEmpDAOInstance(Connection conn) {
		return new EmpDAOImpl(conn);
	}
}
