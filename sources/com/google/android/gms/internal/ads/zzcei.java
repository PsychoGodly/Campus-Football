package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.client.a;
import com.google.android.gms.ads.internal.l;
import m5.n;
import t4.r;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public interface zzcei extends a, zzdcc, zzcdz, zzbki, zzcff, zzcfj, zzbkv, zzatf, zzcfn, l, zzcfq, zzcfr, zzcbj, zzcfs {
    boolean canGoBack();

    void destroy();

    Context getContext();

    int getHeight();

    ViewGroup.LayoutParams getLayoutParams();

    void getLocationOnScreen(int[] iArr);

    int getMeasuredHeight();

    int getMeasuredWidth();

    ViewParent getParent();

    int getWidth();

    void goBack();

    void loadData(String str, String str2, String str3);

    void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5);

    void loadUrl(String str);

    void measure(int i10, int i11);

    /* synthetic */ void onAdClicked();

    void onPause();

    void onResume();

    void setBackgroundColor(int i10);

    void setOnClickListener(View.OnClickListener onClickListener);

    void setOnTouchListener(View.OnTouchListener onTouchListener);

    void setWebChromeClient(WebChromeClient webChromeClient);

    void setWebViewClient(WebViewClient webViewClient);

    void zzC(zzcfe zzcfe);

    zzeyc zzD();

    Context zzE();

    View zzF();

    WebView zzG();

    WebViewClient zzH();

    zzapw zzI();

    zzaus zzJ();

    zzbdk zzK();

    r zzL();

    r zzM();

    zzcfv zzN();

    zzcfx zzO();

    zzeyf zzP();

    com.google.android.gms.dynamic.a zzQ();

    zzfut zzR();

    String zzS();

    void zzT(zzeyc zzeyc, zzeyf zzeyf);

    void zzU();

    void zzV();

    void zzW(int i10);

    void zzX();

    void zzY();

    void zzZ(boolean z10);

    boolean zzaA();

    boolean zzaB();

    boolean zzaC();

    void zzaa();

    void zzab(String str, String str2, String str3);

    void zzac();

    void zzad(String str, zzbhp zzbhp);

    void zzae();

    void zzaf(r rVar);

    void zzag(zzcfx zzcfx);

    void zzah(zzaus zzaus);

    void zzai(boolean z10);

    void zzaj();

    void zzak(Context context);

    void zzal(boolean z10);

    void zzam(zzbdi zzbdi);

    void zzan(boolean z10);

    void zzao(zzbdk zzbdk);

    void zzap(com.google.android.gms.dynamic.a aVar);

    void zzaq(int i10);

    void zzar(r rVar);

    void zzas(boolean z10);

    void zzat(boolean z10);

    void zzau(String str, zzbhp zzbhp);

    void zzav(String str, n nVar);

    boolean zzaw();

    boolean zzax();

    boolean zzay(boolean z10, int i10);

    boolean zzaz();

    /* synthetic */ void zzbj();

    /* synthetic */ void zzbk();

    Activity zzi();

    com.google.android.gms.ads.internal.a zzj();

    zzbbh zzm();

    zzbzg zzn();

    zzcfe zzq();

    void zzt(String str, zzccu zzccu);
}
