package cn.edu.nsu.greywolf.pojo;

import java.util.ArrayList;
import java.util.List;

public class ManagersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ManagersExample() {
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

        public Criteria andManagerIdIsNull() {
            addCriterion("managerId is null");
            return (Criteria) this;
        }

        public Criteria andManagerIdIsNotNull() {
            addCriterion("managerId is not null");
            return (Criteria) this;
        }

        public Criteria andManagerIdEqualTo(Integer value) {
            addCriterion("managerId =", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdNotEqualTo(Integer value) {
            addCriterion("managerId <>", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdGreaterThan(Integer value) {
            addCriterion("managerId >", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("managerId >=", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdLessThan(Integer value) {
            addCriterion("managerId <", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdLessThanOrEqualTo(Integer value) {
            addCriterion("managerId <=", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdIn(List<Integer> values) {
            addCriterion("managerId in", values, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdNotIn(List<Integer> values) {
            addCriterion("managerId not in", values, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdBetween(Integer value1, Integer value2) {
            addCriterion("managerId between", value1, value2, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("managerId not between", value1, value2, "managerId");
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

        public Criteria andManagerPositionIsNull() {
            addCriterion("managerPosition is null");
            return (Criteria) this;
        }

        public Criteria andManagerPositionIsNotNull() {
            addCriterion("managerPosition is not null");
            return (Criteria) this;
        }

        public Criteria andManagerPositionEqualTo(String value) {
            addCriterion("managerPosition =", value, "managerPosition");
            return (Criteria) this;
        }

        public Criteria andManagerPositionNotEqualTo(String value) {
            addCriterion("managerPosition <>", value, "managerPosition");
            return (Criteria) this;
        }

        public Criteria andManagerPositionGreaterThan(String value) {
            addCriterion("managerPosition >", value, "managerPosition");
            return (Criteria) this;
        }

        public Criteria andManagerPositionGreaterThanOrEqualTo(String value) {
            addCriterion("managerPosition >=", value, "managerPosition");
            return (Criteria) this;
        }

        public Criteria andManagerPositionLessThan(String value) {
            addCriterion("managerPosition <", value, "managerPosition");
            return (Criteria) this;
        }

        public Criteria andManagerPositionLessThanOrEqualTo(String value) {
            addCriterion("managerPosition <=", value, "managerPosition");
            return (Criteria) this;
        }

        public Criteria andManagerPositionLike(String value) {
            addCriterion("managerPosition like", value, "managerPosition");
            return (Criteria) this;
        }

        public Criteria andManagerPositionNotLike(String value) {
            addCriterion("managerPosition not like", value, "managerPosition");
            return (Criteria) this;
        }

        public Criteria andManagerPositionIn(List<String> values) {
            addCriterion("managerPosition in", values, "managerPosition");
            return (Criteria) this;
        }

        public Criteria andManagerPositionNotIn(List<String> values) {
            addCriterion("managerPosition not in", values, "managerPosition");
            return (Criteria) this;
        }

        public Criteria andManagerPositionBetween(String value1, String value2) {
            addCriterion("managerPosition between", value1, value2, "managerPosition");
            return (Criteria) this;
        }

        public Criteria andManagerPositionNotBetween(String value1, String value2) {
            addCriterion("managerPosition not between", value1, value2, "managerPosition");
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