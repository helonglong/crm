package com.hll.pojo;

import java.util.ArrayList;
import java.util.List;

public class BasDictExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BasDictExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andDictIdIsNull() {
            addCriterion("DICT_ID is null");
            return (Criteria) this;
        }

        public Criteria andDictIdIsNotNull() {
            addCriterion("DICT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDictIdEqualTo(Integer value) {
            addCriterion("DICT_ID =", value, "dictId");
            return (Criteria) this;
        }

        public Criteria andDictIdNotEqualTo(Integer value) {
            addCriterion("DICT_ID <>", value, "dictId");
            return (Criteria) this;
        }

        public Criteria andDictIdGreaterThan(Integer value) {
            addCriterion("DICT_ID >", value, "dictId");
            return (Criteria) this;
        }

        public Criteria andDictIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("DICT_ID >=", value, "dictId");
            return (Criteria) this;
        }

        public Criteria andDictIdLessThan(Integer value) {
            addCriterion("DICT_ID <", value, "dictId");
            return (Criteria) this;
        }

        public Criteria andDictIdLessThanOrEqualTo(Integer value) {
            addCriterion("DICT_ID <=", value, "dictId");
            return (Criteria) this;
        }

        public Criteria andDictIdIn(List<Integer> values) {
            addCriterion("DICT_ID in", values, "dictId");
            return (Criteria) this;
        }

        public Criteria andDictIdNotIn(List<Integer> values) {
            addCriterion("DICT_ID not in", values, "dictId");
            return (Criteria) this;
        }

        public Criteria andDictIdBetween(Integer value1, Integer value2) {
            addCriterion("DICT_ID between", value1, value2, "dictId");
            return (Criteria) this;
        }

        public Criteria andDictIdNotBetween(Integer value1, Integer value2) {
            addCriterion("DICT_ID not between", value1, value2, "dictId");
            return (Criteria) this;
        }

        public Criteria andDictTypeIsNull() {
            addCriterion("DICT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andDictTypeIsNotNull() {
            addCriterion("DICT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andDictTypeEqualTo(String value) {
            addCriterion("DICT_TYPE =", value, "dictType");
            return (Criteria) this;
        }

        public Criteria andDictTypeNotEqualTo(String value) {
            addCriterion("DICT_TYPE <>", value, "dictType");
            return (Criteria) this;
        }

        public Criteria andDictTypeGreaterThan(String value) {
            addCriterion("DICT_TYPE >", value, "dictType");
            return (Criteria) this;
        }

        public Criteria andDictTypeGreaterThanOrEqualTo(String value) {
            addCriterion("DICT_TYPE >=", value, "dictType");
            return (Criteria) this;
        }

        public Criteria andDictTypeLessThan(String value) {
            addCriterion("DICT_TYPE <", value, "dictType");
            return (Criteria) this;
        }

        public Criteria andDictTypeLessThanOrEqualTo(String value) {
            addCriterion("DICT_TYPE <=", value, "dictType");
            return (Criteria) this;
        }

        public Criteria andDictTypeLike(String value) {
            addCriterion("DICT_TYPE like", value, "dictType");
            return (Criteria) this;
        }

        public Criteria andDictTypeNotLike(String value) {
            addCriterion("DICT_TYPE not like", value, "dictType");
            return (Criteria) this;
        }

        public Criteria andDictTypeIn(List<String> values) {
            addCriterion("DICT_TYPE in", values, "dictType");
            return (Criteria) this;
        }

        public Criteria andDictTypeNotIn(List<String> values) {
            addCriterion("DICT_TYPE not in", values, "dictType");
            return (Criteria) this;
        }

        public Criteria andDictTypeBetween(String value1, String value2) {
            addCriterion("DICT_TYPE between", value1, value2, "dictType");
            return (Criteria) this;
        }

        public Criteria andDictTypeNotBetween(String value1, String value2) {
            addCriterion("DICT_TYPE not between", value1, value2, "dictType");
            return (Criteria) this;
        }

        public Criteria andDictItemIsNull() {
            addCriterion("DICT_ITEM is null");
            return (Criteria) this;
        }

        public Criteria andDictItemIsNotNull() {
            addCriterion("DICT_ITEM is not null");
            return (Criteria) this;
        }

        public Criteria andDictItemEqualTo(String value) {
            addCriterion("DICT_ITEM =", value, "dictItem");
            return (Criteria) this;
        }

        public Criteria andDictItemNotEqualTo(String value) {
            addCriterion("DICT_ITEM <>", value, "dictItem");
            return (Criteria) this;
        }

        public Criteria andDictItemGreaterThan(String value) {
            addCriterion("DICT_ITEM >", value, "dictItem");
            return (Criteria) this;
        }

        public Criteria andDictItemGreaterThanOrEqualTo(String value) {
            addCriterion("DICT_ITEM >=", value, "dictItem");
            return (Criteria) this;
        }

        public Criteria andDictItemLessThan(String value) {
            addCriterion("DICT_ITEM <", value, "dictItem");
            return (Criteria) this;
        }

        public Criteria andDictItemLessThanOrEqualTo(String value) {
            addCriterion("DICT_ITEM <=", value, "dictItem");
            return (Criteria) this;
        }

        public Criteria andDictItemLike(String value) {
            addCriterion("DICT_ITEM like", value, "dictItem");
            return (Criteria) this;
        }

        public Criteria andDictItemNotLike(String value) {
            addCriterion("DICT_ITEM not like", value, "dictItem");
            return (Criteria) this;
        }

        public Criteria andDictItemIn(List<String> values) {
            addCriterion("DICT_ITEM in", values, "dictItem");
            return (Criteria) this;
        }

        public Criteria andDictItemNotIn(List<String> values) {
            addCriterion("DICT_ITEM not in", values, "dictItem");
            return (Criteria) this;
        }

        public Criteria andDictItemBetween(String value1, String value2) {
            addCriterion("DICT_ITEM between", value1, value2, "dictItem");
            return (Criteria) this;
        }

        public Criteria andDictItemNotBetween(String value1, String value2) {
            addCriterion("DICT_ITEM not between", value1, value2, "dictItem");
            return (Criteria) this;
        }

        public Criteria andDictValueIsNull() {
            addCriterion("DICT_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andDictValueIsNotNull() {
            addCriterion("DICT_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andDictValueEqualTo(String value) {
            addCriterion("DICT_VALUE =", value, "dictValue");
            return (Criteria) this;
        }

        public Criteria andDictValueNotEqualTo(String value) {
            addCriterion("DICT_VALUE <>", value, "dictValue");
            return (Criteria) this;
        }

        public Criteria andDictValueGreaterThan(String value) {
            addCriterion("DICT_VALUE >", value, "dictValue");
            return (Criteria) this;
        }

        public Criteria andDictValueGreaterThanOrEqualTo(String value) {
            addCriterion("DICT_VALUE >=", value, "dictValue");
            return (Criteria) this;
        }

        public Criteria andDictValueLessThan(String value) {
            addCriterion("DICT_VALUE <", value, "dictValue");
            return (Criteria) this;
        }

        public Criteria andDictValueLessThanOrEqualTo(String value) {
            addCriterion("DICT_VALUE <=", value, "dictValue");
            return (Criteria) this;
        }

        public Criteria andDictValueLike(String value) {
            addCriterion("DICT_VALUE like", value, "dictValue");
            return (Criteria) this;
        }

        public Criteria andDictValueNotLike(String value) {
            addCriterion("DICT_VALUE not like", value, "dictValue");
            return (Criteria) this;
        }

        public Criteria andDictValueIn(List<String> values) {
            addCriterion("DICT_VALUE in", values, "dictValue");
            return (Criteria) this;
        }

        public Criteria andDictValueNotIn(List<String> values) {
            addCriterion("DICT_VALUE not in", values, "dictValue");
            return (Criteria) this;
        }

        public Criteria andDictValueBetween(String value1, String value2) {
            addCriterion("DICT_VALUE between", value1, value2, "dictValue");
            return (Criteria) this;
        }

        public Criteria andDictValueNotBetween(String value1, String value2) {
            addCriterion("DICT_VALUE not between", value1, value2, "dictValue");
            return (Criteria) this;
        }

        public Criteria andDictIsEditableIsNull() {
            addCriterion("DICT_IS_EDITABLE is null");
            return (Criteria) this;
        }

        public Criteria andDictIsEditableIsNotNull() {
            addCriterion("DICT_IS_EDITABLE is not null");
            return (Criteria) this;
        }

        public Criteria andDictIsEditableEqualTo(Integer value) {
            addCriterion("DICT_IS_EDITABLE =", value, "dictIsEditable");
            return (Criteria) this;
        }

        public Criteria andDictIsEditableNotEqualTo(Integer value) {
            addCriterion("DICT_IS_EDITABLE <>", value, "dictIsEditable");
            return (Criteria) this;
        }

        public Criteria andDictIsEditableGreaterThan(Integer value) {
            addCriterion("DICT_IS_EDITABLE >", value, "dictIsEditable");
            return (Criteria) this;
        }

        public Criteria andDictIsEditableGreaterThanOrEqualTo(Integer value) {
            addCriterion("DICT_IS_EDITABLE >=", value, "dictIsEditable");
            return (Criteria) this;
        }

        public Criteria andDictIsEditableLessThan(Integer value) {
            addCriterion("DICT_IS_EDITABLE <", value, "dictIsEditable");
            return (Criteria) this;
        }

        public Criteria andDictIsEditableLessThanOrEqualTo(Integer value) {
            addCriterion("DICT_IS_EDITABLE <=", value, "dictIsEditable");
            return (Criteria) this;
        }

        public Criteria andDictIsEditableIn(List<Integer> values) {
            addCriterion("DICT_IS_EDITABLE in", values, "dictIsEditable");
            return (Criteria) this;
        }

        public Criteria andDictIsEditableNotIn(List<Integer> values) {
            addCriterion("DICT_IS_EDITABLE not in", values, "dictIsEditable");
            return (Criteria) this;
        }

        public Criteria andDictIsEditableBetween(Integer value1, Integer value2) {
            addCriterion("DICT_IS_EDITABLE between", value1, value2, "dictIsEditable");
            return (Criteria) this;
        }

        public Criteria andDictIsEditableNotBetween(Integer value1, Integer value2) {
            addCriterion("DICT_IS_EDITABLE not between", value1, value2, "dictIsEditable");
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