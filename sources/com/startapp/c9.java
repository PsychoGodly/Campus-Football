package com.startapp;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
/* compiled from: Sta */
public @interface c9 {
    String decider() default "";

    boolean extendsClass() default false;

    String packageName() default "";
}
