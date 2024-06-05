package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import android.view.accessibility.CaptioningManager;
import com.google.android.gms.common.api.a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public class zzct {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final int zzd;
    /* access modifiers changed from: private */
    public int zze;
    /* access modifiers changed from: private */
    public int zzf;
    /* access modifiers changed from: private */
    public boolean zzg;
    /* access modifiers changed from: private */
    public final zzfqk zzh;
    /* access modifiers changed from: private */
    public final zzfqk zzi;
    private final int zzj;
    private final int zzk;
    /* access modifiers changed from: private */
    public final zzfqk zzl;
    /* access modifiers changed from: private */
    public zzfqk zzm;
    /* access modifiers changed from: private */
    public int zzn;
    /* access modifiers changed from: private */
    public final HashMap zzo;
    /* access modifiers changed from: private */
    public final HashSet zzp;

    @Deprecated
    public zzct() {
        this.zza = a.e.API_PRIORITY_OTHER;
        this.zzb = a.e.API_PRIORITY_OTHER;
        this.zzc = a.e.API_PRIORITY_OTHER;
        this.zzd = a.e.API_PRIORITY_OTHER;
        this.zze = a.e.API_PRIORITY_OTHER;
        this.zzf = a.e.API_PRIORITY_OTHER;
        this.zzg = true;
        this.zzh = zzfqk.zzo();
        this.zzi = zzfqk.zzo();
        this.zzj = a.e.API_PRIORITY_OTHER;
        this.zzk = a.e.API_PRIORITY_OTHER;
        this.zzl = zzfqk.zzo();
        this.zzm = zzfqk.zzo();
        this.zzn = 0;
        this.zzo = new HashMap();
        this.zzp = new HashSet();
    }

    public final zzct zzd(Context context) {
        CaptioningManager captioningManager;
        if ((zzew.zza >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
            this.zzn = 1088;
            Locale locale = captioningManager.getLocale();
            if (locale != null) {
                this.zzm = zzfqk.zzp(zzew.zzN(locale));
            }
        }
        return this;
    }

    public zzct zze(int i10, int i11, boolean z10) {
        this.zze = i10;
        this.zzf = i11;
        this.zzg = true;
        return this;
    }

    protected zzct(zzcu zzcu) {
        this.zza = a.e.API_PRIORITY_OTHER;
        this.zzb = a.e.API_PRIORITY_OTHER;
        this.zzc = a.e.API_PRIORITY_OTHER;
        this.zzd = a.e.API_PRIORITY_OTHER;
        this.zze = zzcu.zzl;
        this.zzf = zzcu.zzm;
        this.zzg = zzcu.zzn;
        this.zzh = zzcu.zzo;
        this.zzi = zzcu.zzq;
        this.zzj = a.e.API_PRIORITY_OTHER;
        this.zzk = a.e.API_PRIORITY_OTHER;
        this.zzl = zzcu.zzu;
        this.zzm = zzcu.zzv;
        this.zzn = zzcu.zzw;
        this.zzp = new HashSet(zzcu.zzC);
        this.zzo = new HashMap(zzcu.zzB);
    }
}
