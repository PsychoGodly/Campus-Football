package d7;

import com.google.firebase.auth.w;

/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class e extends w {

    /* renamed from: a  reason: collision with root package name */
    private String f28536a;

    /* renamed from: b  reason: collision with root package name */
    private String f28537b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f28538c = false;

    /* renamed from: d  reason: collision with root package name */
    private boolean f28539d = false;

    public final void a(boolean z10) {
        this.f28539d = z10;
    }

    public final void b(boolean z10) {
        this.f28538c = z10;
    }

    public final void c(String str, String str2) {
        this.f28536a = str;
        this.f28537b = str2;
    }

    public final String d() {
        return this.f28536a;
    }

    public final String e() {
        return this.f28537b;
    }

    public final boolean f() {
        return this.f28539d;
    }

    public final boolean g() {
        return (this.f28536a == null || this.f28537b == null) ? false : true;
    }

    public final boolean h() {
        return this.f28538c;
    }
}
