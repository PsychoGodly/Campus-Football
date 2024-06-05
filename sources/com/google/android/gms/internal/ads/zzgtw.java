package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public enum zzgtw {
    DOUBLE(zzgtx.DOUBLE, 1),
    FLOAT(zzgtx.FLOAT, 5),
    INT64(r5, 0),
    UINT64(r5, 0),
    INT32(r11, 0),
    FIXED64(r5, 1),
    FIXED32(r11, 5),
    BOOL(zzgtx.BOOLEAN, 0),
    STRING(zzgtx.STRING, 2),
    GROUP(r13, 3),
    MESSAGE(r13, 2),
    BYTES(zzgtx.BYTE_STRING, 2),
    UINT32(r11, 0),
    ENUM(zzgtx.ENUM, 0),
    SFIXED32(r11, 5),
    SFIXED64(r5, 1),
    SINT32(r11, 0),
    SINT64(r5, 0);
    
    private final zzgtx zzt;

    private zzgtw(zzgtx zzgtx, int i10) {
        this.zzt = zzgtx;
    }

    public final zzgtx zza() {
        return this.zzt;
    }
}
