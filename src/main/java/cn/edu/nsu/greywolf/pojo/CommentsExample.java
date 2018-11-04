package cn.edu.nsu.greywolf.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CommentsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommentsExample() {
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

        public Criteria andCommentIdIsNull() {
            addCriterion("commentId is null");
            return (Criteria) this;
        }

        public Criteria andCommentIdIsNotNull() {
            addCriterion("commentId is not null");
            return (Criteria) this;
        }

        public Criteria andCommentIdEqualTo(Integer value) {
            addCriterion("commentId =", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotEqualTo(Integer value) {
            addCriterion("commentId <>", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdGreaterThan(Integer value) {
            addCriterion("commentId >", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("commentId >=", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdLessThan(Integer value) {
            addCriterion("commentId <", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdLessThanOrEqualTo(Integer value) {
            addCriterion("commentId <=", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdIn(List<Integer> values) {
            addCriterion("commentId in", values, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotIn(List<Integer> values) {
            addCriterion("commentId not in", values, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdBetween(Integer value1, Integer value2) {
            addCriterion("commentId between", value1, value2, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("commentId not between", value1, value2, "commentId");
            return (Criteria) this;
        }

        public Criteria andActivityIdIsNull() {
            addCriterion("activityId is null");
            return (Criteria) this;
        }

        public Criteria andActivityIdIsNotNull() {
            addCriterion("activityId is not null");
            return (Criteria) this;
        }

        public Criteria andActivityIdEqualTo(Integer value) {
            addCriterion("activityId =", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotEqualTo(Integer value) {
            addCriterion("activityId <>", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdGreaterThan(Integer value) {
            addCriterion("activityId >", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("activityId >=", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdLessThan(Integer value) {
            addCriterion("activityId <", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdLessThanOrEqualTo(Integer value) {
            addCriterion("activityId <=", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdIn(List<Integer> values) {
            addCriterion("activityId in", values, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotIn(List<Integer> values) {
            addCriterion("activityId not in", values, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdBetween(Integer value1, Integer value2) {
            addCriterion("activityId between", value1, value2, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("activityId not between", value1, value2, "activityId");
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

        public Criteria andCommentTimeIsNull() {
            addCriterion("commentTime is null");
            return (Criteria) this;
        }

        public Criteria andCommentTimeIsNotNull() {
            addCriterion("commentTime is not null");
            return (Criteria) this;
        }

        public Criteria andCommentTimeEqualTo(Date value) {
            addCriterion("commentTime =", value, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeNotEqualTo(Date value) {
            addCriterion("commentTime <>", value, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeGreaterThan(Date value) {
            addCriterion("commentTime >", value, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("commentTime >=", value, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeLessThan(Date value) {
            addCriterion("commentTime <", value, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeLessThanOrEqualTo(Date value) {
            addCriterion("commentTime <=", value, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeIn(List<Date> values) {
            addCriterion("commentTime in", values, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeNotIn(List<Date> values) {
            addCriterion("commentTime not in", values, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeBetween(Date value1, Date value2) {
            addCriterion("commentTime between", value1, value2, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeNotBetween(Date value1, Date value2) {
            addCriterion("commentTime not between", value1, value2, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentContentIsNull() {
            addCriterion("commentContent is null");
            return (Criteria) this;
        }

        public Criteria andCommentContentIsNotNull() {
            addCriterion("commentContent is not null");
            return (Criteria) this;
        }

        public Criteria andCommentContentEqualTo(String value) {
            addCriterion("commentContent =", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentNotEqualTo(String value) {
            addCriterion("commentContent <>", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentGreaterThan(String value) {
            addCriterion("commentContent >", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentGreaterThanOrEqualTo(String value) {
            addCriterion("commentContent >=", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentLessThan(String value) {
            addCriterion("commentContent <", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentLessThanOrEqualTo(String value) {
            addCriterion("commentContent <=", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentLike(String value) {
            addCriterion("commentContent like", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentNotLike(String value) {
            addCriterion("commentContent not like", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentIn(List<String> values) {
            addCriterion("commentContent in", values, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentNotIn(List<String> values) {
            addCriterion("commentContent not in", values, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentBetween(String value1, String value2) {
            addCriterion("commentContent between", value1, value2, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentNotBetween(String value1, String value2) {
            addCriterion("commentContent not between", value1, value2, "commentContent");
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