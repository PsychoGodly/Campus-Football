package com.google.android.play.core.integrity;

/* compiled from: com.google.android.play:integrity@@1.1.0 */
public abstract class IntegrityTokenRequest {

    /* compiled from: com.google.android.play:integrity@@1.1.0 */
    public static abstract class Builder {
        public abstract IntegrityTokenRequest build();

        public abstract Builder setCloudProjectNumber(long j10);

        public abstract Builder setNonce(String str);
    }

    public static Builder builder() {
        return new a();
    }

    public abstract Long cloudProjectNumber();

    public abstract String nonce();
}
