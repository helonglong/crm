package com.hll.pojo;

import java.util.ArrayList;
import java.util.List;

public class CstCustomerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CstCustomerExample() {
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

        public Criteria andCustIdIsNull() {
            addCriterion("CUST_ID is null");
            return (Criteria) this;
        }

        public Criteria andCustIdIsNotNull() {
            addCriterion("CUST_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCustIdEqualTo(String value) {
            addCriterion("CUST_ID =", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotEqualTo(String value) {
            addCriterion("CUST_ID <>", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdGreaterThan(String value) {
            addCriterion("CUST_ID >", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdGreaterThanOrEqualTo(String value) {
            addCriterion("CUST_ID >=", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdLessThan(String value) {
            addCriterion("CUST_ID <", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdLessThanOrEqualTo(String value) {
            addCriterion("CUST_ID <=", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdLike(String value) {
            addCriterion("CUST_ID like", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotLike(String value) {
            addCriterion("CUST_ID not like", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdIn(List<String> values) {
            addCriterion("CUST_ID in", values, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotIn(List<String> values) {
            addCriterion("CUST_ID not in", values, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdBetween(String value1, String value2) {
            addCriterion("CUST_ID between", value1, value2, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotBetween(String value1, String value2) {
            addCriterion("CUST_ID not between", value1, value2, "custId");
            return (Criteria) this;
        }

        public Criteria andCustNameIsNull() {
            addCriterion("CUST_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCustNameIsNotNull() {
            addCriterion("CUST_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCustNameEqualTo(String value) {
            addCriterion("CUST_NAME =", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotEqualTo(String value) {
            addCriterion("CUST_NAME <>", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameGreaterThan(String value) {
            addCriterion("CUST_NAME >", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameGreaterThanOrEqualTo(String value) {
            addCriterion("CUST_NAME >=", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameLessThan(String value) {
            addCriterion("CUST_NAME <", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameLessThanOrEqualTo(String value) {
            addCriterion("CUST_NAME <=", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameLike(String value) {
            addCriterion("CUST_NAME like", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotLike(String value) {
            addCriterion("CUST_NAME not like", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameIn(List<String> values) {
            addCriterion("CUST_NAME in", values, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotIn(List<String> values) {
            addCriterion("CUST_NAME not in", values, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameBetween(String value1, String value2) {
            addCriterion("CUST_NAME between", value1, value2, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotBetween(String value1, String value2) {
            addCriterion("CUST_NAME not between", value1, value2, "custName");
            return (Criteria) this;
        }

        public Criteria andCustManagerIdIsNull() {
            addCriterion("CUST_MANAGER_ID is null");
            return (Criteria) this;
        }

        public Criteria andCustManagerIdIsNotNull() {
            addCriterion("CUST_MANAGER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCustManagerIdEqualTo(String value) {
            addCriterion("CUST_MANAGER_ID =", value, "custManagerId");
            return (Criteria) this;
        }

        public Criteria andCustManagerIdNotEqualTo(String value) {
            addCriterion("CUST_MANAGER_ID <>", value, "custManagerId");
            return (Criteria) this;
        }

        public Criteria andCustManagerIdGreaterThan(String value) {
            addCriterion("CUST_MANAGER_ID >", value, "custManagerId");
            return (Criteria) this;
        }

        public Criteria andCustManagerIdGreaterThanOrEqualTo(String value) {
            addCriterion("CUST_MANAGER_ID >=", value, "custManagerId");
            return (Criteria) this;
        }

        public Criteria andCustManagerIdLessThan(String value) {
            addCriterion("CUST_MANAGER_ID <", value, "custManagerId");
            return (Criteria) this;
        }

        public Criteria andCustManagerIdLessThanOrEqualTo(String value) {
            addCriterion("CUST_MANAGER_ID <=", value, "custManagerId");
            return (Criteria) this;
        }

        public Criteria andCustManagerIdLike(String value) {
            addCriterion("CUST_MANAGER_ID like", value, "custManagerId");
            return (Criteria) this;
        }

        public Criteria andCustManagerIdNotLike(String value) {
            addCriterion("CUST_MANAGER_ID not like", value, "custManagerId");
            return (Criteria) this;
        }

        public Criteria andCustManagerIdIn(List<String> values) {
            addCriterion("CUST_MANAGER_ID in", values, "custManagerId");
            return (Criteria) this;
        }

        public Criteria andCustManagerIdNotIn(List<String> values) {
            addCriterion("CUST_MANAGER_ID not in", values, "custManagerId");
            return (Criteria) this;
        }

        public Criteria andCustManagerIdBetween(String value1, String value2) {
            addCriterion("CUST_MANAGER_ID between", value1, value2, "custManagerId");
            return (Criteria) this;
        }

        public Criteria andCustManagerIdNotBetween(String value1, String value2) {
            addCriterion("CUST_MANAGER_ID not between", value1, value2, "custManagerId");
            return (Criteria) this;
        }

        public Criteria andCustLevelIsNull() {
            addCriterion("CUST_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andCustLevelIsNotNull() {
            addCriterion("CUST_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andCustLevelEqualTo(String value) {
            addCriterion("CUST_LEVEL =", value, "custLevel");
            return (Criteria) this;
        }

        public Criteria andCustLevelNotEqualTo(String value) {
            addCriterion("CUST_LEVEL <>", value, "custLevel");
            return (Criteria) this;
        }

        public Criteria andCustLevelGreaterThan(String value) {
            addCriterion("CUST_LEVEL >", value, "custLevel");
            return (Criteria) this;
        }

        public Criteria andCustLevelGreaterThanOrEqualTo(String value) {
            addCriterion("CUST_LEVEL >=", value, "custLevel");
            return (Criteria) this;
        }

        public Criteria andCustLevelLessThan(String value) {
            addCriterion("CUST_LEVEL <", value, "custLevel");
            return (Criteria) this;
        }

        public Criteria andCustLevelLessThanOrEqualTo(String value) {
            addCriterion("CUST_LEVEL <=", value, "custLevel");
            return (Criteria) this;
        }

        public Criteria andCustLevelLike(String value) {
            addCriterion("CUST_LEVEL like", value, "custLevel");
            return (Criteria) this;
        }

        public Criteria andCustLevelNotLike(String value) {
            addCriterion("CUST_LEVEL not like", value, "custLevel");
            return (Criteria) this;
        }

        public Criteria andCustLevelIn(List<String> values) {
            addCriterion("CUST_LEVEL in", values, "custLevel");
            return (Criteria) this;
        }

        public Criteria andCustLevelNotIn(List<String> values) {
            addCriterion("CUST_LEVEL not in", values, "custLevel");
            return (Criteria) this;
        }

        public Criteria andCustLevelBetween(String value1, String value2) {
            addCriterion("CUST_LEVEL between", value1, value2, "custLevel");
            return (Criteria) this;
        }

        public Criteria andCustLevelNotBetween(String value1, String value2) {
            addCriterion("CUST_LEVEL not between", value1, value2, "custLevel");
            return (Criteria) this;
        }

        public Criteria andCustSatisfyIsNull() {
            addCriterion("CUST_SATISFY is null");
            return (Criteria) this;
        }

        public Criteria andCustSatisfyIsNotNull() {
            addCriterion("CUST_SATISFY is not null");
            return (Criteria) this;
        }

        public Criteria andCustSatisfyEqualTo(String value) {
            addCriterion("CUST_SATISFY =", value, "custSatisfy");
            return (Criteria) this;
        }

        public Criteria andCustSatisfyNotEqualTo(String value) {
            addCriterion("CUST_SATISFY <>", value, "custSatisfy");
            return (Criteria) this;
        }

        public Criteria andCustSatisfyGreaterThan(String value) {
            addCriterion("CUST_SATISFY >", value, "custSatisfy");
            return (Criteria) this;
        }

        public Criteria andCustSatisfyGreaterThanOrEqualTo(String value) {
            addCriterion("CUST_SATISFY >=", value, "custSatisfy");
            return (Criteria) this;
        }

        public Criteria andCustSatisfyLessThan(String value) {
            addCriterion("CUST_SATISFY <", value, "custSatisfy");
            return (Criteria) this;
        }

        public Criteria andCustSatisfyLessThanOrEqualTo(String value) {
            addCriterion("CUST_SATISFY <=", value, "custSatisfy");
            return (Criteria) this;
        }

        public Criteria andCustSatisfyLike(String value) {
            addCriterion("CUST_SATISFY like", value, "custSatisfy");
            return (Criteria) this;
        }

        public Criteria andCustSatisfyNotLike(String value) {
            addCriterion("CUST_SATISFY not like", value, "custSatisfy");
            return (Criteria) this;
        }

        public Criteria andCustSatisfyIn(List<String> values) {
            addCriterion("CUST_SATISFY in", values, "custSatisfy");
            return (Criteria) this;
        }

        public Criteria andCustSatisfyNotIn(List<String> values) {
            addCriterion("CUST_SATISFY not in", values, "custSatisfy");
            return (Criteria) this;
        }

        public Criteria andCustSatisfyBetween(String value1, String value2) {
            addCriterion("CUST_SATISFY between", value1, value2, "custSatisfy");
            return (Criteria) this;
        }

        public Criteria andCustSatisfyNotBetween(String value1, String value2) {
            addCriterion("CUST_SATISFY not between", value1, value2, "custSatisfy");
            return (Criteria) this;
        }

        public Criteria andCustCreditIsNull() {
            addCriterion("CUST_CREDIT is null");
            return (Criteria) this;
        }

        public Criteria andCustCreditIsNotNull() {
            addCriterion("CUST_CREDIT is not null");
            return (Criteria) this;
        }

        public Criteria andCustCreditEqualTo(String value) {
            addCriterion("CUST_CREDIT =", value, "custCredit");
            return (Criteria) this;
        }

        public Criteria andCustCreditNotEqualTo(String value) {
            addCriterion("CUST_CREDIT <>", value, "custCredit");
            return (Criteria) this;
        }

        public Criteria andCustCreditGreaterThan(String value) {
            addCriterion("CUST_CREDIT >", value, "custCredit");
            return (Criteria) this;
        }

        public Criteria andCustCreditGreaterThanOrEqualTo(String value) {
            addCriterion("CUST_CREDIT >=", value, "custCredit");
            return (Criteria) this;
        }

        public Criteria andCustCreditLessThan(String value) {
            addCriterion("CUST_CREDIT <", value, "custCredit");
            return (Criteria) this;
        }

        public Criteria andCustCreditLessThanOrEqualTo(String value) {
            addCriterion("CUST_CREDIT <=", value, "custCredit");
            return (Criteria) this;
        }

        public Criteria andCustCreditLike(String value) {
            addCriterion("CUST_CREDIT like", value, "custCredit");
            return (Criteria) this;
        }

        public Criteria andCustCreditNotLike(String value) {
            addCriterion("CUST_CREDIT not like", value, "custCredit");
            return (Criteria) this;
        }

        public Criteria andCustCreditIn(List<String> values) {
            addCriterion("CUST_CREDIT in", values, "custCredit");
            return (Criteria) this;
        }

        public Criteria andCustCreditNotIn(List<String> values) {
            addCriterion("CUST_CREDIT not in", values, "custCredit");
            return (Criteria) this;
        }

        public Criteria andCustCreditBetween(String value1, String value2) {
            addCriterion("CUST_CREDIT between", value1, value2, "custCredit");
            return (Criteria) this;
        }

        public Criteria andCustCreditNotBetween(String value1, String value2) {
            addCriterion("CUST_CREDIT not between", value1, value2, "custCredit");
            return (Criteria) this;
        }

        public Criteria andCustAddrIsNull() {
            addCriterion("CUST_ADDR is null");
            return (Criteria) this;
        }

        public Criteria andCustAddrIsNotNull() {
            addCriterion("CUST_ADDR is not null");
            return (Criteria) this;
        }

        public Criteria andCustAddrEqualTo(String value) {
            addCriterion("CUST_ADDR =", value, "custAddr");
            return (Criteria) this;
        }

        public Criteria andCustAddrNotEqualTo(String value) {
            addCriterion("CUST_ADDR <>", value, "custAddr");
            return (Criteria) this;
        }

        public Criteria andCustAddrGreaterThan(String value) {
            addCriterion("CUST_ADDR >", value, "custAddr");
            return (Criteria) this;
        }

        public Criteria andCustAddrGreaterThanOrEqualTo(String value) {
            addCriterion("CUST_ADDR >=", value, "custAddr");
            return (Criteria) this;
        }

        public Criteria andCustAddrLessThan(String value) {
            addCriterion("CUST_ADDR <", value, "custAddr");
            return (Criteria) this;
        }

        public Criteria andCustAddrLessThanOrEqualTo(String value) {
            addCriterion("CUST_ADDR <=", value, "custAddr");
            return (Criteria) this;
        }

        public Criteria andCustAddrLike(String value) {
            addCriterion("CUST_ADDR like", value, "custAddr");
            return (Criteria) this;
        }

        public Criteria andCustAddrNotLike(String value) {
            addCriterion("CUST_ADDR not like", value, "custAddr");
            return (Criteria) this;
        }

        public Criteria andCustAddrIn(List<String> values) {
            addCriterion("CUST_ADDR in", values, "custAddr");
            return (Criteria) this;
        }

        public Criteria andCustAddrNotIn(List<String> values) {
            addCriterion("CUST_ADDR not in", values, "custAddr");
            return (Criteria) this;
        }

        public Criteria andCustAddrBetween(String value1, String value2) {
            addCriterion("CUST_ADDR between", value1, value2, "custAddr");
            return (Criteria) this;
        }

        public Criteria andCustAddrNotBetween(String value1, String value2) {
            addCriterion("CUST_ADDR not between", value1, value2, "custAddr");
            return (Criteria) this;
        }

        public Criteria andCustZipIsNull() {
            addCriterion("CUST_ZIP is null");
            return (Criteria) this;
        }

        public Criteria andCustZipIsNotNull() {
            addCriterion("CUST_ZIP is not null");
            return (Criteria) this;
        }

        public Criteria andCustZipEqualTo(String value) {
            addCriterion("CUST_ZIP =", value, "custZip");
            return (Criteria) this;
        }

        public Criteria andCustZipNotEqualTo(String value) {
            addCriterion("CUST_ZIP <>", value, "custZip");
            return (Criteria) this;
        }

        public Criteria andCustZipGreaterThan(String value) {
            addCriterion("CUST_ZIP >", value, "custZip");
            return (Criteria) this;
        }

        public Criteria andCustZipGreaterThanOrEqualTo(String value) {
            addCriterion("CUST_ZIP >=", value, "custZip");
            return (Criteria) this;
        }

        public Criteria andCustZipLessThan(String value) {
            addCriterion("CUST_ZIP <", value, "custZip");
            return (Criteria) this;
        }

        public Criteria andCustZipLessThanOrEqualTo(String value) {
            addCriterion("CUST_ZIP <=", value, "custZip");
            return (Criteria) this;
        }

        public Criteria andCustZipLike(String value) {
            addCriterion("CUST_ZIP like", value, "custZip");
            return (Criteria) this;
        }

        public Criteria andCustZipNotLike(String value) {
            addCriterion("CUST_ZIP not like", value, "custZip");
            return (Criteria) this;
        }

        public Criteria andCustZipIn(List<String> values) {
            addCriterion("CUST_ZIP in", values, "custZip");
            return (Criteria) this;
        }

        public Criteria andCustZipNotIn(List<String> values) {
            addCriterion("CUST_ZIP not in", values, "custZip");
            return (Criteria) this;
        }

        public Criteria andCustZipBetween(String value1, String value2) {
            addCriterion("CUST_ZIP between", value1, value2, "custZip");
            return (Criteria) this;
        }

        public Criteria andCustZipNotBetween(String value1, String value2) {
            addCriterion("CUST_ZIP not between", value1, value2, "custZip");
            return (Criteria) this;
        }

        public Criteria andCustTelIsNull() {
            addCriterion("CUST_TEL is null");
            return (Criteria) this;
        }

        public Criteria andCustTelIsNotNull() {
            addCriterion("CUST_TEL is not null");
            return (Criteria) this;
        }

        public Criteria andCustTelEqualTo(String value) {
            addCriterion("CUST_TEL =", value, "custTel");
            return (Criteria) this;
        }

        public Criteria andCustTelNotEqualTo(String value) {
            addCriterion("CUST_TEL <>", value, "custTel");
            return (Criteria) this;
        }

        public Criteria andCustTelGreaterThan(String value) {
            addCriterion("CUST_TEL >", value, "custTel");
            return (Criteria) this;
        }

        public Criteria andCustTelGreaterThanOrEqualTo(String value) {
            addCriterion("CUST_TEL >=", value, "custTel");
            return (Criteria) this;
        }

        public Criteria andCustTelLessThan(String value) {
            addCriterion("CUST_TEL <", value, "custTel");
            return (Criteria) this;
        }

        public Criteria andCustTelLessThanOrEqualTo(String value) {
            addCriterion("CUST_TEL <=", value, "custTel");
            return (Criteria) this;
        }

        public Criteria andCustTelLike(String value) {
            addCriterion("CUST_TEL like", value, "custTel");
            return (Criteria) this;
        }

        public Criteria andCustTelNotLike(String value) {
            addCriterion("CUST_TEL not like", value, "custTel");
            return (Criteria) this;
        }

        public Criteria andCustTelIn(List<String> values) {
            addCriterion("CUST_TEL in", values, "custTel");
            return (Criteria) this;
        }

        public Criteria andCustTelNotIn(List<String> values) {
            addCriterion("CUST_TEL not in", values, "custTel");
            return (Criteria) this;
        }

        public Criteria andCustTelBetween(String value1, String value2) {
            addCriterion("CUST_TEL between", value1, value2, "custTel");
            return (Criteria) this;
        }

        public Criteria andCustTelNotBetween(String value1, String value2) {
            addCriterion("CUST_TEL not between", value1, value2, "custTel");
            return (Criteria) this;
        }

        public Criteria andCustWebsiteIsNull() {
            addCriterion("CUST_WEBSITE is null");
            return (Criteria) this;
        }

        public Criteria andCustWebsiteIsNotNull() {
            addCriterion("CUST_WEBSITE is not null");
            return (Criteria) this;
        }

        public Criteria andCustWebsiteEqualTo(String value) {
            addCriterion("CUST_WEBSITE =", value, "custWebsite");
            return (Criteria) this;
        }

        public Criteria andCustWebsiteNotEqualTo(String value) {
            addCriterion("CUST_WEBSITE <>", value, "custWebsite");
            return (Criteria) this;
        }

        public Criteria andCustWebsiteGreaterThan(String value) {
            addCriterion("CUST_WEBSITE >", value, "custWebsite");
            return (Criteria) this;
        }

        public Criteria andCustWebsiteGreaterThanOrEqualTo(String value) {
            addCriterion("CUST_WEBSITE >=", value, "custWebsite");
            return (Criteria) this;
        }

        public Criteria andCustWebsiteLessThan(String value) {
            addCriterion("CUST_WEBSITE <", value, "custWebsite");
            return (Criteria) this;
        }

        public Criteria andCustWebsiteLessThanOrEqualTo(String value) {
            addCriterion("CUST_WEBSITE <=", value, "custWebsite");
            return (Criteria) this;
        }

        public Criteria andCustWebsiteLike(String value) {
            addCriterion("CUST_WEBSITE like", value, "custWebsite");
            return (Criteria) this;
        }

        public Criteria andCustWebsiteNotLike(String value) {
            addCriterion("CUST_WEBSITE not like", value, "custWebsite");
            return (Criteria) this;
        }

        public Criteria andCustWebsiteIn(List<String> values) {
            addCriterion("CUST_WEBSITE in", values, "custWebsite");
            return (Criteria) this;
        }

        public Criteria andCustWebsiteNotIn(List<String> values) {
            addCriterion("CUST_WEBSITE not in", values, "custWebsite");
            return (Criteria) this;
        }

        public Criteria andCustWebsiteBetween(String value1, String value2) {
            addCriterion("CUST_WEBSITE between", value1, value2, "custWebsite");
            return (Criteria) this;
        }

        public Criteria andCustWebsiteNotBetween(String value1, String value2) {
            addCriterion("CUST_WEBSITE not between", value1, value2, "custWebsite");
            return (Criteria) this;
        }

        public Criteria andCustStatusIsNull() {
            addCriterion("CUST_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andCustStatusIsNotNull() {
            addCriterion("CUST_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andCustStatusEqualTo(Short value) {
            addCriterion("CUST_STATUS =", value, "custStatus");
            return (Criteria) this;
        }

        public Criteria andCustStatusNotEqualTo(Short value) {
            addCriterion("CUST_STATUS <>", value, "custStatus");
            return (Criteria) this;
        }

        public Criteria andCustStatusGreaterThan(Short value) {
            addCriterion("CUST_STATUS >", value, "custStatus");
            return (Criteria) this;
        }

        public Criteria andCustStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("CUST_STATUS >=", value, "custStatus");
            return (Criteria) this;
        }

        public Criteria andCustStatusLessThan(Short value) {
            addCriterion("CUST_STATUS <", value, "custStatus");
            return (Criteria) this;
        }

        public Criteria andCustStatusLessThanOrEqualTo(Short value) {
            addCriterion("CUST_STATUS <=", value, "custStatus");
            return (Criteria) this;
        }

        public Criteria andCustStatusIn(List<Short> values) {
            addCriterion("CUST_STATUS in", values, "custStatus");
            return (Criteria) this;
        }

        public Criteria andCustStatusNotIn(List<Short> values) {
            addCriterion("CUST_STATUS not in", values, "custStatus");
            return (Criteria) this;
        }

        public Criteria andCustStatusBetween(Short value1, Short value2) {
            addCriterion("CUST_STATUS between", value1, value2, "custStatus");
            return (Criteria) this;
        }

        public Criteria andCustStatusNotBetween(Short value1, Short value2) {
            addCriterion("CUST_STATUS not between", value1, value2, "custStatus");
            return (Criteria) this;
        }

        public Criteria andCustRegionIsNull() {
            addCriterion("CUST_REGION is null");
            return (Criteria) this;
        }

        public Criteria andCustRegionIsNotNull() {
            addCriterion("CUST_REGION is not null");
            return (Criteria) this;
        }

        public Criteria andCustRegionEqualTo(String value) {
            addCriterion("CUST_REGION =", value, "custRegion");
            return (Criteria) this;
        }

        public Criteria andCustRegionNotEqualTo(String value) {
            addCriterion("CUST_REGION <>", value, "custRegion");
            return (Criteria) this;
        }

        public Criteria andCustRegionGreaterThan(String value) {
            addCriterion("CUST_REGION >", value, "custRegion");
            return (Criteria) this;
        }

        public Criteria andCustRegionGreaterThanOrEqualTo(String value) {
            addCriterion("CUST_REGION >=", value, "custRegion");
            return (Criteria) this;
        }

        public Criteria andCustRegionLessThan(String value) {
            addCriterion("CUST_REGION <", value, "custRegion");
            return (Criteria) this;
        }

        public Criteria andCustRegionLessThanOrEqualTo(String value) {
            addCriterion("CUST_REGION <=", value, "custRegion");
            return (Criteria) this;
        }

        public Criteria andCustRegionLike(String value) {
            addCriterion("CUST_REGION like", value, "custRegion");
            return (Criteria) this;
        }

        public Criteria andCustRegionNotLike(String value) {
            addCriterion("CUST_REGION not like", value, "custRegion");
            return (Criteria) this;
        }

        public Criteria andCustRegionIn(List<String> values) {
            addCriterion("CUST_REGION in", values, "custRegion");
            return (Criteria) this;
        }

        public Criteria andCustRegionNotIn(List<String> values) {
            addCriterion("CUST_REGION not in", values, "custRegion");
            return (Criteria) this;
        }

        public Criteria andCustRegionBetween(String value1, String value2) {
            addCriterion("CUST_REGION between", value1, value2, "custRegion");
            return (Criteria) this;
        }

        public Criteria andCustRegionNotBetween(String value1, String value2) {
            addCriterion("CUST_REGION not between", value1, value2, "custRegion");
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