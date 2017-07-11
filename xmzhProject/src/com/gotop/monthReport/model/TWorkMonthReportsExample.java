package com.gotop.monthReport.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.log4j.Logger;

public class TWorkMonthReportsExample {
    /**
     * 
     * @abatorgenerated
     */
    protected Logger log = Logger.getLogger(TWorkMonthReportsExample.class);

    /**
     * 排序字段.
     * @abatorgenerated
     */
    protected String orderByClause;

    /**
     * sql条件.
     * @abatorgenerated
     */
    protected List oredCriteria;

    /**
     * 分页查询的起始行数.
     * @abatorgenerated
     */
    private Integer oracleStart;

    /**
     * 分页查询结束行数.
     * @abatorgenerated
     */
    private Integer oracleEnd;

    /** * @abatorgenerated  */
    public TWorkMonthReportsExample() {
        oredCriteria = new ArrayList();
    }

    /** * @abatorgenerated  */
    protected TWorkMonthReportsExample(TWorkMonthReportsExample example) {
        this.orderByClause = example.orderByClause;
        this.oredCriteria = example.oredCriteria;
        this.oracleStart = example.oracleStart;
        this.oracleEnd = example.oracleEnd;
    }

    /** * @abatorgenerated  */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /** * @abatorgenerated  */
    /** * @abatorgenerated  */
    public String getOrderByClause() {
        return orderByClause;
    }

    /** * @abatorgenerated  */
    public List getOredCriteria() {
        return oredCriteria;
    }

    /** * @abatorgenerated  */
    public Integer getOracleStart() {
        return oracleStart;
    }

    /** * @abatorgenerated  */
    public void setOracleStart(Integer oracleStart) {
        this.oracleStart = oracleStart;
    }

    /** * @abatorgenerated  */
    public Integer getOracleEnd() {
        return oracleEnd;
    }

    /** * @abatorgenerated  */
    public void setOracleEnd(Integer oracleEnd) {
        this.oracleEnd = oracleEnd;
    }

    /**
     * 增加整个新查询条件(Criteria)，增加后以or方式查询.
     * @abatorgenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * 创新新Criteria，如果为第一个则加入到Criteria列表。并且返回
     * @abatorgenerated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * 仅创新新Criteria,并且返回
     * @abatorgenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * 清除查询条件
     * @abatorgenerated
     */
    public void clear() {
        oredCriteria.clear();
    }

    /**
     * This class was generated by Abator for iBATIS.
     * This class corresponds to the database table T_WORK_MONTH_REPORTS
     *
     * @abatorgenerated 
     */
    public static class Criteria {
        protected List criteriaWithoutValue;

        protected List criteriaWithSingleValue;

        protected List criteriaWithListValue;

        protected List criteriaWithBetweenValue;

        protected Criteria() {
            super();
            criteriaWithoutValue = new ArrayList();
            criteriaWithSingleValue = new ArrayList();
            criteriaWithListValue = new ArrayList();
            criteriaWithBetweenValue = new ArrayList();
        }

        public boolean isValid() {
            return criteriaWithoutValue.size() > 0
                || criteriaWithSingleValue.size() > 0
                || criteriaWithListValue.size() > 0
                || criteriaWithBetweenValue.size() > 0;
        }

        public List getCriteriaWithoutValue() {
            return criteriaWithoutValue;
        }

        public List getCriteriaWithSingleValue() {
            return criteriaWithSingleValue;
        }

        public List getCriteriaWithListValue() {
            return criteriaWithListValue;
        }

        public List getCriteriaWithBetweenValue() {
            return criteriaWithBetweenValue;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteriaWithoutValue.add(condition);
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            Map map = new HashMap();
            map.put("condition", condition);
            map.put("value", value);
            criteriaWithSingleValue.add(map);
        }

        protected void addCriterion(String condition, List values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            Map map = new HashMap();
            map.put("condition", condition);
            map.put("values", values);
            criteriaWithListValue.add(map);
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            List list = new ArrayList();
            list.add(value1);
            list.add(value2);
            Map map = new HashMap();
            map.put("condition", condition);
            map.put("values", list);
            criteriaWithBetweenValue.add(map);
        }

        public Criteria andReportIdIsNull() {
            addCriterion("REPORT_ID is null");
            return this;
        }

        public Criteria andReportIdIsNotNull() {
            addCriterion("REPORT_ID is not null");
            return this;
        }

        public Criteria andReportIdEqualTo(Long value) {
            addCriterion("REPORT_ID =", value, "reportId");
            return this;
        }

        public Criteria andReportIdNotEqualTo(Long value) {
            addCriterion("REPORT_ID <>", value, "reportId");
            return this;
        }

        public Criteria andReportIdGreaterThan(Long value) {
            addCriterion("REPORT_ID >", value, "reportId");
            return this;
        }

        public Criteria andReportIdGreaterThanOrEqualTo(Long value) {
            addCriterion("REPORT_ID >=", value, "reportId");
            return this;
        }

        public Criteria andReportIdLessThan(Long value) {
            addCriterion("REPORT_ID <", value, "reportId");
            return this;
        }

        public Criteria andReportIdLessThanOrEqualTo(Long value) {
            addCriterion("REPORT_ID <=", value, "reportId");
            return this;
        }

        public Criteria andReportIdIn(List values) {
            addCriterion("REPORT_ID in", values, "reportId");
            return this;
        }

        public Criteria andReportIdNotIn(List values) {
            addCriterion("REPORT_ID not in", values, "reportId");
            return this;
        }

        public Criteria andReportIdBetween(Long value1, Long value2) {
            addCriterion("REPORT_ID between", value1, value2, "reportId");
            return this;
        }

        public Criteria andReportIdNotBetween(Long value1, Long value2) {
            addCriterion("REPORT_ID not between", value1, value2, "reportId");
            return this;
        }

        public Criteria andFlowIdIsNull() {
            addCriterion("FLOW_ID is null");
            return this;
        }

        public Criteria andFlowIdIsNotNull() {
            addCriterion("FLOW_ID is not null");
            return this;
        }

        public Criteria andFlowIdEqualTo(String value) {
            addCriterion("FLOW_ID =", value, "flowId");
            return this;
        }

        public Criteria andFlowIdNotEqualTo(String value) {
            addCriterion("FLOW_ID <>", value, "flowId");
            return this;
        }

        public Criteria andFlowIdGreaterThan(String value) {
            addCriterion("FLOW_ID >", value, "flowId");
            return this;
        }

        public Criteria andFlowIdGreaterThanOrEqualTo(String value) {
            addCriterion("FLOW_ID >=", value, "flowId");
            return this;
        }

        public Criteria andFlowIdLessThan(String value) {
            addCriterion("FLOW_ID <", value, "flowId");
            return this;
        }

        public Criteria andFlowIdLessThanOrEqualTo(String value) {
            addCriterion("FLOW_ID <=", value, "flowId");
            return this;
        }

        public Criteria andFlowIdLike(String value) {
            addCriterion("FLOW_ID like", value, "flowId");
            return this;
        }

        public Criteria andFlowIdNotLike(String value) {
            addCriterion("FLOW_ID not like", value, "flowId");
            return this;
        }

        public Criteria andFlowIdIn(List values) {
            addCriterion("FLOW_ID in", values, "flowId");
            return this;
        }

        public Criteria andFlowIdNotIn(List values) {
            addCriterion("FLOW_ID not in", values, "flowId");
            return this;
        }

        public Criteria andFlowIdBetween(String value1, String value2) {
            addCriterion("FLOW_ID between", value1, value2, "flowId");
            return this;
        }

        public Criteria andFlowIdNotBetween(String value1, String value2) {
            addCriterion("FLOW_ID not between", value1, value2, "flowId");
            return this;
        }

        public Criteria andReportTitleIsNull() {
            addCriterion("REPORT_TITLE is null");
            return this;
        }

        public Criteria andReportTitleIsNotNull() {
            addCriterion("REPORT_TITLE is not null");
            return this;
        }

        public Criteria andReportTitleEqualTo(String value) {
            addCriterion("REPORT_TITLE =", value, "reportTitle");
            return this;
        }

        public Criteria andReportTitleNotEqualTo(String value) {
            addCriterion("REPORT_TITLE <>", value, "reportTitle");
            return this;
        }

        public Criteria andReportTitleGreaterThan(String value) {
            addCriterion("REPORT_TITLE >", value, "reportTitle");
            return this;
        }

        public Criteria andReportTitleGreaterThanOrEqualTo(String value) {
            addCriterion("REPORT_TITLE >=", value, "reportTitle");
            return this;
        }

        public Criteria andReportTitleLessThan(String value) {
            addCriterion("REPORT_TITLE <", value, "reportTitle");
            return this;
        }

        public Criteria andReportTitleLessThanOrEqualTo(String value) {
            addCriterion("REPORT_TITLE <=", value, "reportTitle");
            return this;
        }

        public Criteria andReportTitleLike(String value) {
            addCriterion("REPORT_TITLE like", value, "reportTitle");
            return this;
        }

        public Criteria andReportTitleNotLike(String value) {
            addCriterion("REPORT_TITLE not like", value, "reportTitle");
            return this;
        }

        public Criteria andReportTitleIn(List values) {
            addCriterion("REPORT_TITLE in", values, "reportTitle");
            return this;
        }

        public Criteria andReportTitleNotIn(List values) {
            addCriterion("REPORT_TITLE not in", values, "reportTitle");
            return this;
        }

        public Criteria andReportTitleBetween(String value1, String value2) {
            addCriterion("REPORT_TITLE between", value1, value2, "reportTitle");
            return this;
        }

        public Criteria andReportTitleNotBetween(String value1, String value2) {
            addCriterion("REPORT_TITLE not between", value1, value2, "reportTitle");
            return this;
        }

        public Criteria andContentIsNull() {
            addCriterion("CONTENT is null");
            return this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("CONTENT is not null");
            return this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("CONTENT =", value, "content");
            return this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("CONTENT <>", value, "content");
            return this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("CONTENT >", value, "content");
            return this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("CONTENT >=", value, "content");
            return this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("CONTENT <", value, "content");
            return this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("CONTENT <=", value, "content");
            return this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("CONTENT like", value, "content");
            return this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("CONTENT not like", value, "content");
            return this;
        }

        public Criteria andContentIn(List values) {
            addCriterion("CONTENT in", values, "content");
            return this;
        }

        public Criteria andContentNotIn(List values) {
            addCriterion("CONTENT not in", values, "content");
            return this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("CONTENT between", value1, value2, "content");
            return this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("CONTENT not between", value1, value2, "content");
            return this;
        }

        public Criteria andCreatorIsNull() {
            addCriterion("CREATOR is null");
            return this;
        }

        public Criteria andCreatorIsNotNull() {
            addCriterion("CREATOR is not null");
            return this;
        }

        public Criteria andCreatorEqualTo(String value) {
            addCriterion("CREATOR =", value, "creator");
            return this;
        }

        public Criteria andCreatorNotEqualTo(String value) {
            addCriterion("CREATOR <>", value, "creator");
            return this;
        }

        public Criteria andCreatorGreaterThan(String value) {
            addCriterion("CREATOR >", value, "creator");
            return this;
        }

        public Criteria andCreatorGreaterThanOrEqualTo(String value) {
            addCriterion("CREATOR >=", value, "creator");
            return this;
        }

        public Criteria andCreatorLessThan(String value) {
            addCriterion("CREATOR <", value, "creator");
            return this;
        }

        public Criteria andCreatorLessThanOrEqualTo(String value) {
            addCriterion("CREATOR <=", value, "creator");
            return this;
        }

        public Criteria andCreatorLike(String value) {
            addCriterion("CREATOR like", value, "creator");
            return this;
        }

        public Criteria andCreatorNotLike(String value) {
            addCriterion("CREATOR not like", value, "creator");
            return this;
        }

        public Criteria andCreatorIn(List values) {
            addCriterion("CREATOR in", values, "creator");
            return this;
        }

        public Criteria andCreatorNotIn(List values) {
            addCriterion("CREATOR not in", values, "creator");
            return this;
        }

        public Criteria andCreatorBetween(String value1, String value2) {
            addCriterion("CREATOR between", value1, value2, "creator");
            return this;
        }

        public Criteria andCreatorNotBetween(String value1, String value2) {
            addCriterion("CREATOR not between", value1, value2, "creator");
            return this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("CREATE_DATE is null");
            return this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("CREATE_DATE is not null");
            return this;
        }

        public Criteria andCreateDateEqualTo(String value) {
            addCriterion("CREATE_DATE =", value, "createDate");
            return this;
        }

        public Criteria andCreateDateNotEqualTo(String value) {
            addCriterion("CREATE_DATE <>", value, "createDate");
            return this;
        }

        public Criteria andCreateDateGreaterThan(String value) {
            addCriterion("CREATE_DATE >", value, "createDate");
            return this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_DATE >=", value, "createDate");
            return this;
        }

        public Criteria andCreateDateLessThan(String value) {
            addCriterion("CREATE_DATE <", value, "createDate");
            return this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(String value) {
            addCriterion("CREATE_DATE <=", value, "createDate");
            return this;
        }

        public Criteria andCreateDateLike(String value) {
            addCriterion("CREATE_DATE like", value, "createDate");
            return this;
        }

        public Criteria andCreateDateNotLike(String value) {
            addCriterion("CREATE_DATE not like", value, "createDate");
            return this;
        }

        public Criteria andCreateDateIn(List values) {
            addCriterion("CREATE_DATE in", values, "createDate");
            return this;
        }

        public Criteria andCreateDateNotIn(List values) {
            addCriterion("CREATE_DATE not in", values, "createDate");
            return this;
        }

        public Criteria andCreateDateBetween(String value1, String value2) {
            addCriterion("CREATE_DATE between", value1, value2, "createDate");
            return this;
        }

        public Criteria andCreateDateNotBetween(String value1, String value2) {
            addCriterion("CREATE_DATE not between", value1, value2, "createDate");
            return this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return this;
        }

        public Criteria andCreateTimeEqualTo(String value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return this;
        }

        public Criteria andCreateTimeNotEqualTo(String value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return this;
        }

        public Criteria andCreateTimeGreaterThan(String value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return this;
        }

        public Criteria andCreateTimeLessThan(String value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(String value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return this;
        }

        public Criteria andCreateTimeLike(String value) {
            addCriterion("CREATE_TIME like", value, "createTime");
            return this;
        }

        public Criteria andCreateTimeNotLike(String value) {
            addCriterion("CREATE_TIME not like", value, "createTime");
            return this;
        }

        public Criteria andCreateTimeIn(List values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return this;
        }

        public Criteria andCreateTimeNotIn(List values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return this;
        }

        public Criteria andCreateTimeBetween(String value1, String value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return this;
        }

        public Criteria andCreateTimeNotBetween(String value1, String value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return this;
        }

        public Criteria andCreateNameIsNull() {
            addCriterion("CREATE_NAME is null");
            return this;
        }

        public Criteria andCreateNameIsNotNull() {
            addCriterion("CREATE_NAME is not null");
            return this;
        }

        public Criteria andCreateNameEqualTo(String value) {
            addCriterion("CREATE_NAME =", value, "createName");
            return this;
        }

        public Criteria andCreateNameNotEqualTo(String value) {
            addCriterion("CREATE_NAME <>", value, "createName");
            return this;
        }

        public Criteria andCreateNameGreaterThan(String value) {
            addCriterion("CREATE_NAME >", value, "createName");
            return this;
        }

        public Criteria andCreateNameGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_NAME >=", value, "createName");
            return this;
        }

        public Criteria andCreateNameLessThan(String value) {
            addCriterion("CREATE_NAME <", value, "createName");
            return this;
        }

        public Criteria andCreateNameLessThanOrEqualTo(String value) {
            addCriterion("CREATE_NAME <=", value, "createName");
            return this;
        }

        public Criteria andCreateNameLike(String value) {
            addCriterion("CREATE_NAME like", value, "createName");
            return this;
        }

        public Criteria andCreateNameNotLike(String value) {
            addCriterion("CREATE_NAME not like", value, "createName");
            return this;
        }

        public Criteria andCreateNameIn(List values) {
            addCriterion("CREATE_NAME in", values, "createName");
            return this;
        }

        public Criteria andCreateNameNotIn(List values) {
            addCriterion("CREATE_NAME not in", values, "createName");
            return this;
        }

        public Criteria andCreateNameBetween(String value1, String value2) {
            addCriterion("CREATE_NAME between", value1, value2, "createName");
            return this;
        }

        public Criteria andCreateNameNotBetween(String value1, String value2) {
            addCriterion("CREATE_NAME not between", value1, value2, "createName");
            return this;
        }

        public Criteria andOrgcodeIsNull() {
            addCriterion("ORGCODE is null");
            return this;
        }

        public Criteria andOrgcodeIsNotNull() {
            addCriterion("ORGCODE is not null");
            return this;
        }

        public Criteria andOrgcodeEqualTo(String value) {
            addCriterion("ORGCODE =", value, "orgcode");
            return this;
        }

        public Criteria andOrgcodeNotEqualTo(String value) {
            addCriterion("ORGCODE <>", value, "orgcode");
            return this;
        }

        public Criteria andOrgcodeGreaterThan(String value) {
            addCriterion("ORGCODE >", value, "orgcode");
            return this;
        }

        public Criteria andOrgcodeGreaterThanOrEqualTo(String value) {
            addCriterion("ORGCODE >=", value, "orgcode");
            return this;
        }

        public Criteria andOrgcodeLessThan(String value) {
            addCriterion("ORGCODE <", value, "orgcode");
            return this;
        }

        public Criteria andOrgcodeLessThanOrEqualTo(String value) {
            addCriterion("ORGCODE <=", value, "orgcode");
            return this;
        }

        public Criteria andOrgcodeLike(String value) {
            addCriterion("ORGCODE like", value, "orgcode");
            return this;
        }

        public Criteria andOrgcodeNotLike(String value) {
            addCriterion("ORGCODE not like", value, "orgcode");
            return this;
        }

        public Criteria andOrgcodeIn(List values) {
            addCriterion("ORGCODE in", values, "orgcode");
            return this;
        }

        public Criteria andOrgcodeNotIn(List values) {
            addCriterion("ORGCODE not in", values, "orgcode");
            return this;
        }

        public Criteria andOrgcodeBetween(String value1, String value2) {
            addCriterion("ORGCODE between", value1, value2, "orgcode");
            return this;
        }

        public Criteria andOrgcodeNotBetween(String value1, String value2) {
            addCriterion("ORGCODE not between", value1, value2, "orgcode");
            return this;
        }

        public Criteria andReportMonthIsNull() {
            addCriterion("REPORT_MONTH is null");
            return this;
        }

        public Criteria andReportMonthIsNotNull() {
            addCriterion("REPORT_MONTH is not null");
            return this;
        }

        public Criteria andReportMonthEqualTo(String value) {
            addCriterion("REPORT_MONTH =", value, "reportMonth");
            return this;
        }

        public Criteria andReportMonthNotEqualTo(String value) {
            addCriterion("REPORT_MONTH <>", value, "reportMonth");
            return this;
        }

        public Criteria andReportMonthGreaterThan(String value) {
            addCriterion("REPORT_MONTH >", value, "reportMonth");
            return this;
        }

        public Criteria andReportMonthGreaterThanOrEqualTo(String value) {
            addCriterion("REPORT_MONTH >=", value, "reportMonth");
            return this;
        }

        public Criteria andReportMonthLessThan(String value) {
            addCriterion("REPORT_MONTH <", value, "reportMonth");
            return this;
        }

        public Criteria andReportMonthLessThanOrEqualTo(String value) {
            addCriterion("REPORT_MONTH <=", value, "reportMonth");
            return this;
        }

        public Criteria andReportMonthLike(String value) {
            addCriterion("REPORT_MONTH like", value, "reportMonth");
            return this;
        }

        public Criteria andReportMonthNotLike(String value) {
            addCriterion("REPORT_MONTH not like", value, "reportMonth");
            return this;
        }

        public Criteria andReportMonthIn(List values) {
            addCriterion("REPORT_MONTH in", values, "reportMonth");
            return this;
        }

        public Criteria andReportMonthNotIn(List values) {
            addCriterion("REPORT_MONTH not in", values, "reportMonth");
            return this;
        }

        public Criteria andReportMonthBetween(String value1, String value2) {
            addCriterion("REPORT_MONTH between", value1, value2, "reportMonth");
            return this;
        }

        public Criteria andReportMonthNotBetween(String value1, String value2) {
            addCriterion("REPORT_MONTH not between", value1, value2, "reportMonth");
            return this;
        }
    }
}