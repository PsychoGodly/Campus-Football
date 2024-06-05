package y4;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.WebView;
import android.widget.ImageView;
import com.applovin.mediation.MaxReward;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.u4;
import com.google.android.gms.ads.internal.client.z4;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.z0;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.internal.ads.zzapw;
import com.google.android.gms.internal.ads.zzapx;
import com.google.android.gms.internal.ads.zzbaj;
import com.google.android.gms.internal.ads.zzbar;
import com.google.android.gms.internal.ads.zzbcd;
import com.google.android.gms.internal.ads.zzbrr;
import com.google.android.gms.internal.ads.zzbsa;
import com.google.android.gms.internal.ads.zzbxo;
import com.google.android.gms.internal.ads.zzbxq;
import com.google.android.gms.internal.ads.zzbxv;
import com.google.android.gms.internal.ads.zzbza;
import com.google.android.gms.internal.ads.zzbzg;
import com.google.android.gms.internal.ads.zzbzn;
import com.google.android.gms.internal.ads.zzcgd;
import com.google.android.gms.internal.ads.zzdlf;
import com.google.android.gms.internal.ads.zzdpd;
import com.google.android.gms.internal.ads.zzdpn;
import com.google.android.gms.internal.ads.zzezt;
import com.google.android.gms.internal.ads.zzfeb;
import com.google.android.gms.internal.ads.zzfec;
import com.google.android.gms.internal.ads.zzfen;
import com.google.android.gms.internal.ads.zzfep;
import com.google.android.gms.internal.ads.zzfff;
import com.google.android.gms.internal.ads.zzfoj;
import com.google.android.gms.internal.ads.zzfua;
import com.google.android.gms.internal.ads.zzfuj;
import com.google.android.gms.internal.ads.zzfut;
import com.google.android.gms.internal.ads.zzfuu;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import n4.g;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class e extends zzbxq {
    protected static final List E = new ArrayList(Arrays.asList(new String[]{"/aclk", "/pcs/click", "/dbm/clk"}));
    protected static final List F = new ArrayList(Arrays.asList(new String[]{".doubleclick.net", ".googleadservices.com"}));
    protected static final List G = new ArrayList(Arrays.asList(new String[]{"/pagead/adview", "/pcs/view", "/pagead/conversion", "/dbm/ad"}));
    protected static final List H = new ArrayList(Arrays.asList(new String[]{".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"}));
    public static final /* synthetic */ int I = 0;
    private final List A;
    private final List B;
    private final List C;
    private final zzfuu D = zzbzn.zze;

    /* renamed from: a  reason: collision with root package name */
    private final zzcgd f23911a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public Context f23912b;

    /* renamed from: c  reason: collision with root package name */
    private final zzapw f23913c;

    /* renamed from: d  reason: collision with root package name */
    private final zzezt f23914d;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public zzdpd f23915f = null;

    /* renamed from: g  reason: collision with root package name */
    private final zzfuu f23916g;

    /* renamed from: h  reason: collision with root package name */
    private final ScheduledExecutorService f23917h;

    /* renamed from: i  reason: collision with root package name */
    private zzbsa f23918i;

    /* renamed from: j  reason: collision with root package name */
    private Point f23919j = new Point();

    /* renamed from: k  reason: collision with root package name */
    private Point f23920k = new Point();

    /* renamed from: l  reason: collision with root package name */
    private final Set f23921l = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: m  reason: collision with root package name */
    private final x f23922m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final zzdpn f23923n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public final zzfff f23924o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public final boolean f23925p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public final boolean f23926q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public final boolean f23927r;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public final boolean f23928s;
    /* access modifiers changed from: private */

    /* renamed from: t  reason: collision with root package name */
    public final String f23929t;
    /* access modifiers changed from: private */

    /* renamed from: u  reason: collision with root package name */
    public final String f23930u;
    /* access modifiers changed from: private */

    /* renamed from: v  reason: collision with root package name */
    public final AtomicInteger f23931v = new AtomicInteger(0);
    /* access modifiers changed from: private */

    /* renamed from: w  reason: collision with root package name */
    public final zzbzg f23932w;
    /* access modifiers changed from: private */

    /* renamed from: x  reason: collision with root package name */
    public String f23933x;
    /* access modifiers changed from: private */

    /* renamed from: y  reason: collision with root package name */
    public final String f23934y;

    /* renamed from: z  reason: collision with root package name */
    private final List f23935z;

    public e(zzcgd zzcgd, Context context, zzapw zzapw, zzezt zzezt, zzfuu zzfuu, ScheduledExecutorService scheduledExecutorService, zzdpn zzdpn, zzfff zzfff, zzbzg zzbzg) {
        List list;
        this.f23911a = zzcgd;
        this.f23912b = context;
        this.f23913c = zzapw;
        this.f23914d = zzezt;
        this.f23916g = zzfuu;
        this.f23917h = scheduledExecutorService;
        this.f23922m = zzcgd.zzm();
        this.f23923n = zzdpn;
        this.f23924o = zzfff;
        this.f23932w = zzbzg;
        this.f23925p = ((Boolean) a0.c().zzb(zzbar.zzgO)).booleanValue();
        this.f23926q = ((Boolean) a0.c().zzb(zzbar.zzgN)).booleanValue();
        this.f23927r = ((Boolean) a0.c().zzb(zzbar.zzgP)).booleanValue();
        this.f23928s = ((Boolean) a0.c().zzb(zzbar.zzgR)).booleanValue();
        this.f23929t = (String) a0.c().zzb(zzbar.zzgQ);
        this.f23930u = (String) a0.c().zzb(zzbar.zzgS);
        this.f23934y = (String) a0.c().zzb(zzbar.zzgT);
        if (((Boolean) a0.c().zzb(zzbar.zzgU)).booleanValue()) {
            this.f23935z = X1((String) a0.c().zzb(zzbar.zzgV));
            this.A = X1((String) a0.c().zzb(zzbar.zzgW));
            this.B = X1((String) a0.c().zzb(zzbar.zzgX));
            list = X1((String) a0.c().zzb(zzbar.zzgY));
        } else {
            this.f23935z = E;
            this.A = F;
            this.B = G;
            list = H;
        }
        this.C = list;
    }

    static /* bridge */ /* synthetic */ void E1(e eVar, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (eVar.N1((Uri) it.next())) {
                eVar.f23931v.getAndIncrement();
                return;
            }
        }
    }

    static /* bridge */ /* synthetic */ void F1(e eVar, String str, String str2, zzdpd zzdpd) {
        if (((Boolean) a0.c().zzb(zzbar.zzgz)).booleanValue()) {
            if (((Boolean) a0.c().zzb(zzbar.zzgF)).booleanValue()) {
                zzbzn.zza.execute(new d0(eVar, str, str2, zzdpd));
            } else {
                eVar.f23922m.d(str, str2, zzdpd);
            }
        }
    }

    static final /* synthetic */ Uri P1(Uri uri, String str) {
        return !TextUtils.isEmpty(str) ? W1(uri, "nas", str) : uri;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final y4.c0 Q1(android.content.Context r8, java.lang.String r9, java.lang.String r10, com.google.android.gms.ads.internal.client.z4 r11, com.google.android.gms.ads.internal.client.u4 r12) {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.zzeyv r0 = new com.google.android.gms.internal.ads.zzeyv
            r0.<init>()
            java.lang.String r1 = "REWARDED"
            boolean r2 = r1.equals(r10)
            java.lang.String r3 = "REWARDED_INTERSTITIAL"
            r4 = 3
            r5 = 2
            if (r2 == 0) goto L_0x0019
            com.google.android.gms.internal.ads.zzeyi r2 = r0.zzo()
            r2.zza(r5)
            goto L_0x0026
        L_0x0019:
            boolean r2 = r3.equals(r10)
            if (r2 == 0) goto L_0x0026
            com.google.android.gms.internal.ads.zzeyi r2 = r0.zzo()
            r2.zza(r4)
        L_0x0026:
            com.google.android.gms.internal.ads.zzcgd r2 = r7.f23911a
            y4.b0 r2 = r2.zzn()
            com.google.android.gms.internal.ads.zzctx r6 = new com.google.android.gms.internal.ads.zzctx
            r6.<init>()
            r6.zzd(r8)
            if (r9 != 0) goto L_0x0038
            java.lang.String r9 = "adUnitId"
        L_0x0038:
            r0.zzs(r9)
            if (r12 != 0) goto L_0x0046
            com.google.android.gms.ads.internal.client.v4 r9 = new com.google.android.gms.ads.internal.client.v4
            r9.<init>()
            com.google.android.gms.ads.internal.client.u4 r12 = r9.a()
        L_0x0046:
            r0.zzE(r12)
            r9 = 1
            if (r11 != 0) goto L_0x00aa
            int r11 = r10.hashCode()
            r12 = 4
            switch(r11) {
                case -1999289321: goto L_0x0079;
                case -428325382: goto L_0x006f;
                case 543046670: goto L_0x0067;
                case 1854800829: goto L_0x005f;
                case 1951953708: goto L_0x0055;
                default: goto L_0x0054;
            }
        L_0x0054:
            goto L_0x0083
        L_0x0055:
            java.lang.String r11 = "BANNER"
            boolean r11 = r10.equals(r11)
            if (r11 == 0) goto L_0x0083
            r11 = 0
            goto L_0x0084
        L_0x005f:
            boolean r11 = r10.equals(r3)
            if (r11 == 0) goto L_0x0083
            r11 = 2
            goto L_0x0084
        L_0x0067:
            boolean r11 = r10.equals(r1)
            if (r11 == 0) goto L_0x0083
            r11 = 1
            goto L_0x0084
        L_0x006f:
            java.lang.String r11 = "APP_OPEN_AD"
            boolean r11 = r10.equals(r11)
            if (r11 == 0) goto L_0x0083
            r11 = 4
            goto L_0x0084
        L_0x0079:
            java.lang.String r11 = "NATIVE"
            boolean r11 = r10.equals(r11)
            if (r11 == 0) goto L_0x0083
            r11 = 3
            goto L_0x0084
        L_0x0083:
            r11 = -1
        L_0x0084:
            if (r11 == 0) goto L_0x00a3
            if (r11 == r9) goto L_0x009e
            if (r11 == r5) goto L_0x009e
            if (r11 == r4) goto L_0x0099
            if (r11 == r12) goto L_0x0094
            com.google.android.gms.ads.internal.client.z4 r11 = new com.google.android.gms.ads.internal.client.z4
            r11.<init>()
            goto L_0x00aa
        L_0x0094:
            com.google.android.gms.ads.internal.client.z4 r11 = com.google.android.gms.ads.internal.client.z4.v()
            goto L_0x00aa
        L_0x0099:
            com.google.android.gms.ads.internal.client.z4 r11 = com.google.android.gms.ads.internal.client.z4.w()
            goto L_0x00aa
        L_0x009e:
            com.google.android.gms.ads.internal.client.z4 r11 = com.google.android.gms.ads.internal.client.z4.x()
            goto L_0x00aa
        L_0x00a3:
            com.google.android.gms.ads.internal.client.z4 r11 = new com.google.android.gms.ads.internal.client.z4
            n4.h r12 = n4.h.f20927i
            r11.<init>((android.content.Context) r8, (n4.h) r12)
        L_0x00aa:
            r0.zzr(r11)
            r0.zzx(r9)
            com.google.android.gms.internal.ads.zzeyx r8 = r0.zzG()
            r6.zzh(r8)
            com.google.android.gms.internal.ads.zzctz r8 = r6.zzi()
            r2.zza(r8)
            y4.g r8 = new y4.g
            r8.<init>()
            r8.a(r10)
            y4.i r9 = new y4.i
            r10 = 0
            r9.<init>(r8, r10)
            r2.zzb(r9)
            com.google.android.gms.internal.ads.zzczz r8 = new com.google.android.gms.internal.ads.zzczz
            r8.<init>()
            y4.c0 r8 = r2.zzc()
            com.google.android.gms.internal.ads.zzdpd r9 = r8.zza()
            r7.f23915f = r9
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: y4.e.Q1(android.content.Context, java.lang.String, java.lang.String, com.google.android.gms.ads.internal.client.z4, com.google.android.gms.ads.internal.client.u4):y4.c0");
    }

    private final zzfut R1(String str) {
        zzdlf[] zzdlfArr = new zzdlf[1];
        zzfut zzm = zzfuj.zzm(this.f23914d.zza(), new g0(this, zzdlfArr, str), this.f23916g);
        zzm.zzc(new h0(this, zzdlfArr), this.f23916g);
        return zzfuj.zze(zzfuj.zzl((zzfua) zzfuj.zzn(zzfua.zzv(zzm), (long) ((Integer) a0.c().zzb(zzbar.zzhe)).intValue(), TimeUnit.MILLISECONDS, this.f23917h), e0.f23936a, this.f23916g), Exception.class, f0.f23946a, this.f23916g);
    }

    private final void S1(List list, a aVar, zzbrr zzbrr, boolean z10) {
        zzfut zzfut;
        if (!((Boolean) a0.c().zzb(zzbar.zzhd)).booleanValue()) {
            zzbza.zzj("The updating URL feature is not enabled.");
            try {
                zzbrr.zze("The updating URL feature is not enabled.");
            } catch (RemoteException e10) {
                zzbza.zzh(MaxReward.DEFAULT_LABEL, e10);
            }
        } else {
            Iterator it = list.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                if (N1((Uri) it.next())) {
                    i10++;
                }
            }
            if (i10 > 1) {
                zzbza.zzj("Multiple google urls found: ".concat(String.valueOf(list)));
            }
            ArrayList arrayList = new ArrayList();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                Uri uri = (Uri) it2.next();
                if (!N1(uri)) {
                    zzbza.zzj("Not a Google URL: ".concat(String.valueOf(uri)));
                    zzfut = zzfuj.zzh(uri);
                } else {
                    zzfut = this.f23916g.zzb(new n0(this, uri, aVar));
                    if (V1()) {
                        zzfut = zzfuj.zzm(zzfut, new o0(this), this.f23916g);
                    } else {
                        zzbza.zzi("Asset view map is empty.");
                    }
                }
                arrayList.add(zzfut);
            }
            zzfuj.zzq(zzfuj.zzd(arrayList), new u0(this, zzbrr, z10), this.f23911a.zzA());
        }
    }

    private final void T1(List list, a aVar, zzbrr zzbrr, boolean z10) {
        if (!((Boolean) a0.c().zzb(zzbar.zzhd)).booleanValue()) {
            try {
                zzbrr.zze("The updating URL feature is not enabled.");
            } catch (RemoteException e10) {
                zzbza.zzh(MaxReward.DEFAULT_LABEL, e10);
            }
        } else {
            zzfut zzb = this.f23916g.zzb(new p0(this, list, aVar));
            if (V1()) {
                zzb = zzfuj.zzm(zzb, new q0(this), this.f23916g);
            } else {
                zzbza.zzi("Asset view map is empty.");
            }
            zzfuj.zzq(zzb, new t0(this, zzbrr, z10), this.f23911a.zzA());
        }
    }

    private static boolean U1(Uri uri, List list, List list2) {
        String host = uri.getHost();
        String path = uri.getPath();
        if (!(host == null || path == null)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (path.contains((String) it.next())) {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        if (host.endsWith((String) it2.next())) {
                            return true;
                        }
                    }
                    continue;
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.zzb;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean V1() {
        /*
            r1 = this;
            com.google.android.gms.internal.ads.zzbsa r0 = r1.f23918i
            if (r0 == 0) goto L_0x0010
            java.util.Map r0 = r0.zzb
            if (r0 == 0) goto L_0x0010
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0010
            r0 = 1
            return r0
        L_0x0010:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: y4.e.V1():boolean");
    }

    /* access modifiers changed from: private */
    public static final Uri W1(Uri uri, String str, String str2) {
        String uri2 = uri.toString();
        int indexOf = uri2.indexOf("&adurl=");
        if (indexOf == -1) {
            indexOf = uri2.indexOf("?adurl=");
        }
        if (indexOf == -1) {
            return uri.buildUpon().appendQueryParameter(str, str2).build();
        }
        int i10 = indexOf + 1;
        return Uri.parse(uri2.substring(0, i10) + str + "=" + str2 + "&" + uri2.substring(i10));
    }

    private static final List X1(String str) {
        String[] split = TextUtils.split(str, ",");
        ArrayList arrayList = new ArrayList();
        for (String str2 : split) {
            if (!zzfoj.zzd(str2)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    static /* bridge */ /* synthetic */ zzfen f2(zzfut zzfut, zzbxv zzbxv) {
        String str;
        if (!zzfep.zza() || !((Boolean) zzbcd.zze.zze()).booleanValue()) {
            return null;
        }
        try {
            zzfen zzb = ((c0) zzfuj.zzo(zzfut)).zzb();
            zzb.zzd(new ArrayList(Collections.singletonList(zzbxv.zzb)));
            u4 u4Var = zzbxv.zzd;
            if (u4Var == null) {
                str = MaxReward.DEFAULT_LABEL;
            } else {
                str = u4Var.f14566q;
            }
            zzb.zzb(str);
            return zzb;
        } catch (ExecutionException e10) {
            t.q().zzu(e10, "SignalGeneratorImpl.getConfiguredCriticalUserJourney");
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ ArrayList A1(List list, String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (!O1(uri) || TextUtils.isEmpty(str)) {
                arrayList.add(uri);
            } else {
                arrayList.add(W1(uri, "nas", str));
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ ArrayList B1(List list, a aVar) throws Exception {
        String zzh = this.f23913c.zzc() != null ? this.f23913c.zzc().zzh(this.f23912b, (View) b.A1(aVar), (Activity) null) : MaxReward.DEFAULT_LABEL;
        if (!TextUtils.isEmpty(zzh)) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Uri uri = (Uri) it.next();
                if (!O1(uri)) {
                    zzbza.zzj("Not a Google URL: ".concat(String.valueOf(uri)));
                    arrayList.add(uri);
                } else {
                    arrayList.add(W1(uri, "ms", zzh));
                }
            }
            if (!arrayList.isEmpty()) {
                return arrayList;
            }
            throw new Exception("Empty impression URLs result.");
        }
        throw new Exception("Failed to get view signals.");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void G1(WebView webView) {
        CookieManager b10 = t.s().b(this.f23912b);
        boolean acceptThirdPartyCookies = b10 != null ? b10.acceptThirdPartyCookies(webView) : false;
        if (((Boolean) a0.c().zzb(zzbar.zziK)).booleanValue()) {
            zzdpn zzdpn = this.f23923n;
            zzdpd zzdpd = this.f23915f;
            Pair[] pairArr = new Pair[1];
            pairArr[0] = new Pair("tpc", true != acceptThirdPartyCookies ? "0" : UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
            a0.c(zzdpn, zzdpd, "reg_wv", pairArr);
        }
        if (acceptThirdPartyCookies) {
            Context context = this.f23912b;
            zzbaj zzbaj = zzbar.zziM;
            g.a aVar = new g.a();
            aVar.h("paw");
            u4.a.load(context, (String) a0.c().zzb(zzbaj), aVar.c(), new d(this));
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void H1(zzdlf[] zzdlfArr) {
        zzdlf zzdlf = zzdlfArr[0];
        if (zzdlf != null) {
            this.f23914d.zzb(zzfuj.zzh(zzdlf));
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void I1(String str, String str2, zzdpd zzdpd) {
        this.f23922m.d(str, str2, zzdpd);
    }

    /* access modifiers changed from: package-private */
    public final boolean N1(Uri uri) {
        return U1(uri, this.f23935z, this.A);
    }

    /* access modifiers changed from: package-private */
    public final boolean O1(Uri uri) {
        return U1(uri, this.B, this.C);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Uri a2(Uri uri, a aVar) throws Exception {
        try {
            uri = this.f23913c.zza(uri, this.f23912b, (View) b.A1(aVar), (Activity) null);
        } catch (zzapx e10) {
            zzbza.zzk(MaxReward.DEFAULT_LABEL, e10);
        }
        if (uri.getQueryParameter("ms") != null) {
            return uri;
        }
        throw new Exception("Failed to append spam signals to click url.");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ c0 e2(zzbxv zzbxv) throws Exception {
        return Q1(this.f23912b, zzbxv.zza, zzbxv.zzb, zzbxv.zzc, zzbxv.zzd);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfut i2() throws Exception {
        return Q1(this.f23912b, (String) null, n4.b.f20900a.name(), (z4) null, (u4) null).zzc();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfut j2(zzdlf[] zzdlfArr, String str, zzdlf zzdlf) throws Exception {
        zzdlfArr[0] = zzdlf;
        Context context = this.f23912b;
        zzbsa zzbsa = this.f23918i;
        Map map = zzbsa.zzb;
        JSONObject d10 = z0.d(context, map, map, zzbsa.zza, (ImageView.ScaleType) null);
        JSONObject g10 = z0.g(this.f23912b, this.f23918i.zza);
        JSONObject f10 = z0.f(this.f23918i.zza);
        JSONObject e10 = z0.e(this.f23912b, this.f23918i.zza);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("asset_view_signal", d10);
        jSONObject.put("ad_view_signal", g10);
        jSONObject.put("scroll_view_signal", f10);
        jSONObject.put("lock_screen_signal", e10);
        if ("google.afma.nativeAds.getPublisherCustomRenderedClickSignals".equals(str)) {
            jSONObject.put("click_signal", z0.c((String) null, this.f23912b, this.f23920k, this.f23919j));
        }
        return zzdlf.zzd(str, jSONObject);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfut k2(ArrayList arrayList) throws Exception {
        return zzfuj.zzl(R1("google.afma.nativeAds.getPublisherCustomRenderedImpressionSignals"), new k0(this, arrayList), this.f23916g);
    }

    public final void zze(a aVar, zzbxv zzbxv, zzbxo zzbxo) {
        zzfut zzfut;
        zzfut zzfut2;
        zzbxv zzbxv2 = zzbxv;
        Context context = (Context) b.A1(aVar);
        this.f23912b = context;
        zzfec zza = zzfeb.zza(context, 22);
        zza.zzh();
        if (((Boolean) a0.c().zzb(zzbar.zzjr)).booleanValue()) {
            zzfuu zzfuu = zzbzn.zza;
            zzfut = zzfuu.zzb(new l0(this, zzbxv));
            zzfut2 = zzfuj.zzm(zzfut, m0.f23968a, zzfuu);
        } else {
            c0 Q1 = Q1(this.f23912b, zzbxv2.zza, zzbxv2.zzb, zzbxv2.zzc, zzbxv2.zzd);
            zzfut = zzfuj.zzh(Q1);
            zzfut2 = Q1.zzc();
        }
        zzfuj.zzq(zzfut2, new s0(this, zzfut, zzbxv, zzbxo, zza, t.b().a()), this.f23911a.zzA());
    }

    public final void zzf(zzbsa zzbsa) {
        this.f23918i = zzbsa;
        this.f23914d.zzc(1);
    }

    public final void zzg(List list, a aVar, zzbrr zzbrr) {
        S1(list, aVar, zzbrr, true);
    }

    public final void zzh(List list, a aVar, zzbrr zzbrr) {
        T1(list, aVar, zzbrr, true);
    }

    public final void zzi(a aVar) {
        zzfut zzfut;
        if (((Boolean) a0.c().zzb(zzbar.zziE)).booleanValue()) {
            if (Build.VERSION.SDK_INT < 21) {
                zzbza.zzj("Not registering the webview because the Android API level is lower than Lollopop which has security risks on webviews.");
                return;
            }
            if (((Boolean) a0.c().zzb(zzbar.zziF)).booleanValue()) {
                if (!((Boolean) a0.c().zzb(zzbar.zziI)).booleanValue()) {
                    if (((Boolean) a0.c().zzb(zzbar.zzjr)).booleanValue()) {
                        zzfut = zzfuj.zzk(new r0(this), zzbzn.zza);
                    } else {
                        zzfut = Q1(this.f23912b, (String) null, n4.b.f20900a.name(), (z4) null, (u4) null).zzc();
                    }
                    zzfuj.zzq(zzfut, new c(this), this.f23911a.zzA());
                }
            }
            WebView webView = (WebView) b.A1(aVar);
            if (webView == null) {
                zzbza.zzg("The webView cannot be null.");
            } else if (this.f23921l.contains(webView)) {
                zzbza.zzi("This webview has already been registered.");
            } else {
                this.f23921l.add(webView);
                webView.addJavascriptInterface(new a(webView, this.f23913c, this.f23923n, this.f23924o), "gmaSdk");
                if (((Boolean) a0.c().zzb(zzbar.zziL)).booleanValue()) {
                    this.D.execute(new j0(this, webView));
                }
            }
        }
    }

    public final void zzj(a aVar) {
        View view;
        if (((Boolean) a0.c().zzb(zzbar.zzhd)).booleanValue()) {
            MotionEvent motionEvent = (MotionEvent) b.A1(aVar);
            zzbsa zzbsa = this.f23918i;
            if (zzbsa == null) {
                view = null;
            } else {
                view = zzbsa.zza;
            }
            this.f23919j = z0.a(motionEvent, view);
            if (motionEvent.getAction() == 0) {
                this.f23920k = this.f23919j;
            }
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            Point point = this.f23919j;
            obtain.setLocation((float) point.x, (float) point.y);
            this.f23913c.zzd(obtain);
            obtain.recycle();
        }
    }

    public final void zzk(List list, a aVar, zzbrr zzbrr) {
        S1(list, aVar, zzbrr, false);
    }

    public final void zzl(List list, a aVar, zzbrr zzbrr) {
        T1(list, aVar, zzbrr, false);
    }
}
