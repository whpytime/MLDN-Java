package com.mldn.java.DAODemo.oracle.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.mldn.java.DAODemo.oracle.dao.IEmpDAO;
import com.mldn.java.DAODemo.oracle.vo.Dept;
import com.mldn.java.DAODemo.oracle.vo.Emp;

public class EmpDAOImpl implements IEmpDAO {

	// 错误的实现方式
	// @Override
	// public boolean doCreate(Emp vo) throws Exception {
	// JDBCConnection dbc = new JDBCConnection();
	// String sql =
	// "instert into emp(empno, ename, job, hiredate, sal, comm) values(?,?,?,?,?,?)";
	// PreparedStatement pstmt = dbc.getConnection().prepareStatement(sql);
	// pstmt.setInt(1, vo.getEmpno());
	// pstmt.setString(2, vo.getEname());
	// pstmt.setString(3, vo.getJob());
	// pstmt.setDate(4, new java.sql.Date(vo.getHiredate().getTime()));
	// pstmt.setDouble(5, vo.getSal());
	// pstmt.setDouble(6, vo.getComm());
	// if (pstmt.executeUpdate() > 0) {
	// return true;
	// }
	// return false;
	// }

	private Connection conn = null;
	private PreparedStatement pstmt = null;

	public EmpDAOImpl(Connection conn) {
		this.conn = conn;
	}

	@Override
	public boolean doCreate(Emp vo) throws Exception {
		String sql = " insert into emp(empno, ename, job, hiredate, sal, comm, mgr,deptno) values(?,?,?,?,?,?,?,?)";
		this.pstmt = this.conn.prepareStatement(sql);
		this.pstmt.setInt(1, vo.getEmpno());
		this.pstmt.setString(2, vo.getEname());
		this.pstmt.setString(3, vo.getJob());
		this.pstmt.setDate(4, new java.sql.Date(vo.getHiredate().getTime()));
		this.pstmt.setDouble(5, vo.getSal());
		this.pstmt.setDouble(6, vo.getComm());
		// mgr
		if (vo.getMgr() == null) {// 没有领导
			this.pstmt.setString(7, null);
		} else {// 有领导
			this.pstmt.setInt(7, vo.getMgr().getEmpno());
		}
		// mgr
		// dept
		if (vo.getDept() == null) {// 没有部门
			this.pstmt.setString(8, null);
		} else {
			this.pstmt.setInt(8, vo.getDept().getDeptno());
		}
		// dept
		if (this.pstmt.executeUpdate() > 0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean doRemove(Integer id) throws Exception {
		String sql = " delete from emp where empno=? ";
		this.pstmt = this.conn.prepareStatement(sql);
		this.pstmt.setInt(1, id);
		if (this.pstmt.executeUpdate() > 0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean doUpdate(Emp vo) throws Exception {
		String sql = "update emp set ename=?,job=?,hiredate=?,sal=?,comm=?,mgr=?,deptno=? where empno=?";
		this.pstmt = this.conn.prepareStatement(sql);
		this.pstmt.setString(1, vo.getEname());
		this.pstmt.setString(2, vo.getJob());
		this.pstmt.setDate(3, new java.sql.Date(vo.getHiredate().getTime()));
		this.pstmt.setDouble(4, vo.getSal());
		this.pstmt.setDouble(5, vo.getComm());
		// mgr
		if (vo.getMgr() == null) {// 没有领导
			this.pstmt.setString(6, null);
		} else {// 有领导
			this.pstmt.setInt(6, vo.getMgr().getEmpno());
		}
		// mgr
		// dept
		if (vo.getDept() == null) {// 没有部门
			this.pstmt.setString(7, null);
		} else {
			this.pstmt.setInt(7, vo.getDept().getDeptno());
		}
		// dept
		this.pstmt.setInt(8, vo.getEmpno());
		if (this.pstmt.executeUpdate() > 0) {
			return true;
		}
		return false;
	}

	@Override
	public Emp findById(Integer id) throws Exception {
		Emp emp = null;
		String sql = " select e.empno,e.ename,e.job,e.hiredate,e.sal,e.comm, "
				+ " m.empno mno,m.ename mname,d.deptno dno,d.dname dname,d.loc dloc "
				+ " from emp e, emp m, dept d "
				+ " where empno=? and e.mgr=m.empno(+) and e.deptno=d.deptno ";
		this.pstmt = this.conn.prepareStatement(sql);
		this.pstmt.setInt(1, id);
		ResultSet rs = this.pstmt.executeQuery();
		if (rs.next()) {// 有返回值表示查询到了
			emp = new Emp();// 实例化vo对象，将数据保存在vo之中
			emp.setEmpno(rs.getInt(1));
			emp.setEname(rs.getString(2));
			emp.setJob(rs.getString(3));
			emp.setHiredate(rs.getDate(4));
			emp.setSal(rs.getDouble(5));
			emp.setComm(rs.getDouble(6));
			// mgr
			Emp mgr = new Emp();
			mgr.setEmpno(rs.getInt(7));
			mgr.setEname(rs.getString(8));
			emp.setMgr(mgr);// 设置领导关系
			// mgr
			// dept
			Dept dept = new Dept();
			dept.setDeptno(rs.getInt(9));
			dept.setDname(rs.getString(10));
			dept.setLoc(rs.getString(11));
			emp.setDept(dept);
			// dept
		}
		return emp;
	}

	@Override
	public List<Emp> findAll(String column, String keyWord,
			Integer currentPage, Integer lineSize) throws Exception {
		List<Emp> all = new ArrayList<Emp>();
		String sql = " select * from ( "
				+ " select e.empno,e.ename,e.job,e.hiredate,e.sal,e.comm,m.empno mno, "
				+ " m.ename mname,d.deptno dno,d.dname dname,d.loc dloc,rownum rn "
				+ " from emp e, emp m,dept d "
				+ " where e."
				+ column
				+ " like ? and rownum<=? and e.mgr=m.empno(+) and e.deptno=d.deptno) temp "
				+ " where temp.rn>? ";
		this.pstmt = this.conn.prepareStatement(sql);
		this.pstmt.setString(1, "%" + keyWord + "%");
		this.pstmt.setInt(2, currentPage * lineSize);
		this.pstmt.setInt(3, (currentPage - 1) * lineSize);
		ResultSet rs = this.pstmt.executeQuery();
		while (rs.next()) {
			Emp emp = new Emp();
			emp.setEmpno(rs.getInt(1));
			emp.setEname(rs.getString(2));
			emp.setJob(rs.getString(3));
			emp.setHiredate(rs.getDate(4));
			emp.setSal(rs.getDouble(5));
			emp.setComm(rs.getDouble(6));
			// mgr
			Emp mgr = new Emp();
			mgr.setEmpno(rs.getInt(7));
			mgr.setEname(rs.getString(8));
			emp.setMgr(mgr);// 设置领导关系
			// mgr
			// dept
			Dept dept = new Dept();
			dept.setDeptno(rs.getInt(9));
			dept.setDname(rs.getString(10));
			dept.setLoc(rs.getString(11));
			emp.setDept(dept);
			// dept
			all.add(emp);
		}
		return all;
	}

	@Override
	public Long getAllCount(String column, String keyWord) throws Exception {
		long count = 0;
		String sql = " select count(empno) from emp where " + column
				+ " like ? ";
		this.pstmt = this.conn.prepareStatement(sql);
		this.pstmt.setString(1, "%" + keyWord + "%");
		ResultSet rs = this.pstmt.executeQuery();
		if (rs.next()) {
			count = rs.getLong(1);
		}
		return count;
	}

}
