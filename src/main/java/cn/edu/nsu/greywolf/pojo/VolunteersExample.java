package cn.edu.nsu.greywolf.pojo;

import java.util.ArrayList;
import java.util.List;

public class VolunteersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VolunteersExample() {
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

        public Criteria andVolunteerPhotoIsNull() {
            addCriterion("volunteerPhoto is null");
            return (Criteria) this;
        }

        public Criteria andVolunteerPhotoIsNotNull() {
            addCriterion("volunteerPhoto is not null");
            return (Criteria) this;
        }

        public Criteria andVolunteerPhotoEqualTo(String value) {
            addCriterion("volunteerPhoto =", value, "volunteerPhoto");
            return (Criteria) this;
        }

        public Criteria andVolunteerPhotoNotEqualTo(String value) {
            addCriterion("volunteerPhoto <>", value, "volunteerPhoto");
            return (Criteria) this;
        }

        public Criteria andVolunteerPhotoGreaterThan(String value) {
            addCriterion("volunteerPhoto >", value, "volunteerPhoto");
            return (Criteria) this;
        }

        public Criteria andVolunteerPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("volunteerPhoto >=", value, "volunteerPhoto");
            return (Criteria) this;
        }

        public Criteria andVolunteerPhotoLessThan(String value) {
            addCriterion("volunteerPhoto <", value, "volunteerPhoto");
            return (Criteria) this;
        }

        public Criteria andVolunteerPhotoLessThanOrEqualTo(String value) {
            addCriterion("volunteerPhoto <=", value, "volunteerPhoto");
            return (Criteria) this;
        }

        public Criteria andVolunteerPhotoLike(String value) {
            addCriterion("volunteerPhoto like", value, "volunteerPhoto");
            return (Criteria) this;
        }

        public Criteria andVolunteerPhotoNotLike(String value) {
            addCriterion("volunteerPhoto not like", value, "volunteerPhoto");
            return (Criteria) this;
        }

        public Criteria andVolunteerPhotoIn(List<String> values) {
            addCriterion("volunteerPhoto in", values, "volunteerPhoto");
            return (Criteria) this;
        }

        public Criteria andVolunteerPhotoNotIn(List<String> values) {
            addCriterion("volunteerPhoto not in", values, "volunteerPhoto");
            return (Criteria) this;
        }

        public Criteria andVolunteerPhotoBetween(String value1, String value2) {
            addCriterion("volunteerPhoto between", value1, value2, "volunteerPhoto");
            return (Criteria) this;
        }

        public Criteria andVolunteerPhotoNotBetween(String value1, String value2) {
            addCriterion("volunteerPhoto not between", value1, value2, "volunteerPhoto");
            return (Criteria) this;
        }

        public Criteria andGuardianNameIsNull() {
            addCriterion("guardianName is null");
            return (Criteria) this;
        }

        public Criteria andGuardianNameIsNotNull() {
            addCriterion("guardianName is not null");
            return (Criteria) this;
        }

        public Criteria andGuardianNameEqualTo(String value) {
            addCriterion("guardianName =", value, "guardianName");
            return (Criteria) this;
        }

        public Criteria andGuardianNameNotEqualTo(String value) {
            addCriterion("guardianName <>", value, "guardianName");
            return (Criteria) this;
        }

        public Criteria andGuardianNameGreaterThan(String value) {
            addCriterion("guardianName >", value, "guardianName");
            return (Criteria) this;
        }

        public Criteria andGuardianNameGreaterThanOrEqualTo(String value) {
            addCriterion("guardianName >=", value, "guardianName");
            return (Criteria) this;
        }

        public Criteria andGuardianNameLessThan(String value) {
            addCriterion("guardianName <", value, "guardianName");
            return (Criteria) this;
        }

        public Criteria andGuardianNameLessThanOrEqualTo(String value) {
            addCriterion("guardianName <=", value, "guardianName");
            return (Criteria) this;
        }

        public Criteria andGuardianNameLike(String value) {
            addCriterion("guardianName like", value, "guardianName");
            return (Criteria) this;
        }

        public Criteria andGuardianNameNotLike(String value) {
            addCriterion("guardianName not like", value, "guardianName");
            return (Criteria) this;
        }

        public Criteria andGuardianNameIn(List<String> values) {
            addCriterion("guardianName in", values, "guardianName");
            return (Criteria) this;
        }

        public Criteria andGuardianNameNotIn(List<String> values) {
            addCriterion("guardianName not in", values, "guardianName");
            return (Criteria) this;
        }

        public Criteria andGuardianNameBetween(String value1, String value2) {
            addCriterion("guardianName between", value1, value2, "guardianName");
            return (Criteria) this;
        }

        public Criteria andGuardianNameNotBetween(String value1, String value2) {
            addCriterion("guardianName not between", value1, value2, "guardianName");
            return (Criteria) this;
        }

        public Criteria andGuardianTelIsNull() {
            addCriterion("guardianTel is null");
            return (Criteria) this;
        }

        public Criteria andGuardianTelIsNotNull() {
            addCriterion("guardianTel is not null");
            return (Criteria) this;
        }

        public Criteria andGuardianTelEqualTo(String value) {
            addCriterion("guardianTel =", value, "guardianTel");
            return (Criteria) this;
        }

        public Criteria andGuardianTelNotEqualTo(String value) {
            addCriterion("guardianTel <>", value, "guardianTel");
            return (Criteria) this;
        }

        public Criteria andGuardianTelGreaterThan(String value) {
            addCriterion("guardianTel >", value, "guardianTel");
            return (Criteria) this;
        }

        public Criteria andGuardianTelGreaterThanOrEqualTo(String value) {
            addCriterion("guardianTel >=", value, "guardianTel");
            return (Criteria) this;
        }

        public Criteria andGuardianTelLessThan(String value) {
            addCriterion("guardianTel <", value, "guardianTel");
            return (Criteria) this;
        }

        public Criteria andGuardianTelLessThanOrEqualTo(String value) {
            addCriterion("guardianTel <=", value, "guardianTel");
            return (Criteria) this;
        }

        public Criteria andGuardianTelLike(String value) {
            addCriterion("guardianTel like", value, "guardianTel");
            return (Criteria) this;
        }

        public Criteria andGuardianTelNotLike(String value) {
            addCriterion("guardianTel not like", value, "guardianTel");
            return (Criteria) this;
        }

        public Criteria andGuardianTelIn(List<String> values) {
            addCriterion("guardianTel in", values, "guardianTel");
            return (Criteria) this;
        }

        public Criteria andGuardianTelNotIn(List<String> values) {
            addCriterion("guardianTel not in", values, "guardianTel");
            return (Criteria) this;
        }

        public Criteria andGuardianTelBetween(String value1, String value2) {
            addCriterion("guardianTel between", value1, value2, "guardianTel");
            return (Criteria) this;
        }

        public Criteria andGuardianTelNotBetween(String value1, String value2) {
            addCriterion("guardianTel not between", value1, value2, "guardianTel");
            return (Criteria) this;
        }

        public Criteria andGuardianIDNumberIsNull() {
            addCriterion("guardianIDNumber is null");
            return (Criteria) this;
        }

        public Criteria andGuardianIDNumberIsNotNull() {
            addCriterion("guardianIDNumber is not null");
            return (Criteria) this;
        }

        public Criteria andGuardianIDNumberEqualTo(String value) {
            addCriterion("guardianIDNumber =", value, "guardianIDNumber");
            return (Criteria) this;
        }

        public Criteria andGuardianIDNumberNotEqualTo(String value) {
            addCriterion("guardianIDNumber <>", value, "guardianIDNumber");
            return (Criteria) this;
        }

        public Criteria andGuardianIDNumberGreaterThan(String value) {
            addCriterion("guardianIDNumber >", value, "guardianIDNumber");
            return (Criteria) this;
        }

        public Criteria andGuardianIDNumberGreaterThanOrEqualTo(String value) {
            addCriterion("guardianIDNumber >=", value, "guardianIDNumber");
            return (Criteria) this;
        }

        public Criteria andGuardianIDNumberLessThan(String value) {
            addCriterion("guardianIDNumber <", value, "guardianIDNumber");
            return (Criteria) this;
        }

        public Criteria andGuardianIDNumberLessThanOrEqualTo(String value) {
            addCriterion("guardianIDNumber <=", value, "guardianIDNumber");
            return (Criteria) this;
        }

        public Criteria andGuardianIDNumberLike(String value) {
            addCriterion("guardianIDNumber like", value, "guardianIDNumber");
            return (Criteria) this;
        }

        public Criteria andGuardianIDNumberNotLike(String value) {
            addCriterion("guardianIDNumber not like", value, "guardianIDNumber");
            return (Criteria) this;
        }

        public Criteria andGuardianIDNumberIn(List<String> values) {
            addCriterion("guardianIDNumber in", values, "guardianIDNumber");
            return (Criteria) this;
        }

        public Criteria andGuardianIDNumberNotIn(List<String> values) {
            addCriterion("guardianIDNumber not in", values, "guardianIDNumber");
            return (Criteria) this;
        }

        public Criteria andGuardianIDNumberBetween(String value1, String value2) {
            addCriterion("guardianIDNumber between", value1, value2, "guardianIDNumber");
            return (Criteria) this;
        }

        public Criteria andGuardianIDNumberNotBetween(String value1, String value2) {
            addCriterion("guardianIDNumber not between", value1, value2, "guardianIDNumber");
            return (Criteria) this;
        }

        public Criteria andPoliticsStatusIsNull() {
            addCriterion("politicsStatus is null");
            return (Criteria) this;
        }

        public Criteria andPoliticsStatusIsNotNull() {
            addCriterion("politicsStatus is not null");
            return (Criteria) this;
        }

        public Criteria andPoliticsStatusEqualTo(String value) {
            addCriterion("politicsStatus =", value, "politicsStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticsStatusNotEqualTo(String value) {
            addCriterion("politicsStatus <>", value, "politicsStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticsStatusGreaterThan(String value) {
            addCriterion("politicsStatus >", value, "politicsStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticsStatusGreaterThanOrEqualTo(String value) {
            addCriterion("politicsStatus >=", value, "politicsStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticsStatusLessThan(String value) {
            addCriterion("politicsStatus <", value, "politicsStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticsStatusLessThanOrEqualTo(String value) {
            addCriterion("politicsStatus <=", value, "politicsStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticsStatusLike(String value) {
            addCriterion("politicsStatus like", value, "politicsStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticsStatusNotLike(String value) {
            addCriterion("politicsStatus not like", value, "politicsStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticsStatusIn(List<String> values) {
            addCriterion("politicsStatus in", values, "politicsStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticsStatusNotIn(List<String> values) {
            addCriterion("politicsStatus not in", values, "politicsStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticsStatusBetween(String value1, String value2) {
            addCriterion("politicsStatus between", value1, value2, "politicsStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticsStatusNotBetween(String value1, String value2) {
            addCriterion("politicsStatus not between", value1, value2, "politicsStatus");
            return (Criteria) this;
        }

        public Criteria andPayPasswordIsNull() {
            addCriterion("payPassword is null");
            return (Criteria) this;
        }

        public Criteria andPayPasswordIsNotNull() {
            addCriterion("payPassword is not null");
            return (Criteria) this;
        }

        public Criteria andPayPasswordEqualTo(String value) {
            addCriterion("payPassword =", value, "payPassword");
            return (Criteria) this;
        }

        public Criteria andPayPasswordNotEqualTo(String value) {
            addCriterion("payPassword <>", value, "payPassword");
            return (Criteria) this;
        }

        public Criteria andPayPasswordGreaterThan(String value) {
            addCriterion("payPassword >", value, "payPassword");
            return (Criteria) this;
        }

        public Criteria andPayPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("payPassword >=", value, "payPassword");
            return (Criteria) this;
        }

        public Criteria andPayPasswordLessThan(String value) {
            addCriterion("payPassword <", value, "payPassword");
            return (Criteria) this;
        }

        public Criteria andPayPasswordLessThanOrEqualTo(String value) {
            addCriterion("payPassword <=", value, "payPassword");
            return (Criteria) this;
        }

        public Criteria andPayPasswordLike(String value) {
            addCriterion("payPassword like", value, "payPassword");
            return (Criteria) this;
        }

        public Criteria andPayPasswordNotLike(String value) {
            addCriterion("payPassword not like", value, "payPassword");
            return (Criteria) this;
        }

        public Criteria andPayPasswordIn(List<String> values) {
            addCriterion("payPassword in", values, "payPassword");
            return (Criteria) this;
        }

        public Criteria andPayPasswordNotIn(List<String> values) {
            addCriterion("payPassword not in", values, "payPassword");
            return (Criteria) this;
        }

        public Criteria andPayPasswordBetween(String value1, String value2) {
            addCriterion("payPassword between", value1, value2, "payPassword");
            return (Criteria) this;
        }

        public Criteria andPayPasswordNotBetween(String value1, String value2) {
            addCriterion("payPassword not between", value1, value2, "payPassword");
            return (Criteria) this;
        }

        public Criteria andStudyStatusIsNull() {
            addCriterion("studyStatus is null");
            return (Criteria) this;
        }

        public Criteria andStudyStatusIsNotNull() {
            addCriterion("studyStatus is not null");
            return (Criteria) this;
        }

        public Criteria andStudyStatusEqualTo(String value) {
            addCriterion("studyStatus =", value, "studyStatus");
            return (Criteria) this;
        }

        public Criteria andStudyStatusNotEqualTo(String value) {
            addCriterion("studyStatus <>", value, "studyStatus");
            return (Criteria) this;
        }

        public Criteria andStudyStatusGreaterThan(String value) {
            addCriterion("studyStatus >", value, "studyStatus");
            return (Criteria) this;
        }

        public Criteria andStudyStatusGreaterThanOrEqualTo(String value) {
            addCriterion("studyStatus >=", value, "studyStatus");
            return (Criteria) this;
        }

        public Criteria andStudyStatusLessThan(String value) {
            addCriterion("studyStatus <", value, "studyStatus");
            return (Criteria) this;
        }

        public Criteria andStudyStatusLessThanOrEqualTo(String value) {
            addCriterion("studyStatus <=", value, "studyStatus");
            return (Criteria) this;
        }

        public Criteria andStudyStatusLike(String value) {
            addCriterion("studyStatus like", value, "studyStatus");
            return (Criteria) this;
        }

        public Criteria andStudyStatusNotLike(String value) {
            addCriterion("studyStatus not like", value, "studyStatus");
            return (Criteria) this;
        }

        public Criteria andStudyStatusIn(List<String> values) {
            addCriterion("studyStatus in", values, "studyStatus");
            return (Criteria) this;
        }

        public Criteria andStudyStatusNotIn(List<String> values) {
            addCriterion("studyStatus not in", values, "studyStatus");
            return (Criteria) this;
        }

        public Criteria andStudyStatusBetween(String value1, String value2) {
            addCriterion("studyStatus between", value1, value2, "studyStatus");
            return (Criteria) this;
        }

        public Criteria andStudyStatusNotBetween(String value1, String value2) {
            addCriterion("studyStatus not between", value1, value2, "studyStatus");
            return (Criteria) this;
        }

        public Criteria andSchoolIsNull() {
            addCriterion("school is null");
            return (Criteria) this;
        }

        public Criteria andSchoolIsNotNull() {
            addCriterion("school is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolEqualTo(String value) {
            addCriterion("school =", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotEqualTo(String value) {
            addCriterion("school <>", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolGreaterThan(String value) {
            addCriterion("school >", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolGreaterThanOrEqualTo(String value) {
            addCriterion("school >=", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLessThan(String value) {
            addCriterion("school <", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLessThanOrEqualTo(String value) {
            addCriterion("school <=", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLike(String value) {
            addCriterion("school like", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotLike(String value) {
            addCriterion("school not like", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolIn(List<String> values) {
            addCriterion("school in", values, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotIn(List<String> values) {
            addCriterion("school not in", values, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolBetween(String value1, String value2) {
            addCriterion("school between", value1, value2, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotBetween(String value1, String value2) {
            addCriterion("school not between", value1, value2, "school");
            return (Criteria) this;
        }

        public Criteria andStudentNumberIsNull() {
            addCriterion("studentNumber is null");
            return (Criteria) this;
        }

        public Criteria andStudentNumberIsNotNull() {
            addCriterion("studentNumber is not null");
            return (Criteria) this;
        }

        public Criteria andStudentNumberEqualTo(String value) {
            addCriterion("studentNumber =", value, "studentNumber");
            return (Criteria) this;
        }

        public Criteria andStudentNumberNotEqualTo(String value) {
            addCriterion("studentNumber <>", value, "studentNumber");
            return (Criteria) this;
        }

        public Criteria andStudentNumberGreaterThan(String value) {
            addCriterion("studentNumber >", value, "studentNumber");
            return (Criteria) this;
        }

        public Criteria andStudentNumberGreaterThanOrEqualTo(String value) {
            addCriterion("studentNumber >=", value, "studentNumber");
            return (Criteria) this;
        }

        public Criteria andStudentNumberLessThan(String value) {
            addCriterion("studentNumber <", value, "studentNumber");
            return (Criteria) this;
        }

        public Criteria andStudentNumberLessThanOrEqualTo(String value) {
            addCriterion("studentNumber <=", value, "studentNumber");
            return (Criteria) this;
        }

        public Criteria andStudentNumberLike(String value) {
            addCriterion("studentNumber like", value, "studentNumber");
            return (Criteria) this;
        }

        public Criteria andStudentNumberNotLike(String value) {
            addCriterion("studentNumber not like", value, "studentNumber");
            return (Criteria) this;
        }

        public Criteria andStudentNumberIn(List<String> values) {
            addCriterion("studentNumber in", values, "studentNumber");
            return (Criteria) this;
        }

        public Criteria andStudentNumberNotIn(List<String> values) {
            addCriterion("studentNumber not in", values, "studentNumber");
            return (Criteria) this;
        }

        public Criteria andStudentNumberBetween(String value1, String value2) {
            addCriterion("studentNumber between", value1, value2, "studentNumber");
            return (Criteria) this;
        }

        public Criteria andStudentNumberNotBetween(String value1, String value2) {
            addCriterion("studentNumber not between", value1, value2, "studentNumber");
            return (Criteria) this;
        }

        public Criteria andSkillIsNull() {
            addCriterion("skill is null");
            return (Criteria) this;
        }

        public Criteria andSkillIsNotNull() {
            addCriterion("skill is not null");
            return (Criteria) this;
        }

        public Criteria andSkillEqualTo(String value) {
            addCriterion("skill =", value, "skill");
            return (Criteria) this;
        }

        public Criteria andSkillNotEqualTo(String value) {
            addCriterion("skill <>", value, "skill");
            return (Criteria) this;
        }

        public Criteria andSkillGreaterThan(String value) {
            addCriterion("skill >", value, "skill");
            return (Criteria) this;
        }

        public Criteria andSkillGreaterThanOrEqualTo(String value) {
            addCriterion("skill >=", value, "skill");
            return (Criteria) this;
        }

        public Criteria andSkillLessThan(String value) {
            addCriterion("skill <", value, "skill");
            return (Criteria) this;
        }

        public Criteria andSkillLessThanOrEqualTo(String value) {
            addCriterion("skill <=", value, "skill");
            return (Criteria) this;
        }

        public Criteria andSkillLike(String value) {
            addCriterion("skill like", value, "skill");
            return (Criteria) this;
        }

        public Criteria andSkillNotLike(String value) {
            addCriterion("skill not like", value, "skill");
            return (Criteria) this;
        }

        public Criteria andSkillIn(List<String> values) {
            addCriterion("skill in", values, "skill");
            return (Criteria) this;
        }

        public Criteria andSkillNotIn(List<String> values) {
            addCriterion("skill not in", values, "skill");
            return (Criteria) this;
        }

        public Criteria andSkillBetween(String value1, String value2) {
            addCriterion("skill between", value1, value2, "skill");
            return (Criteria) this;
        }

        public Criteria andSkillNotBetween(String value1, String value2) {
            addCriterion("skill not between", value1, value2, "skill");
            return (Criteria) this;
        }

        public Criteria andServiceRangeIsNull() {
            addCriterion("serviceRange is null");
            return (Criteria) this;
        }

        public Criteria andServiceRangeIsNotNull() {
            addCriterion("serviceRange is not null");
            return (Criteria) this;
        }

        public Criteria andServiceRangeEqualTo(String value) {
            addCriterion("serviceRange =", value, "serviceRange");
            return (Criteria) this;
        }

        public Criteria andServiceRangeNotEqualTo(String value) {
            addCriterion("serviceRange <>", value, "serviceRange");
            return (Criteria) this;
        }

        public Criteria andServiceRangeGreaterThan(String value) {
            addCriterion("serviceRange >", value, "serviceRange");
            return (Criteria) this;
        }

        public Criteria andServiceRangeGreaterThanOrEqualTo(String value) {
            addCriterion("serviceRange >=", value, "serviceRange");
            return (Criteria) this;
        }

        public Criteria andServiceRangeLessThan(String value) {
            addCriterion("serviceRange <", value, "serviceRange");
            return (Criteria) this;
        }

        public Criteria andServiceRangeLessThanOrEqualTo(String value) {
            addCriterion("serviceRange <=", value, "serviceRange");
            return (Criteria) this;
        }

        public Criteria andServiceRangeLike(String value) {
            addCriterion("serviceRange like", value, "serviceRange");
            return (Criteria) this;
        }

        public Criteria andServiceRangeNotLike(String value) {
            addCriterion("serviceRange not like", value, "serviceRange");
            return (Criteria) this;
        }

        public Criteria andServiceRangeIn(List<String> values) {
            addCriterion("serviceRange in", values, "serviceRange");
            return (Criteria) this;
        }

        public Criteria andServiceRangeNotIn(List<String> values) {
            addCriterion("serviceRange not in", values, "serviceRange");
            return (Criteria) this;
        }

        public Criteria andServiceRangeBetween(String value1, String value2) {
            addCriterion("serviceRange between", value1, value2, "serviceRange");
            return (Criteria) this;
        }

        public Criteria andServiceRangeNotBetween(String value1, String value2) {
            addCriterion("serviceRange not between", value1, value2, "serviceRange");
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