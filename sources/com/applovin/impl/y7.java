package com.applovin.impl;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.applovin.impl.m2;
import com.facebook.ads.AdError;
import java.io.IOException;

public final class y7 extends kh {

    /* renamed from: l  reason: collision with root package name */
    public static final m2.a f13531l = r80.f11160a;

    /* renamed from: d  reason: collision with root package name */
    public final int f13532d;

    /* renamed from: f  reason: collision with root package name */
    public final String f13533f;

    /* renamed from: g  reason: collision with root package name */
    public final int f13534g;

    /* renamed from: h  reason: collision with root package name */
    public final d9 f13535h;

    /* renamed from: i  reason: collision with root package name */
    public final int f13536i;

    /* renamed from: j  reason: collision with root package name */
    public final td f13537j;

    /* renamed from: k  reason: collision with root package name */
    final boolean f13538k;

    private y7(int i10, Throwable th, int i11) {
        this(i10, th, (String) null, i11, (String) null, -1, (d9) null, 4, false);
    }

    public static y7 a(Throwable th, String str, int i10, d9 d9Var, int i11, boolean z10, int i12) {
        return new y7(1, th, (String) null, i12, str, i10, d9Var, d9Var == null ? 4 : i11, z10);
    }

    public static /* synthetic */ y7 c(Bundle bundle) {
        return new y7(bundle);
    }

    private y7(int i10, Throwable th, String str, int i11, String str2, int i12, d9 d9Var, int i13, boolean z10) {
        this(a(i10, str, str2, i12, d9Var, i13), th, i11, i10, str2, i12, d9Var, i13, (td) null, SystemClock.elapsedRealtime(), z10);
    }

    public static y7 a(RuntimeException runtimeException) {
        return a(runtimeException, 1000);
    }

    private static String a(int i10, String str, String str2, int i11, d9 d9Var, int i12) {
        String str3;
        if (i10 == 0) {
            str3 = "Source error";
        } else if (i10 != 1) {
            str3 = i10 != 3 ? "Unexpected runtime error" : "Remote error";
        } else {
            str3 = str2 + " error, index=" + i11 + ", format=" + d9Var + ", format_supported=" + r2.b(i12);
        }
        if (TextUtils.isEmpty(str)) {
            return str3;
        }
        return str3 + ": " + str;
    }

    private y7(Bundle bundle) {
        super(bundle);
        this.f13532d = bundle.getInt(kh.b(AdError.NO_FILL_ERROR_CODE), 2);
        this.f13533f = bundle.getString(kh.b(AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE));
        this.f13534g = bundle.getInt(kh.b(1003), -1);
        this.f13535h = (d9) n2.a(d9.I, bundle.getBundle(kh.b(1004)));
        this.f13536i = bundle.getInt(kh.b(1005), 4);
        this.f13538k = bundle.getBoolean(kh.b(1006), false);
        this.f13537j = null;
    }

    public static y7 a(IOException iOException, int i10) {
        return new y7(0, iOException, i10);
    }

    public static y7 a(RuntimeException runtimeException, int i10) {
        return new y7(2, runtimeException, i10);
    }

    /* access modifiers changed from: package-private */
    public y7 a(td tdVar) {
        return new y7((String) yp.a((Object) getMessage()), getCause(), this.f9014a, this.f13532d, this.f13533f, this.f13534g, this.f13535h, this.f13536i, tdVar, this.f9015b, this.f13538k);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private y7(String str, Throwable th, int i10, int i11, String str2, int i12, d9 d9Var, int i13, td tdVar, long j10, boolean z10) {
        super(str, th, i10, j10);
        int i14 = i11;
        boolean z11 = z10;
        boolean z12 = false;
        a1.a(!z11 || i14 == 1);
        a1.a((th != null || i14 == 3) ? true : z12);
        this.f13532d = i14;
        this.f13533f = str2;
        this.f13534g = i12;
        this.f13535h = d9Var;
        this.f13536i = i13;
        this.f13537j = tdVar;
        this.f13538k = z11;
    }
}
