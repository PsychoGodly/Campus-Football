package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.TrafficStats;
import android.net.Uri;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.applovin.mediation.MaxReward;
import com.google.android.gms.ads.internal.b;
import com.google.android.gms.ads.internal.client.a;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.b2;
import com.google.android.gms.ads.internal.util.n1;
import com.google.android.gms.ads.internal.util.t0;
import com.unity3d.services.core.network.model.HttpRequest;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import m5.n;
import t4.c0;
import t4.e0;
import t4.i;
import t4.r;
import t4.s;
import t4.t;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public class zzcep extends WebViewClient implements zzcfv {
    public static final /* synthetic */ int zzb = 0;
    private boolean zzA;
    private final HashSet zzB;
    private View.OnAttachStateChangeListener zzC;
    protected zzbwb zza;
    private final zzcei zzc;
    private final zzawe zzd;
    private final HashMap zze = new HashMap();
    private final Object zzf = new Object();
    private a zzg;
    private t zzh;
    private zzcft zzi;
    private zzcfu zzj;
    private zzbgi zzk;
    private zzbgk zzl;
    private zzdcc zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzp;
    private boolean zzq;
    private boolean zzr;
    private e0 zzs;
    private zzbqe zzt;
    private b zzu;
    private zzbpz zzv;
    private zzfff zzw;
    private boolean zzx;
    private boolean zzy;
    private int zzz;

    public zzcep(zzcei zzcei, zzawe zzawe, boolean z10) {
        zzbqe zzbqe = new zzbqe(zzcei, zzcei.zzE(), new zzbab(zzcei.getContext()));
        this.zzd = zzawe;
        this.zzc = zzcei;
        this.zzp = z10;
        this.zzt = zzbqe;
        this.zzv = null;
        this.zzB = new HashSet(Arrays.asList(((String) a0.c().zzb(zzbar.zzfh)).split(",")));
    }

    private static WebResourceResponse zzN() {
        if (((Boolean) a0.c().zzb(zzbar.zzaD)).booleanValue()) {
            return new WebResourceResponse(MaxReward.DEFAULT_LABEL, MaxReward.DEFAULT_LABEL, new ByteArrayInputStream(new byte[0]));
        }
        return null;
    }

    private final WebResourceResponse zzO(String str, Map map) throws IOException {
        HttpURLConnection httpURLConnection;
        URL url = new URL(str);
        try {
            TrafficStats.setThreadStatsTag(264);
            int i10 = 0;
            while (true) {
                i10++;
                if (i10 <= 20) {
                    URLConnection openConnection = url.openConnection();
                    openConnection.setConnectTimeout(10000);
                    openConnection.setReadTimeout(10000);
                    for (Map.Entry entry : map.entrySet()) {
                        openConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                    }
                    if (openConnection instanceof HttpURLConnection) {
                        httpURLConnection = (HttpURLConnection) openConnection;
                        com.google.android.gms.ads.internal.t.r().D(this.zzc.getContext(), this.zzc.zzn().zza, false, httpURLConnection, false, 60000);
                        zzbyz zzbyz = new zzbyz((String) null);
                        zzbyz.zzc(httpURLConnection, (byte[]) null);
                        int responseCode = httpURLConnection.getResponseCode();
                        zzbyz.zze(httpURLConnection, responseCode);
                        if (responseCode < 300 || responseCode >= 400) {
                            com.google.android.gms.ads.internal.t.r();
                            WebResourceResponse m10 = b2.m(httpURLConnection);
                        } else {
                            String headerField = httpURLConnection.getHeaderField("Location");
                            if (headerField == null) {
                                throw new IOException("Missing Location header in redirect");
                            } else if (headerField.startsWith("tel:")) {
                                TrafficStats.clearThreadStatsTag();
                                return null;
                            } else {
                                URL url2 = new URL(url, headerField);
                                String protocol = url2.getProtocol();
                                if (protocol == null) {
                                    zzbza.zzj("Protocol is null");
                                    WebResourceResponse zzN = zzN();
                                    TrafficStats.clearThreadStatsTag();
                                    return zzN;
                                } else if (protocol.equals("http") || protocol.equals(HttpRequest.DEFAULT_SCHEME)) {
                                    zzbza.zze("Redirecting to " + headerField);
                                    httpURLConnection.disconnect();
                                    url = url2;
                                } else {
                                    zzbza.zzj("Unsupported scheme: " + protocol);
                                    return zzN();
                                }
                            }
                        }
                    } else {
                        throw new IOException("Invalid protocol.");
                    }
                } else {
                    TrafficStats.clearThreadStatsTag();
                    throw new IOException("Too many redirects (20)");
                }
            }
            com.google.android.gms.ads.internal.t.r();
            WebResourceResponse m102 = b2.m(httpURLConnection);
            TrafficStats.clearThreadStatsTag();
            return m102;
        } finally {
            TrafficStats.clearThreadStatsTag();
        }
    }

    /* access modifiers changed from: private */
    public final void zzP(Map map, List list, String str) {
        if (n1.c()) {
            n1.a("Received GMSG: ".concat(str));
            for (String str2 : map.keySet()) {
                n1.a("  " + str2 + ": " + ((String) map.get(str2)));
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((zzbhp) it.next()).zza(this.zzc, map);
        }
    }

    private final void zzQ() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.zzC;
        if (onAttachStateChangeListener != null) {
            ((View) this.zzc).removeOnAttachStateChangeListener(onAttachStateChangeListener);
        }
    }

    /* access modifiers changed from: private */
    public final void zzR(View view, zzbwb zzbwb, int i10) {
        if (zzbwb.zzi() && i10 > 0) {
            zzbwb.zzg(view);
            if (zzbwb.zzi()) {
                b2.f14773i.postDelayed(new zzcel(this, view, zzbwb, i10), 100);
            }
        }
    }

    private static final boolean zzS(boolean z10, zzcei zzcei) {
        return z10 && !zzcei.zzO().zzi() && !zzcei.zzS().equals("interstitial_mb");
    }

    public final void onAdClicked() {
        a aVar = this.zzg;
        if (aVar != null) {
            aVar.onAdClicked();
        }
    }

    public final void onLoadResource(WebView webView, String str) {
        n1.a("Loading resource: ".concat(String.valueOf(str)));
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            zzj(parse);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001d, code lost:
        if (r1 == null) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
        r1.zza();
        r0.zzj = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        zzg();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0018, code lost:
        r0.zzx = true;
        r1 = r0.zzj;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onPageFinished(android.webkit.WebView r1, java.lang.String r2) {
        /*
            r0 = this;
            java.lang.Object r1 = r0.zzf
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzcei r2 = r0.zzc     // Catch:{ all -> 0x0029 }
            boolean r2 = r2.zzaz()     // Catch:{ all -> 0x0029 }
            if (r2 == 0) goto L_0x0017
            java.lang.String r2 = "Blank page loaded, 1..."
            com.google.android.gms.ads.internal.util.n1.a(r2)     // Catch:{ all -> 0x0029 }
            com.google.android.gms.internal.ads.zzcei r2 = r0.zzc     // Catch:{ all -> 0x0029 }
            r2.zzU()     // Catch:{ all -> 0x0029 }
            monitor-exit(r1)     // Catch:{ all -> 0x0029 }
            return
        L_0x0017:
            monitor-exit(r1)     // Catch:{ all -> 0x0029 }
            r1 = 1
            r0.zzx = r1
            com.google.android.gms.internal.ads.zzcfu r1 = r0.zzj
            if (r1 == 0) goto L_0x0025
            r1.zza()
            r1 = 0
            r0.zzj = r1
        L_0x0025:
            r0.zzg()
            return
        L_0x0029:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0029 }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcep.onPageFinished(android.webkit.WebView, java.lang.String):void");
    }

    public final void onReceivedError(WebView webView, int i10, String str, String str2) {
        this.zzo = true;
    }

    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return this.zzc.zzay(renderProcessGoneDetail.didCrash(), renderProcessGoneDetail.rendererPriorityAtExit());
    }

    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return zzc(str, Collections.emptyMap());
    }

    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 79 || keyCode == 222) {
            return true;
        }
        switch (keyCode) {
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
                return true;
            default:
                switch (keyCode) {
                    case 126:
                    case 127:
                    case 128:
                    case 129:
                    case 130:
                        return true;
                    default:
                        return false;
                }
        }
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        n1.a("AdWebView shouldOverrideUrlLoading: ".concat(String.valueOf(str)));
        Uri parse = Uri.parse(str);
        if (!"gmsg".equalsIgnoreCase(parse.getScheme()) || !"mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            if (this.zzn && webView == this.zzc.zzG()) {
                String scheme = parse.getScheme();
                if ("http".equalsIgnoreCase(scheme) || HttpRequest.DEFAULT_SCHEME.equalsIgnoreCase(scheme)) {
                    a aVar = this.zzg;
                    if (aVar != null) {
                        aVar.onAdClicked();
                        zzbwb zzbwb = this.zza;
                        if (zzbwb != null) {
                            zzbwb.zzh(str);
                        }
                        this.zzg = null;
                    }
                    zzdcc zzdcc = this.zzm;
                    if (zzdcc != null) {
                        zzdcc.zzr();
                        this.zzm = null;
                    }
                    return super.shouldOverrideUrlLoading(webView, str);
                }
            }
            if (!this.zzc.zzG().willNotDraw()) {
                try {
                    zzapw zzI = this.zzc.zzI();
                    if (zzI != null && zzI.zzf(parse)) {
                        Context context = this.zzc.getContext();
                        zzcei zzcei = this.zzc;
                        parse = zzI.zza(parse, context, (View) zzcei, zzcei.zzi());
                    }
                } catch (zzapx unused) {
                    zzbza.zzj("Unable to append parameter to URL: ".concat(String.valueOf(str)));
                }
                b bVar = this.zzu;
                if (bVar == null || bVar.c()) {
                    zzt(new i("android.intent.action.VIEW", parse.toString(), (String) null, (String) null, (String) null, (String) null, (String) null, (c0) null), true);
                } else {
                    this.zzu.b(str);
                }
            } else {
                zzbza.zzj("AdWebView unable to handle URL: ".concat(String.valueOf(str)));
            }
        } else {
            zzj(parse);
        }
        return true;
    }

    public final void zzA(zzcft zzcft) {
        this.zzi = zzcft;
    }

    public final void zzB(int i10, int i11) {
        zzbpz zzbpz = this.zzv;
        if (zzbpz != null) {
            zzbpz.zzd(i10, i11);
        }
    }

    public final void zzC(boolean z10) {
        this.zzn = false;
    }

    public final void zzD(boolean z10) {
        synchronized (this.zzf) {
            this.zzr = z10;
        }
    }

    public final void zzE() {
        synchronized (this.zzf) {
            this.zzn = false;
            this.zzp = true;
            zzbzn.zze.execute(new zzcek(this));
        }
    }

    public final void zzF(boolean z10) {
        synchronized (this.zzf) {
            this.zzq = true;
        }
    }

    public final void zzG(zzcfu zzcfu) {
        this.zzj = zzcfu;
    }

    public final void zzH(String str, zzbhp zzbhp) {
        synchronized (this.zzf) {
            List list = (List) this.zze.get(str);
            if (list != null) {
                list.remove(zzbhp);
            }
        }
    }

    public final void zzI(String str, n nVar) {
        synchronized (this.zzf) {
            List<zzbhp> list = (List) this.zze.get(str);
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (zzbhp zzbhp : list) {
                    if (nVar.apply(zzbhp)) {
                        arrayList.add(zzbhp);
                    }
                }
                list.removeAll(arrayList);
            }
        }
    }

    public final boolean zzJ() {
        boolean z10;
        synchronized (this.zzf) {
            z10 = this.zzr;
        }
        return z10;
    }

    public final boolean zzK() {
        boolean z10;
        synchronized (this.zzf) {
            z10 = this.zzp;
        }
        return z10;
    }

    public final boolean zzL() {
        boolean z10;
        synchronized (this.zzf) {
            z10 = this.zzq;
        }
        return z10;
    }

    public final void zzM(a aVar, zzbgi zzbgi, t tVar, zzbgk zzbgk, e0 e0Var, boolean z10, zzbhr zzbhr, b bVar, zzbqg zzbqg, zzbwb zzbwb, zzeaf zzeaf, zzfff zzfff, zzdpi zzdpi, zzfdk zzfdk, zzbih zzbih, zzdcc zzdcc, zzbig zzbig, zzbia zzbia) {
        zzbgi zzbgi2 = zzbgi;
        zzbgk zzbgk2 = zzbgk;
        zzbhr zzbhr2 = zzbhr;
        zzbqg zzbqg2 = zzbqg;
        zzbwb zzbwb2 = zzbwb;
        zzeaf zzeaf2 = zzeaf;
        zzfff zzfff2 = zzfff;
        zzbih zzbih2 = zzbih;
        zzdcc zzdcc2 = zzdcc;
        zzbig zzbig2 = zzbig;
        zzbia zzbia2 = zzbia;
        b bVar2 = bVar == null ? new b(this.zzc.getContext(), zzbwb2, (zzbst) null) : bVar;
        this.zzv = new zzbpz(this.zzc, zzbqg2);
        this.zza = zzbwb2;
        if (((Boolean) a0.c().zzb(zzbar.zzaL)).booleanValue()) {
            zzz("/adMetadata", new zzbgh(zzbgi2));
        }
        if (zzbgk2 != null) {
            zzz("/appEvent", new zzbgj(zzbgk2));
        }
        zzz("/backButton", zzbho.zzj);
        zzz("/refresh", zzbho.zzk);
        zzz("/canOpenApp", zzbho.zzb);
        zzz("/canOpenURLs", zzbho.zza);
        zzz("/canOpenIntents", zzbho.zzc);
        zzz("/close", zzbho.zzd);
        zzz("/customClose", zzbho.zze);
        zzz("/instrument", zzbho.zzn);
        zzz("/delayPageLoaded", zzbho.zzp);
        zzz("/delayPageClosed", zzbho.zzq);
        zzz("/getLocationInfo", zzbho.zzr);
        zzz("/log", zzbho.zzg);
        zzz("/mraid", new zzbhv(bVar2, this.zzv, zzbqg2));
        zzbqe zzbqe = this.zzt;
        if (zzbqe != null) {
            zzz("/mraidLoaded", zzbqe);
        }
        zzbhz zzbhz = r4;
        b bVar3 = bVar2;
        zzbhz zzbhz2 = new zzbhz(bVar2, this.zzv, zzeaf, zzdpi, zzfdk);
        zzz("/open", zzbhz);
        zzz("/precache", new zzccv());
        zzz("/touch", zzbho.zzi);
        zzz("/video", zzbho.zzl);
        zzz("/videoMeta", zzbho.zzm);
        if (zzeaf2 == null || zzfff2 == null) {
            zzz("/click", zzbho.zza(zzdcc));
            zzz("/httpTrack", zzbho.zzf);
        } else {
            zzz("/click", new zzeze(zzdcc2, zzfff2, zzeaf2));
            zzz("/httpTrack", new zzezd(zzfff2, zzeaf2));
        }
        if (com.google.android.gms.ads.internal.t.p().zzu(this.zzc.getContext())) {
            zzz("/logScionEvent", new zzbhu(this.zzc.getContext()));
        }
        if (zzbhr2 != null) {
            zzz("/setInterstitialProperties", new zzbhq(zzbhr2, (byte[]) null));
        }
        if (zzbih2 != null) {
            if (((Boolean) a0.c().zzb(zzbar.zzif)).booleanValue()) {
                zzz("/inspectorNetworkExtras", zzbih2);
            }
        }
        if (((Boolean) a0.c().zzb(zzbar.zziy)).booleanValue() && zzbig2 != null) {
            zzz("/shareSheet", zzbig2);
        }
        if (((Boolean) a0.c().zzb(zzbar.zziB)).booleanValue() && zzbia2 != null) {
            zzz("/inspectorOutOfContextTest", zzbia2);
        }
        if (((Boolean) a0.c().zzb(zzbar.zzjE)).booleanValue()) {
            zzz("/bindPlayStoreOverlay", zzbho.zzu);
            zzz("/presentPlayStoreOverlay", zzbho.zzv);
            zzz("/expandPlayStoreOverlay", zzbho.zzw);
            zzz("/collapsePlayStoreOverlay", zzbho.zzx);
            zzz("/closePlayStoreOverlay", zzbho.zzy);
            if (((Boolean) a0.c().zzb(zzbar.zzcL)).booleanValue()) {
                zzz("/setPAIDPersonalizationEnabled", zzbho.zzA);
                zzz("/resetPAID", zzbho.zzz);
            }
        }
        this.zzg = aVar;
        this.zzh = tVar;
        this.zzk = zzbgi;
        this.zzl = zzbgk;
        this.zzs = e0Var;
        this.zzu = bVar3;
        this.zzm = zzdcc2;
        this.zzn = z10;
        this.zzw = zzfff2;
    }

    public final ViewTreeObserver.OnGlobalLayoutListener zza() {
        synchronized (this.zzf) {
        }
        return null;
    }

    public final ViewTreeObserver.OnScrollChangedListener zzb() {
        synchronized (this.zzf) {
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final WebResourceResponse zzc(String str, Map map) {
        zzavn zzb2;
        try {
            if (((Boolean) zzbcm.zza.zze()).booleanValue()) {
                if (this.zzw != null && "oda".equals(Uri.parse(str).getScheme())) {
                    this.zzw.zzc(str, (zzfen) null);
                    return new WebResourceResponse(MaxReward.DEFAULT_LABEL, MaxReward.DEFAULT_LABEL, new ByteArrayInputStream(new byte[0]));
                }
            }
            String zzc2 = zzbxh.zzc(str, this.zzc.getContext(), this.zzA);
            if (!zzc2.equals(str)) {
                return zzO(zzc2, map);
            }
            zzavq zza2 = zzavq.zza(Uri.parse(str));
            if (zza2 != null && (zzb2 = com.google.android.gms.ads.internal.t.e().zzb(zza2)) != null && zzb2.zze()) {
                return new WebResourceResponse(MaxReward.DEFAULT_LABEL, MaxReward.DEFAULT_LABEL, zzb2.zzc());
            }
            if (!zzbyz.zzl() || !((Boolean) zzbcg.zzb.zze()).booleanValue()) {
                return null;
            }
            return zzO(str, map);
        } catch (Exception | NoClassDefFoundError e10) {
            com.google.android.gms.ads.internal.t.q().zzu(e10, "AdWebViewClient.interceptRequest");
            return zzN();
        }
    }

    public final b zzd() {
        return this.zzu;
    }

    public final void zzg() {
        if (this.zzi != null && ((this.zzx && this.zzz <= 0) || this.zzy || this.zzo)) {
            if (((Boolean) a0.c().zzb(zzbar.zzbG)).booleanValue() && this.zzc.zzm() != null) {
                zzbbb.zza(this.zzc.zzm().zza(), this.zzc.zzk(), "awfllc");
            }
            zzcft zzcft = this.zzi;
            boolean z10 = false;
            if (!this.zzy && !this.zzo) {
                z10 = true;
            }
            zzcft.zza(z10);
            this.zzi = null;
        }
        this.zzc.zzac();
    }

    public final void zzh() {
        zzbwb zzbwb = this.zza;
        if (zzbwb != null) {
            zzbwb.zze();
            this.zza = null;
        }
        zzQ();
        synchronized (this.zzf) {
            this.zze.clear();
            this.zzg = null;
            this.zzh = null;
            this.zzi = null;
            this.zzj = null;
            this.zzk = null;
            this.zzl = null;
            this.zzn = false;
            this.zzp = false;
            this.zzq = false;
            this.zzs = null;
            this.zzu = null;
            this.zzt = null;
            zzbpz zzbpz = this.zzv;
            if (zzbpz != null) {
                zzbpz.zza(true);
                this.zzv = null;
            }
            this.zzw = null;
        }
    }

    public final void zzi(boolean z10) {
        this.zzA = z10;
    }

    public final void zzj(Uri uri) {
        String path = uri.getPath();
        List list = (List) this.zze.get(path);
        if (path == null || list == null) {
            n1.a("No GMSG handler found for GMSG: ".concat(String.valueOf(uri)));
            if (((Boolean) a0.c().zzb(zzbar.zzgo)).booleanValue() && com.google.android.gms.ads.internal.t.q().zzf() != null) {
                zzbzn.zza.execute(new zzcej((path == null || path.length() < 2) ? "null" : path.substring(1)));
                return;
            }
            return;
        }
        String encodedQuery = uri.getEncodedQuery();
        if (((Boolean) a0.c().zzb(zzbar.zzfg)).booleanValue() && this.zzB.contains(path) && encodedQuery != null) {
            if (encodedQuery.length() >= ((Integer) a0.c().zzb(zzbar.zzfi)).intValue()) {
                n1.a("Parsing gmsg query params on BG thread: ".concat(path));
                zzfuj.zzq(com.google.android.gms.ads.internal.t.r().A(uri), new zzcen(this, list, path, uri), zzbzn.zze);
                return;
            }
        }
        com.google.android.gms.ads.internal.t.r();
        zzP(b2.l(uri), list, path);
    }

    public final void zzk() {
        zzawe zzawe = this.zzd;
        if (zzawe != null) {
            zzawe.zzc(10005);
        }
        this.zzy = true;
        zzg();
        this.zzc.destroy();
    }

    public final void zzl() {
        synchronized (this.zzf) {
        }
        this.zzz++;
        zzg();
    }

    public final void zzm() {
        this.zzz--;
        zzg();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzn() {
        this.zzc.zzaa();
        r zzL = this.zzc.zzL();
        if (zzL != null) {
            zzL.zzx();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzo(View view, zzbwb zzbwb, int i10) {
        zzR(view, zzbwb, i10 - 1);
    }

    public final void zzp(int i10, int i11, boolean z10) {
        zzbqe zzbqe = this.zzt;
        if (zzbqe != null) {
            zzbqe.zzb(i10, i11);
        }
        zzbpz zzbpz = this.zzv;
        if (zzbpz != null) {
            zzbpz.zzc(i10, i11, false);
        }
    }

    public final void zzq() {
        zzbwb zzbwb = this.zza;
        if (zzbwb != null) {
            WebView zzG = this.zzc.zzG();
            if (androidx.core.view.a0.Q(zzG)) {
                zzR(zzG, zzbwb, 10);
                return;
            }
            zzQ();
            zzcem zzcem = new zzcem(this, zzbwb);
            this.zzC = zzcem;
            ((View) this.zzc).addOnAttachStateChangeListener(zzcem);
        }
    }

    public final void zzr() {
        zzdcc zzdcc = this.zzm;
        if (zzdcc != null) {
            zzdcc.zzr();
        }
    }

    public final void zzs() {
        zzdcc zzdcc = this.zzm;
        if (zzdcc != null) {
            zzdcc.zzs();
        }
    }

    public final void zzt(i iVar, boolean z10) {
        zzdcc zzdcc;
        boolean zzaA = this.zzc.zzaA();
        boolean zzS = zzS(zzaA, this.zzc);
        boolean z11 = true;
        if (!zzS && z10) {
            z11 = false;
        }
        a aVar = zzS ? null : this.zzg;
        t tVar = zzaA ? null : this.zzh;
        e0 e0Var = this.zzs;
        zzbzg zzn2 = this.zzc.zzn();
        zzcei zzcei = this.zzc;
        if (z11) {
            zzdcc = null;
        } else {
            zzdcc = this.zzm;
        }
        zzw(new AdOverlayInfoParcel(iVar, aVar, tVar, e0Var, zzn2, zzcei, zzdcc));
    }

    public final void zzu(t0 t0Var, zzeaf zzeaf, zzdpi zzdpi, zzfdk zzfdk, String str, String str2, int i10) {
        zzcei zzcei = this.zzc;
        zzw(new AdOverlayInfoParcel(zzcei, zzcei.zzn(), t0Var, zzeaf, zzdpi, zzfdk, str, str2, 14));
    }

    public final void zzv(boolean z10, int i10, boolean z11) {
        zzdcc zzdcc;
        boolean zzS = zzS(this.zzc.zzaA(), this.zzc);
        boolean z12 = true;
        if (!zzS && z11) {
            z12 = false;
        }
        a aVar = zzS ? null : this.zzg;
        t tVar = this.zzh;
        e0 e0Var = this.zzs;
        zzcei zzcei = this.zzc;
        zzbzg zzn2 = zzcei.zzn();
        if (z12) {
            zzdcc = null;
        } else {
            zzdcc = this.zzm;
        }
        zzw(new AdOverlayInfoParcel(aVar, tVar, e0Var, zzcei, z10, i10, zzn2, zzdcc));
    }

    public final void zzw(AdOverlayInfoParcel adOverlayInfoParcel) {
        i iVar;
        zzbpz zzbpz = this.zzv;
        boolean zze2 = zzbpz != null ? zzbpz.zze() : false;
        com.google.android.gms.ads.internal.t.k();
        s.a(this.zzc.getContext(), adOverlayInfoParcel, !zze2);
        zzbwb zzbwb = this.zza;
        if (zzbwb != null) {
            String str = adOverlayInfoParcel.f14708m;
            if (str == null && (iVar = adOverlayInfoParcel.f14697a) != null) {
                str = iVar.f22690b;
            }
            zzbwb.zzh(str);
        }
    }

    public final void zzx(boolean z10, int i10, String str, boolean z11) {
        a aVar;
        zzceo zzceo;
        zzdcc zzdcc;
        boolean zzaA = this.zzc.zzaA();
        boolean zzS = zzS(zzaA, this.zzc);
        boolean z12 = true;
        if (!zzS && z11) {
            z12 = false;
        }
        if (zzS) {
            aVar = null;
        } else {
            aVar = this.zzg;
        }
        if (zzaA) {
            zzceo = null;
        } else {
            zzceo = new zzceo(this.zzc, this.zzh);
        }
        zzbgi zzbgi = this.zzk;
        zzbgk zzbgk = this.zzl;
        e0 e0Var = this.zzs;
        zzcei zzcei = this.zzc;
        zzbzg zzn2 = zzcei.zzn();
        if (z12) {
            zzdcc = null;
        } else {
            zzdcc = this.zzm;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = r4;
        AdOverlayInfoParcel adOverlayInfoParcel2 = new AdOverlayInfoParcel(aVar, zzceo, zzbgi, zzbgk, e0Var, zzcei, z10, i10, str, zzn2, zzdcc);
        zzw(adOverlayInfoParcel);
    }

    public final void zzy(boolean z10, int i10, String str, String str2, boolean z11) {
        a aVar;
        zzceo zzceo;
        zzdcc zzdcc;
        boolean zzaA = this.zzc.zzaA();
        boolean zzS = zzS(zzaA, this.zzc);
        boolean z12 = true;
        if (!zzS && z11) {
            z12 = false;
        }
        if (zzS) {
            aVar = null;
        } else {
            aVar = this.zzg;
        }
        if (zzaA) {
            zzceo = null;
        } else {
            zzceo = new zzceo(this.zzc, this.zzh);
        }
        zzbgi zzbgi = this.zzk;
        zzbgk zzbgk = this.zzl;
        e0 e0Var = this.zzs;
        zzcei zzcei = this.zzc;
        zzbzg zzn2 = zzcei.zzn();
        if (z12) {
            zzdcc = null;
        } else {
            zzdcc = this.zzm;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = r4;
        AdOverlayInfoParcel adOverlayInfoParcel2 = new AdOverlayInfoParcel(aVar, (t) zzceo, zzbgi, zzbgk, e0Var, zzcei, z10, i10, str, str2, zzn2, zzdcc);
        zzw(adOverlayInfoParcel);
    }

    public final void zzz(String str, zzbhp zzbhp) {
        synchronized (this.zzf) {
            List list = (List) this.zze.get(str);
            if (list == null) {
                list = new CopyOnWriteArrayList();
                this.zze.put(str, list);
            }
            list.add(zzbhp);
        }
    }
}
