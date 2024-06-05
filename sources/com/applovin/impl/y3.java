package com.applovin.impl;

import android.content.Context;
import com.applovin.impl.sdk.t;

public abstract class y3 {

    /* renamed from: a  reason: collision with root package name */
    private static final a f13494a = new a("Age Restricted User", qj.f11009m);

    /* renamed from: b  reason: collision with root package name */
    private static final a f13495b = new a("Has User Consent", qj.f11008l);

    /* renamed from: c  reason: collision with root package name */
    private static final a f13496c = new a("\"Do Not Sell\"", qj.f11010n);

    public static class a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final String f13497a;

        /* renamed from: b  reason: collision with root package name */
        private final qj f13498b;

        a(String str, qj qjVar) {
            this.f13497a = str;
            this.f13498b = qjVar;
        }

        public Boolean b(Context context) {
            if (context != null) {
                return (Boolean) sj.a(this.f13498b, (Object) null, context);
            }
            t.h("AppLovinSdk", "Failed to get value for key: " + this.f13498b);
            return null;
        }

        public String a() {
            return this.f13497a;
        }

        public String a(Context context) {
            Boolean b10 = b(context);
            return b10 != null ? b10.toString() : "No value set";
        }
    }

    private static boolean a(qj qjVar, Boolean bool, Context context) {
        if (context == null) {
            t.h("AppLovinSdk", "Failed to update compliance value for key: " + qjVar);
            return false;
        }
        Boolean bool2 = (Boolean) sj.a(qjVar, (Object) null, context);
        sj.b(qjVar, (Object) bool, context);
        if (bool2 == null || bool2 != bool) {
            return true;
        }
        return false;
    }

    public static a b() {
        return f13495b;
    }

    public static a c() {
        return f13494a;
    }

    public static boolean b(boolean z10, Context context) {
        return a(qj.f11008l, Boolean.valueOf(z10), context);
    }

    public static boolean c(boolean z10, Context context) {
        return a(qj.f11009m, Boolean.valueOf(z10), context);
    }

    public static a a() {
        return f13496c;
    }

    public static boolean a(boolean z10, Context context) {
        return a(qj.f11010n, Boolean.valueOf(z10), context);
    }

    public static String a(Context context) {
        return a(f13494a, context) + a(f13495b, context) + a(f13496c, context);
    }

    private static String a(a aVar, Context context) {
        return "\n" + aVar.f13497a + " - " + aVar.a(context);
    }
}
