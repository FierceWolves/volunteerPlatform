package cn.edu.nsu.greywolf.pojo;

import java.util.ArrayList;
import java.util.List;

public class OriginsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OriginsExample() {
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

        public Criteria andOriginIdIsNull() {
            addCriterion("originId is null");
            return (Criteria) this;
        }

        public Criteria andOriginIdIsNotNull() {
            addCriterion("originId is not null");
            return (Criteria) this;
        }

        public Criteria andOriginIdEqualTo(Integer value) {
            addCriterion("originId =", value, "originId");
            return (Criteria) this;
        }

        public Criteria andOriginIdNotEqualTo(Integer value) {
            addCriterion("originId <>", value, "originId");
            return (Criteria) this;
        }

        public Criteria andOriginIdGreaterThan(Integer value) {
            addCriterion("originId >", value, "originId");
            return (Criteria) this;
        }

        public Criteria andOriginIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("originId >=", value, "originId");
            return (Criteria) this;
        }

        public Criteria andOriginIdLessThan(Integer value) {
            addCriterion("originId <", value, "originId");
            return (Criteria) this;
        }

        public Criteria andOriginIdLessThanOrEqualTo(Integer value) {
            addCriterion("originId <=", value, "originId");
            return (Criteria) this;
        }

        public Criteria andOriginIdIn(List<Integer> values) {
            addCriterion("originId in", values, "originId");
            return (Criteria) this;
        }

        public Criteria andOriginIdNotIn(List<Integer> values) {
            addCriterion("originId not in", values, "originId");
            return (Criteria) this;
        }

        public Criteria andOriginIdBetween(Integer value1, Integer value2) {
            addCriterion("originId between", value1, value2, "originId");
            return (Criteria) this;
        }

        public Criteria andOriginIdNotBetween(Integer value1, Integer value2) {
            addCriterion("originId not between", value1, value2, "originId");
            return (Criteria) this;
        }

        public Criteria andOriginNameIsNull() {
            addCriterion("originName is null");
            return (Criteria) this;
        }

        public Criteria andOriginNameIsNotNull() {
            addCriterion("originName is not null");
            return (Criteria) this;
        }

        public Criteria andOriginNameEqualTo(String value) {
            addCriterion("originName =", value, "originName");
            return (Criteria) this;
        }

        public Criteria andOriginNameNotEqualTo(String value) {
            addCriterion("originName <>", value, "originName");
            return (Criteria) this;
        }

        public Criteria andOriginNameGreaterThan(String value) {
            addCriterion("originName >", value, "originName");
            return (Criteria) this;
        }

        public Criteria andOriginNameGreaterThanOrEqualTo(String value) {
            addCriterion("originName >=", value, "originName");
            return (Criteria) this;
        }

        public Criteria andOriginNameLessThan(String value) {
            addCriterion("originName <", value, "originName");
            return (Criteria) this;
        }

        public Criteria andOriginNameLessThanOrEqualTo(String value) {
            addCriterion("originName <=", value, "originName");
            return (Criteria) this;
        }

        public Criteria andOriginNameLike(String value) {
            addCriterion("originName like", value, "originName");
            return (Criteria) this;
        }

        public Criteria andOriginNameNotLike(String value) {
            addCriterion("originName not like", value, "originName");
            return (Criteria) this;
        }

        public Criteria andOriginNameIn(List<String> values) {
            addCriterion("originName in", values, "originName");
            return (Criteria) this;
        }

        public Criteria andOriginNameNotIn(List<String> values) {
            addCriterion("originName not in", values, "originName");
            return (Criteria) this;
        }

        public Criteria andOriginNameBetween(String value1, String value2) {
            addCriterion("originName between", value1, value2, "originName");
            return (Criteria) this;
        }

        public Criteria andOriginNameNotBetween(String value1, String value2) {
            addCriterion("originName not between", value1, value2, "originName");
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