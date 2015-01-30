package com.mldn.java.DAODemo.oracle.service.impl;

import java.util.HashMap;
import java.util.Map;

import com.mldn.java.DAODemo.oracle.dbc.JDBCConnection;
import com.mldn.java.DAODemo.oracle.factory.DAOFactory;
import com.mldn.java.DAODemo.oracle.service.IEmpService;
import com.mldn.java.DAODemo.oracle.vo.Emp;

public class EmpServiceImpl implements IEmpService {
	private JDBCConnection dbc = new JDBCConnection();

	@Override
	public boolean insert(Emp vo) throws Exception {
		try {
			if (DAOFactory.getIEmpDAOInstance(this.dbc.getConnection())
					.findById(vo.getEmpno()) == null) {// 没有找到数据
				return DAOFactory.getIEmpDAOInstance(this.dbc.getConnection())
						.doCreate(vo);
			}
		} catch (Exception e) {
			throw e;
		} finally {
			this.dbc.close();
		}
		return false;
	}

	@Override
	public boolean update(Emp vo) throws Exception {
		try {
			return DAOFactory.getIEmpDAOInstance(this.dbc.getConnection())
					.doUpdate(vo);
		} catch (Exception e) {
			throw e;
		} finally {
			this.dbc.close();
		}
	}

	@Override
	public boolean delete(Integer id) throws Exception {
		try {
			return DAOFactory.getIEmpDAOInstance(this.dbc.getConnection())
					.doRemove(id);
		} catch (Exception e) {
			throw e;
		} finally {
			this.dbc.close();
		}
	}

	@Override
	public Emp find(Integer id) throws Exception {
		try {
			return DAOFactory.getIEmpDAOInstance(this.dbc.getConnection())
					.findById(id);
		} catch (Exception e) {
			throw e;
		} finally {
			this.dbc.close();
		}
	}

	@Override
	public Map<String, Object> findAll(String column, String keyWord,
			Integer currentPage, Integer lineSize) throws Exception {
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			map.put("allemp",
					DAOFactory.getIEmpDAOInstance(this.dbc.getConnection())
							.findAll(column, keyWord, currentPage, lineSize));
			map.put("allcount",
					DAOFactory.getIEmpDAOInstance(this.dbc.getConnection())
							.getAllCount(column, keyWord));
		} catch (Exception e) {
			throw e;
		} finally {
			this.dbc.close();
		}
		return map;
	}

}
