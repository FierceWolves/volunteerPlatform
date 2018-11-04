package cn.edu.nsu.greywolf.pojo;

import java.util.ArrayList;
import java.util.List;

public class OrgTypesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrgTypesExample() {
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

        public Criteria andOrgTypeIdIsNull() {
            addCriterion("orgTypeId is null");
            return (Criteria) this;
        }

        public Criteria andOrgTypeIdIsNotNull() {
            addCriterion("orgTypeId is not null");
            return (Criteria) this;
        }

        public Criteria andOrgTypeIdEqualTo(Integer value) {
            addCriterion("orgTypeId =", value, "orgTypeId");
            return (Criteria) this;
        }

        public Criteria andOrgTypeIdNotEqualTo(Integer value) {
            addCriterion("orgTypeId <>", value, "orgTypeId");
            return (Criteria) this;
        }

        public Criteria andOrgTypeIdGreaterThan(Integer value) {
            addCriterion("orgTypeId >", value, "orgTypeId");
            return (Criteria) this;
        }

        public Criteria andOrgTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("orgTypeId >=", value, "orgTypeId");
            return (Criteria) this;
        }

        public Criteria andOrgTypeIdLessThan(Integer value) {
            addCriterion("orgTypeId <", value, "orgTypeId");
            return (Criteria) this;
        }

        public Criteria andOrgTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("orgTypeId <=", value, "orgTypeId");
            return (Criteria) this;
        }

        public Criteria andOrgTypeIdIn(List<Integer> values) {
            addCriterion("orgTypeId in", values, "orgTypeId");
            return (Criteria) this;
        }

        public Criteria andOrgTypeIdNotIn(List<Integer> values) {
            addCriterion("orgTypeId not in", values, "orgTypeId");
            return (Criteria) this;
        }

        public Criteria andOrgTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("orgTypeId between", value1, value2, "orgTypeId");
            return (Criteria) this;
        }

        public Criteria andOrgTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("orgTypeId not between", value1, value2, "orgTypeId");
            return (Criteria) this;
        }

        public Criteria andOrgTypeNameIsNull() {
            addCriterion("orgTypeName is null");
            return (Criteria) this;
        }

        public Criteria andOrgTypeNameIsNotNull() {
            addCriterion("orgTypeName is not null");
            return (Criteria) this;
        }

        public Criteria andOrgTypeNameEqualTo(String value) {
            addCriterion("orgTypeName =", value, "orgTypeName");
            return (Criteria) this;
        }

        public Criteria andOrgTypeNameNotEqualTo(String value) {
            addCriterion("orgTypeName <>", value, "orgTypeName");
            return (Criteria) this;
        }

        public Criteria andOrgTypeNameGreaterThan(String value) {
            addCriterion("orgTypeName >", value, "orgTypeName");
            return (Criteria) this;
        }

        public Criteria andOrgTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("orgTypeName >=", value, "orgTypeName");
            return (Criteria) this;
        }

        public Criteria andOrgTypeNameLessThan(String value) {
            addCriterion("orgTypeName <", value, "orgTypeName");
            return (Criteria) this;
        }

        public Criteria andOrgTypeNameLessThanOrEqualTo(String value) {
            addCriterion("orgTypeName <=", value, "orgTypeName");
            return (Criteria) this;
        }

        public Criteria andOrgTypeNameLike(String value) {
            addCriterion("orgTypeName like", value, "orgTypeName");
            return (Criteria) this;
        }

        public Criteria andOrgTypeNameNotLike(String value) {
            addCriterion("orgTypeName not like", value, "orgTypeName");
            return (Criteria) this;
        }

        public Criteria andOrgTypeNameIn(List<String> values) {
            addCriterion("orgTypeName in", values, "orgTypeName");
            return (Criteria) this;
        }

        public Criteria andOrgTypeNameNotIn(List<String> values) {
            addCriterion("orgTypeName not in", values, "orgTypeName");
            return (Criteria) this;
        }

        public Criteria andOrgTypeNameBetween(String value1, String value2) {
            addCriterion("orgTypeName between", value1, value2, "orgTypeName");
            return (Criteria) this;
        }

        public Criteria andOrgTypeNameNotBetween(String value1, String value2) {
            addCriterion("orgTypeName not between", value1, value2, "orgTypeName");
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