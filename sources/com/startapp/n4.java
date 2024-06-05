package com.startapp;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: Sta */
public class n4<T> {

    /* renamed from: a  reason: collision with root package name */
    public volatile i2<Object> f16170a;

    /* renamed from: b  reason: collision with root package name */
    public volatile AtomicReference<Object> f16171b;

    public n4(i2<T> i2Var) {
        this.f16170a = i2Var;
    }

    public T a() {
        AtomicReference<Object> atomicReference = this.f16171b;
        if (atomicReference == null) {
            synchronized (this) {
                atomicReference = this.f16171b;
                if (atomicReference == null) {
                    i2<Object> i2Var = this.f16170a;
                    Object obj = null;
                    this.f16170a = null;
                    if (i2Var != null) {
                        obj = i2Var.a();
                    }
                    AtomicReference<Object> atomicReference2 = new AtomicReference<>(obj);
                    this.f16171b = atomicReference2;
                    atomicReference = atomicReference2;
                }
            }
        }
        T t10 = atomicReference.get();
        if (t10 != null) {
            return t10;
        }
        throw new IllegalStateException();
    }
}
