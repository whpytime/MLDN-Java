package com.mldn.java.ninetyFive;

import java.sql.*;
import java.util.Date;

import javax.naming.spi.DirStateFactory.Result;

public class JDBCDemo {
	public static final String DBDRIVER = "oracle.jdbc.driver.OracleDriver";
	public static final String DBURL = "jdbc:oracle:thin:@localhost:1521:MLDN";
	public static final String DBUSER = "scott";
	public static final String DBPASSWORD = "tiger";

	public static void main(String[] args) throws Exception {
		int currentPage = 1; // 当前在第1页
		int lineSize = 5; // 每页显示5条记录
		String keyWord = "";
		Connection conn = null; // 数据库连接
		PreparedStatement prst = null; // 定义数据库的操作对象
		Class.forName(DBDRIVER); // 加载驱动程序
		conn = DriverManager.getConnection(DBURL, DBUSER, DBPASSWORD); // 取得数据库连接
		String sql = " select * from ( "
				+ " select mid,name,age,birthday,note,ROWNUM rn "
				+ " from member "
				+ " where (name like ? or age like ?) and ROWNUM<=?) temp "
				+ " where temp.rn>? ";
		prst = conn.prepareStatement(sql);
		prst.setString(1, "%" + keyWord + "%");
		prst.setString(2, "%" + keyWord + "%");
		prst.setInt(3, currentPage * lineSize);
		prst.setInt(4, (currentPage - 1) * lineSize);
		ResultSet rs = prst.executeQuery();
		while (rs.next()) {
			int mid = rs.getInt(1);
			String name = rs.getString(2);
			int age = rs.getInt(3);
			Date birthday = rs.getDate(4);
			String note = rs.getString(5);
			System.out.println(mid + ", " + name + ", " + age + ", " + birthday
					+ ", " + note);
		}
		conn.close();// 关闭数据库连接
	}
}