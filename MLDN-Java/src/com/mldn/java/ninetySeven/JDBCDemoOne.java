package com.mldn.java.ninetySeven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCDemoOne {
	public static final String DBDRIVER = "oracle.jdbc.driver.OracleDriver";
	public static final String DBURL = "jdbc:oracle:thin:@localhost:1521:MLDN";
	public static final String DBUSER = "scott";
	public static final String DBPASSWORD = "tiger";

	public static void main(String[] args) throws Exception {
		Connection conn = null; // 数据库连接
		Statement stmt = null; // 定义数据库的操作对象
		Class.forName(DBDRIVER); // 加载驱动程序
		conn = DriverManager.getConnection(DBURL, DBUSER, DBPASSWORD); // 取得数据库连接
		stmt = conn.createStatement();
		stmt.addBatch("insert into member(mid,name) values(member_seq.nextval,'张三')");
		stmt.addBatch("insert into member(mid,name) values(member_seq.nextval,'李四')");
		stmt.addBatch("insert into member(mid,name) values(member_seq.nextval,'王五')");
		stmt.addBatch("insert into member(mid,name) values(member_seq.nextval,'孙琦')");
		stmt.addBatch("insert into member(mid,name) values(member_seq.nextval,'赵八')");
		stmt.executeBatch();	//执行批处理
		conn.close();// 关闭数据库连接
	}
}
