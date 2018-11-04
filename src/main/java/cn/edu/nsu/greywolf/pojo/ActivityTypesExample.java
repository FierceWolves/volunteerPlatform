package cn.edu.nsu.greywolf.pojo;

import java.util.ArrayList;
import java.util.List;

public class ActivityTypesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ActivityTypesExample() {
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

        public Criteria andActivityTypeIdIsNull() {
            addCriterion("activityTypeId is null");
            return (Criteria) this;
        }

        public Criteria andActivityTypeIdIsNotNull() {
            addCriterion("activityTypeId is not null");
            return (Criteria) this;
        }

        public Criteria andActivityTypeIdEqualTo(Integer value) {
            addCriterion("activityTypeId =", value, "activityTypeId");
            return (Criteria) this;
        }

        public Criteria andActivityTypeIdNotEqualTo(Integer value) {
            addCriterion("activityTypeId <>", value, "activityTypeId");
            return (Criteria) this;
        }

        public Criteria andActivityTypeIdGreaterThan(Integer value) {
            addCriterion("activityTypeId >", value, "activityTypeId");
            return (Criteria) this;
        }

        public Criteria andActivityTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("activityTypeId >=", value, "activityTypeId");
            return (Criteria) this;
        }

        public Criteria andActivityTypeIdLessThan(Integer value) {
            addCriterion("activityTypeId <", value, "activityTypeId");
            return (Criteria) this;
        }

        public Criteria andActivityTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("activityTypeId <=", value, "activityTypeId");
            return (Criteria) this;
        }

        public Criteria andActivityTypeIdIn(List<Integer> values) {
            addCriterion("activityTypeId in", values, "activityTypeId");
            return (Criteria) this;
        }

        public Criteria andActivityTypeIdNotIn(List<Integer> values) {
            addCriterion("activityTypeId not in", values, "activityTypeId");
            return (Criteria) this;
        }

        public Criteria andActivityTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("activityTypeId between", value1, value2, "activityTypeId");
            return (Criteria) this;
        }

        public Criteria andActivityTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("activityTypeId not between", value1, value2, "activityTypeId");
            return (Criteria) this;
        }

        public Criteria andActivityTypeNameIsNull() {
            addCriterion("activityTypeName is null");
            return (Criteria) this;
        }

        public Criteria andActivityTypeNameIsNotNull() {
            addCriterion("activityTypeName is not null");
            return (Criteria) this;
        }

        public Criteria andActivityTypeNameEqualTo(String value) {
            addCriterion("activityTypeName =", value, "activityTypeName");
            return (Criteria) this;
        }

        public Criteria andActivityTypeNameNotEqualTo(String value) {
            addCriterion("activityTypeName <>", value, "activityTypeName");
            return (Criteria) this;
        }

        public Criteria andActivityTypeNameGreaterThan(String value) {
            addCriterion("activityTypeName >", value, "activityTypeName");
            return (Criteria) this;
        }

        public Criteria andActivityTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("activityTypeName >=", value, "activityTypeName");
            return (Criteria) this;
        }

        public Criteria andActivityTypeNameLessThan(String value) {
            addCriterion("activityTypeName <", value, "activityTypeName");
            return (Criteria) this;
        }

        public Criteria andActivityTypeNameLessThanOrEqualTo(String value) {
            addCriterion("activityTypeName <=", value, "activityTypeName");
            return (Criteria) this;
        }

        public Criteria andActivityTypeNameLike(String value) {
            addCriterion("activityTypeName like", value, "activityTypeName");
            return (Criteria) this;
        }

        public Criteria andActivityTypeNameNotLike(String value) {
            addCriterion("activityTypeName not like", value, "activityTypeName");
            return (Criteria) this;
        }

        public Criteria andActivityTypeNameIn(List<String> values) {
            addCriterion("activityTypeName in", values, "activityTypeName");
            return (Criteria) this;
        }

        public Criteria andActivityTypeNameNotIn(List<String> values) {
            addCriterion("activityTypeName not in", values, "activityTypeName");
            return (Criteria) this;
        }

        public Criteria andActivityTypeNameBetween(String value1, String value2) {
            addCriterion("activityTypeName between", value1, value2, "activityTypeName");
            return (Criteria) this;
        }

        public Criteria andActivityTypeNameNotBetween(String value1, String value2) {
            addCriterion("activityTypeName not between", value1, value2, "activityTypeName");
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