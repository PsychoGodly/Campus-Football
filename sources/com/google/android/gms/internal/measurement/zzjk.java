package com.google.android.gms.internal.measurement;

import com.applovin.mediation.MaxReward;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.0 */
public enum zzjk {
    VOID(Void.class, Void.class, (Class<?>) null),
    INT(r1, Integer.class, 0),
    LONG(Long.TYPE, Long.class, 0L),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.TYPE, Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.TYPE, Boolean.class, Boolean.FALSE),
    STRING(String.class, String.class, MaxReward.DEFAULT_LABEL),
    BYTE_STRING(zzhm.class, zzhm.class, zzhm.zza),
    ENUM(r1, Integer.class, (Class<?>) null),
    MESSAGE(Object.class, Object.class, (Class<?>) null);
    
    private final Class<?> zzl;
    private final Class<?> zzm;
    private final Object zzn;

    private zzjk(Class<?> cls, Class<?> cls2, Object obj) {
        this.zzl = cls;
        this.zzm = cls2;
        this.zzn = obj;
    }

    public final Class<?> zza() {
        return this.zzm;
    }
}
