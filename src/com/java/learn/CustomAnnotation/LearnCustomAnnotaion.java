package com.java.learn.CustomAnnotation;

public class LearnCustomAnnotaion {

    @OnlyNumber
    private String mobile;
    
    @NoXSS
    private String name;

    public LearnCustomAnnotaion(String mobile,String name) {
        this.mobile = mobile;
        this.name = name;
    }

    public static void main(String[] args) {

        LearnCustomAnnotaion obj = new LearnCustomAnnotaion("1","valan");
        LearnCustomAnnotaion obj2 = new LearnCustomAnnotaion("1","<script>alert('XSS')</script>");

        try {
            Validator.Validate(obj);
            Validator.ValidateNoXSS(obj2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}