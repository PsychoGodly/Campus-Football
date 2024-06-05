package com.startapp.sdk.jobs;

import com.startapp.l7;
import java.util.ArrayList;
import java.util.UUID;

/* compiled from: Sta */
public abstract class JobRequest {

    /* renamed from: a  reason: collision with root package name */
    public final String[] f17234a;

    /* renamed from: b  reason: collision with root package name */
    public final UUID f17235b = UUID.randomUUID();

    /* renamed from: c  reason: collision with root package name */
    public final Network f17236c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f17237d;

    /* compiled from: Sta */
    public enum Network {
        ANY,
        UNMETERED
    }

    /* compiled from: Sta */
    public static abstract class a<B extends a<?>> {

        /* renamed from: a  reason: collision with root package name */
        public final String[] f17241a;

        /* renamed from: b  reason: collision with root package name */
        public Network f17242b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f17243c;

        @SafeVarargs
        public a(Class<? extends b>... clsArr) {
            ArrayList arrayList = new ArrayList();
            for (Class<? extends b> name : clsArr) {
                arrayList.add(name.getName());
            }
            this.f17241a = (String[]) arrayList.toArray(new String[0]);
        }
    }

    public JobRequest(a<?> aVar) {
        this.f17234a = aVar.f17241a;
        this.f17236c = aVar.f17242b;
        this.f17237d = aVar.f17243c;
    }

    @SafeVarargs
    public static int a(Class<? extends b>... clsArr) {
        if (clsArr.length == 0) {
            return 0;
        }
        String[] strArr = new String[clsArr.length];
        for (int i10 = 0; i10 < clsArr.length; i10++) {
            strArr[i10] = clsArr[i10].getName();
        }
        return a(strArr);
    }

    public abstract boolean a(l7 l7Var);

    public static int a(String[] strArr) {
        StringBuilder sb2 = new StringBuilder();
        for (String append : strArr) {
            sb2.append(append);
        }
        return sb2.toString().hashCode();
    }
}
