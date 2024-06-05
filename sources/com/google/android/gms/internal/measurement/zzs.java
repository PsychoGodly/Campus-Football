package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
public enum zzs {
    DEBUG(3),
    ERROR(6),
    INFO(4),
    VERBOSE(2),
    WARN(5);
    
    private final int zzg;

    private zzs(int i10) {
        this.zzg = i10;
    }

    public static zzs zza(int i10) {
        if (i10 == 2) {
            return VERBOSE;
        }
        if (i10 == 3) {
            return DEBUG;
        }
        if (i10 == 5) {
            return WARN;
        }
        if (i10 != 6) {
            return INFO;
        }
        return ERROR;
    }
}
