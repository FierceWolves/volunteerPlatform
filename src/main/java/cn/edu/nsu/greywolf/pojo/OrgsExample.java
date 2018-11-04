package cn.edu.nsu.greywolf.pojo;

import java.util.ArrayList;
import java.util.List;

public class OrgsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrgsExample() {
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

        public Criteria andOrgNameIsNull() {
            addCriterion("orgName is null");
            return (Criteria) this;
        }

        public Criteria andOrgNameIsNotNull() {
            addCriterion("orgName is not null");
            return (Criteria) this;
        }

        public Criteria andOrgNameEqualTo(String value) {
            addCriterion("orgName =", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotEqualTo(String value) {
            addCriterion("orgName <>", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameGreaterThan(String value) {
            addCriterion("orgName >", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameGreaterThanOrEqualTo(String value) {
            addCriterion("orgName >=", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameLessThan(String value) {
            addCriterion("orgName <", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameLessThanOrEqualTo(String value) {
            addCriterion("orgName <=", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameLike(String value) {
            addCriterion("orgName like", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotLike(String value) {
            addCriterion("orgName not like", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameIn(List<String> values) {
            addCriterion("orgName in", values, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotIn(List<String> values) {
            addCriterion("orgName not in", values, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameBetween(String value1, String value2) {
            addCriterion("orgName between", value1, value2, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotBetween(String value1, String value2) {
            addCriterion("orgName not between", value1, value2, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgProvinceIsNull() {
            addCriterion("orgProvince is null");
            return (Criteria) this;
        }

        public Criteria andOrgProvinceIsNotNull() {
            addCriterion("orgProvince is not null");
            return (Criteria) this;
        }

        public Criteria andOrgProvinceEqualTo(String value) {
            addCriterion("orgProvince =", value, "orgProvince");
            return (Criteria) this;
        }

        public Criteria andOrgProvinceNotEqualTo(String value) {
            addCriterion("orgProvince <>", value, "orgProvince");
            return (Criteria) this;
        }

        public Criteria andOrgProvinceGreaterThan(String value) {
            addCriterion("orgProvince >", value, "orgProvince");
            return (Criteria) this;
        }

        public Criteria andOrgProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("orgProvince >=", value, "orgProvince");
            return (Criteria) this;
        }

        public Criteria andOrgProvinceLessThan(String value) {
            addCriterion("orgProvince <", value, "orgProvince");
            return (Criteria) this;
        }

        public Criteria andOrgProvinceLessThanOrEqualTo(String value) {
            addCriterion("orgProvince <=", value, "orgProvince");
            return (Criteria) this;
        }

        public Criteria andOrgProvinceLike(String value) {
            addCriterion("orgProvince like", value, "orgProvince");
            return (Criteria) this;
        }

        public Criteria andOrgProvinceNotLike(String value) {
            addCriterion("orgProvince not like", value, "orgProvince");
            return (Criteria) this;
        }

        public Criteria andOrgProvinceIn(List<String> values) {
            addCriterion("orgProvince in", values, "orgProvince");
            return (Criteria) this;
        }

        public Criteria andOrgProvinceNotIn(List<String> values) {
            addCriterion("orgProvince not in", values, "orgProvince");
            return (Criteria) this;
        }

        public Criteria andOrgProvinceBetween(String value1, String value2) {
            addCriterion("orgProvince between", value1, value2, "orgProvince");
            return (Criteria) this;
        }

        public Criteria andOrgProvinceNotBetween(String value1, String value2) {
            addCriterion("orgProvince not between", value1, value2, "orgProvince");
            return (Criteria) this;
        }

        public Criteria andOrgCityIsNull() {
            addCriterion("orgCity is null");
            return (Criteria) this;
        }

        public Criteria andOrgCityIsNotNull() {
            addCriterion("orgCity is not null");
            return (Criteria) this;
        }

        public Criteria andOrgCityEqualTo(String value) {
            addCriterion("orgCity =", value, "orgCity");
            return (Criteria) this;
        }

        public Criteria andOrgCityNotEqualTo(String value) {
            addCriterion("orgCity <>", value, "orgCity");
            return (Criteria) this;
        }

        public Criteria andOrgCityGreaterThan(String value) {
            addCriterion("orgCity >", value, "orgCity");
            return (Criteria) this;
        }

        public Criteria andOrgCityGreaterThanOrEqualTo(String value) {
            addCriterion("orgCity >=", value, "orgCity");
            return (Criteria) this;
        }

        public Criteria andOrgCityLessThan(String value) {
            addCriterion("orgCity <", value, "orgCity");
            return (Criteria) this;
        }

        public Criteria andOrgCityLessThanOrEqualTo(String value) {
            addCriterion("orgCity <=", value, "orgCity");
            return (Criteria) this;
        }

        public Criteria andOrgCityLike(String value) {
            addCriterion("orgCity like", value, "orgCity");
            return (Criteria) this;
        }

        public Criteria andOrgCityNotLike(String value) {
            addCriterion("orgCity not like", value, "orgCity");
            return (Criteria) this;
        }

        public Criteria andOrgCityIn(List<String> values) {
            addCriterion("orgCity in", values, "orgCity");
            return (Criteria) this;
        }

        public Criteria andOrgCityNotIn(List<String> values) {
            addCriterion("orgCity not in", values, "orgCity");
            return (Criteria) this;
        }

        public Criteria andOrgCityBetween(String value1, String value2) {
            addCriterion("orgCity between", value1, value2, "orgCity");
            return (Criteria) this;
        }

        public Criteria andOrgCityNotBetween(String value1, String value2) {
            addCriterion("orgCity not between", value1, value2, "orgCity");
            return (Criteria) this;
        }

        public Criteria andOrgAddressIsNull() {
            addCriterion("orgAddress is null");
            return (Criteria) this;
        }

        public Criteria andOrgAddressIsNotNull() {
            addCriterion("orgAddress is not null");
            return (Criteria) this;
        }

        public Criteria andOrgAddressEqualTo(String value) {
            addCriterion("orgAddress =", value, "orgAddress");
            return (Criteria) this;
        }

        public Criteria andOrgAddressNotEqualTo(String value) {
            addCriterion("orgAddress <>", value, "orgAddress");
            return (Criteria) this;
        }

        public Criteria andOrgAddressGreaterThan(String value) {
            addCriterion("orgAddress >", value, "orgAddress");
            return (Criteria) this;
        }

        public Criteria andOrgAddressGreaterThanOrEqualTo(String value) {
            addCriterion("orgAddress >=", value, "orgAddress");
            return (Criteria) this;
        }

        public Criteria andOrgAddressLessThan(String value) {
            addCriterion("orgAddress <", value, "orgAddress");
            return (Criteria) this;
        }

        public Criteria andOrgAddressLessThanOrEqualTo(String value) {
            addCriterion("orgAddress <=", value, "orgAddress");
            return (Criteria) this;
        }

        public Criteria andOrgAddressLike(String value) {
            addCriterion("orgAddress like", value, "orgAddress");
            return (Criteria) this;
        }

        public Criteria andOrgAddressNotLike(String value) {
            addCriterion("orgAddress not like", value, "orgAddress");
            return (Criteria) this;
        }

        public Criteria andOrgAddressIn(List<String> values) {
            addCriterion("orgAddress in", values, "orgAddress");
            return (Criteria) this;
        }

        public Criteria andOrgAddressNotIn(List<String> values) {
            addCriterion("orgAddress not in", values, "orgAddress");
            return (Criteria) this;
        }

        public Criteria andOrgAddressBetween(String value1, String value2) {
            addCriterion("orgAddress between", value1, value2, "orgAddress");
            return (Criteria) this;
        }

        public Criteria andOrgAddressNotBetween(String value1, String value2) {
            addCriterion("orgAddress not between", value1, value2, "orgAddress");
            return (Criteria) this;
        }

        public Criteria andOrgEmailIsNull() {
            addCriterion("orgEmail is null");
            return (Criteria) this;
        }

        public Criteria andOrgEmailIsNotNull() {
            addCriterion("orgEmail is not null");
            return (Criteria) this;
        }

        public Criteria andOrgEmailEqualTo(String value) {
            addCriterion("orgEmail =", value, "orgEmail");
            return (Criteria) this;
        }

        public Criteria andOrgEmailNotEqualTo(String value) {
            addCriterion("orgEmail <>", value, "orgEmail");
            return (Criteria) this;
        }

        public Criteria andOrgEmailGreaterThan(String value) {
            addCriterion("orgEmail >", value, "orgEmail");
            return (Criteria) this;
        }

        public Criteria andOrgEmailGreaterThanOrEqualTo(String value) {
            addCriterion("orgEmail >=", value, "orgEmail");
            return (Criteria) this;
        }

        public Criteria andOrgEmailLessThan(String value) {
            addCriterion("orgEmail <", value, "orgEmail");
            return (Criteria) this;
        }

        public Criteria andOrgEmailLessThanOrEqualTo(String value) {
            addCriterion("orgEmail <=", value, "orgEmail");
            return (Criteria) this;
        }

        public Criteria andOrgEmailLike(String value) {
            addCriterion("orgEmail like", value, "orgEmail");
            return (Criteria) this;
        }

        public Criteria andOrgEmailNotLike(String value) {
            addCriterion("orgEmail not like", value, "orgEmail");
            return (Criteria) this;
        }

        public Criteria andOrgEmailIn(List<String> values) {
            addCriterion("orgEmail in", values, "orgEmail");
            return (Criteria) this;
        }

        public Criteria andOrgEmailNotIn(List<String> values) {
            addCriterion("orgEmail not in", values, "orgEmail");
            return (Criteria) this;
        }

        public Criteria andOrgEmailBetween(String value1, String value2) {
            addCriterion("orgEmail between", value1, value2, "orgEmail");
            return (Criteria) this;
        }

        public Criteria andOrgEmailNotBetween(String value1, String value2) {
            addCriterion("orgEmail not between", value1, value2, "orgEmail");
            return (Criteria) this;
        }

        public Criteria andPrincipalIsNull() {
            addCriterion("principal is null");
            return (Criteria) this;
        }

        public Criteria andPrincipalIsNotNull() {
            addCriterion("principal is not null");
            return (Criteria) this;
        }

        public Criteria andPrincipalEqualTo(String value) {
            addCriterion("principal =", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalNotEqualTo(String value) {
            addCriterion("principal <>", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalGreaterThan(String value) {
            addCriterion("principal >", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalGreaterThanOrEqualTo(String value) {
            addCriterion("principal >=", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalLessThan(String value) {
            addCriterion("principal <", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalLessThanOrEqualTo(String value) {
            addCriterion("principal <=", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalLike(String value) {
            addCriterion("principal like", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalNotLike(String value) {
            addCriterion("principal not like", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalIn(List<String> values) {
            addCriterion("principal in", values, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalNotIn(List<String> values) {
            addCriterion("principal not in", values, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalBetween(String value1, String value2) {
            addCriterion("principal between", value1, value2, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalNotBetween(String value1, String value2) {
            addCriterion("principal not between", value1, value2, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalTelIsNull() {
            addCriterion("principalTel is null");
            return (Criteria) this;
        }

        public Criteria andPrincipalTelIsNotNull() {
            addCriterion("principalTel is not null");
            return (Criteria) this;
        }

        public Criteria andPrincipalTelEqualTo(String value) {
            addCriterion("principalTel =", value, "principalTel");
            return (Criteria) this;
        }

        public Criteria andPrincipalTelNotEqualTo(String value) {
            addCriterion("principalTel <>", value, "principalTel");
            return (Criteria) this;
        }

        public Criteria andPrincipalTelGreaterThan(String value) {
            addCriterion("principalTel >", value, "principalTel");
            return (Criteria) this;
        }

        public Criteria andPrincipalTelGreaterThanOrEqualTo(String value) {
            addCriterion("principalTel >=", value, "principalTel");
            return (Criteria) this;
        }

        public Criteria andPrincipalTelLessThan(String value) {
            addCriterion("principalTel <", value, "principalTel");
            return (Criteria) this;
        }

        public Criteria andPrincipalTelLessThanOrEqualTo(String value) {
            addCriterion("principalTel <=", value, "principalTel");
            return (Criteria) this;
        }

        public Criteria andPrincipalTelLike(String value) {
            addCriterion("principalTel like", value, "principalTel");
            return (Criteria) this;
        }

        public Criteria andPrincipalTelNotLike(String value) {
            addCriterion("principalTel not like", value, "principalTel");
            return (Criteria) this;
        }

        public Criteria andPrincipalTelIn(List<String> values) {
            addCriterion("principalTel in", values, "principalTel");
            return (Criteria) this;
        }

        public Criteria andPrincipalTelNotIn(List<String> values) {
            addCriterion("principalTel not in", values, "principalTel");
            return (Criteria) this;
        }

        public Criteria andPrincipalTelBetween(String value1, String value2) {
            addCriterion("principalTel between", value1, value2, "principalTel");
            return (Criteria) this;
        }

        public Criteria andPrincipalTelNotBetween(String value1, String value2) {
            addCriterion("principalTel not between", value1, value2, "principalTel");
            return (Criteria) this;
        }

        public Criteria andPrincipalIDNumberIsNull() {
            addCriterion("principalIDNumber is null");
            return (Criteria) this;
        }

        public Criteria andPrincipalIDNumberIsNotNull() {
            addCriterion("principalIDNumber is not null");
            return (Criteria) this;
        }

        public Criteria andPrincipalIDNumberEqualTo(String value) {
            addCriterion("principalIDNumber =", value, "principalIDNumber");
            return (Criteria) this;
        }

        public Criteria andPrincipalIDNumberNotEqualTo(String value) {
            addCriterion("principalIDNumber <>", value, "principalIDNumber");
            return (Criteria) this;
        }

        public Criteria andPrincipalIDNumberGreaterThan(String value) {
            addCriterion("principalIDNumber >", value, "principalIDNumber");
            return (Criteria) this;
        }

        public Criteria andPrincipalIDNumberGreaterThanOrEqualTo(String value) {
            addCriterion("principalIDNumber >=", value, "principalIDNumber");
            return (Criteria) this;
        }

        public Criteria andPrincipalIDNumberLessThan(String value) {
            addCriterion("principalIDNumber <", value, "principalIDNumber");
            return (Criteria) this;
        }

        public Criteria andPrincipalIDNumberLessThanOrEqualTo(String value) {
            addCriterion("principalIDNumber <=", value, "principalIDNumber");
            return (Criteria) this;
        }

        public Criteria andPrincipalIDNumberLike(String value) {
            addCriterion("principalIDNumber like", value, "principalIDNumber");
            return (Criteria) this;
        }

        public Criteria andPrincipalIDNumberNotLike(String value) {
            addCriterion("principalIDNumber not like", value, "principalIDNumber");
            return (Criteria) this;
        }

        public Criteria andPrincipalIDNumberIn(List<String> values) {
            addCriterion("principalIDNumber in", values, "principalIDNumber");
            return (Criteria) this;
        }

        public Criteria andPrincipalIDNumberNotIn(List<String> values) {
            addCriterion("principalIDNumber not in", values, "principalIDNumber");
            return (Criteria) this;
        }

        public Criteria andPrincipalIDNumberBetween(String value1, String value2) {
            addCriterion("principalIDNumber between", value1, value2, "principalIDNumber");
            return (Criteria) this;
        }

        public Criteria andPrincipalIDNumberNotBetween(String value1, String value2) {
            addCriterion("principalIDNumber not between", value1, value2, "principalIDNumber");
            return (Criteria) this;
        }

        public Criteria andOrgTypeIsNull() {
            addCriterion("orgType is null");
            return (Criteria) this;
        }

        public Criteria andOrgTypeIsNotNull() {
            addCriterion("orgType is not null");
            return (Criteria) this;
        }

        public Criteria andOrgTypeEqualTo(Integer value) {
            addCriterion("orgType =", value, "orgType");
            return (Criteria) this;
        }

        public Criteria andOrgTypeNotEqualTo(Integer value) {
            addCriterion("orgType <>", value, "orgType");
            return (Criteria) this;
        }

        public Criteria andOrgTypeGreaterThan(Integer value) {
            addCriterion("orgType >", value, "orgType");
            return (Criteria) this;
        }

        public Criteria andOrgTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("orgType >=", value, "orgType");
            return (Criteria) this;
        }

        public Criteria andOrgTypeLessThan(Integer value) {
            addCriterion("orgType <", value, "orgType");
            return (Criteria) this;
        }

        public Criteria andOrgTypeLessThanOrEqualTo(Integer value) {
            addCriterion("orgType <=", value, "orgType");
            return (Criteria) this;
        }

        public Criteria andOrgTypeIn(List<Integer> values) {
            addCriterion("orgType in", values, "orgType");
            return (Criteria) this;
        }

        public Criteria andOrgTypeNotIn(List<Integer> values) {
            addCriterion("orgType not in", values, "orgType");
            return (Criteria) this;
        }

        public Criteria andOrgTypeBetween(Integer value1, Integer value2) {
            addCriterion("orgType between", value1, value2, "orgType");
            return (Criteria) this;
        }

        public Criteria andOrgTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("orgType not between", value1, value2, "orgType");
            return (Criteria) this;
        }

        public Criteria andOrgLogoIsNull() {
            addCriterion("orgLogo is null");
            return (Criteria) this;
        }

        public Criteria andOrgLogoIsNotNull() {
            addCriterion("orgLogo is not null");
            return (Criteria) this;
        }

        public Criteria andOrgLogoEqualTo(String value) {
            addCriterion("orgLogo =", value, "orgLogo");
            return (Criteria) this;
        }

        public Criteria andOrgLogoNotEqualTo(String value) {
            addCriterion("orgLogo <>", value, "orgLogo");
            return (Criteria) this;
        }

        public Criteria andOrgLogoGreaterThan(String value) {
            addCriterion("orgLogo >", value, "orgLogo");
            return (Criteria) this;
        }

        public Criteria andOrgLogoGreaterThanOrEqualTo(String value) {
            addCriterion("orgLogo >=", value, "orgLogo");
            return (Criteria) this;
        }

        public Criteria andOrgLogoLessThan(String value) {
            addCriterion("orgLogo <", value, "orgLogo");
            return (Criteria) this;
        }

        public Criteria andOrgLogoLessThanOrEqualTo(String value) {
            addCriterion("orgLogo <=", value, "orgLogo");
            return (Criteria) this;
        }

        public Criteria andOrgLogoLike(String value) {
            addCriterion("orgLogo like", value, "orgLogo");
            return (Criteria) this;
        }

        public Criteria andOrgLogoNotLike(String value) {
            addCriterion("orgLogo not like", value, "orgLogo");
            return (Criteria) this;
        }

        public Criteria andOrgLogoIn(List<String> values) {
            addCriterion("orgLogo in", values, "orgLogo");
            return (Criteria) this;
        }

        public Criteria andOrgLogoNotIn(List<String> values) {
            addCriterion("orgLogo not in", values, "orgLogo");
            return (Criteria) this;
        }

        public Criteria andOrgLogoBetween(String value1, String value2) {
            addCriterion("orgLogo between", value1, value2, "orgLogo");
            return (Criteria) this;
        }

        public Criteria andOrgLogoNotBetween(String value1, String value2) {
            addCriterion("orgLogo not between", value1, value2, "orgLogo");
            return (Criteria) this;
        }

        public Criteria andOrgDescriptionIsNull() {
            addCriterion("orgDescription is null");
            return (Criteria) this;
        }

        public Criteria andOrgDescriptionIsNotNull() {
            addCriterion("orgDescription is not null");
            return (Criteria) this;
        }

        public Criteria andOrgDescriptionEqualTo(String value) {
            addCriterion("orgDescription =", value, "orgDescription");
            return (Criteria) this;
        }

        public Criteria andOrgDescriptionNotEqualTo(String value) {
            addCriterion("orgDescription <>", value, "orgDescription");
            return (Criteria) this;
        }

        public Criteria andOrgDescriptionGreaterThan(String value) {
            addCriterion("orgDescription >", value, "orgDescription");
            return (Criteria) this;
        }

        public Criteria andOrgDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("orgDescription >=", value, "orgDescription");
            return (Criteria) this;
        }

        public Criteria andOrgDescriptionLessThan(String value) {
            addCriterion("orgDescription <", value, "orgDescription");
            return (Criteria) this;
        }

        public Criteria andOrgDescriptionLessThanOrEqualTo(String value) {
            addCriterion("orgDescription <=", value, "orgDescription");
            return (Criteria) this;
        }

        public Criteria andOrgDescriptionLike(String value) {
            addCriterion("orgDescription like", value, "orgDescription");
            return (Criteria) this;
        }

        public Criteria andOrgDescriptionNotLike(String value) {
            addCriterion("orgDescription not like", value, "orgDescription");
            return (Criteria) this;
        }

        public Criteria andOrgDescriptionIn(List<String> values) {
            addCriterion("orgDescription in", values, "orgDescription");
            return (Criteria) this;
        }

        public Criteria andOrgDescriptionNotIn(List<String> values) {
            addCriterion("orgDescription not in", values, "orgDescription");
            return (Criteria) this;
        }

        public Criteria andOrgDescriptionBetween(String value1, String value2) {
            addCriterion("orgDescription between", value1, value2, "orgDescription");
            return (Criteria) this;
        }

        public Criteria andOrgDescriptionNotBetween(String value1, String value2) {
            addCriterion("orgDescription not between", value1, value2, "orgDescription");
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