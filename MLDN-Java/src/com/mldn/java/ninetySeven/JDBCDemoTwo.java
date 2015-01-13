package com.mldn.java.ninetySeven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCDemoTwo {
	public static final String DBDRIVER = "oracle.jdbc.driver.OracleDriver";
	public static final String DBURL = "jdbc:oracle:thin:@localhost:1521:MLDN";
	public static final String DBUSER = "scott";
	public static final String DBPASSWORD = "tiger";

	public static void main(String[] args) throws Exception {
		Connection conn = null; // ���ݿ�����
		Statement stmt = null; // �������ݿ�Ĳ�������
		Class.forName(DBDRIVER); // ������������
		conn = DriverManager.getConnection(DBURL, DBUSER, DBPASSWORD); // ȡ�����ݿ�����
		stmt = conn.createStatement();
		conn.setAutoCommit(false); // ȡ���Զ��ύ
		try {
			stmt.addBatch("insert into member(mid,name) values(member_seq.nextval,'����')");
			stmt.addBatch("insert into member(mid,name) values(member_seq.nextval,'����')");
			stmt.addBatch("insert into member(mid,name) values(member_seq.nextval,'����')");
			stmt.addBatch("insert into member(mid,name) values(member_seq.nextval,'����')");
			stmt.addBatch("insert into member(mid,name) values(member_seq.nextval,'�԰�')");
			conn.commit();// �ύ����
		} catch (Exception e) {
			e.printStackTrace();
			conn.rollback();// �ع�����
		}
		stmt.executeBatch(); // ִ��������
		conn.close();// �ر����ݿ�����
	}

}
