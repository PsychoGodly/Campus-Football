package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.text.TextUtils;
import android.webkit.WebView;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzfgo extends zzfgl {
    /* access modifiers changed from: private */
    public WebView zza;
    private Long zzb = null;
    private final Map zzc;

    public zzfgo(Map map, String str) {
        this.zzc = map;
    }

    public final void zzc() {
        long j10;
        super.zzc();
        if (this.zzb == null) {
            j10 = 4000;
        } else {
            j10 = TimeUnit.MILLISECONDS.convert(System.nanoTime() - this.zzb.longValue(), TimeUnit.NANOSECONDS);
        }
        new Handler().postDelayed(new zzfgn(this), Math.max(4000 - j10, 2000));
        this.zza = null;
    }

    public final void zzf(zzffo zzffo, zzffm zzffm) {
        JSONObject jSONObject = new JSONObject();
        Map zzi = zzffm.zzi();
        for (String str : zzi.keySet()) {
            zzfgp.zzh(jSONObject, str, (zzffu) zzi.get(str));
        }
        zzg(zzffo, zzffm, jSONObject);
    }

    public final void zzj() {
        WebView webView = new WebView(zzfgc.zzb().zza());
        this.zza = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        zzi(this.zza);
        WebView webView2 = this.zza;
        if (webView2 != null && !TextUtils.isEmpty((CharSequence) null)) {
            webView2.loadUrl("javascript: null");
        }
        Iterator it = this.zzc.keySet().iterator();
        if (!it.hasNext()) {
            this.zzb = Long.valueOf(System.nanoTime());
            return;
        }
        zzffu zzffu = (zzffu) this.zzc.get((String) it.next());
        throw null;
    }
}
