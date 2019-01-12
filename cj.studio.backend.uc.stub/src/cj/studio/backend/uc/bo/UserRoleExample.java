package cj.studio.backend.uc.bo;

import java.util.ArrayList;
import java.util.List;

public class UserRoleExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table userrole
	 * @mbg.generated  Sat Jan 12 13:47:21 CST 2019
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table userrole
	 * @mbg.generated  Sat Jan 12 13:47:21 CST 2019
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table userrole
	 * @mbg.generated  Sat Jan 12 13:47:21 CST 2019
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table userrole
	 * @mbg.generated  Sat Jan 12 13:47:21 CST 2019
	 */
	public UserRoleExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table userrole
	 * @mbg.generated  Sat Jan 12 13:47:21 CST 2019
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table userrole
	 * @mbg.generated  Sat Jan 12 13:47:21 CST 2019
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table userrole
	 * @mbg.generated  Sat Jan 12 13:47:21 CST 2019
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table userrole
	 * @mbg.generated  Sat Jan 12 13:47:21 CST 2019
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table userrole
	 * @mbg.generated  Sat Jan 12 13:47:21 CST 2019
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table userrole
	 * @mbg.generated  Sat Jan 12 13:47:21 CST 2019
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table userrole
	 * @mbg.generated  Sat Jan 12 13:47:21 CST 2019
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table userrole
	 * @mbg.generated  Sat Jan 12 13:47:21 CST 2019
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table userrole
	 * @mbg.generated  Sat Jan 12 13:47:21 CST 2019
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table userrole
	 * @mbg.generated  Sat Jan 12 13:47:21 CST 2019
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table userrole
	 * @mbg.generated  Sat Jan 12 13:47:21 CST 2019
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

		public Criteria andRolecodeIsNull() {
			addCriterion("roleCode is null");
			return (Criteria) this;
		}

		public Criteria andRolecodeIsNotNull() {
			addCriterion("roleCode is not null");
			return (Criteria) this;
		}

		public Criteria andRolecodeEqualTo(String value) {
			addCriterion("roleCode =", value, "rolecode");
			return (Criteria) this;
		}

		public Criteria andRolecodeNotEqualTo(String value) {
			addCriterion("roleCode <>", value, "rolecode");
			return (Criteria) this;
		}

		public Criteria andRolecodeGreaterThan(String value) {
			addCriterion("roleCode >", value, "rolecode");
			return (Criteria) this;
		}

		public Criteria andRolecodeGreaterThanOrEqualTo(String value) {
			addCriterion("roleCode >=", value, "rolecode");
			return (Criteria) this;
		}

		public Criteria andRolecodeLessThan(String value) {
			addCriterion("roleCode <", value, "rolecode");
			return (Criteria) this;
		}

		public Criteria andRolecodeLessThanOrEqualTo(String value) {
			addCriterion("roleCode <=", value, "rolecode");
			return (Criteria) this;
		}

		public Criteria andRolecodeLike(String value) {
			addCriterion("roleCode like", value, "rolecode");
			return (Criteria) this;
		}

		public Criteria andRolecodeNotLike(String value) {
			addCriterion("roleCode not like", value, "rolecode");
			return (Criteria) this;
		}

		public Criteria andRolecodeIn(List<String> values) {
			addCriterion("roleCode in", values, "rolecode");
			return (Criteria) this;
		}

		public Criteria andRolecodeNotIn(List<String> values) {
			addCriterion("roleCode not in", values, "rolecode");
			return (Criteria) this;
		}

		public Criteria andRolecodeBetween(String value1, String value2) {
			addCriterion("roleCode between", value1, value2, "rolecode");
			return (Criteria) this;
		}

		public Criteria andRolecodeNotBetween(String value1, String value2) {
			addCriterion("roleCode not between", value1, value2, "rolecode");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table userrole
	 * @mbg.generated  Sat Jan 12 13:47:21 CST 2019
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
     * This class corresponds to the database table userrole
     *
     * @mbg.generated do_not_delete_during_merge Fri Jan 11 23:00:56 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}