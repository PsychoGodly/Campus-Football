package com.google.android.gms.internal.p001firebaseauthapi;

import android.text.TextUtils;
import com.google.android.gms.common.internal.q;
import java.util.ArrayList;
import java.util.List;
import m5.c;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzys  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzys implements zzadk<zzagf> {
    private final /* synthetic */ zzagc zza;
    private final /* synthetic */ zzafc zzb;
    private final /* synthetic */ zzacd zzc;
    private final /* synthetic */ zzafn zzd;
    private final /* synthetic */ zzadl zze;
    private final /* synthetic */ zzyj zzf;

    zzys(zzyj zzyj, zzagc zzagc, zzafc zzafc, zzacd zzacd, zzafn zzafn, zzadl zzadl) {
        this.zzf = zzyj;
        this.zza = zzagc;
        this.zzb = zzafc;
        this.zzc = zzacd;
        this.zzd = zzafn;
        this.zze = zzadl;
    }

    public final void zza(String str) {
        this.zze.zza(str);
    }

    public final /* synthetic */ void zza(Object obj) {
        zzagf zzagf = (zzagf) obj;
        if (this.zza.zzi("EMAIL")) {
            this.zzb.zzb((String) null);
        } else if (this.zza.zzc() != null) {
            this.zzb.zzb(this.zza.zzc());
        }
        if (this.zza.zzi("DISPLAY_NAME")) {
            this.zzb.zza((String) null);
        } else if (this.zza.zzb() != null) {
            this.zzb.zza(this.zza.zzb());
        }
        if (this.zza.zzi("PHOTO_URL")) {
            this.zzb.zzd((String) null);
        } else if (this.zza.zze() != null) {
            this.zzb.zzd(this.zza.zze());
        }
        if (!TextUtils.isEmpty(this.zza.zzd())) {
            this.zzb.zzc(c.c("redacted".getBytes()));
        }
        List zze2 = zzagf.zze();
        if (zze2 == null) {
            zze2 = new ArrayList();
        }
        this.zzb.zza((List<zzafs>) zze2);
        zzacd zzacd = this.zzc;
        zzafn zzafn = this.zzd;
        q.k(zzafn);
        q.k(zzagf);
        String zzc2 = zzagf.zzc();
        String zzd2 = zzagf.zzd();
        if (!TextUtils.isEmpty(zzc2) && !TextUtils.isEmpty(zzd2)) {
            zzafn = new zzafn(zzd2, zzc2, Long.valueOf(zzagf.zza()), zzafn.zze());
        }
        zzacd.zza(zzafn, this.zzb);
    }
}
