package com.gotop.Generalprocess.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.log4j.Logger;

public class TGeneralprocessMainExample {
    /**
     * 
     * @abatorgenerated
     */
    protected Logger log = Logger.getLogger(TGeneralprocessMainExample.class);

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
    public TGeneralprocessMainExample() {
        oredCriteria = new ArrayList();
    }

    /** * @abatorgenerated  */
    protected TGeneralprocessMainExample(TGeneralprocessMainExample example) {
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
     * This class corresponds to the database table T_GENERALPROCESS_MAIN
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

        public Criteria andMainidIsNull() {
            addCriterion("MAINID is null");
            return this;
        }

        public Criteria andMainidIsNotNull() {
            addCriterion("MAINID is not null");
            return this;
        }

        public Criteria andMainidEqualTo(BigDecimal value) {
            addCriterion("MAINID =", value, "mainid");
            return this;
        }

        public Criteria andMainidNotEqualTo(BigDecimal value) {
            addCriterion("MAINID <>", value, "mainid");
            return this;
        }

        public Criteria andMainidGreaterThan(BigDecimal value) {
            addCriterion("MAINID >", value, "mainid");
            return this;
        }

        public Criteria andMainidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MAINID >=", value, "mainid");
            return this;
        }

        public Criteria andMainidLessThan(BigDecimal value) {
            addCriterion("MAINID <", value, "mainid");
            return this;
        }

        public Criteria andMainidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MAINID <=", value, "mainid");
            return this;
        }

        public Criteria andMainidIn(List values) {
            addCriterion("MAINID in", values, "mainid");
            return this;
        }

        public Criteria andMainidNotIn(List values) {
            addCriterion("MAINID not in", values, "mainid");
            return this;
        }

        public Criteria andMainidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MAINID between", value1, value2, "mainid");
            return this;
        }

        public Criteria andMainidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MAINID not between", value1, value2, "mainid");
            return this;
        }

        public Criteria andTemplateIdIsNull() {
            addCriterion("TEMPLATE_ID is null");
            return this;
        }

        public Criteria andTemplateIdIsNotNull() {
            addCriterion("TEMPLATE_ID is not null");
            return this;
        }

        public Criteria andTemplateIdEqualTo(BigDecimal value) {
            addCriterion("TEMPLATE_ID =", value, "templateId");
            return this;
        }

        public Criteria andTemplateIdNotEqualTo(BigDecimal value) {
            addCriterion("TEMPLATE_ID <>", value, "templateId");
            return this;
        }

        public Criteria andTemplateIdGreaterThan(BigDecimal value) {
            addCriterion("TEMPLATE_ID >", value, "templateId");
            return this;
        }

        public Criteria andTemplateIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TEMPLATE_ID >=", value, "templateId");
            return this;
        }

        public Criteria andTemplateIdLessThan(BigDecimal value) {
            addCriterion("TEMPLATE_ID <", value, "templateId");
            return this;
        }

        public Criteria andTemplateIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TEMPLATE_ID <=", value, "templateId");
            return this;
        }

        public Criteria andTemplateIdIn(List values) {
            addCriterion("TEMPLATE_ID in", values, "templateId");
            return this;
        }

        public Criteria andTemplateIdNotIn(List values) {
            addCriterion("TEMPLATE_ID not in", values, "templateId");
            return this;
        }

        public Criteria andTemplateIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TEMPLATE_ID between", value1, value2, "templateId");
            return this;
        }

        public Criteria andTemplateIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TEMPLATE_ID not between", value1, value2, "templateId");
            return this;
        }

        public Criteria andRulesIsNull() {
            addCriterion("RULES is null");
            return this;
        }

        public Criteria andRulesIsNotNull() {
            addCriterion("RULES is not null");
            return this;
        }

        public Criteria andRulesEqualTo(String value) {
            addCriterion("RULES =", value, "rules");
            return this;
        }

        public Criteria andRulesNotEqualTo(String value) {
            addCriterion("RULES <>", value, "rules");
            return this;
        }

        public Criteria andRulesGreaterThan(String value) {
            addCriterion("RULES >", value, "rules");
            return this;
        }

        public Criteria andRulesGreaterThanOrEqualTo(String value) {
            addCriterion("RULES >=", value, "rules");
            return this;
        }

        public Criteria andRulesLessThan(String value) {
            addCriterion("RULES <", value, "rules");
            return this;
        }

        public Criteria andRulesLessThanOrEqualTo(String value) {
            addCriterion("RULES <=", value, "rules");
            return this;
        }

        public Criteria andRulesLike(String value) {
            addCriterion("RULES like", value, "rules");
            return this;
        }

        public Criteria andRulesNotLike(String value) {
            addCriterion("RULES not like", value, "rules");
            return this;
        }

        public Criteria andRulesIn(List values) {
            addCriterion("RULES in", values, "rules");
            return this;
        }

        public Criteria andRulesNotIn(List values) {
            addCriterion("RULES not in", values, "rules");
            return this;
        }

        public Criteria andRulesBetween(String value1, String value2) {
            addCriterion("RULES between", value1, value2, "rules");
            return this;
        }

        public Criteria andRulesNotBetween(String value1, String value2) {
            addCriterion("RULES not between", value1, value2, "rules");
            return this;
        }

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return this;
        }

        public Criteria andNameIn(List values) {
            addCriterion("NAME in", values, "name");
            return this;
        }

        public Criteria andNameNotIn(List values) {
            addCriterion("NAME not in", values, "name");
            return this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return this;
        }

        public Criteria andBusinessIdIsNull() {
            addCriterion("BUSINESS_ID is null");
            return this;
        }

        public Criteria andBusinessIdIsNotNull() {
            addCriterion("BUSINESS_ID is not null");
            return this;
        }

        public Criteria andBusinessIdEqualTo(BigDecimal value) {
            addCriterion("BUSINESS_ID =", value, "businessId");
            return this;
        }

        public Criteria andBusinessIdNotEqualTo(BigDecimal value) {
            addCriterion("BUSINESS_ID <>", value, "businessId");
            return this;
        }

        public Criteria andBusinessIdGreaterThan(BigDecimal value) {
            addCriterion("BUSINESS_ID >", value, "businessId");
            return this;
        }

        public Criteria andBusinessIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BUSINESS_ID >=", value, "businessId");
            return this;
        }

        public Criteria andBusinessIdLessThan(BigDecimal value) {
            addCriterion("BUSINESS_ID <", value, "businessId");
            return this;
        }

        public Criteria andBusinessIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BUSINESS_ID <=", value, "businessId");
            return this;
        }

        public Criteria andBusinessIdIn(List values) {
            addCriterion("BUSINESS_ID in", values, "businessId");
            return this;
        }

        public Criteria andBusinessIdNotIn(List values) {
            addCriterion("BUSINESS_ID not in", values, "businessId");
            return this;
        }

        public Criteria andBusinessIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BUSINESS_ID between", value1, value2, "businessId");
            return this;
        }

        public Criteria andBusinessIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BUSINESS_ID not between", value1, value2, "businessId");
            return this;
        }
    }
}