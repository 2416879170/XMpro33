package com.gotop.tyjg.workgroup.dao.impl;

import java.util.HashMap;
import java.util.List;

import org.apache.log4j.Logger;

import com.gotop.tyjg.stable.model.OmGroup;
import com.gotop.tyjg.workgroup.dao.IGroupmanagerDAO;
import com.gotop.util.dataSource.SqlMapClientDao;
import com.primeton.utils.Page;

/**
* 查询一级工作组
*/
public class GroupmanagerDAO extends SqlMapClientDao implements IGroupmanagerDAO {
    /**
	 * @abatorgenerated
	 */
	protected Logger log = Logger.getLogger(GroupmanagerDAO.class);

	/**
	 * 通过Map方式的查询返回Bean，查询记录不分页
	 * @abatorgenerated
	 */
	public OmGroup querySGroupBeanByMap(HashMap map) throws Exception {
		OmGroup list = (OmGroup)this.queryForObject("Groupmanager_SqlMap.querySGroupBeanByMap",map);
		return list;
	}

	/**
	 * 通过Map方式的查询返回Bean，查询分页数据
	 * @abatorgenerated
	 */
	public List manageGroupEmpBeanByMapAndPage(HashMap map, Page page) {
		List list = queryForList(
				"Groupmanager_SqlMap.manageGroupEmpBeanByMapAndPage", map, page);
		return list;
	}

	/**
	 * 通过Map方式的查询返回Bean，查询分页数据
	 * @abatorgenerated
	 */
	public List manageGroupRoleBeanByMapAndPage(HashMap map, Page page) {
		List list = queryForList(
				"Groupmanager_SqlMap.manageGroupRoleBeanByMapAndPage", map,
				page);
		return list;
	}

	/**
	 * 通过Map方式的查询返回Bean，查询分页数据
	 * @abatorgenerated
	 */
	public List managePositionRoleBeanByMapAndPage(HashMap map, Page page) {
		List list = queryForList(
				"Groupmanager_SqlMap.managePositionRoleBeanByMapAndPage", map,
				page);
		return list;
	}

	/**
	 * 通过Map方式的查询返回Bean，查询分页数据
	 * @abatorgenerated
	 */
	public List queryPositionEmpBeanByMapAndPage(HashMap map, Page page) {
		List list = queryForList(
				"Groupmanager_SqlMap.queryPositionEmpBeanByMapAndPage", map,
				page);
		return list;
	}

	/**
	 * 通过Map方式的查询返回Bean，查询分页数据
	 * @abatorgenerated
	 */
	public List queryGroupEmpOrgBeanByMapAndPage(HashMap map, Page page) {
		List list = queryForList(
				"Groupmanager_SqlMap.queryGroupEmpOrgBeanByMapAndPage", map,
				page);
		return list;
	}

	/**
	 * 通过Map方式的查询返回Bean，查询分页数据
	 * @abatorgenerated
	 */
	public List queryGroupPosiBeanByMapAndPage(HashMap map, Page page) {
		List list = queryForList(
				"Groupmanager_SqlMap.queryGroupPosiBeanByMapAndPage", map, page);
		return list;
	}

	/**
	 * 通过Map方式的查询返回Bean，查询分页数据
	 * @abatorgenerated
	 */
	public List updateSelfGroupBeanByMapAndPage(HashMap map, Page page) {
		List list = queryForList(
				"Groupmanager_SqlMap.updateSelfGroupBeanByMapAndPage", map,
				page);
		return list;
	}

	/**
	 * 通过Map方式的查询返回Bean，查询分页数据
	 * @abatorgenerated
	 */
	public List queryGroupBeanByMapAndPage(HashMap map, Page page) {
		List list = queryForList(
				"Groupmanager_SqlMap.queryGroupBeanByMapAndPage", map, page);
		return list;
	}

	/**
	 * 通过Map方式的查询返回Bean，查询记录不分页
	 * @abatorgenerated
	 */
	public List queryGroupMemberByEmpBeanByMap(HashMap map) throws Exception {
		List list = queryForList(
				"Groupmanager_SqlMap.queryGroupMemberByEmpBeanByMap", map);
		return list;
	}

	/**
	 * 通过Map方式的查询返回Bean，查询记录不分页
	 * @abatorgenerated
	 */
	public List queryGroupMemberByRoleBeanByMap(HashMap map) throws Exception {
		List list = queryForList(
				"Groupmanager_SqlMap.queryGroupMemberByRoleBeanByMap", map);
		return list;
	}

	/**
	 * 通过Map方式的查询返回Bean，查询分页数据
	 * @abatorgenerated
	 */
	public List queryGroupMemberByOrgBeanByMapAndPage(HashMap map) {
		List list = queryForList(
				"Groupmanager_SqlMap.queryGroupMemberByOrgBeanByMapAndPage", map);
		return list;
	}

	/**
	 * 通过Map方式的查询返回Bean，查询记录不分页
	 * @abatorgenerated
	 */
	public List queryGroupPositionEmpByParentBeanByMap(HashMap map)
			throws Exception {
		List list = queryForList(
				"Groupmanager_SqlMap.queryGroupPositionEmpByParentBeanByMap",
				map);
		return list;
	}

	/**
	 * 通过Map方式的查询返回Bean，查询记录不分页
	 * @abatorgenerated
	 */
	public List queryRootGroupBeanByMap(HashMap map) throws Exception {
		List list = queryForList("Groupmanager_SqlMap.queryRootGroupBeanByMap",
				map);
		return list;
	}

	/**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table GroupManager
     *
     * @abatorgenerated 
     */
    public GroupmanagerDAO() {
        super();
    }

    /**
     * 通过Map方式的查询返回Bean，查询分页数据
     * @abatorgenerated
     */
    public List queryRootGroupTypeBeanByMapAndPage(HashMap map, Page page) {
        List list = queryForList("Groupmanager_SqlMap.queryRootGroupTypeBeanByMapAndPage",map,page);
        return list;
    }
    /**
     * 使用范围人员
     * @param groupid
     * @return empname
     *         empid
     */
    public List<HashMap> queryEmpOfOmGrouprange(Long groupid){
    	List<HashMap> list = queryForList("Groupmanager_SqlMap.queryEmpOfOmGrouprange", groupid);
        return list;
    }
    
    /**
     * 使用范围机构
     * @param groupid
     * @return orgname
     *         orgid
     */
    public List<HashMap> queryOrgOfOmGrouprange(Long groupid){
    	List<HashMap> list = queryForList("Groupmanager_SqlMap.queryOrgOfOmGrouprange", groupid);
        return list;
    }
    /**
     * 使用范围角色
     * @param groupid
     * @return rolename
     *         roleid
     */
    public List<HashMap> queryRoleOfOmGrouprange(Long groupid){
    	List<HashMap> list = queryForList("Groupmanager_SqlMap.queryRoleOfOmGrouprange", groupid);
        return list;
    }
}