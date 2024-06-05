package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public enum zzaxc implements zzgqo {
    AD_FORMAT_TYPE_UNSPECIFIED(0),
    zzb(1),
    INTERSTITIAL(2),
    NATIVE_EXPRESS(3),
    NATIVE_CONTENT(4),
    NATIVE_APP_INSTALL(5),
    NATIVE_CUSTOM_TEMPLATE(6),
    DFP_BANNER(7),
    DFP_INTERSTITIAL(8),
    REWARD_BASED_VIDEO_AD(9),
    BANNER_SEARCH_ADS(10);
    
    private static final zzgqp zzl = null;
    private final int zzn;

    static {
        zzl = new zzaxa();
    }

    private zzaxc(int i10) {
        this.zzn = i10;
    }

    public static zzaxc zzb(int i10) {
        switch (i10) {
            case 0:
                return AD_FORMAT_TYPE_UNSPECIFIED;
            case 1:
                return zzb;
            case 2:
                return INTERSTITIAL;
            case 3:
                return NATIVE_EXPRESS;
            case 4:
                return NATIVE_CONTENT;
            case 5:
                return NATIVE_APP_INSTALL;
            case 6:
                return NATIVE_CUSTOM_TEMPLATE;
            case 7:
                return DFP_BANNER;
            case 8:
                return DFP_INTERSTITIAL;
            case 9:
                return REWARD_BASED_VIDEO_AD;
            case 10:
                return BANNER_SEARCH_ADS;
            default:
                return null;
        }
    }

    public static zzgqq zzc() {
        return zzaxb.zza;
    }

    public final String toString() {
        return Integer.toString(this.zzn);
    }

    public final int zza() {
        return this.zzn;
    }
}
