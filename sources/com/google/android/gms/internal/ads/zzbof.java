package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import com.applovin.mediation.MaxReward;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.client.s2;
import com.google.android.gms.ads.internal.client.u4;
import com.google.android.gms.ads.internal.client.z4;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.dynamic.b;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import n4.d0;
import org.json.JSONException;
import org.json.JSONObject;
import v4.f;
import v4.g;
import v4.h;
import v4.j;
import v4.m;
import v4.n;
import v4.o;
import v4.q;
import v4.s;
import v4.t;
import v4.v;
import v4.w;
import v4.x;
import v4.y;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class zzbof extends zzbnh {
    /* access modifiers changed from: private */
    public final Object zza;
    private zzboh zzb;
    private zzbuo zzc;
    private a zzd;
    /* access modifiers changed from: private */
    public View zze;
    /* access modifiers changed from: private */
    public n zzf;
    /* access modifiers changed from: private */
    public x zzg;
    /* access modifiers changed from: private */
    public s zzh;
    /* access modifiers changed from: private */
    public m zzi;
    /* access modifiers changed from: private */
    public g zzj;
    private final String zzk = MaxReward.DEFAULT_LABEL;

    public zzbof(v4.a aVar) {
        this.zza = aVar;
    }

    private final Bundle zzU(u4 u4Var) {
        Bundle bundle;
        Bundle bundle2 = u4Var.f14563n;
        if (bundle2 == null || (bundle = bundle2.getBundle(this.zza.getClass().getName())) == null) {
            return new Bundle();
        }
        return bundle;
    }

    private final Bundle zzV(String str, u4 u4Var, String str2) throws RemoteException {
        zzbza.zze("Server parameters: ".concat(String.valueOf(str)));
        try {
            Bundle bundle = new Bundle();
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                Bundle bundle2 = new Bundle();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    bundle2.putString(next, jSONObject.getString(next));
                }
                bundle = bundle2;
            }
            if (this.zza instanceof AdMobAdapter) {
                bundle.putString("adJson", str2);
                if (u4Var != null) {
                    bundle.putInt("tagForChildDirectedTreatment", u4Var.f14557h);
                }
            }
            bundle.remove("max_ad_content_rating");
            return bundle;
        } catch (Throwable th) {
            zzbza.zzh(MaxReward.DEFAULT_LABEL, th);
            throw new RemoteException();
        }
    }

    private static final boolean zzW(u4 u4Var) {
        if (u4Var.f14556g) {
            return true;
        }
        com.google.android.gms.ads.internal.client.x.b();
        return zzbyt.zzs();
    }

    private static final String zzX(String str, u4 u4Var) {
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return u4Var.f14571v;
        }
    }

    public final void zzA(a aVar, u4 u4Var, String str, zzbnl zzbnl) throws RemoteException {
        u4 u4Var2 = u4Var;
        String str2 = str;
        if (this.zza instanceof v4.a) {
            zzbza.zze("Requesting rewarded ad from adapter.");
            try {
                zzbod zzbod = new zzbod(this, zzbnl);
                Bundle zzV = zzV(str2, u4Var2, (String) null);
                Bundle zzU = zzU(u4Var2);
                boolean zzW = zzW(u4Var);
                Location location = u4Var2.f14561l;
                int i10 = u4Var2.f14557h;
                int i11 = u4Var2.f14570u;
                String zzX = zzX(str2, u4Var2);
                t tVar = r5;
                t tVar2 = new t((Context) b.A1(aVar), MaxReward.DEFAULT_LABEL, zzV, zzU, zzW, location, i10, i11, zzX, MaxReward.DEFAULT_LABEL);
                ((v4.a) this.zza).loadRewardedAd(tVar, zzbod);
            } catch (Exception e10) {
                zzbza.zzh(MaxReward.DEFAULT_LABEL, e10);
                throw new RemoteException();
            }
        } else {
            String canonicalName = v4.a.class.getCanonicalName();
            String canonicalName2 = this.zza.getClass().getCanonicalName();
            zzbza.zzj(canonicalName + " #009 Class mismatch: " + canonicalName2);
            throw new RemoteException();
        }
    }

    public final void zzB(u4 u4Var, String str, String str2) throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof v4.a) {
            zzA(this.zzd, u4Var, str, new zzboi((v4.a) obj, this.zzc));
            return;
        }
        String canonicalName = v4.a.class.getCanonicalName();
        String canonicalName2 = this.zza.getClass().getCanonicalName();
        zzbza.zzj(canonicalName + " #009 Class mismatch: " + canonicalName2);
        throw new RemoteException();
    }

    public final void zzC(a aVar, u4 u4Var, String str, zzbnl zzbnl) throws RemoteException {
        u4 u4Var2 = u4Var;
        String str2 = str;
        if (this.zza instanceof v4.a) {
            zzbza.zze("Requesting rewarded interstitial ad from adapter.");
            try {
                zzbod zzbod = new zzbod(this, zzbnl);
                Bundle zzV = zzV(str2, u4Var2, (String) null);
                Bundle zzU = zzU(u4Var2);
                boolean zzW = zzW(u4Var);
                Location location = u4Var2.f14561l;
                int i10 = u4Var2.f14557h;
                int i11 = u4Var2.f14570u;
                String zzX = zzX(str2, u4Var2);
                t tVar = r5;
                t tVar2 = new t((Context) b.A1(aVar), MaxReward.DEFAULT_LABEL, zzV, zzU, zzW, location, i10, i11, zzX, MaxReward.DEFAULT_LABEL);
                ((v4.a) this.zza).loadRewardedInterstitialAd(tVar, zzbod);
            } catch (Exception e10) {
                zzbza.zzh(MaxReward.DEFAULT_LABEL, e10);
                throw new RemoteException();
            }
        } else {
            String canonicalName = v4.a.class.getCanonicalName();
            String canonicalName2 = this.zza.getClass().getCanonicalName();
            zzbza.zzj(canonicalName + " #009 Class mismatch: " + canonicalName2);
            throw new RemoteException();
        }
    }

    public final void zzD(a aVar) throws RemoteException {
        Context context = (Context) b.A1(aVar);
        Object obj = this.zza;
        if (obj instanceof v) {
            ((v) obj).a(context);
        }
    }

    public final void zzE() throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof f) {
            try {
                ((f) obj).onPause();
            } catch (Throwable th) {
                zzbza.zzh(MaxReward.DEFAULT_LABEL, th);
                throw new RemoteException();
            }
        }
    }

    public final void zzF() throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof f) {
            try {
                ((f) obj).onResume();
            } catch (Throwable th) {
                zzbza.zzh(MaxReward.DEFAULT_LABEL, th);
                throw new RemoteException();
            }
        }
    }

    public final void zzG(boolean z10) throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof w) {
            try {
                ((w) obj).onImmersiveModeUpdated(z10);
            } catch (Throwable th) {
                zzbza.zzh(MaxReward.DEFAULT_LABEL, th);
            }
        } else {
            String canonicalName = w.class.getCanonicalName();
            String canonicalName2 = this.zza.getClass().getCanonicalName();
            zzbza.zze(canonicalName + " #009 Class mismatch: " + canonicalName2);
        }
    }

    public final void zzH(a aVar) throws RemoteException {
        if (this.zza instanceof v4.a) {
            zzbza.zze("Show app open ad from adapter.");
            g gVar = this.zzj;
            if (gVar != null) {
                gVar.a((Context) b.A1(aVar));
            } else {
                zzbza.zzg("Can not show null mediation app open ad.");
                throw new RemoteException();
            }
        } else {
            String canonicalName = v4.a.class.getCanonicalName();
            String canonicalName2 = this.zza.getClass().getCanonicalName();
            zzbza.zzj(canonicalName + " #009 Class mismatch: " + canonicalName2);
            throw new RemoteException();
        }
    }

    public final void zzI() throws RemoteException {
        if (this.zza instanceof MediationInterstitialAdapter) {
            zzbza.zze("Showing interstitial from adapter.");
            try {
                ((MediationInterstitialAdapter) this.zza).showInterstitial();
            } catch (Throwable th) {
                zzbza.zzh(MaxReward.DEFAULT_LABEL, th);
                throw new RemoteException();
            }
        } else {
            String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
            String canonicalName2 = this.zza.getClass().getCanonicalName();
            zzbza.zzj(canonicalName + " #009 Class mismatch: " + canonicalName2);
            throw new RemoteException();
        }
    }

    public final void zzJ(a aVar) throws RemoteException {
        Object obj = this.zza;
        if (!(obj instanceof v4.a) && !(obj instanceof MediationInterstitialAdapter)) {
            String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
            String canonicalName2 = v4.a.class.getCanonicalName();
            String canonicalName3 = this.zza.getClass().getCanonicalName();
            zzbza.zzj(canonicalName + " or " + canonicalName2 + " #009 Class mismatch: " + canonicalName3);
            throw new RemoteException();
        } else if (obj instanceof MediationInterstitialAdapter) {
            zzI();
        } else {
            zzbza.zze("Show interstitial ad from adapter.");
            n nVar = this.zzf;
            if (nVar != null) {
                nVar.a((Context) b.A1(aVar));
            } else {
                zzbza.zzg("Can not show null mediation interstitial ad.");
                throw new RemoteException();
            }
        }
    }

    public final void zzK(a aVar) throws RemoteException {
        if (this.zza instanceof v4.a) {
            zzbza.zze("Show rewarded ad from adapter.");
            s sVar = this.zzh;
            if (sVar != null) {
                sVar.a((Context) b.A1(aVar));
            } else {
                zzbza.zzg("Can not show null mediation rewarded ad.");
                throw new RemoteException();
            }
        } else {
            String canonicalName = v4.a.class.getCanonicalName();
            String canonicalName2 = this.zza.getClass().getCanonicalName();
            zzbza.zzj(canonicalName + " #009 Class mismatch: " + canonicalName2);
            throw new RemoteException();
        }
    }

    public final void zzL() throws RemoteException {
        if (this.zza instanceof v4.a) {
            s sVar = this.zzh;
            if (sVar != null) {
                sVar.a((Context) b.A1(this.zzd));
            } else {
                zzbza.zzg("Can not show null mediated rewarded ad.");
                throw new RemoteException();
            }
        } else {
            String canonicalName = v4.a.class.getCanonicalName();
            String canonicalName2 = this.zza.getClass().getCanonicalName();
            zzbza.zzj(canonicalName + " #009 Class mismatch: " + canonicalName2);
            throw new RemoteException();
        }
    }

    public final boolean zzM() {
        return false;
    }

    public final boolean zzN() throws RemoteException {
        if (this.zza instanceof v4.a) {
            return this.zzc != null;
        }
        String canonicalName = v4.a.class.getCanonicalName();
        String canonicalName2 = this.zza.getClass().getCanonicalName();
        zzbza.zzj(canonicalName + " #009 Class mismatch: " + canonicalName2);
        throw new RemoteException();
    }

    public final zzbnq zzO() {
        return null;
    }

    public final zzbnr zzP() {
        return null;
    }

    public final Bundle zze() {
        return new Bundle();
    }

    public final Bundle zzf() {
        return new Bundle();
    }

    public final Bundle zzg() {
        return new Bundle();
    }

    public final s2 zzh() {
        Object obj = this.zza;
        if (obj instanceof y) {
            try {
                return ((y) obj).getVideoController();
            } catch (Throwable th) {
                zzbza.zzh(MaxReward.DEFAULT_LABEL, th);
            }
        }
        return null;
    }

    public final zzber zzi() {
        zzboh zzboh = this.zzb;
        if (zzboh == null) {
            return null;
        }
        q4.f zza2 = zzboh.zza();
        if (zza2 instanceof zzbes) {
            return ((zzbes) zza2).zza();
        }
        return null;
    }

    public final zzbno zzj() {
        m mVar = this.zzi;
        if (mVar != null) {
            return new zzbog(mVar);
        }
        return null;
    }

    public final zzbnu zzk() {
        x xVar;
        x zzb2;
        Object obj = this.zza;
        if (obj instanceof MediationNativeAdapter) {
            zzboh zzboh = this.zzb;
            if (zzboh == null || (zzb2 = zzboh.zzb()) == null) {
                return null;
            }
            return new zzbok(zzb2);
        } else if (!(obj instanceof v4.a) || (xVar = this.zzg) == null) {
            return null;
        } else {
            return new zzbok(xVar);
        }
    }

    public final zzbpq zzl() {
        Object obj = this.zza;
        if (!(obj instanceof v4.a)) {
            return null;
        }
        return zzbpq.zza(((v4.a) obj).getVersionInfo());
    }

    public final zzbpq zzm() {
        Object obj = this.zza;
        if (!(obj instanceof v4.a)) {
            return null;
        }
        return zzbpq.zza(((v4.a) obj).getSDKVersionInfo());
    }

    public final a zzn() throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof MediationBannerAdapter) {
            try {
                return b.B1(((MediationBannerAdapter) obj).getBannerView());
            } catch (Throwable th) {
                zzbza.zzh(MaxReward.DEFAULT_LABEL, th);
                throw new RemoteException();
            }
        } else if (obj instanceof v4.a) {
            return b.B1(this.zze);
        } else {
            String canonicalName = MediationBannerAdapter.class.getCanonicalName();
            String canonicalName2 = v4.a.class.getCanonicalName();
            String canonicalName3 = this.zza.getClass().getCanonicalName();
            zzbza.zzj(canonicalName + " or " + canonicalName2 + " #009 Class mismatch: " + canonicalName3);
            throw new RemoteException();
        }
    }

    public final void zzo() throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof f) {
            try {
                ((f) obj).onDestroy();
            } catch (Throwable th) {
                zzbza.zzh(MaxReward.DEFAULT_LABEL, th);
                throw new RemoteException();
            }
        }
    }

    public final void zzp(a aVar, u4 u4Var, String str, zzbuo zzbuo, String str2) throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof v4.a) {
            this.zzd = aVar;
            this.zzc = zzbuo;
            zzbuo.zzl(b.B1(obj));
            return;
        }
        String canonicalName = v4.a.class.getCanonicalName();
        String canonicalName2 = this.zza.getClass().getCanonicalName();
        zzbza.zzj(canonicalName + " #009 Class mismatch: " + canonicalName2);
        throw new RemoteException();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzq(com.google.android.gms.dynamic.a r10, com.google.android.gms.internal.ads.zzbjp r11, java.util.List r12) throws android.os.RemoteException {
        /*
            r9 = this;
            java.lang.Object r0 = r9.zza
            boolean r0 = r0 instanceof v4.a
            if (r0 == 0) goto L_0x00a7
            com.google.android.gms.internal.ads.zzbnz r0 = new com.google.android.gms.internal.ads.zzbnz
            r0.<init>(r9, r11)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r12 = r12.iterator()
        L_0x0014:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L_0x0099
            java.lang.Object r1 = r12.next()
            com.google.android.gms.internal.ads.zzbjv r1 = (com.google.android.gms.internal.ads.zzbjv) r1
            java.lang.String r2 = r1.zza
            int r3 = r2.hashCode()
            r4 = 5
            r5 = 4
            r6 = 3
            r7 = 2
            r8 = 1
            switch(r3) {
                case -1396342996: goto L_0x0061;
                case -1052618729: goto L_0x0057;
                case -239580146: goto L_0x004d;
                case 604727084: goto L_0x0043;
                case 1167692200: goto L_0x0039;
                case 1911491517: goto L_0x002f;
                default: goto L_0x002e;
            }
        L_0x002e:
            goto L_0x006b
        L_0x002f:
            java.lang.String r3 = "rewarded_interstitial"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x006b
            r2 = 3
            goto L_0x006c
        L_0x0039:
            java.lang.String r3 = "app_open"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x006b
            r2 = 5
            goto L_0x006c
        L_0x0043:
            java.lang.String r3 = "interstitial"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x006b
            r2 = 1
            goto L_0x006c
        L_0x004d:
            java.lang.String r3 = "rewarded"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x006b
            r2 = 2
            goto L_0x006c
        L_0x0057:
            java.lang.String r3 = "native"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x006b
            r2 = 4
            goto L_0x006c
        L_0x0061:
            java.lang.String r3 = "banner"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x006b
            r2 = 0
            goto L_0x006c
        L_0x006b:
            r2 = -1
        L_0x006c:
            if (r2 == 0) goto L_0x0089
            if (r2 == r8) goto L_0x0086
            if (r2 == r7) goto L_0x0083
            if (r2 == r6) goto L_0x0080
            if (r2 == r5) goto L_0x007d
            if (r2 == r4) goto L_0x007a
            r2 = 0
            goto L_0x008b
        L_0x007a:
            n4.b r2 = n4.b.APP_OPEN_AD
            goto L_0x008b
        L_0x007d:
            n4.b r2 = n4.b.NATIVE
            goto L_0x008b
        L_0x0080:
            n4.b r2 = n4.b.REWARDED_INTERSTITIAL
            goto L_0x008b
        L_0x0083:
            n4.b r2 = n4.b.REWARDED
            goto L_0x008b
        L_0x0086:
            n4.b r2 = n4.b.INTERSTITIAL
            goto L_0x008b
        L_0x0089:
            n4.b r2 = n4.b.f20900a
        L_0x008b:
            if (r2 == 0) goto L_0x0014
            v4.l r3 = new v4.l
            android.os.Bundle r1 = r1.zzb
            r3.<init>(r2, r1)
            r11.add(r3)
            goto L_0x0014
        L_0x0099:
            java.lang.Object r12 = r9.zza
            v4.a r12 = (v4.a) r12
            java.lang.Object r10 = com.google.android.gms.dynamic.b.A1(r10)
            android.content.Context r10 = (android.content.Context) r10
            r12.initialize(r10, r0, r11)
            return
        L_0x00a7:
            android.os.RemoteException r10 = new android.os.RemoteException
            r10.<init>()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbof.zzq(com.google.android.gms.dynamic.a, com.google.android.gms.internal.ads.zzbjp, java.util.List):void");
    }

    public final void zzr(a aVar, zzbuo zzbuo, List list) throws RemoteException {
        zzbza.zzj("Could not initialize rewarded video adapter.");
        throw new RemoteException();
    }

    public final void zzs(u4 u4Var, String str) throws RemoteException {
        zzB(u4Var, str, (String) null);
    }

    public final void zzt(a aVar, u4 u4Var, String str, zzbnl zzbnl) throws RemoteException {
        u4 u4Var2 = u4Var;
        String str2 = str;
        if (this.zza instanceof v4.a) {
            zzbza.zze("Requesting app open ad from adapter.");
            try {
                zzboe zzboe = new zzboe(this, zzbnl);
                Bundle zzV = zzV(str2, u4Var2, (String) null);
                Bundle zzU = zzU(u4Var2);
                boolean zzW = zzW(u4Var);
                Location location = u4Var2.f14561l;
                int i10 = u4Var2.f14557h;
                int i11 = u4Var2.f14570u;
                String zzX = zzX(str2, u4Var2);
                h hVar = r5;
                h hVar2 = new h((Context) b.A1(aVar), MaxReward.DEFAULT_LABEL, zzV, zzU, zzW, location, i10, i11, zzX, MaxReward.DEFAULT_LABEL);
                ((v4.a) this.zza).loadAppOpenAd(hVar, zzboe);
            } catch (Exception e10) {
                zzbza.zzh(MaxReward.DEFAULT_LABEL, e10);
                throw new RemoteException();
            }
        } else {
            String canonicalName = v4.a.class.getCanonicalName();
            String canonicalName2 = this.zza.getClass().getCanonicalName();
            zzbza.zzj(canonicalName + " #009 Class mismatch: " + canonicalName2);
            throw new RemoteException();
        }
    }

    public final void zzu(a aVar, z4 z4Var, u4 u4Var, String str, zzbnl zzbnl) throws RemoteException {
        zzv(aVar, z4Var, u4Var, str, (String) null, zzbnl);
    }

    public final void zzv(a aVar, z4 z4Var, u4 u4Var, String str, String str2, zzbnl zzbnl) throws RemoteException {
        n4.h hVar;
        Date date;
        z4 z4Var2 = z4Var;
        u4 u4Var2 = u4Var;
        String str3 = str;
        String str4 = str2;
        zzbnl zzbnl2 = zzbnl;
        Object obj = this.zza;
        if ((obj instanceof MediationBannerAdapter) || (obj instanceof v4.a)) {
            zzbza.zze("Requesting banner ad from adapter.");
            if (z4Var2.f14659o) {
                hVar = d0.d(z4Var2.f14650f, z4Var2.f14647b);
            } else {
                hVar = d0.c(z4Var2.f14650f, z4Var2.f14647b, z4Var2.f14646a);
            }
            n4.h hVar2 = hVar;
            Object obj2 = this.zza;
            if (obj2 instanceof MediationBannerAdapter) {
                try {
                    MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) obj2;
                    List list = u4Var2.f14555f;
                    HashSet hashSet = list != null ? new HashSet(list) : null;
                    long j10 = u4Var2.f14552b;
                    if (j10 == -1) {
                        date = null;
                    } else {
                        date = new Date(j10);
                    }
                    zzbnx zzbnx = new zzbnx(date, u4Var2.f14554d, hashSet, u4Var2.f14561l, zzW(u4Var), u4Var2.f14557h, u4Var2.f14568s, u4Var2.f14570u, zzX(str3, u4Var2));
                    Bundle bundle = u4Var2.f14563n;
                    mediationBannerAdapter.requestBannerAd((Context) b.A1(aVar), new zzboh(zzbnl2), zzV(str3, u4Var2, str4), hVar2, zzbnx, bundle != null ? bundle.getBundle(mediationBannerAdapter.getClass().getName()) : null);
                } catch (Throwable th) {
                    zzbza.zzh(MaxReward.DEFAULT_LABEL, th);
                    throw new RemoteException();
                }
            } else if (obj2 instanceof v4.a) {
                try {
                    zzboa zzboa = new zzboa(this, zzbnl2);
                    Bundle zzV = zzV(str3, u4Var2, str4);
                    Bundle zzU = zzU(u4Var2);
                    boolean zzW = zzW(u4Var);
                    Location location = u4Var2.f14561l;
                    int i10 = u4Var2.f14557h;
                    int i11 = u4Var2.f14570u;
                    String zzX = zzX(str3, u4Var2);
                    String str5 = this.zzk;
                    j jVar = r2;
                    j jVar2 = new j((Context) b.A1(aVar), MaxReward.DEFAULT_LABEL, zzV, zzU, zzW, location, i10, i11, zzX, hVar2, str5);
                    ((v4.a) obj2).loadBannerAd(jVar, zzboa);
                } catch (Throwable th2) {
                    zzbza.zzh(MaxReward.DEFAULT_LABEL, th2);
                    throw new RemoteException();
                }
            }
        } else {
            zzbza.zzj(MediationBannerAdapter.class.getCanonicalName() + " or " + v4.a.class.getCanonicalName() + " #009 Class mismatch: " + this.zza.getClass().getCanonicalName());
            throw new RemoteException();
        }
    }

    public final void zzw(a aVar, z4 z4Var, u4 u4Var, String str, String str2, zzbnl zzbnl) throws RemoteException {
        z4 z4Var2 = z4Var;
        u4 u4Var2 = u4Var;
        String str3 = str;
        if (this.zza instanceof v4.a) {
            zzbza.zze("Requesting interscroller ad from adapter.");
            try {
                v4.a aVar2 = (v4.a) this.zza;
                zzbny zzbny = new zzbny(this, zzbnl, aVar2);
                Bundle zzV = zzV(str3, u4Var2, str2);
                Bundle zzU = zzU(u4Var2);
                boolean zzW = zzW(u4Var);
                Location location = u4Var2.f14561l;
                int i10 = u4Var2.f14557h;
                int i11 = u4Var2.f14570u;
                String zzX = zzX(str3, u4Var2);
                n4.h e10 = d0.e(z4Var2.f14650f, z4Var2.f14647b);
                j jVar = r6;
                j jVar2 = new j((Context) b.A1(aVar), MaxReward.DEFAULT_LABEL, zzV, zzU, zzW, location, i10, i11, zzX, e10, MaxReward.DEFAULT_LABEL);
                aVar2.loadInterscrollerAd(jVar, zzbny);
            } catch (Exception e11) {
                zzbza.zzh(MaxReward.DEFAULT_LABEL, e11);
                throw new RemoteException();
            }
        } else {
            String canonicalName = v4.a.class.getCanonicalName();
            String canonicalName2 = this.zza.getClass().getCanonicalName();
            zzbza.zzj(canonicalName + " #009 Class mismatch: " + canonicalName2);
            throw new RemoteException();
        }
    }

    public final void zzx(a aVar, u4 u4Var, String str, zzbnl zzbnl) throws RemoteException {
        zzy(aVar, u4Var, str, (String) null, zzbnl);
    }

    public final void zzy(a aVar, u4 u4Var, String str, String str2, zzbnl zzbnl) throws RemoteException {
        Date date;
        u4 u4Var2 = u4Var;
        String str3 = str;
        String str4 = str2;
        zzbnl zzbnl2 = zzbnl;
        Object obj = this.zza;
        if ((obj instanceof MediationInterstitialAdapter) || (obj instanceof v4.a)) {
            zzbza.zze("Requesting interstitial ad from adapter.");
            Object obj2 = this.zza;
            if (obj2 instanceof MediationInterstitialAdapter) {
                try {
                    MediationInterstitialAdapter mediationInterstitialAdapter = (MediationInterstitialAdapter) obj2;
                    List list = u4Var2.f14555f;
                    HashSet hashSet = list != null ? new HashSet(list) : null;
                    long j10 = u4Var2.f14552b;
                    if (j10 == -1) {
                        date = null;
                    } else {
                        date = new Date(j10);
                    }
                    zzbnx zzbnx = new zzbnx(date, u4Var2.f14554d, hashSet, u4Var2.f14561l, zzW(u4Var), u4Var2.f14557h, u4Var2.f14568s, u4Var2.f14570u, zzX(str3, u4Var2));
                    Bundle bundle = u4Var2.f14563n;
                    mediationInterstitialAdapter.requestInterstitialAd((Context) b.A1(aVar), new zzboh(zzbnl2), zzV(str3, u4Var2, str4), zzbnx, bundle != null ? bundle.getBundle(mediationInterstitialAdapter.getClass().getName()) : null);
                } catch (Throwable th) {
                    zzbza.zzh(MaxReward.DEFAULT_LABEL, th);
                    throw new RemoteException();
                }
            } else if (obj2 instanceof v4.a) {
                try {
                    ((v4.a) obj2).loadInterstitialAd(new o((Context) b.A1(aVar), MaxReward.DEFAULT_LABEL, zzV(str3, u4Var2, str4), zzU(u4Var2), zzW(u4Var), u4Var2.f14561l, u4Var2.f14557h, u4Var2.f14570u, zzX(str3, u4Var2), this.zzk), new zzbob(this, zzbnl2));
                } catch (Throwable th2) {
                    zzbza.zzh(MaxReward.DEFAULT_LABEL, th2);
                    throw new RemoteException();
                }
            }
        } else {
            String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
            String canonicalName2 = v4.a.class.getCanonicalName();
            String canonicalName3 = this.zza.getClass().getCanonicalName();
            zzbza.zzj(canonicalName + " or " + canonicalName2 + " #009 Class mismatch: " + canonicalName3);
            throw new RemoteException();
        }
    }

    public final void zzz(a aVar, u4 u4Var, String str, String str2, zzbnl zzbnl, zzbdl zzbdl, List list) throws RemoteException {
        Date date;
        u4 u4Var2 = u4Var;
        String str3 = str;
        String str4 = str2;
        zzbnl zzbnl2 = zzbnl;
        Object obj = this.zza;
        if ((obj instanceof MediationNativeAdapter) || (obj instanceof v4.a)) {
            zzbza.zze("Requesting native ad from adapter.");
            Object obj2 = this.zza;
            if (obj2 instanceof MediationNativeAdapter) {
                try {
                    MediationNativeAdapter mediationNativeAdapter = (MediationNativeAdapter) obj2;
                    List list2 = u4Var2.f14555f;
                    HashSet hashSet = list2 != null ? new HashSet(list2) : null;
                    long j10 = u4Var2.f14552b;
                    if (j10 == -1) {
                        date = null;
                    } else {
                        date = new Date(j10);
                    }
                    zzboj zzboj = new zzboj(date, u4Var2.f14554d, hashSet, u4Var2.f14561l, zzW(u4Var), u4Var2.f14557h, zzbdl, list, u4Var2.f14568s, u4Var2.f14570u, zzX(str3, u4Var2));
                    Bundle bundle = u4Var2.f14563n;
                    Bundle bundle2 = bundle != null ? bundle.getBundle(mediationNativeAdapter.getClass().getName()) : null;
                    this.zzb = new zzboh(zzbnl2);
                    mediationNativeAdapter.requestNativeAd((Context) b.A1(aVar), this.zzb, zzV(str3, u4Var2, str4), zzboj, bundle2);
                } catch (Throwable th) {
                    zzbza.zzh(MaxReward.DEFAULT_LABEL, th);
                    throw new RemoteException();
                }
            } else if (obj2 instanceof v4.a) {
                try {
                    ((v4.a) obj2).loadNativeAd(new q((Context) b.A1(aVar), MaxReward.DEFAULT_LABEL, zzV(str3, u4Var2, str4), zzU(u4Var2), zzW(u4Var), u4Var2.f14561l, u4Var2.f14557h, u4Var2.f14570u, zzX(str3, u4Var2), this.zzk, zzbdl), new zzboc(this, zzbnl2));
                } catch (Throwable th2) {
                    zzbza.zzh(MaxReward.DEFAULT_LABEL, th2);
                    throw new RemoteException();
                }
            }
        } else {
            String canonicalName = MediationNativeAdapter.class.getCanonicalName();
            String canonicalName2 = v4.a.class.getCanonicalName();
            String canonicalName3 = this.zza.getClass().getCanonicalName();
            zzbza.zzj(canonicalName + " or " + canonicalName2 + " #009 Class mismatch: " + canonicalName3);
            throw new RemoteException();
        }
    }

    public zzbof(f fVar) {
        this.zza = fVar;
    }
}
