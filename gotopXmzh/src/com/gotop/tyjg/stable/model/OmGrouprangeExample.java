package com.gotop.tyjg.stable.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.log4j.Logger;


public class OmGrouprangeExample {
    /**
     * 
     * @abatorgenerated
     */
    protected Logger log = Logger.getLogger(OmGrouprangeExample.class);

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

    /**
     * @abatorgenerated */
    public OmGrouprangeExample() {
        oredCriteria = new ArrayList();
    }

    /**
     * @abatorgenerated */
    protected OmGrouprangeExample(OmGrouprangeExample example) {
        this.orderByClause = example.orderByClause;
        this.oredCriteria = example.oredCriteria;
        this.oracleStart = example.oracleStart;
        this.oracleEnd = example.oracleEnd;
    }

    /**
     * @abatorgenerated */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * @abatorgenerated */
    /**
     * @abatorgenerated */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * @abatorgenerated */
    public List getOredCriteria() {
        return oredCriteria;
    }

    /**
     * @abatorgenerated */
    public Integer getOracleStart() {
        return oracleStart;
    }

    /**
     * @abatorgenerated */
    public void setOracleStart(Integer oracleStart) {
        this.oracleStart = oracleStart;
    }

    /**
     * @abatorgenerated */
    public Integer getOracleEnd() {
        return oracleEnd;
    }

    /**
     * @abatorgenerated */
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
     * This class corresponds to the database table OM_GROUPRANGE
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

        public Criteria andFlagIsNull() {
            addCriterion("FLAG is null");
            return this;
        }

        public Criteria andFlagIsNotNull() {
            addCriterion("FLAG is not null");
            return this;
        }

        public Criteria andFlagEqualTo(String value) {
            addCriterion("FLAG =", value, "flag");
            return this;
        }

        public Criteria andFlagNotEqualTo(String value) {
            addCriterion("FLAG <>", value, "flag");
            return this;
        }

        public Criteria andFlagGreaterThan(String value) {
            addCriterion("FLAG >", value, "flag");
            return this;
        }

        public Criteria andFlagGreaterThanOrEqualTo(String value) {
            addCriterion("FLAG >=", value, "flag");
            return this;
        }

        public Criteria andFlagLessThan(String value) {
            addCriterion("FLAG <", value, "flag");
            return this;
        }

        public Criteria andFlagLessThanOrEqualTo(String value) {
            addCriterion("FLAG <=", value, "flag");
            return this;
        }

        public Criteria andFlagLike(String value) {
            addCriterion("FLAG like", value, "flag");
            return this;
        }

        public Criteria andFlagNotLike(String value) {
            addCriterion("FLAG not like", value, "flag");
            return this;
        }

        public Criteria andFlagIn(List values) {
            addCriterion("FLAG in", values, "flag");
            return this;
        }

        public Criteria andFlagNotIn(List values) {
            addCriterion("FLAG not in", values, "flag");
            return this;
        }

        public Criteria andFlagBetween(String value1, String value2) {
            addCriterion("FLAG between", value1, value2, "flag");
            return this;
        }

        public Criteria andFlagNotBetween(String value1, String value2) {
            addCriterion("FLAG not between", value1, value2, "flag");
            return this;
        }

        public Criteria andGrangeidIsNull() {
            addCriterion("GRANGEID is null");
            return this;
        }

        public Criteria andGrangeidIsNotNull() {
            addCriterion("GRANGEID is not null");
            return this;
        }

        public Criteria andGrangeidEqualTo(String value) {
            addCriterion("GRANGEID =", value, "grangeid");
            return this;
        }

        public Criteria andGrangeidNotEqualTo(String value) {
            addCriterion("GRANGEID <>", value, "grangeid");
            return this;
        }

        public Criteria andGrangeidGreaterThan(String value) {
            addCriterion("GRANGEID >", value, "grangeid");
            return this;
        }

        public Criteria andGrangeidGreaterThanOrEqualTo(String value) {
            addCriterion("GRANGEID >=", value, "grangeid");
            return this;
        }

        public Criteria andGrangeidLessThan(String value) {
            addCriterion("GRANGEID <", value, "grangeid");
            return this;
        }

        public Criteria andGrangeidLessThanOrEqualTo(String value) {
            addCriterion("GRANGEID <=", value, "grangeid");
            return this;
        }

        public Criteria andGrangeidLike(String value) {
            addCriterion("GRANGEID like", value, "grangeid");
            return this;
        }

        public Criteria andGrangeidNotLike(String value) {
            addCriterion("GRANGEID not like", value, "grangeid");
            return this;
        }

        public Criteria andGrangeidIn(List values) {
            addCriterion("GRANGEID in", values, "grangeid");
            return this;
        }

        public Criteria andGrangeidNotIn(List values) {
            addCriterion("GRANGEID not in", values, "grangeid");
            return this;
        }

        public Criteria andGrangeidBetween(String value1, String value2) {
            addCriterion("GRANGEID between", value1, value2, "grangeid");
            return this;
        }

        public Criteria andGrangeidNotBetween(String value1, String value2) {
            addCriterion("GRANGEID not between", value1, value2, "grangeid");
            return this;
        }

        public Criteria andGroupidIsNull() {
            addCriterion("GROUPID is null");
            return this;
        }

        public Criteria andGroupidIsNotNull() {
            addCriterion("GROUPID is not null");
            return this;
        }

        public Criteria andGroupidEqualTo(Long value) {
            addCriterion("GROUPID =", value, "groupid");
            return this;
        }

        public Criteria andGroupidNotEqualTo(Long value) {
            addCriterion("GROUPID <>", value, "groupid");
            return this;
        }

        public Criteria andGroupidGreaterThan(Long value) {
            addCriterion("GROUPID >", value, "groupid");
            return this;
        }

        public Criteria andGroupidGreaterThanOrEqualTo(Long value) {
            addCriterion("GROUPID >=", value, "groupid");
            return this;
        }

        public Criteria andGroupidLessThan(Long value) {
            addCriterion("GROUPID <", value, "groupid");
            return this;
        }

        public Criteria andGroupidLessThanOrEqualTo(Long value) {
            addCriterion("GROUPID <=", value, "groupid");
            return this;
        }

        public Criteria andGroupidIn(List values) {
            addCriterion("GROUPID in", values, "groupid");
            return this;
        }

        public Criteria andGroupidNotIn(List values) {
            addCriterion("GROUPID not in", values, "groupid");
            return this;
        }

        public Criteria andGroupidBetween(Long value1, Long value2) {
            addCriterion("GROUPID between", value1, value2, "groupid");
            return this;
        }

        public Criteria andGroupidNotBetween(Long value1, Long value2) {
            addCriterion("GROUPID not between", value1, value2, "groupid");
            return this;
        }
    }
}