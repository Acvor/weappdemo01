package com.example.weappdemo01.bean;

import java.io.Serializable;

public class Product implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.id
     *
     * @mbg.generated Mon Aug 07 11:43:55 HKT 2023
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.parent_id
     *
     * @mbg.generated Mon Aug 07 11:43:55 HKT 2023
     */
    private Integer parentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.parent_name
     *
     * @mbg.generated Mon Aug 07 11:43:55 HKT 2023
     */
    private String parentName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.src
     *
     * @mbg.generated Mon Aug 07 11:43:55 HKT 2023
     */
    private String src;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.title
     *
     * @mbg.generated Mon Aug 07 11:43:55 HKT 2023
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.price
     *
     * @mbg.generated Mon Aug 07 11:43:55 HKT 2023
     */
    private Float price;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.image_one
     *
     * @mbg.generated Mon Aug 07 11:43:55 HKT 2023
     */
    private String imageOne;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.image_two
     *
     * @mbg.generated Mon Aug 07 11:43:55 HKT 2023
     */
    private String imageTwo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.image_three
     *
     * @mbg.generated Mon Aug 07 11:43:55 HKT 2023
     */
    private String imageThree;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.product_detail
     *
     * @mbg.generated Mon Aug 07 11:43:55 HKT 2023
     */
    private String productDetail;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table product
     *
     * @mbg.generated Mon Aug 07 11:43:55 HKT 2023
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.id
     *
     * @return the value of product.id
     *
     * @mbg.generated Mon Aug 07 11:43:55 HKT 2023
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated Mon Aug 07 11:43:55 HKT 2023
     */
    public Product withId(Integer id) {
        this.setId(id);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.id
     *
     * @param id the value for product.id
     *
     * @mbg.generated Mon Aug 07 11:43:55 HKT 2023
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.parent_id
     *
     * @return the value of product.parent_id
     *
     * @mbg.generated Mon Aug 07 11:43:55 HKT 2023
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated Mon Aug 07 11:43:55 HKT 2023
     */
    public Product withParentId(Integer parentId) {
        this.setParentId(parentId);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.parent_id
     *
     * @param parentId the value for product.parent_id
     *
     * @mbg.generated Mon Aug 07 11:43:55 HKT 2023
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.parent_name
     *
     * @return the value of product.parent_name
     *
     * @mbg.generated Mon Aug 07 11:43:55 HKT 2023
     */
    public String getParentName() {
        return parentName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated Mon Aug 07 11:43:55 HKT 2023
     */
    public Product withParentName(String parentName) {
        this.setParentName(parentName);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.parent_name
     *
     * @param parentName the value for product.parent_name
     *
     * @mbg.generated Mon Aug 07 11:43:55 HKT 2023
     */
    public void setParentName(String parentName) {
        this.parentName = parentName == null ? null : parentName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.src
     *
     * @return the value of product.src
     *
     * @mbg.generated Mon Aug 07 11:43:55 HKT 2023
     */
    public String getSrc() {
        return src;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated Mon Aug 07 11:43:55 HKT 2023
     */
    public Product withSrc(String src) {
        this.setSrc(src);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.src
     *
     * @param src the value for product.src
     *
     * @mbg.generated Mon Aug 07 11:43:55 HKT 2023
     */
    public void setSrc(String src) {
        this.src = src == null ? null : src.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.title
     *
     * @return the value of product.title
     *
     * @mbg.generated Mon Aug 07 11:43:55 HKT 2023
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated Mon Aug 07 11:43:55 HKT 2023
     */
    public Product withTitle(String title) {
        this.setTitle(title);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.title
     *
     * @param title the value for product.title
     *
     * @mbg.generated Mon Aug 07 11:43:55 HKT 2023
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.price
     *
     * @return the value of product.price
     *
     * @mbg.generated Mon Aug 07 11:43:55 HKT 2023
     */
    public Float getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated Mon Aug 07 11:43:55 HKT 2023
     */
    public Product withPrice(Float price) {
        this.setPrice(price);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.price
     *
     * @param price the value for product.price
     *
     * @mbg.generated Mon Aug 07 11:43:55 HKT 2023
     */
    public void setPrice(Float price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.image_one
     *
     * @return the value of product.image_one
     *
     * @mbg.generated Mon Aug 07 11:43:55 HKT 2023
     */
    public String getImageOne() {
        return imageOne;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated Mon Aug 07 11:43:55 HKT 2023
     */
    public Product withImageOne(String imageOne) {
        this.setImageOne(imageOne);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.image_one
     *
     * @param imageOne the value for product.image_one
     *
     * @mbg.generated Mon Aug 07 11:43:55 HKT 2023
     */
    public void setImageOne(String imageOne) {
        this.imageOne = imageOne == null ? null : imageOne.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.image_two
     *
     * @return the value of product.image_two
     *
     * @mbg.generated Mon Aug 07 11:43:55 HKT 2023
     */
    public String getImageTwo() {
        return imageTwo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated Mon Aug 07 11:43:55 HKT 2023
     */
    public Product withImageTwo(String imageTwo) {
        this.setImageTwo(imageTwo);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.image_two
     *
     * @param imageTwo the value for product.image_two
     *
     * @mbg.generated Mon Aug 07 11:43:55 HKT 2023
     */
    public void setImageTwo(String imageTwo) {
        this.imageTwo = imageTwo == null ? null : imageTwo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.image_three
     *
     * @return the value of product.image_three
     *
     * @mbg.generated Mon Aug 07 11:43:55 HKT 2023
     */
    public String getImageThree() {
        return imageThree;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated Mon Aug 07 11:43:55 HKT 2023
     */
    public Product withImageThree(String imageThree) {
        this.setImageThree(imageThree);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.image_three
     *
     * @param imageThree the value for product.image_three
     *
     * @mbg.generated Mon Aug 07 11:43:55 HKT 2023
     */
    public void setImageThree(String imageThree) {
        this.imageThree = imageThree == null ? null : imageThree.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.product_detail
     *
     * @return the value of product.product_detail
     *
     * @mbg.generated Mon Aug 07 11:43:55 HKT 2023
     */
    public String getProductDetail() {
        return productDetail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated Mon Aug 07 11:43:55 HKT 2023
     */
    public Product withProductDetail(String productDetail) {
        this.setProductDetail(productDetail);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.product_detail
     *
     * @param productDetail the value for product.product_detail
     *
     * @mbg.generated Mon Aug 07 11:43:55 HKT 2023
     */
    public void setProductDetail(String productDetail) {
        this.productDetail = productDetail == null ? null : productDetail.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated Mon Aug 07 11:43:55 HKT 2023
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", parentId=").append(parentId);
        sb.append(", parentName=").append(parentName);
        sb.append(", src=").append(src);
        sb.append(", title=").append(title);
        sb.append(", price=").append(price);
        sb.append(", imageOne=").append(imageOne);
        sb.append(", imageTwo=").append(imageTwo);
        sb.append(", imageThree=").append(imageThree);
        sb.append(", productDetail=").append(productDetail);
        sb.append("]");
        return sb.toString();
    }
}