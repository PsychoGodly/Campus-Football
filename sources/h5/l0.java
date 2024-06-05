package h5;

import android.util.Log;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
class l0 {

    /* renamed from: e  reason: collision with root package name */
    private static final l0 f18853e = new l0(true, 3, 1, (String) null, (Throwable) null);

    /* renamed from: a  reason: collision with root package name */
    final boolean f18854a;

    /* renamed from: b  reason: collision with root package name */
    final String f18855b;

    /* renamed from: c  reason: collision with root package name */
    final Throwable f18856c;

    /* renamed from: d  reason: collision with root package name */
    final int f18857d;

    private l0(boolean z10, int i10, int i11, String str, Throwable th) {
        this.f18854a = z10;
        this.f18857d = i10;
        this.f18855b = str;
        this.f18856c = th;
    }

    /* synthetic */ l0(boolean z10, int i10, int i11, String str, Throwable th, k0 k0Var) {
        this(false, 1, 5, (String) null, (Throwable) null);
    }

    @Deprecated
    static l0 b() {
        return f18853e;
    }

    static l0 c(String str) {
        return new l0(false, 1, 5, str, (Throwable) null);
    }

    static l0 d(String str, Throwable th) {
        return new l0(false, 1, 5, str, th);
    }

    static l0 f(int i10) {
        return new l0(true, i10, 1, (String) null, (Throwable) null);
    }

    static l0 g(int i10, int i11, String str, Throwable th) {
        return new l0(false, i10, i11, str, th);
    }

    /* access modifiers changed from: package-private */
    public String a() {
        return this.f18855b;
    }

    /* access modifiers changed from: package-private */
    public final void e() {
        if (!this.f18854a && Log.isLoggable("GoogleCertificatesRslt", 3)) {
            if (this.f18856c != null) {
                Log.d("GoogleCertificatesRslt", a(), this.f18856c);
            } else {
                Log.d("GoogleCertificatesRslt", a());
            }
        }
    }
}
