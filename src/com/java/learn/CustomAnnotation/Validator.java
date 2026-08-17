package com.java.learn.CustomAnnotation;

import java.lang.reflect.Field;

public class Validator {

    public static void Validate(Object obj) throws Exception{

        Field[] fieldList = obj.getClass().getDeclaredFields();

        for (Field field : fieldList) {

            if (field.isAnnotationPresent(OnlyNumber.class)) {

                field.setAccessible(true);

                String value = (String) field.get(obj);

                if (!value.matches("\\d+")) {
                    throw new Exception("Field " + field.getName() + " must contain only numbers");
                }
            }
 
        }
    }
    
    public static void ValidateNoXSS(Object obj) throws Exception {
    	
    	 Field[] fieldList = obj.getClass().getDeclaredFields();
         for (Field field : fieldList) {
             if (field.isAnnotationPresent(NoXSS.class)) {
            	 field.setAccessible(true);
                 String value = (String) field.get(obj);

                 if (value != null &&
                     value.matches(".*<\\s*script.*>.*")) {

                     throw new Exception(
                         "XSS content detected in field: " + field.getName()
                     );
                 }
             }
         }
        

    }
}