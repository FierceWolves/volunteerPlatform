package cn.edu.nsu.greywolf.pojo;

import java.util.ArrayList;
import java.util.List;

public class GoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsExample() {
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

        public Criteria andGoodNameIsNull() {
            addCriterion("goodName is null");
            return (Criteria) this;
        }

        public Criteria andGoodNameIsNotNull() {
            addCriterion("goodName is not null");
            return (Criteria) this;
        }

        public Criteria andGoodNameEqualTo(String value) {
            addCriterion("goodName =", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameNotEqualTo(String value) {
            addCriterion("goodName <>", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameGreaterThan(String value) {
            addCriterion("goodName >", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameGreaterThanOrEqualTo(String value) {
            addCriterion("goodName >=", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameLessThan(String value) {
            addCriterion("goodName <", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameLessThanOrEqualTo(String value) {
            addCriterion("goodName <=", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameLike(String value) {
            addCriterion("goodName like", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameNotLike(String value) {
            addCriterion("goodName not like", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameIn(List<String> values) {
            addCriterion("goodName in", values, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameNotIn(List<String> values) {
            addCriterion("goodName not in", values, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameBetween(String value1, String value2) {
            addCriterion("goodName between", value1, value2, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameNotBetween(String value1, String value2) {
            addCriterion("goodName not between", value1, value2, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodPriceIsNull() {
            addCriterion("goodPrice is null");
            return (Criteria) this;
        }

        public Criteria andGoodPriceIsNotNull() {
            addCriterion("goodPrice is not null");
            return (Criteria) this;
        }

        public Criteria andGoodPriceEqualTo(String value) {
            addCriterion("goodPrice =", value, "goodPrice");
            return (Criteria) this;
        }

        public Criteria andGoodPriceNotEqualTo(String value) {
            addCriterion("goodPrice <>", value, "goodPrice");
            return (Criteria) this;
        }

        public Criteria andGoodPriceGreaterThan(String value) {
            addCriterion("goodPrice >", value, "goodPrice");
            return (Criteria) this;
        }

        public Criteria andGoodPriceGreaterThanOrEqualTo(String value) {
            addCriterion("goodPrice >=", value, "goodPrice");
            return (Criteria) this;
        }

        public Criteria andGoodPriceLessThan(String value) {
            addCriterion("goodPrice <", value, "goodPrice");
            return (Criteria) this;
        }

        public Criteria andGoodPriceLessThanOrEqualTo(String value) {
            addCriterion("goodPrice <=", value, "goodPrice");
            return (Criteria) this;
        }

        public Criteria andGoodPriceLike(String value) {
            addCriterion("goodPrice like", value, "goodPrice");
            return (Criteria) this;
        }

        public Criteria andGoodPriceNotLike(String value) {
            addCriterion("goodPrice not like", value, "goodPrice");
            return (Criteria) this;
        }

        public Criteria andGoodPriceIn(List<String> values) {
            addCriterion("goodPrice in", values, "goodPrice");
            return (Criteria) this;
        }

        public Criteria andGoodPriceNotIn(List<String> values) {
            addCriterion("goodPrice not in", values, "goodPrice");
            return (Criteria) this;
        }

        public Criteria andGoodPriceBetween(String value1, String value2) {
            addCriterion("goodPrice between", value1, value2, "goodPrice");
            return (Criteria) this;
        }

        public Criteria andGoodPriceNotBetween(String value1, String value2) {
            addCriterion("goodPrice not between", value1, value2, "goodPrice");
            return (Criteria) this;
        }

        public Criteria andGoodIntegralIsNull() {
            addCriterion("goodIntegral is null");
            return (Criteria) this;
        }

        public Criteria andGoodIntegralIsNotNull() {
            addCriterion("goodIntegral is not null");
            return (Criteria) this;
        }

        public Criteria andGoodIntegralEqualTo(Integer value) {
            addCriterion("goodIntegral =", value, "goodIntegral");
            return (Criteria) this;
        }

        public Criteria andGoodIntegralNotEqualTo(Integer value) {
            addCriterion("goodIntegral <>", value, "goodIntegral");
            return (Criteria) this;
        }

        public Criteria andGoodIntegralGreaterThan(Integer value) {
            addCriterion("goodIntegral >", value, "goodIntegral");
            return (Criteria) this;
        }

        public Criteria andGoodIntegralGreaterThanOrEqualTo(Integer value) {
            addCriterion("goodIntegral >=", value, "goodIntegral");
            return (Criteria) this;
        }

        public Criteria andGoodIntegralLessThan(Integer value) {
            addCriterion("goodIntegral <", value, "goodIntegral");
            return (Criteria) this;
        }

        public Criteria andGoodIntegralLessThanOrEqualTo(Integer value) {
            addCriterion("goodIntegral <=", value, "goodIntegral");
            return (Criteria) this;
        }

        public Criteria andGoodIntegralIn(List<Integer> values) {
            addCriterion("goodIntegral in", values, "goodIntegral");
            return (Criteria) this;
        }

        public Criteria andGoodIntegralNotIn(List<Integer> values) {
            addCriterion("goodIntegral not in", values, "goodIntegral");
            return (Criteria) this;
        }

        public Criteria andGoodIntegralBetween(Integer value1, Integer value2) {
            addCriterion("goodIntegral between", value1, value2, "goodIntegral");
            return (Criteria) this;
        }

        public Criteria andGoodIntegralNotBetween(Integer value1, Integer value2) {
            addCriterion("goodIntegral not between", value1, value2, "goodIntegral");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNull() {
            addCriterion("discount is null");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNotNull() {
            addCriterion("discount is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountEqualTo(String value) {
            addCriterion("discount =", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotEqualTo(String value) {
            addCriterion("discount <>", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThan(String value) {
            addCriterion("discount >", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThanOrEqualTo(String value) {
            addCriterion("discount >=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThan(String value) {
            addCriterion("discount <", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThanOrEqualTo(String value) {
            addCriterion("discount <=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLike(String value) {
            addCriterion("discount like", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotLike(String value) {
            addCriterion("discount not like", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountIn(List<String> values) {
            addCriterion("discount in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotIn(List<String> values) {
            addCriterion("discount not in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountBetween(String value1, String value2) {
            addCriterion("discount between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotBetween(String value1, String value2) {
            addCriterion("discount not between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andPostageIsNull() {
            addCriterion("postage is null");
            return (Criteria) this;
        }

        public Criteria andPostageIsNotNull() {
            addCriterion("postage is not null");
            return (Criteria) this;
        }

        public Criteria andPostageEqualTo(String value) {
            addCriterion("postage =", value, "postage");
            return (Criteria) this;
        }

        public Criteria andPostageNotEqualTo(String value) {
            addCriterion("postage <>", value, "postage");
            return (Criteria) this;
        }

        public Criteria andPostageGreaterThan(String value) {
            addCriterion("postage >", value, "postage");
            return (Criteria) this;
        }

        public Criteria andPostageGreaterThanOrEqualTo(String value) {
            addCriterion("postage >=", value, "postage");
            return (Criteria) this;
        }

        public Criteria andPostageLessThan(String value) {
            addCriterion("postage <", value, "postage");
            return (Criteria) this;
        }

        public Criteria andPostageLessThanOrEqualTo(String value) {
            addCriterion("postage <=", value, "postage");
            return (Criteria) this;
        }

        public Criteria andPostageLike(String value) {
            addCriterion("postage like", value, "postage");
            return (Criteria) this;
        }

        public Criteria andPostageNotLike(String value) {
            addCriterion("postage not like", value, "postage");
            return (Criteria) this;
        }

        public Criteria andPostageIn(List<String> values) {
            addCriterion("postage in", values, "postage");
            return (Criteria) this;
        }

        public Criteria andPostageNotIn(List<String> values) {
            addCriterion("postage not in", values, "postage");
            return (Criteria) this;
        }

        public Criteria andPostageBetween(String value1, String value2) {
            addCriterion("postage between", value1, value2, "postage");
            return (Criteria) this;
        }

        public Criteria andPostageNotBetween(String value1, String value2) {
            addCriterion("postage not between", value1, value2, "postage");
            return (Criteria) this;
        }

        public Criteria andMerchantIsNull() {
            addCriterion("merchant is null");
            return (Criteria) this;
        }

        public Criteria andMerchantIsNotNull() {
            addCriterion("merchant is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantEqualTo(String value) {
            addCriterion("merchant =", value, "merchant");
            return (Criteria) this;
        }

        public Criteria andMerchantNotEqualTo(String value) {
            addCriterion("merchant <>", value, "merchant");
            return (Criteria) this;
        }

        public Criteria andMerchantGreaterThan(String value) {
            addCriterion("merchant >", value, "merchant");
            return (Criteria) this;
        }

        public Criteria andMerchantGreaterThanOrEqualTo(String value) {
            addCriterion("merchant >=", value, "merchant");
            return (Criteria) this;
        }

        public Criteria andMerchantLessThan(String value) {
            addCriterion("merchant <", value, "merchant");
            return (Criteria) this;
        }

        public Criteria andMerchantLessThanOrEqualTo(String value) {
            addCriterion("merchant <=", value, "merchant");
            return (Criteria) this;
        }

        public Criteria andMerchantLike(String value) {
            addCriterion("merchant like", value, "merchant");
            return (Criteria) this;
        }

        public Criteria andMerchantNotLike(String value) {
            addCriterion("merchant not like", value, "merchant");
            return (Criteria) this;
        }

        public Criteria andMerchantIn(List<String> values) {
            addCriterion("merchant in", values, "merchant");
            return (Criteria) this;
        }

        public Criteria andMerchantNotIn(List<String> values) {
            addCriterion("merchant not in", values, "merchant");
            return (Criteria) this;
        }

        public Criteria andMerchantBetween(String value1, String value2) {
            addCriterion("merchant between", value1, value2, "merchant");
            return (Criteria) this;
        }

        public Criteria andMerchantNotBetween(String value1, String value2) {
            addCriterion("merchant not between", value1, value2, "merchant");
            return (Criteria) this;
        }

        public Criteria andRepertoryIsNull() {
            addCriterion("repertory is null");
            return (Criteria) this;
        }

        public Criteria andRepertoryIsNotNull() {
            addCriterion("repertory is not null");
            return (Criteria) this;
        }

        public Criteria andRepertoryEqualTo(Integer value) {
            addCriterion("repertory =", value, "repertory");
            return (Criteria) this;
        }

        public Criteria andRepertoryNotEqualTo(Integer value) {
            addCriterion("repertory <>", value, "repertory");
            return (Criteria) this;
        }

        public Criteria andRepertoryGreaterThan(Integer value) {
            addCriterion("repertory >", value, "repertory");
            return (Criteria) this;
        }

        public Criteria andRepertoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("repertory >=", value, "repertory");
            return (Criteria) this;
        }

        public Criteria andRepertoryLessThan(Integer value) {
            addCriterion("repertory <", value, "repertory");
            return (Criteria) this;
        }

        public Criteria andRepertoryLessThanOrEqualTo(Integer value) {
            addCriterion("repertory <=", value, "repertory");
            return (Criteria) this;
        }

        public Criteria andRepertoryIn(List<Integer> values) {
            addCriterion("repertory in", values, "repertory");
            return (Criteria) this;
        }

        public Criteria andRepertoryNotIn(List<Integer> values) {
            addCriterion("repertory not in", values, "repertory");
            return (Criteria) this;
        }

        public Criteria andRepertoryBetween(Integer value1, Integer value2) {
            addCriterion("repertory between", value1, value2, "repertory");
            return (Criteria) this;
        }

        public Criteria andRepertoryNotBetween(Integer value1, Integer value2) {
            addCriterion("repertory not between", value1, value2, "repertory");
            return (Criteria) this;
        }

        public Criteria andSalesVolumeIsNull() {
            addCriterion("salesVolume is null");
            return (Criteria) this;
        }

        public Criteria andSalesVolumeIsNotNull() {
            addCriterion("salesVolume is not null");
            return (Criteria) this;
        }

        public Criteria andSalesVolumeEqualTo(Integer value) {
            addCriterion("salesVolume =", value, "salesVolume");
            return (Criteria) this;
        }

        public Criteria andSalesVolumeNotEqualTo(Integer value) {
            addCriterion("salesVolume <>", value, "salesVolume");
            return (Criteria) this;
        }

        public Criteria andSalesVolumeGreaterThan(Integer value) {
            addCriterion("salesVolume >", value, "salesVolume");
            return (Criteria) this;
        }

        public Criteria andSalesVolumeGreaterThanOrEqualTo(Integer value) {
            addCriterion("salesVolume >=", value, "salesVolume");
            return (Criteria) this;
        }

        public Criteria andSalesVolumeLessThan(Integer value) {
            addCriterion("salesVolume <", value, "salesVolume");
            return (Criteria) this;
        }

        public Criteria andSalesVolumeLessThanOrEqualTo(Integer value) {
            addCriterion("salesVolume <=", value, "salesVolume");
            return (Criteria) this;
        }

        public Criteria andSalesVolumeIn(List<Integer> values) {
            addCriterion("salesVolume in", values, "salesVolume");
            return (Criteria) this;
        }

        public Criteria andSalesVolumeNotIn(List<Integer> values) {
            addCriterion("salesVolume not in", values, "salesVolume");
            return (Criteria) this;
        }

        public Criteria andSalesVolumeBetween(Integer value1, Integer value2) {
            addCriterion("salesVolume between", value1, value2, "salesVolume");
            return (Criteria) this;
        }

        public Criteria andSalesVolumeNotBetween(Integer value1, Integer value2) {
            addCriterion("salesVolume not between", value1, value2, "salesVolume");
            return (Criteria) this;
        }

        public Criteria andGoodDescriptionIsNull() {
            addCriterion("goodDescription is null");
            return (Criteria) this;
        }

        public Criteria andGoodDescriptionIsNotNull() {
            addCriterion("goodDescription is not null");
            return (Criteria) this;
        }

        public Criteria andGoodDescriptionEqualTo(String value) {
            addCriterion("goodDescription =", value, "goodDescription");
            return (Criteria) this;
        }

        public Criteria andGoodDescriptionNotEqualTo(String value) {
            addCriterion("goodDescription <>", value, "goodDescription");
            return (Criteria) this;
        }

        public Criteria andGoodDescriptionGreaterThan(String value) {
            addCriterion("goodDescription >", value, "goodDescription");
            return (Criteria) this;
        }

        public Criteria andGoodDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("goodDescription >=", value, "goodDescription");
            return (Criteria) this;
        }

        public Criteria andGoodDescriptionLessThan(String value) {
            addCriterion("goodDescription <", value, "goodDescription");
            return (Criteria) this;
        }

        public Criteria andGoodDescriptionLessThanOrEqualTo(String value) {
            addCriterion("goodDescription <=", value, "goodDescription");
            return (Criteria) this;
        }

        public Criteria andGoodDescriptionLike(String value) {
            addCriterion("goodDescription like", value, "goodDescription");
            return (Criteria) this;
        }

        public Criteria andGoodDescriptionNotLike(String value) {
            addCriterion("goodDescription not like", value, "goodDescription");
            return (Criteria) this;
        }

        public Criteria andGoodDescriptionIn(List<String> values) {
            addCriterion("goodDescription in", values, "goodDescription");
            return (Criteria) this;
        }

        public Criteria andGoodDescriptionNotIn(List<String> values) {
            addCriterion("goodDescription not in", values, "goodDescription");
            return (Criteria) this;
        }

        public Criteria andGoodDescriptionBetween(String value1, String value2) {
            addCriterion("goodDescription between", value1, value2, "goodDescription");
            return (Criteria) this;
        }

        public Criteria andGoodDescriptionNotBetween(String value1, String value2) {
            addCriterion("goodDescription not between", value1, value2, "goodDescription");
            return (Criteria) this;
        }

        public Criteria andGoodPhotoIsNull() {
            addCriterion("goodPhoto is null");
            return (Criteria) this;
        }

        public Criteria andGoodPhotoIsNotNull() {
            addCriterion("goodPhoto is not null");
            return (Criteria) this;
        }

        public Criteria andGoodPhotoEqualTo(String value) {
            addCriterion("goodPhoto =", value, "goodPhoto");
            return (Criteria) this;
        }

        public Criteria andGoodPhotoNotEqualTo(String value) {
            addCriterion("goodPhoto <>", value, "goodPhoto");
            return (Criteria) this;
        }

        public Criteria andGoodPhotoGreaterThan(String value) {
            addCriterion("goodPhoto >", value, "goodPhoto");
            return (Criteria) this;
        }

        public Criteria andGoodPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("goodPhoto >=", value, "goodPhoto");
            return (Criteria) this;
        }

        public Criteria andGoodPhotoLessThan(String value) {
            addCriterion("goodPhoto <", value, "goodPhoto");
            return (Criteria) this;
        }

        public Criteria andGoodPhotoLessThanOrEqualTo(String value) {
            addCriterion("goodPhoto <=", value, "goodPhoto");
            return (Criteria) this;
        }

        public Criteria andGoodPhotoLike(String value) {
            addCriterion("goodPhoto like", value, "goodPhoto");
            return (Criteria) this;
        }

        public Criteria andGoodPhotoNotLike(String value) {
            addCriterion("goodPhoto not like", value, "goodPhoto");
            return (Criteria) this;
        }

        public Criteria andGoodPhotoIn(List<String> values) {
            addCriterion("goodPhoto in", values, "goodPhoto");
            return (Criteria) this;
        }

        public Criteria andGoodPhotoNotIn(List<String> values) {
            addCriterion("goodPhoto not in", values, "goodPhoto");
            return (Criteria) this;
        }

        public Criteria andGoodPhotoBetween(String value1, String value2) {
            addCriterion("goodPhoto between", value1, value2, "goodPhoto");
            return (Criteria) this;
        }

        public Criteria andGoodPhotoNotBetween(String value1, String value2) {
            addCriterion("goodPhoto not between", value1, value2, "goodPhoto");
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