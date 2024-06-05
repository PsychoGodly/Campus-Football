package com.applovin.impl;

import com.applovin.impl.mediation.g;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;

public class vj {

    /* renamed from: a  reason: collision with root package name */
    private final wj f12767a;

    /* renamed from: b  reason: collision with root package name */
    private final String f12768b;

    /* renamed from: c  reason: collision with root package name */
    private final String f12769c;

    /* renamed from: d  reason: collision with root package name */
    private final String f12770d;

    /* renamed from: e  reason: collision with root package name */
    private final MaxError f12771e;

    /* renamed from: f  reason: collision with root package name */
    private final long f12772f;

    /* renamed from: g  reason: collision with root package name */
    private final long f12773g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f12774h;

    public interface a {
        void a(vj vjVar);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private vj(wj wjVar, g gVar, String str, MaxError maxError, long j10, long j11) {
        this(wjVar, str, maxError, j10, j11, gVar != null ? gVar.i() : null, gVar != null ? gVar.b() : null, false);
    }

    public static vj a(wj wjVar, g gVar, MaxError maxError, long j10, long j11) {
        if (wjVar != null) {
            return new vj(wjVar, gVar, (String) null, maxError, j10, j11);
        }
        throw new IllegalArgumentException("No spec specified");
    }

    public long b() {
        return this.f12773g;
    }

    public MaxError c() {
        return this.f12771e;
    }

    public String d() {
        return this.f12768b;
    }

    public String e() {
        return this.f12770d;
    }

    public wj f() {
        return this.f12767a;
    }

    public boolean g() {
        return this.f12774h;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("SignalCollectionResult{mSignalProviderSpec=");
        sb2.append(this.f12767a);
        sb2.append(", mSdkVersion='");
        sb2.append(this.f12768b);
        sb2.append('\'');
        sb2.append(", mAdapterVersion='");
        sb2.append(this.f12769c);
        sb2.append('\'');
        sb2.append(", mSignalDataLength='");
        String str = this.f12770d;
        sb2.append(str != null ? str.length() : 0);
        sb2.append('\'');
        sb2.append(", mErrorMessage=");
        MaxError maxError = this.f12771e;
        sb2.append(maxError != null ? maxError.getMessage() : MaxReward.DEFAULT_LABEL);
        sb2.append('}');
        return sb2.toString();
    }

    public static vj a(wj wjVar, MaxError maxError) {
        return a(wjVar, (g) null, maxError, -1, -1);
    }

    private vj(wj wjVar, String str, MaxError maxError, long j10, long j11, String str2, String str3, boolean z10) {
        this.f12767a = wjVar;
        this.f12770d = str;
        this.f12771e = maxError;
        this.f12772f = j10;
        this.f12773g = j11;
        this.f12768b = str2;
        this.f12769c = str3;
        this.f12774h = z10;
    }

    public static vj a(wj wjVar, g gVar, String str, long j10, long j11) {
        if (wjVar == null) {
            throw new IllegalArgumentException("No spec specified");
        } else if (gVar != null) {
            return new vj(wjVar, gVar, str, (MaxError) null, j10, j11);
        } else {
            throw new IllegalArgumentException("No adapterWrapper specified");
        }
    }

    public String a() {
        return this.f12769c;
    }

    public static vj a(vj vjVar) {
        return new vj(vjVar.f(), vjVar.e(), vjVar.c(), vjVar.f12772f, vjVar.f12773g, vjVar.d(), vjVar.a(), true);
    }
}
