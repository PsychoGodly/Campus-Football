package io.grpc.internal;

import java.util.ArrayList;

/* compiled from: InsightBuilder */
public final class x0 {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<String> f35436a = new ArrayList<>();

    public x0 a(Object obj) {
        this.f35436a.add(String.valueOf(obj));
        return this;
    }

    public x0 b(String str, Object obj) {
        ArrayList<String> arrayList = this.f35436a;
        arrayList.add(str + "=" + obj);
        return this;
    }

    public String toString() {
        return this.f35436a.toString();
    }
}
