package com.example.typevariable;

import com.example.TypeUtils;
import com.example.typevariable.vo.Person;

import java.lang.reflect.Field;
import java.lang.reflect.Type;

/**
 * @author kairong.liu
 * @description
 * @date 2023-12-07 09:50
 */
public class TypeVariableExample {


    public static void main(String[] args) {
        Field[] fields = Person.class.getDeclaredFields();
        Type genericType = fields[0].getGenericType();
        System.out.println(TypeUtils.getTypeName(genericType));
    }

}
