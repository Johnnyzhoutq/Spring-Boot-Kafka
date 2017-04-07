package org.linuxsogood.demo.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustomerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomerExample() {
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

        public Criteria andCustomerIdIsNull() {
            addCriterion("CUSTOMER_ID is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNotNull() {
            addCriterion("CUSTOMER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdEqualTo(BigDecimal value) {
            addCriterion("CUSTOMER_ID =", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotEqualTo(BigDecimal value) {
            addCriterion("CUSTOMER_ID <>", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThan(BigDecimal value) {
            addCriterion("CUSTOMER_ID >", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CUSTOMER_ID >=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThan(BigDecimal value) {
            addCriterion("CUSTOMER_ID <", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CUSTOMER_ID <=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIn(List<BigDecimal> values) {
            addCriterion("CUSTOMER_ID in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotIn(List<BigDecimal> values) {
            addCriterion("CUSTOMER_ID not in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CUSTOMER_ID between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CUSTOMER_ID not between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeIsNull() {
            addCriterion("CUSTOMER_CODE is null");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeIsNotNull() {
            addCriterion("CUSTOMER_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeEqualTo(String value) {
            addCriterion("CUSTOMER_CODE =", value, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeNotEqualTo(String value) {
            addCriterion("CUSTOMER_CODE <>", value, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeGreaterThan(String value) {
            addCriterion("CUSTOMER_CODE >", value, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_CODE >=", value, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeLessThan(String value) {
            addCriterion("CUSTOMER_CODE <", value, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_CODE <=", value, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeLike(String value) {
            addCriterion("CUSTOMER_CODE like", value, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeNotLike(String value) {
            addCriterion("CUSTOMER_CODE not like", value, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeIn(List<String> values) {
            addCriterion("CUSTOMER_CODE in", values, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeNotIn(List<String> values) {
            addCriterion("CUSTOMER_CODE not in", values, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeBetween(String value1, String value2) {
            addCriterion("CUSTOMER_CODE between", value1, value2, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeNotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_CODE not between", value1, value2, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNull() {
            addCriterion("CUSTOMER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNotNull() {
            addCriterion("CUSTOMER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameEqualTo(String value) {
            addCriterion("CUSTOMER_NAME =", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotEqualTo(String value) {
            addCriterion("CUSTOMER_NAME <>", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThan(String value) {
            addCriterion("CUSTOMER_NAME >", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_NAME >=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThan(String value) {
            addCriterion("CUSTOMER_NAME <", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_NAME <=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLike(String value) {
            addCriterion("CUSTOMER_NAME like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotLike(String value) {
            addCriterion("CUSTOMER_NAME not like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIn(List<String> values) {
            addCriterion("CUSTOMER_NAME in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotIn(List<String> values) {
            addCriterion("CUSTOMER_NAME not in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameBetween(String value1, String value2) {
            addCriterion("CUSTOMER_NAME between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_NAME not between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerAidIsNull() {
            addCriterion("CUSTOMER_AID is null");
            return (Criteria) this;
        }

        public Criteria andCustomerAidIsNotNull() {
            addCriterion("CUSTOMER_AID is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerAidEqualTo(String value) {
            addCriterion("CUSTOMER_AID =", value, "customerAid");
            return (Criteria) this;
        }

        public Criteria andCustomerAidNotEqualTo(String value) {
            addCriterion("CUSTOMER_AID <>", value, "customerAid");
            return (Criteria) this;
        }

        public Criteria andCustomerAidGreaterThan(String value) {
            addCriterion("CUSTOMER_AID >", value, "customerAid");
            return (Criteria) this;
        }

        public Criteria andCustomerAidGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_AID >=", value, "customerAid");
            return (Criteria) this;
        }

        public Criteria andCustomerAidLessThan(String value) {
            addCriterion("CUSTOMER_AID <", value, "customerAid");
            return (Criteria) this;
        }

        public Criteria andCustomerAidLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_AID <=", value, "customerAid");
            return (Criteria) this;
        }

        public Criteria andCustomerAidLike(String value) {
            addCriterion("CUSTOMER_AID like", value, "customerAid");
            return (Criteria) this;
        }

        public Criteria andCustomerAidNotLike(String value) {
            addCriterion("CUSTOMER_AID not like", value, "customerAid");
            return (Criteria) this;
        }

        public Criteria andCustomerAidIn(List<String> values) {
            addCriterion("CUSTOMER_AID in", values, "customerAid");
            return (Criteria) this;
        }

        public Criteria andCustomerAidNotIn(List<String> values) {
            addCriterion("CUSTOMER_AID not in", values, "customerAid");
            return (Criteria) this;
        }

        public Criteria andCustomerAidBetween(String value1, String value2) {
            addCriterion("CUSTOMER_AID between", value1, value2, "customerAid");
            return (Criteria) this;
        }

        public Criteria andCustomerAidNotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_AID not between", value1, value2, "customerAid");
            return (Criteria) this;
        }

        public Criteria andCustomerOldCodeIsNull() {
            addCriterion("CUSTOMER_OLD_CODE is null");
            return (Criteria) this;
        }

        public Criteria andCustomerOldCodeIsNotNull() {
            addCriterion("CUSTOMER_OLD_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerOldCodeEqualTo(String value) {
            addCriterion("CUSTOMER_OLD_CODE =", value, "customerOldCode");
            return (Criteria) this;
        }

        public Criteria andCustomerOldCodeNotEqualTo(String value) {
            addCriterion("CUSTOMER_OLD_CODE <>", value, "customerOldCode");
            return (Criteria) this;
        }

        public Criteria andCustomerOldCodeGreaterThan(String value) {
            addCriterion("CUSTOMER_OLD_CODE >", value, "customerOldCode");
            return (Criteria) this;
        }

        public Criteria andCustomerOldCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_OLD_CODE >=", value, "customerOldCode");
            return (Criteria) this;
        }

        public Criteria andCustomerOldCodeLessThan(String value) {
            addCriterion("CUSTOMER_OLD_CODE <", value, "customerOldCode");
            return (Criteria) this;
        }

        public Criteria andCustomerOldCodeLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_OLD_CODE <=", value, "customerOldCode");
            return (Criteria) this;
        }

        public Criteria andCustomerOldCodeLike(String value) {
            addCriterion("CUSTOMER_OLD_CODE like", value, "customerOldCode");
            return (Criteria) this;
        }

        public Criteria andCustomerOldCodeNotLike(String value) {
            addCriterion("CUSTOMER_OLD_CODE not like", value, "customerOldCode");
            return (Criteria) this;
        }

        public Criteria andCustomerOldCodeIn(List<String> values) {
            addCriterion("CUSTOMER_OLD_CODE in", values, "customerOldCode");
            return (Criteria) this;
        }

        public Criteria andCustomerOldCodeNotIn(List<String> values) {
            addCriterion("CUSTOMER_OLD_CODE not in", values, "customerOldCode");
            return (Criteria) this;
        }

        public Criteria andCustomerOldCodeBetween(String value1, String value2) {
            addCriterion("CUSTOMER_OLD_CODE between", value1, value2, "customerOldCode");
            return (Criteria) this;
        }

        public Criteria andCustomerOldCodeNotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_OLD_CODE not between", value1, value2, "customerOldCode");
            return (Criteria) this;
        }

        public Criteria andCustomerDescribeIsNull() {
            addCriterion("CUSTOMER_DESCRIBE is null");
            return (Criteria) this;
        }

        public Criteria andCustomerDescribeIsNotNull() {
            addCriterion("CUSTOMER_DESCRIBE is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerDescribeEqualTo(String value) {
            addCriterion("CUSTOMER_DESCRIBE =", value, "customerDescribe");
            return (Criteria) this;
        }

        public Criteria andCustomerDescribeNotEqualTo(String value) {
            addCriterion("CUSTOMER_DESCRIBE <>", value, "customerDescribe");
            return (Criteria) this;
        }

        public Criteria andCustomerDescribeGreaterThan(String value) {
            addCriterion("CUSTOMER_DESCRIBE >", value, "customerDescribe");
            return (Criteria) this;
        }

        public Criteria andCustomerDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_DESCRIBE >=", value, "customerDescribe");
            return (Criteria) this;
        }

        public Criteria andCustomerDescribeLessThan(String value) {
            addCriterion("CUSTOMER_DESCRIBE <", value, "customerDescribe");
            return (Criteria) this;
        }

        public Criteria andCustomerDescribeLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_DESCRIBE <=", value, "customerDescribe");
            return (Criteria) this;
        }

        public Criteria andCustomerDescribeLike(String value) {
            addCriterion("CUSTOMER_DESCRIBE like", value, "customerDescribe");
            return (Criteria) this;
        }

        public Criteria andCustomerDescribeNotLike(String value) {
            addCriterion("CUSTOMER_DESCRIBE not like", value, "customerDescribe");
            return (Criteria) this;
        }

        public Criteria andCustomerDescribeIn(List<String> values) {
            addCriterion("CUSTOMER_DESCRIBE in", values, "customerDescribe");
            return (Criteria) this;
        }

        public Criteria andCustomerDescribeNotIn(List<String> values) {
            addCriterion("CUSTOMER_DESCRIBE not in", values, "customerDescribe");
            return (Criteria) this;
        }

        public Criteria andCustomerDescribeBetween(String value1, String value2) {
            addCriterion("CUSTOMER_DESCRIBE between", value1, value2, "customerDescribe");
            return (Criteria) this;
        }

        public Criteria andCustomerDescribeNotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_DESCRIBE not between", value1, value2, "customerDescribe");
            return (Criteria) this;
        }

        public Criteria andCustomerSortIdIsNull() {
            addCriterion("CUSTOMER_SORT_ID is null");
            return (Criteria) this;
        }

        public Criteria andCustomerSortIdIsNotNull() {
            addCriterion("CUSTOMER_SORT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerSortIdEqualTo(BigDecimal value) {
            addCriterion("CUSTOMER_SORT_ID =", value, "customerSortId");
            return (Criteria) this;
        }

        public Criteria andCustomerSortIdNotEqualTo(BigDecimal value) {
            addCriterion("CUSTOMER_SORT_ID <>", value, "customerSortId");
            return (Criteria) this;
        }

        public Criteria andCustomerSortIdGreaterThan(BigDecimal value) {
            addCriterion("CUSTOMER_SORT_ID >", value, "customerSortId");
            return (Criteria) this;
        }

        public Criteria andCustomerSortIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CUSTOMER_SORT_ID >=", value, "customerSortId");
            return (Criteria) this;
        }

        public Criteria andCustomerSortIdLessThan(BigDecimal value) {
            addCriterion("CUSTOMER_SORT_ID <", value, "customerSortId");
            return (Criteria) this;
        }

        public Criteria andCustomerSortIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CUSTOMER_SORT_ID <=", value, "customerSortId");
            return (Criteria) this;
        }

        public Criteria andCustomerSortIdIn(List<BigDecimal> values) {
            addCriterion("CUSTOMER_SORT_ID in", values, "customerSortId");
            return (Criteria) this;
        }

        public Criteria andCustomerSortIdNotIn(List<BigDecimal> values) {
            addCriterion("CUSTOMER_SORT_ID not in", values, "customerSortId");
            return (Criteria) this;
        }

        public Criteria andCustomerSortIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CUSTOMER_SORT_ID between", value1, value2, "customerSortId");
            return (Criteria) this;
        }

        public Criteria andCustomerSortIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CUSTOMER_SORT_ID not between", value1, value2, "customerSortId");
            return (Criteria) this;
        }

        public Criteria andCustomerGradeIdIsNull() {
            addCriterion("CUSTOMER_GRADE_ID is null");
            return (Criteria) this;
        }

        public Criteria andCustomerGradeIdIsNotNull() {
            addCriterion("CUSTOMER_GRADE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerGradeIdEqualTo(BigDecimal value) {
            addCriterion("CUSTOMER_GRADE_ID =", value, "customerGradeId");
            return (Criteria) this;
        }

        public Criteria andCustomerGradeIdNotEqualTo(BigDecimal value) {
            addCriterion("CUSTOMER_GRADE_ID <>", value, "customerGradeId");
            return (Criteria) this;
        }

        public Criteria andCustomerGradeIdGreaterThan(BigDecimal value) {
            addCriterion("CUSTOMER_GRADE_ID >", value, "customerGradeId");
            return (Criteria) this;
        }

        public Criteria andCustomerGradeIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CUSTOMER_GRADE_ID >=", value, "customerGradeId");
            return (Criteria) this;
        }

        public Criteria andCustomerGradeIdLessThan(BigDecimal value) {
            addCriterion("CUSTOMER_GRADE_ID <", value, "customerGradeId");
            return (Criteria) this;
        }

        public Criteria andCustomerGradeIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CUSTOMER_GRADE_ID <=", value, "customerGradeId");
            return (Criteria) this;
        }

        public Criteria andCustomerGradeIdIn(List<BigDecimal> values) {
            addCriterion("CUSTOMER_GRADE_ID in", values, "customerGradeId");
            return (Criteria) this;
        }

        public Criteria andCustomerGradeIdNotIn(List<BigDecimal> values) {
            addCriterion("CUSTOMER_GRADE_ID not in", values, "customerGradeId");
            return (Criteria) this;
        }

        public Criteria andCustomerGradeIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CUSTOMER_GRADE_ID between", value1, value2, "customerGradeId");
            return (Criteria) this;
        }

        public Criteria andCustomerGradeIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CUSTOMER_GRADE_ID not between", value1, value2, "customerGradeId");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeCodeIsNull() {
            addCriterion("CUSTOMER_TYPE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeCodeIsNotNull() {
            addCriterion("CUSTOMER_TYPE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeCodeEqualTo(String value) {
            addCriterion("CUSTOMER_TYPE_CODE =", value, "customerTypeCode");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeCodeNotEqualTo(String value) {
            addCriterion("CUSTOMER_TYPE_CODE <>", value, "customerTypeCode");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeCodeGreaterThan(String value) {
            addCriterion("CUSTOMER_TYPE_CODE >", value, "customerTypeCode");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_TYPE_CODE >=", value, "customerTypeCode");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeCodeLessThan(String value) {
            addCriterion("CUSTOMER_TYPE_CODE <", value, "customerTypeCode");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeCodeLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_TYPE_CODE <=", value, "customerTypeCode");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeCodeLike(String value) {
            addCriterion("CUSTOMER_TYPE_CODE like", value, "customerTypeCode");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeCodeNotLike(String value) {
            addCriterion("CUSTOMER_TYPE_CODE not like", value, "customerTypeCode");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeCodeIn(List<String> values) {
            addCriterion("CUSTOMER_TYPE_CODE in", values, "customerTypeCode");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeCodeNotIn(List<String> values) {
            addCriterion("CUSTOMER_TYPE_CODE not in", values, "customerTypeCode");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeCodeBetween(String value1, String value2) {
            addCriterion("CUSTOMER_TYPE_CODE between", value1, value2, "customerTypeCode");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeCodeNotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_TYPE_CODE not between", value1, value2, "customerTypeCode");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeIdIsNull() {
            addCriterion("CUSTOMER_TYPE_ID is null");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeIdIsNotNull() {
            addCriterion("CUSTOMER_TYPE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeIdEqualTo(BigDecimal value) {
            addCriterion("CUSTOMER_TYPE_ID =", value, "customerTypeId");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeIdNotEqualTo(BigDecimal value) {
            addCriterion("CUSTOMER_TYPE_ID <>", value, "customerTypeId");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeIdGreaterThan(BigDecimal value) {
            addCriterion("CUSTOMER_TYPE_ID >", value, "customerTypeId");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CUSTOMER_TYPE_ID >=", value, "customerTypeId");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeIdLessThan(BigDecimal value) {
            addCriterion("CUSTOMER_TYPE_ID <", value, "customerTypeId");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CUSTOMER_TYPE_ID <=", value, "customerTypeId");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeIdIn(List<BigDecimal> values) {
            addCriterion("CUSTOMER_TYPE_ID in", values, "customerTypeId");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeIdNotIn(List<BigDecimal> values) {
            addCriterion("CUSTOMER_TYPE_ID not in", values, "customerTypeId");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CUSTOMER_TYPE_ID between", value1, value2, "customerTypeId");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CUSTOMER_TYPE_ID not between", value1, value2, "customerTypeId");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusIsNull() {
            addCriterion("CUSTOMER_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusIsNotNull() {
            addCriterion("CUSTOMER_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusEqualTo(String value) {
            addCriterion("CUSTOMER_STATUS =", value, "customerStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusNotEqualTo(String value) {
            addCriterion("CUSTOMER_STATUS <>", value, "customerStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusGreaterThan(String value) {
            addCriterion("CUSTOMER_STATUS >", value, "customerStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_STATUS >=", value, "customerStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusLessThan(String value) {
            addCriterion("CUSTOMER_STATUS <", value, "customerStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_STATUS <=", value, "customerStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusLike(String value) {
            addCriterion("CUSTOMER_STATUS like", value, "customerStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusNotLike(String value) {
            addCriterion("CUSTOMER_STATUS not like", value, "customerStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusIn(List<String> values) {
            addCriterion("CUSTOMER_STATUS in", values, "customerStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusNotIn(List<String> values) {
            addCriterion("CUSTOMER_STATUS not in", values, "customerStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusBetween(String value1, String value2) {
            addCriterion("CUSTOMER_STATUS between", value1, value2, "customerStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusNotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_STATUS not between", value1, value2, "customerStatus");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeIsNull() {
            addCriterion("PROVINCE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeIsNotNull() {
            addCriterion("PROVINCE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeEqualTo(String value) {
            addCriterion("PROVINCE_CODE =", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeNotEqualTo(String value) {
            addCriterion("PROVINCE_CODE <>", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeGreaterThan(String value) {
            addCriterion("PROVINCE_CODE >", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PROVINCE_CODE >=", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeLessThan(String value) {
            addCriterion("PROVINCE_CODE <", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeLessThanOrEqualTo(String value) {
            addCriterion("PROVINCE_CODE <=", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeLike(String value) {
            addCriterion("PROVINCE_CODE like", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeNotLike(String value) {
            addCriterion("PROVINCE_CODE not like", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeIn(List<String> values) {
            addCriterion("PROVINCE_CODE in", values, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeNotIn(List<String> values) {
            addCriterion("PROVINCE_CODE not in", values, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeBetween(String value1, String value2) {
            addCriterion("PROVINCE_CODE between", value1, value2, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeNotBetween(String value1, String value2) {
            addCriterion("PROVINCE_CODE not between", value1, value2, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceNameIsNull() {
            addCriterion("PROVINCE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andProvinceNameIsNotNull() {
            addCriterion("PROVINCE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceNameEqualTo(String value) {
            addCriterion("PROVINCE_NAME =", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameNotEqualTo(String value) {
            addCriterion("PROVINCE_NAME <>", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameGreaterThan(String value) {
            addCriterion("PROVINCE_NAME >", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameGreaterThanOrEqualTo(String value) {
            addCriterion("PROVINCE_NAME >=", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameLessThan(String value) {
            addCriterion("PROVINCE_NAME <", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameLessThanOrEqualTo(String value) {
            addCriterion("PROVINCE_NAME <=", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameLike(String value) {
            addCriterion("PROVINCE_NAME like", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameNotLike(String value) {
            addCriterion("PROVINCE_NAME not like", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameIn(List<String> values) {
            addCriterion("PROVINCE_NAME in", values, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameNotIn(List<String> values) {
            addCriterion("PROVINCE_NAME not in", values, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameBetween(String value1, String value2) {
            addCriterion("PROVINCE_NAME between", value1, value2, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameNotBetween(String value1, String value2) {
            addCriterion("PROVINCE_NAME not between", value1, value2, "provinceName");
            return (Criteria) this;
        }

        public Criteria andCityCodeIsNull() {
            addCriterion("CITY_CODE is null");
            return (Criteria) this;
        }

        public Criteria andCityCodeIsNotNull() {
            addCriterion("CITY_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCityCodeEqualTo(String value) {
            addCriterion("CITY_CODE =", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotEqualTo(String value) {
            addCriterion("CITY_CODE <>", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeGreaterThan(String value) {
            addCriterion("CITY_CODE >", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CITY_CODE >=", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLessThan(String value) {
            addCriterion("CITY_CODE <", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLessThanOrEqualTo(String value) {
            addCriterion("CITY_CODE <=", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLike(String value) {
            addCriterion("CITY_CODE like", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotLike(String value) {
            addCriterion("CITY_CODE not like", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeIn(List<String> values) {
            addCriterion("CITY_CODE in", values, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotIn(List<String> values) {
            addCriterion("CITY_CODE not in", values, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeBetween(String value1, String value2) {
            addCriterion("CITY_CODE between", value1, value2, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotBetween(String value1, String value2) {
            addCriterion("CITY_CODE not between", value1, value2, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityNameIsNull() {
            addCriterion("CITY_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCityNameIsNotNull() {
            addCriterion("CITY_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCityNameEqualTo(String value) {
            addCriterion("CITY_NAME =", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotEqualTo(String value) {
            addCriterion("CITY_NAME <>", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameGreaterThan(String value) {
            addCriterion("CITY_NAME >", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameGreaterThanOrEqualTo(String value) {
            addCriterion("CITY_NAME >=", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLessThan(String value) {
            addCriterion("CITY_NAME <", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLessThanOrEqualTo(String value) {
            addCriterion("CITY_NAME <=", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLike(String value) {
            addCriterion("CITY_NAME like", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotLike(String value) {
            addCriterion("CITY_NAME not like", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameIn(List<String> values) {
            addCriterion("CITY_NAME in", values, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotIn(List<String> values) {
            addCriterion("CITY_NAME not in", values, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameBetween(String value1, String value2) {
            addCriterion("CITY_NAME between", value1, value2, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotBetween(String value1, String value2) {
            addCriterion("CITY_NAME not between", value1, value2, "cityName");
            return (Criteria) this;
        }

        public Criteria andAreaCodeIsNull() {
            addCriterion("AREA_CODE is null");
            return (Criteria) this;
        }

        public Criteria andAreaCodeIsNotNull() {
            addCriterion("AREA_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andAreaCodeEqualTo(String value) {
            addCriterion("AREA_CODE =", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotEqualTo(String value) {
            addCriterion("AREA_CODE <>", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeGreaterThan(String value) {
            addCriterion("AREA_CODE >", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeGreaterThanOrEqualTo(String value) {
            addCriterion("AREA_CODE >=", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeLessThan(String value) {
            addCriterion("AREA_CODE <", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeLessThanOrEqualTo(String value) {
            addCriterion("AREA_CODE <=", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeLike(String value) {
            addCriterion("AREA_CODE like", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotLike(String value) {
            addCriterion("AREA_CODE not like", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeIn(List<String> values) {
            addCriterion("AREA_CODE in", values, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotIn(List<String> values) {
            addCriterion("AREA_CODE not in", values, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeBetween(String value1, String value2) {
            addCriterion("AREA_CODE between", value1, value2, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotBetween(String value1, String value2) {
            addCriterion("AREA_CODE not between", value1, value2, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaNameIsNull() {
            addCriterion("AREA_NAME is null");
            return (Criteria) this;
        }

        public Criteria andAreaNameIsNotNull() {
            addCriterion("AREA_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andAreaNameEqualTo(String value) {
            addCriterion("AREA_NAME =", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotEqualTo(String value) {
            addCriterion("AREA_NAME <>", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameGreaterThan(String value) {
            addCriterion("AREA_NAME >", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameGreaterThanOrEqualTo(String value) {
            addCriterion("AREA_NAME >=", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameLessThan(String value) {
            addCriterion("AREA_NAME <", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameLessThanOrEqualTo(String value) {
            addCriterion("AREA_NAME <=", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameLike(String value) {
            addCriterion("AREA_NAME like", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotLike(String value) {
            addCriterion("AREA_NAME not like", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameIn(List<String> values) {
            addCriterion("AREA_NAME in", values, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotIn(List<String> values) {
            addCriterion("AREA_NAME not in", values, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameBetween(String value1, String value2) {
            addCriterion("AREA_NAME between", value1, value2, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotBetween(String value1, String value2) {
            addCriterion("AREA_NAME not between", value1, value2, "areaName");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressIsNull() {
            addCriterion("CUSTOMER_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressIsNotNull() {
            addCriterion("CUSTOMER_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressEqualTo(String value) {
            addCriterion("CUSTOMER_ADDRESS =", value, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressNotEqualTo(String value) {
            addCriterion("CUSTOMER_ADDRESS <>", value, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressGreaterThan(String value) {
            addCriterion("CUSTOMER_ADDRESS >", value, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_ADDRESS >=", value, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressLessThan(String value) {
            addCriterion("CUSTOMER_ADDRESS <", value, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_ADDRESS <=", value, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressLike(String value) {
            addCriterion("CUSTOMER_ADDRESS like", value, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressNotLike(String value) {
            addCriterion("CUSTOMER_ADDRESS not like", value, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressIn(List<String> values) {
            addCriterion("CUSTOMER_ADDRESS in", values, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressNotIn(List<String> values) {
            addCriterion("CUSTOMER_ADDRESS not in", values, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressBetween(String value1, String value2) {
            addCriterion("CUSTOMER_ADDRESS between", value1, value2, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressNotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_ADDRESS not between", value1, value2, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerLinkmanIsNull() {
            addCriterion("CUSTOMER_LINKMAN is null");
            return (Criteria) this;
        }

        public Criteria andCustomerLinkmanIsNotNull() {
            addCriterion("CUSTOMER_LINKMAN is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerLinkmanEqualTo(String value) {
            addCriterion("CUSTOMER_LINKMAN =", value, "customerLinkman");
            return (Criteria) this;
        }

        public Criteria andCustomerLinkmanNotEqualTo(String value) {
            addCriterion("CUSTOMER_LINKMAN <>", value, "customerLinkman");
            return (Criteria) this;
        }

        public Criteria andCustomerLinkmanGreaterThan(String value) {
            addCriterion("CUSTOMER_LINKMAN >", value, "customerLinkman");
            return (Criteria) this;
        }

        public Criteria andCustomerLinkmanGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_LINKMAN >=", value, "customerLinkman");
            return (Criteria) this;
        }

        public Criteria andCustomerLinkmanLessThan(String value) {
            addCriterion("CUSTOMER_LINKMAN <", value, "customerLinkman");
            return (Criteria) this;
        }

        public Criteria andCustomerLinkmanLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_LINKMAN <=", value, "customerLinkman");
            return (Criteria) this;
        }

        public Criteria andCustomerLinkmanLike(String value) {
            addCriterion("CUSTOMER_LINKMAN like", value, "customerLinkman");
            return (Criteria) this;
        }

        public Criteria andCustomerLinkmanNotLike(String value) {
            addCriterion("CUSTOMER_LINKMAN not like", value, "customerLinkman");
            return (Criteria) this;
        }

        public Criteria andCustomerLinkmanIn(List<String> values) {
            addCriterion("CUSTOMER_LINKMAN in", values, "customerLinkman");
            return (Criteria) this;
        }

        public Criteria andCustomerLinkmanNotIn(List<String> values) {
            addCriterion("CUSTOMER_LINKMAN not in", values, "customerLinkman");
            return (Criteria) this;
        }

        public Criteria andCustomerLinkmanBetween(String value1, String value2) {
            addCriterion("CUSTOMER_LINKMAN between", value1, value2, "customerLinkman");
            return (Criteria) this;
        }

        public Criteria andCustomerLinkmanNotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_LINKMAN not between", value1, value2, "customerLinkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanTelIsNull() {
            addCriterion("LINKMAN_TEL is null");
            return (Criteria) this;
        }

        public Criteria andLinkmanTelIsNotNull() {
            addCriterion("LINKMAN_TEL is not null");
            return (Criteria) this;
        }

        public Criteria andLinkmanTelEqualTo(String value) {
            addCriterion("LINKMAN_TEL =", value, "linkmanTel");
            return (Criteria) this;
        }

        public Criteria andLinkmanTelNotEqualTo(String value) {
            addCriterion("LINKMAN_TEL <>", value, "linkmanTel");
            return (Criteria) this;
        }

        public Criteria andLinkmanTelGreaterThan(String value) {
            addCriterion("LINKMAN_TEL >", value, "linkmanTel");
            return (Criteria) this;
        }

        public Criteria andLinkmanTelGreaterThanOrEqualTo(String value) {
            addCriterion("LINKMAN_TEL >=", value, "linkmanTel");
            return (Criteria) this;
        }

        public Criteria andLinkmanTelLessThan(String value) {
            addCriterion("LINKMAN_TEL <", value, "linkmanTel");
            return (Criteria) this;
        }

        public Criteria andLinkmanTelLessThanOrEqualTo(String value) {
            addCriterion("LINKMAN_TEL <=", value, "linkmanTel");
            return (Criteria) this;
        }

        public Criteria andLinkmanTelLike(String value) {
            addCriterion("LINKMAN_TEL like", value, "linkmanTel");
            return (Criteria) this;
        }

        public Criteria andLinkmanTelNotLike(String value) {
            addCriterion("LINKMAN_TEL not like", value, "linkmanTel");
            return (Criteria) this;
        }

        public Criteria andLinkmanTelIn(List<String> values) {
            addCriterion("LINKMAN_TEL in", values, "linkmanTel");
            return (Criteria) this;
        }

        public Criteria andLinkmanTelNotIn(List<String> values) {
            addCriterion("LINKMAN_TEL not in", values, "linkmanTel");
            return (Criteria) this;
        }

        public Criteria andLinkmanTelBetween(String value1, String value2) {
            addCriterion("LINKMAN_TEL between", value1, value2, "linkmanTel");
            return (Criteria) this;
        }

        public Criteria andLinkmanTelNotBetween(String value1, String value2) {
            addCriterion("LINKMAN_TEL not between", value1, value2, "linkmanTel");
            return (Criteria) this;
        }

        public Criteria andLinkmanMobileIsNull() {
            addCriterion("LINKMAN_MOBILE is null");
            return (Criteria) this;
        }

        public Criteria andLinkmanMobileIsNotNull() {
            addCriterion("LINKMAN_MOBILE is not null");
            return (Criteria) this;
        }

        public Criteria andLinkmanMobileEqualTo(String value) {
            addCriterion("LINKMAN_MOBILE =", value, "linkmanMobile");
            return (Criteria) this;
        }

        public Criteria andLinkmanMobileNotEqualTo(String value) {
            addCriterion("LINKMAN_MOBILE <>", value, "linkmanMobile");
            return (Criteria) this;
        }

        public Criteria andLinkmanMobileGreaterThan(String value) {
            addCriterion("LINKMAN_MOBILE >", value, "linkmanMobile");
            return (Criteria) this;
        }

        public Criteria andLinkmanMobileGreaterThanOrEqualTo(String value) {
            addCriterion("LINKMAN_MOBILE >=", value, "linkmanMobile");
            return (Criteria) this;
        }

        public Criteria andLinkmanMobileLessThan(String value) {
            addCriterion("LINKMAN_MOBILE <", value, "linkmanMobile");
            return (Criteria) this;
        }

        public Criteria andLinkmanMobileLessThanOrEqualTo(String value) {
            addCriterion("LINKMAN_MOBILE <=", value, "linkmanMobile");
            return (Criteria) this;
        }

        public Criteria andLinkmanMobileLike(String value) {
            addCriterion("LINKMAN_MOBILE like", value, "linkmanMobile");
            return (Criteria) this;
        }

        public Criteria andLinkmanMobileNotLike(String value) {
            addCriterion("LINKMAN_MOBILE not like", value, "linkmanMobile");
            return (Criteria) this;
        }

        public Criteria andLinkmanMobileIn(List<String> values) {
            addCriterion("LINKMAN_MOBILE in", values, "linkmanMobile");
            return (Criteria) this;
        }

        public Criteria andLinkmanMobileNotIn(List<String> values) {
            addCriterion("LINKMAN_MOBILE not in", values, "linkmanMobile");
            return (Criteria) this;
        }

        public Criteria andLinkmanMobileBetween(String value1, String value2) {
            addCriterion("LINKMAN_MOBILE between", value1, value2, "linkmanMobile");
            return (Criteria) this;
        }

        public Criteria andLinkmanMobileNotBetween(String value1, String value2) {
            addCriterion("LINKMAN_MOBILE not between", value1, value2, "linkmanMobile");
            return (Criteria) this;
        }

        public Criteria andLinkmanFaxIsNull() {
            addCriterion("LINKMAN_FAX is null");
            return (Criteria) this;
        }

        public Criteria andLinkmanFaxIsNotNull() {
            addCriterion("LINKMAN_FAX is not null");
            return (Criteria) this;
        }

        public Criteria andLinkmanFaxEqualTo(String value) {
            addCriterion("LINKMAN_FAX =", value, "linkmanFax");
            return (Criteria) this;
        }

        public Criteria andLinkmanFaxNotEqualTo(String value) {
            addCriterion("LINKMAN_FAX <>", value, "linkmanFax");
            return (Criteria) this;
        }

        public Criteria andLinkmanFaxGreaterThan(String value) {
            addCriterion("LINKMAN_FAX >", value, "linkmanFax");
            return (Criteria) this;
        }

        public Criteria andLinkmanFaxGreaterThanOrEqualTo(String value) {
            addCriterion("LINKMAN_FAX >=", value, "linkmanFax");
            return (Criteria) this;
        }

        public Criteria andLinkmanFaxLessThan(String value) {
            addCriterion("LINKMAN_FAX <", value, "linkmanFax");
            return (Criteria) this;
        }

        public Criteria andLinkmanFaxLessThanOrEqualTo(String value) {
            addCriterion("LINKMAN_FAX <=", value, "linkmanFax");
            return (Criteria) this;
        }

        public Criteria andLinkmanFaxLike(String value) {
            addCriterion("LINKMAN_FAX like", value, "linkmanFax");
            return (Criteria) this;
        }

        public Criteria andLinkmanFaxNotLike(String value) {
            addCriterion("LINKMAN_FAX not like", value, "linkmanFax");
            return (Criteria) this;
        }

        public Criteria andLinkmanFaxIn(List<String> values) {
            addCriterion("LINKMAN_FAX in", values, "linkmanFax");
            return (Criteria) this;
        }

        public Criteria andLinkmanFaxNotIn(List<String> values) {
            addCriterion("LINKMAN_FAX not in", values, "linkmanFax");
            return (Criteria) this;
        }

        public Criteria andLinkmanFaxBetween(String value1, String value2) {
            addCriterion("LINKMAN_FAX between", value1, value2, "linkmanFax");
            return (Criteria) this;
        }

        public Criteria andLinkmanFaxNotBetween(String value1, String value2) {
            addCriterion("LINKMAN_FAX not between", value1, value2, "linkmanFax");
            return (Criteria) this;
        }

        public Criteria andLinkmanEmailIsNull() {
            addCriterion("LINKMAN_EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andLinkmanEmailIsNotNull() {
            addCriterion("LINKMAN_EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andLinkmanEmailEqualTo(String value) {
            addCriterion("LINKMAN_EMAIL =", value, "linkmanEmail");
            return (Criteria) this;
        }

        public Criteria andLinkmanEmailNotEqualTo(String value) {
            addCriterion("LINKMAN_EMAIL <>", value, "linkmanEmail");
            return (Criteria) this;
        }

        public Criteria andLinkmanEmailGreaterThan(String value) {
            addCriterion("LINKMAN_EMAIL >", value, "linkmanEmail");
            return (Criteria) this;
        }

        public Criteria andLinkmanEmailGreaterThanOrEqualTo(String value) {
            addCriterion("LINKMAN_EMAIL >=", value, "linkmanEmail");
            return (Criteria) this;
        }

        public Criteria andLinkmanEmailLessThan(String value) {
            addCriterion("LINKMAN_EMAIL <", value, "linkmanEmail");
            return (Criteria) this;
        }

        public Criteria andLinkmanEmailLessThanOrEqualTo(String value) {
            addCriterion("LINKMAN_EMAIL <=", value, "linkmanEmail");
            return (Criteria) this;
        }

        public Criteria andLinkmanEmailLike(String value) {
            addCriterion("LINKMAN_EMAIL like", value, "linkmanEmail");
            return (Criteria) this;
        }

        public Criteria andLinkmanEmailNotLike(String value) {
            addCriterion("LINKMAN_EMAIL not like", value, "linkmanEmail");
            return (Criteria) this;
        }

        public Criteria andLinkmanEmailIn(List<String> values) {
            addCriterion("LINKMAN_EMAIL in", values, "linkmanEmail");
            return (Criteria) this;
        }

        public Criteria andLinkmanEmailNotIn(List<String> values) {
            addCriterion("LINKMAN_EMAIL not in", values, "linkmanEmail");
            return (Criteria) this;
        }

        public Criteria andLinkmanEmailBetween(String value1, String value2) {
            addCriterion("LINKMAN_EMAIL between", value1, value2, "linkmanEmail");
            return (Criteria) this;
        }

        public Criteria andLinkmanEmailNotBetween(String value1, String value2) {
            addCriterion("LINKMAN_EMAIL not between", value1, value2, "linkmanEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerImIsNull() {
            addCriterion("CUSTOMER_IM is null");
            return (Criteria) this;
        }

        public Criteria andCustomerImIsNotNull() {
            addCriterion("CUSTOMER_IM is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerImEqualTo(String value) {
            addCriterion("CUSTOMER_IM =", value, "customerIm");
            return (Criteria) this;
        }

        public Criteria andCustomerImNotEqualTo(String value) {
            addCriterion("CUSTOMER_IM <>", value, "customerIm");
            return (Criteria) this;
        }

        public Criteria andCustomerImGreaterThan(String value) {
            addCriterion("CUSTOMER_IM >", value, "customerIm");
            return (Criteria) this;
        }

        public Criteria andCustomerImGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_IM >=", value, "customerIm");
            return (Criteria) this;
        }

        public Criteria andCustomerImLessThan(String value) {
            addCriterion("CUSTOMER_IM <", value, "customerIm");
            return (Criteria) this;
        }

        public Criteria andCustomerImLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_IM <=", value, "customerIm");
            return (Criteria) this;
        }

        public Criteria andCustomerImLike(String value) {
            addCriterion("CUSTOMER_IM like", value, "customerIm");
            return (Criteria) this;
        }

        public Criteria andCustomerImNotLike(String value) {
            addCriterion("CUSTOMER_IM not like", value, "customerIm");
            return (Criteria) this;
        }

        public Criteria andCustomerImIn(List<String> values) {
            addCriterion("CUSTOMER_IM in", values, "customerIm");
            return (Criteria) this;
        }

        public Criteria andCustomerImNotIn(List<String> values) {
            addCriterion("CUSTOMER_IM not in", values, "customerIm");
            return (Criteria) this;
        }

        public Criteria andCustomerImBetween(String value1, String value2) {
            addCriterion("CUSTOMER_IM between", value1, value2, "customerIm");
            return (Criteria) this;
        }

        public Criteria andCustomerImNotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_IM not between", value1, value2, "customerIm");
            return (Criteria) this;
        }

        public Criteria andBillCycleIdIsNull() {
            addCriterion("BILL_CYCLE_ID is null");
            return (Criteria) this;
        }

        public Criteria andBillCycleIdIsNotNull() {
            addCriterion("BILL_CYCLE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBillCycleIdEqualTo(BigDecimal value) {
            addCriterion("BILL_CYCLE_ID =", value, "billCycleId");
            return (Criteria) this;
        }

        public Criteria andBillCycleIdNotEqualTo(BigDecimal value) {
            addCriterion("BILL_CYCLE_ID <>", value, "billCycleId");
            return (Criteria) this;
        }

        public Criteria andBillCycleIdGreaterThan(BigDecimal value) {
            addCriterion("BILL_CYCLE_ID >", value, "billCycleId");
            return (Criteria) this;
        }

        public Criteria andBillCycleIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BILL_CYCLE_ID >=", value, "billCycleId");
            return (Criteria) this;
        }

        public Criteria andBillCycleIdLessThan(BigDecimal value) {
            addCriterion("BILL_CYCLE_ID <", value, "billCycleId");
            return (Criteria) this;
        }

        public Criteria andBillCycleIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BILL_CYCLE_ID <=", value, "billCycleId");
            return (Criteria) this;
        }

        public Criteria andBillCycleIdIn(List<BigDecimal> values) {
            addCriterion("BILL_CYCLE_ID in", values, "billCycleId");
            return (Criteria) this;
        }

        public Criteria andBillCycleIdNotIn(List<BigDecimal> values) {
            addCriterion("BILL_CYCLE_ID not in", values, "billCycleId");
            return (Criteria) this;
        }

        public Criteria andBillCycleIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BILL_CYCLE_ID between", value1, value2, "billCycleId");
            return (Criteria) this;
        }

        public Criteria andBillCycleIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BILL_CYCLE_ID not between", value1, value2, "billCycleId");
            return (Criteria) this;
        }

        public Criteria andBillCycleCodeIsNull() {
            addCriterion("BILL_CYCLE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andBillCycleCodeIsNotNull() {
            addCriterion("BILL_CYCLE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andBillCycleCodeEqualTo(String value) {
            addCriterion("BILL_CYCLE_CODE =", value, "billCycleCode");
            return (Criteria) this;
        }

        public Criteria andBillCycleCodeNotEqualTo(String value) {
            addCriterion("BILL_CYCLE_CODE <>", value, "billCycleCode");
            return (Criteria) this;
        }

        public Criteria andBillCycleCodeGreaterThan(String value) {
            addCriterion("BILL_CYCLE_CODE >", value, "billCycleCode");
            return (Criteria) this;
        }

        public Criteria andBillCycleCodeGreaterThanOrEqualTo(String value) {
            addCriterion("BILL_CYCLE_CODE >=", value, "billCycleCode");
            return (Criteria) this;
        }

        public Criteria andBillCycleCodeLessThan(String value) {
            addCriterion("BILL_CYCLE_CODE <", value, "billCycleCode");
            return (Criteria) this;
        }

        public Criteria andBillCycleCodeLessThanOrEqualTo(String value) {
            addCriterion("BILL_CYCLE_CODE <=", value, "billCycleCode");
            return (Criteria) this;
        }

        public Criteria andBillCycleCodeLike(String value) {
            addCriterion("BILL_CYCLE_CODE like", value, "billCycleCode");
            return (Criteria) this;
        }

        public Criteria andBillCycleCodeNotLike(String value) {
            addCriterion("BILL_CYCLE_CODE not like", value, "billCycleCode");
            return (Criteria) this;
        }

        public Criteria andBillCycleCodeIn(List<String> values) {
            addCriterion("BILL_CYCLE_CODE in", values, "billCycleCode");
            return (Criteria) this;
        }

        public Criteria andBillCycleCodeNotIn(List<String> values) {
            addCriterion("BILL_CYCLE_CODE not in", values, "billCycleCode");
            return (Criteria) this;
        }

        public Criteria andBillCycleCodeBetween(String value1, String value2) {
            addCriterion("BILL_CYCLE_CODE between", value1, value2, "billCycleCode");
            return (Criteria) this;
        }

        public Criteria andBillCycleCodeNotBetween(String value1, String value2) {
            addCriterion("BILL_CYCLE_CODE not between", value1, value2, "billCycleCode");
            return (Criteria) this;
        }

        public Criteria andPaymentDayIsNull() {
            addCriterion("PAYMENT_DAY is null");
            return (Criteria) this;
        }

        public Criteria andPaymentDayIsNotNull() {
            addCriterion("PAYMENT_DAY is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentDayEqualTo(Integer value) {
            addCriterion("PAYMENT_DAY =", value, "paymentDay");
            return (Criteria) this;
        }

        public Criteria andPaymentDayNotEqualTo(Integer value) {
            addCriterion("PAYMENT_DAY <>", value, "paymentDay");
            return (Criteria) this;
        }

        public Criteria andPaymentDayGreaterThan(Integer value) {
            addCriterion("PAYMENT_DAY >", value, "paymentDay");
            return (Criteria) this;
        }

        public Criteria andPaymentDayGreaterThanOrEqualTo(Integer value) {
            addCriterion("PAYMENT_DAY >=", value, "paymentDay");
            return (Criteria) this;
        }

        public Criteria andPaymentDayLessThan(Integer value) {
            addCriterion("PAYMENT_DAY <", value, "paymentDay");
            return (Criteria) this;
        }

        public Criteria andPaymentDayLessThanOrEqualTo(Integer value) {
            addCriterion("PAYMENT_DAY <=", value, "paymentDay");
            return (Criteria) this;
        }

        public Criteria andPaymentDayIn(List<Integer> values) {
            addCriterion("PAYMENT_DAY in", values, "paymentDay");
            return (Criteria) this;
        }

        public Criteria andPaymentDayNotIn(List<Integer> values) {
            addCriterion("PAYMENT_DAY not in", values, "paymentDay");
            return (Criteria) this;
        }

        public Criteria andPaymentDayBetween(Integer value1, Integer value2) {
            addCriterion("PAYMENT_DAY between", value1, value2, "paymentDay");
            return (Criteria) this;
        }

        public Criteria andPaymentDayNotBetween(Integer value1, Integer value2) {
            addCriterion("PAYMENT_DAY not between", value1, value2, "paymentDay");
            return (Criteria) this;
        }

        public Criteria andCustomerIsAdvanceIsNull() {
            addCriterion("CUSTOMER_IS_ADVANCE is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIsAdvanceIsNotNull() {
            addCriterion("CUSTOMER_IS_ADVANCE is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerIsAdvanceEqualTo(String value) {
            addCriterion("CUSTOMER_IS_ADVANCE =", value, "customerIsAdvance");
            return (Criteria) this;
        }

        public Criteria andCustomerIsAdvanceNotEqualTo(String value) {
            addCriterion("CUSTOMER_IS_ADVANCE <>", value, "customerIsAdvance");
            return (Criteria) this;
        }

        public Criteria andCustomerIsAdvanceGreaterThan(String value) {
            addCriterion("CUSTOMER_IS_ADVANCE >", value, "customerIsAdvance");
            return (Criteria) this;
        }

        public Criteria andCustomerIsAdvanceGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_IS_ADVANCE >=", value, "customerIsAdvance");
            return (Criteria) this;
        }

        public Criteria andCustomerIsAdvanceLessThan(String value) {
            addCriterion("CUSTOMER_IS_ADVANCE <", value, "customerIsAdvance");
            return (Criteria) this;
        }

        public Criteria andCustomerIsAdvanceLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_IS_ADVANCE <=", value, "customerIsAdvance");
            return (Criteria) this;
        }

        public Criteria andCustomerIsAdvanceLike(String value) {
            addCriterion("CUSTOMER_IS_ADVANCE like", value, "customerIsAdvance");
            return (Criteria) this;
        }

        public Criteria andCustomerIsAdvanceNotLike(String value) {
            addCriterion("CUSTOMER_IS_ADVANCE not like", value, "customerIsAdvance");
            return (Criteria) this;
        }

        public Criteria andCustomerIsAdvanceIn(List<String> values) {
            addCriterion("CUSTOMER_IS_ADVANCE in", values, "customerIsAdvance");
            return (Criteria) this;
        }

        public Criteria andCustomerIsAdvanceNotIn(List<String> values) {
            addCriterion("CUSTOMER_IS_ADVANCE not in", values, "customerIsAdvance");
            return (Criteria) this;
        }

        public Criteria andCustomerIsAdvanceBetween(String value1, String value2) {
            addCriterion("CUSTOMER_IS_ADVANCE between", value1, value2, "customerIsAdvance");
            return (Criteria) this;
        }

        public Criteria andCustomerIsAdvanceNotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_IS_ADVANCE not between", value1, value2, "customerIsAdvance");
            return (Criteria) this;
        }

        public Criteria andAdvancePaymentIsNull() {
            addCriterion("ADVANCE_PAYMENT is null");
            return (Criteria) this;
        }

        public Criteria andAdvancePaymentIsNotNull() {
            addCriterion("ADVANCE_PAYMENT is not null");
            return (Criteria) this;
        }

        public Criteria andAdvancePaymentEqualTo(BigDecimal value) {
            addCriterion("ADVANCE_PAYMENT =", value, "advancePayment");
            return (Criteria) this;
        }

        public Criteria andAdvancePaymentNotEqualTo(BigDecimal value) {
            addCriterion("ADVANCE_PAYMENT <>", value, "advancePayment");
            return (Criteria) this;
        }

        public Criteria andAdvancePaymentGreaterThan(BigDecimal value) {
            addCriterion("ADVANCE_PAYMENT >", value, "advancePayment");
            return (Criteria) this;
        }

        public Criteria andAdvancePaymentGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ADVANCE_PAYMENT >=", value, "advancePayment");
            return (Criteria) this;
        }

        public Criteria andAdvancePaymentLessThan(BigDecimal value) {
            addCriterion("ADVANCE_PAYMENT <", value, "advancePayment");
            return (Criteria) this;
        }

        public Criteria andAdvancePaymentLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ADVANCE_PAYMENT <=", value, "advancePayment");
            return (Criteria) this;
        }

        public Criteria andAdvancePaymentIn(List<BigDecimal> values) {
            addCriterion("ADVANCE_PAYMENT in", values, "advancePayment");
            return (Criteria) this;
        }

        public Criteria andAdvancePaymentNotIn(List<BigDecimal> values) {
            addCriterion("ADVANCE_PAYMENT not in", values, "advancePayment");
            return (Criteria) this;
        }

        public Criteria andAdvancePaymentBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ADVANCE_PAYMENT between", value1, value2, "advancePayment");
            return (Criteria) this;
        }

        public Criteria andAdvancePaymentNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ADVANCE_PAYMENT not between", value1, value2, "advancePayment");
            return (Criteria) this;
        }

        public Criteria andAntecedentMoneyIsNull() {
            addCriterion("ANTECEDENT_MONEY is null");
            return (Criteria) this;
        }

        public Criteria andAntecedentMoneyIsNotNull() {
            addCriterion("ANTECEDENT_MONEY is not null");
            return (Criteria) this;
        }

        public Criteria andAntecedentMoneyEqualTo(BigDecimal value) {
            addCriterion("ANTECEDENT_MONEY =", value, "antecedentMoney");
            return (Criteria) this;
        }

        public Criteria andAntecedentMoneyNotEqualTo(BigDecimal value) {
            addCriterion("ANTECEDENT_MONEY <>", value, "antecedentMoney");
            return (Criteria) this;
        }

        public Criteria andAntecedentMoneyGreaterThan(BigDecimal value) {
            addCriterion("ANTECEDENT_MONEY >", value, "antecedentMoney");
            return (Criteria) this;
        }

        public Criteria andAntecedentMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ANTECEDENT_MONEY >=", value, "antecedentMoney");
            return (Criteria) this;
        }

        public Criteria andAntecedentMoneyLessThan(BigDecimal value) {
            addCriterion("ANTECEDENT_MONEY <", value, "antecedentMoney");
            return (Criteria) this;
        }

        public Criteria andAntecedentMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ANTECEDENT_MONEY <=", value, "antecedentMoney");
            return (Criteria) this;
        }

        public Criteria andAntecedentMoneyIn(List<BigDecimal> values) {
            addCriterion("ANTECEDENT_MONEY in", values, "antecedentMoney");
            return (Criteria) this;
        }

        public Criteria andAntecedentMoneyNotIn(List<BigDecimal> values) {
            addCriterion("ANTECEDENT_MONEY not in", values, "antecedentMoney");
            return (Criteria) this;
        }

        public Criteria andAntecedentMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ANTECEDENT_MONEY between", value1, value2, "antecedentMoney");
            return (Criteria) this;
        }

        public Criteria andAntecedentMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ANTECEDENT_MONEY not between", value1, value2, "antecedentMoney");
            return (Criteria) this;
        }

        public Criteria andKingdeeInterfaceIsNull() {
            addCriterion("KINGDEE_INTERFACE is null");
            return (Criteria) this;
        }

        public Criteria andKingdeeInterfaceIsNotNull() {
            addCriterion("KINGDEE_INTERFACE is not null");
            return (Criteria) this;
        }

        public Criteria andKingdeeInterfaceEqualTo(String value) {
            addCriterion("KINGDEE_INTERFACE =", value, "kingdeeInterface");
            return (Criteria) this;
        }

        public Criteria andKingdeeInterfaceNotEqualTo(String value) {
            addCriterion("KINGDEE_INTERFACE <>", value, "kingdeeInterface");
            return (Criteria) this;
        }

        public Criteria andKingdeeInterfaceGreaterThan(String value) {
            addCriterion("KINGDEE_INTERFACE >", value, "kingdeeInterface");
            return (Criteria) this;
        }

        public Criteria andKingdeeInterfaceGreaterThanOrEqualTo(String value) {
            addCriterion("KINGDEE_INTERFACE >=", value, "kingdeeInterface");
            return (Criteria) this;
        }

        public Criteria andKingdeeInterfaceLessThan(String value) {
            addCriterion("KINGDEE_INTERFACE <", value, "kingdeeInterface");
            return (Criteria) this;
        }

        public Criteria andKingdeeInterfaceLessThanOrEqualTo(String value) {
            addCriterion("KINGDEE_INTERFACE <=", value, "kingdeeInterface");
            return (Criteria) this;
        }

        public Criteria andKingdeeInterfaceLike(String value) {
            addCriterion("KINGDEE_INTERFACE like", value, "kingdeeInterface");
            return (Criteria) this;
        }

        public Criteria andKingdeeInterfaceNotLike(String value) {
            addCriterion("KINGDEE_INTERFACE not like", value, "kingdeeInterface");
            return (Criteria) this;
        }

        public Criteria andKingdeeInterfaceIn(List<String> values) {
            addCriterion("KINGDEE_INTERFACE in", values, "kingdeeInterface");
            return (Criteria) this;
        }

        public Criteria andKingdeeInterfaceNotIn(List<String> values) {
            addCriterion("KINGDEE_INTERFACE not in", values, "kingdeeInterface");
            return (Criteria) this;
        }

        public Criteria andKingdeeInterfaceBetween(String value1, String value2) {
            addCriterion("KINGDEE_INTERFACE between", value1, value2, "kingdeeInterface");
            return (Criteria) this;
        }

        public Criteria andKingdeeInterfaceNotBetween(String value1, String value2) {
            addCriterion("KINGDEE_INTERFACE not between", value1, value2, "kingdeeInterface");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("UPDATE_TIME =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("UPDATE_TIME <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("UPDATE_TIME >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("UPDATE_TIME <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("UPDATE_TIME in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("UPDATE_TIME not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME not between", value1, value2, "updateTime");
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