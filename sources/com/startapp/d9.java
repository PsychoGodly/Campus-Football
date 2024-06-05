package com.startapp;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
/* compiled from: Sta */
public @interface d9 {
    boolean complex() default false;

    Class innerValue() default String.class;

    Class key() default String.class;

    String name() default "";

    Class<? extends e9> parser() default e9.class;

    Class type() default Object.class;

    Class value() default String.class;
}
