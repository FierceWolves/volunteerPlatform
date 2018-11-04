package cn.edu.nsu.greywolf.pojo;

import java.util.ArrayList;
import java.util.List;

public class AdvicesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdvicesExample() {
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

        public Criteria andAdviceIdIsNull() {
            addCriterion("adviceId is null");
            return (Criteria) this;
        }

        public Criteria andAdviceIdIsNotNull() {
            addCriterion("adviceId is not null");
            return (Criteria) this;
        }

        public Criteria andAdviceIdEqualTo(Integer value) {
            addCriterion("adviceId =", value, "adviceId");
            return (Criteria) this;
        }

        public Criteria andAdviceIdNotEqualTo(Integer value) {
            addCriterion("adviceId <>", value, "adviceId");
            return (Criteria) this;
        }

        public Criteria andAdviceIdGreaterThan(Integer value) {
            addCriterion("adviceId >", value, "adviceId");
            return (Criteria) this;
        }

        public Criteria andAdviceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("adviceId >=", value, "adviceId");
            return (Criteria) this;
        }

        public Criteria andAdviceIdLessThan(Integer value) {
            addCriterion("adviceId <", value, "adviceId");
            return (Criteria) this;
        }

        public Criteria andAdviceIdLessThanOrEqualTo(Integer value) {
            addCriterion("adviceId <=", value, "adviceId");
            return (Criteria) this;
        }

        public Criteria andAdviceIdIn(List<Integer> values) {
            addCriterion("adviceId in", values, "adviceId");
            return (Criteria) this;
        }

        public Criteria andAdviceIdNotIn(List<Integer> values) {
            addCriterion("adviceId not in", values, "adviceId");
            return (Criteria) this;
        }

        public Criteria andAdviceIdBetween(Integer value1, Integer value2) {
            addCriterion("adviceId between", value1, value2, "adviceId");
            return (Criteria) this;
        }

        public Criteria andAdviceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("adviceId not between", value1, value2, "adviceId");
            return (Criteria) this;
        }

        public Criteria andAdviceContentIsNull() {
            addCriterion("adviceContent is null");
            return (Criteria) this;
        }

        public Criteria andAdviceContentIsNotNull() {
            addCriterion("adviceContent is not null");
            return (Criteria) this;
        }

        public Criteria andAdviceContentEqualTo(String value) {
            addCriterion("adviceContent =", value, "adviceContent");
            return (Criteria) this;
        }

        public Criteria andAdviceContentNotEqualTo(String value) {
            addCriterion("adviceContent <>", value, "adviceContent");
            return (Criteria) this;
        }

        public Criteria andAdviceContentGreaterThan(String value) {
            addCriterion("adviceContent >", value, "adviceContent");
            return (Criteria) this;
        }

        public Criteria andAdviceContentGreaterThanOrEqualTo(String value) {
            addCriterion("adviceContent >=", value, "adviceContent");
            return (Criteria) this;
        }

        public Criteria andAdviceContentLessThan(String value) {
            addCriterion("adviceContent <", value, "adviceContent");
            return (Criteria) this;
        }

        public Criteria andAdviceContentLessThanOrEqualTo(String value) {
            addCriterion("adviceContent <=", value, "adviceContent");
            return (Criteria) this;
        }

        public Criteria andAdviceContentLike(String value) {
            addCriterion("adviceContent like", value, "adviceContent");
            return (Criteria) this;
        }

        public Criteria andAdviceContentNotLike(String value) {
            addCriterion("adviceContent not like", value, "adviceContent");
            return (Criteria) this;
        }

        public Criteria andAdviceContentIn(List<String> values) {
            addCriterion("adviceContent in", values, "adviceContent");
            return (Criteria) this;
        }

        public Criteria andAdviceContentNotIn(List<String> values) {
            addCriterion("adviceContent not in", values, "adviceContent");
            return (Criteria) this;
        }

        public Criteria andAdviceContentBetween(String value1, String value2) {
            addCriterion("adviceContent between", value1, value2, "adviceContent");
            return (Criteria) this;
        }

        public Criteria andAdviceContentNotBetween(String value1, String value2) {
            addCriterion("adviceContent not between", value1, value2, "adviceContent");
            return (Criteria) this;
        }

        public Criteria andAdviceContactIsNull() {
            addCriterion("adviceContact is null");
            return (Criteria) this;
        }

        public Criteria andAdviceContactIsNotNull() {
            addCriterion("adviceContact is not null");
            return (Criteria) this;
        }

        public Criteria andAdviceContactEqualTo(String value) {
            addCriterion("adviceContact =", value, "adviceContact");
            return (Criteria) this;
        }

        public Criteria andAdviceContactNotEqualTo(String value) {
            addCriterion("adviceContact <>", value, "adviceContact");
            return (Criteria) this;
        }

        public Criteria andAdviceContactGreaterThan(String value) {
            addCriterion("adviceContact >", value, "adviceContact");
            return (Criteria) this;
        }

        public Criteria andAdviceContactGreaterThanOrEqualTo(String value) {
            addCriterion("adviceContact >=", value, "adviceContact");
            return (Criteria) this;
        }

        public Criteria andAdviceContactLessThan(String value) {
            addCriterion("adviceContact <", value, "adviceContact");
            return (Criteria) this;
        }

        public Criteria andAdviceContactLessThanOrEqualTo(String value) {
            addCriterion("adviceContact <=", value, "adviceContact");
            return (Criteria) this;
        }

        public Criteria andAdviceContactLike(String value) {
            addCriterion("adviceContact like", value, "adviceContact");
            return (Criteria) this;
        }

        public Criteria andAdviceContactNotLike(String value) {
            addCriterion("adviceContact not like", value, "adviceContact");
            return (Criteria) this;
        }

        public Criteria andAdviceContactIn(List<String> values) {
            addCriterion("adviceContact in", values, "adviceContact");
            return (Criteria) this;
        }

        public Criteria andAdviceContactNotIn(List<String> values) {
            addCriterion("adviceContact not in", values, "adviceContact");
            return (Criteria) this;
        }

        public Criteria andAdviceContactBetween(String value1, String value2) {
            addCriterion("adviceContact between", value1, value2, "adviceContact");
            return (Criteria) this;
        }

        public Criteria andAdviceContactNotBetween(String value1, String value2) {
            addCriterion("adviceContact not between", value1, value2, "adviceContact");
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