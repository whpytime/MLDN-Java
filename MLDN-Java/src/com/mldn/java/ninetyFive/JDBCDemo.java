package com.mldn.java.ninetyFive;

import java.sql.*;

import javax.naming.spi.DirStateFactory.Result;

public class JDBCDemo {
	public static final String DBDRIVER = "oracle.jdbc.driver.OracleDriver";
	public static final String DBURL = "jdbc:oracle:thin:@localhost:1521:MLDN";
	public static final String DBUSER = "scott";
	public static final String DBPASSWORD = "tiger";

	public static void main(String[] args) throws Exception {
		Connection conn = null; // 数据库连接
		Statement stat = null; // 定义数据库的操作对象
		Class.forName(DBDRIVER); // 加载驱动程序
		conn = DriverManager.getConnection(DBURL, DBUSER, DBPASSWORD); // 取得数据库连接
		stat = conn.createStatement(); // 创建Statement接口对象
		String sql = "select mid,name,age,birthday,note from member";
		ResultSet rs = stat.executeQuery(sql); // 执行查询
		while (rs.next()) { // 指针向下移动，并且判断是否有数据
			int mid = rs.getInt(1);
			String name = rs.getString(2);
			int age = rs.getInt(3);
			Date birthday = rs.getDate(4);
			String note = rs.getString(5);
			System.out.println(mid + ", " + name + ", " + age + ", " + birthday
					+ ", " + note);
		}
		rs.close();
		stat.close(); // 先关闭接口
		conn.close();// 关闭数据库连接
	}
}