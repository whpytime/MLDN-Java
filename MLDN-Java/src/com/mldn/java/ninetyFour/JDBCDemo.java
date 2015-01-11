package com.mldn.java.ninetyFour;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCDemo {
	public static final String DBDRIVER = "oracle.jdbc.driver.OracleDriver";
	public static final String DBURL = "jdbc:oracle:thin:@localhost:1521:MLDN";
	public static final String DBUSER = "scott";
	public static final String DBPASSWORD = "tiger";

	public static void main(String[] args) throws Exception {
		Connection conn = null; // 数据库连接
		Class.forName(DBDRIVER); // 加载驱动程序
		conn = DriverManager.getConnection(DBURL, DBUSER, DBPASSWORD); // 取得数据库连接
		System.out.println(conn);
		conn.close();// 关闭数据库连接
	}

}
