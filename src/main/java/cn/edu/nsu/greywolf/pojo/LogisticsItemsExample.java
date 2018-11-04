package cn.edu.nsu.greywolf.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class LogisticsItemsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LogisticsItemsExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        protected void addCriterionForJDBCTime(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value.getTime()), property);
        }

        protected void addCriterionForJDBCTime(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Time> timeList = new ArrayList<java.sql.Time>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                timeList.add(new java.sql.Time(iter.next().getTime()));
            }
            addCriterion(condition, timeList, property);
        }

        protected void addCriterionForJDBCTime(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value1.getTime()), new java.sql.Time(value2.getTime()), property);
        }

        public Criteria andLogisticsItemIdIsNull() {
            addCriterion("logisticsItemId is null");
            return (Criteria) this;
        }

        public Criteria andLogisticsItemIdIsNotNull() {
            addCriterion("logisticsItemId is not null");
            return (Criteria) this;
        }

        public Criteria andLogisticsItemIdEqualTo(Integer value) {
            addCriterion("logisticsItemId =", value, "logisticsItemId");
            return (Criteria) this;
        }

        public Criteria andLogisticsItemIdNotEqualTo(Integer value) {
            addCriterion("logisticsItemId <>", value, "logisticsItemId");
            return (Criteria) this;
        }

        public Criteria andLogisticsItemIdGreaterThan(Integer value) {
            addCriterion("logisticsItemId >", value, "logisticsItemId");
            return (Criteria) this;
        }

        public Criteria andLogisticsItemIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("logisticsItemId >=", value, "logisticsItemId");
            return (Criteria) this;
        }

        public Criteria andLogisticsItemIdLessThan(Integer value) {
            addCriterion("logisticsItemId <", value, "logisticsItemId");
            return (Criteria) this;
        }

        public Criteria andLogisticsItemIdLessThanOrEqualTo(Integer value) {
            addCriterion("logisticsItemId <=", value, "logisticsItemId");
            return (Criteria) this;
        }

        public Criteria andLogisticsItemIdIn(List<Integer> values) {
            addCriterion("logisticsItemId in", values, "logisticsItemId");
            return (Criteria) this;
        }

        public Criteria andLogisticsItemIdNotIn(List<Integer> values) {
            addCriterion("logisticsItemId not in", values, "logisticsItemId");
            return (Criteria) this;
        }

        public Criteria andLogisticsItemIdBetween(Integer value1, Integer value2) {
            addCriterion("logisticsItemId between", value1, value2, "logisticsItemId");
            return (Criteria) this;
        }

        public Criteria andLogisticsItemIdNotBetween(Integer value1, Integer value2) {
            addCriterion("logisticsItemId not between", value1, value2, "logisticsItemId");
            return (Criteria) this;
        }

        public Criteria andLogisticsIdIsNull() {
            addCriterion("logisticsId is null");
            return (Criteria) this;
        }

        public Criteria andLogisticsIdIsNotNull() {
            addCriterion("logisticsId is not null");
            return (Criteria) this;
        }

        public Criteria andLogisticsIdEqualTo(Integer value) {
            addCriterion("logisticsId =", value, "logisticsId");
            return (Criteria) this;
        }

        public Criteria andLogisticsIdNotEqualTo(Integer value) {
            addCriterion("logisticsId <>", value, "logisticsId");
            return (Criteria) this;
        }

        public Criteria andLogisticsIdGreaterThan(Integer value) {
            addCriterion("logisticsId >", value, "logisticsId");
            return (Criteria) this;
        }

        public Criteria andLogisticsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("logisticsId >=", value, "logisticsId");
            return (Criteria) this;
        }

        public Criteria andLogisticsIdLessThan(Integer value) {
            addCriterion("logisticsId <", value, "logisticsId");
            return (Criteria) this;
        }

        public Criteria andLogisticsIdLessThanOrEqualTo(Integer value) {
            addCriterion("logisticsId <=", value, "logisticsId");
            return (Criteria) this;
        }

        public Criteria andLogisticsIdIn(List<Integer> values) {
            addCriterion("logisticsId in", values, "logisticsId");
            return (Criteria) this;
        }

        public Criteria andLogisticsIdNotIn(List<Integer> values) {
            addCriterion("logisticsId not in", values, "logisticsId");
            return (Criteria) this;
        }

        public Criteria andLogisticsIdBetween(Integer value1, Integer value2) {
            addCriterion("logisticsId between", value1, value2, "logisticsId");
            return (Criteria) this;
        }

        public Criteria andLogisticsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("logisticsId not between", value1, value2, "logisticsId");
            return (Criteria) this;
        }

        public Criteria andLogisticsItemDateIsNull() {
            addCriterion("logisticsItemDate is null");
            return (Criteria) this;
        }

        public Criteria andLogisticsItemDateIsNotNull() {
            addCriterion("logisticsItemDate is not null");
            return (Criteria) this;
        }

        public Criteria andLogisticsItemDateEqualTo(Date value) {
            addCriterionForJDBCDate("logisticsItemDate =", value, "logisticsItemDate");
            return (Criteria) this;
        }

        public Criteria andLogisticsItemDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("logisticsItemDate <>", value, "logisticsItemDate");
            return (Criteria) this;
        }

        public Criteria andLogisticsItemDateGreaterThan(Date value) {
            addCriterionForJDBCDate("logisticsItemDate >", value, "logisticsItemDate");
            return (Criteria) this;
        }

        public Criteria andLogisticsItemDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("logisticsItemDate >=", value, "logisticsItemDate");
            return (Criteria) this;
        }

        public Criteria andLogisticsItemDateLessThan(Date value) {
            addCriterionForJDBCDate("logisticsItemDate <", value, "logisticsItemDate");
            return (Criteria) this;
        }

        public Criteria andLogisticsItemDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("logisticsItemDate <=", value, "logisticsItemDate");
            return (Criteria) this;
        }

        public Criteria andLogisticsItemDateIn(List<Date> values) {
            addCriterionForJDBCDate("logisticsItemDate in", values, "logisticsItemDate");
            return (Criteria) this;
        }

        public Criteria andLogisticsItemDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("logisticsItemDate not in", values, "logisticsItemDate");
            return (Criteria) this;
        }

        public Criteria andLogisticsItemDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("logisticsItemDate between", value1, value2, "logisticsItemDate");
            return (Criteria) this;
        }

        public Criteria andLogisticsItemDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("logisticsItemDate not between", value1, value2, "logisticsItemDate");
            return (Criteria) this;
        }

        public Criteria andLogisticsItemWeekIsNull() {
            addCriterion("logisticsItemWeek is null");
            return (Criteria) this;
        }

        public Criteria andLogisticsItemWeekIsNotNull() {
            addCriterion("logisticsItemWeek is not null");
            return (Criteria) this;
        }

        public Criteria andLogisticsItemWeekEqualTo(String value) {
            addCriterion("logisticsItemWeek =", value, "logisticsItemWeek");
            return (Criteria) this;
        }

        public Criteria andLogisticsItemWeekNotEqualTo(String value) {
            addCriterion("logisticsItemWeek <>", value, "logisticsItemWeek");
            return (Criteria) this;
        }

        public Criteria andLogisticsItemWeekGreaterThan(String value) {
            addCriterion("logisticsItemWeek >", value, "logisticsItemWeek");
            return (Criteria) this;
        }

        public Criteria andLogisticsItemWeekGreaterThanOrEqualTo(String value) {
            addCriterion("logisticsItemWeek >=", value, "logisticsItemWeek");
            return (Criteria) this;
        }

        public Criteria andLogisticsItemWeekLessThan(String value) {
            addCriterion("logisticsItemWeek <", value, "logisticsItemWeek");
            return (Criteria) this;
        }

        public Criteria andLogisticsItemWeekLessThanOrEqualTo(String value) {
            addCriterion("logisticsItemWeek <=", value, "logisticsItemWeek");
            return (Criteria) this;
        }

        public Criteria andLogisticsItemWeekLike(String value) {
            addCriterion("logisticsItemWeek like", value, "logisticsItemWeek");
            return (Criteria) this;
        }

        public Criteria andLogisticsItemWeekNotLike(String value) {
            addCriterion("logisticsItemWeek not like", value, "logisticsItemWeek");
            return (Criteria) this;
        }

        public Criteria andLogisticsItemWeekIn(List<String> values) {
            addCriterion("logisticsItemWeek in", values, "logisticsItemWeek");
            return (Criteria) this;
        }

        public Criteria andLogisticsItemWeekNotIn(List<String> values) {
            addCriterion("logisticsItemWeek not in", values, "logisticsItemWeek");
            return (Criteria) this;
        }

        public Criteria andLogisticsItemWeekBetween(String value1, String value2) {
            addCriterion("logisticsItemWeek between", value1, value2, "logisticsItemWeek");
            return (Criteria) this;
        }

        public Criteria andLogisticsItemWeekNotBetween(String value1, String value2) {
            addCriterion("logisticsItemWeek not between", value1, value2, "logisticsItemWeek");
            return (Criteria) this;
        }

        public Criteria andLogisticsItemTimeIsNull() {
            addCriterion("logisticsItemTime is null");
            return (Criteria) this;
        }

        public Criteria andLogisticsItemTimeIsNotNull() {
            addCriterion("logisticsItemTime is not null");
            return (Criteria) this;
        }

        public Criteria andLogisticsItemTimeEqualTo(Date value) {
            addCriterionForJDBCTime("logisticsItemTime =", value, "logisticsItemTime");
            return (Criteria) this;
        }

        public Criteria andLogisticsItemTimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("logisticsItemTime <>", value, "logisticsItemTime");
            return (Criteria) this;
        }

        public Criteria andLogisticsItemTimeGreaterThan(Date value) {
            addCriterionForJDBCTime("logisticsItemTime >", value, "logisticsItemTime");
            return (Criteria) this;
        }

        public Criteria andLogisticsItemTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("logisticsItemTime >=", value, "logisticsItemTime");
            return (Criteria) this;
        }

        public Criteria andLogisticsItemTimeLessThan(Date value) {
            addCriterionForJDBCTime("logisticsItemTime <", value, "logisticsItemTime");
            return (Criteria) this;
        }

        public Criteria andLogisticsItemTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("logisticsItemTime <=", value, "logisticsItemTime");
            return (Criteria) this;
        }

        public Criteria andLogisticsItemTimeIn(List<Date> values) {
            addCriterionForJDBCTime("logisticsItemTime in", values, "logisticsItemTime");
            return (Criteria) this;
        }

        public Criteria andLogisticsItemTimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("logisticsItemTime not in", values, "logisticsItemTime");
            return (Criteria) this;
        }

        public Criteria andLogisticsItemTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("logisticsItemTime between", value1, value2, "logisticsItemTime");
            return (Criteria) this;
        }

        public Criteria andLogisticsItemTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("logisticsItemTime not between", value1, value2, "logisticsItemTime");
            return (Criteria) this;
        }

        public Criteria andAcceptStationIsNull() {
            addCriterion("acceptStation is null");
            return (Criteria) this;
        }

        public Criteria andAcceptStationIsNotNull() {
            addCriterion("acceptStation is not null");
            return (Criteria) this;
        }

        public Criteria andAcceptStationEqualTo(String value) {
            addCriterion("acceptStation =", value, "acceptStation");
            return (Criteria) this;
        }

        public Criteria andAcceptStationNotEqualTo(String value) {
            addCriterion("acceptStation <>", value, "acceptStation");
            return (Criteria) this;
        }

        public Criteria andAcceptStationGreaterThan(String value) {
            addCriterion("acceptStation >", value, "acceptStation");
            return (Criteria) this;
        }

        public Criteria andAcceptStationGreaterThanOrEqualTo(String value) {
            addCriterion("acceptStation >=", value, "acceptStation");
            return (Criteria) this;
        }

        public Criteria andAcceptStationLessThan(String value) {
            addCriterion("acceptStation <", value, "acceptStation");
            return (Criteria) this;
        }

        public Criteria andAcceptStationLessThanOrEqualTo(String value) {
            addCriterion("acceptStation <=", value, "acceptStation");
            return (Criteria) this;
        }

        public Criteria andAcceptStationLike(String value) {
            addCriterion("acceptStation like", value, "acceptStation");
            return (Criteria) this;
        }

        public Criteria andAcceptStationNotLike(String value) {
            addCriterion("acceptStation not like", value, "acceptStation");
            return (Criteria) this;
        }

        public Criteria andAcceptStationIn(List<String> values) {
            addCriterion("acceptStation in", values, "acceptStation");
            return (Criteria) this;
        }

        public Criteria andAcceptStationNotIn(List<String> values) {
            addCriterion("acceptStation not in", values, "acceptStation");
            return (Criteria) this;
        }

        public Criteria andAcceptStationBetween(String value1, String value2) {
            addCriterion("acceptStation between", value1, value2, "acceptStation");
            return (Criteria) this;
        }

        public Criteria andAcceptStationNotBetween(String value1, String value2) {
            addCriterion("acceptStation not between", value1, value2, "acceptStation");
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