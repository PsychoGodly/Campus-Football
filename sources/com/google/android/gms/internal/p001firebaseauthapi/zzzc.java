package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.firebase.auth.d2;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLCredentialContract;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzzc  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzzc implements zzadk<zzagh> {
    private final /* synthetic */ zzacd zza;
    private final /* synthetic */ zzadl zzb;
    private final /* synthetic */ zzyj zzc;

    zzzc(zzyj zzyj, zzacd zzacd, zzadl zzadl) {
        this.zzc = zzyj;
        this.zza = zzacd;
        this.zzb = zzadl;
    }

    public final void zza(String str) {
        this.zzb.zza(str);
    }

    public final /* synthetic */ void zza(Object obj) {
        zzagh zzagh = (zzagh) obj;
        this.zzc.zza(new zzafn(zzagh.zzc(), zzagh.zzb(), Long.valueOf(zzagh.zza()), "Bearer"), (String) null, URLCredentialContract.FeedEntry.COLUMN_NAME_PASSWORD, Boolean.FALSE, (d2) null, this.zza, this);
    }
}
