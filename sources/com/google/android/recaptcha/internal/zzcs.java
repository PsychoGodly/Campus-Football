package com.google.android.recaptcha.internal;

import android.net.Uri;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.io.ByteArrayInputStream;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
public final class zzcs extends WebViewClient {
    final /* synthetic */ zzda zza;

    zzcs(zzda zzda) {
        this.zza = zzda;
    }

    public final void onLoadResource(WebView webView, String str) {
        System.currentTimeMillis();
    }

    public final void onPageFinished(WebView webView, String str) {
        zzai zzai = zzai.zza;
        zzai.zzc(new zzaf(zzkw.INIT_NETWORK, this.zza.zzg, this.zza.zzh, this.zza.zzh, (String) null), this.zza.zze, this.zza.zzf);
        long zza2 = this.zza.zzn.zza(TimeUnit.MICROSECONDS);
        zzj zzj = zzj.zza;
        zzj.zza(zzl.zzl.zza(), zza2);
    }

    public final void onReceivedError(WebView webView, int i10, String str, String str2) {
        super.onReceivedError(webView, i10, str, str2);
        zzf zzf = zzf.zze;
        zzd zzd = (zzd) this.zza.zzj.get(Integer.valueOf(i10));
        if (zzd == null) {
            zzd = zzd.zzb;
        }
        zzh zzh = new zzh(zzf, zzd);
        this.zza.zzm().hashCode();
        zzh.getMessage();
        this.zza.zzm().l0(zzh);
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        zzdb zzdb = zzdb.zza;
        if (zzdb.zza(Uri.parse(str))) {
            return super.shouldInterceptRequest(webView, str);
        }
        Uri parse = Uri.parse(str);
        zzh zzh = new zzh(zzf.zzc, zzd.zzu);
        this.zza.zzm().hashCode();
        parse.toString();
        this.zza.zzm().l0(zzh);
        return new WebResourceResponse("text/plain", "UTF-8", new ByteArrayInputStream(new byte[0]));
    }
}
