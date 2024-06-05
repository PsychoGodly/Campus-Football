package com.startapp;

import java.util.Comparator;

/* compiled from: Sta */
public class r1<T> implements Comparator<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Comparator<T> f16339a;

    /* renamed from: b  reason: collision with root package name */
    public final Comparator<T> f16340b;

    public r1(Comparator<T> comparator, Comparator<T> comparator2) {
        this.f16339a = comparator;
        this.f16340b = comparator2;
    }

    public int compare(T t10, T t11) {
        int compare = this.f16339a.compare(t10, t11);
        return compare == 0 ? this.f16340b.compare(t10, t11) : compare;
    }
}
