package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public enum zzawo implements zzgqo {
    AD_INITIATER_UNSPECIFIED(0),
    zzb(1),
    DFP_BANNER(2),
    INTERSTITIAL(3),
    DFP_INTERSTITIAL(4),
    NATIVE_EXPRESS(5),
    AD_LOADER(6),
    REWARD_BASED_VIDEO_AD(7),
    BANNER_SEARCH_ADS(8),
    GOOGLE_MOBILE_ADS_SDK_ADAPTER(9),
    APP_OPEN(10),
    REWARDED_INTERSTITIAL(11);
    
    private static final zzgqp zzm = null;
    private final int zzo;

    static {
        zzm = new zzawm();
    }

    private zzawo(int i10) {
        this.zzo = i10;
    }

    public static zzawo zzb(int i10) {
        switch (i10) {
            case 0:
                return AD_INITIATER_UNSPECIFIED;
            case 1:
                return zzb;
            case 2:
                return DFP_BANNER;
            case 3:
                return INTERSTITIAL;
            case 4:
                return DFP_INTERSTITIAL;
            case 5:
                return NATIVE_EXPRESS;
            case 6:
                return AD_LOADER;
            case 7:
                return REWARD_BASED_VIDEO_AD;
            case 8:
                return BANNER_SEARCH_ADS;
            case 9:
                return GOOGLE_MOBILE_ADS_SDK_ADAPTER;
            case 10:
                return APP_OPEN;
            case 11:
                return REWARDED_INTERSTITIAL;
            default:
                return null;
        }
    }

    public static zzgqq zzc() {
        return zzawn.zza;
    }

    public final String toString() {
        return Integer.toString(this.zzo);
    }

    public final int zza() {
        return this.zzo;
    }
}
