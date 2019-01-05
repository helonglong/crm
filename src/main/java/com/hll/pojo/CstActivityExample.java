package com.hll.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CstActivityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CstActivityExample() {
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

        public Criteria andAtvIdIsNull() {
            addCriterion("ATV_ID is null");
            return (Criteria) this;
        }

        public Criteria andAtvIdIsNotNull() {
            addCriterion("ATV_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAtvIdEqualTo(Integer value) {
            addCriterion("ATV_ID =", value, "atvId");
            return (Criteria) this;
        }

        public Criteria andAtvIdNotEqualTo(Integer value) {
            addCriterion("ATV_ID <>", value, "atvId");
            return (Criteria) this;
        }

        public Criteria andAtvIdGreaterThan(Integer value) {
            addCriterion("ATV_ID >", value, "atvId");
            return (Criteria) this;
        }

        public Criteria andAtvIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ATV_ID >=", value, "atvId");
            return (Criteria) this;
        }

        public Criteria andAtvIdLessThan(Integer value) {
            addCriterion("ATV_ID <", value, "atvId");
            return (Criteria) this;
        }

        public Criteria andAtvIdLessThanOrEqualTo(Integer value) {
            addCriterion("ATV_ID <=", value, "atvId");
            return (Criteria) this;
        }

        public Criteria andAtvIdIn(List<Integer> values) {
            addCriterion("ATV_ID in", values, "atvId");
            return (Criteria) this;
        }

        public Criteria andAtvIdNotIn(List<Integer> values) {
            addCriterion("ATV_ID not in", values, "atvId");
            return (Criteria) this;
        }

        public Criteria andAtvIdBetween(Integer value1, Integer value2) {
            addCriterion("ATV_ID between", value1, value2, "atvId");
            return (Criteria) this;
        }

        public Criteria andAtvIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ATV_ID not between", value1, value2, "atvId");
            return (Criteria) this;
        }

        public Criteria andAtvCustNoIsNull() {
            addCriterion("ATV_CUST_NO is null");
            return (Criteria) this;
        }

        public Criteria andAtvCustNoIsNotNull() {
            addCriterion("ATV_CUST_NO is not null");
            return (Criteria) this;
        }

        public Criteria andAtvCustNoEqualTo(String value) {
            addCriterion("ATV_CUST_NO =", value, "atvCustNo");
            return (Criteria) this;
        }

        public Criteria andAtvCustNoNotEqualTo(String value) {
            addCriterion("ATV_CUST_NO <>", value, "atvCustNo");
            return (Criteria) this;
        }

        public Criteria andAtvCustNoGreaterThan(String value) {
            addCriterion("ATV_CUST_NO >", value, "atvCustNo");
            return (Criteria) this;
        }

        public Criteria andAtvCustNoGreaterThanOrEqualTo(String value) {
            addCriterion("ATV_CUST_NO >=", value, "atvCustNo");
            return (Criteria) this;
        }

        public Criteria andAtvCustNoLessThan(String value) {
            addCriterion("ATV_CUST_NO <", value, "atvCustNo");
            return (Criteria) this;
        }

        public Criteria andAtvCustNoLessThanOrEqualTo(String value) {
            addCriterion("ATV_CUST_NO <=", value, "atvCustNo");
            return (Criteria) this;
        }

        public Criteria andAtvCustNoLike(String value) {
            addCriterion("ATV_CUST_NO like", value, "atvCustNo");
            return (Criteria) this;
        }

        public Criteria andAtvCustNoNotLike(String value) {
            addCriterion("ATV_CUST_NO not like", value, "atvCustNo");
            return (Criteria) this;
        }

        public Criteria andAtvCustNoIn(List<String> values) {
            addCriterion("ATV_CUST_NO in", values, "atvCustNo");
            return (Criteria) this;
        }

        public Criteria andAtvCustNoNotIn(List<String> values) {
            addCriterion("ATV_CUST_NO not in", values, "atvCustNo");
            return (Criteria) this;
        }

        public Criteria andAtvCustNoBetween(String value1, String value2) {
            addCriterion("ATV_CUST_NO between", value1, value2, "atvCustNo");
            return (Criteria) this;
        }

        public Criteria andAtvCustNoNotBetween(String value1, String value2) {
            addCriterion("ATV_CUST_NO not between", value1, value2, "atvCustNo");
            return (Criteria) this;
        }

        public Criteria andAtvDateIsNull() {
            addCriterion("ATV_DATE is null");
            return (Criteria) this;
        }

        public Criteria andAtvDateIsNotNull() {
            addCriterion("ATV_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andAtvDateEqualTo(Date value) {
            addCriterion("ATV_DATE =", value, "atvDate");
            return (Criteria) this;
        }

        public Criteria andAtvDateNotEqualTo(Date value) {
            addCriterion("ATV_DATE <>", value, "atvDate");
            return (Criteria) this;
        }

        public Criteria andAtvDateGreaterThan(Date value) {
            addCriterion("ATV_DATE >", value, "atvDate");
            return (Criteria) this;
        }

        public Criteria andAtvDateGreaterThanOrEqualTo(Date value) {
            addCriterion("ATV_DATE >=", value, "atvDate");
            return (Criteria) this;
        }

        public Criteria andAtvDateLessThan(Date value) {
            addCriterion("ATV_DATE <", value, "atvDate");
            return (Criteria) this;
        }

        public Criteria andAtvDateLessThanOrEqualTo(Date value) {
            addCriterion("ATV_DATE <=", value, "atvDate");
            return (Criteria) this;
        }

        public Criteria andAtvDateIn(List<Date> values) {
            addCriterion("ATV_DATE in", values, "atvDate");
            return (Criteria) this;
        }

        public Criteria andAtvDateNotIn(List<Date> values) {
            addCriterion("ATV_DATE not in", values, "atvDate");
            return (Criteria) this;
        }

        public Criteria andAtvDateBetween(Date value1, Date value2) {
            addCriterion("ATV_DATE between", value1, value2, "atvDate");
            return (Criteria) this;
        }

        public Criteria andAtvDateNotBetween(Date value1, Date value2) {
            addCriterion("ATV_DATE not between", value1, value2, "atvDate");
            return (Criteria) this;
        }

        public Criteria andAtvPlaceIsNull() {
            addCriterion("ATV_PLACE is null");
            return (Criteria) this;
        }

        public Criteria andAtvPlaceIsNotNull() {
            addCriterion("ATV_PLACE is not null");
            return (Criteria) this;
        }

        public Criteria andAtvPlaceEqualTo(String value) {
            addCriterion("ATV_PLACE =", value, "atvPlace");
            return (Criteria) this;
        }

        public Criteria andAtvPlaceNotEqualTo(String value) {
            addCriterion("ATV_PLACE <>", value, "atvPlace");
            return (Criteria) this;
        }

        public Criteria andAtvPlaceGreaterThan(String value) {
            addCriterion("ATV_PLACE >", value, "atvPlace");
            return (Criteria) this;
        }

        public Criteria andAtvPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("ATV_PLACE >=", value, "atvPlace");
            return (Criteria) this;
        }

        public Criteria andAtvPlaceLessThan(String value) {
            addCriterion("ATV_PLACE <", value, "atvPlace");
            return (Criteria) this;
        }

        public Criteria andAtvPlaceLessThanOrEqualTo(String value) {
            addCriterion("ATV_PLACE <=", value, "atvPlace");
            return (Criteria) this;
        }

        public Criteria andAtvPlaceLike(String value) {
            addCriterion("ATV_PLACE like", value, "atvPlace");
            return (Criteria) this;
        }

        public Criteria andAtvPlaceNotLike(String value) {
            addCriterion("ATV_PLACE not like", value, "atvPlace");
            return (Criteria) this;
        }

        public Criteria andAtvPlaceIn(List<String> values) {
            addCriterion("ATV_PLACE in", values, "atvPlace");
            return (Criteria) this;
        }

        public Criteria andAtvPlaceNotIn(List<String> values) {
            addCriterion("ATV_PLACE not in", values, "atvPlace");
            return (Criteria) this;
        }

        public Criteria andAtvPlaceBetween(String value1, String value2) {
            addCriterion("ATV_PLACE between", value1, value2, "atvPlace");
            return (Criteria) this;
        }

        public Criteria andAtvPlaceNotBetween(String value1, String value2) {
            addCriterion("ATV_PLACE not between", value1, value2, "atvPlace");
            return (Criteria) this;
        }

        public Criteria andAtvTitleIsNull() {
            addCriterion("ATV_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andAtvTitleIsNotNull() {
            addCriterion("ATV_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andAtvTitleEqualTo(String value) {
            addCriterion("ATV_TITLE =", value, "atvTitle");
            return (Criteria) this;
        }

        public Criteria andAtvTitleNotEqualTo(String value) {
            addCriterion("ATV_TITLE <>", value, "atvTitle");
            return (Criteria) this;
        }

        public Criteria andAtvTitleGreaterThan(String value) {
            addCriterion("ATV_TITLE >", value, "atvTitle");
            return (Criteria) this;
        }

        public Criteria andAtvTitleGreaterThanOrEqualTo(String value) {
            addCriterion("ATV_TITLE >=", value, "atvTitle");
            return (Criteria) this;
        }

        public Criteria andAtvTitleLessThan(String value) {
            addCriterion("ATV_TITLE <", value, "atvTitle");
            return (Criteria) this;
        }

        public Criteria andAtvTitleLessThanOrEqualTo(String value) {
            addCriterion("ATV_TITLE <=", value, "atvTitle");
            return (Criteria) this;
        }

        public Criteria andAtvTitleLike(String value) {
            addCriterion("ATV_TITLE like", value, "atvTitle");
            return (Criteria) this;
        }

        public Criteria andAtvTitleNotLike(String value) {
            addCriterion("ATV_TITLE not like", value, "atvTitle");
            return (Criteria) this;
        }

        public Criteria andAtvTitleIn(List<String> values) {
            addCriterion("ATV_TITLE in", values, "atvTitle");
            return (Criteria) this;
        }

        public Criteria andAtvTitleNotIn(List<String> values) {
            addCriterion("ATV_TITLE not in", values, "atvTitle");
            return (Criteria) this;
        }

        public Criteria andAtvTitleBetween(String value1, String value2) {
            addCriterion("ATV_TITLE between", value1, value2, "atvTitle");
            return (Criteria) this;
        }

        public Criteria andAtvTitleNotBetween(String value1, String value2) {
            addCriterion("ATV_TITLE not between", value1, value2, "atvTitle");
            return (Criteria) this;
        }

        public Criteria andAtvRemarkIsNull() {
            addCriterion("ATV_REMARK is null");
            return (Criteria) this;
        }

        public Criteria andAtvRemarkIsNotNull() {
            addCriterion("ATV_REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andAtvRemarkEqualTo(String value) {
            addCriterion("ATV_REMARK =", value, "atvRemark");
            return (Criteria) this;
        }

        public Criteria andAtvRemarkNotEqualTo(String value) {
            addCriterion("ATV_REMARK <>", value, "atvRemark");
            return (Criteria) this;
        }

        public Criteria andAtvRemarkGreaterThan(String value) {
            addCriterion("ATV_REMARK >", value, "atvRemark");
            return (Criteria) this;
        }

        public Criteria andAtvRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("ATV_REMARK >=", value, "atvRemark");
            return (Criteria) this;
        }

        public Criteria andAtvRemarkLessThan(String value) {
            addCriterion("ATV_REMARK <", value, "atvRemark");
            return (Criteria) this;
        }

        public Criteria andAtvRemarkLessThanOrEqualTo(String value) {
            addCriterion("ATV_REMARK <=", value, "atvRemark");
            return (Criteria) this;
        }

        public Criteria andAtvRemarkLike(String value) {
            addCriterion("ATV_REMARK like", value, "atvRemark");
            return (Criteria) this;
        }

        public Criteria andAtvRemarkNotLike(String value) {
            addCriterion("ATV_REMARK not like", value, "atvRemark");
            return (Criteria) this;
        }

        public Criteria andAtvRemarkIn(List<String> values) {
            addCriterion("ATV_REMARK in", values, "atvRemark");
            return (Criteria) this;
        }

        public Criteria andAtvRemarkNotIn(List<String> values) {
            addCriterion("ATV_REMARK not in", values, "atvRemark");
            return (Criteria) this;
        }

        public Criteria andAtvRemarkBetween(String value1, String value2) {
            addCriterion("ATV_REMARK between", value1, value2, "atvRemark");
            return (Criteria) this;
        }

        public Criteria andAtvRemarkNotBetween(String value1, String value2) {
            addCriterion("ATV_REMARK not between", value1, value2, "atvRemark");
            return (Criteria) this;
        }

        public Criteria andAtvDescIsNull() {
            addCriterion("ATV_DESC is null");
            return (Criteria) this;
        }

        public Criteria andAtvDescIsNotNull() {
            addCriterion("ATV_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andAtvDescEqualTo(String value) {
            addCriterion("ATV_DESC =", value, "atvDesc");
            return (Criteria) this;
        }

        public Criteria andAtvDescNotEqualTo(String value) {
            addCriterion("ATV_DESC <>", value, "atvDesc");
            return (Criteria) this;
        }

        public Criteria andAtvDescGreaterThan(String value) {
            addCriterion("ATV_DESC >", value, "atvDesc");
            return (Criteria) this;
        }

        public Criteria andAtvDescGreaterThanOrEqualTo(String value) {
            addCriterion("ATV_DESC >=", value, "atvDesc");
            return (Criteria) this;
        }

        public Criteria andAtvDescLessThan(String value) {
            addCriterion("ATV_DESC <", value, "atvDesc");
            return (Criteria) this;
        }

        public Criteria andAtvDescLessThanOrEqualTo(String value) {
            addCriterion("ATV_DESC <=", value, "atvDesc");
            return (Criteria) this;
        }

        public Criteria andAtvDescLike(String value) {
            addCriterion("ATV_DESC like", value, "atvDesc");
            return (Criteria) this;
        }

        public Criteria andAtvDescNotLike(String value) {
            addCriterion("ATV_DESC not like", value, "atvDesc");
            return (Criteria) this;
        }

        public Criteria andAtvDescIn(List<String> values) {
            addCriterion("ATV_DESC in", values, "atvDesc");
            return (Criteria) this;
        }

        public Criteria andAtvDescNotIn(List<String> values) {
            addCriterion("ATV_DESC not in", values, "atvDesc");
            return (Criteria) this;
        }

        public Criteria andAtvDescBetween(String value1, String value2) {
            addCriterion("ATV_DESC between", value1, value2, "atvDesc");
            return (Criteria) this;
        }

        public Criteria andAtvDescNotBetween(String value1, String value2) {
            addCriterion("ATV_DESC not between", value1, value2, "atvDesc");
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