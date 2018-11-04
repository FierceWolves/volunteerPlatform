package cn.edu.nsu.greywolf.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrdersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrdersExample() {
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

        public Criteria andVolunteerIdIsNull() {
            addCriterion("volunteerId is null");
            return (Criteria) this;
        }

        public Criteria andVolunteerIdIsNotNull() {
            addCriterion("volunteerId is not null");
            return (Criteria) this;
        }

        public Criteria andVolunteerIdEqualTo(Integer value) {
            addCriterion("volunteerId =", value, "volunteerId");
            return (Criteria) this;
        }

        public Criteria andVolunteerIdNotEqualTo(Integer value) {
            addCriterion("volunteerId <>", value, "volunteerId");
            return (Criteria) this;
        }

        public Criteria andVolunteerIdGreaterThan(Integer value) {
            addCriterion("volunteerId >", value, "volunteerId");
            return (Criteria) this;
        }

        public Criteria andVolunteerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("volunteerId >=", value, "volunteerId");
            return (Criteria) this;
        }

        public Criteria andVolunteerIdLessThan(Integer value) {
            addCriterion("volunteerId <", value, "volunteerId");
            return (Criteria) this;
        }

        public Criteria andVolunteerIdLessThanOrEqualTo(Integer value) {
            addCriterion("volunteerId <=", value, "volunteerId");
            return (Criteria) this;
        }

        public Criteria andVolunteerIdIn(List<Integer> values) {
            addCriterion("volunteerId in", values, "volunteerId");
            return (Criteria) this;
        }

        public Criteria andVolunteerIdNotIn(List<Integer> values) {
            addCriterion("volunteerId not in", values, "volunteerId");
            return (Criteria) this;
        }

        public Criteria andVolunteerIdBetween(Integer value1, Integer value2) {
            addCriterion("volunteerId between", value1, value2, "volunteerId");
            return (Criteria) this;
        }

        public Criteria andVolunteerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("volunteerId not between", value1, value2, "volunteerId");
            return (Criteria) this;
        }

        public Criteria andOrderNumberIsNull() {
            addCriterion("orderNumber is null");
            return (Criteria) this;
        }

        public Criteria andOrderNumberIsNotNull() {
            addCriterion("orderNumber is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNumberEqualTo(String value) {
            addCriterion("orderNumber =", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberNotEqualTo(String value) {
            addCriterion("orderNumber <>", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberGreaterThan(String value) {
            addCriterion("orderNumber >", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberGreaterThanOrEqualTo(String value) {
            addCriterion("orderNumber >=", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberLessThan(String value) {
            addCriterion("orderNumber <", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberLessThanOrEqualTo(String value) {
            addCriterion("orderNumber <=", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberLike(String value) {
            addCriterion("orderNumber like", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberNotLike(String value) {
            addCriterion("orderNumber not like", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberIn(List<String> values) {
            addCriterion("orderNumber in", values, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberNotIn(List<String> values) {
            addCriterion("orderNumber not in", values, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberBetween(String value1, String value2) {
            addCriterion("orderNumber between", value1, value2, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberNotBetween(String value1, String value2) {
            addCriterion("orderNumber not between", value1, value2, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderTimeIsNull() {
            addCriterion("orderTime is null");
            return (Criteria) this;
        }

        public Criteria andOrderTimeIsNotNull() {
            addCriterion("orderTime is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTimeEqualTo(Date value) {
            addCriterion("orderTime =", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotEqualTo(Date value) {
            addCriterion("orderTime <>", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeGreaterThan(Date value) {
            addCriterion("orderTime >", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("orderTime >=", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeLessThan(Date value) {
            addCriterion("orderTime <", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeLessThanOrEqualTo(Date value) {
            addCriterion("orderTime <=", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeIn(List<Date> values) {
            addCriterion("orderTime in", values, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotIn(List<Date> values) {
            addCriterion("orderTime not in", values, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeBetween(Date value1, Date value2) {
            addCriterion("orderTime between", value1, value2, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotBetween(Date value1, Date value2) {
            addCriterion("orderTime not between", value1, value2, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderMerchantIsNull() {
            addCriterion("orderMerchant is null");
            return (Criteria) this;
        }

        public Criteria andOrderMerchantIsNotNull() {
            addCriterion("orderMerchant is not null");
            return (Criteria) this;
        }

        public Criteria andOrderMerchantEqualTo(String value) {
            addCriterion("orderMerchant =", value, "orderMerchant");
            return (Criteria) this;
        }

        public Criteria andOrderMerchantNotEqualTo(String value) {
            addCriterion("orderMerchant <>", value, "orderMerchant");
            return (Criteria) this;
        }

        public Criteria andOrderMerchantGreaterThan(String value) {
            addCriterion("orderMerchant >", value, "orderMerchant");
            return (Criteria) this;
        }

        public Criteria andOrderMerchantGreaterThanOrEqualTo(String value) {
            addCriterion("orderMerchant >=", value, "orderMerchant");
            return (Criteria) this;
        }

        public Criteria andOrderMerchantLessThan(String value) {
            addCriterion("orderMerchant <", value, "orderMerchant");
            return (Criteria) this;
        }

        public Criteria andOrderMerchantLessThanOrEqualTo(String value) {
            addCriterion("orderMerchant <=", value, "orderMerchant");
            return (Criteria) this;
        }

        public Criteria andOrderMerchantLike(String value) {
            addCriterion("orderMerchant like", value, "orderMerchant");
            return (Criteria) this;
        }

        public Criteria andOrderMerchantNotLike(String value) {
            addCriterion("orderMerchant not like", value, "orderMerchant");
            return (Criteria) this;
        }

        public Criteria andOrderMerchantIn(List<String> values) {
            addCriterion("orderMerchant in", values, "orderMerchant");
            return (Criteria) this;
        }

        public Criteria andOrderMerchantNotIn(List<String> values) {
            addCriterion("orderMerchant not in", values, "orderMerchant");
            return (Criteria) this;
        }

        public Criteria andOrderMerchantBetween(String value1, String value2) {
            addCriterion("orderMerchant between", value1, value2, "orderMerchant");
            return (Criteria) this;
        }

        public Criteria andOrderMerchantNotBetween(String value1, String value2) {
            addCriterion("orderMerchant not between", value1, value2, "orderMerchant");
            return (Criteria) this;
        }

        public Criteria andTotalPriceIsNull() {
            addCriterion("totalPrice is null");
            return (Criteria) this;
        }

        public Criteria andTotalPriceIsNotNull() {
            addCriterion("totalPrice is not null");
            return (Criteria) this;
        }

        public Criteria andTotalPriceEqualTo(String value) {
            addCriterion("totalPrice =", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotEqualTo(String value) {
            addCriterion("totalPrice <>", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceGreaterThan(String value) {
            addCriterion("totalPrice >", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceGreaterThanOrEqualTo(String value) {
            addCriterion("totalPrice >=", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceLessThan(String value) {
            addCriterion("totalPrice <", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceLessThanOrEqualTo(String value) {
            addCriterion("totalPrice <=", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceLike(String value) {
            addCriterion("totalPrice like", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotLike(String value) {
            addCriterion("totalPrice not like", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceIn(List<String> values) {
            addCriterion("totalPrice in", values, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotIn(List<String> values) {
            addCriterion("totalPrice not in", values, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceBetween(String value1, String value2) {
            addCriterion("totalPrice between", value1, value2, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotBetween(String value1, String value2) {
            addCriterion("totalPrice not between", value1, value2, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andOrderDiscountIsNull() {
            addCriterion("orderDiscount is null");
            return (Criteria) this;
        }

        public Criteria andOrderDiscountIsNotNull() {
            addCriterion("orderDiscount is not null");
            return (Criteria) this;
        }

        public Criteria andOrderDiscountEqualTo(String value) {
            addCriterion("orderDiscount =", value, "orderDiscount");
            return (Criteria) this;
        }

        public Criteria andOrderDiscountNotEqualTo(String value) {
            addCriterion("orderDiscount <>", value, "orderDiscount");
            return (Criteria) this;
        }

        public Criteria andOrderDiscountGreaterThan(String value) {
            addCriterion("orderDiscount >", value, "orderDiscount");
            return (Criteria) this;
        }

        public Criteria andOrderDiscountGreaterThanOrEqualTo(String value) {
            addCriterion("orderDiscount >=", value, "orderDiscount");
            return (Criteria) this;
        }

        public Criteria andOrderDiscountLessThan(String value) {
            addCriterion("orderDiscount <", value, "orderDiscount");
            return (Criteria) this;
        }

        public Criteria andOrderDiscountLessThanOrEqualTo(String value) {
            addCriterion("orderDiscount <=", value, "orderDiscount");
            return (Criteria) this;
        }

        public Criteria andOrderDiscountLike(String value) {
            addCriterion("orderDiscount like", value, "orderDiscount");
            return (Criteria) this;
        }

        public Criteria andOrderDiscountNotLike(String value) {
            addCriterion("orderDiscount not like", value, "orderDiscount");
            return (Criteria) this;
        }

        public Criteria andOrderDiscountIn(List<String> values) {
            addCriterion("orderDiscount in", values, "orderDiscount");
            return (Criteria) this;
        }

        public Criteria andOrderDiscountNotIn(List<String> values) {
            addCriterion("orderDiscount not in", values, "orderDiscount");
            return (Criteria) this;
        }

        public Criteria andOrderDiscountBetween(String value1, String value2) {
            addCriterion("orderDiscount between", value1, value2, "orderDiscount");
            return (Criteria) this;
        }

        public Criteria andOrderDiscountNotBetween(String value1, String value2) {
            addCriterion("orderDiscount not between", value1, value2, "orderDiscount");
            return (Criteria) this;
        }

        public Criteria andOrderPostageIsNull() {
            addCriterion("orderPostage is null");
            return (Criteria) this;
        }

        public Criteria andOrderPostageIsNotNull() {
            addCriterion("orderPostage is not null");
            return (Criteria) this;
        }

        public Criteria andOrderPostageEqualTo(String value) {
            addCriterion("orderPostage =", value, "orderPostage");
            return (Criteria) this;
        }

        public Criteria andOrderPostageNotEqualTo(String value) {
            addCriterion("orderPostage <>", value, "orderPostage");
            return (Criteria) this;
        }

        public Criteria andOrderPostageGreaterThan(String value) {
            addCriterion("orderPostage >", value, "orderPostage");
            return (Criteria) this;
        }

        public Criteria andOrderPostageGreaterThanOrEqualTo(String value) {
            addCriterion("orderPostage >=", value, "orderPostage");
            return (Criteria) this;
        }

        public Criteria andOrderPostageLessThan(String value) {
            addCriterion("orderPostage <", value, "orderPostage");
            return (Criteria) this;
        }

        public Criteria andOrderPostageLessThanOrEqualTo(String value) {
            addCriterion("orderPostage <=", value, "orderPostage");
            return (Criteria) this;
        }

        public Criteria andOrderPostageLike(String value) {
            addCriterion("orderPostage like", value, "orderPostage");
            return (Criteria) this;
        }

        public Criteria andOrderPostageNotLike(String value) {
            addCriterion("orderPostage not like", value, "orderPostage");
            return (Criteria) this;
        }

        public Criteria andOrderPostageIn(List<String> values) {
            addCriterion("orderPostage in", values, "orderPostage");
            return (Criteria) this;
        }

        public Criteria andOrderPostageNotIn(List<String> values) {
            addCriterion("orderPostage not in", values, "orderPostage");
            return (Criteria) this;
        }

        public Criteria andOrderPostageBetween(String value1, String value2) {
            addCriterion("orderPostage between", value1, value2, "orderPostage");
            return (Criteria) this;
        }

        public Criteria andOrderPostageNotBetween(String value1, String value2) {
            addCriterion("orderPostage not between", value1, value2, "orderPostage");
            return (Criteria) this;
        }

        public Criteria andActualPaymentIsNull() {
            addCriterion("actualPayment is null");
            return (Criteria) this;
        }

        public Criteria andActualPaymentIsNotNull() {
            addCriterion("actualPayment is not null");
            return (Criteria) this;
        }

        public Criteria andActualPaymentEqualTo(String value) {
            addCriterion("actualPayment =", value, "actualPayment");
            return (Criteria) this;
        }

        public Criteria andActualPaymentNotEqualTo(String value) {
            addCriterion("actualPayment <>", value, "actualPayment");
            return (Criteria) this;
        }

        public Criteria andActualPaymentGreaterThan(String value) {
            addCriterion("actualPayment >", value, "actualPayment");
            return (Criteria) this;
        }

        public Criteria andActualPaymentGreaterThanOrEqualTo(String value) {
            addCriterion("actualPayment >=", value, "actualPayment");
            return (Criteria) this;
        }

        public Criteria andActualPaymentLessThan(String value) {
            addCriterion("actualPayment <", value, "actualPayment");
            return (Criteria) this;
        }

        public Criteria andActualPaymentLessThanOrEqualTo(String value) {
            addCriterion("actualPayment <=", value, "actualPayment");
            return (Criteria) this;
        }

        public Criteria andActualPaymentLike(String value) {
            addCriterion("actualPayment like", value, "actualPayment");
            return (Criteria) this;
        }

        public Criteria andActualPaymentNotLike(String value) {
            addCriterion("actualPayment not like", value, "actualPayment");
            return (Criteria) this;
        }

        public Criteria andActualPaymentIn(List<String> values) {
            addCriterion("actualPayment in", values, "actualPayment");
            return (Criteria) this;
        }

        public Criteria andActualPaymentNotIn(List<String> values) {
            addCriterion("actualPayment not in", values, "actualPayment");
            return (Criteria) this;
        }

        public Criteria andActualPaymentBetween(String value1, String value2) {
            addCriterion("actualPayment between", value1, value2, "actualPayment");
            return (Criteria) this;
        }

        public Criteria andActualPaymentNotBetween(String value1, String value2) {
            addCriterion("actualPayment not between", value1, value2, "actualPayment");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNull() {
            addCriterion("orderStatus is null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNotNull() {
            addCriterion("orderStatus is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusEqualTo(String value) {
            addCriterion("orderStatus =", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotEqualTo(String value) {
            addCriterion("orderStatus <>", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThan(String value) {
            addCriterion("orderStatus >", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThanOrEqualTo(String value) {
            addCriterion("orderStatus >=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThan(String value) {
            addCriterion("orderStatus <", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThanOrEqualTo(String value) {
            addCriterion("orderStatus <=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLike(String value) {
            addCriterion("orderStatus like", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotLike(String value) {
            addCriterion("orderStatus not like", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIn(List<String> values) {
            addCriterion("orderStatus in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotIn(List<String> values) {
            addCriterion("orderStatus not in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusBetween(String value1, String value2) {
            addCriterion("orderStatus between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotBetween(String value1, String value2) {
            addCriterion("orderStatus not between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andReceiptInformationIsNull() {
            addCriterion("receiptInformation is null");
            return (Criteria) this;
        }

        public Criteria andReceiptInformationIsNotNull() {
            addCriterion("receiptInformation is not null");
            return (Criteria) this;
        }

        public Criteria andReceiptInformationEqualTo(String value) {
            addCriterion("receiptInformation =", value, "receiptInformation");
            return (Criteria) this;
        }

        public Criteria andReceiptInformationNotEqualTo(String value) {
            addCriterion("receiptInformation <>", value, "receiptInformation");
            return (Criteria) this;
        }

        public Criteria andReceiptInformationGreaterThan(String value) {
            addCriterion("receiptInformation >", value, "receiptInformation");
            return (Criteria) this;
        }

        public Criteria andReceiptInformationGreaterThanOrEqualTo(String value) {
            addCriterion("receiptInformation >=", value, "receiptInformation");
            return (Criteria) this;
        }

        public Criteria andReceiptInformationLessThan(String value) {
            addCriterion("receiptInformation <", value, "receiptInformation");
            return (Criteria) this;
        }

        public Criteria andReceiptInformationLessThanOrEqualTo(String value) {
            addCriterion("receiptInformation <=", value, "receiptInformation");
            return (Criteria) this;
        }

        public Criteria andReceiptInformationLike(String value) {
            addCriterion("receiptInformation like", value, "receiptInformation");
            return (Criteria) this;
        }

        public Criteria andReceiptInformationNotLike(String value) {
            addCriterion("receiptInformation not like", value, "receiptInformation");
            return (Criteria) this;
        }

        public Criteria andReceiptInformationIn(List<String> values) {
            addCriterion("receiptInformation in", values, "receiptInformation");
            return (Criteria) this;
        }

        public Criteria andReceiptInformationNotIn(List<String> values) {
            addCriterion("receiptInformation not in", values, "receiptInformation");
            return (Criteria) this;
        }

        public Criteria andReceiptInformationBetween(String value1, String value2) {
            addCriterion("receiptInformation between", value1, value2, "receiptInformation");
            return (Criteria) this;
        }

        public Criteria andReceiptInformationNotBetween(String value1, String value2) {
            addCriterion("receiptInformation not between", value1, value2, "receiptInformation");
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