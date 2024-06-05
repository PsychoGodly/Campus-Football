package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.b2;
import com.google.android.gms.ads.internal.util.c;
import com.google.android.gms.ads.internal.util.t0;
import com.google.android.gms.dynamic.a;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import m5.n;
import org.json.JSONObject;
import t4.i;
import t4.r;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzcex extends FrameLayout implements zzcei {
    private final zzcei zza;
    private final zzcay zzb;
    private final AtomicBoolean zzc = new AtomicBoolean();

    public zzcex(zzcei zzcei) {
        super(zzcei.getContext());
        this.zza = zzcei;
        this.zzb = new zzcay(zzcei.zzE(), this, this);
        addView((View) zzcei);
    }

    public final boolean canGoBack() {
        return this.zza.canGoBack();
    }

    public final void destroy() {
        a zzQ = zzQ();
        if (zzQ != null) {
            zzfkr zzfkr = b2.f14773i;
            zzfkr.post(new zzcev(zzQ));
            zzcei zzcei = this.zza;
            zzcei.getClass();
            zzfkr.postDelayed(new zzcew(zzcei), (long) ((Integer) a0.c().zzb(zzbar.zzeD)).intValue());
            return;
        }
        this.zza.destroy();
    }

    public final void goBack() {
        this.zza.goBack();
    }

    public final void loadData(String str, String str2, String str3) {
        this.zza.loadData(str, "text/html", str3);
    }

    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.zza.loadDataWithBaseURL(str, str2, "text/html", "UTF-8", (String) null);
    }

    public final void loadUrl(String str) {
        this.zza.loadUrl(str);
    }

    public final void onAdClicked() {
        zzcei zzcei = this.zza;
        if (zzcei != null) {
            zzcei.onAdClicked();
        }
    }

    public final void onPause() {
        this.zzb.zze();
        this.zza.onPause();
    }

    public final void onResume() {
        this.zza.onResume();
    }

    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.zza.setOnClickListener(onClickListener);
    }

    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.zza.setOnTouchListener(onTouchListener);
    }

    public final void setWebChromeClient(WebChromeClient webChromeClient) {
        this.zza.setWebChromeClient(webChromeClient);
    }

    public final void setWebViewClient(WebViewClient webViewClient) {
        this.zza.setWebViewClient(webViewClient);
    }

    public final void zzA(int i10) {
        this.zza.zzA(i10);
    }

    public final void zzB(int i10) {
        this.zzb.zzf(i10);
    }

    public final void zzC(zzcfe zzcfe) {
        this.zza.zzC(zzcfe);
    }

    public final zzeyc zzD() {
        return this.zza.zzD();
    }

    public final Context zzE() {
        return this.zza.zzE();
    }

    public final View zzF() {
        return this;
    }

    public final WebView zzG() {
        return (WebView) this.zza;
    }

    public final WebViewClient zzH() {
        return this.zza.zzH();
    }

    public final zzapw zzI() {
        return this.zza.zzI();
    }

    public final zzaus zzJ() {
        return this.zza.zzJ();
    }

    public final zzbdk zzK() {
        return this.zza.zzK();
    }

    public final r zzL() {
        return this.zza.zzL();
    }

    public final r zzM() {
        return this.zza.zzM();
    }

    public final zzcfv zzN() {
        return ((zzcfb) this.zza).zzaJ();
    }

    public final zzcfx zzO() {
        return this.zza.zzO();
    }

    public final zzeyf zzP() {
        return this.zza.zzP();
    }

    public final a zzQ() {
        return this.zza.zzQ();
    }

    public final zzfut zzR() {
        return this.zza.zzR();
    }

    public final String zzS() {
        return this.zza.zzS();
    }

    public final void zzT(zzeyc zzeyc, zzeyf zzeyf) {
        this.zza.zzT(zzeyc, zzeyf);
    }

    public final void zzU() {
        this.zzb.zzd();
        this.zza.zzU();
    }

    public final void zzV() {
        this.zza.zzV();
    }

    public final void zzW(int i10) {
        this.zza.zzW(i10);
    }

    public final void zzX() {
        this.zza.zzX();
    }

    public final void zzY() {
        zzcei zzcei = this.zza;
        HashMap hashMap = new HashMap(3);
        hashMap.put("app_muted", String.valueOf(t.t().e()));
        hashMap.put("app_volume", String.valueOf(t.t().a()));
        zzcfb zzcfb = (zzcfb) zzcei;
        hashMap.put("device_volume", String.valueOf(c.b(zzcfb.getContext())));
        zzcfb.zzd("volume", hashMap);
    }

    public final void zzZ(boolean z10) {
        this.zza.zzZ(z10);
    }

    public final void zza(String str) {
        ((zzcfb) this.zza).zzaO(str);
    }

    public final boolean zzaA() {
        return this.zza.zzaA();
    }

    public final boolean zzaB() {
        return this.zzc.get();
    }

    public final boolean zzaC() {
        return this.zza.zzaC();
    }

    public final void zzaD(i iVar, boolean z10) {
        this.zza.zzaD(iVar, z10);
    }

    public final void zzaE(t0 t0Var, zzeaf zzeaf, zzdpi zzdpi, zzfdk zzfdk, String str, String str2, int i10) {
        this.zza.zzaE(t0Var, zzeaf, zzdpi, zzfdk, str, str2, 14);
    }

    public final void zzaF(boolean z10, int i10, boolean z11) {
        this.zza.zzaF(z10, i10, z11);
    }

    public final void zzaG(boolean z10, int i10, String str, boolean z11) {
        this.zza.zzaG(z10, i10, str, z11);
    }

    public final void zzaH(boolean z10, int i10, String str, String str2, boolean z11) {
        this.zza.zzaH(z10, i10, str, str2, z11);
    }

    public final void zzaa() {
        this.zza.zzaa();
    }

    public final void zzab(String str, String str2, String str3) {
        this.zza.zzab(str, str2, (String) null);
    }

    public final void zzac() {
        this.zza.zzac();
    }

    public final void zzad(String str, zzbhp zzbhp) {
        this.zza.zzad(str, zzbhp);
    }

    public final void zzae() {
        TextView textView = new TextView(getContext());
        t.r();
        textView.setText(b2.T());
        textView.setTextSize(15.0f);
        textView.setTextColor(-1);
        textView.setPadding(5, 0, 5, 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(-12303292);
        gradientDrawable.setCornerRadius(8.0f);
        textView.setBackground(gradientDrawable);
        addView(textView, new FrameLayout.LayoutParams(-2, -2, 49));
        bringChildToFront(textView);
    }

    public final void zzaf(r rVar) {
        this.zza.zzaf(rVar);
    }

    public final void zzag(zzcfx zzcfx) {
        this.zza.zzag(zzcfx);
    }

    public final void zzah(zzaus zzaus) {
        this.zza.zzah(zzaus);
    }

    public final void zzai(boolean z10) {
        this.zza.zzai(z10);
    }

    public final void zzaj() {
        setBackgroundColor(0);
        this.zza.setBackgroundColor(0);
    }

    public final void zzak(Context context) {
        this.zza.zzak(context);
    }

    public final void zzal(boolean z10) {
        this.zza.zzal(z10);
    }

    public final void zzam(zzbdi zzbdi) {
        this.zza.zzam(zzbdi);
    }

    public final void zzan(boolean z10) {
        this.zza.zzan(z10);
    }

    public final void zzao(zzbdk zzbdk) {
        this.zza.zzao(zzbdk);
    }

    public final void zzap(a aVar) {
        this.zza.zzap(aVar);
    }

    public final void zzaq(int i10) {
        this.zza.zzaq(i10);
    }

    public final void zzar(r rVar) {
        this.zza.zzar(rVar);
    }

    public final void zzas(boolean z10) {
        this.zza.zzas(z10);
    }

    public final void zzat(boolean z10) {
        this.zza.zzat(z10);
    }

    public final void zzau(String str, zzbhp zzbhp) {
        this.zza.zzau(str, zzbhp);
    }

    public final void zzav(String str, n nVar) {
        this.zza.zzav(str, nVar);
    }

    public final boolean zzaw() {
        return this.zza.zzaw();
    }

    public final boolean zzax() {
        return this.zza.zzax();
    }

    public final boolean zzay(boolean z10, int i10) {
        if (!this.zzc.compareAndSet(false, true)) {
            return true;
        }
        if (((Boolean) a0.c().zzb(zzbar.zzaF)).booleanValue()) {
            return false;
        }
        if (this.zza.getParent() instanceof ViewGroup) {
            ((ViewGroup) this.zza.getParent()).removeView((View) this.zza);
        }
        this.zza.zzay(z10, i10);
        return true;
    }

    public final boolean zzaz() {
        return this.zza.zzaz();
    }

    public final void zzb(String str, String str2) {
        this.zza.zzb("window.inspectorInfo", str2);
    }

    public final void zzbj() {
        this.zza.zzbj();
    }

    public final void zzbk() {
        this.zza.zzbk();
    }

    public final String zzbl() {
        return this.zza.zzbl();
    }

    public final String zzbm() {
        return this.zza.zzbm();
    }

    public final void zzc(zzate zzate) {
        this.zza.zzc(zzate);
    }

    public final void zzd(String str, Map map) {
        this.zza.zzd(str, map);
    }

    public final void zze(String str, JSONObject jSONObject) {
        this.zza.zze(str, jSONObject);
    }

    public final int zzf() {
        return this.zza.zzf();
    }

    public final int zzg() {
        if (((Boolean) a0.c().zzb(zzbar.zzdt)).booleanValue()) {
            return this.zza.getMeasuredHeight();
        }
        return getMeasuredHeight();
    }

    public final int zzh() {
        if (((Boolean) a0.c().zzb(zzbar.zzdt)).booleanValue()) {
            return this.zza.getMeasuredWidth();
        }
        return getMeasuredWidth();
    }

    public final Activity zzi() {
        return this.zza.zzi();
    }

    public final com.google.android.gms.ads.internal.a zzj() {
        return this.zza.zzj();
    }

    public final zzbbg zzk() {
        return this.zza.zzk();
    }

    public final void zzl(String str, JSONObject jSONObject) {
        ((zzcfb) this.zza).zzb(str, jSONObject.toString());
    }

    public final zzbbh zzm() {
        return this.zza.zzm();
    }

    public final zzbzg zzn() {
        return this.zza.zzn();
    }

    public final zzcay zzo() {
        return this.zzb;
    }

    public final zzccu zzp(String str) {
        return this.zza.zzp(str);
    }

    public final zzcfe zzq() {
        return this.zza.zzq();
    }

    public final void zzr() {
        zzcei zzcei = this.zza;
        if (zzcei != null) {
            zzcei.zzr();
        }
    }

    public final void zzs() {
        zzcei zzcei = this.zza;
        if (zzcei != null) {
            zzcei.zzs();
        }
    }

    public final void zzt(String str, zzccu zzccu) {
        this.zza.zzt(str, zzccu);
    }

    public final void zzu() {
        this.zza.zzu();
    }

    public final void zzv(boolean z10, long j10) {
        this.zza.zzv(z10, j10);
    }

    public final void zzw() {
        this.zza.zzw();
    }

    public final void zzx(int i10) {
    }

    public final void zzy(int i10) {
    }

    public final void zzz(boolean z10) {
        this.zza.zzz(false);
    }
}
