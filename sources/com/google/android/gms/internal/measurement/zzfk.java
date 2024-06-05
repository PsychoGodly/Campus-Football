package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
public enum zzfk implements zzjc {
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_UNKNOWN(0),
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_RESTRICTED(1),
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_DENIED(2),
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_AUTHORIZED(3),
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_NOT_DETERMINED(4),
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_NOT_CONFIGURED(5);
    
    private static final zzjb<zzfk> zzg = null;
    private final int zzi;

    static {
        zzg = new zzfj();
    }

    private zzfk(int i10) {
        this.zzi = i10;
    }

    public static zzje zzb() {
        return zzfl.zza;
    }

    public final String toString() {
        return "<" + zzfk.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzi + " name=" + name() + '>';
    }

    public final int zza() {
        return this.zzi;
    }

    public static zzfk zza(int i10) {
        if (i10 == 0) {
            return AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_UNKNOWN;
        }
        if (i10 == 1) {
            return AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_RESTRICTED;
        }
        if (i10 == 2) {
            return AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_DENIED;
        }
        if (i10 == 3) {
            return AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_AUTHORIZED;
        }
        if (i10 == 4) {
            return AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_NOT_DETERMINED;
        }
        if (i10 != 5) {
            return null;
        }
        return AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_NOT_CONFIGURED;
    }
}
