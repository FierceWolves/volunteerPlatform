package cn.edu.nsu.greywolf.pojo;

import java.util.ArrayList;
import java.util.List;

public class LogisticsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LogisticsExample() {
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

        public Criteria andLogisticsNumberIsNull() {
            addCriterion("logisticsNumber is null");
            return (Criteria) this;
        }

        public Criteria andLogisticsNumberIsNotNull() {
            addCriterion("logisticsNumber is not null");
            return (Criteria) this;
        }

        public Criteria andLogisticsNumberEqualTo(String value) {
            addCriterion("logisticsNumber =", value, "logisticsNumber");
            return (Criteria) this;
        }

        public Criteria andLogisticsNumberNotEqualTo(String value) {
            addCriterion("logisticsNumber <>", value, "logisticsNumber");
            return (Criteria) this;
        }

        public Criteria andLogisticsNumberGreaterThan(String value) {
            addCriterion("logisticsNumber >", value, "logisticsNumber");
            return (Criteria) this;
        }

        public Criteria andLogisticsNumberGreaterThanOrEqualTo(String value) {
            addCriterion("logisticsNumber >=", value, "logisticsNumber");
            return (Criteria) this;
        }

        public Criteria andLogisticsNumberLessThan(String value) {
            addCriterion("logisticsNumber <", value, "logisticsNumber");
            return (Criteria) this;
        }

        public Criteria andLogisticsNumberLessThanOrEqualTo(String value) {
            addCriterion("logisticsNumber <=", value, "logisticsNumber");
            return (Criteria) this;
        }

        public Criteria andLogisticsNumberLike(String value) {
            addCriterion("logisticsNumber like", value, "logisticsNumber");
            return (Criteria) this;
        }

        public Criteria andLogisticsNumberNotLike(String value) {
            addCriterion("logisticsNumber not like", value, "logisticsNumber");
            return (Criteria) this;
        }

        public Criteria andLogisticsNumberIn(List<String> values) {
            addCriterion("logisticsNumber in", values, "logisticsNumber");
            return (Criteria) this;
        }

        public Criteria andLogisticsNumberNotIn(List<String> values) {
            addCriterion("logisticsNumber not in", values, "logisticsNumber");
            return (Criteria) this;
        }

        public Criteria andLogisticsNumberBetween(String value1, String value2) {
            addCriterion("logisticsNumber between", value1, value2, "logisticsNumber");
            return (Criteria) this;
        }

        public Criteria andLogisticsNumberNotBetween(String value1, String value2) {
            addCriterion("logisticsNumber not between", value1, value2, "logisticsNumber");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyIsNull() {
            addCriterion("logisticsCompany is null");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyIsNotNull() {
            addCriterion("logisticsCompany is not null");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyEqualTo(String value) {
            addCriterion("logisticsCompany =", value, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyNotEqualTo(String value) {
            addCriterion("logisticsCompany <>", value, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyGreaterThan(String value) {
            addCriterion("logisticsCompany >", value, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("logisticsCompany >=", value, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyLessThan(String value) {
            addCriterion("logisticsCompany <", value, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyLessThanOrEqualTo(String value) {
            addCriterion("logisticsCompany <=", value, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyLike(String value) {
            addCriterion("logisticsCompany like", value, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyNotLike(String value) {
            addCriterion("logisticsCompany not like", value, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyIn(List<String> values) {
            addCriterion("logisticsCompany in", values, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyNotIn(List<String> values) {
            addCriterion("logisticsCompany not in", values, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyBetween(String value1, String value2) {
            addCriterion("logisticsCompany between", value1, value2, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyNotBetween(String value1, String value2) {
            addCriterion("logisticsCompany not between", value1, value2, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andDespatchPlaceIsNull() {
            addCriterion("despatchPlace is null");
            return (Criteria) this;
        }

        public Criteria andDespatchPlaceIsNotNull() {
            addCriterion("despatchPlace is not null");
            return (Criteria) this;
        }

        public Criteria andDespatchPlaceEqualTo(String value) {
            addCriterion("despatchPlace =", value, "despatchPlace");
            return (Criteria) this;
        }

        public Criteria andDespatchPlaceNotEqualTo(String value) {
            addCriterion("despatchPlace <>", value, "despatchPlace");
            return (Criteria) this;
        }

        public Criteria andDespatchPlaceGreaterThan(String value) {
            addCriterion("despatchPlace >", value, "despatchPlace");
            return (Criteria) this;
        }

        public Criteria andDespatchPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("despatchPlace >=", value, "despatchPlace");
            return (Criteria) this;
        }

        public Criteria andDespatchPlaceLessThan(String value) {
            addCriterion("despatchPlace <", value, "despatchPlace");
            return (Criteria) this;
        }

        public Criteria andDespatchPlaceLessThanOrEqualTo(String value) {
            addCriterion("despatchPlace <=", value, "despatchPlace");
            return (Criteria) this;
        }

        public Criteria andDespatchPlaceLike(String value) {
            addCriterion("despatchPlace like", value, "despatchPlace");
            return (Criteria) this;
        }

        public Criteria andDespatchPlaceNotLike(String value) {
            addCriterion("despatchPlace not like", value, "despatchPlace");
            return (Criteria) this;
        }

        public Criteria andDespatchPlaceIn(List<String> values) {
            addCriterion("despatchPlace in", values, "despatchPlace");
            return (Criteria) this;
        }

        public Criteria andDespatchPlaceNotIn(List<String> values) {
            addCriterion("despatchPlace not in", values, "despatchPlace");
            return (Criteria) this;
        }

        public Criteria andDespatchPlaceBetween(String value1, String value2) {
            addCriterion("despatchPlace between", value1, value2, "despatchPlace");
            return (Criteria) this;
        }

        public Criteria andDespatchPlaceNotBetween(String value1, String value2) {
            addCriterion("despatchPlace not between", value1, value2, "despatchPlace");
            return (Criteria) this;
        }

        public Criteria andDespatchPersonIsNull() {
            addCriterion("despatchPerson is null");
            return (Criteria) this;
        }

        public Criteria andDespatchPersonIsNotNull() {
            addCriterion("despatchPerson is not null");
            return (Criteria) this;
        }

        public Criteria andDespatchPersonEqualTo(String value) {
            addCriterion("despatchPerson =", value, "despatchPerson");
            return (Criteria) this;
        }

        public Criteria andDespatchPersonNotEqualTo(String value) {
            addCriterion("despatchPerson <>", value, "despatchPerson");
            return (Criteria) this;
        }

        public Criteria andDespatchPersonGreaterThan(String value) {
            addCriterion("despatchPerson >", value, "despatchPerson");
            return (Criteria) this;
        }

        public Criteria andDespatchPersonGreaterThanOrEqualTo(String value) {
            addCriterion("despatchPerson >=", value, "despatchPerson");
            return (Criteria) this;
        }

        public Criteria andDespatchPersonLessThan(String value) {
            addCriterion("despatchPerson <", value, "despatchPerson");
            return (Criteria) this;
        }

        public Criteria andDespatchPersonLessThanOrEqualTo(String value) {
            addCriterion("despatchPerson <=", value, "despatchPerson");
            return (Criteria) this;
        }

        public Criteria andDespatchPersonLike(String value) {
            addCriterion("despatchPerson like", value, "despatchPerson");
            return (Criteria) this;
        }

        public Criteria andDespatchPersonNotLike(String value) {
            addCriterion("despatchPerson not like", value, "despatchPerson");
            return (Criteria) this;
        }

        public Criteria andDespatchPersonIn(List<String> values) {
            addCriterion("despatchPerson in", values, "despatchPerson");
            return (Criteria) this;
        }

        public Criteria andDespatchPersonNotIn(List<String> values) {
            addCriterion("despatchPerson not in", values, "despatchPerson");
            return (Criteria) this;
        }

        public Criteria andDespatchPersonBetween(String value1, String value2) {
            addCriterion("despatchPerson between", value1, value2, "despatchPerson");
            return (Criteria) this;
        }

        public Criteria andDespatchPersonNotBetween(String value1, String value2) {
            addCriterion("despatchPerson not between", value1, value2, "despatchPerson");
            return (Criteria) this;
        }

        public Criteria andDespatchTelIsNull() {
            addCriterion("despatchTel is null");
            return (Criteria) this;
        }

        public Criteria andDespatchTelIsNotNull() {
            addCriterion("despatchTel is not null");
            return (Criteria) this;
        }

        public Criteria andDespatchTelEqualTo(String value) {
            addCriterion("despatchTel =", value, "despatchTel");
            return (Criteria) this;
        }

        public Criteria andDespatchTelNotEqualTo(String value) {
            addCriterion("despatchTel <>", value, "despatchTel");
            return (Criteria) this;
        }

        public Criteria andDespatchTelGreaterThan(String value) {
            addCriterion("despatchTel >", value, "despatchTel");
            return (Criteria) this;
        }

        public Criteria andDespatchTelGreaterThanOrEqualTo(String value) {
            addCriterion("despatchTel >=", value, "despatchTel");
            return (Criteria) this;
        }

        public Criteria andDespatchTelLessThan(String value) {
            addCriterion("despatchTel <", value, "despatchTel");
            return (Criteria) this;
        }

        public Criteria andDespatchTelLessThanOrEqualTo(String value) {
            addCriterion("despatchTel <=", value, "despatchTel");
            return (Criteria) this;
        }

        public Criteria andDespatchTelLike(String value) {
            addCriterion("despatchTel like", value, "despatchTel");
            return (Criteria) this;
        }

        public Criteria andDespatchTelNotLike(String value) {
            addCriterion("despatchTel not like", value, "despatchTel");
            return (Criteria) this;
        }

        public Criteria andDespatchTelIn(List<String> values) {
            addCriterion("despatchTel in", values, "despatchTel");
            return (Criteria) this;
        }

        public Criteria andDespatchTelNotIn(List<String> values) {
            addCriterion("despatchTel not in", values, "despatchTel");
            return (Criteria) this;
        }

        public Criteria andDespatchTelBetween(String value1, String value2) {
            addCriterion("despatchTel between", value1, value2, "despatchTel");
            return (Criteria) this;
        }

        public Criteria andDespatchTelNotBetween(String value1, String value2) {
            addCriterion("despatchTel not between", value1, value2, "despatchTel");
            return (Criteria) this;
        }

        public Criteria andDespatchCodeIsNull() {
            addCriterion("despatchCode is null");
            return (Criteria) this;
        }

        public Criteria andDespatchCodeIsNotNull() {
            addCriterion("despatchCode is not null");
            return (Criteria) this;
        }

        public Criteria andDespatchCodeEqualTo(String value) {
            addCriterion("despatchCode =", value, "despatchCode");
            return (Criteria) this;
        }

        public Criteria andDespatchCodeNotEqualTo(String value) {
            addCriterion("despatchCode <>", value, "despatchCode");
            return (Criteria) this;
        }

        public Criteria andDespatchCodeGreaterThan(String value) {
            addCriterion("despatchCode >", value, "despatchCode");
            return (Criteria) this;
        }

        public Criteria andDespatchCodeGreaterThanOrEqualTo(String value) {
            addCriterion("despatchCode >=", value, "despatchCode");
            return (Criteria) this;
        }

        public Criteria andDespatchCodeLessThan(String value) {
            addCriterion("despatchCode <", value, "despatchCode");
            return (Criteria) this;
        }

        public Criteria andDespatchCodeLessThanOrEqualTo(String value) {
            addCriterion("despatchCode <=", value, "despatchCode");
            return (Criteria) this;
        }

        public Criteria andDespatchCodeLike(String value) {
            addCriterion("despatchCode like", value, "despatchCode");
            return (Criteria) this;
        }

        public Criteria andDespatchCodeNotLike(String value) {
            addCriterion("despatchCode not like", value, "despatchCode");
            return (Criteria) this;
        }

        public Criteria andDespatchCodeIn(List<String> values) {
            addCriterion("despatchCode in", values, "despatchCode");
            return (Criteria) this;
        }

        public Criteria andDespatchCodeNotIn(List<String> values) {
            addCriterion("despatchCode not in", values, "despatchCode");
            return (Criteria) this;
        }

        public Criteria andDespatchCodeBetween(String value1, String value2) {
            addCriterion("despatchCode between", value1, value2, "despatchCode");
            return (Criteria) this;
        }

        public Criteria andDespatchCodeNotBetween(String value1, String value2) {
            addCriterion("despatchCode not between", value1, value2, "despatchCode");
            return (Criteria) this;
        }

        public Criteria andReceiptPlaceIsNull() {
            addCriterion("receiptPlace is null");
            return (Criteria) this;
        }

        public Criteria andReceiptPlaceIsNotNull() {
            addCriterion("receiptPlace is not null");
            return (Criteria) this;
        }

        public Criteria andReceiptPlaceEqualTo(String value) {
            addCriterion("receiptPlace =", value, "receiptPlace");
            return (Criteria) this;
        }

        public Criteria andReceiptPlaceNotEqualTo(String value) {
            addCriterion("receiptPlace <>", value, "receiptPlace");
            return (Criteria) this;
        }

        public Criteria andReceiptPlaceGreaterThan(String value) {
            addCriterion("receiptPlace >", value, "receiptPlace");
            return (Criteria) this;
        }

        public Criteria andReceiptPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("receiptPlace >=", value, "receiptPlace");
            return (Criteria) this;
        }

        public Criteria andReceiptPlaceLessThan(String value) {
            addCriterion("receiptPlace <", value, "receiptPlace");
            return (Criteria) this;
        }

        public Criteria andReceiptPlaceLessThanOrEqualTo(String value) {
            addCriterion("receiptPlace <=", value, "receiptPlace");
            return (Criteria) this;
        }

        public Criteria andReceiptPlaceLike(String value) {
            addCriterion("receiptPlace like", value, "receiptPlace");
            return (Criteria) this;
        }

        public Criteria andReceiptPlaceNotLike(String value) {
            addCriterion("receiptPlace not like", value, "receiptPlace");
            return (Criteria) this;
        }

        public Criteria andReceiptPlaceIn(List<String> values) {
            addCriterion("receiptPlace in", values, "receiptPlace");
            return (Criteria) this;
        }

        public Criteria andReceiptPlaceNotIn(List<String> values) {
            addCriterion("receiptPlace not in", values, "receiptPlace");
            return (Criteria) this;
        }

        public Criteria andReceiptPlaceBetween(String value1, String value2) {
            addCriterion("receiptPlace between", value1, value2, "receiptPlace");
            return (Criteria) this;
        }

        public Criteria andReceiptPlaceNotBetween(String value1, String value2) {
            addCriterion("receiptPlace not between", value1, value2, "receiptPlace");
            return (Criteria) this;
        }

        public Criteria andReceiptPersonIsNull() {
            addCriterion("receiptPerson is null");
            return (Criteria) this;
        }

        public Criteria andReceiptPersonIsNotNull() {
            addCriterion("receiptPerson is not null");
            return (Criteria) this;
        }

        public Criteria andReceiptPersonEqualTo(String value) {
            addCriterion("receiptPerson =", value, "receiptPerson");
            return (Criteria) this;
        }

        public Criteria andReceiptPersonNotEqualTo(String value) {
            addCriterion("receiptPerson <>", value, "receiptPerson");
            return (Criteria) this;
        }

        public Criteria andReceiptPersonGreaterThan(String value) {
            addCriterion("receiptPerson >", value, "receiptPerson");
            return (Criteria) this;
        }

        public Criteria andReceiptPersonGreaterThanOrEqualTo(String value) {
            addCriterion("receiptPerson >=", value, "receiptPerson");
            return (Criteria) this;
        }

        public Criteria andReceiptPersonLessThan(String value) {
            addCriterion("receiptPerson <", value, "receiptPerson");
            return (Criteria) this;
        }

        public Criteria andReceiptPersonLessThanOrEqualTo(String value) {
            addCriterion("receiptPerson <=", value, "receiptPerson");
            return (Criteria) this;
        }

        public Criteria andReceiptPersonLike(String value) {
            addCriterion("receiptPerson like", value, "receiptPerson");
            return (Criteria) this;
        }

        public Criteria andReceiptPersonNotLike(String value) {
            addCriterion("receiptPerson not like", value, "receiptPerson");
            return (Criteria) this;
        }

        public Criteria andReceiptPersonIn(List<String> values) {
            addCriterion("receiptPerson in", values, "receiptPerson");
            return (Criteria) this;
        }

        public Criteria andReceiptPersonNotIn(List<String> values) {
            addCriterion("receiptPerson not in", values, "receiptPerson");
            return (Criteria) this;
        }

        public Criteria andReceiptPersonBetween(String value1, String value2) {
            addCriterion("receiptPerson between", value1, value2, "receiptPerson");
            return (Criteria) this;
        }

        public Criteria andReceiptPersonNotBetween(String value1, String value2) {
            addCriterion("receiptPerson not between", value1, value2, "receiptPerson");
            return (Criteria) this;
        }

        public Criteria andReceiptTelIsNull() {
            addCriterion("receiptTel is null");
            return (Criteria) this;
        }

        public Criteria andReceiptTelIsNotNull() {
            addCriterion("receiptTel is not null");
            return (Criteria) this;
        }

        public Criteria andReceiptTelEqualTo(String value) {
            addCriterion("receiptTel =", value, "receiptTel");
            return (Criteria) this;
        }

        public Criteria andReceiptTelNotEqualTo(String value) {
            addCriterion("receiptTel <>", value, "receiptTel");
            return (Criteria) this;
        }

        public Criteria andReceiptTelGreaterThan(String value) {
            addCriterion("receiptTel >", value, "receiptTel");
            return (Criteria) this;
        }

        public Criteria andReceiptTelGreaterThanOrEqualTo(String value) {
            addCriterion("receiptTel >=", value, "receiptTel");
            return (Criteria) this;
        }

        public Criteria andReceiptTelLessThan(String value) {
            addCriterion("receiptTel <", value, "receiptTel");
            return (Criteria) this;
        }

        public Criteria andReceiptTelLessThanOrEqualTo(String value) {
            addCriterion("receiptTel <=", value, "receiptTel");
            return (Criteria) this;
        }

        public Criteria andReceiptTelLike(String value) {
            addCriterion("receiptTel like", value, "receiptTel");
            return (Criteria) this;
        }

        public Criteria andReceiptTelNotLike(String value) {
            addCriterion("receiptTel not like", value, "receiptTel");
            return (Criteria) this;
        }

        public Criteria andReceiptTelIn(List<String> values) {
            addCriterion("receiptTel in", values, "receiptTel");
            return (Criteria) this;
        }

        public Criteria andReceiptTelNotIn(List<String> values) {
            addCriterion("receiptTel not in", values, "receiptTel");
            return (Criteria) this;
        }

        public Criteria andReceiptTelBetween(String value1, String value2) {
            addCriterion("receiptTel between", value1, value2, "receiptTel");
            return (Criteria) this;
        }

        public Criteria andReceiptTelNotBetween(String value1, String value2) {
            addCriterion("receiptTel not between", value1, value2, "receiptTel");
            return (Criteria) this;
        }

        public Criteria andReceiptCodeIsNull() {
            addCriterion("receiptCode is null");
            return (Criteria) this;
        }

        public Criteria andReceiptCodeIsNotNull() {
            addCriterion("receiptCode is not null");
            return (Criteria) this;
        }

        public Criteria andReceiptCodeEqualTo(String value) {
            addCriterion("receiptCode =", value, "receiptCode");
            return (Criteria) this;
        }

        public Criteria andReceiptCodeNotEqualTo(String value) {
            addCriterion("receiptCode <>", value, "receiptCode");
            return (Criteria) this;
        }

        public Criteria andReceiptCodeGreaterThan(String value) {
            addCriterion("receiptCode >", value, "receiptCode");
            return (Criteria) this;
        }

        public Criteria andReceiptCodeGreaterThanOrEqualTo(String value) {
            addCriterion("receiptCode >=", value, "receiptCode");
            return (Criteria) this;
        }

        public Criteria andReceiptCodeLessThan(String value) {
            addCriterion("receiptCode <", value, "receiptCode");
            return (Criteria) this;
        }

        public Criteria andReceiptCodeLessThanOrEqualTo(String value) {
            addCriterion("receiptCode <=", value, "receiptCode");
            return (Criteria) this;
        }

        public Criteria andReceiptCodeLike(String value) {
            addCriterion("receiptCode like", value, "receiptCode");
            return (Criteria) this;
        }

        public Criteria andReceiptCodeNotLike(String value) {
            addCriterion("receiptCode not like", value, "receiptCode");
            return (Criteria) this;
        }

        public Criteria andReceiptCodeIn(List<String> values) {
            addCriterion("receiptCode in", values, "receiptCode");
            return (Criteria) this;
        }

        public Criteria andReceiptCodeNotIn(List<String> values) {
            addCriterion("receiptCode not in", values, "receiptCode");
            return (Criteria) this;
        }

        public Criteria andReceiptCodeBetween(String value1, String value2) {
            addCriterion("receiptCode between", value1, value2, "receiptCode");
            return (Criteria) this;
        }

        public Criteria andReceiptCodeNotBetween(String value1, String value2) {
            addCriterion("receiptCode not between", value1, value2, "receiptCode");
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