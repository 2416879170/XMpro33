package com.gotop.reportjbpm.dao.impl;

import java.util.List;
import java.util.Map;

import com.gotop.reportjbpm.dao.ITimeLimitConditionReportDao;
import com.gotop.reportjbpm.model.TimeLimitConditionReport;
import com.gotop.util.dataSource.SqlMapClientDao;
import com.primeton.utils.Page;

public class TimeLimitConditionReportDao extends SqlMapClientDao implements ITimeLimitConditionReportDao {

	@Override
	public List<TimeLimitConditionReport> queryTimeLimitConditionReportList(
			Map<String, Object> map, Page page) {
		return this.queryForList("T_TIMELIMITCONDITIONREPORT_SqlMap.queryTimeLimitConditionReportList", map,page);
	}

	@Override
	public List<TimeLimitConditionReport> queryTimeLimitConditionReportListForExcel(
			Map<String, Object> map) {
		return this.queryForList("T_TIMELIMITCONDITIONREPORT_SqlMap.queryTimeLimitConditionReportList", map);
	}

	@Override
	public List yesOrNot_dep(String orgcode) {
		return this.queryForList("T_LOANRATEFLOATREPORT_SqlMap.yesOrNot_dep", orgcode);
	}

	@Override
	public Object queryReportUpdatetime() {
		Object object = queryForObject("T_TIMELIMITCONDITIONREPORT_SqlMap.queryReportUpdatetime");
		return  object;
	}

	

}
