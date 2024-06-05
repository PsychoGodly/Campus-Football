package com.google.android.play.core.integrity;

import com.google.android.play.core.integrity.IntegrityTokenRequest;
import java.util.Objects;

/* compiled from: com.google.android.play:integrity@@1.1.0 */
final class a extends IntegrityTokenRequest.Builder {

    /* renamed from: a  reason: collision with root package name */
    private String f26037a;

    /* renamed from: b  reason: collision with root package name */
    private Long f26038b;

    a() {
    }

    public final IntegrityTokenRequest build() {
        String str = this.f26037a;
        if (str != null) {
            return new c(str, this.f26038b, (b) null);
        }
        throw new IllegalStateException("Missing required properties: nonce");
    }

    public final IntegrityTokenRequest.Builder setCloudProjectNumber(long j10) {
        this.f26038b = Long.valueOf(j10);
        return this;
    }

    public final IntegrityTokenRequest.Builder setNonce(String str) {
        Objects.requireNonNull(str, "Null nonce");
        this.f26037a = str;
        return this;
    }
}
