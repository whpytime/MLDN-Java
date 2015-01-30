package com.mldn.java.DAODemo.oracle.service;

import java.util.Map;

import com.mldn.java.DAODemo.oracle.vo.Emp;

public interface IEmpService {
	/**
	 * 完成增加雇员的业务
	 * 
	 * @param vo
	 *            包装了数据的vo对象
	 * @return true：表示增加业务完成，false：表示失败
	 * @throws Exception
	 *             中途出现的错误都要交还给被调用处处理
	 */
	public boolean insert(Emp vo) throws Exception;

	/**
	 * 完成更新的业务
	 * 
	 * @param vo
	 *            包装了数据的vo对象
	 * @return true：表示更新业务完成，false：表示失败
	 * @throws Exception
	 *             中途出现的错误都要交还给被调用处处理
	 */
	public boolean update(Emp vo) throws Exception;

	/**
	 * 完成删除的业务
	 * 
	 * @param id
	 *            要删除的数据的id
	 * @return true：表示删除业务完成，false：表示失败
	 * @throws Exception
	 *             中途出现的错误都要交还给被调用处处理
	 */
	public boolean delete(Integer id) throws Exception;

	/**
	 * 根据雇员的编号查询雇员的完整信息
	 * 
	 * @param id
	 *            雇员编号
	 * @return 一个雇员的完整信息，如果没有查到，返回null
	 * @throws Exception
	 *             中途出现的错误都要交还给被调用处处理
	 */
	public Emp find(Integer id) throws Exception;

	/**
	 * 模糊查询，查询全部
	 * 
	 * @param column
	 *            查询的列
	 * @param keyWord
	 *            查询的关键字
	 * @param currentPage
	 *            当前所在页
	 * @param lineSize
	 *            每页显示的长度
	 * @return 返回的是Map数据。因为要返回两种数据：List<Emp>集合、Long数据，
	 *         那么使用Map的好处是将List<Emp>中的数据使用（key = allemp）保存在Map中，
	 *         将Long这个统计数据使用（key = allcount）保存在Map中。
	 * @throws Exception
	 *             中途出现的错误都要交还给被调用处处理
	 */
	public Map<String, Object> findAll(String column, String keyWord,
			Integer currentPage, Integer lineSize) throws Exception;
}
