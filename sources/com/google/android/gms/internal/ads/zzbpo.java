package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.RemoteException;
import com.applovin.mediation.MaxReward;
import com.google.android.gms.ads.internal.client.s2;
import com.google.android.gms.ads.internal.client.u4;
import com.google.android.gms.ads.internal.client.x;
import com.google.android.gms.ads.internal.client.z4;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.dynamic.b;
import java.util.Iterator;
import n4.d0;
import org.json.JSONException;
import org.json.JSONObject;
import v4.g;
import v4.h;
import v4.j;
import v4.n;
import v4.o;
import v4.q;
import v4.s;
import v4.t;
import v4.y;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class zzbpo extends zzbpb {
    private final RtbAdapter zza;
    /* access modifiers changed from: private */
    public n zzb;
    /* access modifiers changed from: private */
    public s zzc;
    /* access modifiers changed from: private */
    public g zzd;
    private String zze = MaxReward.DEFAULT_LABEL;

    public zzbpo(RtbAdapter rtbAdapter) {
        this.zza = rtbAdapter;
    }

    private final Bundle zzv(u4 u4Var) {
        Bundle bundle;
        Bundle bundle2 = u4Var.f14563n;
        if (bundle2 == null || (bundle = bundle2.getBundle(this.zza.getClass().getName())) == null) {
            return new Bundle();
        }
        return bundle;
    }

    private static final Bundle zzw(String str) throws RemoteException {
        zzbza.zzj("Server parameters: ".concat(String.valueOf(str)));
        try {
            Bundle bundle = new Bundle();
            if (str == null) {
                return bundle;
            }
            JSONObject jSONObject = new JSONObject(str);
            Bundle bundle2 = new Bundle();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                bundle2.putString(next, jSONObject.getString(next));
            }
            return bundle2;
        } catch (JSONException e10) {
            zzbza.zzh(MaxReward.DEFAULT_LABEL, e10);
            throw new RemoteException();
        }
    }

    private static final boolean zzx(u4 u4Var) {
        if (u4Var.f14556g) {
            return true;
        }
        x.b();
        return zzbyt.zzs();
    }

    private static final String zzy(String str, u4 u4Var) {
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return u4Var.f14571v;
        }
    }

    public final s2 zze() {
        RtbAdapter rtbAdapter = this.zza;
        if (rtbAdapter instanceof y) {
            try {
                return ((y) rtbAdapter).getVideoController();
            } catch (Throwable th) {
                zzbza.zzh(MaxReward.DEFAULT_LABEL, th);
            }
        }
        return null;
    }

    public final zzbpq zzf() throws RemoteException {
        return zzbpq.zza(this.zza.getVersionInfo());
    }

    public final zzbpq zzg() throws RemoteException {
        return zzbpq.zza(this.zza.getSDKVersionInfo());
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzh(com.google.android.gms.dynamic.a r9, java.lang.String r10, android.os.Bundle r11, android.os.Bundle r12, com.google.android.gms.ads.internal.client.z4 r13, com.google.android.gms.internal.ads.zzbpf r14) throws android.os.RemoteException {
        /*
            r8 = this;
            com.google.android.gms.internal.ads.zzbpm r0 = new com.google.android.gms.internal.ads.zzbpm     // Catch:{ all -> 0x009c }
            r0.<init>(r8, r14)     // Catch:{ all -> 0x009c }
            com.google.android.gms.ads.mediation.rtb.RtbAdapter r14 = r8.zza     // Catch:{ all -> 0x009c }
            v4.l r1 = new v4.l     // Catch:{ all -> 0x009c }
            int r2 = r10.hashCode()     // Catch:{ all -> 0x009c }
            r3 = 5
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            switch(r2) {
                case -1396342996: goto L_0x0048;
                case -1052618729: goto L_0x003e;
                case -239580146: goto L_0x0034;
                case 604727084: goto L_0x002a;
                case 1167692200: goto L_0x0020;
                case 1911491517: goto L_0x0016;
                default: goto L_0x0015;
            }
        L_0x0015:
            goto L_0x0052
        L_0x0016:
            java.lang.String r2 = "rewarded_interstitial"
            boolean r10 = r10.equals(r2)
            if (r10 == 0) goto L_0x0052
            r10 = 3
            goto L_0x0053
        L_0x0020:
            java.lang.String r2 = "app_open"
            boolean r10 = r10.equals(r2)
            if (r10 == 0) goto L_0x0052
            r10 = 5
            goto L_0x0053
        L_0x002a:
            java.lang.String r2 = "interstitial"
            boolean r10 = r10.equals(r2)
            if (r10 == 0) goto L_0x0052
            r10 = 1
            goto L_0x0053
        L_0x0034:
            java.lang.String r2 = "rewarded"
            boolean r10 = r10.equals(r2)
            if (r10 == 0) goto L_0x0052
            r10 = 2
            goto L_0x0053
        L_0x003e:
            java.lang.String r2 = "native"
            boolean r10 = r10.equals(r2)
            if (r10 == 0) goto L_0x0052
            r10 = 4
            goto L_0x0053
        L_0x0048:
            java.lang.String r2 = "banner"
            boolean r10 = r10.equals(r2)
            if (r10 == 0) goto L_0x0052
            r10 = 0
            goto L_0x0053
        L_0x0052:
            r10 = -1
        L_0x0053:
            if (r10 == 0) goto L_0x0076
            if (r10 == r7) goto L_0x0073
            if (r10 == r6) goto L_0x0070
            if (r10 == r5) goto L_0x006d
            if (r10 == r4) goto L_0x006a
            if (r10 != r3) goto L_0x0062
            n4.b r10 = n4.b.APP_OPEN_AD     // Catch:{ all -> 0x009c }
            goto L_0x0078
        L_0x0062:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x009c }
            java.lang.String r10 = "Internal Error"
            r9.<init>(r10)     // Catch:{ all -> 0x009c }
            throw r9     // Catch:{ all -> 0x009c }
        L_0x006a:
            n4.b r10 = n4.b.NATIVE     // Catch:{ all -> 0x009c }
            goto L_0x0078
        L_0x006d:
            n4.b r10 = n4.b.REWARDED_INTERSTITIAL     // Catch:{ all -> 0x009c }
            goto L_0x0078
        L_0x0070:
            n4.b r10 = n4.b.REWARDED     // Catch:{ all -> 0x009c }
            goto L_0x0078
        L_0x0073:
            n4.b r10 = n4.b.INTERSTITIAL     // Catch:{ all -> 0x009c }
            goto L_0x0078
        L_0x0076:
            n4.b r10 = n4.b.f20900a     // Catch:{ all -> 0x009c }
        L_0x0078:
            r1.<init>(r10, r12)     // Catch:{ all -> 0x009c }
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ all -> 0x009c }
            r10.<init>()     // Catch:{ all -> 0x009c }
            r10.add(r1)     // Catch:{ all -> 0x009c }
            x4.a r12 = new x4.a     // Catch:{ all -> 0x009c }
            java.lang.Object r9 = com.google.android.gms.dynamic.b.A1(r9)     // Catch:{ all -> 0x009c }
            android.content.Context r9 = (android.content.Context) r9     // Catch:{ all -> 0x009c }
            int r1 = r13.f14650f     // Catch:{ all -> 0x009c }
            int r2 = r13.f14647b     // Catch:{ all -> 0x009c }
            java.lang.String r13 = r13.f14646a     // Catch:{ all -> 0x009c }
            n4.h r13 = n4.d0.c(r1, r2, r13)     // Catch:{ all -> 0x009c }
            r12.<init>(r9, r10, r11, r13)     // Catch:{ all -> 0x009c }
            r14.collectSignals(r12, r0)     // Catch:{ all -> 0x009c }
            return
        L_0x009c:
            r9 = move-exception
            java.lang.String r10 = "Error generating signals for RTB"
            com.google.android.gms.internal.ads.zzbza.zzh(r10, r9)
            android.os.RemoteException r9 = new android.os.RemoteException
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbpo.zzh(com.google.android.gms.dynamic.a, java.lang.String, android.os.Bundle, android.os.Bundle, com.google.android.gms.ads.internal.client.z4, com.google.android.gms.internal.ads.zzbpf):void");
    }

    public final void zzi(String str, String str2, u4 u4Var, a aVar, zzbon zzbon, zzbnl zzbnl) throws RemoteException {
        u4 u4Var2 = u4Var;
        try {
            this.zza.loadRtbAppOpenAd(new h((Context) b.A1(aVar), str, zzw(str2), zzv(u4Var2), zzx(u4Var), u4Var2.f14561l, u4Var2.f14557h, u4Var2.f14570u, zzy(str2, u4Var), this.zze), new zzbpl(this, zzbon, zzbnl));
        } catch (Throwable th) {
            zzbza.zzh("Adapter failed to render app open ad.", th);
            throw new RemoteException();
        }
    }

    public final void zzj(String str, String str2, u4 u4Var, a aVar, zzboq zzboq, zzbnl zzbnl, z4 z4Var) throws RemoteException {
        u4 u4Var2 = u4Var;
        z4 z4Var2 = z4Var;
        try {
            zzbph zzbph = new zzbph(this, zzboq, zzbnl);
            RtbAdapter rtbAdapter = this.zza;
            Bundle zzw = zzw(str2);
            Bundle zzv = zzv(u4Var2);
            boolean zzx = zzx(u4Var);
            Location location = u4Var2.f14561l;
            int i10 = u4Var2.f14557h;
            int i11 = u4Var2.f14570u;
            String zzy = zzy(str2, u4Var);
            n4.h c10 = d0.c(z4Var2.f14650f, z4Var2.f14647b, z4Var2.f14646a);
            String str3 = this.zze;
            j jVar = r5;
            j jVar2 = new j((Context) b.A1(aVar), str, zzw, zzv, zzx, location, i10, i11, zzy, c10, str3);
            rtbAdapter.loadRtbBannerAd(jVar, zzbph);
        } catch (Throwable th) {
            zzbza.zzh("Adapter failed to render banner ad.", th);
            throw new RemoteException();
        }
    }

    public final void zzk(String str, String str2, u4 u4Var, a aVar, zzboq zzboq, zzbnl zzbnl, z4 z4Var) throws RemoteException {
        u4 u4Var2 = u4Var;
        z4 z4Var2 = z4Var;
        try {
            zzbpi zzbpi = new zzbpi(this, zzboq, zzbnl);
            RtbAdapter rtbAdapter = this.zza;
            Bundle zzw = zzw(str2);
            Bundle zzv = zzv(u4Var2);
            boolean zzx = zzx(u4Var);
            Location location = u4Var2.f14561l;
            int i10 = u4Var2.f14557h;
            int i11 = u4Var2.f14570u;
            String zzy = zzy(str2, u4Var);
            n4.h c10 = d0.c(z4Var2.f14650f, z4Var2.f14647b, z4Var2.f14646a);
            String str3 = this.zze;
            j jVar = r5;
            j jVar2 = new j((Context) b.A1(aVar), str, zzw, zzv, zzx, location, i10, i11, zzy, c10, str3);
            rtbAdapter.loadRtbInterscrollerAd(jVar, zzbpi);
        } catch (Throwable th) {
            zzbza.zzh("Adapter failed to render interscroller ad.", th);
            throw new RemoteException();
        }
    }

    public final void zzl(String str, String str2, u4 u4Var, a aVar, zzbot zzbot, zzbnl zzbnl) throws RemoteException {
        u4 u4Var2 = u4Var;
        try {
            this.zza.loadRtbInterstitialAd(new o((Context) b.A1(aVar), str, zzw(str2), zzv(u4Var2), zzx(u4Var), u4Var2.f14561l, u4Var2.f14557h, u4Var2.f14570u, zzy(str2, u4Var), this.zze), new zzbpj(this, zzbot, zzbnl));
        } catch (Throwable th) {
            zzbza.zzh("Adapter failed to render interstitial ad.", th);
            throw new RemoteException();
        }
    }

    public final void zzm(String str, String str2, u4 u4Var, a aVar, zzbow zzbow, zzbnl zzbnl) throws RemoteException {
        zzn(str, str2, u4Var, aVar, zzbow, zzbnl, (zzbdl) null);
    }

    public final void zzn(String str, String str2, u4 u4Var, a aVar, zzbow zzbow, zzbnl zzbnl, zzbdl zzbdl) throws RemoteException {
        u4 u4Var2 = u4Var;
        try {
            zzbpk zzbpk = new zzbpk(this, zzbow, zzbnl);
            RtbAdapter rtbAdapter = this.zza;
            q qVar = r4;
            q qVar2 = new q((Context) b.A1(aVar), str, zzw(str2), zzv(u4Var2), zzx(u4Var), u4Var2.f14561l, u4Var2.f14557h, u4Var2.f14570u, zzy(str2, u4Var), this.zze, zzbdl);
            rtbAdapter.loadRtbNativeAd(qVar, zzbpk);
        } catch (Throwable th) {
            zzbza.zzh("Adapter failed to render native ad.", th);
            throw new RemoteException();
        }
    }

    public final void zzo(String str, String str2, u4 u4Var, a aVar, zzboz zzboz, zzbnl zzbnl) throws RemoteException {
        u4 u4Var2 = u4Var;
        try {
            this.zza.loadRtbRewardedInterstitialAd(new t((Context) b.A1(aVar), str, zzw(str2), zzv(u4Var2), zzx(u4Var), u4Var2.f14561l, u4Var2.f14557h, u4Var2.f14570u, zzy(str2, u4Var), this.zze), new zzbpn(this, zzboz, zzbnl));
        } catch (Throwable th) {
            zzbza.zzh("Adapter failed to render rewarded interstitial ad.", th);
            throw new RemoteException();
        }
    }

    public final void zzp(String str, String str2, u4 u4Var, a aVar, zzboz zzboz, zzbnl zzbnl) throws RemoteException {
        u4 u4Var2 = u4Var;
        try {
            this.zza.loadRtbRewardedAd(new t((Context) b.A1(aVar), str, zzw(str2), zzv(u4Var2), zzx(u4Var), u4Var2.f14561l, u4Var2.f14557h, u4Var2.f14570u, zzy(str2, u4Var), this.zze), new zzbpn(this, zzboz, zzbnl));
        } catch (Throwable th) {
            zzbza.zzh("Adapter failed to render rewarded ad.", th);
            throw new RemoteException();
        }
    }

    public final void zzq(String str) {
        this.zze = str;
    }

    public final boolean zzr(a aVar) throws RemoteException {
        g gVar = this.zzd;
        if (gVar == null) {
            return false;
        }
        try {
            gVar.a((Context) b.A1(aVar));
            return true;
        } catch (Throwable th) {
            zzbza.zzh(MaxReward.DEFAULT_LABEL, th);
            return true;
        }
    }

    public final boolean zzs(a aVar) throws RemoteException {
        n nVar = this.zzb;
        if (nVar == null) {
            return false;
        }
        try {
            nVar.a((Context) b.A1(aVar));
            return true;
        } catch (Throwable th) {
            zzbza.zzh(MaxReward.DEFAULT_LABEL, th);
            return true;
        }
    }

    public final boolean zzt(a aVar) throws RemoteException {
        s sVar = this.zzc;
        if (sVar == null) {
            return false;
        }
        try {
            sVar.a((Context) b.A1(aVar));
            return true;
        } catch (Throwable th) {
            zzbza.zzh(MaxReward.DEFAULT_LABEL, th);
            return true;
        }
    }
}
