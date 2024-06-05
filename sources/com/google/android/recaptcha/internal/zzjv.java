package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
public enum zzjv {
    DOUBLE(zzjw.DOUBLE, 1),
    FLOAT(zzjw.FLOAT, 5),
    INT64(r5, 0),
    UINT64(r5, 0),
    INT32(r11, 0),
    FIXED64(r5, 1),
    FIXED32(r11, 5),
    BOOL(zzjw.BOOLEAN, 0),
    STRING(zzjw.STRING, 2),
    GROUP(r13, 3),
    MESSAGE(r13, 2),
    BYTES(zzjw.BYTE_STRING, 2),
    UINT32(r11, 0),
    ENUM(zzjw.ENUM, 0),
    SFIXED32(r11, 5),
    SFIXED64(r5, 1),
    SINT32(r11, 0),
    SINT64(r5, 0);
    
    private final zzjw zzt;

    private zzjv(zzjw zzjw, int i10) {
        this.zzt = zzjw;
    }

    public final zzjw zza() {
        return this.zzt;
    }
}
