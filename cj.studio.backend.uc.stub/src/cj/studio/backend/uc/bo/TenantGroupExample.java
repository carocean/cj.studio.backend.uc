package cj.studio.backend.uc.bo;

import java.util.ArrayList;
import java.util.List;

public class TenantGroupExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table tenantgroup
	 * @mbg.generated  Thu Jul 04 12:56:50 CST 2019
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table tenantgroup
	 * @mbg.generated  Thu Jul 04 12:56:50 CST 2019
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table tenantgroup
	 * @mbg.generated  Thu Jul 04 12:56:50 CST 2019
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tenantgroup
	 * @mbg.generated  Thu Jul 04 12:56:50 CST 2019
	 */
	public TenantGroupExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tenantgroup
	 * @mbg.generated  Thu Jul 04 12:56:50 CST 2019
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tenantgroup
	 * @mbg.generated  Thu Jul 04 12:56:50 CST 2019
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tenantgroup
	 * @mbg.generated  Thu Jul 04 12:56:50 CST 2019
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tenantgroup
	 * @mbg.generated  Thu Jul 04 12:56:50 CST 2019
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tenantgroup
	 * @mbg.generated  Thu Jul 04 12:56:50 CST 2019
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tenantgroup
	 * @mbg.generated  Thu Jul 04 12:56:50 CST 2019
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tenantgroup
	 * @mbg.generated  Thu Jul 04 12:56:50 CST 2019
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tenantgroup
	 * @mbg.generated  Thu Jul 04 12:56:50 CST 2019
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tenantgroup
	 * @mbg.generated  Thu Jul 04 12:56:50 CST 2019
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tenantgroup
	 * @mbg.generated  Thu Jul 04 12:56:50 CST 2019
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table tenantgroup
	 * @mbg.generated  Thu Jul 04 12:56:50 CST 2019
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

		public Criteria andCodeIsNull() {
			addCriterion("code is null");
			return (Criteria) this;
		}

		public Criteria andCodeIsNotNull() {
			addCriterion("code is not null");
			return (Criteria) this;
		}

		public Criteria andCodeEqualTo(String value) {
			addCriterion("code =", value, "code");
			return (Criteria) this;
		}

		public Criteria andCodeNotEqualTo(String value) {
			addCriterion("code <>", value, "code");
			return (Criteria) this;
		}

		public Criteria andCodeGreaterThan(String value) {
			addCriterion("code >", value, "code");
			return (Criteria) this;
		}

		public Criteria andCodeGreaterThanOrEqualTo(String value) {
			addCriterion("code >=", value, "code");
			return (Criteria) this;
		}

		public Criteria andCodeLessThan(String value) {
			addCriterion("code <", value, "code");
			return (Criteria) this;
		}

		public Criteria andCodeLessThanOrEqualTo(String value) {
			addCriterion("code <=", value, "code");
			return (Criteria) this;
		}

		public Criteria andCodeLike(String value) {
			addCriterion("code like", value, "code");
			return (Criteria) this;
		}

		public Criteria andCodeNotLike(String value) {
			addCriterion("code not like", value, "code");
			return (Criteria) this;
		}

		public Criteria andCodeIn(List<String> values) {
			addCriterion("code in", values, "code");
			return (Criteria) this;
		}

		public Criteria andCodeNotIn(List<String> values) {
			addCriterion("code not in", values, "code");
			return (Criteria) this;
		}

		public Criteria andCodeBetween(String value1, String value2) {
			addCriterion("code between", value1, value2, "code");
			return (Criteria) this;
		}

		public Criteria andCodeNotBetween(String value1, String value2) {
			addCriterion("code not between", value1, value2, "code");
			return (Criteria) this;
		}

		public Criteria andNameIsNull() {
			addCriterion("name is null");
			return (Criteria) this;
		}

		public Criteria andNameIsNotNull() {
			addCriterion("name is not null");
			return (Criteria) this;
		}

		public Criteria andNameEqualTo(String value) {
			addCriterion("name =", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotEqualTo(String value) {
			addCriterion("name <>", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameGreaterThan(String value) {
			addCriterion("name >", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameGreaterThanOrEqualTo(String value) {
			addCriterion("name >=", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameLessThan(String value) {
			addCriterion("name <", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameLessThanOrEqualTo(String value) {
			addCriterion("name <=", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameLike(String value) {
			addCriterion("name like", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotLike(String value) {
			addCriterion("name not like", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameIn(List<String> values) {
			addCriterion("name in", values, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotIn(List<String> values) {
			addCriterion("name not in", values, "name");
			return (Criteria) this;
		}

		public Criteria andNameBetween(String value1, String value2) {
			addCriterion("name between", value1, value2, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotBetween(String value1, String value2) {
			addCriterion("name not between", value1, value2, "name");
			return (Criteria) this;
		}

		public Criteria andTenantIsNull() {
			addCriterion("tenant is null");
			return (Criteria) this;
		}

		public Criteria andTenantIsNotNull() {
			addCriterion("tenant is not null");
			return (Criteria) this;
		}

		public Criteria andTenantEqualTo(String value) {
			addCriterion("tenant =", value, "tenant");
			return (Criteria) this;
		}

		public Criteria andTenantNotEqualTo(String value) {
			addCriterion("tenant <>", value, "tenant");
			return (Criteria) this;
		}

		public Criteria andTenantGreaterThan(String value) {
			addCriterion("tenant >", value, "tenant");
			return (Criteria) this;
		}

		public Criteria andTenantGreaterThanOrEqualTo(String value) {
			addCriterion("tenant >=", value, "tenant");
			return (Criteria) this;
		}

		public Criteria andTenantLessThan(String value) {
			addCriterion("tenant <", value, "tenant");
			return (Criteria) this;
		}

		public Criteria andTenantLessThanOrEqualTo(String value) {
			addCriterion("tenant <=", value, "tenant");
			return (Criteria) this;
		}

		public Criteria andTenantLike(String value) {
			addCriterion("tenant like", value, "tenant");
			return (Criteria) this;
		}

		public Criteria andTenantNotLike(String value) {
			addCriterion("tenant not like", value, "tenant");
			return (Criteria) this;
		}

		public Criteria andTenantIn(List<String> values) {
			addCriterion("tenant in", values, "tenant");
			return (Criteria) this;
		}

		public Criteria andTenantNotIn(List<String> values) {
			addCriterion("tenant not in", values, "tenant");
			return (Criteria) this;
		}

		public Criteria andTenantBetween(String value1, String value2) {
			addCriterion("tenant between", value1, value2, "tenant");
			return (Criteria) this;
		}

		public Criteria andTenantNotBetween(String value1, String value2) {
			addCriterion("tenant not between", value1, value2, "tenant");
			return (Criteria) this;
		}

		public Criteria andCommentIsNull() {
			addCriterion("comment is null");
			return (Criteria) this;
		}

		public Criteria andCommentIsNotNull() {
			addCriterion("comment is not null");
			return (Criteria) this;
		}

		public Criteria andCommentEqualTo(String value) {
			addCriterion("comment =", value, "comment");
			return (Criteria) this;
		}

		public Criteria andCommentNotEqualTo(String value) {
			addCriterion("comment <>", value, "comment");
			return (Criteria) this;
		}

		public Criteria andCommentGreaterThan(String value) {
			addCriterion("comment >", value, "comment");
			return (Criteria) this;
		}

		public Criteria andCommentGreaterThanOrEqualTo(String value) {
			addCriterion("comment >=", value, "comment");
			return (Criteria) this;
		}

		public Criteria andCommentLessThan(String value) {
			addCriterion("comment <", value, "comment");
			return (Criteria) this;
		}

		public Criteria andCommentLessThanOrEqualTo(String value) {
			addCriterion("comment <=", value, "comment");
			return (Criteria) this;
		}

		public Criteria andCommentLike(String value) {
			addCriterion("comment like", value, "comment");
			return (Criteria) this;
		}

		public Criteria andCommentNotLike(String value) {
			addCriterion("comment not like", value, "comment");
			return (Criteria) this;
		}

		public Criteria andCommentIn(List<String> values) {
			addCriterion("comment in", values, "comment");
			return (Criteria) this;
		}

		public Criteria andCommentNotIn(List<String> values) {
			addCriterion("comment not in", values, "comment");
			return (Criteria) this;
		}

		public Criteria andCommentBetween(String value1, String value2) {
			addCriterion("comment between", value1, value2, "comment");
			return (Criteria) this;
		}

		public Criteria andCommentNotBetween(String value1, String value2) {
			addCriterion("comment not between", value1, value2, "comment");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table tenantgroup
	 * @mbg.generated  Thu Jul 04 12:56:50 CST 2019
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
     * This class corresponds to the database table tenantgroup
     *
     * @mbg.generated do_not_delete_during_merge Tue May 07 09:38:49 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}