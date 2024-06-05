package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.0 */
public enum zzmn {
    DOUBLE(zzmx.DOUBLE, 1),
    FLOAT(zzmx.FLOAT, 5),
    INT64(r5, 0),
    UINT64(r5, 0),
    INT32(r11, 0),
    FIXED64(r5, 1),
    FIXED32(r11, 5),
    BOOL(zzmx.BOOLEAN, 0),
    STRING(zzmx.STRING, (zzmx) null),
    GROUP(r19, (zzmx) null),
    MESSAGE(r19, (zzmx) null),
    BYTES(zzmx.BYTE_STRING, (zzmx) null),
    UINT32(r11, 0),
    ENUM(zzmx.ENUM, 0),
    SFIXED32(r11, 5),
    SFIXED64(r5, 1),
    SINT32(r11, 0),
    SINT64(r5, 0);
    
    private final zzmx zzt;
    private final int zzu;

    private zzmn(zzmx zzmx, int i10) {
        this.zzt = zzmx;
        this.zzu = i10;
    }

    public final int zza() {
        return this.zzu;
    }

    public final zzmx zzb() {
        return this.zzt;
    }
}
