package com.google.android.gms.internal.p001firebaseauthapi;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.internal.q;
import com.google.firebase.auth.d2;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzafc  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzafc {
    private String zza;
    private String zzb;
    private boolean zzc;
    private String zzd;
    private String zze;
    private zzafv zzf;
    private String zzg;
    private String zzh;
    private long zzi;
    private long zzj;
    private boolean zzk;
    private d2 zzl;
    private List<zzafr> zzm;
    private zzap<zzafq> zzn;

    public zzafc() {
        this.zzf = new zzafv();
        this.zzn = zzap.zzh();
    }

    public final long zza() {
        return this.zzi;
    }

    public final long zzb() {
        return this.zzj;
    }

    public final Uri zzc() {
        if (!TextUtils.isEmpty(this.zze)) {
            return Uri.parse(this.zze);
        }
        return null;
    }

    public final zzap<zzafq> zzd() {
        return this.zzn;
    }

    public final d2 zze() {
        return this.zzl;
    }

    public final zzafv zzf() {
        return this.zzf;
    }

    public final String zzg() {
        return this.zzd;
    }

    public final String zzh() {
        return this.zzb;
    }

    public final String zzi() {
        return this.zza;
    }

    public final String zzj() {
        return this.zzh;
    }

    public final List<zzafr> zzk() {
        return this.zzm;
    }

    public final List<zzafs> zzl() {
        return this.zzf.zza();
    }

    public final boolean zzm() {
        return this.zzc;
    }

    public final boolean zzn() {
        return this.zzk;
    }

    public final zzafc zza(d2 d2Var) {
        this.zzl = d2Var;
        return this;
    }

    public final zzafc zzb(String str) {
        this.zzb = str;
        return this;
    }

    public final zzafc zzd(String str) {
        this.zze = str;
        return this;
    }

    public final zzafc zza(String str) {
        this.zzd = str;
        return this;
    }

    public final zzafc zzc(String str) {
        q.g(str);
        this.zzg = str;
        return this;
    }

    public zzafc(String str, String str2, boolean z10, String str3, String str4, zzafv zzafv, String str5, String str6, long j10, long j11, boolean z11, d2 d2Var, List<zzafr> list, zzap<zzafq> zzap) {
        zzafv zzafv2;
        this.zza = str;
        this.zzb = str2;
        this.zzc = z10;
        this.zzd = str3;
        this.zze = str4;
        if (zzafv == null) {
            zzafv2 = new zzafv();
        } else {
            List<zzafs> zza2 = zzafv.zza();
            zzafv zzafv3 = new zzafv();
            if (zza2 != null) {
                zzafv3.zza().addAll(zza2);
            }
            zzafv2 = zzafv3;
        }
        this.zzf = zzafv2;
        this.zzg = str5;
        this.zzh = str6;
        this.zzi = j10;
        this.zzj = j11;
        this.zzk = false;
        this.zzl = null;
        this.zzm = list == null ? new ArrayList<>() : list;
        this.zzn = zzap;
    }

    public final zzafc zza(boolean z10) {
        this.zzk = z10;
        return this;
    }

    public final zzafc zza(List<zzafs> list) {
        q.k(list);
        zzafv zzafv = new zzafv();
        this.zzf = zzafv;
        zzafv.zza().addAll(list);
        return this;
    }
}
