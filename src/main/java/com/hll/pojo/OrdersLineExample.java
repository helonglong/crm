package com.hll.pojo;

import java.util.ArrayList;
import java.util.List;

public class OrdersLineExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrdersLineExample() {
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

        public Criteria andOddIdIsNull() {
            addCriterion("ODD_ID is null");
            return (Criteria) this;
        }

        public Criteria andOddIdIsNotNull() {
            addCriterion("ODD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOddIdEqualTo(Integer value) {
            addCriterion("ODD_ID =", value, "oddId");
            return (Criteria) this;
        }

        public Criteria andOddIdNotEqualTo(Integer value) {
            addCriterion("ODD_ID <>", value, "oddId");
            return (Criteria) this;
        }

        public Criteria andOddIdGreaterThan(Integer value) {
            addCriterion("ODD_ID >", value, "oddId");
            return (Criteria) this;
        }

        public Criteria andOddIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ODD_ID >=", value, "oddId");
            return (Criteria) this;
        }

        public Criteria andOddIdLessThan(Integer value) {
            addCriterion("ODD_ID <", value, "oddId");
            return (Criteria) this;
        }

        public Criteria andOddIdLessThanOrEqualTo(Integer value) {
            addCriterion("ODD_ID <=", value, "oddId");
            return (Criteria) this;
        }

        public Criteria andOddIdIn(List<Integer> values) {
            addCriterion("ODD_ID in", values, "oddId");
            return (Criteria) this;
        }

        public Criteria andOddIdNotIn(List<Integer> values) {
            addCriterion("ODD_ID not in", values, "oddId");
            return (Criteria) this;
        }

        public Criteria andOddIdBetween(Integer value1, Integer value2) {
            addCriterion("ODD_ID between", value1, value2, "oddId");
            return (Criteria) this;
        }

        public Criteria andOddIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ODD_ID not between", value1, value2, "oddId");
            return (Criteria) this;
        }

        public Criteria andOddOrderIdIsNull() {
            addCriterion("ODD_ORDER_ID is null");
            return (Criteria) this;
        }

        public Criteria andOddOrderIdIsNotNull() {
            addCriterion("ODD_ORDER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOddOrderIdEqualTo(Integer value) {
            addCriterion("ODD_ORDER_ID =", value, "oddOrderId");
            return (Criteria) this;
        }

        public Criteria andOddOrderIdNotEqualTo(Integer value) {
            addCriterion("ODD_ORDER_ID <>", value, "oddOrderId");
            return (Criteria) this;
        }

        public Criteria andOddOrderIdGreaterThan(Integer value) {
            addCriterion("ODD_ORDER_ID >", value, "oddOrderId");
            return (Criteria) this;
        }

        public Criteria andOddOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ODD_ORDER_ID >=", value, "oddOrderId");
            return (Criteria) this;
        }

        public Criteria andOddOrderIdLessThan(Integer value) {
            addCriterion("ODD_ORDER_ID <", value, "oddOrderId");
            return (Criteria) this;
        }

        public Criteria andOddOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("ODD_ORDER_ID <=", value, "oddOrderId");
            return (Criteria) this;
        }

        public Criteria andOddOrderIdIn(List<Integer> values) {
            addCriterion("ODD_ORDER_ID in", values, "oddOrderId");
            return (Criteria) this;
        }

        public Criteria andOddOrderIdNotIn(List<Integer> values) {
            addCriterion("ODD_ORDER_ID not in", values, "oddOrderId");
            return (Criteria) this;
        }

        public Criteria andOddOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("ODD_ORDER_ID between", value1, value2, "oddOrderId");
            return (Criteria) this;
        }

        public Criteria andOddOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ODD_ORDER_ID not between", value1, value2, "oddOrderId");
            return (Criteria) this;
        }

        public Criteria andOddProdIdIsNull() {
            addCriterion("ODD_PROD_ID is null");
            return (Criteria) this;
        }

        public Criteria andOddProdIdIsNotNull() {
            addCriterion("ODD_PROD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOddProdIdEqualTo(Integer value) {
            addCriterion("ODD_PROD_ID =", value, "oddProdId");
            return (Criteria) this;
        }

        public Criteria andOddProdIdNotEqualTo(Integer value) {
            addCriterion("ODD_PROD_ID <>", value, "oddProdId");
            return (Criteria) this;
        }

        public Criteria andOddProdIdGreaterThan(Integer value) {
            addCriterion("ODD_PROD_ID >", value, "oddProdId");
            return (Criteria) this;
        }

        public Criteria andOddProdIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ODD_PROD_ID >=", value, "oddProdId");
            return (Criteria) this;
        }

        public Criteria andOddProdIdLessThan(Integer value) {
            addCriterion("ODD_PROD_ID <", value, "oddProdId");
            return (Criteria) this;
        }

        public Criteria andOddProdIdLessThanOrEqualTo(Integer value) {
            addCriterion("ODD_PROD_ID <=", value, "oddProdId");
            return (Criteria) this;
        }

        public Criteria andOddProdIdIn(List<Integer> values) {
            addCriterion("ODD_PROD_ID in", values, "oddProdId");
            return (Criteria) this;
        }

        public Criteria andOddProdIdNotIn(List<Integer> values) {
            addCriterion("ODD_PROD_ID not in", values, "oddProdId");
            return (Criteria) this;
        }

        public Criteria andOddProdIdBetween(Integer value1, Integer value2) {
            addCriterion("ODD_PROD_ID between", value1, value2, "oddProdId");
            return (Criteria) this;
        }

        public Criteria andOddProdIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ODD_PROD_ID not between", value1, value2, "oddProdId");
            return (Criteria) this;
        }

        public Criteria andOddCountIsNull() {
            addCriterion("ODD_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andOddCountIsNotNull() {
            addCriterion("ODD_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andOddCountEqualTo(Integer value) {
            addCriterion("ODD_COUNT =", value, "oddCount");
            return (Criteria) this;
        }

        public Criteria andOddCountNotEqualTo(Integer value) {
            addCriterion("ODD_COUNT <>", value, "oddCount");
            return (Criteria) this;
        }

        public Criteria andOddCountGreaterThan(Integer value) {
            addCriterion("ODD_COUNT >", value, "oddCount");
            return (Criteria) this;
        }

        public Criteria andOddCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("ODD_COUNT >=", value, "oddCount");
            return (Criteria) this;
        }

        public Criteria andOddCountLessThan(Integer value) {
            addCriterion("ODD_COUNT <", value, "oddCount");
            return (Criteria) this;
        }

        public Criteria andOddCountLessThanOrEqualTo(Integer value) {
            addCriterion("ODD_COUNT <=", value, "oddCount");
            return (Criteria) this;
        }

        public Criteria andOddCountIn(List<Integer> values) {
            addCriterion("ODD_COUNT in", values, "oddCount");
            return (Criteria) this;
        }

        public Criteria andOddCountNotIn(List<Integer> values) {
            addCriterion("ODD_COUNT not in", values, "oddCount");
            return (Criteria) this;
        }

        public Criteria andOddCountBetween(Integer value1, Integer value2) {
            addCriterion("ODD_COUNT between", value1, value2, "oddCount");
            return (Criteria) this;
        }

        public Criteria andOddCountNotBetween(Integer value1, Integer value2) {
            addCriterion("ODD_COUNT not between", value1, value2, "oddCount");
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