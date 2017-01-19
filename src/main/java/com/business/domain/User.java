package com.business.domain;

import java.util.List;

public class User {

    private Integer id;


    private String username;


    private String password;


    private Integer productId;

    private Product product;

    private List<Book> books;

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }


    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }


    public String getPassword() {
        return password;
    }


    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getProductId() {
        return productId;
    }


    public void setProductId(Integer productId) {
        this.productId = productId;
    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", productId=" + productId +
                ", product=" + product +
                ", books=" + books +
                '}';
    }
}