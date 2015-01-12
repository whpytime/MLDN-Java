package com.mldn.java.ninetyFive;

import java.sql.*;

import javax.naming.spi.DirStateFactory.Result;

public class JDBCDemo {
	public static final String DBDRIVER = "oracle.jdbc.driver.OracleDriver";
	public static final String DBURL = "jdbc:oracle:thin:@localhost:1521:MLDN";
	public static final String DBUSER = "scott";
	public static final String DBPASSWORD = "tiger";

	public static void main(String[] args) throws Exception {
		Connection conn = null; // ���ݿ�����
		Statement stat = null; // �������ݿ�Ĳ�������
		Class.forName(DBDRIVER); // ������������
		conn = DriverManager.getConnection(DBURL, DBUSER, DBPASSWORD); // ȡ�����ݿ�����
		stat = conn.createStatement(); // ����Statement�ӿڶ���
		String sql = "select mid,name,age,birthday,note from member";
		ResultSet rs = stat.executeQuery(sql); // ִ�в�ѯ
		while (rs.next()) { // ָ�������ƶ��������ж��Ƿ�������
			int mid = rs.getInt(1);
			String name = rs.getString(2);
			int age = rs.getInt(3);
			Date birthday = rs.getDate(4);
			String note = rs.getString(5);
			System.out.println(mid + ", " + name + ", " + age + ", " + birthday
					+ ", " + note);
		}
		rs.close();
		stat.close(); // �ȹرսӿ�
		conn.close();// �ر����ݿ�����
	}
}