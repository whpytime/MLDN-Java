package com.mldn.java.DAODemo.oracle.dao;

import java.util.List;

import com.mldn.java.DAODemo.oracle.vo.Emp;

public interface IEmpDAO {
	/**
	 * 数据增加操作
	 * 
	 * @param vo
	 *            包装所有要保存的数据
	 * @return true:数据增加成功,false:数据增加失败
	 * @throws Exception
	 *             如果在操作中出现问题,则抛出此异常,交给被调用处处理
	 */
	public boolean doCreate(Emp vo) throws Exception;

	/**
	 * 数据删除操作
	 * 
	 * @param id
	 *            要删除数据的id
	 * @return true:数据删除成功,false:数据删除失败
	 * @throws Exception
	 *             如果在操作中出现问题,则抛出此异常,交给被调用处处理
	 */
	public boolean doRemove(Integer id) throws Exception;

	/**
	 * 数据更新操作
	 * 
	 * @param vo
	 *            包裹新的数据的vo对象
	 * @return true:数据更新成功,false:数据更新失败
	 * @throws Exception
	 *             如果在操作中出现问题,则抛出此异常,交给被调用处处理
	 */
	public boolean doUpdate(Emp vo) throws Exception;

	/**
	 * 数据查询操作
	 * 
	 * @param id
	 *            要查询雇员的id
	 * @return 返回一个雇员的完整信息，弱国没有查询到，则返回null
	 * @throws Exception
	 *             如果在操作中出现问题,则抛出此异常,交给被调用处处理
	 */
	public Emp findById(Integer id) throws Exception;

	/**
	 * 根据关键字进行模糊查询
	 * 
	 * @param column
	 *            模糊查询的字段
	 * @param keyWord
	 *            模糊查询的数据配置
	 * @param currentPage
	 *            当前所在的页数，用于分页的控制
	 * @param lineSize
	 *            每页显示的记录数
	 * @return 返回查询到的一组数据，如果没有查询到，则List接口的size()返回0
	 * @throws Exception
	 *             如果在操作中出现问题,则抛出此异常,交给被调用处处理
	 */
	public List<Emp> findAll(String column, String keyWord,
			Integer currentPage, Integer lineSize) throws Exception;

	/**
	 * 进行数据量的统计
	 * 
	 * @param column
	 *            模糊查询的字段
	 * @param keyWord
	 *            模糊查询的关键字
	 * @return count()函数的统计结果，如果没有则返回0
	 * @throws Exception
	 *             如果在操作中出现问题,则抛出此异常,交给被调用处处理
	 */
	public Long getAllCount(String column, String keyWord) throws Exception;
}
