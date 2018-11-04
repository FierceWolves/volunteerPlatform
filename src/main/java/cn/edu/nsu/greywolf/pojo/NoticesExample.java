package cn.edu.nsu.greywolf.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NoticesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NoticesExample() {
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

        public Criteria andNoticeIdIsNull() {
            addCriterion("noticeId is null");
            return (Criteria) this;
        }

        public Criteria andNoticeIdIsNotNull() {
            addCriterion("noticeId is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeIdEqualTo(Integer value) {
            addCriterion("noticeId =", value, "noticeId");
            return (Criteria) this;
        }

        public Criteria andNoticeIdNotEqualTo(Integer value) {
            addCriterion("noticeId <>", value, "noticeId");
            return (Criteria) this;
        }

        public Criteria andNoticeIdGreaterThan(Integer value) {
            addCriterion("noticeId >", value, "noticeId");
            return (Criteria) this;
        }

        public Criteria andNoticeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("noticeId >=", value, "noticeId");
            return (Criteria) this;
        }

        public Criteria andNoticeIdLessThan(Integer value) {
            addCriterion("noticeId <", value, "noticeId");
            return (Criteria) this;
        }

        public Criteria andNoticeIdLessThanOrEqualTo(Integer value) {
            addCriterion("noticeId <=", value, "noticeId");
            return (Criteria) this;
        }

        public Criteria andNoticeIdIn(List<Integer> values) {
            addCriterion("noticeId in", values, "noticeId");
            return (Criteria) this;
        }

        public Criteria andNoticeIdNotIn(List<Integer> values) {
            addCriterion("noticeId not in", values, "noticeId");
            return (Criteria) this;
        }

        public Criteria andNoticeIdBetween(Integer value1, Integer value2) {
            addCriterion("noticeId between", value1, value2, "noticeId");
            return (Criteria) this;
        }

        public Criteria andNoticeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("noticeId not between", value1, value2, "noticeId");
            return (Criteria) this;
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

        public Criteria andNoticeTitleIsNull() {
            addCriterion("noticeTitle is null");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleIsNotNull() {
            addCriterion("noticeTitle is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleEqualTo(String value) {
            addCriterion("noticeTitle =", value, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleNotEqualTo(String value) {
            addCriterion("noticeTitle <>", value, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleGreaterThan(String value) {
            addCriterion("noticeTitle >", value, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleGreaterThanOrEqualTo(String value) {
            addCriterion("noticeTitle >=", value, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleLessThan(String value) {
            addCriterion("noticeTitle <", value, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleLessThanOrEqualTo(String value) {
            addCriterion("noticeTitle <=", value, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleLike(String value) {
            addCriterion("noticeTitle like", value, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleNotLike(String value) {
            addCriterion("noticeTitle not like", value, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleIn(List<String> values) {
            addCriterion("noticeTitle in", values, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleNotIn(List<String> values) {
            addCriterion("noticeTitle not in", values, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleBetween(String value1, String value2) {
            addCriterion("noticeTitle between", value1, value2, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleNotBetween(String value1, String value2) {
            addCriterion("noticeTitle not between", value1, value2, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNotifierIsNull() {
            addCriterion("notifier is null");
            return (Criteria) this;
        }

        public Criteria andNotifierIsNotNull() {
            addCriterion("notifier is not null");
            return (Criteria) this;
        }

        public Criteria andNotifierEqualTo(String value) {
            addCriterion("notifier =", value, "notifier");
            return (Criteria) this;
        }

        public Criteria andNotifierNotEqualTo(String value) {
            addCriterion("notifier <>", value, "notifier");
            return (Criteria) this;
        }

        public Criteria andNotifierGreaterThan(String value) {
            addCriterion("notifier >", value, "notifier");
            return (Criteria) this;
        }

        public Criteria andNotifierGreaterThanOrEqualTo(String value) {
            addCriterion("notifier >=", value, "notifier");
            return (Criteria) this;
        }

        public Criteria andNotifierLessThan(String value) {
            addCriterion("notifier <", value, "notifier");
            return (Criteria) this;
        }

        public Criteria andNotifierLessThanOrEqualTo(String value) {
            addCriterion("notifier <=", value, "notifier");
            return (Criteria) this;
        }

        public Criteria andNotifierLike(String value) {
            addCriterion("notifier like", value, "notifier");
            return (Criteria) this;
        }

        public Criteria andNotifierNotLike(String value) {
            addCriterion("notifier not like", value, "notifier");
            return (Criteria) this;
        }

        public Criteria andNotifierIn(List<String> values) {
            addCriterion("notifier in", values, "notifier");
            return (Criteria) this;
        }

        public Criteria andNotifierNotIn(List<String> values) {
            addCriterion("notifier not in", values, "notifier");
            return (Criteria) this;
        }

        public Criteria andNotifierBetween(String value1, String value2) {
            addCriterion("notifier between", value1, value2, "notifier");
            return (Criteria) this;
        }

        public Criteria andNotifierNotBetween(String value1, String value2) {
            addCriterion("notifier not between", value1, value2, "notifier");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeIsNull() {
            addCriterion("noticeTime is null");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeIsNotNull() {
            addCriterion("noticeTime is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeEqualTo(Date value) {
            addCriterion("noticeTime =", value, "noticeTime");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeNotEqualTo(Date value) {
            addCriterion("noticeTime <>", value, "noticeTime");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeGreaterThan(Date value) {
            addCriterion("noticeTime >", value, "noticeTime");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("noticeTime >=", value, "noticeTime");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeLessThan(Date value) {
            addCriterion("noticeTime <", value, "noticeTime");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeLessThanOrEqualTo(Date value) {
            addCriterion("noticeTime <=", value, "noticeTime");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeIn(List<Date> values) {
            addCriterion("noticeTime in", values, "noticeTime");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeNotIn(List<Date> values) {
            addCriterion("noticeTime not in", values, "noticeTime");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeBetween(Date value1, Date value2) {
            addCriterion("noticeTime between", value1, value2, "noticeTime");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeNotBetween(Date value1, Date value2) {
            addCriterion("noticeTime not between", value1, value2, "noticeTime");
            return (Criteria) this;
        }

        public Criteria andNoticeActivityIsNull() {
            addCriterion("noticeActivity is null");
            return (Criteria) this;
        }

        public Criteria andNoticeActivityIsNotNull() {
            addCriterion("noticeActivity is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeActivityEqualTo(String value) {
            addCriterion("noticeActivity =", value, "noticeActivity");
            return (Criteria) this;
        }

        public Criteria andNoticeActivityNotEqualTo(String value) {
            addCriterion("noticeActivity <>", value, "noticeActivity");
            return (Criteria) this;
        }

        public Criteria andNoticeActivityGreaterThan(String value) {
            addCriterion("noticeActivity >", value, "noticeActivity");
            return (Criteria) this;
        }

        public Criteria andNoticeActivityGreaterThanOrEqualTo(String value) {
            addCriterion("noticeActivity >=", value, "noticeActivity");
            return (Criteria) this;
        }

        public Criteria andNoticeActivityLessThan(String value) {
            addCriterion("noticeActivity <", value, "noticeActivity");
            return (Criteria) this;
        }

        public Criteria andNoticeActivityLessThanOrEqualTo(String value) {
            addCriterion("noticeActivity <=", value, "noticeActivity");
            return (Criteria) this;
        }

        public Criteria andNoticeActivityLike(String value) {
            addCriterion("noticeActivity like", value, "noticeActivity");
            return (Criteria) this;
        }

        public Criteria andNoticeActivityNotLike(String value) {
            addCriterion("noticeActivity not like", value, "noticeActivity");
            return (Criteria) this;
        }

        public Criteria andNoticeActivityIn(List<String> values) {
            addCriterion("noticeActivity in", values, "noticeActivity");
            return (Criteria) this;
        }

        public Criteria andNoticeActivityNotIn(List<String> values) {
            addCriterion("noticeActivity not in", values, "noticeActivity");
            return (Criteria) this;
        }

        public Criteria andNoticeActivityBetween(String value1, String value2) {
            addCriterion("noticeActivity between", value1, value2, "noticeActivity");
            return (Criteria) this;
        }

        public Criteria andNoticeActivityNotBetween(String value1, String value2) {
            addCriterion("noticeActivity not between", value1, value2, "noticeActivity");
            return (Criteria) this;
        }

        public Criteria andNoticeContentIsNull() {
            addCriterion("noticeContent is null");
            return (Criteria) this;
        }

        public Criteria andNoticeContentIsNotNull() {
            addCriterion("noticeContent is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeContentEqualTo(String value) {
            addCriterion("noticeContent =", value, "noticeContent");
            return (Criteria) this;
        }

        public Criteria andNoticeContentNotEqualTo(String value) {
            addCriterion("noticeContent <>", value, "noticeContent");
            return (Criteria) this;
        }

        public Criteria andNoticeContentGreaterThan(String value) {
            addCriterion("noticeContent >", value, "noticeContent");
            return (Criteria) this;
        }

        public Criteria andNoticeContentGreaterThanOrEqualTo(String value) {
            addCriterion("noticeContent >=", value, "noticeContent");
            return (Criteria) this;
        }

        public Criteria andNoticeContentLessThan(String value) {
            addCriterion("noticeContent <", value, "noticeContent");
            return (Criteria) this;
        }

        public Criteria andNoticeContentLessThanOrEqualTo(String value) {
            addCriterion("noticeContent <=", value, "noticeContent");
            return (Criteria) this;
        }

        public Criteria andNoticeContentLike(String value) {
            addCriterion("noticeContent like", value, "noticeContent");
            return (Criteria) this;
        }

        public Criteria andNoticeContentNotLike(String value) {
            addCriterion("noticeContent not like", value, "noticeContent");
            return (Criteria) this;
        }

        public Criteria andNoticeContentIn(List<String> values) {
            addCriterion("noticeContent in", values, "noticeContent");
            return (Criteria) this;
        }

        public Criteria andNoticeContentNotIn(List<String> values) {
            addCriterion("noticeContent not in", values, "noticeContent");
            return (Criteria) this;
        }

        public Criteria andNoticeContentBetween(String value1, String value2) {
            addCriterion("noticeContent between", value1, value2, "noticeContent");
            return (Criteria) this;
        }

        public Criteria andNoticeContentNotBetween(String value1, String value2) {
            addCriterion("noticeContent not between", value1, value2, "noticeContent");
            return (Criteria) this;
        }

        public Criteria andReceiverIsNull() {
            addCriterion("receiver is null");
            return (Criteria) this;
        }

        public Criteria andReceiverIsNotNull() {
            addCriterion("receiver is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverEqualTo(String value) {
            addCriterion("receiver =", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverNotEqualTo(String value) {
            addCriterion("receiver <>", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverGreaterThan(String value) {
            addCriterion("receiver >", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverGreaterThanOrEqualTo(String value) {
            addCriterion("receiver >=", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverLessThan(String value) {
            addCriterion("receiver <", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverLessThanOrEqualTo(String value) {
            addCriterion("receiver <=", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverLike(String value) {
            addCriterion("receiver like", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverNotLike(String value) {
            addCriterion("receiver not like", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverIn(List<String> values) {
            addCriterion("receiver in", values, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverNotIn(List<String> values) {
            addCriterion("receiver not in", values, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverBetween(String value1, String value2) {
            addCriterion("receiver between", value1, value2, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverNotBetween(String value1, String value2) {
            addCriterion("receiver not between", value1, value2, "receiver");
            return (Criteria) this;
        }

        public Criteria andNoticeStatusIsNull() {
            addCriterion("noticeStatus is null");
            return (Criteria) this;
        }

        public Criteria andNoticeStatusIsNotNull() {
            addCriterion("noticeStatus is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeStatusEqualTo(String value) {
            addCriterion("noticeStatus =", value, "noticeStatus");
            return (Criteria) this;
        }

        public Criteria andNoticeStatusNotEqualTo(String value) {
            addCriterion("noticeStatus <>", value, "noticeStatus");
            return (Criteria) this;
        }

        public Criteria andNoticeStatusGreaterThan(String value) {
            addCriterion("noticeStatus >", value, "noticeStatus");
            return (Criteria) this;
        }

        public Criteria andNoticeStatusGreaterThanOrEqualTo(String value) {
            addCriterion("noticeStatus >=", value, "noticeStatus");
            return (Criteria) this;
        }

        public Criteria andNoticeStatusLessThan(String value) {
            addCriterion("noticeStatus <", value, "noticeStatus");
            return (Criteria) this;
        }

        public Criteria andNoticeStatusLessThanOrEqualTo(String value) {
            addCriterion("noticeStatus <=", value, "noticeStatus");
            return (Criteria) this;
        }

        public Criteria andNoticeStatusLike(String value) {
            addCriterion("noticeStatus like", value, "noticeStatus");
            return (Criteria) this;
        }

        public Criteria andNoticeStatusNotLike(String value) {
            addCriterion("noticeStatus not like", value, "noticeStatus");
            return (Criteria) this;
        }

        public Criteria andNoticeStatusIn(List<String> values) {
            addCriterion("noticeStatus in", values, "noticeStatus");
            return (Criteria) this;
        }

        public Criteria andNoticeStatusNotIn(List<String> values) {
            addCriterion("noticeStatus not in", values, "noticeStatus");
            return (Criteria) this;
        }

        public Criteria andNoticeStatusBetween(String value1, String value2) {
            addCriterion("noticeStatus between", value1, value2, "noticeStatus");
            return (Criteria) this;
        }

        public Criteria andNoticeStatusNotBetween(String value1, String value2) {
            addCriterion("noticeStatus not between", value1, value2, "noticeStatus");
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