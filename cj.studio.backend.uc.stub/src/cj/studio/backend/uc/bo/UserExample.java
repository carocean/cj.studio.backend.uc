package cj.studio.backend.uc.bo;

import java.util.ArrayList;
import java.util.List;

public class UserExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table user
	 * @mbg.generated  Sat May 11 15:47:57 CST 2019
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table user
	 * @mbg.generated  Sat May 11 15:47:57 CST 2019
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table user
	 * @mbg.generated  Sat May 11 15:47:57 CST 2019
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user
	 * @mbg.generated  Sat May 11 15:47:57 CST 2019
	 */
	public UserExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user
	 * @mbg.generated  Sat May 11 15:47:57 CST 2019
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user
	 * @mbg.generated  Sat May 11 15:47:57 CST 2019
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user
	 * @mbg.generated  Sat May 11 15:47:57 CST 2019
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user
	 * @mbg.generated  Sat May 11 15:47:57 CST 2019
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user
	 * @mbg.generated  Sat May 11 15:47:57 CST 2019
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user
	 * @mbg.generated  Sat May 11 15:47:57 CST 2019
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user
	 * @mbg.generated  Sat May 11 15:47:57 CST 2019
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user
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
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user
	 * @mbg.generated  Sat May 11 15:47:57 CST 2019
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user
	 * @mbg.generated  Sat May 11 15:47:57 CST 2019
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table user
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

		public Criteria andRealnameIsNull() {
			addCriterion("realName is null");
			return (Criteria) this;
		}

		public Criteria andRealnameIsNotNull() {
			addCriterion("realName is not null");
			return (Criteria) this;
		}

		public Criteria andRealnameEqualTo(String value) {
			addCriterion("realName =", value, "realname");
			return (Criteria) this;
		}

		public Criteria andRealnameNotEqualTo(String value) {
			addCriterion("realName <>", value, "realname");
			return (Criteria) this;
		}

		public Criteria andRealnameGreaterThan(String value) {
			addCriterion("realName >", value, "realname");
			return (Criteria) this;
		}

		public Criteria andRealnameGreaterThanOrEqualTo(String value) {
			addCriterion("realName >=", value, "realname");
			return (Criteria) this;
		}

		public Criteria andRealnameLessThan(String value) {
			addCriterion("realName <", value, "realname");
			return (Criteria) this;
		}

		public Criteria andRealnameLessThanOrEqualTo(String value) {
			addCriterion("realName <=", value, "realname");
			return (Criteria) this;
		}

		public Criteria andRealnameLike(String value) {
			addCriterion("realName like", value, "realname");
			return (Criteria) this;
		}

		public Criteria andRealnameNotLike(String value) {
			addCriterion("realName not like", value, "realname");
			return (Criteria) this;
		}

		public Criteria andRealnameIn(List<String> values) {
			addCriterion("realName in", values, "realname");
			return (Criteria) this;
		}

		public Criteria andRealnameNotIn(List<String> values) {
			addCriterion("realName not in", values, "realname");
			return (Criteria) this;
		}

		public Criteria andRealnameBetween(String value1, String value2) {
			addCriterion("realName between", value1, value2, "realname");
			return (Criteria) this;
		}

		public Criteria andRealnameNotBetween(String value1, String value2) {
			addCriterion("realName not between", value1, value2, "realname");
			return (Criteria) this;
		}

		public Criteria andNicknameIsNull() {
			addCriterion("nickName is null");
			return (Criteria) this;
		}

		public Criteria andNicknameIsNotNull() {
			addCriterion("nickName is not null");
			return (Criteria) this;
		}

		public Criteria andNicknameEqualTo(String value) {
			addCriterion("nickName =", value, "nickname");
			return (Criteria) this;
		}

		public Criteria andNicknameNotEqualTo(String value) {
			addCriterion("nickName <>", value, "nickname");
			return (Criteria) this;
		}

		public Criteria andNicknameGreaterThan(String value) {
			addCriterion("nickName >", value, "nickname");
			return (Criteria) this;
		}

		public Criteria andNicknameGreaterThanOrEqualTo(String value) {
			addCriterion("nickName >=", value, "nickname");
			return (Criteria) this;
		}

		public Criteria andNicknameLessThan(String value) {
			addCriterion("nickName <", value, "nickname");
			return (Criteria) this;
		}

		public Criteria andNicknameLessThanOrEqualTo(String value) {
			addCriterion("nickName <=", value, "nickname");
			return (Criteria) this;
		}

		public Criteria andNicknameLike(String value) {
			addCriterion("nickName like", value, "nickname");
			return (Criteria) this;
		}

		public Criteria andNicknameNotLike(String value) {
			addCriterion("nickName not like", value, "nickname");
			return (Criteria) this;
		}

		public Criteria andNicknameIn(List<String> values) {
			addCriterion("nickName in", values, "nickname");
			return (Criteria) this;
		}

		public Criteria andNicknameNotIn(List<String> values) {
			addCriterion("nickName not in", values, "nickname");
			return (Criteria) this;
		}

		public Criteria andNicknameBetween(String value1, String value2) {
			addCriterion("nickName between", value1, value2, "nickname");
			return (Criteria) this;
		}

		public Criteria andNicknameNotBetween(String value1, String value2) {
			addCriterion("nickName not between", value1, value2, "nickname");
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

		public Criteria andSexEqualTo(Byte value) {
			addCriterion("sex =", value, "sex");
			return (Criteria) this;
		}

		public Criteria andSexNotEqualTo(Byte value) {
			addCriterion("sex <>", value, "sex");
			return (Criteria) this;
		}

		public Criteria andSexGreaterThan(Byte value) {
			addCriterion("sex >", value, "sex");
			return (Criteria) this;
		}

		public Criteria andSexGreaterThanOrEqualTo(Byte value) {
			addCriterion("sex >=", value, "sex");
			return (Criteria) this;
		}

		public Criteria andSexLessThan(Byte value) {
			addCriterion("sex <", value, "sex");
			return (Criteria) this;
		}

		public Criteria andSexLessThanOrEqualTo(Byte value) {
			addCriterion("sex <=", value, "sex");
			return (Criteria) this;
		}

		public Criteria andSexIn(List<Byte> values) {
			addCriterion("sex in", values, "sex");
			return (Criteria) this;
		}

		public Criteria andSexNotIn(List<Byte> values) {
			addCriterion("sex not in", values, "sex");
			return (Criteria) this;
		}

		public Criteria andSexBetween(Byte value1, Byte value2) {
			addCriterion("sex between", value1, value2, "sex");
			return (Criteria) this;
		}

		public Criteria andSexNotBetween(Byte value1, Byte value2) {
			addCriterion("sex not between", value1, value2, "sex");
			return (Criteria) this;
		}

		public Criteria andFaceIsNull() {
			addCriterion("face is null");
			return (Criteria) this;
		}

		public Criteria andFaceIsNotNull() {
			addCriterion("face is not null");
			return (Criteria) this;
		}

		public Criteria andFaceEqualTo(String value) {
			addCriterion("face =", value, "face");
			return (Criteria) this;
		}

		public Criteria andFaceNotEqualTo(String value) {
			addCriterion("face <>", value, "face");
			return (Criteria) this;
		}

		public Criteria andFaceGreaterThan(String value) {
			addCriterion("face >", value, "face");
			return (Criteria) this;
		}

		public Criteria andFaceGreaterThanOrEqualTo(String value) {
			addCriterion("face >=", value, "face");
			return (Criteria) this;
		}

		public Criteria andFaceLessThan(String value) {
			addCriterion("face <", value, "face");
			return (Criteria) this;
		}

		public Criteria andFaceLessThanOrEqualTo(String value) {
			addCriterion("face <=", value, "face");
			return (Criteria) this;
		}

		public Criteria andFaceLike(String value) {
			addCriterion("face like", value, "face");
			return (Criteria) this;
		}

		public Criteria andFaceNotLike(String value) {
			addCriterion("face not like", value, "face");
			return (Criteria) this;
		}

		public Criteria andFaceIn(List<String> values) {
			addCriterion("face in", values, "face");
			return (Criteria) this;
		}

		public Criteria andFaceNotIn(List<String> values) {
			addCriterion("face not in", values, "face");
			return (Criteria) this;
		}

		public Criteria andFaceBetween(String value1, String value2) {
			addCriterion("face between", value1, value2, "face");
			return (Criteria) this;
		}

		public Criteria andFaceNotBetween(String value1, String value2) {
			addCriterion("face not between", value1, value2, "face");
			return (Criteria) this;
		}

		public Criteria andPhraseIsNull() {
			addCriterion("phrase is null");
			return (Criteria) this;
		}

		public Criteria andPhraseIsNotNull() {
			addCriterion("phrase is not null");
			return (Criteria) this;
		}

		public Criteria andPhraseEqualTo(String value) {
			addCriterion("phrase =", value, "phrase");
			return (Criteria) this;
		}

		public Criteria andPhraseNotEqualTo(String value) {
			addCriterion("phrase <>", value, "phrase");
			return (Criteria) this;
		}

		public Criteria andPhraseGreaterThan(String value) {
			addCriterion("phrase >", value, "phrase");
			return (Criteria) this;
		}

		public Criteria andPhraseGreaterThanOrEqualTo(String value) {
			addCriterion("phrase >=", value, "phrase");
			return (Criteria) this;
		}

		public Criteria andPhraseLessThan(String value) {
			addCriterion("phrase <", value, "phrase");
			return (Criteria) this;
		}

		public Criteria andPhraseLessThanOrEqualTo(String value) {
			addCriterion("phrase <=", value, "phrase");
			return (Criteria) this;
		}

		public Criteria andPhraseLike(String value) {
			addCriterion("phrase like", value, "phrase");
			return (Criteria) this;
		}

		public Criteria andPhraseNotLike(String value) {
			addCriterion("phrase not like", value, "phrase");
			return (Criteria) this;
		}

		public Criteria andPhraseIn(List<String> values) {
			addCriterion("phrase in", values, "phrase");
			return (Criteria) this;
		}

		public Criteria andPhraseNotIn(List<String> values) {
			addCriterion("phrase not in", values, "phrase");
			return (Criteria) this;
		}

		public Criteria andPhraseBetween(String value1, String value2) {
			addCriterion("phrase between", value1, value2, "phrase");
			return (Criteria) this;
		}

		public Criteria andPhraseNotBetween(String value1, String value2) {
			addCriterion("phrase not between", value1, value2, "phrase");
			return (Criteria) this;
		}

		public Criteria andCreatetimeIsNull() {
			addCriterion("createTime is null");
			return (Criteria) this;
		}

		public Criteria andCreatetimeIsNotNull() {
			addCriterion("createTime is not null");
			return (Criteria) this;
		}

		public Criteria andCreatetimeEqualTo(Long value) {
			addCriterion("createTime =", value, "createtime");
			return (Criteria) this;
		}

		public Criteria andCreatetimeNotEqualTo(Long value) {
			addCriterion("createTime <>", value, "createtime");
			return (Criteria) this;
		}

		public Criteria andCreatetimeGreaterThan(Long value) {
			addCriterion("createTime >", value, "createtime");
			return (Criteria) this;
		}

		public Criteria andCreatetimeGreaterThanOrEqualTo(Long value) {
			addCriterion("createTime >=", value, "createtime");
			return (Criteria) this;
		}

		public Criteria andCreatetimeLessThan(Long value) {
			addCriterion("createTime <", value, "createtime");
			return (Criteria) this;
		}

		public Criteria andCreatetimeLessThanOrEqualTo(Long value) {
			addCriterion("createTime <=", value, "createtime");
			return (Criteria) this;
		}

		public Criteria andCreatetimeIn(List<Long> values) {
			addCriterion("createTime in", values, "createtime");
			return (Criteria) this;
		}

		public Criteria andCreatetimeNotIn(List<Long> values) {
			addCriterion("createTime not in", values, "createtime");
			return (Criteria) this;
		}

		public Criteria andCreatetimeBetween(Long value1, Long value2) {
			addCriterion("createTime between", value1, value2, "createtime");
			return (Criteria) this;
		}

		public Criteria andCreatetimeNotBetween(Long value1, Long value2) {
			addCriterion("createTime not between", value1, value2, "createtime");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table user
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
     * This class corresponds to the database table user
     *
     * @mbg.generated do_not_delete_during_merge Tue May 07 09:38:49 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}