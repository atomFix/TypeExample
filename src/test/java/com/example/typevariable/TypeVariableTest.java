package com.example.typevariable;

import com.example.TypeUtils;
import com.example.typevariable.vo.Person;
import org.junit.jupiter.api.Test;


import java.lang.reflect.Field;
import java.lang.reflect.Type;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author kairong.liu
 * @description
 * @date 2023-12-07 09:50
 */
class TypeVariableTest {

    @Test
    void testTypeStrategy() {
        Field[] fields = Person.class.getDeclaredFields();
        Field field = fields[0];
        Type genericType = field.getGenericType();
        assertEquals("sex", field.getName());
        assertEquals("TypeVariable", TypeUtils.getTypeName(genericType));


    }

}
