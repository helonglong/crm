package com.hll.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CstLostExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CstLostExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andLstIdIsNull() {
            addCriterion("LST_ID is null");
            return (Criteria) this;
        }

        public Criteria andLstIdIsNotNull() {
            addCriterion("LST_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLstIdEqualTo(Integer value) {
            addCriterion("LST_ID =", value, "lstId");
            return (Criteria) this;
        }

        public Criteria andLstIdNotEqualTo(Integer value) {
            addCriterion("LST_ID <>", value, "lstId");
            return (Criteria) this;
        }

        public Criteria andLstIdGreaterThan(Integer value) {
            addCriterion("LST_ID >", value, "lstId");
            return (Criteria) this;
        }

        public Criteria andLstIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("LST_ID >=", value, "lstId");
            return (Criteria) this;
        }

        public Criteria andLstIdLessThan(Integer value) {
            addCriterion("LST_ID <", value, "lstId");
            return (Criteria) this;
        }

        public Criteria andLstIdLessThanOrEqualTo(Integer value) {
            addCriterion("LST_ID <=", value, "lstId");
            return (Criteria) this;
        }

        public Criteria andLstIdIn(List<Integer> values) {
            addCriterion("LST_ID in", values, "lstId");
            return (Criteria) this;
        }

        public Criteria andLstIdNotIn(List<Integer> values) {
            addCriterion("LST_ID not in", values, "lstId");
            return (Criteria) this;
        }

        public Criteria andLstIdBetween(Integer value1, Integer value2) {
            addCriterion("LST_ID between", value1, value2, "lstId");
            return (Criteria) this;
        }

        public Criteria andLstIdNotBetween(Integer value1, Integer value2) {
            addCriterion("LST_ID not between", value1, value2, "lstId");
            return (Criteria) this;
        }

        public Criteria andLstCustNoIsNull() {
            addCriterion("LST_CUST_NO is null");
            return (Criteria) this;
        }

        public Criteria andLstCustNoIsNotNull() {
            addCriterion("LST_CUST_NO is not null");
            return (Criteria) this;
        }

        public Criteria andLstCustNoEqualTo(String value) {
            addCriterion("LST_CUST_NO =", value, "lstCustNo");
            return (Criteria) this;
        }

        public Criteria andLstCustNoNotEqualTo(String value) {
            addCriterion("LST_CUST_NO <>", value, "lstCustNo");
            return (Criteria) this;
        }

        public Criteria andLstCustNoGreaterThan(String value) {
            addCriterion("LST_CUST_NO >", value, "lstCustNo");
            return (Criteria) this;
        }

        public Criteria andLstCustNoGreaterThanOrEqualTo(String value) {
            addCriterion("LST_CUST_NO >=", value, "lstCustNo");
            return (Criteria) this;
        }

        public Criteria andLstCustNoLessThan(String value) {
            addCriterion("LST_CUST_NO <", value, "lstCustNo");
            return (Criteria) this;
        }

        public Criteria andLstCustNoLessThanOrEqualTo(String value) {
            addCriterion("LST_CUST_NO <=", value, "lstCustNo");
            return (Criteria) this;
        }

        public Criteria andLstCustNoLike(String value) {
            addCriterion("LST_CUST_NO like", value, "lstCustNo");
            return (Criteria) this;
        }

        public Criteria andLstCustNoNotLike(String value) {
            addCriterion("LST_CUST_NO not like", value, "lstCustNo");
            return (Criteria) this;
        }

        public Criteria andLstCustNoIn(List<String> values) {
            addCriterion("LST_CUST_NO in", values, "lstCustNo");
            return (Criteria) this;
        }

        public Criteria andLstCustNoNotIn(List<String> values) {
            addCriterion("LST_CUST_NO not in", values, "lstCustNo");
            return (Criteria) this;
        }

        public Criteria andLstCustNoBetween(String value1, String value2) {
            addCriterion("LST_CUST_NO between", value1, value2, "lstCustNo");
            return (Criteria) this;
        }

        public Criteria andLstCustNoNotBetween(String value1, String value2) {
            addCriterion("LST_CUST_NO not between", value1, value2, "lstCustNo");
            return (Criteria) this;
        }

        public Criteria andLstCustNameIsNull() {
            addCriterion("LST_CUST_NAME is null");
            return (Criteria) this;
        }

        public Criteria andLstCustNameIsNotNull() {
            addCriterion("LST_CUST_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andLstCustNameEqualTo(String value) {
            addCriterion("LST_CUST_NAME =", value, "lstCustName");
            return (Criteria) this;
        }

        public Criteria andLstCustNameNotEqualTo(String value) {
            addCriterion("LST_CUST_NAME <>", value, "lstCustName");
            return (Criteria) this;
        }

        public Criteria andLstCustNameGreaterThan(String value) {
            addCriterion("LST_CUST_NAME >", value, "lstCustName");
            return (Criteria) this;
        }

        public Criteria andLstCustNameGreaterThanOrEqualTo(String value) {
            addCriterion("LST_CUST_NAME >=", value, "lstCustName");
            return (Criteria) this;
        }

        public Criteria andLstCustNameLessThan(String value) {
            addCriterion("LST_CUST_NAME <", value, "lstCustName");
            return (Criteria) this;
        }

        public Criteria andLstCustNameLessThanOrEqualTo(String value) {
            addCriterion("LST_CUST_NAME <=", value, "lstCustName");
            return (Criteria) this;
        }

        public Criteria andLstCustNameLike(String value) {
            addCriterion("LST_CUST_NAME like", value, "lstCustName");
            return (Criteria) this;
        }

        public Criteria andLstCustNameNotLike(String value) {
            addCriterion("LST_CUST_NAME not like", value, "lstCustName");
            return (Criteria) this;
        }

        public Criteria andLstCustNameIn(List<String> values) {
            addCriterion("LST_CUST_NAME in", values, "lstCustName");
            return (Criteria) this;
        }

        public Criteria andLstCustNameNotIn(List<String> values) {
            addCriterion("LST_CUST_NAME not in", values, "lstCustName");
            return (Criteria) this;
        }

        public Criteria andLstCustNameBetween(String value1, String value2) {
            addCriterion("LST_CUST_NAME between", value1, value2, "lstCustName");
            return (Criteria) this;
        }

        public Criteria andLstCustNameNotBetween(String value1, String value2) {
            addCriterion("LST_CUST_NAME not between", value1, value2, "lstCustName");
            return (Criteria) this;
        }

        public Criteria andLstCustManagerIdIsNull() {
            addCriterion("LST_CUST_MANAGER_ID is null");
            return (Criteria) this;
        }

        public Criteria andLstCustManagerIdIsNotNull() {
            addCriterion("LST_CUST_MANAGER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLstCustManagerIdEqualTo(String value) {
            addCriterion("LST_CUST_MANAGER_ID =", value, "lstCustManagerId");
            return (Criteria) this;
        }

        public Criteria andLstCustManagerIdNotEqualTo(String value) {
            addCriterion("LST_CUST_MANAGER_ID <>", value, "lstCustManagerId");
            return (Criteria) this;
        }

        public Criteria andLstCustManagerIdGreaterThan(String value) {
            addCriterion("LST_CUST_MANAGER_ID >", value, "lstCustManagerId");
            return (Criteria) this;
        }

        public Criteria andLstCustManagerIdGreaterThanOrEqualTo(String value) {
            addCriterion("LST_CUST_MANAGER_ID >=", value, "lstCustManagerId");
            return (Criteria) this;
        }

        public Criteria andLstCustManagerIdLessThan(String value) {
            addCriterion("LST_CUST_MANAGER_ID <", value, "lstCustManagerId");
            return (Criteria) this;
        }

        public Criteria andLstCustManagerIdLessThanOrEqualTo(String value) {
            addCriterion("LST_CUST_MANAGER_ID <=", value, "lstCustManagerId");
            return (Criteria) this;
        }

        public Criteria andLstCustManagerIdLike(String value) {
            addCriterion("LST_CUST_MANAGER_ID like", value, "lstCustManagerId");
            return (Criteria) this;
        }

        public Criteria andLstCustManagerIdNotLike(String value) {
            addCriterion("LST_CUST_MANAGER_ID not like", value, "lstCustManagerId");
            return (Criteria) this;
        }

        public Criteria andLstCustManagerIdIn(List<String> values) {
            addCriterion("LST_CUST_MANAGER_ID in", values, "lstCustManagerId");
            return (Criteria) this;
        }

        public Criteria andLstCustManagerIdNotIn(List<String> values) {
            addCriterion("LST_CUST_MANAGER_ID not in", values, "lstCustManagerId");
            return (Criteria) this;
        }

        public Criteria andLstCustManagerIdBetween(String value1, String value2) {
            addCriterion("LST_CUST_MANAGER_ID between", value1, value2, "lstCustManagerId");
            return (Criteria) this;
        }

        public Criteria andLstCustManagerIdNotBetween(String value1, String value2) {
            addCriterion("LST_CUST_MANAGER_ID not between", value1, value2, "lstCustManagerId");
            return (Criteria) this;
        }

        public Criteria andLstCustManagerNameIsNull() {
            addCriterion("LST_CUST_MANAGER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andLstCustManagerNameIsNotNull() {
            addCriterion("LST_CUST_MANAGER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andLstCustManagerNameEqualTo(String value) {
            addCriterion("LST_CUST_MANAGER_NAME =", value, "lstCustManagerName");
            return (Criteria) this;
        }

        public Criteria andLstCustManagerNameNotEqualTo(String value) {
            addCriterion("LST_CUST_MANAGER_NAME <>", value, "lstCustManagerName");
            return (Criteria) this;
        }

        public Criteria andLstCustManagerNameGreaterThan(String value) {
            addCriterion("LST_CUST_MANAGER_NAME >", value, "lstCustManagerName");
            return (Criteria) this;
        }

        public Criteria andLstCustManagerNameGreaterThanOrEqualTo(String value) {
            addCriterion("LST_CUST_MANAGER_NAME >=", value, "lstCustManagerName");
            return (Criteria) this;
        }

        public Criteria andLstCustManagerNameLessThan(String value) {
            addCriterion("LST_CUST_MANAGER_NAME <", value, "lstCustManagerName");
            return (Criteria) this;
        }

        public Criteria andLstCustManagerNameLessThanOrEqualTo(String value) {
            addCriterion("LST_CUST_MANAGER_NAME <=", value, "lstCustManagerName");
            return (Criteria) this;
        }

        public Criteria andLstCustManagerNameLike(String value) {
            addCriterion("LST_CUST_MANAGER_NAME like", value, "lstCustManagerName");
            return (Criteria) this;
        }

        public Criteria andLstCustManagerNameNotLike(String value) {
            addCriterion("LST_CUST_MANAGER_NAME not like", value, "lstCustManagerName");
            return (Criteria) this;
        }

        public Criteria andLstCustManagerNameIn(List<String> values) {
            addCriterion("LST_CUST_MANAGER_NAME in", values, "lstCustManagerName");
            return (Criteria) this;
        }

        public Criteria andLstCustManagerNameNotIn(List<String> values) {
            addCriterion("LST_CUST_MANAGER_NAME not in", values, "lstCustManagerName");
            return (Criteria) this;
        }

        public Criteria andLstCustManagerNameBetween(String value1, String value2) {
            addCriterion("LST_CUST_MANAGER_NAME between", value1, value2, "lstCustManagerName");
            return (Criteria) this;
        }

        public Criteria andLstCustManagerNameNotBetween(String value1, String value2) {
            addCriterion("LST_CUST_MANAGER_NAME not between", value1, value2, "lstCustManagerName");
            return (Criteria) this;
        }

        public Criteria andLstLastOrderDateIsNull() {
            addCriterion("LST_LAST_ORDER_DATE is null");
            return (Criteria) this;
        }

        public Criteria andLstLastOrderDateIsNotNull() {
            addCriterion("LST_LAST_ORDER_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andLstLastOrderDateEqualTo(Date value) {
            addCriterion("LST_LAST_ORDER_DATE =", value, "lstLastOrderDate");
            return (Criteria) this;
        }

        public Criteria andLstLastOrderDateNotEqualTo(Date value) {
            addCriterion("LST_LAST_ORDER_DATE <>", value, "lstLastOrderDate");
            return (Criteria) this;
        }

        public Criteria andLstLastOrderDateGreaterThan(Date value) {
            addCriterion("LST_LAST_ORDER_DATE >", value, "lstLastOrderDate");
            return (Criteria) this;
        }

        public Criteria andLstLastOrderDateGreaterThanOrEqualTo(Date value) {
            addCriterion("LST_LAST_ORDER_DATE >=", value, "lstLastOrderDate");
            return (Criteria) this;
        }

        public Criteria andLstLastOrderDateLessThan(Date value) {
            addCriterion("LST_LAST_ORDER_DATE <", value, "lstLastOrderDate");
            return (Criteria) this;
        }

        public Criteria andLstLastOrderDateLessThanOrEqualTo(Date value) {
            addCriterion("LST_LAST_ORDER_DATE <=", value, "lstLastOrderDate");
            return (Criteria) this;
        }

        public Criteria andLstLastOrderDateIn(List<Date> values) {
            addCriterion("LST_LAST_ORDER_DATE in", values, "lstLastOrderDate");
            return (Criteria) this;
        }

        public Criteria andLstLastOrderDateNotIn(List<Date> values) {
            addCriterion("LST_LAST_ORDER_DATE not in", values, "lstLastOrderDate");
            return (Criteria) this;
        }

        public Criteria andLstLastOrderDateBetween(Date value1, Date value2) {
            addCriterion("LST_LAST_ORDER_DATE between", value1, value2, "lstLastOrderDate");
            return (Criteria) this;
        }

        public Criteria andLstLastOrderDateNotBetween(Date value1, Date value2) {
            addCriterion("LST_LAST_ORDER_DATE not between", value1, value2, "lstLastOrderDate");
            return (Criteria) this;
        }

        public Criteria andLstLostDateIsNull() {
            addCriterion("LST_LOST_DATE is null");
            return (Criteria) this;
        }

        public Criteria andLstLostDateIsNotNull() {
            addCriterion("LST_LOST_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andLstLostDateEqualTo(Date value) {
            addCriterion("LST_LOST_DATE =", value, "lstLostDate");
            return (Criteria) this;
        }

        public Criteria andLstLostDateNotEqualTo(Date value) {
            addCriterion("LST_LOST_DATE <>", value, "lstLostDate");
            return (Criteria) this;
        }

        public Criteria andLstLostDateGreaterThan(Date value) {
            addCriterion("LST_LOST_DATE >", value, "lstLostDate");
            return (Criteria) this;
        }

        public Criteria andLstLostDateGreaterThanOrEqualTo(Date value) {
            addCriterion("LST_LOST_DATE >=", value, "lstLostDate");
            return (Criteria) this;
        }

        public Criteria andLstLostDateLessThan(Date value) {
            addCriterion("LST_LOST_DATE <", value, "lstLostDate");
            return (Criteria) this;
        }

        public Criteria andLstLostDateLessThanOrEqualTo(Date value) {
            addCriterion("LST_LOST_DATE <=", value, "lstLostDate");
            return (Criteria) this;
        }

        public Criteria andLstLostDateIn(List<Date> values) {
            addCriterion("LST_LOST_DATE in", values, "lstLostDate");
            return (Criteria) this;
        }

        public Criteria andLstLostDateNotIn(List<Date> values) {
            addCriterion("LST_LOST_DATE not in", values, "lstLostDate");
            return (Criteria) this;
        }

        public Criteria andLstLostDateBetween(Date value1, Date value2) {
            addCriterion("LST_LOST_DATE between", value1, value2, "lstLostDate");
            return (Criteria) this;
        }

        public Criteria andLstLostDateNotBetween(Date value1, Date value2) {
            addCriterion("LST_LOST_DATE not between", value1, value2, "lstLostDate");
            return (Criteria) this;
        }

        public Criteria andLstDelayIsNull() {
            addCriterion("LST_DELAY is null");
            return (Criteria) this;
        }

        public Criteria andLstDelayIsNotNull() {
            addCriterion("LST_DELAY is not null");
            return (Criteria) this;
        }

        public Criteria andLstDelayEqualTo(String value) {
            addCriterion("LST_DELAY =", value, "lstDelay");
            return (Criteria) this;
        }

        public Criteria andLstDelayNotEqualTo(String value) {
            addCriterion("LST_DELAY <>", value, "lstDelay");
            return (Criteria) this;
        }

        public Criteria andLstDelayGreaterThan(String value) {
            addCriterion("LST_DELAY >", value, "lstDelay");
            return (Criteria) this;
        }

        public Criteria andLstDelayGreaterThanOrEqualTo(String value) {
            addCriterion("LST_DELAY >=", value, "lstDelay");
            return (Criteria) this;
        }

        public Criteria andLstDelayLessThan(String value) {
            addCriterion("LST_DELAY <", value, "lstDelay");
            return (Criteria) this;
        }

        public Criteria andLstDelayLessThanOrEqualTo(String value) {
            addCriterion("LST_DELAY <=", value, "lstDelay");
            return (Criteria) this;
        }

        public Criteria andLstDelayLike(String value) {
            addCriterion("LST_DELAY like", value, "lstDelay");
            return (Criteria) this;
        }

        public Criteria andLstDelayNotLike(String value) {
            addCriterion("LST_DELAY not like", value, "lstDelay");
            return (Criteria) this;
        }

        public Criteria andLstDelayIn(List<String> values) {
            addCriterion("LST_DELAY in", values, "lstDelay");
            return (Criteria) this;
        }

        public Criteria andLstDelayNotIn(List<String> values) {
            addCriterion("LST_DELAY not in", values, "lstDelay");
            return (Criteria) this;
        }

        public Criteria andLstDelayBetween(String value1, String value2) {
            addCriterion("LST_DELAY between", value1, value2, "lstDelay");
            return (Criteria) this;
        }

        public Criteria andLstDelayNotBetween(String value1, String value2) {
            addCriterion("LST_DELAY not between", value1, value2, "lstDelay");
            return (Criteria) this;
        }

        public Criteria andLstReasonIsNull() {
            addCriterion("LST_REASON is null");
            return (Criteria) this;
        }

        public Criteria andLstReasonIsNotNull() {
            addCriterion("LST_REASON is not null");
            return (Criteria) this;
        }

        public Criteria andLstReasonEqualTo(String value) {
            addCriterion("LST_REASON =", value, "lstReason");
            return (Criteria) this;
        }

        public Criteria andLstReasonNotEqualTo(String value) {
            addCriterion("LST_REASON <>", value, "lstReason");
            return (Criteria) this;
        }

        public Criteria andLstReasonGreaterThan(String value) {
            addCriterion("LST_REASON >", value, "lstReason");
            return (Criteria) this;
        }

        public Criteria andLstReasonGreaterThanOrEqualTo(String value) {
            addCriterion("LST_REASON >=", value, "lstReason");
            return (Criteria) this;
        }

        public Criteria andLstReasonLessThan(String value) {
            addCriterion("LST_REASON <", value, "lstReason");
            return (Criteria) this;
        }

        public Criteria andLstReasonLessThanOrEqualTo(String value) {
            addCriterion("LST_REASON <=", value, "lstReason");
            return (Criteria) this;
        }

        public Criteria andLstReasonLike(String value) {
            addCriterion("LST_REASON like", value, "lstReason");
            return (Criteria) this;
        }

        public Criteria andLstReasonNotLike(String value) {
            addCriterion("LST_REASON not like", value, "lstReason");
            return (Criteria) this;
        }

        public Criteria andLstReasonIn(List<String> values) {
            addCriterion("LST_REASON in", values, "lstReason");
            return (Criteria) this;
        }

        public Criteria andLstReasonNotIn(List<String> values) {
            addCriterion("LST_REASON not in", values, "lstReason");
            return (Criteria) this;
        }

        public Criteria andLstReasonBetween(String value1, String value2) {
            addCriterion("LST_REASON between", value1, value2, "lstReason");
            return (Criteria) this;
        }

        public Criteria andLstReasonNotBetween(String value1, String value2) {
            addCriterion("LST_REASON not between", value1, value2, "lstReason");
            return (Criteria) this;
        }

        public Criteria andLstStatusIsNull() {
            addCriterion("\" LST_STATUS\" is null");
            return (Criteria) this;
        }

        public Criteria andLstStatusIsNotNull() {
            addCriterion("\" LST_STATUS\" is not null");
            return (Criteria) this;
        }

        public Criteria andLstStatusEqualTo(Short value) {
            addCriterion("\" LST_STATUS\" =", value, "lstStatus");
            return (Criteria) this;
        }

        public Criteria andLstStatusNotEqualTo(Short value) {
            addCriterion("\" LST_STATUS\" <>", value, "lstStatus");
            return (Criteria) this;
        }

        public Criteria andLstStatusGreaterThan(Short value) {
            addCriterion("\" LST_STATUS\" >", value, "lstStatus");
            return (Criteria) this;
        }

        public Criteria andLstStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("\" LST_STATUS\" >=", value, "lstStatus");
            return (Criteria) this;
        }

        public Criteria andLstStatusLessThan(Short value) {
            addCriterion("\" LST_STATUS\" <", value, "lstStatus");
            return (Criteria) this;
        }

        public Criteria andLstStatusLessThanOrEqualTo(Short value) {
            addCriterion("\" LST_STATUS\" <=", value, "lstStatus");
            return (Criteria) this;
        }

        public Criteria andLstStatusIn(List<Short> values) {
            addCriterion("\" LST_STATUS\" in", values, "lstStatus");
            return (Criteria) this;
        }

        public Criteria andLstStatusNotIn(List<Short> values) {
            addCriterion("\" LST_STATUS\" not in", values, "lstStatus");
            return (Criteria) this;
        }

        public Criteria andLstStatusBetween(Short value1, Short value2) {
            addCriterion("\" LST_STATUS\" between", value1, value2, "lstStatus");
            return (Criteria) this;
        }

        public Criteria andLstStatusNotBetween(Short value1, Short value2) {
            addCriterion("\" LST_STATUS\" not between", value1, value2, "lstStatus");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}