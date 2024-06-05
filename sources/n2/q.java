package n2;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import java.io.IOException;
import k4.a;
import k4.n0;
import n2.h;
import p3.v;

/* compiled from: ExoPlaybackException */
public final class q extends c3 {

    /* renamed from: q  reason: collision with root package name */
    public static final h.a<q> f20612q = p.f36428a;

    /* renamed from: r  reason: collision with root package name */
    private static final String f20613r = n0.r0(AdError.NO_FILL_ERROR_CODE);

    /* renamed from: s  reason: collision with root package name */
    private static final String f20614s = n0.r0(AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE);

    /* renamed from: t  reason: collision with root package name */
    private static final String f20615t = n0.r0(1003);

    /* renamed from: u  reason: collision with root package name */
    private static final String f20616u = n0.r0(1004);

    /* renamed from: v  reason: collision with root package name */
    private static final String f20617v = n0.r0(1005);

    /* renamed from: w  reason: collision with root package name */
    private static final String f20618w = n0.r0(1006);

    /* renamed from: j  reason: collision with root package name */
    public final int f20619j;

    /* renamed from: k  reason: collision with root package name */
    public final String f20620k;

    /* renamed from: l  reason: collision with root package name */
    public final int f20621l;

    /* renamed from: m  reason: collision with root package name */
    public final r1 f20622m;

    /* renamed from: n  reason: collision with root package name */
    public final int f20623n;

    /* renamed from: o  reason: collision with root package name */
    public final v f20624o;

    /* renamed from: p  reason: collision with root package name */
    final boolean f20625p;

    private q(int i10, Throwable th, int i11) {
        this(i10, th, (String) null, i11, (String) null, -1, (r1) null, 4, false);
    }

    public static /* synthetic */ q d(Bundle bundle) {
        return new q(bundle);
    }

    public static q f(Throwable th, String str, int i10, r1 r1Var, int i11, boolean z10, int i12) {
        return new q(1, th, (String) null, i12, str, i10, r1Var, r1Var == null ? 4 : i11, z10);
    }

    public static q g(IOException iOException, int i10) {
        return new q(0, iOException, i10);
    }

    @Deprecated
    public static q h(RuntimeException runtimeException) {
        return i(runtimeException, 1000);
    }

    public static q i(RuntimeException runtimeException, int i10) {
        return new q(2, runtimeException, i10);
    }

    private static String j(int i10, String str, String str2, int i11, r1 r1Var, int i12) {
        String str3;
        if (i10 == 0) {
            str3 = "Source error";
        } else if (i10 != 1) {
            str3 = i10 != 3 ? "Unexpected runtime error" : "Remote error";
        } else {
            str3 = str2 + " error, index=" + i11 + ", format=" + r1Var + ", format_supported=" + n0.W(i12);
        }
        if (TextUtils.isEmpty(str)) {
            return str3;
        }
        return str3 + ": " + str;
    }

    /* access modifiers changed from: package-private */
    public q e(v vVar) {
        return new q((String) n0.j(getMessage()), getCause(), this.f20203a, this.f20619j, this.f20620k, this.f20621l, this.f20622m, this.f20623n, vVar, this.f20204b, this.f20625p);
    }

    public Exception k() {
        boolean z10 = true;
        if (this.f20619j != 1) {
            z10 = false;
        }
        a.f(z10);
        return (Exception) a.e(getCause());
    }

    public IOException l() {
        a.f(this.f20619j == 0);
        return (IOException) a.e(getCause());
    }

    public RuntimeException m() {
        a.f(this.f20619j == 2);
        return (RuntimeException) a.e(getCause());
    }

    private q(int i10, Throwable th, String str, int i11, String str2, int i12, r1 r1Var, int i13, boolean z10) {
        this(j(i10, str, str2, i12, r1Var, i13), th, i11, i10, str2, i12, r1Var, i13, (v) null, SystemClock.elapsedRealtime(), z10);
    }

    private q(Bundle bundle) {
        super(bundle);
        r1 r1Var;
        this.f20619j = bundle.getInt(f20613r, 2);
        this.f20620k = bundle.getString(f20614s);
        this.f20621l = bundle.getInt(f20615t, -1);
        Bundle bundle2 = bundle.getBundle(f20616u);
        if (bundle2 == null) {
            r1Var = null;
        } else {
            r1Var = r1.f20642q0.a(bundle2);
        }
        this.f20622m = r1Var;
        this.f20623n = bundle.getInt(f20617v, 4);
        this.f20625p = bundle.getBoolean(f20618w, false);
        this.f20624o = null;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private q(String str, Throwable th, int i10, int i11, String str2, int i12, r1 r1Var, int i13, v vVar, long j10, boolean z10) {
        super(str, th, i10, j10);
        int i14 = i11;
        boolean z11 = z10;
        boolean z12 = false;
        a.a(!z11 || i14 == 1);
        a.a((th != null || i14 == 3) ? true : z12);
        this.f20619j = i14;
        this.f20620k = str2;
        this.f20621l = i12;
        this.f20622m = r1Var;
        this.f20623n = i13;
        this.f20624o = vVar;
        this.f20625p = z11;
    }
}
