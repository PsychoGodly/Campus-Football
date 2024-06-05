package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.applovin.sdk.AppLovinEventParameters;
import com.google.android.gms.ads.internal.client.c1;
import com.google.android.gms.ads.internal.client.e0;
import com.google.android.gms.ads.internal.client.f5;
import com.google.android.gms.ads.internal.client.g1;
import com.google.android.gms.ads.internal.client.h0;
import com.google.android.gms.ads.internal.client.i2;
import com.google.android.gms.ads.internal.client.j1;
import com.google.android.gms.ads.internal.client.k0;
import com.google.android.gms.ads.internal.client.n4;
import com.google.android.gms.ads.internal.client.p2;
import com.google.android.gms.ads.internal.client.s2;
import com.google.android.gms.ads.internal.client.t0;
import com.google.android.gms.ads.internal.client.u4;
import com.google.android.gms.ads.internal.client.w2;
import com.google.android.gms.ads.internal.client.x;
import com.google.android.gms.ads.internal.client.y0;
import com.google.android.gms.ads.internal.client.z4;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.internal.ads.zzapw;
import com.google.android.gms.internal.ads.zzapx;
import com.google.android.gms.internal.ads.zzavb;
import com.google.android.gms.internal.ads.zzbbp;
import com.google.android.gms.internal.ads.zzbby;
import com.google.android.gms.internal.ads.zzbrl;
import com.google.android.gms.internal.ads.zzbro;
import com.google.android.gms.internal.ads.zzbuj;
import com.google.android.gms.internal.ads.zzbyt;
import com.google.android.gms.internal.ads.zzbza;
import com.google.android.gms.internal.ads.zzbzg;
import com.google.android.gms.internal.ads.zzbzn;
import java.util.Map;
import java.util.concurrent.Future;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class s extends t0 {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final zzbzg f14729a;

    /* renamed from: b  reason: collision with root package name */
    private final z4 f14730b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final Future f14731c = zzbzn.zza.zzb(new o(this));
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final Context f14732d;

    /* renamed from: f  reason: collision with root package name */
    private final r f14733f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public WebView f14734g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public h0 f14735h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public zzapw f14736i;

    /* renamed from: j  reason: collision with root package name */
    private AsyncTask f14737j;

    public s(Context context, z4 z4Var, String str, zzbzg zzbzg) {
        this.f14732d = context;
        this.f14729a = zzbzg;
        this.f14730b = z4Var;
        this.f14734g = new WebView(context);
        this.f14733f = new r(context, str);
        M0(0);
        this.f14734g.setVerticalScrollBarEnabled(false);
        this.f14734g.getSettings().setJavaScriptEnabled(true);
        this.f14734g.setWebViewClient(new m(this));
        this.f14734g.setOnTouchListener(new n(this));
    }

    static /* bridge */ /* synthetic */ String F1(s sVar, String str) {
        if (sVar.f14736i == null) {
            return str;
        }
        Uri parse = Uri.parse(str);
        try {
            parse = sVar.f14736i.zza(parse, sVar.f14732d, (View) null, (Activity) null);
        } catch (zzapx e10) {
            zzbza.zzk("Unable to process ad data", e10);
        }
        return parse.toString();
    }

    static /* bridge */ /* synthetic */ void I1(s sVar, String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        sVar.f14732d.startActivity(intent);
    }

    /* access modifiers changed from: package-private */
    public final void M0(int i10) {
        if (this.f14734g != null) {
            this.f14734g.setLayoutParams(new ViewGroup.LayoutParams(-1, i10));
        }
    }

    public final void zzA() throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    public final void zzB() throws RemoteException {
        q.f("resume must be called on the main UI thread.");
    }

    public final void zzC(e0 e0Var) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    public final void zzD(h0 h0Var) throws RemoteException {
        this.f14735h = h0Var;
    }

    public final void zzE(y0 y0Var) {
        throw new IllegalStateException("Unused method");
    }

    public final void zzF(z4 z4Var) throws RemoteException {
        throw new IllegalStateException("AdSize must be set before initialization");
    }

    public final void zzG(c1 c1Var) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    public final void zzH(zzavb zzavb) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    public final void zzI(f5 f5Var) {
        throw new IllegalStateException("Unused method");
    }

    public final void zzJ(j1 j1Var) {
    }

    public final void zzK(w2 w2Var) {
        throw new IllegalStateException("Unused method");
    }

    public final void zzL(boolean z10) {
        throw new IllegalStateException("Unused method");
    }

    public final void zzM(zzbrl zzbrl) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    public final void zzN(boolean z10) throws RemoteException {
    }

    public final void zzO(zzbbp zzbbp) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    public final void zzP(i2 i2Var) {
    }

    public final void zzQ(zzbro zzbro, String str) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    public final void zzR(String str) {
        throw new IllegalStateException("Unused method");
    }

    public final void zzS(zzbuj zzbuj) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    public final void zzT(String str) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    public final void zzU(n4 n4Var) {
        throw new IllegalStateException("Unused method");
    }

    public final void zzW(a aVar) {
    }

    public final void zzX() throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    public final boolean zzY() throws RemoteException {
        return false;
    }

    public final boolean zzZ() throws RemoteException {
        return false;
    }

    public final boolean zzaa(u4 u4Var) throws RemoteException {
        q.l(this.f14734g, "This Search Ad has already been torn down");
        this.f14733f.f(u4Var, this.f14729a);
        this.f14737j = new q(this, (p) null).execute(new Void[0]);
        return true;
    }

    public final void zzab(g1 g1Var) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    /* access modifiers changed from: package-private */
    public final int zzb(String str) {
        String queryParameter = Uri.parse(str).getQueryParameter("height");
        if (TextUtils.isEmpty(queryParameter)) {
            return 0;
        }
        try {
            x.b();
            return zzbyt.zzy(this.f14732d, Integer.parseInt(queryParameter));
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public final Bundle zzd() {
        throw new IllegalStateException("Unused method");
    }

    public final z4 zzg() throws RemoteException {
        return this.f14730b;
    }

    public final h0 zzi() {
        throw new IllegalStateException("getIAdListener not implemented");
    }

    public final c1 zzj() {
        throw new IllegalStateException("getIAppEventListener not implemented");
    }

    public final p2 zzk() {
        return null;
    }

    public final s2 zzl() {
        return null;
    }

    public final a zzn() throws RemoteException {
        q.f("getAdFrame must be called on the main UI thread.");
        return b.B1(this.f14734g);
    }

    /* access modifiers changed from: package-private */
    public final String zzp() {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https://").appendEncodedPath((String) zzbby.zzd.zze());
        builder.appendQueryParameter(AppLovinEventParameters.SEARCH_QUERY, this.f14733f.d());
        builder.appendQueryParameter("pubId", this.f14733f.c());
        builder.appendQueryParameter("mappver", this.f14733f.a());
        Map e10 = this.f14733f.e();
        for (String str : e10.keySet()) {
            builder.appendQueryParameter(str, (String) e10.get(str));
        }
        Uri build = builder.build();
        zzapw zzapw = this.f14736i;
        if (zzapw != null) {
            try {
                build = zzapw.zzb(build, this.f14732d);
            } catch (zzapx e11) {
                zzbza.zzk("Unable to process ad data", e11);
            }
        }
        String zzq = zzq();
        String encodedQuery = build.getEncodedQuery();
        return zzq + "#" + encodedQuery;
    }

    /* access modifiers changed from: package-private */
    public final String zzq() {
        String b10 = this.f14733f.b();
        if (true == TextUtils.isEmpty(b10)) {
            b10 = "www.google.com";
        }
        return "https://" + b10 + ((String) zzbby.zzd.zze());
    }

    public final String zzr() {
        throw new IllegalStateException("getAdUnitId not implemented");
    }

    public final String zzs() throws RemoteException {
        return null;
    }

    public final String zzt() throws RemoteException {
        return null;
    }

    public final void zzx() throws RemoteException {
        q.f("destroy must be called on the main UI thread.");
        this.f14737j.cancel(true);
        this.f14731c.cancel(true);
        this.f14734g.destroy();
        this.f14734g = null;
    }

    public final void zzy(u4 u4Var, k0 k0Var) {
    }

    public final void zzz() throws RemoteException {
        q.f("pause must be called on the main UI thread.");
    }
}
