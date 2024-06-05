package com.google.android.gms.internal.consent_sdk;

import android.os.Handler;
import android.webkit.WebView;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.1.0 */
public final class zzbw extends WebView {
    private final Handler zza;
    /* access modifiers changed from: private */
    public final zzcc zzb;
    /* access modifiers changed from: private */
    public boolean zzc = false;

    public zzbw(zzby zzby, Handler handler, zzcc zzcc) {
        super(zzby);
        this.zza = handler;
        this.zzb = zzcc;
    }

    static /* bridge */ /* synthetic */ boolean zze(zzbw zzbw, String str) {
        return str != null && str.startsWith("consent://");
    }

    public final void zzc(String str, String str2) {
        this.zza.post(new zzbt(this, str + "(" + str2 + ");"));
    }
}
