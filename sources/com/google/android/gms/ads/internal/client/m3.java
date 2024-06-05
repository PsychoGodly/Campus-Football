package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.AdapterStatus;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.internal.ads.zzbjl;
import com.google.android.gms.internal.ads.zzbjt;
import com.google.android.gms.internal.ads.zzbju;
import com.google.android.gms.internal.ads.zzbmy;
import com.google.android.gms.internal.ads.zzbza;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import n4.c;
import n4.r;
import n4.x;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class m3 {

    /* renamed from: i  reason: collision with root package name */
    private static m3 f14498i;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Object f14499a = new Object();
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f14500b = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public boolean f14501c = false;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public boolean f14502d = false;

    /* renamed from: e  reason: collision with root package name */
    private final Object f14503e = new Object();

    /* renamed from: f  reason: collision with root package name */
    private p1 f14504f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public r f14505g = null;

    /* renamed from: h  reason: collision with root package name */
    private x f14506h = new x.a().a();

    private m3() {
    }

    private final void A(Context context) {
        if (this.f14504f == null) {
            this.f14504f = (p1) new r(x.a(), context).d(context, false);
        }
    }

    private final void a(x xVar) {
        try {
            this.f14504f.zzu(new i4(xVar));
        } catch (RemoteException e10) {
            zzbza.zzh("Unable to set request configuration parcel.", e10);
        }
    }

    public static m3 g() {
        m3 m3Var;
        synchronized (m3.class) {
            if (f14498i == null) {
                f14498i = new m3();
            }
            m3Var = f14498i;
        }
        return m3Var;
    }

    /* access modifiers changed from: private */
    public static InitializationStatus y(List list) {
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzbjl zzbjl = (zzbjl) it.next();
            hashMap.put(zzbjl.zza, new zzbjt(zzbjl.zzb ? AdapterStatus.State.READY : AdapterStatus.State.NOT_READY, zzbjl.zzd, zzbjl.zzc));
        }
        return new zzbju(hashMap);
    }

    private final void z(Context context, String str) {
        try {
            zzbmy.zza().zzb(context, (String) null);
            this.f14504f.zzk();
            this.f14504f.zzl((String) null, b.B1(null));
        } catch (RemoteException e10) {
            zzbza.zzk("MobileAdsSettingManager initialization failed", e10);
        }
    }

    public final float b() {
        float f10;
        synchronized (this.f14503e) {
            p1 p1Var = this.f14504f;
            f10 = 1.0f;
            if (p1Var == null) {
                return 1.0f;
            }
            try {
                f10 = p1Var.zze();
            } catch (RemoteException e10) {
                zzbza.zzh("Unable to get app volume.", e10);
            }
        }
        return f10;
    }

    public final x d() {
        return this.f14506h;
    }

    public final InitializationStatus f() {
        InitializationStatus y10;
        synchronized (this.f14503e) {
            q.o(this.f14504f != null, "MobileAds.initialize() must be called prior to getting initialization status.");
            try {
                y10 = y(this.f14504f.zzg());
            } catch (RemoteException unused) {
                zzbza.zzg("Unable to get Initialization status.");
                return new e3(this);
            }
        }
        return y10;
    }

    public final void l(Context context) {
        synchronized (this.f14503e) {
            A(context);
            try {
                this.f14504f.zzi();
            } catch (RemoteException unused) {
                zzbza.zzg("Unable to disable mediation adapter initialization.");
            }
        }
    }

    public final void m(boolean z10) {
        synchronized (this.f14503e) {
            q.o(this.f14504f != null, "MobileAds.initialize() must be called prior to enable/disable Same App Key.");
            try {
                this.f14504f.zzj(z10);
            } catch (RemoteException e10) {
                String str = z10 ? "enable" : "disable";
                zzbza.zzh("Unable to " + str + " Same App Key.", e10);
                if (e10.getMessage() != null) {
                    if (e10.getMessage().toLowerCase(Locale.ROOT).contains("paid")) {
                        throw new IllegalStateException(e10);
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002a, code lost:
        if (r3 == null) goto L_0x00d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002c, code lost:
        r4 = r2.f14503e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x002e, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        A(r3);
        r2.f14504f.zzs(new com.google.android.gms.ads.internal.client.l3(r2, (com.google.android.gms.ads.internal.client.k3) null));
        r2.f14504f.zzo(new com.google.android.gms.internal.ads.zzbnc());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004e, code lost:
        if (r2.f14506h.b() != -1) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0056, code lost:
        if (r2.f14506h.c() == -1) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0058, code lost:
        a(r2.f14506h);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0060, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        com.google.android.gms.internal.ads.zzbza.zzk("MobileAdsSettingManager initialization failed", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00d7, code lost:
        throw new java.lang.IllegalArgumentException("Context cannot be null.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void n(android.content.Context r3, java.lang.String r4, com.google.android.gms.ads.initialization.OnInitializationCompleteListener r5) {
        /*
            r2 = this;
            java.lang.Object r4 = r2.f14499a
            monitor-enter(r4)
            boolean r0 = r2.f14501c     // Catch:{ all -> 0x00d8 }
            if (r0 == 0) goto L_0x0010
            if (r5 == 0) goto L_0x000e
            java.util.ArrayList r3 = r2.f14500b     // Catch:{ all -> 0x00d8 }
            r3.add(r5)     // Catch:{ all -> 0x00d8 }
        L_0x000e:
            monitor-exit(r4)     // Catch:{ all -> 0x00d8 }
            return
        L_0x0010:
            boolean r0 = r2.f14502d     // Catch:{ all -> 0x00d8 }
            if (r0 == 0) goto L_0x001f
            if (r5 == 0) goto L_0x001d
            com.google.android.gms.ads.initialization.InitializationStatus r3 = r2.f()     // Catch:{ all -> 0x00d8 }
            r5.onInitializationComplete(r3)     // Catch:{ all -> 0x00d8 }
        L_0x001d:
            monitor-exit(r4)     // Catch:{ all -> 0x00d8 }
            return
        L_0x001f:
            r0 = 1
            r2.f14501c = r0     // Catch:{ all -> 0x00d8 }
            if (r5 == 0) goto L_0x0029
            java.util.ArrayList r0 = r2.f14500b     // Catch:{ all -> 0x00d8 }
            r0.add(r5)     // Catch:{ all -> 0x00d8 }
        L_0x0029:
            monitor-exit(r4)     // Catch:{ all -> 0x00d8 }
            if (r3 == 0) goto L_0x00d0
            java.lang.Object r4 = r2.f14503e
            monitor-enter(r4)
            r5 = 0
            r2.A(r3)     // Catch:{ RemoteException -> 0x0060 }
            com.google.android.gms.ads.internal.client.p1 r0 = r2.f14504f     // Catch:{ RemoteException -> 0x0060 }
            com.google.android.gms.ads.internal.client.l3 r1 = new com.google.android.gms.ads.internal.client.l3     // Catch:{ RemoteException -> 0x0060 }
            r1.<init>(r2, r5)     // Catch:{ RemoteException -> 0x0060 }
            r0.zzs(r1)     // Catch:{ RemoteException -> 0x0060 }
            com.google.android.gms.ads.internal.client.p1 r0 = r2.f14504f     // Catch:{ RemoteException -> 0x0060 }
            com.google.android.gms.internal.ads.zzbnc r1 = new com.google.android.gms.internal.ads.zzbnc     // Catch:{ RemoteException -> 0x0060 }
            r1.<init>()     // Catch:{ RemoteException -> 0x0060 }
            r0.zzo(r1)     // Catch:{ RemoteException -> 0x0060 }
            n4.x r0 = r2.f14506h     // Catch:{ RemoteException -> 0x0060 }
            int r0 = r0.b()     // Catch:{ RemoteException -> 0x0060 }
            r1 = -1
            if (r0 != r1) goto L_0x0058
            n4.x r0 = r2.f14506h     // Catch:{ RemoteException -> 0x0060 }
            int r0 = r0.c()     // Catch:{ RemoteException -> 0x0060 }
            if (r0 == r1) goto L_0x0066
        L_0x0058:
            n4.x r0 = r2.f14506h     // Catch:{ RemoteException -> 0x0060 }
            r2.a(r0)     // Catch:{ RemoteException -> 0x0060 }
            goto L_0x0066
        L_0x005e:
            r3 = move-exception
            goto L_0x00ce
        L_0x0060:
            r0 = move-exception
            java.lang.String r1 = "MobileAdsSettingManager initialization failed"
            com.google.android.gms.internal.ads.zzbza.zzk(r1, r0)     // Catch:{ all -> 0x005e }
        L_0x0066:
            com.google.android.gms.internal.ads.zzbar.zzc(r3)     // Catch:{ all -> 0x005e }
            com.google.android.gms.internal.ads.zzbbw r0 = com.google.android.gms.internal.ads.zzbci.zza     // Catch:{ all -> 0x005e }
            java.lang.Object r0 = r0.zze()     // Catch:{ all -> 0x005e }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x005e }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x005e }
            if (r0 == 0) goto L_0x0099
            com.google.android.gms.internal.ads.zzbaj r0 = com.google.android.gms.internal.ads.zzbar.zzjv     // Catch:{ all -> 0x005e }
            com.google.android.gms.internal.ads.zzbap r1 = com.google.android.gms.ads.internal.client.a0.c()     // Catch:{ all -> 0x005e }
            java.lang.Object r0 = r1.zzb(r0)     // Catch:{ all -> 0x005e }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x005e }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x005e }
            if (r0 == 0) goto L_0x0099
            java.lang.String r0 = "Initializing on bg thread"
            com.google.android.gms.internal.ads.zzbza.zze(r0)     // Catch:{ all -> 0x005e }
            java.util.concurrent.ThreadPoolExecutor r0 = com.google.android.gms.internal.ads.zzbyp.zza     // Catch:{ all -> 0x005e }
            com.google.android.gms.ads.internal.client.f3 r1 = new com.google.android.gms.ads.internal.client.f3     // Catch:{ all -> 0x005e }
            r1.<init>(r2, r3, r5)     // Catch:{ all -> 0x005e }
            r0.execute(r1)     // Catch:{ all -> 0x005e }
            goto L_0x00cc
        L_0x0099:
            com.google.android.gms.internal.ads.zzbbw r0 = com.google.android.gms.internal.ads.zzbci.zzb     // Catch:{ all -> 0x005e }
            java.lang.Object r0 = r0.zze()     // Catch:{ all -> 0x005e }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x005e }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x005e }
            if (r0 == 0) goto L_0x00c4
            com.google.android.gms.internal.ads.zzbaj r0 = com.google.android.gms.internal.ads.zzbar.zzjv     // Catch:{ all -> 0x005e }
            com.google.android.gms.internal.ads.zzbap r1 = com.google.android.gms.ads.internal.client.a0.c()     // Catch:{ all -> 0x005e }
            java.lang.Object r0 = r1.zzb(r0)     // Catch:{ all -> 0x005e }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x005e }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x005e }
            if (r0 == 0) goto L_0x00c4
            java.util.concurrent.ExecutorService r0 = com.google.android.gms.internal.ads.zzbyp.zzb     // Catch:{ all -> 0x005e }
            com.google.android.gms.ads.internal.client.g3 r1 = new com.google.android.gms.ads.internal.client.g3     // Catch:{ all -> 0x005e }
            r1.<init>(r2, r3, r5)     // Catch:{ all -> 0x005e }
            r0.execute(r1)     // Catch:{ all -> 0x005e }
            goto L_0x00cc
        L_0x00c4:
            java.lang.String r0 = "Initializing on calling thread"
            com.google.android.gms.internal.ads.zzbza.zze(r0)     // Catch:{ all -> 0x005e }
            r2.z(r3, r5)     // Catch:{ all -> 0x005e }
        L_0x00cc:
            monitor-exit(r4)     // Catch:{ all -> 0x005e }
            return
        L_0x00ce:
            monitor-exit(r4)     // Catch:{ all -> 0x005e }
            throw r3
        L_0x00d0:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Context cannot be null."
            r3.<init>(r4)
            throw r3
        L_0x00d8:
            r3 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00d8 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.client.m3.n(android.content.Context, java.lang.String, com.google.android.gms.ads.initialization.OnInitializationCompleteListener):void");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void o(Context context, String str) {
        synchronized (this.f14503e) {
            z(context, (String) null);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void p(Context context, String str) {
        synchronized (this.f14503e) {
            z(context, (String) null);
        }
    }

    public final void q(Context context, r rVar) {
        synchronized (this.f14503e) {
            A(context);
            this.f14505g = rVar;
            try {
                this.f14504f.zzm(new j3((i3) null));
            } catch (RemoteException unused) {
                zzbza.zzg("Unable to open the ad inspector.");
                if (rVar != null) {
                    rVar.a(new c(0, "Ad inspector had an internal error.", MobileAds.ERROR_DOMAIN));
                }
            }
        }
    }

    public final void r(Context context, String str) {
        synchronized (this.f14503e) {
            q.o(this.f14504f != null, "MobileAds.initialize() must be called prior to opening debug menu.");
            try {
                this.f14504f.zzn(b.B1(context), str);
            } catch (RemoteException e10) {
                zzbza.zzh("Unable to open debug menu.", e10);
            }
        }
    }

    public final void s(Class cls) {
        synchronized (this.f14503e) {
            try {
                this.f14504f.zzh(cls.getCanonicalName());
            } catch (RemoteException e10) {
                zzbza.zzh("Unable to register RtbAdapter", e10);
            }
        }
    }

    public final void t(boolean z10) {
        synchronized (this.f14503e) {
            q.o(this.f14504f != null, "MobileAds.initialize() must be called prior to setting app muted state.");
            try {
                this.f14504f.zzp(z10);
            } catch (RemoteException e10) {
                zzbza.zzh("Unable to set app mute state.", e10);
            }
        }
    }

    public final void u(float f10) {
        boolean z10 = true;
        q.b(f10 >= 0.0f && f10 <= 1.0f, "The app volume must be a value between 0 and 1 inclusive.");
        synchronized (this.f14503e) {
            if (this.f14504f == null) {
                z10 = false;
            }
            q.o(z10, "MobileAds.initialize() must be called prior to setting the app volume.");
            try {
                this.f14504f.zzq(f10);
            } catch (RemoteException e10) {
                zzbza.zzh("Unable to set app volume.", e10);
            }
        }
    }

    public final void v(String str) {
        synchronized (this.f14503e) {
            q.o(this.f14504f != null, "MobileAds.initialize() must be called prior to setting the plugin.");
            try {
                this.f14504f.zzt(str);
            } catch (RemoteException e10) {
                zzbza.zzh("Unable to set plugin.", e10);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void w(n4.x r5) {
        /*
            r4 = this;
            if (r5 == 0) goto L_0x0004
            r0 = 1
            goto L_0x0005
        L_0x0004:
            r0 = 0
        L_0x0005:
            java.lang.String r1 = "Null passed to setRequestConfiguration."
            com.google.android.gms.common.internal.q.b(r0, r1)
            java.lang.Object r0 = r4.f14503e
            monitor-enter(r0)
            n4.x r1 = r4.f14506h     // Catch:{ all -> 0x0030 }
            r4.f14506h = r5     // Catch:{ all -> 0x0030 }
            com.google.android.gms.ads.internal.client.p1 r2 = r4.f14504f     // Catch:{ all -> 0x0030 }
            if (r2 != 0) goto L_0x0017
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            return
        L_0x0017:
            int r2 = r1.b()     // Catch:{ all -> 0x0030 }
            int r3 = r5.b()     // Catch:{ all -> 0x0030 }
            if (r2 != r3) goto L_0x002b
            int r1 = r1.c()     // Catch:{ all -> 0x0030 }
            int r2 = r5.c()     // Catch:{ all -> 0x0030 }
            if (r1 == r2) goto L_0x002e
        L_0x002b:
            r4.a(r5)     // Catch:{ all -> 0x0030 }
        L_0x002e:
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            return
        L_0x0030:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.client.m3.w(n4.x):void");
    }

    public final boolean x() {
        boolean z10;
        synchronized (this.f14503e) {
            p1 p1Var = this.f14504f;
            z10 = false;
            if (p1Var == null) {
                return false;
            }
            try {
                z10 = p1Var.zzv();
            } catch (RemoteException e10) {
                zzbza.zzh("Unable to get app mute state.", e10);
            }
        }
        return z10;
    }
}
