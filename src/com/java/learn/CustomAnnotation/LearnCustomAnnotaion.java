package com.java.learn.CustomAnnotation;

public class LearnCustomAnnotaion {

    @OnlyNumber
    private String mobile;

    public LearnCustomAnnotaion(String mobile) {
        this.mobile = mobile;
    }

    public static void main(String[] args) {

        LearnCustomAnnotaion obj = new LearnCustomAnnotaion("valan");

        try {
            Validator.Validate(obj);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}