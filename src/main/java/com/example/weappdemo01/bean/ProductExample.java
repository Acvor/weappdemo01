package com.example.weappdemo01.bean;

import java.util.ArrayList;
import java.util.List;

public class ProductExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table product
     *
     * @mbg.generated Mon Aug 07 11:43:55 HKT 2023
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table product
     *
     * @mbg.generated Mon Aug 07 11:43:55 HKT 2023
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table product
     *
     * @mbg.generated Mon Aug 07 11:43:55 HKT 2023
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated Mon Aug 07 11:43:55 HKT 2023
     */
    public ProductExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated Mon Aug 07 11:43:55 HKT 2023
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated Mon Aug 07 11:43:55 HKT 2023
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated Mon Aug 07 11:43:55 HKT 2023
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated Mon Aug 07 11:43:55 HKT 2023
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated Mon Aug 07 11:43:55 HKT 2023
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated Mon Aug 07 11:43:55 HKT 2023
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated Mon Aug 07 11:43:55 HKT 2023
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated Mon Aug 07 11:43:55 HKT 2023
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated Mon Aug 07 11:43:55 HKT 2023
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated Mon Aug 07 11:43:55 HKT 2023
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table product
     *
     * @mbg.generated Mon Aug 07 11:43:55 HKT 2023
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNull() {
            addCriterion("parent_id is null");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNotNull() {
            addCriterion("parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentIdEqualTo(Integer value) {
            addCriterion("parent_id =", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotEqualTo(Integer value) {
            addCriterion("parent_id <>", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThan(Integer value) {
            addCriterion("parent_id >", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("parent_id >=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThan(Integer value) {
            addCriterion("parent_id <", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThanOrEqualTo(Integer value) {
            addCriterion("parent_id <=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdIn(List<Integer> values) {
            addCriterion("parent_id in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotIn(List<Integer> values) {
            addCriterion("parent_id not in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdBetween(Integer value1, Integer value2) {
            addCriterion("parent_id between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("parent_id not between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentNameIsNull() {
            addCriterion("parent_name is null");
            return (Criteria) this;
        }

        public Criteria andParentNameIsNotNull() {
            addCriterion("parent_name is not null");
            return (Criteria) this;
        }

        public Criteria andParentNameEqualTo(String value) {
            addCriterion("parent_name =", value, "parentName");
            return (Criteria) this;
        }

        public Criteria andParentNameNotEqualTo(String value) {
            addCriterion("parent_name <>", value, "parentName");
            return (Criteria) this;
        }

        public Criteria andParentNameGreaterThan(String value) {
            addCriterion("parent_name >", value, "parentName");
            return (Criteria) this;
        }

        public Criteria andParentNameGreaterThanOrEqualTo(String value) {
            addCriterion("parent_name >=", value, "parentName");
            return (Criteria) this;
        }

        public Criteria andParentNameLessThan(String value) {
            addCriterion("parent_name <", value, "parentName");
            return (Criteria) this;
        }

        public Criteria andParentNameLessThanOrEqualTo(String value) {
            addCriterion("parent_name <=", value, "parentName");
            return (Criteria) this;
        }

        public Criteria andParentNameLike(String value) {
            addCriterion("parent_name like", value, "parentName");
            return (Criteria) this;
        }

        public Criteria andParentNameNotLike(String value) {
            addCriterion("parent_name not like", value, "parentName");
            return (Criteria) this;
        }

        public Criteria andParentNameIn(List<String> values) {
            addCriterion("parent_name in", values, "parentName");
            return (Criteria) this;
        }

        public Criteria andParentNameNotIn(List<String> values) {
            addCriterion("parent_name not in", values, "parentName");
            return (Criteria) this;
        }

        public Criteria andParentNameBetween(String value1, String value2) {
            addCriterion("parent_name between", value1, value2, "parentName");
            return (Criteria) this;
        }

        public Criteria andParentNameNotBetween(String value1, String value2) {
            addCriterion("parent_name not between", value1, value2, "parentName");
            return (Criteria) this;
        }

        public Criteria andSrcIsNull() {
            addCriterion("src is null");
            return (Criteria) this;
        }

        public Criteria andSrcIsNotNull() {
            addCriterion("src is not null");
            return (Criteria) this;
        }

        public Criteria andSrcEqualTo(String value) {
            addCriterion("src =", value, "src");
            return (Criteria) this;
        }

        public Criteria andSrcNotEqualTo(String value) {
            addCriterion("src <>", value, "src");
            return (Criteria) this;
        }

        public Criteria andSrcGreaterThan(String value) {
            addCriterion("src >", value, "src");
            return (Criteria) this;
        }

        public Criteria andSrcGreaterThanOrEqualTo(String value) {
            addCriterion("src >=", value, "src");
            return (Criteria) this;
        }

        public Criteria andSrcLessThan(String value) {
            addCriterion("src <", value, "src");
            return (Criteria) this;
        }

        public Criteria andSrcLessThanOrEqualTo(String value) {
            addCriterion("src <=", value, "src");
            return (Criteria) this;
        }

        public Criteria andSrcLike(String value) {
            addCriterion("src like", value, "src");
            return (Criteria) this;
        }

        public Criteria andSrcNotLike(String value) {
            addCriterion("src not like", value, "src");
            return (Criteria) this;
        }

        public Criteria andSrcIn(List<String> values) {
            addCriterion("src in", values, "src");
            return (Criteria) this;
        }

        public Criteria andSrcNotIn(List<String> values) {
            addCriterion("src not in", values, "src");
            return (Criteria) this;
        }

        public Criteria andSrcBetween(String value1, String value2) {
            addCriterion("src between", value1, value2, "src");
            return (Criteria) this;
        }

        public Criteria andSrcNotBetween(String value1, String value2) {
            addCriterion("src not between", value1, value2, "src");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Float value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Float value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Float value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Float value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Float value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Float> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Float> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Float value1, Float value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Float value1, Float value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andImageOneIsNull() {
            addCriterion("image_one is null");
            return (Criteria) this;
        }

        public Criteria andImageOneIsNotNull() {
            addCriterion("image_one is not null");
            return (Criteria) this;
        }

        public Criteria andImageOneEqualTo(String value) {
            addCriterion("image_one =", value, "imageOne");
            return (Criteria) this;
        }

        public Criteria andImageOneNotEqualTo(String value) {
            addCriterion("image_one <>", value, "imageOne");
            return (Criteria) this;
        }

        public Criteria andImageOneGreaterThan(String value) {
            addCriterion("image_one >", value, "imageOne");
            return (Criteria) this;
        }

        public Criteria andImageOneGreaterThanOrEqualTo(String value) {
            addCriterion("image_one >=", value, "imageOne");
            return (Criteria) this;
        }

        public Criteria andImageOneLessThan(String value) {
            addCriterion("image_one <", value, "imageOne");
            return (Criteria) this;
        }

        public Criteria andImageOneLessThanOrEqualTo(String value) {
            addCriterion("image_one <=", value, "imageOne");
            return (Criteria) this;
        }

        public Criteria andImageOneLike(String value) {
            addCriterion("image_one like", value, "imageOne");
            return (Criteria) this;
        }

        public Criteria andImageOneNotLike(String value) {
            addCriterion("image_one not like", value, "imageOne");
            return (Criteria) this;
        }

        public Criteria andImageOneIn(List<String> values) {
            addCriterion("image_one in", values, "imageOne");
            return (Criteria) this;
        }

        public Criteria andImageOneNotIn(List<String> values) {
            addCriterion("image_one not in", values, "imageOne");
            return (Criteria) this;
        }

        public Criteria andImageOneBetween(String value1, String value2) {
            addCriterion("image_one between", value1, value2, "imageOne");
            return (Criteria) this;
        }

        public Criteria andImageOneNotBetween(String value1, String value2) {
            addCriterion("image_one not between", value1, value2, "imageOne");
            return (Criteria) this;
        }

        public Criteria andImageTwoIsNull() {
            addCriterion("image_two is null");
            return (Criteria) this;
        }

        public Criteria andImageTwoIsNotNull() {
            addCriterion("image_two is not null");
            return (Criteria) this;
        }

        public Criteria andImageTwoEqualTo(String value) {
            addCriterion("image_two =", value, "imageTwo");
            return (Criteria) this;
        }

        public Criteria andImageTwoNotEqualTo(String value) {
            addCriterion("image_two <>", value, "imageTwo");
            return (Criteria) this;
        }

        public Criteria andImageTwoGreaterThan(String value) {
            addCriterion("image_two >", value, "imageTwo");
            return (Criteria) this;
        }

        public Criteria andImageTwoGreaterThanOrEqualTo(String value) {
            addCriterion("image_two >=", value, "imageTwo");
            return (Criteria) this;
        }

        public Criteria andImageTwoLessThan(String value) {
            addCriterion("image_two <", value, "imageTwo");
            return (Criteria) this;
        }

        public Criteria andImageTwoLessThanOrEqualTo(String value) {
            addCriterion("image_two <=", value, "imageTwo");
            return (Criteria) this;
        }

        public Criteria andImageTwoLike(String value) {
            addCriterion("image_two like", value, "imageTwo");
            return (Criteria) this;
        }

        public Criteria andImageTwoNotLike(String value) {
            addCriterion("image_two not like", value, "imageTwo");
            return (Criteria) this;
        }

        public Criteria andImageTwoIn(List<String> values) {
            addCriterion("image_two in", values, "imageTwo");
            return (Criteria) this;
        }

        public Criteria andImageTwoNotIn(List<String> values) {
            addCriterion("image_two not in", values, "imageTwo");
            return (Criteria) this;
        }

        public Criteria andImageTwoBetween(String value1, String value2) {
            addCriterion("image_two between", value1, value2, "imageTwo");
            return (Criteria) this;
        }

        public Criteria andImageTwoNotBetween(String value1, String value2) {
            addCriterion("image_two not between", value1, value2, "imageTwo");
            return (Criteria) this;
        }

        public Criteria andImageThreeIsNull() {
            addCriterion("image_three is null");
            return (Criteria) this;
        }

        public Criteria andImageThreeIsNotNull() {
            addCriterion("image_three is not null");
            return (Criteria) this;
        }

        public Criteria andImageThreeEqualTo(String value) {
            addCriterion("image_three =", value, "imageThree");
            return (Criteria) this;
        }

        public Criteria andImageThreeNotEqualTo(String value) {
            addCriterion("image_three <>", value, "imageThree");
            return (Criteria) this;
        }

        public Criteria andImageThreeGreaterThan(String value) {
            addCriterion("image_three >", value, "imageThree");
            return (Criteria) this;
        }

        public Criteria andImageThreeGreaterThanOrEqualTo(String value) {
            addCriterion("image_three >=", value, "imageThree");
            return (Criteria) this;
        }

        public Criteria andImageThreeLessThan(String value) {
            addCriterion("image_three <", value, "imageThree");
            return (Criteria) this;
        }

        public Criteria andImageThreeLessThanOrEqualTo(String value) {
            addCriterion("image_three <=", value, "imageThree");
            return (Criteria) this;
        }

        public Criteria andImageThreeLike(String value) {
            addCriterion("image_three like", value, "imageThree");
            return (Criteria) this;
        }

        public Criteria andImageThreeNotLike(String value) {
            addCriterion("image_three not like", value, "imageThree");
            return (Criteria) this;
        }

        public Criteria andImageThreeIn(List<String> values) {
            addCriterion("image_three in", values, "imageThree");
            return (Criteria) this;
        }

        public Criteria andImageThreeNotIn(List<String> values) {
            addCriterion("image_three not in", values, "imageThree");
            return (Criteria) this;
        }

        public Criteria andImageThreeBetween(String value1, String value2) {
            addCriterion("image_three between", value1, value2, "imageThree");
            return (Criteria) this;
        }

        public Criteria andImageThreeNotBetween(String value1, String value2) {
            addCriterion("image_three not between", value1, value2, "imageThree");
            return (Criteria) this;
        }

        public Criteria andProductDetailIsNull() {
            addCriterion("product_detail is null");
            return (Criteria) this;
        }

        public Criteria andProductDetailIsNotNull() {
            addCriterion("product_detail is not null");
            return (Criteria) this;
        }

        public Criteria andProductDetailEqualTo(String value) {
            addCriterion("product_detail =", value, "productDetail");
            return (Criteria) this;
        }

        public Criteria andProductDetailNotEqualTo(String value) {
            addCriterion("product_detail <>", value, "productDetail");
            return (Criteria) this;
        }

        public Criteria andProductDetailGreaterThan(String value) {
            addCriterion("product_detail >", value, "productDetail");
            return (Criteria) this;
        }

        public Criteria andProductDetailGreaterThanOrEqualTo(String value) {
            addCriterion("product_detail >=", value, "productDetail");
            return (Criteria) this;
        }

        public Criteria andProductDetailLessThan(String value) {
            addCriterion("product_detail <", value, "productDetail");
            return (Criteria) this;
        }

        public Criteria andProductDetailLessThanOrEqualTo(String value) {
            addCriterion("product_detail <=", value, "productDetail");
            return (Criteria) this;
        }

        public Criteria andProductDetailLike(String value) {
            addCriterion("product_detail like", value, "productDetail");
            return (Criteria) this;
        }

        public Criteria andProductDetailNotLike(String value) {
            addCriterion("product_detail not like", value, "productDetail");
            return (Criteria) this;
        }

        public Criteria andProductDetailIn(List<String> values) {
            addCriterion("product_detail in", values, "productDetail");
            return (Criteria) this;
        }

        public Criteria andProductDetailNotIn(List<String> values) {
            addCriterion("product_detail not in", values, "productDetail");
            return (Criteria) this;
        }

        public Criteria andProductDetailBetween(String value1, String value2) {
            addCriterion("product_detail between", value1, value2, "productDetail");
            return (Criteria) this;
        }

        public Criteria andProductDetailNotBetween(String value1, String value2) {
            addCriterion("product_detail not between", value1, value2, "productDetail");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table product
     *
     * @mbg.generated do_not_delete_during_merge Mon Aug 07 11:43:55 HKT 2023
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table product
     *
     * @mbg.generated Mon Aug 07 11:43:55 HKT 2023
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
}