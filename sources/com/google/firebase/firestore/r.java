package com.google.firebase.firestore;

import java.util.Arrays;
import java.util.List;

/* compiled from: FieldValue */
public abstract class r {

    /* renamed from: a  reason: collision with root package name */
    private static final c f26523a = new c();

    /* renamed from: b  reason: collision with root package name */
    private static final e f26524b = new e();

    /* compiled from: FieldValue */
    static class a extends r {

        /* renamed from: c  reason: collision with root package name */
        private final List<Object> f26525c;

        a(List<Object> list) {
            this.f26525c = list;
        }

        /* access modifiers changed from: package-private */
        public String d() {
            return "FieldValue.arrayRemove";
        }

        /* access modifiers changed from: package-private */
        public List<Object> h() {
            return this.f26525c;
        }
    }

    /* compiled from: FieldValue */
    static class b extends r {

        /* renamed from: c  reason: collision with root package name */
        private final List<Object> f26526c;

        b(List<Object> list) {
            this.f26526c = list;
        }

        /* access modifiers changed from: package-private */
        public String d() {
            return "FieldValue.arrayUnion";
        }

        /* access modifiers changed from: package-private */
        public List<Object> h() {
            return this.f26526c;
        }
    }

    /* compiled from: FieldValue */
    static class c extends r {
        c() {
        }

        /* access modifiers changed from: package-private */
        public String d() {
            return "FieldValue.delete";
        }
    }

    /* compiled from: FieldValue */
    static class d extends r {

        /* renamed from: c  reason: collision with root package name */
        private final Number f26527c;

        d(Number number) {
            this.f26527c = number;
        }

        /* access modifiers changed from: package-private */
        public String d() {
            return "FieldValue.increment";
        }

        /* access modifiers changed from: package-private */
        public Number h() {
            return this.f26527c;
        }
    }

    /* compiled from: FieldValue */
    static class e extends r {
        e() {
        }

        /* access modifiers changed from: package-private */
        public String d() {
            return "FieldValue.serverTimestamp";
        }
    }

    r() {
    }

    public static r a(Object... objArr) {
        return new a(Arrays.asList(objArr));
    }

    public static r b(Object... objArr) {
        return new b(Arrays.asList(objArr));
    }

    public static r c() {
        return f26523a;
    }

    public static r e(double d10) {
        return new d(Double.valueOf(d10));
    }

    public static r f(long j10) {
        return new d(Long.valueOf(j10));
    }

    public static r g() {
        return f26524b;
    }

    /* access modifiers changed from: package-private */
    public abstract String d();
}
