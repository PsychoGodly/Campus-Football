package com.google.android.gms.internal.p001firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzamr  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public enum zzamr {
    DOUBLE(zzanb.DOUBLE, 1),
    FLOAT(zzanb.FLOAT, 5),
    INT64(r5, 0),
    UINT64(r5, 0),
    INT32(r11, 0),
    FIXED64(r5, 1),
    FIXED32(r11, 5),
    BOOL(zzanb.BOOLEAN, 0),
    STRING(zzanb.STRING, (zzanb) null),
    GROUP(r19, (zzanb) null),
    MESSAGE(r19, (zzanb) null),
    BYTES(zzanb.BYTE_STRING, (zzanb) null),
    UINT32(r11, 0),
    ENUM(zzanb.ENUM, 0),
    SFIXED32(r11, 5),
    SFIXED64(r5, 1),
    SINT32(r11, 0),
    SINT64(r5, 0);
    
    private final zzanb zzt;
    private final int zzu;

    private zzamr(zzanb zzanb, int i10) {
        this.zzt = zzanb;
        this.zzu = i10;
    }

    public final int zza() {
        return this.zzu;
    }

    public final zzanb zzb() {
        return this.zzt;
    }
}
