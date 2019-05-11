package cj.studio.backend.uc.bo;

import java.util.ArrayList;
import java.util.List;

public class UAExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table ua
	 * @mbg.generated  Sat May 11 15:47:57 CST 2019
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table ua
	 * @mbg.generated  Sat May 11 15:47:57 CST 2019
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table ua
	 * @mbg.generated  Sat May 11 15:47:57 CST 2019
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ua
	 * @mbg.generated  Sat May 11 15:47:57 CST 2019
	 */
	public UAExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ua
	 * @mbg.generated  Sat May 11 15:47:57 CST 2019
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ua
	 * @mbg.generated  Sat May 11 15:47:57 CST 2019
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ua
	 * @mbg.generated  Sat May 11 15:47:57 CST 2019
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ua
	 * @mbg.generated  Sat May 11 15:47:57 CST 2019
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ua
	 * @mbg.generated  Sat May 11 15:47:57 CST 2019
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ua
	 * @mbg.generated  Sat May 11 15:47:57 CST 2019
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ua
	 * @mbg.generated  Sat May 11 15:47:57 CST 2019
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ua
	 * @mbg.generated  Sat May 11 15:47:57 CST 2019
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ua
	 * @mbg.generated  Sat May 11 15:47:57 CST 2019
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ua
	 * @mbg.generated  Sat May 11 15:47:57 CST 2019
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table ua
	 * @mbg.generated  Sat May 11 15:47:57 CST 2019
	 */
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

		public Criteria andIdIsNull() {
			addCriterion("id is null");
			return (Criteria) this;
		}

		public Criteria andIdIsNotNull() {
			addCriterion("id is not null");
			return (Criteria) this;
		}

		public Criteria andIdEqualTo(Long value) {
			addCriterion("id =", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotEqualTo(Long value) {
			addCriterion("id <>", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThan(Long value) {
			addCriterion("id >", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThanOrEqualTo(Long value) {
			addCriterion("id >=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThan(Long value) {
			addCriterion("id <", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThanOrEqualTo(Long value) {
			addCriterion("id <=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdIn(List<Long> values) {
			addCriterion("id in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotIn(List<Long> values) {
			addCriterion("id not in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdBetween(Long value1, Long value2) {
			addCriterion("id between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotBetween(Long value1, Long value2) {
			addCriterion("id not between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andUsercodeIsNull() {
			addCriterion("userCode is null");
			return (Criteria) this;
		}

		public Criteria andUsercodeIsNotNull() {
			addCriterion("userCode is not null");
			return (Criteria) this;
		}

		public Criteria andUsercodeEqualTo(String value) {
			addCriterion("userCode =", value, "usercode");
			return (Criteria) this;
		}

		public Criteria andUsercodeNotEqualTo(String value) {
			addCriterion("userCode <>", value, "usercode");
			return (Criteria) this;
		}

		public Criteria andUsercodeGreaterThan(String value) {
			addCriterion("userCode >", value, "usercode");
			return (Criteria) this;
		}

		public Criteria andUsercodeGreaterThanOrEqualTo(String value) {
			addCriterion("userCode >=", value, "usercode");
			return (Criteria) this;
		}

		public Criteria andUsercodeLessThan(String value) {
			addCriterion("userCode <", value, "usercode");
			return (Criteria) this;
		}

		public Criteria andUsercodeLessThanOrEqualTo(String value) {
			addCriterion("userCode <=", value, "usercode");
			return (Criteria) this;
		}

		public Criteria andUsercodeLike(String value) {
			addCriterion("userCode like", value, "usercode");
			return (Criteria) this;
		}

		public Criteria andUsercodeNotLike(String value) {
			addCriterion("userCode not like", value, "usercode");
			return (Criteria) this;
		}

		public Criteria andUsercodeIn(List<String> values) {
			addCriterion("userCode in", values, "usercode");
			return (Criteria) this;
		}

		public Criteria andUsercodeNotIn(List<String> values) {
			addCriterion("userCode not in", values, "usercode");
			return (Criteria) this;
		}

		public Criteria andUsercodeBetween(String value1, String value2) {
			addCriterion("userCode between", value1, value2, "usercode");
			return (Criteria) this;
		}

		public Criteria andUsercodeNotBetween(String value1, String value2) {
			addCriterion("userCode not between", value1, value2, "usercode");
			return (Criteria) this;
		}

		public Criteria andColcodeIsNull() {
			addCriterion("colCode is null");
			return (Criteria) this;
		}

		public Criteria andColcodeIsNotNull() {
			addCriterion("colCode is not null");
			return (Criteria) this;
		}

		public Criteria andColcodeEqualTo(String value) {
			addCriterion("colCode =", value, "colcode");
			return (Criteria) this;
		}

		public Criteria andColcodeNotEqualTo(String value) {
			addCriterion("colCode <>", value, "colcode");
			return (Criteria) this;
		}

		public Criteria andColcodeGreaterThan(String value) {
			addCriterion("colCode >", value, "colcode");
			return (Criteria) this;
		}

		public Criteria andColcodeGreaterThanOrEqualTo(String value) {
			addCriterion("colCode >=", value, "colcode");
			return (Criteria) this;
		}

		public Criteria andColcodeLessThan(String value) {
			addCriterion("colCode <", value, "colcode");
			return (Criteria) this;
		}

		public Criteria andColcodeLessThanOrEqualTo(String value) {
			addCriterion("colCode <=", value, "colcode");
			return (Criteria) this;
		}

		public Criteria andColcodeLike(String value) {
			addCriterion("colCode like", value, "colcode");
			return (Criteria) this;
		}

		public Criteria andColcodeNotLike(String value) {
			addCriterion("colCode not like", value, "colcode");
			return (Criteria) this;
		}

		public Criteria andColcodeIn(List<String> values) {
			addCriterion("colCode in", values, "colcode");
			return (Criteria) this;
		}

		public Criteria andColcodeNotIn(List<String> values) {
			addCriterion("colCode not in", values, "colcode");
			return (Criteria) this;
		}

		public Criteria andColcodeBetween(String value1, String value2) {
			addCriterion("colCode between", value1, value2, "colcode");
			return (Criteria) this;
		}

		public Criteria andColcodeNotBetween(String value1, String value2) {
			addCriterion("colCode not between", value1, value2, "colcode");
			return (Criteria) this;
		}

		public Criteria andColtypeIsNull() {
			addCriterion("colType is null");
			return (Criteria) this;
		}

		public Criteria andColtypeIsNotNull() {
			addCriterion("colType is not null");
			return (Criteria) this;
		}

		public Criteria andColtypeEqualTo(String value) {
			addCriterion("colType =", value, "coltype");
			return (Criteria) this;
		}

		public Criteria andColtypeNotEqualTo(String value) {
			addCriterion("colType <>", value, "coltype");
			return (Criteria) this;
		}

		public Criteria andColtypeGreaterThan(String value) {
			addCriterion("colType >", value, "coltype");
			return (Criteria) this;
		}

		public Criteria andColtypeGreaterThanOrEqualTo(String value) {
			addCriterion("colType >=", value, "coltype");
			return (Criteria) this;
		}

		public Criteria andColtypeLessThan(String value) {
			addCriterion("colType <", value, "coltype");
			return (Criteria) this;
		}

		public Criteria andColtypeLessThanOrEqualTo(String value) {
			addCriterion("colType <=", value, "coltype");
			return (Criteria) this;
		}

		public Criteria andColtypeLike(String value) {
			addCriterion("colType like", value, "coltype");
			return (Criteria) this;
		}

		public Criteria andColtypeNotLike(String value) {
			addCriterion("colType not like", value, "coltype");
			return (Criteria) this;
		}

		public Criteria andColtypeIn(List<String> values) {
			addCriterion("colType in", values, "coltype");
			return (Criteria) this;
		}

		public Criteria andColtypeNotIn(List<String> values) {
			addCriterion("colType not in", values, "coltype");
			return (Criteria) this;
		}

		public Criteria andColtypeBetween(String value1, String value2) {
			addCriterion("colType between", value1, value2, "coltype");
			return (Criteria) this;
		}

		public Criteria andColtypeNotBetween(String value1, String value2) {
			addCriterion("colType not between", value1, value2, "coltype");
			return (Criteria) this;
		}

		public Criteria andTenantcodeIsNull() {
			addCriterion("tenantCode is null");
			return (Criteria) this;
		}

		public Criteria andTenantcodeIsNotNull() {
			addCriterion("tenantCode is not null");
			return (Criteria) this;
		}

		public Criteria andTenantcodeEqualTo(String value) {
			addCriterion("tenantCode =", value, "tenantcode");
			return (Criteria) this;
		}

		public Criteria andTenantcodeNotEqualTo(String value) {
			addCriterion("tenantCode <>", value, "tenantcode");
			return (Criteria) this;
		}

		public Criteria andTenantcodeGreaterThan(String value) {
			addCriterion("tenantCode >", value, "tenantcode");
			return (Criteria) this;
		}

		public Criteria andTenantcodeGreaterThanOrEqualTo(String value) {
			addCriterion("tenantCode >=", value, "tenantcode");
			return (Criteria) this;
		}

		public Criteria andTenantcodeLessThan(String value) {
			addCriterion("tenantCode <", value, "tenantcode");
			return (Criteria) this;
		}

		public Criteria andTenantcodeLessThanOrEqualTo(String value) {
			addCriterion("tenantCode <=", value, "tenantcode");
			return (Criteria) this;
		}

		public Criteria andTenantcodeLike(String value) {
			addCriterion("tenantCode like", value, "tenantcode");
			return (Criteria) this;
		}

		public Criteria andTenantcodeNotLike(String value) {
			addCriterion("tenantCode not like", value, "tenantcode");
			return (Criteria) this;
		}

		public Criteria andTenantcodeIn(List<String> values) {
			addCriterion("tenantCode in", values, "tenantcode");
			return (Criteria) this;
		}

		public Criteria andTenantcodeNotIn(List<String> values) {
			addCriterion("tenantCode not in", values, "tenantcode");
			return (Criteria) this;
		}

		public Criteria andTenantcodeBetween(String value1, String value2) {
			addCriterion("tenantCode between", value1, value2, "tenantcode");
			return (Criteria) this;
		}

		public Criteria andTenantcodeNotBetween(String value1, String value2) {
			addCriterion("tenantCode not between", value1, value2, "tenantcode");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table ua
	 * @mbg.generated  Sat May 11 15:47:57 CST 2019
	 */
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

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ua
     *
     * @mbg.generated do_not_delete_during_merge Tue May 07 09:38:49 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}