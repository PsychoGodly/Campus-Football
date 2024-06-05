package com.google.android.gms.internal.p001firebaseauthapi;

import com.applovin.mediation.MaxReward;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzajk  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public enum zzajk {
    VOID(Void.class, Void.class, (Class<?>) null),
    INT(r1, Integer.class, 0),
    LONG(Long.TYPE, Long.class, 0L),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.TYPE, Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.TYPE, Boolean.class, Boolean.FALSE),
    STRING(String.class, String.class, MaxReward.DEFAULT_LABEL),
    BYTE_STRING(zzahp.class, zzahp.class, zzahp.zza),
    ENUM(r1, Integer.class, (Class<?>) null),
    MESSAGE(Object.class, Object.class, (Class<?>) null);
    
    private final Class<?> zzl;
    private final Class<?> zzm;
    private final Object zzn;

    private zzajk(Class<?> cls, Class<?> cls2, Object obj) {
        this.zzl = cls;
        this.zzm = cls2;
        this.zzn = obj;
    }

    public final Class<?> zza() {
        return this.zzm;
    }
}
