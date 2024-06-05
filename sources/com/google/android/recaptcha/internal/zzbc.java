package com.google.android.recaptcha.internal;

import android.webkit.WebView;
import pe.c2;
import pe.p0;
import pe.r0;
import xd.d;
import xd.g;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
public final class zzbc {
    /* access modifiers changed from: private */
    public final WebView zza;
    private final p0 zzb;

    public zzbc(WebView webView, p0 p0Var) {
        this.zza = webView;
        this.zzb = p0Var;
    }

    public final void zzb(String str, String... strArr) {
        c2 unused = k.d(this.zzb, (g) null, (r0) null, new zzbb(strArr, this, str, (d) null), 3, (Object) null);
    }
}
