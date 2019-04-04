package cj.studio.backend.uc.bo;

import java.util.ArrayList;
import java.util.List;

public class AccountAttributeExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table accountattr
	 * @mbg.generated  Thu Apr 04 22:03:54 CST 2019
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table accountattr
	 * @mbg.generated  Thu Apr 04 22:03:54 CST 2019
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table accountattr
	 * @mbg.generated  Thu Apr 04 22:03:54 CST 2019
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table accountattr
	 * @mbg.generated  Thu Apr 04 22:03:54 CST 2019
	 */
	public AccountAttributeExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table accountattr
	 * @mbg.generated  Thu Apr 04 22:03:54 CST 2019
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table accountattr
	 * @mbg.generated  Thu Apr 04 22:03:54 CST 2019
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table accountattr
	 * @mbg.generated  Thu Apr 04 22:03:54 CST 2019
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table accountattr
	 * @mbg.generated  Thu Apr 04 22:03:54 CST 2019
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table accountattr
	 * @mbg.generated  Thu Apr 04 22:03:54 CST 2019
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table accountattr
	 * @mbg.generated  Thu Apr 04 22:03:54 CST 2019
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table accountattr
	 * @mbg.generated  Thu Apr 04 22:03:54 CST 2019
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table accountattr
	 * @mbg.generated  Thu Apr 04 22:03:54 CST 2019
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table accountattr
	 * @mbg.generated  Thu Apr 04 22:03:54 CST 2019
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table accountattr
	 * @mbg.generated  Thu Apr 04 22:03:54 CST 2019
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table accountattr
	 * @mbg.generated  Thu Apr 04 22:03:54 CST 2019
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

		public Criteria andAccountcodeIsNull() {
			addCriterion("accountCode is null");
			return (Criteria) this;
		}

		public Criteria andAccountcodeIsNotNull() {
			addCriterion("accountCode is not null");
			return (Criteria) this;
		}

		public Criteria andAccountcodeEqualTo(String value) {
			addCriterion("accountCode =", value, "accountcode");
			return (Criteria) this;
		}

		public Criteria andAccountcodeNotEqualTo(String value) {
			addCriterion("accountCode <>", value, "accountcode");
			return (Criteria) this;
		}

		public Criteria andAccountcodeGreaterThan(String value) {
			addCriterion("accountCode >", value, "accountcode");
			return (Criteria) this;
		}

		public Criteria andAccountcodeGreaterThanOrEqualTo(String value) {
			addCriterion("accountCode >=", value, "accountcode");
			return (Criteria) this;
		}

		public Criteria andAccountcodeLessThan(String value) {
			addCriterion("accountCode <", value, "accountcode");
			return (Criteria) this;
		}

		public Criteria andAccountcodeLessThanOrEqualTo(String value) {
			addCriterion("accountCode <=", value, "accountcode");
			return (Criteria) this;
		}

		public Criteria andAccountcodeLike(String value) {
			addCriterion("accountCode like", value, "accountcode");
			return (Criteria) this;
		}

		public Criteria andAccountcodeNotLike(String value) {
			addCriterion("accountCode not like", value, "accountcode");
			return (Criteria) this;
		}

		public Criteria andAccountcodeIn(List<String> values) {
			addCriterion("accountCode in", values, "accountcode");
			return (Criteria) this;
		}

		public Criteria andAccountcodeNotIn(List<String> values) {
			addCriterion("accountCode not in", values, "accountcode");
			return (Criteria) this;
		}

		public Criteria andAccountcodeBetween(String value1, String value2) {
			addCriterion("accountCode between", value1, value2, "accountcode");
			return (Criteria) this;
		}

		public Criteria andAccountcodeNotBetween(String value1, String value2) {
			addCriterion("accountCode not between", value1, value2, "accountcode");
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

		public Criteria andAttrcodeIsNull() {
			addCriterion("attrCode is null");
			return (Criteria) this;
		}

		public Criteria andAttrcodeIsNotNull() {
			addCriterion("attrCode is not null");
			return (Criteria) this;
		}

		public Criteria andAttrcodeEqualTo(String value) {
			addCriterion("attrCode =", value, "attrcode");
			return (Criteria) this;
		}

		public Criteria andAttrcodeNotEqualTo(String value) {
			addCriterion("attrCode <>", value, "attrcode");
			return (Criteria) this;
		}

		public Criteria andAttrcodeGreaterThan(String value) {
			addCriterion("attrCode >", value, "attrcode");
			return (Criteria) this;
		}

		public Criteria andAttrcodeGreaterThanOrEqualTo(String value) {
			addCriterion("attrCode >=", value, "attrcode");
			return (Criteria) this;
		}

		public Criteria andAttrcodeLessThan(String value) {
			addCriterion("attrCode <", value, "attrcode");
			return (Criteria) this;
		}

		public Criteria andAttrcodeLessThanOrEqualTo(String value) {
			addCriterion("attrCode <=", value, "attrcode");
			return (Criteria) this;
		}

		public Criteria andAttrcodeLike(String value) {
			addCriterion("attrCode like", value, "attrcode");
			return (Criteria) this;
		}

		public Criteria andAttrcodeNotLike(String value) {
			addCriterion("attrCode not like", value, "attrcode");
			return (Criteria) this;
		}

		public Criteria andAttrcodeIn(List<String> values) {
			addCriterion("attrCode in", values, "attrcode");
			return (Criteria) this;
		}

		public Criteria andAttrcodeNotIn(List<String> values) {
			addCriterion("attrCode not in", values, "attrcode");
			return (Criteria) this;
		}

		public Criteria andAttrcodeBetween(String value1, String value2) {
			addCriterion("attrCode between", value1, value2, "attrcode");
			return (Criteria) this;
		}

		public Criteria andAttrcodeNotBetween(String value1, String value2) {
			addCriterion("attrCode not between", value1, value2, "attrcode");
			return (Criteria) this;
		}

		public Criteria andSegcodeIsNull() {
			addCriterion("segCode is null");
			return (Criteria) this;
		}

		public Criteria andSegcodeIsNotNull() {
			addCriterion("segCode is not null");
			return (Criteria) this;
		}

		public Criteria andSegcodeEqualTo(String value) {
			addCriterion("segCode =", value, "segcode");
			return (Criteria) this;
		}

		public Criteria andSegcodeNotEqualTo(String value) {
			addCriterion("segCode <>", value, "segcode");
			return (Criteria) this;
		}

		public Criteria andSegcodeGreaterThan(String value) {
			addCriterion("segCode >", value, "segcode");
			return (Criteria) this;
		}

		public Criteria andSegcodeGreaterThanOrEqualTo(String value) {
			addCriterion("segCode >=", value, "segcode");
			return (Criteria) this;
		}

		public Criteria andSegcodeLessThan(String value) {
			addCriterion("segCode <", value, "segcode");
			return (Criteria) this;
		}

		public Criteria andSegcodeLessThanOrEqualTo(String value) {
			addCriterion("segCode <=", value, "segcode");
			return (Criteria) this;
		}

		public Criteria andSegcodeLike(String value) {
			addCriterion("segCode like", value, "segcode");
			return (Criteria) this;
		}

		public Criteria andSegcodeNotLike(String value) {
			addCriterion("segCode not like", value, "segcode");
			return (Criteria) this;
		}

		public Criteria andSegcodeIn(List<String> values) {
			addCriterion("segCode in", values, "segcode");
			return (Criteria) this;
		}

		public Criteria andSegcodeNotIn(List<String> values) {
			addCriterion("segCode not in", values, "segcode");
			return (Criteria) this;
		}

		public Criteria andSegcodeBetween(String value1, String value2) {
			addCriterion("segCode between", value1, value2, "segcode");
			return (Criteria) this;
		}

		public Criteria andSegcodeNotBetween(String value1, String value2) {
			addCriterion("segCode not between", value1, value2, "segcode");
			return (Criteria) this;
		}

		public Criteria andValueIsNull() {
			addCriterion("value is null");
			return (Criteria) this;
		}

		public Criteria andValueIsNotNull() {
			addCriterion("value is not null");
			return (Criteria) this;
		}

		public Criteria andValueEqualTo(String value) {
			addCriterion("value =", value, "value");
			return (Criteria) this;
		}

		public Criteria andValueNotEqualTo(String value) {
			addCriterion("value <>", value, "value");
			return (Criteria) this;
		}

		public Criteria andValueGreaterThan(String value) {
			addCriterion("value >", value, "value");
			return (Criteria) this;
		}

		public Criteria andValueGreaterThanOrEqualTo(String value) {
			addCriterion("value >=", value, "value");
			return (Criteria) this;
		}

		public Criteria andValueLessThan(String value) {
			addCriterion("value <", value, "value");
			return (Criteria) this;
		}

		public Criteria andValueLessThanOrEqualTo(String value) {
			addCriterion("value <=", value, "value");
			return (Criteria) this;
		}

		public Criteria andValueLike(String value) {
			addCriterion("value like", value, "value");
			return (Criteria) this;
		}

		public Criteria andValueNotLike(String value) {
			addCriterion("value not like", value, "value");
			return (Criteria) this;
		}

		public Criteria andValueIn(List<String> values) {
			addCriterion("value in", values, "value");
			return (Criteria) this;
		}

		public Criteria andValueNotIn(List<String> values) {
			addCriterion("value not in", values, "value");
			return (Criteria) this;
		}

		public Criteria andValueBetween(String value1, String value2) {
			addCriterion("value between", value1, value2, "value");
			return (Criteria) this;
		}

		public Criteria andValueNotBetween(String value1, String value2) {
			addCriterion("value not between", value1, value2, "value");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table accountattr
	 * @mbg.generated  Thu Apr 04 22:03:54 CST 2019
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
     * This class corresponds to the database table accountattr
     *
     * @mbg.generated do_not_delete_during_merge Fri Jan 11 23:00:56 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}