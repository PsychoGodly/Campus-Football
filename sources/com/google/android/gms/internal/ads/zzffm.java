package com.google.android.gms.internal.ads;

import android.webkit.WebView;
import com.applovin.mediation.MaxReward;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzffm {
    private final zzfft zza;
    private final WebView zzb;
    private final List zzc = new ArrayList();
    private final Map zzd = new HashMap();
    private final String zze;
    private final String zzf;
    private final zzffn zzg;

    private zzffm(zzfft zzfft, WebView webView, String str, List list, String str2, String str3, zzffn zzffn) {
        this.zza = zzfft;
        this.zzb = webView;
        this.zzg = zzffn;
        this.zzf = str2;
        this.zze = MaxReward.DEFAULT_LABEL;
    }

    public static zzffm zzb(zzfft zzfft, WebView webView, String str, String str2) {
        return new zzffm(zzfft, webView, (String) null, (List) null, str, MaxReward.DEFAULT_LABEL, zzffn.HTML);
    }

    public static zzffm zzc(zzfft zzfft, WebView webView, String str, String str2) {
        return new zzffm(zzfft, webView, (String) null, (List) null, str, MaxReward.DEFAULT_LABEL, zzffn.JAVASCRIPT);
    }

    public final WebView zza() {
        return this.zzb;
    }

    public final zzffn zzd() {
        return this.zzg;
    }

    public final zzfft zze() {
        return this.zza;
    }

    public final String zzf() {
        return this.zzf;
    }

    public final String zzg() {
        return this.zze;
    }

    public final List zzh() {
        return Collections.unmodifiableList(this.zzc);
    }

    public final Map zzi() {
        return Collections.unmodifiableMap(this.zzd);
    }
}
