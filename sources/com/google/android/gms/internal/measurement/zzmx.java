package com.google.android.gms.internal.measurement;

import com.applovin.mediation.MaxReward;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.0 */
public enum zzmx {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(MaxReward.DEFAULT_LABEL),
    BYTE_STRING(zzhm.zza),
    ENUM((String) null),
    MESSAGE((String) null);
    
    private final Object zzk;

    private zzmx(Object obj) {
        this.zzk = obj;
    }
}
