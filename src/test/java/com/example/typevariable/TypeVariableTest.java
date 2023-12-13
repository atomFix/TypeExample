package com.example.typevariable;

import com.example.TypeUtils;
import com.example.typevariable.vo.Person;
import com.example.typevariable.vo.Student;
import com.example.typevariable.vo.TestA;
import org.junit.jupiter.api.Test;


import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.List;

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

        System.out.println(Person.class.getTypeName());
        System.out.println(TypeUtils.getTypeName(Student.class.getGenericSuperclass()));
        Type actualTypeArgument = ((ParameterizedType) Student.class.getGenericSuperclass()).getActualTypeArguments()[0];
        System.out.println(actualTypeArgument.getTypeName());

        TestA<String> testA = new TestA<>();
        System.out.println(TypeUtils.getTypeName(testA.getClass().getGenericSuperclass()));
        actualTypeArgument = ((ParameterizedType) TestA.class.getGenericSuperclass()).getActualTypeArguments()[0];
        System.out.println(actualTypeArgument.getTypeName());

        TypeVariable<Class<TestA>> typeParameter = TestA.class.getTypeParameters()[0];
        System.out.println(typeParameter.getTypeName());
    }

}
