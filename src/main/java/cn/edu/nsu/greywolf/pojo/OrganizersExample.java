package cn.edu.nsu.greywolf.pojo;

import java.util.ArrayList;
import java.util.List;

public class OrganizersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrganizersExample() {
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

        public Criteria andOrgManagerIdIsNull() {
            addCriterion("orgManagerId is null");
            return (Criteria) this;
        }

        public Criteria andOrgManagerIdIsNotNull() {
            addCriterion("orgManagerId is not null");
            return (Criteria) this;
        }

        public Criteria andOrgManagerIdEqualTo(Integer value) {
            addCriterion("orgManagerId =", value, "orgManagerId");
            return (Criteria) this;
        }

        public Criteria andOrgManagerIdNotEqualTo(Integer value) {
            addCriterion("orgManagerId <>", value, "orgManagerId");
            return (Criteria) this;
        }

        public Criteria andOrgManagerIdGreaterThan(Integer value) {
            addCriterion("orgManagerId >", value, "orgManagerId");
            return (Criteria) this;
        }

        public Criteria andOrgManagerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("orgManagerId >=", value, "orgManagerId");
            return (Criteria) this;
        }

        public Criteria andOrgManagerIdLessThan(Integer value) {
            addCriterion("orgManagerId <", value, "orgManagerId");
            return (Criteria) this;
        }

        public Criteria andOrgManagerIdLessThanOrEqualTo(Integer value) {
            addCriterion("orgManagerId <=", value, "orgManagerId");
            return (Criteria) this;
        }

        public Criteria andOrgManagerIdIn(List<Integer> values) {
            addCriterion("orgManagerId in", values, "orgManagerId");
            return (Criteria) this;
        }

        public Criteria andOrgManagerIdNotIn(List<Integer> values) {
            addCriterion("orgManagerId not in", values, "orgManagerId");
            return (Criteria) this;
        }

        public Criteria andOrgManagerIdBetween(Integer value1, Integer value2) {
            addCriterion("orgManagerId between", value1, value2, "orgManagerId");
            return (Criteria) this;
        }

        public Criteria andOrgManagerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("orgManagerId not between", value1, value2, "orgManagerId");
            return (Criteria) this;
        }

        public Criteria andOrgIdIsNull() {
            addCriterion("orgId is null");
            return (Criteria) this;
        }

        public Criteria andOrgIdIsNotNull() {
            addCriterion("orgId is not null");
            return (Criteria) this;
        }

        public Criteria andOrgIdEqualTo(Integer value) {
            addCriterion("orgId =", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotEqualTo(Integer value) {
            addCriterion("orgId <>", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdGreaterThan(Integer value) {
            addCriterion("orgId >", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("orgId >=", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLessThan(Integer value) {
            addCriterion("orgId <", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLessThanOrEqualTo(Integer value) {
            addCriterion("orgId <=", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdIn(List<Integer> values) {
            addCriterion("orgId in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotIn(List<Integer> values) {
            addCriterion("orgId not in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdBetween(Integer value1, Integer value2) {
            addCriterion("orgId between", value1, value2, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotBetween(Integer value1, Integer value2) {
            addCriterion("orgId not between", value1, value2, "orgId");
            return (Criteria) this;
        }

        public Criteria andUserIDIsNull() {
            addCriterion("userID is null");
            return (Criteria) this;
        }

        public Criteria andUserIDIsNotNull() {
            addCriterion("userID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIDEqualTo(Integer value) {
            addCriterion("userID =", value, "userID");
            return (Criteria) this;
        }

        public Criteria andUserIDNotEqualTo(Integer value) {
            addCriterion("userID <>", value, "userID");
            return (Criteria) this;
        }

        public Criteria andUserIDGreaterThan(Integer value) {
            addCriterion("userID >", value, "userID");
            return (Criteria) this;
        }

        public Criteria andUserIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("userID >=", value, "userID");
            return (Criteria) this;
        }

        public Criteria andUserIDLessThan(Integer value) {
            addCriterion("userID <", value, "userID");
            return (Criteria) this;
        }

        public Criteria andUserIDLessThanOrEqualTo(Integer value) {
            addCriterion("userID <=", value, "userID");
            return (Criteria) this;
        }

        public Criteria andUserIDIn(List<Integer> values) {
            addCriterion("userID in", values, "userID");
            return (Criteria) this;
        }

        public Criteria andUserIDNotIn(List<Integer> values) {
            addCriterion("userID not in", values, "userID");
            return (Criteria) this;
        }

        public Criteria andUserIDBetween(Integer value1, Integer value2) {
            addCriterion("userID between", value1, value2, "userID");
            return (Criteria) this;
        }

        public Criteria andUserIDNotBetween(Integer value1, Integer value2) {
            addCriterion("userID not between", value1, value2, "userID");
            return (Criteria) this;
        }

        public Criteria andOrganizationIsNull() {
            addCriterion("organization is null");
            return (Criteria) this;
        }

        public Criteria andOrganizationIsNotNull() {
            addCriterion("organization is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizationEqualTo(String value) {
            addCriterion("organization =", value, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationNotEqualTo(String value) {
            addCriterion("organization <>", value, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationGreaterThan(String value) {
            addCriterion("organization >", value, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationGreaterThanOrEqualTo(String value) {
            addCriterion("organization >=", value, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationLessThan(String value) {
            addCriterion("organization <", value, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationLessThanOrEqualTo(String value) {
            addCriterion("organization <=", value, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationLike(String value) {
            addCriterion("organization like", value, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationNotLike(String value) {
            addCriterion("organization not like", value, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationIn(List<String> values) {
            addCriterion("organization in", values, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationNotIn(List<String> values) {
            addCriterion("organization not in", values, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationBetween(String value1, String value2) {
            addCriterion("organization between", value1, value2, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationNotBetween(String value1, String value2) {
            addCriterion("organization not between", value1, value2, "organization");
            return (Criteria) this;
        }

        public Criteria andOrgPositionIsNull() {
            addCriterion("orgPosition is null");
            return (Criteria) this;
        }

        public Criteria andOrgPositionIsNotNull() {
            addCriterion("orgPosition is not null");
            return (Criteria) this;
        }

        public Criteria andOrgPositionEqualTo(String value) {
            addCriterion("orgPosition =", value, "orgPosition");
            return (Criteria) this;
        }

        public Criteria andOrgPositionNotEqualTo(String value) {
            addCriterion("orgPosition <>", value, "orgPosition");
            return (Criteria) this;
        }

        public Criteria andOrgPositionGreaterThan(String value) {
            addCriterion("orgPosition >", value, "orgPosition");
            return (Criteria) this;
        }

        public Criteria andOrgPositionGreaterThanOrEqualTo(String value) {
            addCriterion("orgPosition >=", value, "orgPosition");
            return (Criteria) this;
        }

        public Criteria andOrgPositionLessThan(String value) {
            addCriterion("orgPosition <", value, "orgPosition");
            return (Criteria) this;
        }

        public Criteria andOrgPositionLessThanOrEqualTo(String value) {
            addCriterion("orgPosition <=", value, "orgPosition");
            return (Criteria) this;
        }

        public Criteria andOrgPositionLike(String value) {
            addCriterion("orgPosition like", value, "orgPosition");
            return (Criteria) this;
        }

        public Criteria andOrgPositionNotLike(String value) {
            addCriterion("orgPosition not like", value, "orgPosition");
            return (Criteria) this;
        }

        public Criteria andOrgPositionIn(List<String> values) {
            addCriterion("orgPosition in", values, "orgPosition");
            return (Criteria) this;
        }

        public Criteria andOrgPositionNotIn(List<String> values) {
            addCriterion("orgPosition not in", values, "orgPosition");
            return (Criteria) this;
        }

        public Criteria andOrgPositionBetween(String value1, String value2) {
            addCriterion("orgPosition between", value1, value2, "orgPosition");
            return (Criteria) this;
        }

        public Criteria andOrgPositionNotBetween(String value1, String value2) {
            addCriterion("orgPosition not between", value1, value2, "orgPosition");
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