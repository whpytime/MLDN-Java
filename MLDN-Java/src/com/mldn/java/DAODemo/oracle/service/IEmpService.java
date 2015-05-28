package com.mldn.java.DAODemo.oracle.service;

import java.util.Map;

import com.mldn.java.DAODemo.oracle.vo.Emp;

public interface IEmpService {
	/**
	 * ������ӹ�Ա��ҵ��
	 * 
	 * @param vo
	 *            ��װ�����ݵ�vo����
	 * @return true����ʾ����ҵ����ɣ�false����ʾʧ��
	 * @throws Exception
	 *             ��;���ֵĴ���Ҫ�����������ô�����
	 */
	public boolean insert(Emp vo) throws Exception;

	/**
	 * ��ɸ��µ�ҵ��
	 * 
	 * @param vo
	 *            ��װ�����ݵ�vo����
	 * @return true����ʾ����ҵ����ɣ�false����ʾʧ��
	 * @throws Exception
	 *             ��;���ֵĴ���Ҫ�����������ô�����
	 */
	public boolean update(Emp vo) throws Exception;

	/**
	 * ���ɾ����ҵ��
	 * 
	 * @param id
	 *            Ҫɾ�������ݵ�id
	 * @return true����ʾɾ��ҵ����ɣ�false����ʾʧ��
	 * @throws Exception
	 *             ��;���ֵĴ���Ҫ�����������ô�����
	 */
	public boolean delete(Integer id) throws Exception;

	/**
	 * ���ݹ�Ա�ı�Ų�ѯ��Ա��������Ϣ
	 * 
	 * @param id
	 *            ��Ա���
	 * @return һ����Ա��������Ϣ�����û�в鵽������null
	 * @throws Exception
	 *             ��;���ֵĴ���Ҫ�����������ô�����
	 */
	public Emp find(Integer id) throws Exception;

	/**
	 * ģ����ѯ����ѯȫ��
	 * 
	 * @param column
	 *            ��ѯ����
	 * @param keyWord
	 *            ��ѯ�Ĺؼ���
	 * @param currentPage
	 *            ��ǰ����ҳ
	 * @param lineSize
	 *            ÿҳ��ʾ�ĳ���
	 * @return ���ص���Map���ݡ���ΪҪ�����������ݣ�List<Emp>���ϡ�Long���ݣ�
	 *         ��ôʹ��Map�ĺô��ǽ�List<Emp>�е�����ʹ�ã�key = allemp��������Map�У�
	 *         ��Long���ͳ������ʹ�ã�key = allcount��������Map�С�
	 * @throws Exception
	 *             ��;���ֵĴ���Ҫ�����������ô�����
	 */
	public Map<String, Object> findAll(String column, String keyWord,
			Integer currentPage, Integer lineSize) throws Exception;
}
