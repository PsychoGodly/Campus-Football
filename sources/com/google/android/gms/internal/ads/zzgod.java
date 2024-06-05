package com.google.android.gms.internal.ads;

import java.security.SecureRandom;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzgod extends ThreadLocal {
    zzgod() {
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object initialValue() {
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextLong();
        return secureRandom;
    }
}
