package com.google.android.play.core.integrity;

/* compiled from: com.google.android.play:integrity@@1.1.0 */
final class d extends w {

    /* renamed from: a  reason: collision with root package name */
    private String f26041a;

    d() {
    }

    /* access modifiers changed from: package-private */
    public final w a(String str) {
        this.f26041a = str;
        return this;
    }

    /* access modifiers changed from: package-private */
    public final IntegrityTokenResponse b() {
        String str = this.f26041a;
        if (str != null) {
            return new f(str, (e) null);
        }
        throw new IllegalStateException("Missing required properties: token");
    }
}
