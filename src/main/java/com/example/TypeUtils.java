package com.example;

import java.lang.reflect.*;

/**
 * @author kairong.liu
 * @description Type Util
 * @date 2023-12-07 09:51
 */
public final class TypeUtils {

    /**
     * print type strategy name
     */
    public static String getTypeName(Type type) {
        if (type == null) {
            return "null";
        }
        if (type instanceof TypeVariable) {
            return "TypeVariable";
        }
        if (type instanceof ParameterizedType) {
            return "ParameterizedType";
        }
        if (type instanceof WildcardType) {
            return "WildcardType";
        }
        if (type instanceof GenericArrayType) {
            return "GenericArrayType";
        }
        if (type instanceof Class) {
            return "class";
        }
        return type.getTypeName();
    }


}
