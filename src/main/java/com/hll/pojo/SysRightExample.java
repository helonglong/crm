package com.hll.pojo;

import java.util.ArrayList;
import java.util.List;

public class SysRightExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysRightExample() {
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

        public Criteria andRightCodeIsNull() {
            addCriterion("RIGHT_CODE is null");
            return (Criteria) this;
        }

        public Criteria andRightCodeIsNotNull() {
            addCriterion("RIGHT_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andRightCodeEqualTo(String value) {
            addCriterion("RIGHT_CODE =", value, "rightCode");
            return (Criteria) this;
        }

        public Criteria andRightCodeNotEqualTo(String value) {
            addCriterion("RIGHT_CODE <>", value, "rightCode");
            return (Criteria) this;
        }

        public Criteria andRightCodeGreaterThan(String value) {
            addCriterion("RIGHT_CODE >", value, "rightCode");
            return (Criteria) this;
        }

        public Criteria andRightCodeGreaterThanOrEqualTo(String value) {
            addCriterion("RIGHT_CODE >=", value, "rightCode");
            return (Criteria) this;
        }

        public Criteria andRightCodeLessThan(String value) {
            addCriterion("RIGHT_CODE <", value, "rightCode");
            return (Criteria) this;
        }

        public Criteria andRightCodeLessThanOrEqualTo(String value) {
            addCriterion("RIGHT_CODE <=", value, "rightCode");
            return (Criteria) this;
        }

        public Criteria andRightCodeLike(String value) {
            addCriterion("RIGHT_CODE like", value, "rightCode");
            return (Criteria) this;
        }

        public Criteria andRightCodeNotLike(String value) {
            addCriterion("RIGHT_CODE not like", value, "rightCode");
            return (Criteria) this;
        }

        public Criteria andRightCodeIn(List<String> values) {
            addCriterion("RIGHT_CODE in", values, "rightCode");
            return (Criteria) this;
        }

        public Criteria andRightCodeNotIn(List<String> values) {
            addCriterion("RIGHT_CODE not in", values, "rightCode");
            return (Criteria) this;
        }

        public Criteria andRightCodeBetween(String value1, String value2) {
            addCriterion("RIGHT_CODE between", value1, value2, "rightCode");
            return (Criteria) this;
        }

        public Criteria andRightCodeNotBetween(String value1, String value2) {
            addCriterion("RIGHT_CODE not between", value1, value2, "rightCode");
            return (Criteria) this;
        }

        public Criteria andRightTextIsNull() {
            addCriterion("RIGHT_TEXT is null");
            return (Criteria) this;
        }

        public Criteria andRightTextIsNotNull() {
            addCriterion("RIGHT_TEXT is not null");
            return (Criteria) this;
        }

        public Criteria andRightTextEqualTo(String value) {
            addCriterion("RIGHT_TEXT =", value, "rightText");
            return (Criteria) this;
        }

        public Criteria andRightTextNotEqualTo(String value) {
            addCriterion("RIGHT_TEXT <>", value, "rightText");
            return (Criteria) this;
        }

        public Criteria andRightTextGreaterThan(String value) {
            addCriterion("RIGHT_TEXT >", value, "rightText");
            return (Criteria) this;
        }

        public Criteria andRightTextGreaterThanOrEqualTo(String value) {
            addCriterion("RIGHT_TEXT >=", value, "rightText");
            return (Criteria) this;
        }

        public Criteria andRightTextLessThan(String value) {
            addCriterion("RIGHT_TEXT <", value, "rightText");
            return (Criteria) this;
        }

        public Criteria andRightTextLessThanOrEqualTo(String value) {
            addCriterion("RIGHT_TEXT <=", value, "rightText");
            return (Criteria) this;
        }

        public Criteria andRightTextLike(String value) {
            addCriterion("RIGHT_TEXT like", value, "rightText");
            return (Criteria) this;
        }

        public Criteria andRightTextNotLike(String value) {
            addCriterion("RIGHT_TEXT not like", value, "rightText");
            return (Criteria) this;
        }

        public Criteria andRightTextIn(List<String> values) {
            addCriterion("RIGHT_TEXT in", values, "rightText");
            return (Criteria) this;
        }

        public Criteria andRightTextNotIn(List<String> values) {
            addCriterion("RIGHT_TEXT not in", values, "rightText");
            return (Criteria) this;
        }

        public Criteria andRightTextBetween(String value1, String value2) {
            addCriterion("RIGHT_TEXT between", value1, value2, "rightText");
            return (Criteria) this;
        }

        public Criteria andRightTextNotBetween(String value1, String value2) {
            addCriterion("RIGHT_TEXT not between", value1, value2, "rightText");
            return (Criteria) this;
        }

        public Criteria andRightUrlIsNull() {
            addCriterion("RIGHT_URL is null");
            return (Criteria) this;
        }

        public Criteria andRightUrlIsNotNull() {
            addCriterion("RIGHT_URL is not null");
            return (Criteria) this;
        }

        public Criteria andRightUrlEqualTo(String value) {
            addCriterion("RIGHT_URL =", value, "rightUrl");
            return (Criteria) this;
        }

        public Criteria andRightUrlNotEqualTo(String value) {
            addCriterion("RIGHT_URL <>", value, "rightUrl");
            return (Criteria) this;
        }

        public Criteria andRightUrlGreaterThan(String value) {
            addCriterion("RIGHT_URL >", value, "rightUrl");
            return (Criteria) this;
        }

        public Criteria andRightUrlGreaterThanOrEqualTo(String value) {
            addCriterion("RIGHT_URL >=", value, "rightUrl");
            return (Criteria) this;
        }

        public Criteria andRightUrlLessThan(String value) {
            addCriterion("RIGHT_URL <", value, "rightUrl");
            return (Criteria) this;
        }

        public Criteria andRightUrlLessThanOrEqualTo(String value) {
            addCriterion("RIGHT_URL <=", value, "rightUrl");
            return (Criteria) this;
        }

        public Criteria andRightUrlLike(String value) {
            addCriterion("RIGHT_URL like", value, "rightUrl");
            return (Criteria) this;
        }

        public Criteria andRightUrlNotLike(String value) {
            addCriterion("RIGHT_URL not like", value, "rightUrl");
            return (Criteria) this;
        }

        public Criteria andRightUrlIn(List<String> values) {
            addCriterion("RIGHT_URL in", values, "rightUrl");
            return (Criteria) this;
        }

        public Criteria andRightUrlNotIn(List<String> values) {
            addCriterion("RIGHT_URL not in", values, "rightUrl");
            return (Criteria) this;
        }

        public Criteria andRightUrlBetween(String value1, String value2) {
            addCriterion("RIGHT_URL between", value1, value2, "rightUrl");
            return (Criteria) this;
        }

        public Criteria andRightUrlNotBetween(String value1, String value2) {
            addCriterion("RIGHT_URL not between", value1, value2, "rightUrl");
            return (Criteria) this;
        }

        public Criteria andRightTipIsNull() {
            addCriterion("RIGHT_TIP is null");
            return (Criteria) this;
        }

        public Criteria andRightTipIsNotNull() {
            addCriterion("RIGHT_TIP is not null");
            return (Criteria) this;
        }

        public Criteria andRightTipEqualTo(String value) {
            addCriterion("RIGHT_TIP =", value, "rightTip");
            return (Criteria) this;
        }

        public Criteria andRightTipNotEqualTo(String value) {
            addCriterion("RIGHT_TIP <>", value, "rightTip");
            return (Criteria) this;
        }

        public Criteria andRightTipGreaterThan(String value) {
            addCriterion("RIGHT_TIP >", value, "rightTip");
            return (Criteria) this;
        }

        public Criteria andRightTipGreaterThanOrEqualTo(String value) {
            addCriterion("RIGHT_TIP >=", value, "rightTip");
            return (Criteria) this;
        }

        public Criteria andRightTipLessThan(String value) {
            addCriterion("RIGHT_TIP <", value, "rightTip");
            return (Criteria) this;
        }

        public Criteria andRightTipLessThanOrEqualTo(String value) {
            addCriterion("RIGHT_TIP <=", value, "rightTip");
            return (Criteria) this;
        }

        public Criteria andRightTipLike(String value) {
            addCriterion("RIGHT_TIP like", value, "rightTip");
            return (Criteria) this;
        }

        public Criteria andRightTipNotLike(String value) {
            addCriterion("RIGHT_TIP not like", value, "rightTip");
            return (Criteria) this;
        }

        public Criteria andRightTipIn(List<String> values) {
            addCriterion("RIGHT_TIP in", values, "rightTip");
            return (Criteria) this;
        }

        public Criteria andRightTipNotIn(List<String> values) {
            addCriterion("RIGHT_TIP not in", values, "rightTip");
            return (Criteria) this;
        }

        public Criteria andRightTipBetween(String value1, String value2) {
            addCriterion("RIGHT_TIP between", value1, value2, "rightTip");
            return (Criteria) this;
        }

        public Criteria andRightTipNotBetween(String value1, String value2) {
            addCriterion("RIGHT_TIP not between", value1, value2, "rightTip");
            return (Criteria) this;
        }

        public Criteria andSysFunIdIsNull() {
            addCriterion("SYS_FUN_ID is null");
            return (Criteria) this;
        }

        public Criteria andSysFunIdIsNotNull() {
            addCriterion("SYS_FUN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSysFunIdEqualTo(Integer value) {
            addCriterion("SYS_FUN_ID =", value, "sysFunId");
            return (Criteria) this;
        }

        public Criteria andSysFunIdNotEqualTo(Integer value) {
            addCriterion("SYS_FUN_ID <>", value, "sysFunId");
            return (Criteria) this;
        }

        public Criteria andSysFunIdGreaterThan(Integer value) {
            addCriterion("SYS_FUN_ID >", value, "sysFunId");
            return (Criteria) this;
        }

        public Criteria andSysFunIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("SYS_FUN_ID >=", value, "sysFunId");
            return (Criteria) this;
        }

        public Criteria andSysFunIdLessThan(Integer value) {
            addCriterion("SYS_FUN_ID <", value, "sysFunId");
            return (Criteria) this;
        }

        public Criteria andSysFunIdLessThanOrEqualTo(Integer value) {
            addCriterion("SYS_FUN_ID <=", value, "sysFunId");
            return (Criteria) this;
        }

        public Criteria andSysFunIdIn(List<Integer> values) {
            addCriterion("SYS_FUN_ID in", values, "sysFunId");
            return (Criteria) this;
        }

        public Criteria andSysFunIdNotIn(List<Integer> values) {
            addCriterion("SYS_FUN_ID not in", values, "sysFunId");
            return (Criteria) this;
        }

        public Criteria andSysFunIdBetween(Integer value1, Integer value2) {
            addCriterion("SYS_FUN_ID between", value1, value2, "sysFunId");
            return (Criteria) this;
        }

        public Criteria andSysFunIdNotBetween(Integer value1, Integer value2) {
            addCriterion("SYS_FUN_ID not between", value1, value2, "sysFunId");
            return (Criteria) this;
        }

        public Criteria andRightTypeIsNull() {
            addCriterion("RIGHT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andRightTypeIsNotNull() {
            addCriterion("RIGHT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andRightTypeEqualTo(Short value) {
            addCriterion("RIGHT_TYPE =", value, "rightType");
            return (Criteria) this;
        }

        public Criteria andRightTypeNotEqualTo(Short value) {
            addCriterion("RIGHT_TYPE <>", value, "rightType");
            return (Criteria) this;
        }

        public Criteria andRightTypeGreaterThan(Short value) {
            addCriterion("RIGHT_TYPE >", value, "rightType");
            return (Criteria) this;
        }

        public Criteria andRightTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("RIGHT_TYPE >=", value, "rightType");
            return (Criteria) this;
        }

        public Criteria andRightTypeLessThan(Short value) {
            addCriterion("RIGHT_TYPE <", value, "rightType");
            return (Criteria) this;
        }

        public Criteria andRightTypeLessThanOrEqualTo(Short value) {
            addCriterion("RIGHT_TYPE <=", value, "rightType");
            return (Criteria) this;
        }

        public Criteria andRightTypeIn(List<Short> values) {
            addCriterion("RIGHT_TYPE in", values, "rightType");
            return (Criteria) this;
        }

        public Criteria andRightTypeNotIn(List<Short> values) {
            addCriterion("RIGHT_TYPE not in", values, "rightType");
            return (Criteria) this;
        }

        public Criteria andRightTypeBetween(Short value1, Short value2) {
            addCriterion("RIGHT_TYPE between", value1, value2, "rightType");
            return (Criteria) this;
        }

        public Criteria andRightTypeNotBetween(Short value1, Short value2) {
            addCriterion("RIGHT_TYPE not between", value1, value2, "rightType");
            return (Criteria) this;
        }

        public Criteria andSysChIdIsNull() {
            addCriterion("SYS_CH_ID is null");
            return (Criteria) this;
        }

        public Criteria andSysChIdIsNotNull() {
            addCriterion("SYS_CH_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSysChIdEqualTo(Integer value) {
            addCriterion("SYS_CH_ID =", value, "sysChId");
            return (Criteria) this;
        }

        public Criteria andSysChIdNotEqualTo(Integer value) {
            addCriterion("SYS_CH_ID <>", value, "sysChId");
            return (Criteria) this;
        }

        public Criteria andSysChIdGreaterThan(Integer value) {
            addCriterion("SYS_CH_ID >", value, "sysChId");
            return (Criteria) this;
        }

        public Criteria andSysChIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("SYS_CH_ID >=", value, "sysChId");
            return (Criteria) this;
        }

        public Criteria andSysChIdLessThan(Integer value) {
            addCriterion("SYS_CH_ID <", value, "sysChId");
            return (Criteria) this;
        }

        public Criteria andSysChIdLessThanOrEqualTo(Integer value) {
            addCriterion("SYS_CH_ID <=", value, "sysChId");
            return (Criteria) this;
        }

        public Criteria andSysChIdIn(List<Integer> values) {
            addCriterion("SYS_CH_ID in", values, "sysChId");
            return (Criteria) this;
        }

        public Criteria andSysChIdNotIn(List<Integer> values) {
            addCriterion("SYS_CH_ID not in", values, "sysChId");
            return (Criteria) this;
        }

        public Criteria andSysChIdBetween(Integer value1, Integer value2) {
            addCriterion("SYS_CH_ID between", value1, value2, "sysChId");
            return (Criteria) this;
        }

        public Criteria andSysChIdNotBetween(Integer value1, Integer value2) {
            addCriterion("SYS_CH_ID not between", value1, value2, "sysChId");
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