package cj.studio.backend.uc.bo;

import java.util.ArrayList;
import java.util.List;

public class CompanyExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table company
	 * @mbg.generated  Sat May 11 15:47:57 CST 2019
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table company
	 * @mbg.generated  Sat May 11 15:47:57 CST 2019
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table company
	 * @mbg.generated  Sat May 11 15:47:57 CST 2019
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table company
	 * @mbg.generated  Sat May 11 15:47:57 CST 2019
	 */
	public CompanyExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table company
	 * @mbg.generated  Sat May 11 15:47:57 CST 2019
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table company
	 * @mbg.generated  Sat May 11 15:47:57 CST 2019
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table company
	 * @mbg.generated  Sat May 11 15:47:57 CST 2019
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table company
	 * @mbg.generated  Sat May 11 15:47:57 CST 2019
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table company
	 * @mbg.generated  Sat May 11 15:47:57 CST 2019
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table company
	 * @mbg.generated  Sat May 11 15:47:57 CST 2019
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table company
	 * @mbg.generated  Sat May 11 15:47:57 CST 2019
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table company
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
	 * This method was generated by MyBatis Generator. This method corresponds to the database table company
	 * @mbg.generated  Sat May 11 15:47:57 CST 2019
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table company
	 * @mbg.generated  Sat May 11 15:47:57 CST 2019
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table company
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

		public Criteria andCnnameIsNull() {
			addCriterion("cnname is null");
			return (Criteria) this;
		}

		public Criteria andCnnameIsNotNull() {
			addCriterion("cnname is not null");
			return (Criteria) this;
		}

		public Criteria andCnnameEqualTo(String value) {
			addCriterion("cnname =", value, "cnname");
			return (Criteria) this;
		}

		public Criteria andCnnameNotEqualTo(String value) {
			addCriterion("cnname <>", value, "cnname");
			return (Criteria) this;
		}

		public Criteria andCnnameGreaterThan(String value) {
			addCriterion("cnname >", value, "cnname");
			return (Criteria) this;
		}

		public Criteria andCnnameGreaterThanOrEqualTo(String value) {
			addCriterion("cnname >=", value, "cnname");
			return (Criteria) this;
		}

		public Criteria andCnnameLessThan(String value) {
			addCriterion("cnname <", value, "cnname");
			return (Criteria) this;
		}

		public Criteria andCnnameLessThanOrEqualTo(String value) {
			addCriterion("cnname <=", value, "cnname");
			return (Criteria) this;
		}

		public Criteria andCnnameLike(String value) {
			addCriterion("cnname like", value, "cnname");
			return (Criteria) this;
		}

		public Criteria andCnnameNotLike(String value) {
			addCriterion("cnname not like", value, "cnname");
			return (Criteria) this;
		}

		public Criteria andCnnameIn(List<String> values) {
			addCriterion("cnname in", values, "cnname");
			return (Criteria) this;
		}

		public Criteria andCnnameNotIn(List<String> values) {
			addCriterion("cnname not in", values, "cnname");
			return (Criteria) this;
		}

		public Criteria andCnnameBetween(String value1, String value2) {
			addCriterion("cnname between", value1, value2, "cnname");
			return (Criteria) this;
		}

		public Criteria andCnnameNotBetween(String value1, String value2) {
			addCriterion("cnname not between", value1, value2, "cnname");
			return (Criteria) this;
		}

		public Criteria andEnnameIsNull() {
			addCriterion("enname is null");
			return (Criteria) this;
		}

		public Criteria andEnnameIsNotNull() {
			addCriterion("enname is not null");
			return (Criteria) this;
		}

		public Criteria andEnnameEqualTo(String value) {
			addCriterion("enname =", value, "enname");
			return (Criteria) this;
		}

		public Criteria andEnnameNotEqualTo(String value) {
			addCriterion("enname <>", value, "enname");
			return (Criteria) this;
		}

		public Criteria andEnnameGreaterThan(String value) {
			addCriterion("enname >", value, "enname");
			return (Criteria) this;
		}

		public Criteria andEnnameGreaterThanOrEqualTo(String value) {
			addCriterion("enname >=", value, "enname");
			return (Criteria) this;
		}

		public Criteria andEnnameLessThan(String value) {
			addCriterion("enname <", value, "enname");
			return (Criteria) this;
		}

		public Criteria andEnnameLessThanOrEqualTo(String value) {
			addCriterion("enname <=", value, "enname");
			return (Criteria) this;
		}

		public Criteria andEnnameLike(String value) {
			addCriterion("enname like", value, "enname");
			return (Criteria) this;
		}

		public Criteria andEnnameNotLike(String value) {
			addCriterion("enname not like", value, "enname");
			return (Criteria) this;
		}

		public Criteria andEnnameIn(List<String> values) {
			addCriterion("enname in", values, "enname");
			return (Criteria) this;
		}

		public Criteria andEnnameNotIn(List<String> values) {
			addCriterion("enname not in", values, "enname");
			return (Criteria) this;
		}

		public Criteria andEnnameBetween(String value1, String value2) {
			addCriterion("enname between", value1, value2, "enname");
			return (Criteria) this;
		}

		public Criteria andEnnameNotBetween(String value1, String value2) {
			addCriterion("enname not between", value1, value2, "enname");
			return (Criteria) this;
		}

		public Criteria andCtimeIsNull() {
			addCriterion("ctime is null");
			return (Criteria) this;
		}

		public Criteria andCtimeIsNotNull() {
			addCriterion("ctime is not null");
			return (Criteria) this;
		}

		public Criteria andCtimeEqualTo(Long value) {
			addCriterion("ctime =", value, "ctime");
			return (Criteria) this;
		}

		public Criteria andCtimeNotEqualTo(Long value) {
			addCriterion("ctime <>", value, "ctime");
			return (Criteria) this;
		}

		public Criteria andCtimeGreaterThan(Long value) {
			addCriterion("ctime >", value, "ctime");
			return (Criteria) this;
		}

		public Criteria andCtimeGreaterThanOrEqualTo(Long value) {
			addCriterion("ctime >=", value, "ctime");
			return (Criteria) this;
		}

		public Criteria andCtimeLessThan(Long value) {
			addCriterion("ctime <", value, "ctime");
			return (Criteria) this;
		}

		public Criteria andCtimeLessThanOrEqualTo(Long value) {
			addCriterion("ctime <=", value, "ctime");
			return (Criteria) this;
		}

		public Criteria andCtimeIn(List<Long> values) {
			addCriterion("ctime in", values, "ctime");
			return (Criteria) this;
		}

		public Criteria andCtimeNotIn(List<Long> values) {
			addCriterion("ctime not in", values, "ctime");
			return (Criteria) this;
		}

		public Criteria andCtimeBetween(Long value1, Long value2) {
			addCriterion("ctime between", value1, value2, "ctime");
			return (Criteria) this;
		}

		public Criteria andCtimeNotBetween(Long value1, Long value2) {
			addCriterion("ctime not between", value1, value2, "ctime");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table company
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
     * This class corresponds to the database table company
     *
     * @mbg.generated do_not_delete_during_merge Tue May 07 09:38:49 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}