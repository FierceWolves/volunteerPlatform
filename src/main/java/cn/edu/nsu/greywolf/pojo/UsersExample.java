package cn.edu.nsu.greywolf.pojo;

import java.util.ArrayList;
import java.util.List;

public class UsersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UsersExample() {
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

        public Criteria andUserNameIsNull() {
            addCriterion("userName is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("userName is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("userName =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("userName <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("userName >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("userName >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("userName <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("userName <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("userName like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("userName not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("userName in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("userName not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("userName between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("userName not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andUserTelIsNull() {
            addCriterion("userTel is null");
            return (Criteria) this;
        }

        public Criteria andUserTelIsNotNull() {
            addCriterion("userTel is not null");
            return (Criteria) this;
        }

        public Criteria andUserTelEqualTo(String value) {
            addCriterion("userTel =", value, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelNotEqualTo(String value) {
            addCriterion("userTel <>", value, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelGreaterThan(String value) {
            addCriterion("userTel >", value, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelGreaterThanOrEqualTo(String value) {
            addCriterion("userTel >=", value, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelLessThan(String value) {
            addCriterion("userTel <", value, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelLessThanOrEqualTo(String value) {
            addCriterion("userTel <=", value, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelLike(String value) {
            addCriterion("userTel like", value, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelNotLike(String value) {
            addCriterion("userTel not like", value, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelIn(List<String> values) {
            addCriterion("userTel in", values, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelNotIn(List<String> values) {
            addCriterion("userTel not in", values, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelBetween(String value1, String value2) {
            addCriterion("userTel between", value1, value2, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelNotBetween(String value1, String value2) {
            addCriterion("userTel not between", value1, value2, "userTel");
            return (Criteria) this;
        }

        public Criteria andIDNumberTypeIsNull() {
            addCriterion("IDNumberType is null");
            return (Criteria) this;
        }

        public Criteria andIDNumberTypeIsNotNull() {
            addCriterion("IDNumberType is not null");
            return (Criteria) this;
        }

        public Criteria andIDNumberTypeEqualTo(String value) {
            addCriterion("IDNumberType =", value, "IDNumberType");
            return (Criteria) this;
        }

        public Criteria andIDNumberTypeNotEqualTo(String value) {
            addCriterion("IDNumberType <>", value, "IDNumberType");
            return (Criteria) this;
        }

        public Criteria andIDNumberTypeGreaterThan(String value) {
            addCriterion("IDNumberType >", value, "IDNumberType");
            return (Criteria) this;
        }

        public Criteria andIDNumberTypeGreaterThanOrEqualTo(String value) {
            addCriterion("IDNumberType >=", value, "IDNumberType");
            return (Criteria) this;
        }

        public Criteria andIDNumberTypeLessThan(String value) {
            addCriterion("IDNumberType <", value, "IDNumberType");
            return (Criteria) this;
        }

        public Criteria andIDNumberTypeLessThanOrEqualTo(String value) {
            addCriterion("IDNumberType <=", value, "IDNumberType");
            return (Criteria) this;
        }

        public Criteria andIDNumberTypeLike(String value) {
            addCriterion("IDNumberType like", value, "IDNumberType");
            return (Criteria) this;
        }

        public Criteria andIDNumberTypeNotLike(String value) {
            addCriterion("IDNumberType not like", value, "IDNumberType");
            return (Criteria) this;
        }

        public Criteria andIDNumberTypeIn(List<String> values) {
            addCriterion("IDNumberType in", values, "IDNumberType");
            return (Criteria) this;
        }

        public Criteria andIDNumberTypeNotIn(List<String> values) {
            addCriterion("IDNumberType not in", values, "IDNumberType");
            return (Criteria) this;
        }

        public Criteria andIDNumberTypeBetween(String value1, String value2) {
            addCriterion("IDNumberType between", value1, value2, "IDNumberType");
            return (Criteria) this;
        }

        public Criteria andIDNumberTypeNotBetween(String value1, String value2) {
            addCriterion("IDNumberType not between", value1, value2, "IDNumberType");
            return (Criteria) this;
        }

        public Criteria andIDNumberIsNull() {
            addCriterion("IDNumber is null");
            return (Criteria) this;
        }

        public Criteria andIDNumberIsNotNull() {
            addCriterion("IDNumber is not null");
            return (Criteria) this;
        }

        public Criteria andIDNumberEqualTo(String value) {
            addCriterion("IDNumber =", value, "IDNumber");
            return (Criteria) this;
        }

        public Criteria andIDNumberNotEqualTo(String value) {
            addCriterion("IDNumber <>", value, "IDNumber");
            return (Criteria) this;
        }

        public Criteria andIDNumberGreaterThan(String value) {
            addCriterion("IDNumber >", value, "IDNumber");
            return (Criteria) this;
        }

        public Criteria andIDNumberGreaterThanOrEqualTo(String value) {
            addCriterion("IDNumber >=", value, "IDNumber");
            return (Criteria) this;
        }

        public Criteria andIDNumberLessThan(String value) {
            addCriterion("IDNumber <", value, "IDNumber");
            return (Criteria) this;
        }

        public Criteria andIDNumberLessThanOrEqualTo(String value) {
            addCriterion("IDNumber <=", value, "IDNumber");
            return (Criteria) this;
        }

        public Criteria andIDNumberLike(String value) {
            addCriterion("IDNumber like", value, "IDNumber");
            return (Criteria) this;
        }

        public Criteria andIDNumberNotLike(String value) {
            addCriterion("IDNumber not like", value, "IDNumber");
            return (Criteria) this;
        }

        public Criteria andIDNumberIn(List<String> values) {
            addCriterion("IDNumber in", values, "IDNumber");
            return (Criteria) this;
        }

        public Criteria andIDNumberNotIn(List<String> values) {
            addCriterion("IDNumber not in", values, "IDNumber");
            return (Criteria) this;
        }

        public Criteria andIDNumberBetween(String value1, String value2) {
            addCriterion("IDNumber between", value1, value2, "IDNumber");
            return (Criteria) this;
        }

        public Criteria andIDNumberNotBetween(String value1, String value2) {
            addCriterion("IDNumber not between", value1, value2, "IDNumber");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andNationIsNull() {
            addCriterion("nation is null");
            return (Criteria) this;
        }

        public Criteria andNationIsNotNull() {
            addCriterion("nation is not null");
            return (Criteria) this;
        }

        public Criteria andNationEqualTo(String value) {
            addCriterion("nation =", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotEqualTo(String value) {
            addCriterion("nation <>", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThan(String value) {
            addCriterion("nation >", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThanOrEqualTo(String value) {
            addCriterion("nation >=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThan(String value) {
            addCriterion("nation <", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThanOrEqualTo(String value) {
            addCriterion("nation <=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLike(String value) {
            addCriterion("nation like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotLike(String value) {
            addCriterion("nation not like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationIn(List<String> values) {
            addCriterion("nation in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotIn(List<String> values) {
            addCriterion("nation not in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationBetween(String value1, String value2) {
            addCriterion("nation between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotBetween(String value1, String value2) {
            addCriterion("nation not between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andNativePlaceIsNull() {
            addCriterion("nativePlace is null");
            return (Criteria) this;
        }

        public Criteria andNativePlaceIsNotNull() {
            addCriterion("nativePlace is not null");
            return (Criteria) this;
        }

        public Criteria andNativePlaceEqualTo(String value) {
            addCriterion("nativePlace =", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceNotEqualTo(String value) {
            addCriterion("nativePlace <>", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceGreaterThan(String value) {
            addCriterion("nativePlace >", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceGreaterThanOrEqualTo(String value) {
            addCriterion("nativePlace >=", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceLessThan(String value) {
            addCriterion("nativePlace <", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceLessThanOrEqualTo(String value) {
            addCriterion("nativePlace <=", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceLike(String value) {
            addCriterion("nativePlace like", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceNotLike(String value) {
            addCriterion("nativePlace not like", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceIn(List<String> values) {
            addCriterion("nativePlace in", values, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceNotIn(List<String> values) {
            addCriterion("nativePlace not in", values, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceBetween(String value1, String value2) {
            addCriterion("nativePlace between", value1, value2, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceNotBetween(String value1, String value2) {
            addCriterion("nativePlace not between", value1, value2, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andUserEmailIsNull() {
            addCriterion("userEmail is null");
            return (Criteria) this;
        }

        public Criteria andUserEmailIsNotNull() {
            addCriterion("userEmail is not null");
            return (Criteria) this;
        }

        public Criteria andUserEmailEqualTo(String value) {
            addCriterion("userEmail =", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotEqualTo(String value) {
            addCriterion("userEmail <>", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailGreaterThan(String value) {
            addCriterion("userEmail >", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailGreaterThanOrEqualTo(String value) {
            addCriterion("userEmail >=", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLessThan(String value) {
            addCriterion("userEmail <", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLessThanOrEqualTo(String value) {
            addCriterion("userEmail <=", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLike(String value) {
            addCriterion("userEmail like", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotLike(String value) {
            addCriterion("userEmail not like", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailIn(List<String> values) {
            addCriterion("userEmail in", values, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotIn(List<String> values) {
            addCriterion("userEmail not in", values, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailBetween(String value1, String value2) {
            addCriterion("userEmail between", value1, value2, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotBetween(String value1, String value2) {
            addCriterion("userEmail not between", value1, value2, "userEmail");
            return (Criteria) this;
        }

        public Criteria andRegistPlaceIsNull() {
            addCriterion("registPlace is null");
            return (Criteria) this;
        }

        public Criteria andRegistPlaceIsNotNull() {
            addCriterion("registPlace is not null");
            return (Criteria) this;
        }

        public Criteria andRegistPlaceEqualTo(String value) {
            addCriterion("registPlace =", value, "registPlace");
            return (Criteria) this;
        }

        public Criteria andRegistPlaceNotEqualTo(String value) {
            addCriterion("registPlace <>", value, "registPlace");
            return (Criteria) this;
        }

        public Criteria andRegistPlaceGreaterThan(String value) {
            addCriterion("registPlace >", value, "registPlace");
            return (Criteria) this;
        }

        public Criteria andRegistPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("registPlace >=", value, "registPlace");
            return (Criteria) this;
        }

        public Criteria andRegistPlaceLessThan(String value) {
            addCriterion("registPlace <", value, "registPlace");
            return (Criteria) this;
        }

        public Criteria andRegistPlaceLessThanOrEqualTo(String value) {
            addCriterion("registPlace <=", value, "registPlace");
            return (Criteria) this;
        }

        public Criteria andRegistPlaceLike(String value) {
            addCriterion("registPlace like", value, "registPlace");
            return (Criteria) this;
        }

        public Criteria andRegistPlaceNotLike(String value) {
            addCriterion("registPlace not like", value, "registPlace");
            return (Criteria) this;
        }

        public Criteria andRegistPlaceIn(List<String> values) {
            addCriterion("registPlace in", values, "registPlace");
            return (Criteria) this;
        }

        public Criteria andRegistPlaceNotIn(List<String> values) {
            addCriterion("registPlace not in", values, "registPlace");
            return (Criteria) this;
        }

        public Criteria andRegistPlaceBetween(String value1, String value2) {
            addCriterion("registPlace between", value1, value2, "registPlace");
            return (Criteria) this;
        }

        public Criteria andRegistPlaceNotBetween(String value1, String value2) {
            addCriterion("registPlace not between", value1, value2, "registPlace");
            return (Criteria) this;
        }

        public Criteria andUserAddressIsNull() {
            addCriterion("userAddress is null");
            return (Criteria) this;
        }

        public Criteria andUserAddressIsNotNull() {
            addCriterion("userAddress is not null");
            return (Criteria) this;
        }

        public Criteria andUserAddressEqualTo(String value) {
            addCriterion("userAddress =", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressNotEqualTo(String value) {
            addCriterion("userAddress <>", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressGreaterThan(String value) {
            addCriterion("userAddress >", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressGreaterThanOrEqualTo(String value) {
            addCriterion("userAddress >=", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressLessThan(String value) {
            addCriterion("userAddress <", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressLessThanOrEqualTo(String value) {
            addCriterion("userAddress <=", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressLike(String value) {
            addCriterion("userAddress like", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressNotLike(String value) {
            addCriterion("userAddress not like", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressIn(List<String> values) {
            addCriterion("userAddress in", values, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressNotIn(List<String> values) {
            addCriterion("userAddress not in", values, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressBetween(String value1, String value2) {
            addCriterion("userAddress between", value1, value2, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressNotBetween(String value1, String value2) {
            addCriterion("userAddress not between", value1, value2, "userAddress");
            return (Criteria) this;
        }

        public Criteria andWorkStatusIsNull() {
            addCriterion("workStatus is null");
            return (Criteria) this;
        }

        public Criteria andWorkStatusIsNotNull() {
            addCriterion("workStatus is not null");
            return (Criteria) this;
        }

        public Criteria andWorkStatusEqualTo(String value) {
            addCriterion("workStatus =", value, "workStatus");
            return (Criteria) this;
        }

        public Criteria andWorkStatusNotEqualTo(String value) {
            addCriterion("workStatus <>", value, "workStatus");
            return (Criteria) this;
        }

        public Criteria andWorkStatusGreaterThan(String value) {
            addCriterion("workStatus >", value, "workStatus");
            return (Criteria) this;
        }

        public Criteria andWorkStatusGreaterThanOrEqualTo(String value) {
            addCriterion("workStatus >=", value, "workStatus");
            return (Criteria) this;
        }

        public Criteria andWorkStatusLessThan(String value) {
            addCriterion("workStatus <", value, "workStatus");
            return (Criteria) this;
        }

        public Criteria andWorkStatusLessThanOrEqualTo(String value) {
            addCriterion("workStatus <=", value, "workStatus");
            return (Criteria) this;
        }

        public Criteria andWorkStatusLike(String value) {
            addCriterion("workStatus like", value, "workStatus");
            return (Criteria) this;
        }

        public Criteria andWorkStatusNotLike(String value) {
            addCriterion("workStatus not like", value, "workStatus");
            return (Criteria) this;
        }

        public Criteria andWorkStatusIn(List<String> values) {
            addCriterion("workStatus in", values, "workStatus");
            return (Criteria) this;
        }

        public Criteria andWorkStatusNotIn(List<String> values) {
            addCriterion("workStatus not in", values, "workStatus");
            return (Criteria) this;
        }

        public Criteria andWorkStatusBetween(String value1, String value2) {
            addCriterion("workStatus between", value1, value2, "workStatus");
            return (Criteria) this;
        }

        public Criteria andWorkStatusNotBetween(String value1, String value2) {
            addCriterion("workStatus not between", value1, value2, "workStatus");
            return (Criteria) this;
        }

        public Criteria andHighestEducationIsNull() {
            addCriterion("highestEducation is null");
            return (Criteria) this;
        }

        public Criteria andHighestEducationIsNotNull() {
            addCriterion("highestEducation is not null");
            return (Criteria) this;
        }

        public Criteria andHighestEducationEqualTo(String value) {
            addCriterion("highestEducation =", value, "highestEducation");
            return (Criteria) this;
        }

        public Criteria andHighestEducationNotEqualTo(String value) {
            addCriterion("highestEducation <>", value, "highestEducation");
            return (Criteria) this;
        }

        public Criteria andHighestEducationGreaterThan(String value) {
            addCriterion("highestEducation >", value, "highestEducation");
            return (Criteria) this;
        }

        public Criteria andHighestEducationGreaterThanOrEqualTo(String value) {
            addCriterion("highestEducation >=", value, "highestEducation");
            return (Criteria) this;
        }

        public Criteria andHighestEducationLessThan(String value) {
            addCriterion("highestEducation <", value, "highestEducation");
            return (Criteria) this;
        }

        public Criteria andHighestEducationLessThanOrEqualTo(String value) {
            addCriterion("highestEducation <=", value, "highestEducation");
            return (Criteria) this;
        }

        public Criteria andHighestEducationLike(String value) {
            addCriterion("highestEducation like", value, "highestEducation");
            return (Criteria) this;
        }

        public Criteria andHighestEducationNotLike(String value) {
            addCriterion("highestEducation not like", value, "highestEducation");
            return (Criteria) this;
        }

        public Criteria andHighestEducationIn(List<String> values) {
            addCriterion("highestEducation in", values, "highestEducation");
            return (Criteria) this;
        }

        public Criteria andHighestEducationNotIn(List<String> values) {
            addCriterion("highestEducation not in", values, "highestEducation");
            return (Criteria) this;
        }

        public Criteria andHighestEducationBetween(String value1, String value2) {
            addCriterion("highestEducation between", value1, value2, "highestEducation");
            return (Criteria) this;
        }

        public Criteria andHighestEducationNotBetween(String value1, String value2) {
            addCriterion("highestEducation not between", value1, value2, "highestEducation");
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