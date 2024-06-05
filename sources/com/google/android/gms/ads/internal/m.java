package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.client.c3;
import com.google.android.gms.internal.ads.zzbza;
import com.google.android.gms.internal.ads.zzezx;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class m extends WebViewClient {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ s f14692a;

    m(s sVar) {
        this.f14692a = sVar;
    }

    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        s sVar = this.f14692a;
        if (sVar.f14735h != null) {
            try {
                sVar.f14735h.zzf(zzezx.zzd(1, (String) null, (c3) null));
            } catch (RemoteException e10) {
                zzbza.zzl("#007 Could not call remote method.", e10);
            }
        }
        s sVar2 = this.f14692a;
        if (sVar2.f14735h != null) {
            try {
                sVar2.f14735h.zze(0);
            } catch (RemoteException e11) {
                zzbza.zzl("#007 Could not call remote method.", e11);
            }
        }
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (str.startsWith(this.f14692a.zzq())) {
            return false;
        }
        if (str.startsWith("gmsg://noAdLoaded")) {
            s sVar = this.f14692a;
            if (sVar.f14735h != null) {
                try {
                    sVar.f14735h.zzf(zzezx.zzd(3, (String) null, (c3) null));
                } catch (RemoteException e10) {
                    zzbza.zzl("#007 Could not call remote method.", e10);
                }
            }
            s sVar2 = this.f14692a;
            if (sVar2.f14735h != null) {
                try {
                    sVar2.f14735h.zze(3);
                } catch (RemoteException e11) {
                    zzbza.zzl("#007 Could not call remote method.", e11);
                }
            }
            this.f14692a.M0(0);
            return true;
        } else if (str.startsWith("gmsg://scriptLoadFailed")) {
            s sVar3 = this.f14692a;
            if (sVar3.f14735h != null) {
                try {
                    sVar3.f14735h.zzf(zzezx.zzd(1, (String) null, (c3) null));
                } catch (RemoteException e12) {
                    zzbza.zzl("#007 Could not call remote method.", e12);
                }
            }
            s sVar4 = this.f14692a;
            if (sVar4.f14735h != null) {
                try {
                    sVar4.f14735h.zze(0);
                } catch (RemoteException e13) {
                    zzbza.zzl("#007 Could not call remote method.", e13);
                }
            }
            this.f14692a.M0(0);
            return true;
        } else if (str.startsWith("gmsg://adResized")) {
            s sVar5 = this.f14692a;
            if (sVar5.f14735h != null) {
                try {
                    sVar5.f14735h.zzi();
                } catch (RemoteException e14) {
                    zzbza.zzl("#007 Could not call remote method.", e14);
                }
            }
            this.f14692a.M0(this.f14692a.zzb(str));
            return true;
        } else if (str.startsWith("gmsg://")) {
            return true;
        } else {
            s sVar6 = this.f14692a;
            if (sVar6.f14735h != null) {
                try {
                    sVar6.f14735h.zzc();
                    this.f14692a.f14735h.zzh();
                } catch (RemoteException e15) {
                    zzbza.zzl("#007 Could not call remote method.", e15);
                }
            }
            s.I1(this.f14692a, s.F1(this.f14692a, str));
            return true;
        }
    }
}
