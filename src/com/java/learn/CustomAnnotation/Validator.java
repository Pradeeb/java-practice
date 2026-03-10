package com.java.learn.CustomAnnotation;

import java.lang.reflect.Field;

public class Validator {

    public static void Validate(Object obj) throws Exception {

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
}