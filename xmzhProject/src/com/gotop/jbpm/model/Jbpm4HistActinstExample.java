package com.gotop.jbpm.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.log4j.Logger;

public class Jbpm4HistActinstExample {
    /**
     * 
     * @abatorgenerated
     */
    protected Logger log = Logger.getLogger(Jbpm4HistActinstExample.class);

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
    public Jbpm4HistActinstExample() {
        oredCriteria = new ArrayList();
    }

    /** * @abatorgenerated  */
    protected Jbpm4HistActinstExample(Jbpm4HistActinstExample example) {
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
     * This class corresponds to the database table JBPM4_HIST_ACTINST
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

        public Criteria andDbidIsNull() {
            addCriterion("DBID_ is null");
            return this;
        }

        public Criteria andDbidIsNotNull() {
            addCriterion("DBID_ is not null");
            return this;
        }

        public Criteria andDbidEqualTo(BigDecimal value) {
            addCriterion("DBID_ =", value, "dbid");
            return this;
        }

        public Criteria andDbidNotEqualTo(BigDecimal value) {
            addCriterion("DBID_ <>", value, "dbid");
            return this;
        }

        public Criteria andDbidGreaterThan(BigDecimal value) {
            addCriterion("DBID_ >", value, "dbid");
            return this;
        }

        public Criteria andDbidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DBID_ >=", value, "dbid");
            return this;
        }

        public Criteria andDbidLessThan(BigDecimal value) {
            addCriterion("DBID_ <", value, "dbid");
            return this;
        }

        public Criteria andDbidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DBID_ <=", value, "dbid");
            return this;
        }

        public Criteria andDbidIn(List values) {
            addCriterion("DBID_ in", values, "dbid");
            return this;
        }

        public Criteria andDbidNotIn(List values) {
            addCriterion("DBID_ not in", values, "dbid");
            return this;
        }

        public Criteria andDbidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DBID_ between", value1, value2, "dbid");
            return this;
        }

        public Criteria andDbidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DBID_ not between", value1, value2, "dbid");
            return this;
        }

        public Criteria andClassIsNull() {
            addCriterion("CLASS_ is null");
            return this;
        }

        public Criteria andClassIsNotNull() {
            addCriterion("CLASS_ is not null");
            return this;
        }

        public Criteria andClassEqualTo(String value) {
            addCriterion("CLASS_ =", value, "class");
            return this;
        }

        public Criteria andClassNotEqualTo(String value) {
            addCriterion("CLASS_ <>", value, "class");
            return this;
        }

        public Criteria andClassGreaterThan(String value) {
            addCriterion("CLASS_ >", value, "class");
            return this;
        }

        public Criteria andClassGreaterThanOrEqualTo(String value) {
            addCriterion("CLASS_ >=", value, "class");
            return this;
        }

        public Criteria andClassLessThan(String value) {
            addCriterion("CLASS_ <", value, "class");
            return this;
        }

        public Criteria andClassLessThanOrEqualTo(String value) {
            addCriterion("CLASS_ <=", value, "class");
            return this;
        }

        public Criteria andClassLike(String value) {
            addCriterion("CLASS_ like", value, "class");
            return this;
        }

        public Criteria andClassNotLike(String value) {
            addCriterion("CLASS_ not like", value, "class");
            return this;
        }

        public Criteria andClassIn(List values) {
            addCriterion("CLASS_ in", values, "class");
            return this;
        }

        public Criteria andClassNotIn(List values) {
            addCriterion("CLASS_ not in", values, "class");
            return this;
        }

        public Criteria andClassBetween(String value1, String value2) {
            addCriterion("CLASS_ between", value1, value2, "class");
            return this;
        }

        public Criteria andClassNotBetween(String value1, String value2) {
            addCriterion("CLASS_ not between", value1, value2, "class");
            return this;
        }

        public Criteria andDbversionIsNull() {
            addCriterion("DBVERSION_ is null");
            return this;
        }

        public Criteria andDbversionIsNotNull() {
            addCriterion("DBVERSION_ is not null");
            return this;
        }

        public Criteria andDbversionEqualTo(Long value) {
            addCriterion("DBVERSION_ =", value, "dbversion");
            return this;
        }

        public Criteria andDbversionNotEqualTo(Long value) {
            addCriterion("DBVERSION_ <>", value, "dbversion");
            return this;
        }

        public Criteria andDbversionGreaterThan(Long value) {
            addCriterion("DBVERSION_ >", value, "dbversion");
            return this;
        }

        public Criteria andDbversionGreaterThanOrEqualTo(Long value) {
            addCriterion("DBVERSION_ >=", value, "dbversion");
            return this;
        }

        public Criteria andDbversionLessThan(Long value) {
            addCriterion("DBVERSION_ <", value, "dbversion");
            return this;
        }

        public Criteria andDbversionLessThanOrEqualTo(Long value) {
            addCriterion("DBVERSION_ <=", value, "dbversion");
            return this;
        }

        public Criteria andDbversionIn(List values) {
            addCriterion("DBVERSION_ in", values, "dbversion");
            return this;
        }

        public Criteria andDbversionNotIn(List values) {
            addCriterion("DBVERSION_ not in", values, "dbversion");
            return this;
        }

        public Criteria andDbversionBetween(Long value1, Long value2) {
            addCriterion("DBVERSION_ between", value1, value2, "dbversion");
            return this;
        }

        public Criteria andDbversionNotBetween(Long value1, Long value2) {
            addCriterion("DBVERSION_ not between", value1, value2, "dbversion");
            return this;
        }

        public Criteria andHprociIsNull() {
            addCriterion("HPROCI_ is null");
            return this;
        }

        public Criteria andHprociIsNotNull() {
            addCriterion("HPROCI_ is not null");
            return this;
        }

        public Criteria andHprociEqualTo(BigDecimal value) {
            addCriterion("HPROCI_ =", value, "hproci");
            return this;
        }

        public Criteria andHprociNotEqualTo(BigDecimal value) {
            addCriterion("HPROCI_ <>", value, "hproci");
            return this;
        }

        public Criteria andHprociGreaterThan(BigDecimal value) {
            addCriterion("HPROCI_ >", value, "hproci");
            return this;
        }

        public Criteria andHprociGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("HPROCI_ >=", value, "hproci");
            return this;
        }

        public Criteria andHprociLessThan(BigDecimal value) {
            addCriterion("HPROCI_ <", value, "hproci");
            return this;
        }

        public Criteria andHprociLessThanOrEqualTo(BigDecimal value) {
            addCriterion("HPROCI_ <=", value, "hproci");
            return this;
        }

        public Criteria andHprociIn(List values) {
            addCriterion("HPROCI_ in", values, "hproci");
            return this;
        }

        public Criteria andHprociNotIn(List values) {
            addCriterion("HPROCI_ not in", values, "hproci");
            return this;
        }

        public Criteria andHprociBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HPROCI_ between", value1, value2, "hproci");
            return this;
        }

        public Criteria andHprociNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HPROCI_ not between", value1, value2, "hproci");
            return this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("TYPE_ is null");
            return this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("TYPE_ is not null");
            return this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("TYPE_ =", value, "type");
            return this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("TYPE_ <>", value, "type");
            return this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("TYPE_ >", value, "type");
            return this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("TYPE_ >=", value, "type");
            return this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("TYPE_ <", value, "type");
            return this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("TYPE_ <=", value, "type");
            return this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("TYPE_ like", value, "type");
            return this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("TYPE_ not like", value, "type");
            return this;
        }

        public Criteria andTypeIn(List values) {
            addCriterion("TYPE_ in", values, "type");
            return this;
        }

        public Criteria andTypeNotIn(List values) {
            addCriterion("TYPE_ not in", values, "type");
            return this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("TYPE_ between", value1, value2, "type");
            return this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("TYPE_ not between", value1, value2, "type");
            return this;
        }

        public Criteria andExecutionIsNull() {
            addCriterion("EXECUTION_ is null");
            return this;
        }

        public Criteria andExecutionIsNotNull() {
            addCriterion("EXECUTION_ is not null");
            return this;
        }

        public Criteria andExecutionEqualTo(String value) {
            addCriterion("EXECUTION_ =", value, "execution");
            return this;
        }

        public Criteria andExecutionNotEqualTo(String value) {
            addCriterion("EXECUTION_ <>", value, "execution");
            return this;
        }

        public Criteria andExecutionGreaterThan(String value) {
            addCriterion("EXECUTION_ >", value, "execution");
            return this;
        }

        public Criteria andExecutionGreaterThanOrEqualTo(String value) {
            addCriterion("EXECUTION_ >=", value, "execution");
            return this;
        }

        public Criteria andExecutionLessThan(String value) {
            addCriterion("EXECUTION_ <", value, "execution");
            return this;
        }

        public Criteria andExecutionLessThanOrEqualTo(String value) {
            addCriterion("EXECUTION_ <=", value, "execution");
            return this;
        }

        public Criteria andExecutionLike(String value) {
            addCriterion("EXECUTION_ like", value, "execution");
            return this;
        }

        public Criteria andExecutionNotLike(String value) {
            addCriterion("EXECUTION_ not like", value, "execution");
            return this;
        }

        public Criteria andExecutionIn(List values) {
            addCriterion("EXECUTION_ in", values, "execution");
            return this;
        }

        public Criteria andExecutionNotIn(List values) {
            addCriterion("EXECUTION_ not in", values, "execution");
            return this;
        }

        public Criteria andExecutionBetween(String value1, String value2) {
            addCriterion("EXECUTION_ between", value1, value2, "execution");
            return this;
        }

        public Criteria andExecutionNotBetween(String value1, String value2) {
            addCriterion("EXECUTION_ not between", value1, value2, "execution");
            return this;
        }

        public Criteria andActivityNameIsNull() {
            addCriterion("ACTIVITY_NAME_ is null");
            return this;
        }

        public Criteria andActivityNameIsNotNull() {
            addCriterion("ACTIVITY_NAME_ is not null");
            return this;
        }

        public Criteria andActivityNameEqualTo(String value) {
            addCriterion("ACTIVITY_NAME_ =", value, "activityName");
            return this;
        }

        public Criteria andActivityNameNotEqualTo(String value) {
            addCriterion("ACTIVITY_NAME_ <>", value, "activityName");
            return this;
        }

        public Criteria andActivityNameGreaterThan(String value) {
            addCriterion("ACTIVITY_NAME_ >", value, "activityName");
            return this;
        }

        public Criteria andActivityNameGreaterThanOrEqualTo(String value) {
            addCriterion("ACTIVITY_NAME_ >=", value, "activityName");
            return this;
        }

        public Criteria andActivityNameLessThan(String value) {
            addCriterion("ACTIVITY_NAME_ <", value, "activityName");
            return this;
        }

        public Criteria andActivityNameLessThanOrEqualTo(String value) {
            addCriterion("ACTIVITY_NAME_ <=", value, "activityName");
            return this;
        }

        public Criteria andActivityNameLike(String value) {
            addCriterion("ACTIVITY_NAME_ like", value, "activityName");
            return this;
        }

        public Criteria andActivityNameNotLike(String value) {
            addCriterion("ACTIVITY_NAME_ not like", value, "activityName");
            return this;
        }

        public Criteria andActivityNameIn(List values) {
            addCriterion("ACTIVITY_NAME_ in", values, "activityName");
            return this;
        }

        public Criteria andActivityNameNotIn(List values) {
            addCriterion("ACTIVITY_NAME_ not in", values, "activityName");
            return this;
        }

        public Criteria andActivityNameBetween(String value1, String value2) {
            addCriterion("ACTIVITY_NAME_ between", value1, value2, "activityName");
            return this;
        }

        public Criteria andActivityNameNotBetween(String value1, String value2) {
            addCriterion("ACTIVITY_NAME_ not between", value1, value2, "activityName");
            return this;
        }

        public Criteria andStartIsNull() {
            addCriterion("START_ is null");
            return this;
        }

        public Criteria andStartIsNotNull() {
            addCriterion("START_ is not null");
            return this;
        }

        public Criteria andStartEqualTo(Date value) {
            addCriterion("START_ =", value, "start");
            return this;
        }

        public Criteria andStartNotEqualTo(Date value) {
            addCriterion("START_ <>", value, "start");
            return this;
        }

        public Criteria andStartGreaterThan(Date value) {
            addCriterion("START_ >", value, "start");
            return this;
        }

        public Criteria andStartGreaterThanOrEqualTo(Date value) {
            addCriterion("START_ >=", value, "start");
            return this;
        }

        public Criteria andStartLessThan(Date value) {
            addCriterion("START_ <", value, "start");
            return this;
        }

        public Criteria andStartLessThanOrEqualTo(Date value) {
            addCriterion("START_ <=", value, "start");
            return this;
        }

        public Criteria andStartIn(List values) {
            addCriterion("START_ in", values, "start");
            return this;
        }

        public Criteria andStartNotIn(List values) {
            addCriterion("START_ not in", values, "start");
            return this;
        }

        public Criteria andStartBetween(Date value1, Date value2) {
            addCriterion("START_ between", value1, value2, "start");
            return this;
        }

        public Criteria andStartNotBetween(Date value1, Date value2) {
            addCriterion("START_ not between", value1, value2, "start");
            return this;
        }

        public Criteria andEndIsNull() {
            addCriterion("END_ is null");
            return this;
        }

        public Criteria andEndIsNotNull() {
            addCriterion("END_ is not null");
            return this;
        }

        public Criteria andEndEqualTo(Date value) {
            addCriterion("END_ =", value, "end");
            return this;
        }

        public Criteria andEndNotEqualTo(Date value) {
            addCriterion("END_ <>", value, "end");
            return this;
        }

        public Criteria andEndGreaterThan(Date value) {
            addCriterion("END_ >", value, "end");
            return this;
        }

        public Criteria andEndGreaterThanOrEqualTo(Date value) {
            addCriterion("END_ >=", value, "end");
            return this;
        }

        public Criteria andEndLessThan(Date value) {
            addCriterion("END_ <", value, "end");
            return this;
        }

        public Criteria andEndLessThanOrEqualTo(Date value) {
            addCriterion("END_ <=", value, "end");
            return this;
        }

        public Criteria andEndIn(List values) {
            addCriterion("END_ in", values, "end");
            return this;
        }

        public Criteria andEndNotIn(List values) {
            addCriterion("END_ not in", values, "end");
            return this;
        }

        public Criteria andEndBetween(Date value1, Date value2) {
            addCriterion("END_ between", value1, value2, "end");
            return this;
        }

        public Criteria andEndNotBetween(Date value1, Date value2) {
            addCriterion("END_ not between", value1, value2, "end");
            return this;
        }

        public Criteria andDurationIsNull() {
            addCriterion("DURATION_ is null");
            return this;
        }

        public Criteria andDurationIsNotNull() {
            addCriterion("DURATION_ is not null");
            return this;
        }

        public Criteria andDurationEqualTo(BigDecimal value) {
            addCriterion("DURATION_ =", value, "duration");
            return this;
        }

        public Criteria andDurationNotEqualTo(BigDecimal value) {
            addCriterion("DURATION_ <>", value, "duration");
            return this;
        }

        public Criteria andDurationGreaterThan(BigDecimal value) {
            addCriterion("DURATION_ >", value, "duration");
            return this;
        }

        public Criteria andDurationGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DURATION_ >=", value, "duration");
            return this;
        }

        public Criteria andDurationLessThan(BigDecimal value) {
            addCriterion("DURATION_ <", value, "duration");
            return this;
        }

        public Criteria andDurationLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DURATION_ <=", value, "duration");
            return this;
        }

        public Criteria andDurationIn(List values) {
            addCriterion("DURATION_ in", values, "duration");
            return this;
        }

        public Criteria andDurationNotIn(List values) {
            addCriterion("DURATION_ not in", values, "duration");
            return this;
        }

        public Criteria andDurationBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DURATION_ between", value1, value2, "duration");
            return this;
        }

        public Criteria andDurationNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DURATION_ not between", value1, value2, "duration");
            return this;
        }

        public Criteria andTransitionIsNull() {
            addCriterion("TRANSITION_ is null");
            return this;
        }

        public Criteria andTransitionIsNotNull() {
            addCriterion("TRANSITION_ is not null");
            return this;
        }

        public Criteria andTransitionEqualTo(String value) {
            addCriterion("TRANSITION_ =", value, "transition");
            return this;
        }

        public Criteria andTransitionNotEqualTo(String value) {
            addCriterion("TRANSITION_ <>", value, "transition");
            return this;
        }

        public Criteria andTransitionGreaterThan(String value) {
            addCriterion("TRANSITION_ >", value, "transition");
            return this;
        }

        public Criteria andTransitionGreaterThanOrEqualTo(String value) {
            addCriterion("TRANSITION_ >=", value, "transition");
            return this;
        }

        public Criteria andTransitionLessThan(String value) {
            addCriterion("TRANSITION_ <", value, "transition");
            return this;
        }

        public Criteria andTransitionLessThanOrEqualTo(String value) {
            addCriterion("TRANSITION_ <=", value, "transition");
            return this;
        }

        public Criteria andTransitionLike(String value) {
            addCriterion("TRANSITION_ like", value, "transition");
            return this;
        }

        public Criteria andTransitionNotLike(String value) {
            addCriterion("TRANSITION_ not like", value, "transition");
            return this;
        }

        public Criteria andTransitionIn(List values) {
            addCriterion("TRANSITION_ in", values, "transition");
            return this;
        }

        public Criteria andTransitionNotIn(List values) {
            addCriterion("TRANSITION_ not in", values, "transition");
            return this;
        }

        public Criteria andTransitionBetween(String value1, String value2) {
            addCriterion("TRANSITION_ between", value1, value2, "transition");
            return this;
        }

        public Criteria andTransitionNotBetween(String value1, String value2) {
            addCriterion("TRANSITION_ not between", value1, value2, "transition");
            return this;
        }

        public Criteria andNextidxIsNull() {
            addCriterion("NEXTIDX_ is null");
            return this;
        }

        public Criteria andNextidxIsNotNull() {
            addCriterion("NEXTIDX_ is not null");
            return this;
        }

        public Criteria andNextidxEqualTo(Long value) {
            addCriterion("NEXTIDX_ =", value, "nextidx");
            return this;
        }

        public Criteria andNextidxNotEqualTo(Long value) {
            addCriterion("NEXTIDX_ <>", value, "nextidx");
            return this;
        }

        public Criteria andNextidxGreaterThan(Long value) {
            addCriterion("NEXTIDX_ >", value, "nextidx");
            return this;
        }

        public Criteria andNextidxGreaterThanOrEqualTo(Long value) {
            addCriterion("NEXTIDX_ >=", value, "nextidx");
            return this;
        }

        public Criteria andNextidxLessThan(Long value) {
            addCriterion("NEXTIDX_ <", value, "nextidx");
            return this;
        }

        public Criteria andNextidxLessThanOrEqualTo(Long value) {
            addCriterion("NEXTIDX_ <=", value, "nextidx");
            return this;
        }

        public Criteria andNextidxIn(List values) {
            addCriterion("NEXTIDX_ in", values, "nextidx");
            return this;
        }

        public Criteria andNextidxNotIn(List values) {
            addCriterion("NEXTIDX_ not in", values, "nextidx");
            return this;
        }

        public Criteria andNextidxBetween(Long value1, Long value2) {
            addCriterion("NEXTIDX_ between", value1, value2, "nextidx");
            return this;
        }

        public Criteria andNextidxNotBetween(Long value1, Long value2) {
            addCriterion("NEXTIDX_ not between", value1, value2, "nextidx");
            return this;
        }

        public Criteria andHtaskIsNull() {
            addCriterion("HTASK_ is null");
            return this;
        }

        public Criteria andHtaskIsNotNull() {
            addCriterion("HTASK_ is not null");
            return this;
        }

        public Criteria andHtaskEqualTo(BigDecimal value) {
            addCriterion("HTASK_ =", value, "htask");
            return this;
        }

        public Criteria andHtaskNotEqualTo(BigDecimal value) {
            addCriterion("HTASK_ <>", value, "htask");
            return this;
        }

        public Criteria andHtaskGreaterThan(BigDecimal value) {
            addCriterion("HTASK_ >", value, "htask");
            return this;
        }

        public Criteria andHtaskGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("HTASK_ >=", value, "htask");
            return this;
        }

        public Criteria andHtaskLessThan(BigDecimal value) {
            addCriterion("HTASK_ <", value, "htask");
            return this;
        }

        public Criteria andHtaskLessThanOrEqualTo(BigDecimal value) {
            addCriterion("HTASK_ <=", value, "htask");
            return this;
        }

        public Criteria andHtaskIn(List values) {
            addCriterion("HTASK_ in", values, "htask");
            return this;
        }

        public Criteria andHtaskNotIn(List values) {
            addCriterion("HTASK_ not in", values, "htask");
            return this;
        }

        public Criteria andHtaskBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HTASK_ between", value1, value2, "htask");
            return this;
        }

        public Criteria andHtaskNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HTASK_ not between", value1, value2, "htask");
            return this;
        }
    }
}