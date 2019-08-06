package com.xfanread.service.impl.content.po;

import java.util.ArrayList;
import java.util.List;

public class BookEsotericaRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BookEsotericaRecordExample() {
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

        public Criteria andBookIdIsNull() {
            addCriterion("book_id is null");
            return (Criteria) this;
        }

        public Criteria andBookIdIsNotNull() {
            addCriterion("book_id is not null");
            return (Criteria) this;
        }

        public Criteria andBookIdEqualTo(Integer value) {
            addCriterion("book_id =", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotEqualTo(Integer value) {
            addCriterion("book_id <>", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdGreaterThan(Integer value) {
            addCriterion("book_id >", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("book_id >=", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdLessThan(Integer value) {
            addCriterion("book_id <", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdLessThanOrEqualTo(Integer value) {
            addCriterion("book_id <=", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdIn(List<Integer> values) {
            addCriterion("book_id in", values, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotIn(List<Integer> values) {
            addCriterion("book_id not in", values, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdBetween(Integer value1, Integer value2) {
            addCriterion("book_id between", value1, value2, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotBetween(Integer value1, Integer value2) {
            addCriterion("book_id not between", value1, value2, "bookId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNull() {
            addCriterion("member_id is null");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNotNull() {
            addCriterion("member_id is not null");
            return (Criteria) this;
        }

        public Criteria andMemberIdEqualTo(Long value) {
            addCriterion("member_id =", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotEqualTo(Long value) {
            addCriterion("member_id <>", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThan(Long value) {
            addCriterion("member_id >", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThanOrEqualTo(Long value) {
            addCriterion("member_id >=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThan(Long value) {
            addCriterion("member_id <", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThanOrEqualTo(Long value) {
            addCriterion("member_id <=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIn(List<Long> values) {
            addCriterion("member_id in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotIn(List<Long> values) {
            addCriterion("member_id not in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdBetween(Long value1, Long value2) {
            addCriterion("member_id between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotBetween(Long value1, Long value2) {
            addCriterion("member_id not between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andPreviewSumIsNull() {
            addCriterion("preview_sum is null");
            return (Criteria) this;
        }

        public Criteria andPreviewSumIsNotNull() {
            addCriterion("preview_sum is not null");
            return (Criteria) this;
        }

        public Criteria andPreviewSumEqualTo(Integer value) {
            addCriterion("preview_sum =", value, "previewSum");
            return (Criteria) this;
        }

        public Criteria andPreviewSumNotEqualTo(Integer value) {
            addCriterion("preview_sum <>", value, "previewSum");
            return (Criteria) this;
        }

        public Criteria andPreviewSumGreaterThan(Integer value) {
            addCriterion("preview_sum >", value, "previewSum");
            return (Criteria) this;
        }

        public Criteria andPreviewSumGreaterThanOrEqualTo(Integer value) {
            addCriterion("preview_sum >=", value, "previewSum");
            return (Criteria) this;
        }

        public Criteria andPreviewSumLessThan(Integer value) {
            addCriterion("preview_sum <", value, "previewSum");
            return (Criteria) this;
        }

        public Criteria andPreviewSumLessThanOrEqualTo(Integer value) {
            addCriterion("preview_sum <=", value, "previewSum");
            return (Criteria) this;
        }

        public Criteria andPreviewSumIn(List<Integer> values) {
            addCriterion("preview_sum in", values, "previewSum");
            return (Criteria) this;
        }

        public Criteria andPreviewSumNotIn(List<Integer> values) {
            addCriterion("preview_sum not in", values, "previewSum");
            return (Criteria) this;
        }

        public Criteria andPreviewSumBetween(Integer value1, Integer value2) {
            addCriterion("preview_sum between", value1, value2, "previewSum");
            return (Criteria) this;
        }

        public Criteria andPreviewSumNotBetween(Integer value1, Integer value2) {
            addCriterion("preview_sum not between", value1, value2, "previewSum");
            return (Criteria) this;
        }

        public Criteria andShareSumIsNull() {
            addCriterion("share_sum is null");
            return (Criteria) this;
        }

        public Criteria andShareSumIsNotNull() {
            addCriterion("share_sum is not null");
            return (Criteria) this;
        }

        public Criteria andShareSumEqualTo(Integer value) {
            addCriterion("share_sum =", value, "shareSum");
            return (Criteria) this;
        }

        public Criteria andShareSumNotEqualTo(Integer value) {
            addCriterion("share_sum <>", value, "shareSum");
            return (Criteria) this;
        }

        public Criteria andShareSumGreaterThan(Integer value) {
            addCriterion("share_sum >", value, "shareSum");
            return (Criteria) this;
        }

        public Criteria andShareSumGreaterThanOrEqualTo(Integer value) {
            addCriterion("share_sum >=", value, "shareSum");
            return (Criteria) this;
        }

        public Criteria andShareSumLessThan(Integer value) {
            addCriterion("share_sum <", value, "shareSum");
            return (Criteria) this;
        }

        public Criteria andShareSumLessThanOrEqualTo(Integer value) {
            addCriterion("share_sum <=", value, "shareSum");
            return (Criteria) this;
        }

        public Criteria andShareSumIn(List<Integer> values) {
            addCriterion("share_sum in", values, "shareSum");
            return (Criteria) this;
        }

        public Criteria andShareSumNotIn(List<Integer> values) {
            addCriterion("share_sum not in", values, "shareSum");
            return (Criteria) this;
        }

        public Criteria andShareSumBetween(Integer value1, Integer value2) {
            addCriterion("share_sum between", value1, value2, "shareSum");
            return (Criteria) this;
        }

        public Criteria andShareSumNotBetween(Integer value1, Integer value2) {
            addCriterion("share_sum not between", value1, value2, "shareSum");
            return (Criteria) this;
        }

        public Criteria andEmailSumIsNull() {
            addCriterion("email_sum is null");
            return (Criteria) this;
        }

        public Criteria andEmailSumIsNotNull() {
            addCriterion("email_sum is not null");
            return (Criteria) this;
        }

        public Criteria andEmailSumEqualTo(Integer value) {
            addCriterion("email_sum =", value, "emailSum");
            return (Criteria) this;
        }

        public Criteria andEmailSumNotEqualTo(Integer value) {
            addCriterion("email_sum <>", value, "emailSum");
            return (Criteria) this;
        }

        public Criteria andEmailSumGreaterThan(Integer value) {
            addCriterion("email_sum >", value, "emailSum");
            return (Criteria) this;
        }

        public Criteria andEmailSumGreaterThanOrEqualTo(Integer value) {
            addCriterion("email_sum >=", value, "emailSum");
            return (Criteria) this;
        }

        public Criteria andEmailSumLessThan(Integer value) {
            addCriterion("email_sum <", value, "emailSum");
            return (Criteria) this;
        }

        public Criteria andEmailSumLessThanOrEqualTo(Integer value) {
            addCriterion("email_sum <=", value, "emailSum");
            return (Criteria) this;
        }

        public Criteria andEmailSumIn(List<Integer> values) {
            addCriterion("email_sum in", values, "emailSum");
            return (Criteria) this;
        }

        public Criteria andEmailSumNotIn(List<Integer> values) {
            addCriterion("email_sum not in", values, "emailSum");
            return (Criteria) this;
        }

        public Criteria andEmailSumBetween(Integer value1, Integer value2) {
            addCriterion("email_sum between", value1, value2, "emailSum");
            return (Criteria) this;
        }

        public Criteria andEmailSumNotBetween(Integer value1, Integer value2) {
            addCriterion("email_sum not between", value1, value2, "emailSum");
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