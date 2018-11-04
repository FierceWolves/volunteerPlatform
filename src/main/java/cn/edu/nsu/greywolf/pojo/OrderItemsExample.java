package cn.edu.nsu.greywolf.pojo;

import java.util.ArrayList;
import java.util.List;

public class OrderItemsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderItemsExample() {
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

        public Criteria andOrderItemIdIsNull() {
            addCriterion("orderItemId is null");
            return (Criteria) this;
        }

        public Criteria andOrderItemIdIsNotNull() {
            addCriterion("orderItemId is not null");
            return (Criteria) this;
        }

        public Criteria andOrderItemIdEqualTo(Integer value) {
            addCriterion("orderItemId =", value, "orderItemId");
            return (Criteria) this;
        }

        public Criteria andOrderItemIdNotEqualTo(Integer value) {
            addCriterion("orderItemId <>", value, "orderItemId");
            return (Criteria) this;
        }

        public Criteria andOrderItemIdGreaterThan(Integer value) {
            addCriterion("orderItemId >", value, "orderItemId");
            return (Criteria) this;
        }

        public Criteria andOrderItemIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("orderItemId >=", value, "orderItemId");
            return (Criteria) this;
        }

        public Criteria andOrderItemIdLessThan(Integer value) {
            addCriterion("orderItemId <", value, "orderItemId");
            return (Criteria) this;
        }

        public Criteria andOrderItemIdLessThanOrEqualTo(Integer value) {
            addCriterion("orderItemId <=", value, "orderItemId");
            return (Criteria) this;
        }

        public Criteria andOrderItemIdIn(List<Integer> values) {
            addCriterion("orderItemId in", values, "orderItemId");
            return (Criteria) this;
        }

        public Criteria andOrderItemIdNotIn(List<Integer> values) {
            addCriterion("orderItemId not in", values, "orderItemId");
            return (Criteria) this;
        }

        public Criteria andOrderItemIdBetween(Integer value1, Integer value2) {
            addCriterion("orderItemId between", value1, value2, "orderItemId");
            return (Criteria) this;
        }

        public Criteria andOrderItemIdNotBetween(Integer value1, Integer value2) {
            addCriterion("orderItemId not between", value1, value2, "orderItemId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("orderId is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("orderId is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Integer value) {
            addCriterion("orderId =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Integer value) {
            addCriterion("orderId <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Integer value) {
            addCriterion("orderId >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("orderId >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Integer value) {
            addCriterion("orderId <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("orderId <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Integer> values) {
            addCriterion("orderId in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Integer> values) {
            addCriterion("orderId not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("orderId between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("orderId not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andGoodIdIsNull() {
            addCriterion("goodId is null");
            return (Criteria) this;
        }

        public Criteria andGoodIdIsNotNull() {
            addCriterion("goodId is not null");
            return (Criteria) this;
        }

        public Criteria andGoodIdEqualTo(Integer value) {
            addCriterion("goodId =", value, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdNotEqualTo(Integer value) {
            addCriterion("goodId <>", value, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdGreaterThan(Integer value) {
            addCriterion("goodId >", value, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("goodId >=", value, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdLessThan(Integer value) {
            addCriterion("goodId <", value, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdLessThanOrEqualTo(Integer value) {
            addCriterion("goodId <=", value, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdIn(List<Integer> values) {
            addCriterion("goodId in", values, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdNotIn(List<Integer> values) {
            addCriterion("goodId not in", values, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdBetween(Integer value1, Integer value2) {
            addCriterion("goodId between", value1, value2, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdNotBetween(Integer value1, Integer value2) {
            addCriterion("goodId not between", value1, value2, "goodId");
            return (Criteria) this;
        }

        public Criteria andOrderItemPhotoIsNull() {
            addCriterion("orderItemPhoto is null");
            return (Criteria) this;
        }

        public Criteria andOrderItemPhotoIsNotNull() {
            addCriterion("orderItemPhoto is not null");
            return (Criteria) this;
        }

        public Criteria andOrderItemPhotoEqualTo(String value) {
            addCriterion("orderItemPhoto =", value, "orderItemPhoto");
            return (Criteria) this;
        }

        public Criteria andOrderItemPhotoNotEqualTo(String value) {
            addCriterion("orderItemPhoto <>", value, "orderItemPhoto");
            return (Criteria) this;
        }

        public Criteria andOrderItemPhotoGreaterThan(String value) {
            addCriterion("orderItemPhoto >", value, "orderItemPhoto");
            return (Criteria) this;
        }

        public Criteria andOrderItemPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("orderItemPhoto >=", value, "orderItemPhoto");
            return (Criteria) this;
        }

        public Criteria andOrderItemPhotoLessThan(String value) {
            addCriterion("orderItemPhoto <", value, "orderItemPhoto");
            return (Criteria) this;
        }

        public Criteria andOrderItemPhotoLessThanOrEqualTo(String value) {
            addCriterion("orderItemPhoto <=", value, "orderItemPhoto");
            return (Criteria) this;
        }

        public Criteria andOrderItemPhotoLike(String value) {
            addCriterion("orderItemPhoto like", value, "orderItemPhoto");
            return (Criteria) this;
        }

        public Criteria andOrderItemPhotoNotLike(String value) {
            addCriterion("orderItemPhoto not like", value, "orderItemPhoto");
            return (Criteria) this;
        }

        public Criteria andOrderItemPhotoIn(List<String> values) {
            addCriterion("orderItemPhoto in", values, "orderItemPhoto");
            return (Criteria) this;
        }

        public Criteria andOrderItemPhotoNotIn(List<String> values) {
            addCriterion("orderItemPhoto not in", values, "orderItemPhoto");
            return (Criteria) this;
        }

        public Criteria andOrderItemPhotoBetween(String value1, String value2) {
            addCriterion("orderItemPhoto between", value1, value2, "orderItemPhoto");
            return (Criteria) this;
        }

        public Criteria andOrderItemPhotoNotBetween(String value1, String value2) {
            addCriterion("orderItemPhoto not between", value1, value2, "orderItemPhoto");
            return (Criteria) this;
        }

        public Criteria andOrderItemNameIsNull() {
            addCriterion("orderItemName is null");
            return (Criteria) this;
        }

        public Criteria andOrderItemNameIsNotNull() {
            addCriterion("orderItemName is not null");
            return (Criteria) this;
        }

        public Criteria andOrderItemNameEqualTo(String value) {
            addCriterion("orderItemName =", value, "orderItemName");
            return (Criteria) this;
        }

        public Criteria andOrderItemNameNotEqualTo(String value) {
            addCriterion("orderItemName <>", value, "orderItemName");
            return (Criteria) this;
        }

        public Criteria andOrderItemNameGreaterThan(String value) {
            addCriterion("orderItemName >", value, "orderItemName");
            return (Criteria) this;
        }

        public Criteria andOrderItemNameGreaterThanOrEqualTo(String value) {
            addCriterion("orderItemName >=", value, "orderItemName");
            return (Criteria) this;
        }

        public Criteria andOrderItemNameLessThan(String value) {
            addCriterion("orderItemName <", value, "orderItemName");
            return (Criteria) this;
        }

        public Criteria andOrderItemNameLessThanOrEqualTo(String value) {
            addCriterion("orderItemName <=", value, "orderItemName");
            return (Criteria) this;
        }

        public Criteria andOrderItemNameLike(String value) {
            addCriterion("orderItemName like", value, "orderItemName");
            return (Criteria) this;
        }

        public Criteria andOrderItemNameNotLike(String value) {
            addCriterion("orderItemName not like", value, "orderItemName");
            return (Criteria) this;
        }

        public Criteria andOrderItemNameIn(List<String> values) {
            addCriterion("orderItemName in", values, "orderItemName");
            return (Criteria) this;
        }

        public Criteria andOrderItemNameNotIn(List<String> values) {
            addCriterion("orderItemName not in", values, "orderItemName");
            return (Criteria) this;
        }

        public Criteria andOrderItemNameBetween(String value1, String value2) {
            addCriterion("orderItemName between", value1, value2, "orderItemName");
            return (Criteria) this;
        }

        public Criteria andOrderItemNameNotBetween(String value1, String value2) {
            addCriterion("orderItemName not between", value1, value2, "orderItemName");
            return (Criteria) this;
        }

        public Criteria andOrderItemPriceIsNull() {
            addCriterion("orderItemPrice is null");
            return (Criteria) this;
        }

        public Criteria andOrderItemPriceIsNotNull() {
            addCriterion("orderItemPrice is not null");
            return (Criteria) this;
        }

        public Criteria andOrderItemPriceEqualTo(String value) {
            addCriterion("orderItemPrice =", value, "orderItemPrice");
            return (Criteria) this;
        }

        public Criteria andOrderItemPriceNotEqualTo(String value) {
            addCriterion("orderItemPrice <>", value, "orderItemPrice");
            return (Criteria) this;
        }

        public Criteria andOrderItemPriceGreaterThan(String value) {
            addCriterion("orderItemPrice >", value, "orderItemPrice");
            return (Criteria) this;
        }

        public Criteria andOrderItemPriceGreaterThanOrEqualTo(String value) {
            addCriterion("orderItemPrice >=", value, "orderItemPrice");
            return (Criteria) this;
        }

        public Criteria andOrderItemPriceLessThan(String value) {
            addCriterion("orderItemPrice <", value, "orderItemPrice");
            return (Criteria) this;
        }

        public Criteria andOrderItemPriceLessThanOrEqualTo(String value) {
            addCriterion("orderItemPrice <=", value, "orderItemPrice");
            return (Criteria) this;
        }

        public Criteria andOrderItemPriceLike(String value) {
            addCriterion("orderItemPrice like", value, "orderItemPrice");
            return (Criteria) this;
        }

        public Criteria andOrderItemPriceNotLike(String value) {
            addCriterion("orderItemPrice not like", value, "orderItemPrice");
            return (Criteria) this;
        }

        public Criteria andOrderItemPriceIn(List<String> values) {
            addCriterion("orderItemPrice in", values, "orderItemPrice");
            return (Criteria) this;
        }

        public Criteria andOrderItemPriceNotIn(List<String> values) {
            addCriterion("orderItemPrice not in", values, "orderItemPrice");
            return (Criteria) this;
        }

        public Criteria andOrderItemPriceBetween(String value1, String value2) {
            addCriterion("orderItemPrice between", value1, value2, "orderItemPrice");
            return (Criteria) this;
        }

        public Criteria andOrderItemPriceNotBetween(String value1, String value2) {
            addCriterion("orderItemPrice not between", value1, value2, "orderItemPrice");
            return (Criteria) this;
        }

        public Criteria andOrderItemNumberIsNull() {
            addCriterion("orderItemNumber is null");
            return (Criteria) this;
        }

        public Criteria andOrderItemNumberIsNotNull() {
            addCriterion("orderItemNumber is not null");
            return (Criteria) this;
        }

        public Criteria andOrderItemNumberEqualTo(Integer value) {
            addCriterion("orderItemNumber =", value, "orderItemNumber");
            return (Criteria) this;
        }

        public Criteria andOrderItemNumberNotEqualTo(Integer value) {
            addCriterion("orderItemNumber <>", value, "orderItemNumber");
            return (Criteria) this;
        }

        public Criteria andOrderItemNumberGreaterThan(Integer value) {
            addCriterion("orderItemNumber >", value, "orderItemNumber");
            return (Criteria) this;
        }

        public Criteria andOrderItemNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("orderItemNumber >=", value, "orderItemNumber");
            return (Criteria) this;
        }

        public Criteria andOrderItemNumberLessThan(Integer value) {
            addCriterion("orderItemNumber <", value, "orderItemNumber");
            return (Criteria) this;
        }

        public Criteria andOrderItemNumberLessThanOrEqualTo(Integer value) {
            addCriterion("orderItemNumber <=", value, "orderItemNumber");
            return (Criteria) this;
        }

        public Criteria andOrderItemNumberIn(List<Integer> values) {
            addCriterion("orderItemNumber in", values, "orderItemNumber");
            return (Criteria) this;
        }

        public Criteria andOrderItemNumberNotIn(List<Integer> values) {
            addCriterion("orderItemNumber not in", values, "orderItemNumber");
            return (Criteria) this;
        }

        public Criteria andOrderItemNumberBetween(Integer value1, Integer value2) {
            addCriterion("orderItemNumber between", value1, value2, "orderItemNumber");
            return (Criteria) this;
        }

        public Criteria andOrderItemNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("orderItemNumber not between", value1, value2, "orderItemNumber");
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