package com.google.protobuf;

import com.applovin.mediation.MaxReward;

/* compiled from: JavaType */
public enum g0 {
    VOID(Void.class, Void.class, (Class<?>) null),
    INT(r4, Integer.class, 0),
    LONG(Long.TYPE, Long.class, 0L),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.TYPE, Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.TYPE, Boolean.class, Boolean.FALSE),
    STRING(String.class, String.class, MaxReward.DEFAULT_LABEL),
    BYTE_STRING(i.class, i.class, i.f27039b),
    ENUM(r4, Integer.class, (Class<?>) null),
    MESSAGE(Object.class, Object.class, (Class<?>) null);
    

    /* renamed from: a  reason: collision with root package name */
    private final Class<?> f27030a;

    /* renamed from: b  reason: collision with root package name */
    private final Class<?> f27031b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f27032c;

    private g0(Class<?> cls, Class<?> cls2, Object obj) {
        this.f27030a = cls;
        this.f27031b = cls2;
        this.f27032c = obj;
    }

    public Class<?> c() {
        return this.f27031b;
    }
}
