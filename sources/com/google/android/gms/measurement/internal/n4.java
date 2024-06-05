package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.applovin.mediation.MaxReward;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.internal.measurement.zzoc;
import m5.e;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
public final class n4 extends u6 {
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public char f24847c = 0;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public long f24848d = -1;

    /* renamed from: e  reason: collision with root package name */
    private String f24849e;

    /* renamed from: f  reason: collision with root package name */
    private final p4 f24850f = new p4(this, 6, false, false);

    /* renamed from: g  reason: collision with root package name */
    private final p4 f24851g = new p4(this, 6, true, false);

    /* renamed from: h  reason: collision with root package name */
    private final p4 f24852h = new p4(this, 6, false, true);

    /* renamed from: i  reason: collision with root package name */
    private final p4 f24853i = new p4(this, 5, false, false);

    /* renamed from: j  reason: collision with root package name */
    private final p4 f24854j = new p4(this, 5, true, false);

    /* renamed from: k  reason: collision with root package name */
    private final p4 f24855k = new p4(this, 5, false, true);

    /* renamed from: l  reason: collision with root package name */
    private final p4 f24856l = new p4(this, 4, false, false);

    /* renamed from: m  reason: collision with root package name */
    private final p4 f24857m = new p4(this, 3, false, false);

    /* renamed from: n  reason: collision with root package name */
    private final p4 f24858n = new p4(this, 2, false, false);

    n4(w5 w5Var) {
        super(w5Var);
    }

    private final String K() {
        String str;
        synchronized (this) {
            if (this.f24849e == null) {
                this.f24849e = this.f25124a.J() != null ? this.f25124a.J() : "FA";
            }
            q.k(this.f24849e);
            str = this.f24849e;
        }
        return str;
    }

    protected static Object q(String str) {
        if (str == null) {
            return null;
        }
        return new s4(str);
    }

    private static String r(boolean z10, Object obj) {
        String className;
        String str = MaxReward.DEFAULT_LABEL;
        if (obj == null) {
            return str;
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf((long) ((Integer) obj).intValue());
        }
        int i10 = 0;
        if (obj instanceof Long) {
            if (!z10) {
                return String.valueOf(obj);
            }
            Long l10 = (Long) obj;
            if (Math.abs(l10.longValue()) < 100) {
                return String.valueOf(obj);
            }
            if (String.valueOf(obj).charAt(0) == '-') {
                str = "-";
            }
            String valueOf = String.valueOf(Math.abs(l10.longValue()));
            long round = Math.round(Math.pow(10.0d, (double) (valueOf.length() - 1)));
            long round2 = Math.round(Math.pow(10.0d, (double) valueOf.length()) - 1.0d);
            return str + round + "..." + str + round2;
        } else if (obj instanceof Boolean) {
            return String.valueOf(obj);
        } else {
            if (obj instanceof Throwable) {
                Throwable th = (Throwable) obj;
                StringBuilder sb2 = new StringBuilder(z10 ? th.getClass().getName() : th.toString());
                String z11 = z(w5.class.getCanonicalName());
                StackTraceElement[] stackTrace = th.getStackTrace();
                int length = stackTrace.length;
                while (true) {
                    if (i10 >= length) {
                        break;
                    }
                    StackTraceElement stackTraceElement = stackTrace[i10];
                    if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && z(className).equals(z11)) {
                        sb2.append(": ");
                        sb2.append(stackTraceElement);
                        break;
                    }
                    i10++;
                }
                return sb2.toString();
            } else if (obj instanceof s4) {
                return ((s4) obj).f25043a;
            } else {
                if (z10) {
                    return "-";
                }
                return String.valueOf(obj);
            }
        }
    }

    static String s(boolean z10, String str, Object obj, Object obj2, Object obj3) {
        String str2 = MaxReward.DEFAULT_LABEL;
        if (str == null) {
            str = str2;
        }
        String r10 = r(z10, obj);
        String r11 = r(z10, obj2);
        String r12 = r(z10, obj3);
        StringBuilder sb2 = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb2.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(r10)) {
            sb2.append(str2);
            sb2.append(r10);
            str2 = str3;
        }
        if (!TextUtils.isEmpty(r11)) {
            sb2.append(str2);
            sb2.append(r11);
        } else {
            str3 = str2;
        }
        if (!TextUtils.isEmpty(r12)) {
            sb2.append(str3);
            sb2.append(r12);
        }
        return sb2.toString();
    }

    private static String z(String str) {
        if (TextUtils.isEmpty(str)) {
            return MaxReward.DEFAULT_LABEL;
        }
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf != -1) {
            return str.substring(0, lastIndexOf);
        }
        if (!zzoc.zza() || !e0.H0.a(null).booleanValue()) {
            return str;
        }
        return MaxReward.DEFAULT_LABEL;
    }

    public final p4 A() {
        return this.f24857m;
    }

    public final p4 B() {
        return this.f24850f;
    }

    public final p4 C() {
        return this.f24852h;
    }

    public final p4 D() {
        return this.f24851g;
    }

    public final p4 E() {
        return this.f24856l;
    }

    public final p4 F() {
        return this.f24858n;
    }

    public final p4 G() {
        return this.f24853i;
    }

    public final p4 H() {
        return this.f24855k;
    }

    public final p4 I() {
        return this.f24854j;
    }

    public final String J() {
        Pair<String, Long> a10;
        if (e().f25266d == null || (a10 = e().f25266d.a()) == null || a10 == y4.f25264z) {
            return null;
        }
        String valueOf = String.valueOf(a10.second);
        return valueOf + ":" + ((String) a10.first);
    }

    public final /* bridge */ /* synthetic */ f a() {
        return super.a();
    }

    public final /* bridge */ /* synthetic */ y c() {
        return super.c();
    }

    public final /* bridge */ /* synthetic */ m4 d() {
        return super.d();
    }

    public final /* bridge */ /* synthetic */ y4 e() {
        return super.e();
    }

    public final /* bridge */ /* synthetic */ ib f() {
        return super.f();
    }

    public final /* bridge */ /* synthetic */ void g() {
        super.g();
    }

    public final /* bridge */ /* synthetic */ void h() {
        super.h();
    }

    public final /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    /* access modifiers changed from: protected */
    public final boolean n() {
        return false;
    }

    /* access modifiers changed from: protected */
    public final void t(int i10, String str) {
        Log.println(i10, K(), str);
    }

    /* access modifiers changed from: protected */
    public final void u(int i10, boolean z10, boolean z11, String str, Object obj, Object obj2, Object obj3) {
        if (!z10 && x(i10)) {
            t(i10, s(false, str, obj, obj2, obj3));
        }
        if (!z11 && i10 >= 5) {
            q.k(str);
            q5 B = this.f25124a.B();
            if (B == null) {
                t(6, "Scheduler not set. Not logging error/warn");
            } else if (!B.m()) {
                t(6, "Scheduler not initialized. Not logging error/warn");
            } else {
                if (i10 < 0) {
                    i10 = 0;
                }
                B.y(new q4(this, i10 >= 9 ? 8 : i10, str, obj, obj2, obj3));
            }
        }
    }

    /* access modifiers changed from: protected */
    public final boolean x(int i10) {
        return Log.isLoggable(K(), i10);
    }

    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    public final /* bridge */ /* synthetic */ e zzb() {
        return super.zzb();
    }

    public final /* bridge */ /* synthetic */ e zzd() {
        return super.zzd();
    }

    public final /* bridge */ /* synthetic */ n4 zzj() {
        return super.zzj();
    }

    public final /* bridge */ /* synthetic */ q5 zzl() {
        return super.zzl();
    }
}
