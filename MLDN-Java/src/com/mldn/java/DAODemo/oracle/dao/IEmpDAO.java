package com.mldn.java.DAODemo.oracle.dao;

import java.util.List;

import com.mldn.java.DAODemo.oracle.vo.Emp;

public interface IEmpDAO {
	/**
	 * �������Ӳ���
	 * 
	 * @param vo
	 *            ��װ����Ҫ���������
	 * @return true:�������ӳɹ�,false:��������ʧ��
	 * @throws Exception
	 *             ����ڲ����г�������,���׳����쳣,���������ô�����
	 */
	public boolean doCreate(Emp vo) throws Exception;

	/**
	 * ����ɾ������
	 * 
	 * @param id
	 *            Ҫɾ�����ݵ�id
	 * @return true:����ɾ���ɹ�,false:����ɾ��ʧ��
	 * @throws Exception
	 *             ����ڲ����г�������,���׳����쳣,���������ô�����
	 */
	public boolean doRemove(Integer id) throws Exception;

	/**
	 * ���ݸ��²���
	 * 
	 * @param vo
	 *            �����µ����ݵ�vo����
	 * @return true:���ݸ��³ɹ�,false:���ݸ���ʧ��
	 * @throws Exception
	 *             ����ڲ����г�������,���׳����쳣,���������ô�����
	 */
	public boolean doUpdate(Emp vo) throws Exception;

	/**
	 * ���ݲ�ѯ����
	 * 
	 * @param id
	 *            Ҫ��ѯ��Ա��id
	 * @return ����һ����Ա��������Ϣ������û�в�ѯ�����򷵻�null
	 * @throws Exception
	 *             ����ڲ����г�������,���׳����쳣,���������ô�����
	 */
	public Emp findById(Integer id) throws Exception;

	/**
	 * ���ݹؼ��ֽ���ģ����ѯ
	 * 
	 * @param column
	 *            ģ����ѯ���ֶ�
	 * @param keyWord
	 *            ģ����ѯ����������
	 * @param currentPage
	 *            ��ǰ���ڵ�ҳ�������ڷ�ҳ�Ŀ���
	 * @param lineSize
	 *            ÿҳ��ʾ�ļ�¼��
	 * @return ���ز�ѯ����һ�����ݣ����û�в�ѯ������List�ӿڵ�size()����0
	 * @throws Exception
	 *             ����ڲ����г�������,���׳����쳣,���������ô�����
	 */
	public List<Emp> findAll(String column, String keyWord,
			Integer currentPage, Integer lineSize) throws Exception;

	/**
	 * ������������ͳ��
	 * 
	 * @param column
	 *            ģ����ѯ���ֶ�
	 * @param keyWord
	 *            ģ����ѯ�Ĺؼ���
	 * @return count()������ͳ�ƽ�������û���򷵻�0
	 * @throws Exception
	 *             ����ڲ����г�������,���׳����쳣,���������ô�����
	 */
	public Long getAllCount(String column, String keyWord) throws Exception;
}
