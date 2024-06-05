package com.startapp.sdk.adsbase;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.startapp.i3;
import com.startapp.k;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.model.GetAdRequest;
import com.startapp.sdk.components.ComponentLocator;
import com.startapp.x0;

/* compiled from: Sta */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public final Context f16909a;

    /* renamed from: b  reason: collision with root package name */
    public final Ad f16910b;

    /* renamed from: c  reason: collision with root package name */
    public final AdPreferences f16911c;

    /* renamed from: d  reason: collision with root package name */
    public AdEventListener f16912d;

    /* renamed from: e  reason: collision with root package name */
    public AdPreferences.Placement f16913e;

    /* renamed from: f  reason: collision with root package name */
    public String f16914f = null;

    /* compiled from: Sta */
    public class a implements Runnable {
        public a() {
        }

        public void run() {
            b bVar = b.this;
            try {
                new Handler(Looper.getMainLooper()).post(new x0(bVar, bVar.b()));
            } catch (Throwable th) {
                i3.a(th);
            }
        }
    }

    public b(Context context, Ad ad2, AdPreferences adPreferences, AdEventListener adEventListener, AdPreferences.Placement placement) {
        this.f16909a = context;
        this.f16910b = ad2;
        this.f16911c = adPreferences;
        this.f16912d = adEventListener;
        this.f16913e = placement;
    }

    public AdEventListener a() {
        AdEventListener adEventListener = this.f16912d;
        this.f16912d = null;
        return adEventListener;
    }

    public abstract boolean a(Object obj);

    public boolean b() {
        try {
            return a(e());
        } catch (Throwable th) {
            i3.a(th);
            return false;
        }
    }

    public void c() {
        try {
            ComponentLocator.a(this.f16909a).r().execute(new a());
            return;
        } catch (Throwable th) {
            i3.a(th);
        }
        i3.a(th);
    }

    public GetAdRequest d() {
        GetAdRequest a10 = a(new GetAdRequest());
        if (a10 != null) {
            a10.f(this.f16909a);
        }
        return a10;
    }

    public abstract Object e();

    public void a(boolean z10) {
        b(z10);
        if (!z10) {
            this.f16910b.setErrorMessage(this.f16914f);
            k.a(this.f16909a, a(), this.f16910b, false);
        }
    }

    public void b(boolean z10) {
        this.f16910b.setState(z10 ? Ad.AdState.READY : Ad.AdState.UN_INITIALIZED);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0067, code lost:
        if (r0.equals(r6.second) == false) goto L_0x0069;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0042 A[Catch:{ all -> 0x0078 }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0043 A[Catch:{ all -> 0x0078 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004e A[Catch:{ all -> 0x0078 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004f A[Catch:{ all -> 0x0078 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.startapp.sdk.adsbase.model.GetAdRequest a(com.startapp.sdk.adsbase.model.GetAdRequest r11) {
        /*
            r10 = this;
            android.content.Context r0 = r10.f16909a
            com.startapp.sdk.adsbase.remoteconfig.MetaData r1 = com.startapp.sdk.adsbase.remoteconfig.MetaData.f17070k
            com.startapp.sdk.adsbase.remoteconfig.SimpleTokenConfig r1 = r1.K()
            boolean r1 = r1.a(r0)
            com.startapp.sdk.adsbase.remoteconfig.MetaData r2 = com.startapp.sdk.adsbase.remoteconfig.MetaData.f17070k
            boolean r2 = r2.S()
            com.startapp.sdk.adsbase.remoteconfig.MetaData r3 = com.startapp.sdk.adsbase.remoteconfig.MetaData.f17070k
            boolean r3 = r3.a0()
            java.lang.Class<com.startapp.sdk.adsbase.SimpleTokenUtils> r4 = com.startapp.sdk.adsbase.SimpleTokenUtils.class
            monitor-enter(r4)
            com.startapp.sdk.common.utils.Pair r5 = new com.startapp.sdk.common.utils.Pair     // Catch:{ all -> 0x00fe }
            com.startapp.sdk.adsbase.SimpleTokenUtils$TokenType r6 = com.startapp.sdk.adsbase.SimpleTokenUtils.TokenType.T1     // Catch:{ all -> 0x00fe }
            java.lang.String r7 = ""
            r5.<init>(r6, r7)     // Catch:{ all -> 0x00fe }
            r7 = 0
            r8 = 1
            if (r1 == 0) goto L_0x007c
            com.startapp.sdk.adsbase.SimpleTokenUtils$TokenType r1 = com.startapp.sdk.adsbase.SimpleTokenUtils.f16791h     // Catch:{ all -> 0x0078 }
            com.startapp.sdk.adsbase.SimpleTokenUtils$TokenType r9 = com.startapp.sdk.adsbase.SimpleTokenUtils.TokenType.UNDEFINED     // Catch:{ all -> 0x0078 }
            if (r1 != r9) goto L_0x006b
            boolean r1 = com.startapp.sdk.adsbase.SimpleTokenUtils.f16789f     // Catch:{ all -> 0x0078 }
            boolean r6 = com.startapp.sdk.adsbase.SimpleTokenUtils.f16790g     // Catch:{ all -> 0x0078 }
            if (r6 == 0) goto L_0x003c
            if (r1 == 0) goto L_0x0037
            goto L_0x003c
        L_0x0037:
            com.startapp.sdk.common.utils.Pair r6 = com.startapp.sdk.adsbase.SimpleTokenUtils.b((android.content.Context) r0)     // Catch:{ all -> 0x0078 }
            goto L_0x0040
        L_0x003c:
            com.startapp.sdk.common.utils.Pair r6 = com.startapp.sdk.adsbase.SimpleTokenUtils.a((android.content.Context) r0)     // Catch:{ all -> 0x0078 }
        L_0x0040:
            if (r3 == 0) goto L_0x0043
            goto L_0x004a
        L_0x0043:
            boolean r1 = com.startapp.sdk.adsbase.SimpleTokenUtils.f16790g     // Catch:{ all -> 0x0078 }
            if (r1 != 0) goto L_0x0049
            r1 = 1
            goto L_0x004a
        L_0x0049:
            r1 = 0
        L_0x004a:
            com.startapp.sdk.adsbase.SimpleTokenUtils.f16790g = r1     // Catch:{ all -> 0x0078 }
            if (r2 == 0) goto L_0x004f
            goto L_0x0069
        L_0x004f:
            com.startapp.sdk.components.ComponentLocator r0 = com.startapp.sdk.components.ComponentLocator.a((android.content.Context) r0)     // Catch:{ all -> 0x0078 }
            com.startapp.sdk.adsbase.e r0 = r0.e()     // Catch:{ all -> 0x0078 }
            java.lang.String r1 = "shared_prefs_simple_token"
            java.lang.String r2 = ""
            java.lang.String r0 = r0.getString(r1, r2)     // Catch:{ all -> 0x0078 }
            if (r0 == 0) goto L_0x007c
            S r1 = r6.second     // Catch:{ all -> 0x0078 }
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x0078 }
            if (r0 != 0) goto L_0x007c
        L_0x0069:
            r5 = r6
            goto L_0x007c
        L_0x006b:
            if (r1 != r6) goto L_0x0072
            com.startapp.sdk.common.utils.Pair r0 = com.startapp.sdk.adsbase.SimpleTokenUtils.a((android.content.Context) r0)     // Catch:{ all -> 0x0078 }
            goto L_0x0076
        L_0x0072:
            com.startapp.sdk.common.utils.Pair r0 = com.startapp.sdk.adsbase.SimpleTokenUtils.b((android.content.Context) r0)     // Catch:{ all -> 0x0078 }
        L_0x0076:
            r5 = r0
            goto L_0x007c
        L_0x0078:
            r0 = move-exception
            com.startapp.i3.a((java.lang.Throwable) r0)     // Catch:{ all -> 0x00fe }
        L_0x007c:
            com.startapp.sdk.common.utils.Pair r0 = new com.startapp.sdk.common.utils.Pair     // Catch:{ all -> 0x00fe }
            F r1 = r5.first     // Catch:{ all -> 0x00fe }
            com.startapp.sdk.adsbase.SimpleTokenUtils$TokenType r1 = (com.startapp.sdk.adsbase.SimpleTokenUtils.TokenType) r1     // Catch:{ all -> 0x00fe }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00fe }
            S r2 = r5.second     // Catch:{ all -> 0x00fe }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x00fe }
            monitor-exit(r4)
            android.content.Context r1 = r10.f16909a     // Catch:{ all -> 0x00ee }
            com.startapp.sdk.adsbase.model.AdPreferences r2 = r10.f16911c     // Catch:{ all -> 0x00ee }
            com.startapp.sdk.adsbase.model.AdPreferences$Placement r3 = r10.f16913e     // Catch:{ all -> 0x00ee }
            r11.a(r1, r2, r3, r0)     // Catch:{ all -> 0x00ee }
            android.content.Context r1 = r10.f16909a     // Catch:{ all -> 0x00ee }
            r11.g(r1)     // Catch:{ all -> 0x00ee }
            com.startapp.sdk.adsbase.AdsCommonMetaData r1 = com.startapp.sdk.adsbase.AdsCommonMetaData.f16770h     // Catch:{ all -> 0x00ee }
            boolean r1 = r1.M()     // Catch:{ all -> 0x00ee }
            if (r1 != 0) goto L_0x00ae
            android.content.Context r1 = r10.f16909a     // Catch:{ all -> 0x00ee }
            com.startapp.sdk.adsbase.model.AdPreferences$Placement r2 = r10.f16913e     // Catch:{ all -> 0x00ee }
            boolean r1 = com.startapp.sdk.adsbase.a.a((android.content.Context) r1, (com.startapp.sdk.adsbase.model.AdPreferences.Placement) r2)     // Catch:{ all -> 0x00ee }
            if (r1 == 0) goto L_0x00ae
            r11.f17041v0 = r8     // Catch:{ all -> 0x00ee }
        L_0x00ae:
            android.content.Context r0 = r10.f16909a     // Catch:{ all -> 0x00b6 }
            com.startapp.sdk.adsbase.model.AdPreferences r1 = r10.f16911c     // Catch:{ all -> 0x00b6 }
            r11.a(r0, r1)     // Catch:{ all -> 0x00b6 }
            goto L_0x00ba
        L_0x00b6:
            r0 = move-exception
            com.startapp.i3.a((java.lang.Throwable) r0)
        L_0x00ba:
            android.content.Context r0 = r10.f16909a     // Catch:{ all -> 0x00e9 }
            com.startapp.sdk.components.ComponentLocator r0 = com.startapp.sdk.components.ComponentLocator.a((android.content.Context) r0)     // Catch:{ all -> 0x00e9 }
            com.startapp.b5 r0 = r0.q()     // Catch:{ all -> 0x00e9 }
            double r0 = r0.b()     // Catch:{ all -> 0x00e9 }
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L_0x00ed
            java.util.Locale r2 = java.util.Locale.ENGLISH     // Catch:{ all -> 0x00e9 }
            java.lang.String r3 = "%d"
            java.lang.Object[] r4 = new java.lang.Object[r8]     // Catch:{ all -> 0x00e9 }
            r5 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r0 = r0 * r5
            long r0 = java.lang.Math.round(r0)     // Catch:{ all -> 0x00e9 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00e9 }
            r4[r7] = r0     // Catch:{ all -> 0x00e9 }
            java.lang.String r0 = java.lang.String.format(r2, r3, r4)     // Catch:{ all -> 0x00e9 }
            r11.S0 = r0     // Catch:{ all -> 0x00e9 }
            goto L_0x00ed
        L_0x00e9:
            r0 = move-exception
            com.startapp.i3.a((java.lang.Throwable) r0)
        L_0x00ed:
            return r11
        L_0x00ee:
            r11 = move-exception
            com.startapp.i3.a((java.lang.Throwable) r11)
            F r11 = r0.first
            java.lang.String r11 = (java.lang.String) r11
            com.startapp.sdk.adsbase.SimpleTokenUtils$TokenType r11 = com.startapp.sdk.adsbase.SimpleTokenUtils.TokenType.a(r11)
            com.startapp.sdk.adsbase.SimpleTokenUtils.f16791h = r11
            r11 = 0
            return r11
        L_0x00fe:
            r11 = move-exception
            monitor-exit(r4)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.adsbase.b.a(com.startapp.sdk.adsbase.model.GetAdRequest):com.startapp.sdk.adsbase.model.GetAdRequest");
    }
}
