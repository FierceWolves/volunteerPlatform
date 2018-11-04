package cn.edu.nsu.greywolf.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ActivitiesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ActivitiesExample() {
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

        public Criteria andActivityTitleIsNull() {
            addCriterion("activityTitle is null");
            return (Criteria) this;
        }

        public Criteria andActivityTitleIsNotNull() {
            addCriterion("activityTitle is not null");
            return (Criteria) this;
        }

        public Criteria andActivityTitleEqualTo(String value) {
            addCriterion("activityTitle =", value, "activityTitle");
            return (Criteria) this;
        }

        public Criteria andActivityTitleNotEqualTo(String value) {
            addCriterion("activityTitle <>", value, "activityTitle");
            return (Criteria) this;
        }

        public Criteria andActivityTitleGreaterThan(String value) {
            addCriterion("activityTitle >", value, "activityTitle");
            return (Criteria) this;
        }

        public Criteria andActivityTitleGreaterThanOrEqualTo(String value) {
            addCriterion("activityTitle >=", value, "activityTitle");
            return (Criteria) this;
        }

        public Criteria andActivityTitleLessThan(String value) {
            addCriterion("activityTitle <", value, "activityTitle");
            return (Criteria) this;
        }

        public Criteria andActivityTitleLessThanOrEqualTo(String value) {
            addCriterion("activityTitle <=", value, "activityTitle");
            return (Criteria) this;
        }

        public Criteria andActivityTitleLike(String value) {
            addCriterion("activityTitle like", value, "activityTitle");
            return (Criteria) this;
        }

        public Criteria andActivityTitleNotLike(String value) {
            addCriterion("activityTitle not like", value, "activityTitle");
            return (Criteria) this;
        }

        public Criteria andActivityTitleIn(List<String> values) {
            addCriterion("activityTitle in", values, "activityTitle");
            return (Criteria) this;
        }

        public Criteria andActivityTitleNotIn(List<String> values) {
            addCriterion("activityTitle not in", values, "activityTitle");
            return (Criteria) this;
        }

        public Criteria andActivityTitleBetween(String value1, String value2) {
            addCriterion("activityTitle between", value1, value2, "activityTitle");
            return (Criteria) this;
        }

        public Criteria andActivityTitleNotBetween(String value1, String value2) {
            addCriterion("activityTitle not between", value1, value2, "activityTitle");
            return (Criteria) this;
        }

        public Criteria andActivityDetailIsNull() {
            addCriterion("activityDetail is null");
            return (Criteria) this;
        }

        public Criteria andActivityDetailIsNotNull() {
            addCriterion("activityDetail is not null");
            return (Criteria) this;
        }

        public Criteria andActivityDetailEqualTo(String value) {
            addCriterion("activityDetail =", value, "activityDetail");
            return (Criteria) this;
        }

        public Criteria andActivityDetailNotEqualTo(String value) {
            addCriterion("activityDetail <>", value, "activityDetail");
            return (Criteria) this;
        }

        public Criteria andActivityDetailGreaterThan(String value) {
            addCriterion("activityDetail >", value, "activityDetail");
            return (Criteria) this;
        }

        public Criteria andActivityDetailGreaterThanOrEqualTo(String value) {
            addCriterion("activityDetail >=", value, "activityDetail");
            return (Criteria) this;
        }

        public Criteria andActivityDetailLessThan(String value) {
            addCriterion("activityDetail <", value, "activityDetail");
            return (Criteria) this;
        }

        public Criteria andActivityDetailLessThanOrEqualTo(String value) {
            addCriterion("activityDetail <=", value, "activityDetail");
            return (Criteria) this;
        }

        public Criteria andActivityDetailLike(String value) {
            addCriterion("activityDetail like", value, "activityDetail");
            return (Criteria) this;
        }

        public Criteria andActivityDetailNotLike(String value) {
            addCriterion("activityDetail not like", value, "activityDetail");
            return (Criteria) this;
        }

        public Criteria andActivityDetailIn(List<String> values) {
            addCriterion("activityDetail in", values, "activityDetail");
            return (Criteria) this;
        }

        public Criteria andActivityDetailNotIn(List<String> values) {
            addCriterion("activityDetail not in", values, "activityDetail");
            return (Criteria) this;
        }

        public Criteria andActivityDetailBetween(String value1, String value2) {
            addCriterion("activityDetail between", value1, value2, "activityDetail");
            return (Criteria) this;
        }

        public Criteria andActivityDetailNotBetween(String value1, String value2) {
            addCriterion("activityDetail not between", value1, value2, "activityDetail");
            return (Criteria) this;
        }

        public Criteria andActivityTypeIsNull() {
            addCriterion("activityType is null");
            return (Criteria) this;
        }

        public Criteria andActivityTypeIsNotNull() {
            addCriterion("activityType is not null");
            return (Criteria) this;
        }

        public Criteria andActivityTypeEqualTo(Integer value) {
            addCriterion("activityType =", value, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeNotEqualTo(Integer value) {
            addCriterion("activityType <>", value, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeGreaterThan(Integer value) {
            addCriterion("activityType >", value, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("activityType >=", value, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeLessThan(Integer value) {
            addCriterion("activityType <", value, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeLessThanOrEqualTo(Integer value) {
            addCriterion("activityType <=", value, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeIn(List<Integer> values) {
            addCriterion("activityType in", values, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeNotIn(List<Integer> values) {
            addCriterion("activityType not in", values, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeBetween(Integer value1, Integer value2) {
            addCriterion("activityType between", value1, value2, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("activityType not between", value1, value2, "activityType");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("startTime is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("startTime is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterion("startTime =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterion("startTime <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterion("startTime >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("startTime >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterion("startTime <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("startTime <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterion("startTime in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterion("startTime not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterion("startTime between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("startTime not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("endTime is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("endTime is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterion("endTime =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("endTime <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("endTime >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("endTime >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("endTime <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("endTime <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("endTime in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("endTime not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("endTime between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("endTime not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andActivityProvinceIsNull() {
            addCriterion("activityProvince is null");
            return (Criteria) this;
        }

        public Criteria andActivityProvinceIsNotNull() {
            addCriterion("activityProvince is not null");
            return (Criteria) this;
        }

        public Criteria andActivityProvinceEqualTo(String value) {
            addCriterion("activityProvince =", value, "activityProvince");
            return (Criteria) this;
        }

        public Criteria andActivityProvinceNotEqualTo(String value) {
            addCriterion("activityProvince <>", value, "activityProvince");
            return (Criteria) this;
        }

        public Criteria andActivityProvinceGreaterThan(String value) {
            addCriterion("activityProvince >", value, "activityProvince");
            return (Criteria) this;
        }

        public Criteria andActivityProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("activityProvince >=", value, "activityProvince");
            return (Criteria) this;
        }

        public Criteria andActivityProvinceLessThan(String value) {
            addCriterion("activityProvince <", value, "activityProvince");
            return (Criteria) this;
        }

        public Criteria andActivityProvinceLessThanOrEqualTo(String value) {
            addCriterion("activityProvince <=", value, "activityProvince");
            return (Criteria) this;
        }

        public Criteria andActivityProvinceLike(String value) {
            addCriterion("activityProvince like", value, "activityProvince");
            return (Criteria) this;
        }

        public Criteria andActivityProvinceNotLike(String value) {
            addCriterion("activityProvince not like", value, "activityProvince");
            return (Criteria) this;
        }

        public Criteria andActivityProvinceIn(List<String> values) {
            addCriterion("activityProvince in", values, "activityProvince");
            return (Criteria) this;
        }

        public Criteria andActivityProvinceNotIn(List<String> values) {
            addCriterion("activityProvince not in", values, "activityProvince");
            return (Criteria) this;
        }

        public Criteria andActivityProvinceBetween(String value1, String value2) {
            addCriterion("activityProvince between", value1, value2, "activityProvince");
            return (Criteria) this;
        }

        public Criteria andActivityProvinceNotBetween(String value1, String value2) {
            addCriterion("activityProvince not between", value1, value2, "activityProvince");
            return (Criteria) this;
        }

        public Criteria andActivityCityIsNull() {
            addCriterion("activityCity is null");
            return (Criteria) this;
        }

        public Criteria andActivityCityIsNotNull() {
            addCriterion("activityCity is not null");
            return (Criteria) this;
        }

        public Criteria andActivityCityEqualTo(String value) {
            addCriterion("activityCity =", value, "activityCity");
            return (Criteria) this;
        }

        public Criteria andActivityCityNotEqualTo(String value) {
            addCriterion("activityCity <>", value, "activityCity");
            return (Criteria) this;
        }

        public Criteria andActivityCityGreaterThan(String value) {
            addCriterion("activityCity >", value, "activityCity");
            return (Criteria) this;
        }

        public Criteria andActivityCityGreaterThanOrEqualTo(String value) {
            addCriterion("activityCity >=", value, "activityCity");
            return (Criteria) this;
        }

        public Criteria andActivityCityLessThan(String value) {
            addCriterion("activityCity <", value, "activityCity");
            return (Criteria) this;
        }

        public Criteria andActivityCityLessThanOrEqualTo(String value) {
            addCriterion("activityCity <=", value, "activityCity");
            return (Criteria) this;
        }

        public Criteria andActivityCityLike(String value) {
            addCriterion("activityCity like", value, "activityCity");
            return (Criteria) this;
        }

        public Criteria andActivityCityNotLike(String value) {
            addCriterion("activityCity not like", value, "activityCity");
            return (Criteria) this;
        }

        public Criteria andActivityCityIn(List<String> values) {
            addCriterion("activityCity in", values, "activityCity");
            return (Criteria) this;
        }

        public Criteria andActivityCityNotIn(List<String> values) {
            addCriterion("activityCity not in", values, "activityCity");
            return (Criteria) this;
        }

        public Criteria andActivityCityBetween(String value1, String value2) {
            addCriterion("activityCity between", value1, value2, "activityCity");
            return (Criteria) this;
        }

        public Criteria andActivityCityNotBetween(String value1, String value2) {
            addCriterion("activityCity not between", value1, value2, "activityCity");
            return (Criteria) this;
        }

        public Criteria andActivitySiteIsNull() {
            addCriterion("activitySite is null");
            return (Criteria) this;
        }

        public Criteria andActivitySiteIsNotNull() {
            addCriterion("activitySite is not null");
            return (Criteria) this;
        }

        public Criteria andActivitySiteEqualTo(String value) {
            addCriterion("activitySite =", value, "activitySite");
            return (Criteria) this;
        }

        public Criteria andActivitySiteNotEqualTo(String value) {
            addCriterion("activitySite <>", value, "activitySite");
            return (Criteria) this;
        }

        public Criteria andActivitySiteGreaterThan(String value) {
            addCriterion("activitySite >", value, "activitySite");
            return (Criteria) this;
        }

        public Criteria andActivitySiteGreaterThanOrEqualTo(String value) {
            addCriterion("activitySite >=", value, "activitySite");
            return (Criteria) this;
        }

        public Criteria andActivitySiteLessThan(String value) {
            addCriterion("activitySite <", value, "activitySite");
            return (Criteria) this;
        }

        public Criteria andActivitySiteLessThanOrEqualTo(String value) {
            addCriterion("activitySite <=", value, "activitySite");
            return (Criteria) this;
        }

        public Criteria andActivitySiteLike(String value) {
            addCriterion("activitySite like", value, "activitySite");
            return (Criteria) this;
        }

        public Criteria andActivitySiteNotLike(String value) {
            addCriterion("activitySite not like", value, "activitySite");
            return (Criteria) this;
        }

        public Criteria andActivitySiteIn(List<String> values) {
            addCriterion("activitySite in", values, "activitySite");
            return (Criteria) this;
        }

        public Criteria andActivitySiteNotIn(List<String> values) {
            addCriterion("activitySite not in", values, "activitySite");
            return (Criteria) this;
        }

        public Criteria andActivitySiteBetween(String value1, String value2) {
            addCriterion("activitySite between", value1, value2, "activitySite");
            return (Criteria) this;
        }

        public Criteria andActivitySiteNotBetween(String value1, String value2) {
            addCriterion("activitySite not between", value1, value2, "activitySite");
            return (Criteria) this;
        }

        public Criteria andActivityOrgIsNull() {
            addCriterion("activityOrg is null");
            return (Criteria) this;
        }

        public Criteria andActivityOrgIsNotNull() {
            addCriterion("activityOrg is not null");
            return (Criteria) this;
        }

        public Criteria andActivityOrgEqualTo(String value) {
            addCriterion("activityOrg =", value, "activityOrg");
            return (Criteria) this;
        }

        public Criteria andActivityOrgNotEqualTo(String value) {
            addCriterion("activityOrg <>", value, "activityOrg");
            return (Criteria) this;
        }

        public Criteria andActivityOrgGreaterThan(String value) {
            addCriterion("activityOrg >", value, "activityOrg");
            return (Criteria) this;
        }

        public Criteria andActivityOrgGreaterThanOrEqualTo(String value) {
            addCriterion("activityOrg >=", value, "activityOrg");
            return (Criteria) this;
        }

        public Criteria andActivityOrgLessThan(String value) {
            addCriterion("activityOrg <", value, "activityOrg");
            return (Criteria) this;
        }

        public Criteria andActivityOrgLessThanOrEqualTo(String value) {
            addCriterion("activityOrg <=", value, "activityOrg");
            return (Criteria) this;
        }

        public Criteria andActivityOrgLike(String value) {
            addCriterion("activityOrg like", value, "activityOrg");
            return (Criteria) this;
        }

        public Criteria andActivityOrgNotLike(String value) {
            addCriterion("activityOrg not like", value, "activityOrg");
            return (Criteria) this;
        }

        public Criteria andActivityOrgIn(List<String> values) {
            addCriterion("activityOrg in", values, "activityOrg");
            return (Criteria) this;
        }

        public Criteria andActivityOrgNotIn(List<String> values) {
            addCriterion("activityOrg not in", values, "activityOrg");
            return (Criteria) this;
        }

        public Criteria andActivityOrgBetween(String value1, String value2) {
            addCriterion("activityOrg between", value1, value2, "activityOrg");
            return (Criteria) this;
        }

        public Criteria andActivityOrgNotBetween(String value1, String value2) {
            addCriterion("activityOrg not between", value1, value2, "activityOrg");
            return (Criteria) this;
        }

        public Criteria andActivityPrincipalIsNull() {
            addCriterion("activityPrincipal is null");
            return (Criteria) this;
        }

        public Criteria andActivityPrincipalIsNotNull() {
            addCriterion("activityPrincipal is not null");
            return (Criteria) this;
        }

        public Criteria andActivityPrincipalEqualTo(String value) {
            addCriterion("activityPrincipal =", value, "activityPrincipal");
            return (Criteria) this;
        }

        public Criteria andActivityPrincipalNotEqualTo(String value) {
            addCriterion("activityPrincipal <>", value, "activityPrincipal");
            return (Criteria) this;
        }

        public Criteria andActivityPrincipalGreaterThan(String value) {
            addCriterion("activityPrincipal >", value, "activityPrincipal");
            return (Criteria) this;
        }

        public Criteria andActivityPrincipalGreaterThanOrEqualTo(String value) {
            addCriterion("activityPrincipal >=", value, "activityPrincipal");
            return (Criteria) this;
        }

        public Criteria andActivityPrincipalLessThan(String value) {
            addCriterion("activityPrincipal <", value, "activityPrincipal");
            return (Criteria) this;
        }

        public Criteria andActivityPrincipalLessThanOrEqualTo(String value) {
            addCriterion("activityPrincipal <=", value, "activityPrincipal");
            return (Criteria) this;
        }

        public Criteria andActivityPrincipalLike(String value) {
            addCriterion("activityPrincipal like", value, "activityPrincipal");
            return (Criteria) this;
        }

        public Criteria andActivityPrincipalNotLike(String value) {
            addCriterion("activityPrincipal not like", value, "activityPrincipal");
            return (Criteria) this;
        }

        public Criteria andActivityPrincipalIn(List<String> values) {
            addCriterion("activityPrincipal in", values, "activityPrincipal");
            return (Criteria) this;
        }

        public Criteria andActivityPrincipalNotIn(List<String> values) {
            addCriterion("activityPrincipal not in", values, "activityPrincipal");
            return (Criteria) this;
        }

        public Criteria andActivityPrincipalBetween(String value1, String value2) {
            addCriterion("activityPrincipal between", value1, value2, "activityPrincipal");
            return (Criteria) this;
        }

        public Criteria andActivityPrincipalNotBetween(String value1, String value2) {
            addCriterion("activityPrincipal not between", value1, value2, "activityPrincipal");
            return (Criteria) this;
        }

        public Criteria andActivityPrincipalTelIsNull() {
            addCriterion("activityPrincipalTel is null");
            return (Criteria) this;
        }

        public Criteria andActivityPrincipalTelIsNotNull() {
            addCriterion("activityPrincipalTel is not null");
            return (Criteria) this;
        }

        public Criteria andActivityPrincipalTelEqualTo(String value) {
            addCriterion("activityPrincipalTel =", value, "activityPrincipalTel");
            return (Criteria) this;
        }

        public Criteria andActivityPrincipalTelNotEqualTo(String value) {
            addCriterion("activityPrincipalTel <>", value, "activityPrincipalTel");
            return (Criteria) this;
        }

        public Criteria andActivityPrincipalTelGreaterThan(String value) {
            addCriterion("activityPrincipalTel >", value, "activityPrincipalTel");
            return (Criteria) this;
        }

        public Criteria andActivityPrincipalTelGreaterThanOrEqualTo(String value) {
            addCriterion("activityPrincipalTel >=", value, "activityPrincipalTel");
            return (Criteria) this;
        }

        public Criteria andActivityPrincipalTelLessThan(String value) {
            addCriterion("activityPrincipalTel <", value, "activityPrincipalTel");
            return (Criteria) this;
        }

        public Criteria andActivityPrincipalTelLessThanOrEqualTo(String value) {
            addCriterion("activityPrincipalTel <=", value, "activityPrincipalTel");
            return (Criteria) this;
        }

        public Criteria andActivityPrincipalTelLike(String value) {
            addCriterion("activityPrincipalTel like", value, "activityPrincipalTel");
            return (Criteria) this;
        }

        public Criteria andActivityPrincipalTelNotLike(String value) {
            addCriterion("activityPrincipalTel not like", value, "activityPrincipalTel");
            return (Criteria) this;
        }

        public Criteria andActivityPrincipalTelIn(List<String> values) {
            addCriterion("activityPrincipalTel in", values, "activityPrincipalTel");
            return (Criteria) this;
        }

        public Criteria andActivityPrincipalTelNotIn(List<String> values) {
            addCriterion("activityPrincipalTel not in", values, "activityPrincipalTel");
            return (Criteria) this;
        }

        public Criteria andActivityPrincipalTelBetween(String value1, String value2) {
            addCriterion("activityPrincipalTel between", value1, value2, "activityPrincipalTel");
            return (Criteria) this;
        }

        public Criteria andActivityPrincipalTelNotBetween(String value1, String value2) {
            addCriterion("activityPrincipalTel not between", value1, value2, "activityPrincipalTel");
            return (Criteria) this;
        }

        public Criteria andParticipatorNumberIsNull() {
            addCriterion("participatorNumber is null");
            return (Criteria) this;
        }

        public Criteria andParticipatorNumberIsNotNull() {
            addCriterion("participatorNumber is not null");
            return (Criteria) this;
        }

        public Criteria andParticipatorNumberEqualTo(String value) {
            addCriterion("participatorNumber =", value, "participatorNumber");
            return (Criteria) this;
        }

        public Criteria andParticipatorNumberNotEqualTo(String value) {
            addCriterion("participatorNumber <>", value, "participatorNumber");
            return (Criteria) this;
        }

        public Criteria andParticipatorNumberGreaterThan(String value) {
            addCriterion("participatorNumber >", value, "participatorNumber");
            return (Criteria) this;
        }

        public Criteria andParticipatorNumberGreaterThanOrEqualTo(String value) {
            addCriterion("participatorNumber >=", value, "participatorNumber");
            return (Criteria) this;
        }

        public Criteria andParticipatorNumberLessThan(String value) {
            addCriterion("participatorNumber <", value, "participatorNumber");
            return (Criteria) this;
        }

        public Criteria andParticipatorNumberLessThanOrEqualTo(String value) {
            addCriterion("participatorNumber <=", value, "participatorNumber");
            return (Criteria) this;
        }

        public Criteria andParticipatorNumberLike(String value) {
            addCriterion("participatorNumber like", value, "participatorNumber");
            return (Criteria) this;
        }

        public Criteria andParticipatorNumberNotLike(String value) {
            addCriterion("participatorNumber not like", value, "participatorNumber");
            return (Criteria) this;
        }

        public Criteria andParticipatorNumberIn(List<String> values) {
            addCriterion("participatorNumber in", values, "participatorNumber");
            return (Criteria) this;
        }

        public Criteria andParticipatorNumberNotIn(List<String> values) {
            addCriterion("participatorNumber not in", values, "participatorNumber");
            return (Criteria) this;
        }

        public Criteria andParticipatorNumberBetween(String value1, String value2) {
            addCriterion("participatorNumber between", value1, value2, "participatorNumber");
            return (Criteria) this;
        }

        public Criteria andParticipatorNumberNotBetween(String value1, String value2) {
            addCriterion("participatorNumber not between", value1, value2, "participatorNumber");
            return (Criteria) this;
        }

        public Criteria andActivityStatusIsNull() {
            addCriterion("activityStatus is null");
            return (Criteria) this;
        }

        public Criteria andActivityStatusIsNotNull() {
            addCriterion("activityStatus is not null");
            return (Criteria) this;
        }

        public Criteria andActivityStatusEqualTo(String value) {
            addCriterion("activityStatus =", value, "activityStatus");
            return (Criteria) this;
        }

        public Criteria andActivityStatusNotEqualTo(String value) {
            addCriterion("activityStatus <>", value, "activityStatus");
            return (Criteria) this;
        }

        public Criteria andActivityStatusGreaterThan(String value) {
            addCriterion("activityStatus >", value, "activityStatus");
            return (Criteria) this;
        }

        public Criteria andActivityStatusGreaterThanOrEqualTo(String value) {
            addCriterion("activityStatus >=", value, "activityStatus");
            return (Criteria) this;
        }

        public Criteria andActivityStatusLessThan(String value) {
            addCriterion("activityStatus <", value, "activityStatus");
            return (Criteria) this;
        }

        public Criteria andActivityStatusLessThanOrEqualTo(String value) {
            addCriterion("activityStatus <=", value, "activityStatus");
            return (Criteria) this;
        }

        public Criteria andActivityStatusLike(String value) {
            addCriterion("activityStatus like", value, "activityStatus");
            return (Criteria) this;
        }

        public Criteria andActivityStatusNotLike(String value) {
            addCriterion("activityStatus not like", value, "activityStatus");
            return (Criteria) this;
        }

        public Criteria andActivityStatusIn(List<String> values) {
            addCriterion("activityStatus in", values, "activityStatus");
            return (Criteria) this;
        }

        public Criteria andActivityStatusNotIn(List<String> values) {
            addCriterion("activityStatus not in", values, "activityStatus");
            return (Criteria) this;
        }

        public Criteria andActivityStatusBetween(String value1, String value2) {
            addCriterion("activityStatus between", value1, value2, "activityStatus");
            return (Criteria) this;
        }

        public Criteria andActivityStatusNotBetween(String value1, String value2) {
            addCriterion("activityStatus not between", value1, value2, "activityStatus");
            return (Criteria) this;
        }

        public Criteria andActivityPhotoIsNull() {
            addCriterion("activityPhoto is null");
            return (Criteria) this;
        }

        public Criteria andActivityPhotoIsNotNull() {
            addCriterion("activityPhoto is not null");
            return (Criteria) this;
        }

        public Criteria andActivityPhotoEqualTo(String value) {
            addCriterion("activityPhoto =", value, "activityPhoto");
            return (Criteria) this;
        }

        public Criteria andActivityPhotoNotEqualTo(String value) {
            addCriterion("activityPhoto <>", value, "activityPhoto");
            return (Criteria) this;
        }

        public Criteria andActivityPhotoGreaterThan(String value) {
            addCriterion("activityPhoto >", value, "activityPhoto");
            return (Criteria) this;
        }

        public Criteria andActivityPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("activityPhoto >=", value, "activityPhoto");
            return (Criteria) this;
        }

        public Criteria andActivityPhotoLessThan(String value) {
            addCriterion("activityPhoto <", value, "activityPhoto");
            return (Criteria) this;
        }

        public Criteria andActivityPhotoLessThanOrEqualTo(String value) {
            addCriterion("activityPhoto <=", value, "activityPhoto");
            return (Criteria) this;
        }

        public Criteria andActivityPhotoLike(String value) {
            addCriterion("activityPhoto like", value, "activityPhoto");
            return (Criteria) this;
        }

        public Criteria andActivityPhotoNotLike(String value) {
            addCriterion("activityPhoto not like", value, "activityPhoto");
            return (Criteria) this;
        }

        public Criteria andActivityPhotoIn(List<String> values) {
            addCriterion("activityPhoto in", values, "activityPhoto");
            return (Criteria) this;
        }

        public Criteria andActivityPhotoNotIn(List<String> values) {
            addCriterion("activityPhoto not in", values, "activityPhoto");
            return (Criteria) this;
        }

        public Criteria andActivityPhotoBetween(String value1, String value2) {
            addCriterion("activityPhoto between", value1, value2, "activityPhoto");
            return (Criteria) this;
        }

        public Criteria andActivityPhotoNotBetween(String value1, String value2) {
            addCriterion("activityPhoto not between", value1, value2, "activityPhoto");
            return (Criteria) this;
        }

        public Criteria andActivityIntegralIsNull() {
            addCriterion("activityIntegral is null");
            return (Criteria) this;
        }

        public Criteria andActivityIntegralIsNotNull() {
            addCriterion("activityIntegral is not null");
            return (Criteria) this;
        }

        public Criteria andActivityIntegralEqualTo(Integer value) {
            addCriterion("activityIntegral =", value, "activityIntegral");
            return (Criteria) this;
        }

        public Criteria andActivityIntegralNotEqualTo(Integer value) {
            addCriterion("activityIntegral <>", value, "activityIntegral");
            return (Criteria) this;
        }

        public Criteria andActivityIntegralGreaterThan(Integer value) {
            addCriterion("activityIntegral >", value, "activityIntegral");
            return (Criteria) this;
        }

        public Criteria andActivityIntegralGreaterThanOrEqualTo(Integer value) {
            addCriterion("activityIntegral >=", value, "activityIntegral");
            return (Criteria) this;
        }

        public Criteria andActivityIntegralLessThan(Integer value) {
            addCriterion("activityIntegral <", value, "activityIntegral");
            return (Criteria) this;
        }

        public Criteria andActivityIntegralLessThanOrEqualTo(Integer value) {
            addCriterion("activityIntegral <=", value, "activityIntegral");
            return (Criteria) this;
        }

        public Criteria andActivityIntegralIn(List<Integer> values) {
            addCriterion("activityIntegral in", values, "activityIntegral");
            return (Criteria) this;
        }

        public Criteria andActivityIntegralNotIn(List<Integer> values) {
            addCriterion("activityIntegral not in", values, "activityIntegral");
            return (Criteria) this;
        }

        public Criteria andActivityIntegralBetween(Integer value1, Integer value2) {
            addCriterion("activityIntegral between", value1, value2, "activityIntegral");
            return (Criteria) this;
        }

        public Criteria andActivityIntegralNotBetween(Integer value1, Integer value2) {
            addCriterion("activityIntegral not between", value1, value2, "activityIntegral");
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