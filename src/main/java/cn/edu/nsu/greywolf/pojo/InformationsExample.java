package cn.edu.nsu.greywolf.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InformationsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InformationsExample() {
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

        public Criteria andInformationIdIsNull() {
            addCriterion("informationId is null");
            return (Criteria) this;
        }

        public Criteria andInformationIdIsNotNull() {
            addCriterion("informationId is not null");
            return (Criteria) this;
        }

        public Criteria andInformationIdEqualTo(Integer value) {
            addCriterion("informationId =", value, "informationId");
            return (Criteria) this;
        }

        public Criteria andInformationIdNotEqualTo(Integer value) {
            addCriterion("informationId <>", value, "informationId");
            return (Criteria) this;
        }

        public Criteria andInformationIdGreaterThan(Integer value) {
            addCriterion("informationId >", value, "informationId");
            return (Criteria) this;
        }

        public Criteria andInformationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("informationId >=", value, "informationId");
            return (Criteria) this;
        }

        public Criteria andInformationIdLessThan(Integer value) {
            addCriterion("informationId <", value, "informationId");
            return (Criteria) this;
        }

        public Criteria andInformationIdLessThanOrEqualTo(Integer value) {
            addCriterion("informationId <=", value, "informationId");
            return (Criteria) this;
        }

        public Criteria andInformationIdIn(List<Integer> values) {
            addCriterion("informationId in", values, "informationId");
            return (Criteria) this;
        }

        public Criteria andInformationIdNotIn(List<Integer> values) {
            addCriterion("informationId not in", values, "informationId");
            return (Criteria) this;
        }

        public Criteria andInformationIdBetween(Integer value1, Integer value2) {
            addCriterion("informationId between", value1, value2, "informationId");
            return (Criteria) this;
        }

        public Criteria andInformationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("informationId not between", value1, value2, "informationId");
            return (Criteria) this;
        }

        public Criteria andInformationTitleIsNull() {
            addCriterion("informationTitle is null");
            return (Criteria) this;
        }

        public Criteria andInformationTitleIsNotNull() {
            addCriterion("informationTitle is not null");
            return (Criteria) this;
        }

        public Criteria andInformationTitleEqualTo(String value) {
            addCriterion("informationTitle =", value, "informationTitle");
            return (Criteria) this;
        }

        public Criteria andInformationTitleNotEqualTo(String value) {
            addCriterion("informationTitle <>", value, "informationTitle");
            return (Criteria) this;
        }

        public Criteria andInformationTitleGreaterThan(String value) {
            addCriterion("informationTitle >", value, "informationTitle");
            return (Criteria) this;
        }

        public Criteria andInformationTitleGreaterThanOrEqualTo(String value) {
            addCriterion("informationTitle >=", value, "informationTitle");
            return (Criteria) this;
        }

        public Criteria andInformationTitleLessThan(String value) {
            addCriterion("informationTitle <", value, "informationTitle");
            return (Criteria) this;
        }

        public Criteria andInformationTitleLessThanOrEqualTo(String value) {
            addCriterion("informationTitle <=", value, "informationTitle");
            return (Criteria) this;
        }

        public Criteria andInformationTitleLike(String value) {
            addCriterion("informationTitle like", value, "informationTitle");
            return (Criteria) this;
        }

        public Criteria andInformationTitleNotLike(String value) {
            addCriterion("informationTitle not like", value, "informationTitle");
            return (Criteria) this;
        }

        public Criteria andInformationTitleIn(List<String> values) {
            addCriterion("informationTitle in", values, "informationTitle");
            return (Criteria) this;
        }

        public Criteria andInformationTitleNotIn(List<String> values) {
            addCriterion("informationTitle not in", values, "informationTitle");
            return (Criteria) this;
        }

        public Criteria andInformationTitleBetween(String value1, String value2) {
            addCriterion("informationTitle between", value1, value2, "informationTitle");
            return (Criteria) this;
        }

        public Criteria andInformationTitleNotBetween(String value1, String value2) {
            addCriterion("informationTitle not between", value1, value2, "informationTitle");
            return (Criteria) this;
        }

        public Criteria andInformationTimeIsNull() {
            addCriterion("informationTime is null");
            return (Criteria) this;
        }

        public Criteria andInformationTimeIsNotNull() {
            addCriterion("informationTime is not null");
            return (Criteria) this;
        }

        public Criteria andInformationTimeEqualTo(Date value) {
            addCriterion("informationTime =", value, "informationTime");
            return (Criteria) this;
        }

        public Criteria andInformationTimeNotEqualTo(Date value) {
            addCriterion("informationTime <>", value, "informationTime");
            return (Criteria) this;
        }

        public Criteria andInformationTimeGreaterThan(Date value) {
            addCriterion("informationTime >", value, "informationTime");
            return (Criteria) this;
        }

        public Criteria andInformationTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("informationTime >=", value, "informationTime");
            return (Criteria) this;
        }

        public Criteria andInformationTimeLessThan(Date value) {
            addCriterion("informationTime <", value, "informationTime");
            return (Criteria) this;
        }

        public Criteria andInformationTimeLessThanOrEqualTo(Date value) {
            addCriterion("informationTime <=", value, "informationTime");
            return (Criteria) this;
        }

        public Criteria andInformationTimeIn(List<Date> values) {
            addCriterion("informationTime in", values, "informationTime");
            return (Criteria) this;
        }

        public Criteria andInformationTimeNotIn(List<Date> values) {
            addCriterion("informationTime not in", values, "informationTime");
            return (Criteria) this;
        }

        public Criteria andInformationTimeBetween(Date value1, Date value2) {
            addCriterion("informationTime between", value1, value2, "informationTime");
            return (Criteria) this;
        }

        public Criteria andInformationTimeNotBetween(Date value1, Date value2) {
            addCriterion("informationTime not between", value1, value2, "informationTime");
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