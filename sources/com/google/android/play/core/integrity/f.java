package com.google.android.play.core.integrity;

/* compiled from: com.google.android.play:integrity@@1.1.0 */
final class f extends IntegrityTokenResponse {

    /* renamed from: a  reason: collision with root package name */
    private final String f26042a;

    /* synthetic */ f(String str, e eVar) {
        this.f26042a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof IntegrityTokenResponse) {
            return this.f26042a.equals(((IntegrityTokenResponse) obj).token());
        }
        return false;
    }

    public final int hashCode() {
        return this.f26042a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String str = this.f26042a;
        return "IntegrityTokenResponse{token=" + str + "}";
    }

    public final String token() {
        return this.f26042a;
    }
}
