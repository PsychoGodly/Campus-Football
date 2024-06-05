package com.startapp;

import com.applovin.mediation.MaxReward;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/* compiled from: Sta */
public class h4 {
    public static String a(Field field) {
        Annotation[] declaredAnnotations = field.getDeclaredAnnotations();
        if (declaredAnnotations != null && declaredAnnotations.length > 0) {
            Annotation annotation = field.getDeclaredAnnotations()[0];
            if (annotation.annotationType().equals(d9.class)) {
                d9 d9Var = (d9) annotation;
                if (!MaxReward.DEFAULT_LABEL.equals(d9Var.name())) {
                    return d9Var.name();
                }
            }
        }
        return field.getName();
    }

    public static boolean b(Field field) {
        Annotation[] declaredAnnotations = field.getDeclaredAnnotations();
        if (declaredAnnotations == null || declaredAnnotations.length == 0) {
            return false;
        }
        Annotation annotation = field.getDeclaredAnnotations()[0];
        if (!annotation.annotationType().equals(d9.class)) {
            return false;
        }
        return ((d9) annotation).complex();
    }
}
