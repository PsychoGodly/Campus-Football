package com.google.firebase.firestore;

import com.applovin.mediation.MaxReward;
import java.util.Objects;

/* compiled from: AggregateField */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    private final q f26415a;

    /* renamed from: b  reason: collision with root package name */
    private final String f26416b;

    /* renamed from: c  reason: collision with root package name */
    private final String f26417c;

    /* compiled from: AggregateField */
    public static class b extends a {
        private b(q qVar) {
            super(qVar, "average");
        }
    }

    /* compiled from: AggregateField */
    public static class c extends a {
        private c() {
            super((q) null, "count");
        }
    }

    /* compiled from: AggregateField */
    public static class d extends a {
        private d(q qVar) {
            super(qVar, "sum");
        }
    }

    public static b a(String str) {
        return new b(q.b(str));
    }

    public static c b() {
        return new c();
    }

    public static d f(String str) {
        return new d(q.b(str));
    }

    public String c() {
        return this.f26417c;
    }

    public String d() {
        q qVar = this.f26415a;
        return qVar == null ? MaxReward.DEFAULT_LABEL : qVar.toString();
    }

    public String e() {
        return this.f26416b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        q qVar = this.f26415a;
        if (qVar == null || aVar.f26415a == null) {
            if (qVar == null && aVar.f26415a == null) {
                return true;
            }
            return false;
        } else if (!this.f26416b.equals(aVar.e()) || !d().equals(aVar.d())) {
            return false;
        } else {
            return true;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{e(), d()});
    }

    private a(q qVar, String str) {
        String str2;
        this.f26415a = qVar;
        this.f26416b = str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        if (qVar == null) {
            str2 = MaxReward.DEFAULT_LABEL;
        } else {
            str2 = "_" + qVar;
        }
        sb2.append(str2);
        this.f26417c = sb2.toString();
    }
}
