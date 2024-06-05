package t4;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.internal.b;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.l;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.b2;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.internal.ads.zzapw;
import com.google.android.gms.internal.ads.zzawe;
import com.google.android.gms.internal.ads.zzbar;
import com.google.android.gms.internal.ads.zzbbj;
import com.google.android.gms.internal.ads.zzbbt;
import com.google.android.gms.internal.ads.zzbgi;
import com.google.android.gms.internal.ads.zzbgk;
import com.google.android.gms.internal.ads.zzbhr;
import com.google.android.gms.internal.ads.zzbia;
import com.google.android.gms.internal.ads.zzbig;
import com.google.android.gms.internal.ads.zzbih;
import com.google.android.gms.internal.ads.zzbqg;
import com.google.android.gms.internal.ads.zzbrb;
import com.google.android.gms.internal.ads.zzbwb;
import com.google.android.gms.internal.ads.zzbza;
import com.google.android.gms.internal.ads.zzbzg;
import com.google.android.gms.internal.ads.zzcei;
import com.google.android.gms.internal.ads.zzceu;
import com.google.android.gms.internal.ads.zzcfv;
import com.google.android.gms.internal.ads.zzcfx;
import com.google.android.gms.internal.ads.zzdcc;
import com.google.android.gms.internal.ads.zzdpi;
import com.google.android.gms.internal.ads.zzeaf;
import com.google.android.gms.internal.ads.zzean;
import com.google.android.gms.internal.ads.zzeyc;
import com.google.android.gms.internal.ads.zzeyf;
import com.google.android.gms.internal.ads.zzfdk;
import com.google.android.gms.internal.ads.zzfff;
import com.google.android.gms.internal.ads.zzfkr;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public class r extends zzbrb implements e {

    /* renamed from: v  reason: collision with root package name */
    static final int f22710v = Color.argb(0, 0, 0, 0);

    /* renamed from: a  reason: collision with root package name */
    protected final Activity f22711a;

    /* renamed from: b  reason: collision with root package name */
    AdOverlayInfoParcel f22712b;

    /* renamed from: c  reason: collision with root package name */
    zzcei f22713c;

    /* renamed from: d  reason: collision with root package name */
    n f22714d;

    /* renamed from: f  reason: collision with root package name */
    w f22715f;

    /* renamed from: g  reason: collision with root package name */
    boolean f22716g = false;

    /* renamed from: h  reason: collision with root package name */
    FrameLayout f22717h;

    /* renamed from: i  reason: collision with root package name */
    WebChromeClient.CustomViewCallback f22718i;

    /* renamed from: j  reason: collision with root package name */
    boolean f22719j = false;

    /* renamed from: k  reason: collision with root package name */
    boolean f22720k = false;

    /* renamed from: l  reason: collision with root package name */
    m f22721l;

    /* renamed from: m  reason: collision with root package name */
    boolean f22722m = false;

    /* renamed from: n  reason: collision with root package name */
    private final Object f22723n = new Object();

    /* renamed from: o  reason: collision with root package name */
    private Runnable f22724o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f22725p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f22726q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f22727r = false;

    /* renamed from: s  reason: collision with root package name */
    private boolean f22728s = false;

    /* renamed from: t  reason: collision with root package name */
    private boolean f22729t = true;

    /* renamed from: u  reason: collision with root package name */
    int f22730u = 1;

    public r(Activity activity) {
        this.f22711a = activity;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r0.f14711p;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void C1(android.content.res.Configuration r6) {
        /*
            r5 = this;
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r5.f22712b
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0010
            com.google.android.gms.ads.internal.j r0 = r0.f14711p
            if (r0 == 0) goto L_0x0010
            boolean r0 = r0.f14684b
            if (r0 == 0) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            com.google.android.gms.ads.internal.util.b r3 = com.google.android.gms.ads.internal.t.s()
            android.app.Activity r4 = r5.f22711a
            boolean r6 = r3.e(r4, r6)
            boolean r3 = r5.f22720k
            if (r3 == 0) goto L_0x0021
            if (r0 == 0) goto L_0x0031
        L_0x0021:
            if (r6 != 0) goto L_0x0031
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r6 = r5.f22712b
            if (r6 == 0) goto L_0x0032
            com.google.android.gms.ads.internal.j r6 = r6.f14711p
            if (r6 == 0) goto L_0x0032
            boolean r6 = r6.f14689h
            if (r6 == 0) goto L_0x0032
            r2 = 1
            goto L_0x0032
        L_0x0031:
            r1 = 0
        L_0x0032:
            android.app.Activity r6 = r5.f22711a
            android.view.Window r6 = r6.getWindow()
            com.google.android.gms.internal.ads.zzbaj r0 = com.google.android.gms.internal.ads.zzbar.zzaY
            com.google.android.gms.internal.ads.zzbap r3 = com.google.android.gms.ads.internal.client.a0.c()
            java.lang.Object r0 = r3.zzb(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x005e
            android.view.View r6 = r6.getDecorView()
            if (r1 == 0) goto L_0x0058
            if (r2 == 0) goto L_0x0055
            r0 = 5894(0x1706, float:8.259E-42)
            goto L_0x005a
        L_0x0055:
            r0 = 5380(0x1504, float:7.539E-42)
            goto L_0x005a
        L_0x0058:
            r0 = 256(0x100, float:3.59E-43)
        L_0x005a:
            r6.setSystemUiVisibility(r0)
            return
        L_0x005e:
            r0 = 1024(0x400, float:1.435E-42)
            r3 = 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x0076
            r6.addFlags(r0)
            r6.clearFlags(r3)
            if (r2 == 0) goto L_0x0075
            android.view.View r6 = r6.getDecorView()
            r0 = 4098(0x1002, float:5.743E-42)
            r6.setSystemUiVisibility(r0)
        L_0x0075:
            return
        L_0x0076:
            r6.addFlags(r3)
            r6.clearFlags(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t4.r.C1(android.content.res.Configuration):void");
    }

    private static final void D1(a aVar, View view) {
        if (aVar != null && view != null) {
            t.a().zzc(aVar, view);
        }
    }

    /* access modifiers changed from: protected */
    public final void A1(boolean z10) throws l {
        if (!this.f22726q) {
            this.f22711a.requestWindowFeature(1);
        }
        Window window = this.f22711a.getWindow();
        if (window != null) {
            zzcei zzcei = this.f22712b.f14700d;
            b bVar = null;
            zzcfv zzN = zzcei != null ? zzcei.zzN() : null;
            boolean z11 = false;
            boolean z12 = zzN != null && zzN.zzK();
            this.f22722m = false;
            if (z12) {
                int i10 = this.f22712b.f14706k;
                if (i10 == 6) {
                    if (this.f22711a.getResources().getConfiguration().orientation == 1) {
                        z11 = true;
                    }
                    this.f22722m = z11;
                } else if (i10 == 7) {
                    if (this.f22711a.getResources().getConfiguration().orientation == 2) {
                        z11 = true;
                    }
                    this.f22722m = z11;
                }
            }
            zzbza.zze("Delay onShow to next orientation change: " + z11);
            G1(this.f22712b.f14706k);
            window.setFlags(16777216, 16777216);
            zzbza.zze("Hardware acceleration on the AdActivity window enabled.");
            if (!this.f22720k) {
                this.f22721l.setBackgroundColor(-16777216);
            } else {
                this.f22721l.setBackgroundColor(f22710v);
            }
            this.f22711a.setContentView(this.f22721l);
            this.f22726q = true;
            if (z10) {
                try {
                    t.B();
                    Activity activity = this.f22711a;
                    zzcei zzcei2 = this.f22712b.f14700d;
                    zzcfx zzO = zzcei2 != null ? zzcei2.zzO() : null;
                    zzcei zzcei3 = this.f22712b.f14700d;
                    String zzS = zzcei3 != null ? zzcei3.zzS() : null;
                    AdOverlayInfoParcel adOverlayInfoParcel = this.f22712b;
                    zzbzg zzbzg = adOverlayInfoParcel.f14709n;
                    zzcei zzcei4 = adOverlayInfoParcel.f14700d;
                    zzcei zza = zzceu.zza(activity, zzO, zzS, true, z12, (zzapw) null, (zzbbt) null, zzbzg, (zzbbj) null, (l) null, zzcei4 != null ? zzcei4.zzj() : null, zzawe.zza(), (zzeyc) null, (zzeyf) null);
                    this.f22713c = zza;
                    zzcfv zzN2 = zza.zzN();
                    AdOverlayInfoParcel adOverlayInfoParcel2 = this.f22712b;
                    zzbgi zzbgi = adOverlayInfoParcel2.f14712q;
                    zzbgk zzbgk = adOverlayInfoParcel2.f14701f;
                    e0 e0Var = adOverlayInfoParcel2.f14705j;
                    zzcei zzcei5 = adOverlayInfoParcel2.f14700d;
                    if (zzcei5 != null) {
                        bVar = zzcei5.zzN().zzd();
                    }
                    zzN2.zzM((com.google.android.gms.ads.internal.client.a) null, zzbgi, (t) null, zzbgk, e0Var, true, (zzbhr) null, bVar, (zzbqg) null, (zzbwb) null, (zzeaf) null, (zzfff) null, (zzdpi) null, (zzfdk) null, (zzbih) null, (zzdcc) null, (zzbig) null, (zzbia) null);
                    this.f22713c.zzN().zzA(new j(this));
                    AdOverlayInfoParcel adOverlayInfoParcel3 = this.f22712b;
                    String str = adOverlayInfoParcel3.f14708m;
                    if (str != null) {
                        this.f22713c.loadUrl(str);
                    } else {
                        String str2 = adOverlayInfoParcel3.f14704i;
                        if (str2 != null) {
                            this.f22713c.loadDataWithBaseURL(adOverlayInfoParcel3.f14702g, str2, "text/html", "UTF-8", (String) null);
                        } else {
                            throw new l("No URL or HTML to display in ad overlay.");
                        }
                    }
                    zzcei zzcei6 = this.f22712b.f14700d;
                    if (zzcei6 != null) {
                        zzcei6.zzar(this);
                    }
                } catch (Exception e10) {
                    zzbza.zzh("Error obtaining webview.", e10);
                    throw new l("Could not obtain webview for the overlay.", e10);
                }
            } else {
                zzcei zzcei7 = this.f22712b.f14700d;
                this.f22713c = zzcei7;
                zzcei7.zzak(this.f22711a);
            }
            this.f22713c.zzaf(this);
            zzcei zzcei8 = this.f22712b.f14700d;
            if (zzcei8 != null) {
                D1(zzcei8.zzQ(), this.f22721l);
            }
            if (this.f22712b.f14707l != 5) {
                ViewParent parent = this.f22713c.getParent();
                if (parent != null && (parent instanceof ViewGroup)) {
                    ((ViewGroup) parent).removeView(this.f22713c.zzF());
                }
                if (this.f22720k) {
                    this.f22713c.zzaj();
                }
                this.f22721l.addView(this.f22713c.zzF(), -1, -1);
            }
            if (!z10 && !this.f22722m) {
                zze();
            }
            AdOverlayInfoParcel adOverlayInfoParcel4 = this.f22712b;
            if (adOverlayInfoParcel4.f14707l != 5) {
                E1(z12);
                if (this.f22713c.zzaw()) {
                    F1(z12, true);
                    return;
                }
                return;
            }
            zzean.zzh(this.f22711a, this, adOverlayInfoParcel4.f14717v, adOverlayInfoParcel4.f14714s, adOverlayInfoParcel4.f14715t, adOverlayInfoParcel4.f14716u, adOverlayInfoParcel4.f14713r, adOverlayInfoParcel4.f14718w);
            return;
        }
        throw new l("Invalid activity, no window available.");
    }

    /* access modifiers changed from: protected */
    public final void B1() {
        AdOverlayInfoParcel adOverlayInfoParcel;
        t tVar;
        if (this.f22711a.isFinishing() && !this.f22727r) {
            this.f22727r = true;
            zzcei zzcei = this.f22713c;
            if (zzcei != null) {
                zzcei.zzW(this.f22730u - 1);
                synchronized (this.f22723n) {
                    if (!this.f22725p && this.f22713c.zzax()) {
                        if (((Boolean) a0.c().zzb(zzbar.zzer)).booleanValue() && !this.f22728s && (adOverlayInfoParcel = this.f22712b) != null && (tVar = adOverlayInfoParcel.f14699c) != null) {
                            tVar.zzby();
                        }
                        k kVar = new k(this);
                        this.f22724o = kVar;
                        b2.f14773i.postDelayed(kVar, ((Long) a0.c().zzb(zzbar.zzaR)).longValue());
                        return;
                    }
                }
            }
            zzc();
        }
    }

    public final void E1(boolean z10) {
        int intValue = ((Integer) a0.c().zzb(zzbar.zzev)).intValue();
        int i10 = 0;
        boolean z11 = ((Boolean) a0.c().zzb(zzbar.zzaU)).booleanValue() || z10;
        v vVar = new v();
        vVar.f22735d = 50;
        vVar.f22732a = true != z11 ? 0 : intValue;
        if (true != z11) {
            i10 = intValue;
        }
        vVar.f22733b = i10;
        vVar.f22734c = intValue;
        this.f22715f = new w(this.f22711a, vVar, this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(true != z11 ? 9 : 11);
        F1(z10, this.f22712b.f14703h);
        this.f22721l.addView(this.f22715f, layoutParams);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0018, code lost:
        r0 = (r0 = r6.f22712b).f14711p;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void F1(boolean r7, boolean r8) {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.zzbaj r0 = com.google.android.gms.internal.ads.zzbar.zzaS
            com.google.android.gms.internal.ads.zzbap r1 = com.google.android.gms.ads.internal.client.a0.c()
            java.lang.Object r0 = r1.zzb(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0022
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r6.f22712b
            if (r0 == 0) goto L_0x0022
            com.google.android.gms.ads.internal.j r0 = r0.f14711p
            if (r0 == 0) goto L_0x0022
            boolean r0 = r0.f14690i
            if (r0 == 0) goto L_0x0022
            r0 = 1
            goto L_0x0023
        L_0x0022:
            r0 = 0
        L_0x0023:
            com.google.android.gms.internal.ads.zzbaj r3 = com.google.android.gms.internal.ads.zzbar.zzaT
            com.google.android.gms.internal.ads.zzbap r4 = com.google.android.gms.ads.internal.client.a0.c()
            java.lang.Object r3 = r4.zzb(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x0043
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r3 = r6.f22712b
            if (r3 == 0) goto L_0x0043
            com.google.android.gms.ads.internal.j r3 = r3.f14711p
            if (r3 == 0) goto L_0x0043
            boolean r3 = r3.f14691j
            if (r3 == 0) goto L_0x0043
            r3 = 1
            goto L_0x0044
        L_0x0043:
            r3 = 0
        L_0x0044:
            if (r7 == 0) goto L_0x005a
            if (r8 == 0) goto L_0x005a
            if (r0 == 0) goto L_0x005a
            if (r3 != 0) goto L_0x005a
            com.google.android.gms.internal.ads.zzbqf r7 = new com.google.android.gms.internal.ads.zzbqf
            com.google.android.gms.internal.ads.zzcei r4 = r6.f22713c
            java.lang.String r5 = "useCustomClose"
            r7.<init>(r4, r5)
            java.lang.String r4 = "Custom close has been disabled for interstitial ads in this ad slot."
            r7.zzg(r4)
        L_0x005a:
            t4.w r7 = r6.f22715f
            if (r7 == 0) goto L_0x0069
            if (r3 != 0) goto L_0x0066
            if (r8 == 0) goto L_0x0065
            if (r0 != 0) goto L_0x0065
            goto L_0x0066
        L_0x0065:
            r1 = 0
        L_0x0066:
            r7.b(r1)
        L_0x0069:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t4.r.F1(boolean, boolean):void");
    }

    public final void G1(int i10) {
        if (this.f22711a.getApplicationInfo().targetSdkVersion >= ((Integer) a0.c().zzb(zzbar.zzfA)).intValue()) {
            if (this.f22711a.getApplicationInfo().targetSdkVersion <= ((Integer) a0.c().zzb(zzbar.zzfB)).intValue()) {
                int i11 = Build.VERSION.SDK_INT;
                if (i11 >= ((Integer) a0.c().zzb(zzbar.zzfC)).intValue()) {
                    if (i11 <= ((Integer) a0.c().zzb(zzbar.zzfD)).intValue()) {
                        return;
                    }
                }
            }
        }
        try {
            this.f22711a.setRequestedOrientation(i10);
        } catch (Throwable th) {
            t.q().zzt(th, "AdOverlay.setRequestedOrientation");
        }
    }

    public final void H1(boolean z10) {
        if (z10) {
            this.f22721l.setBackgroundColor(0);
        } else {
            this.f22721l.setBackgroundColor(-16777216);
        }
    }

    public final void M0(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        FrameLayout frameLayout = new FrameLayout(this.f22711a);
        this.f22717h = frameLayout;
        frameLayout.setBackgroundColor(-16777216);
        this.f22717h.addView(view, -1, -1);
        this.f22711a.setContentView(this.f22717h);
        this.f22726q = true;
        this.f22718i = customViewCallback;
        this.f22716g = true;
    }

    public final void zzC() {
        synchronized (this.f22723n) {
            this.f22725p = true;
            Runnable runnable = this.f22724o;
            if (runnable != null) {
                zzfkr zzfkr = b2.f14773i;
                zzfkr.removeCallbacks(runnable);
                zzfkr.post(this.f22724o);
            }
        }
    }

    public final boolean zzE() {
        this.f22730u = 1;
        if (this.f22713c == null) {
            return true;
        }
        if (!((Boolean) a0.c().zzb(zzbar.zzif)).booleanValue() || !this.f22713c.canGoBack()) {
            boolean zzaC = this.f22713c.zzaC();
            if (!zzaC) {
                this.f22713c.zzd("onbackblocked", Collections.emptyMap());
            }
            return zzaC;
        }
        this.f22713c.goBack();
        return false;
    }

    public final void zzb() {
        this.f22730u = 3;
        this.f22711a.finish();
        AdOverlayInfoParcel adOverlayInfoParcel = this.f22712b;
        if (adOverlayInfoParcel != null && adOverlayInfoParcel.f14707l == 5) {
            this.f22711a.overridePendingTransition(0, 0);
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzc() {
        zzcei zzcei;
        t tVar;
        if (!this.f22728s) {
            this.f22728s = true;
            zzcei zzcei2 = this.f22713c;
            if (zzcei2 != null) {
                this.f22721l.removeView(zzcei2.zzF());
                n nVar = this.f22714d;
                if (nVar != null) {
                    this.f22713c.zzak(nVar.f22706d);
                    this.f22713c.zzan(false);
                    ViewGroup viewGroup = this.f22714d.f22705c;
                    View zzF = this.f22713c.zzF();
                    n nVar2 = this.f22714d;
                    viewGroup.addView(zzF, nVar2.f22703a, nVar2.f22704b);
                    this.f22714d = null;
                } else if (this.f22711a.getApplicationContext() != null) {
                    this.f22713c.zzak(this.f22711a.getApplicationContext());
                }
                this.f22713c = null;
            }
            AdOverlayInfoParcel adOverlayInfoParcel = this.f22712b;
            if (!(adOverlayInfoParcel == null || (tVar = adOverlayInfoParcel.f14699c) == null)) {
                tVar.zzf(this.f22730u);
            }
            AdOverlayInfoParcel adOverlayInfoParcel2 = this.f22712b;
            if (adOverlayInfoParcel2 != null && (zzcei = adOverlayInfoParcel2.f14700d) != null) {
                D1(zzcei.zzQ(), this.f22712b.f14700d.zzF());
            }
        }
    }

    public final void zzd() {
        this.f22721l.f22702b = true;
    }

    /* access modifiers changed from: protected */
    public final void zze() {
        this.f22713c.zzX();
    }

    public final void zzf() {
        AdOverlayInfoParcel adOverlayInfoParcel = this.f22712b;
        if (adOverlayInfoParcel != null && this.f22716g) {
            G1(adOverlayInfoParcel.f14706k);
        }
        if (this.f22717h != null) {
            this.f22711a.setContentView(this.f22721l);
            this.f22726q = true;
            this.f22717h.removeAllViews();
            this.f22717h = null;
        }
        WebChromeClient.CustomViewCallback customViewCallback = this.f22718i;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
            this.f22718i = null;
        }
        this.f22716g = false;
    }

    public final void zzg(int i10, int i11, Intent intent) {
    }

    public final void zzh() {
        this.f22730u = 1;
    }

    public final void zzi() {
        this.f22730u = 2;
        this.f22711a.finish();
    }

    public final void zzj(a aVar) {
        C1((Configuration) com.google.android.gms.dynamic.b.A1(aVar));
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0071 A[Catch:{ l -> 0x00f5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00c4 A[Catch:{ l -> 0x00f5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00e9 A[Catch:{ l -> 0x00f5 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void zzk(android.os.Bundle r9) {
        /*
            r8 = this;
            android.app.Activity r0 = r8.f22711a
            r1 = 1
            r0.requestWindowFeature(r1)
            r0 = 0
            if (r9 == 0) goto L_0x0013
            java.lang.String r2 = "com.google.android.gms.ads.internal.overlay.hasResumed"
            boolean r2 = r9.getBoolean(r2, r0)
            if (r2 == 0) goto L_0x0013
            r2 = 1
            goto L_0x0014
        L_0x0013:
            r2 = 0
        L_0x0014:
            r8.f22719j = r2
            r2 = 4
            android.app.Activity r3 = r8.f22711a     // Catch:{ l -> 0x00f5 }
            android.content.Intent r3 = r3.getIntent()     // Catch:{ l -> 0x00f5 }
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r3 = com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel.b(r3)     // Catch:{ l -> 0x00f5 }
            r8.f22712b = r3     // Catch:{ l -> 0x00f5 }
            if (r3 == 0) goto L_0x00ed
            com.google.android.gms.internal.ads.zzbzg r3 = r3.f14709n     // Catch:{ l -> 0x00f5 }
            int r3 = r3.zzc     // Catch:{ l -> 0x00f5 }
            r4 = 7500000(0x7270e0, float:1.0509738E-38)
            if (r3 <= r4) goto L_0x0030
            r8.f22730u = r2     // Catch:{ l -> 0x00f5 }
        L_0x0030:
            android.app.Activity r3 = r8.f22711a     // Catch:{ l -> 0x00f5 }
            android.content.Intent r3 = r3.getIntent()     // Catch:{ l -> 0x00f5 }
            if (r3 == 0) goto L_0x0046
            android.app.Activity r3 = r8.f22711a     // Catch:{ l -> 0x00f5 }
            android.content.Intent r3 = r3.getIntent()     // Catch:{ l -> 0x00f5 }
            java.lang.String r4 = "shouldCallOnOverlayOpened"
            boolean r3 = r3.getBooleanExtra(r4, r1)     // Catch:{ l -> 0x00f5 }
            r8.f22729t = r3     // Catch:{ l -> 0x00f5 }
        L_0x0046:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r3 = r8.f22712b     // Catch:{ l -> 0x00f5 }
            com.google.android.gms.ads.internal.j r4 = r3.f14711p     // Catch:{ l -> 0x00f5 }
            r5 = 5
            if (r4 == 0) goto L_0x0054
            boolean r6 = r4.f14683a     // Catch:{ l -> 0x00f5 }
            r8.f22720k = r6     // Catch:{ l -> 0x00f5 }
            if (r6 == 0) goto L_0x006f
            goto L_0x005a
        L_0x0054:
            int r6 = r3.f14707l     // Catch:{ l -> 0x00f5 }
            if (r6 != r5) goto L_0x006d
            r8.f22720k = r1     // Catch:{ l -> 0x00f5 }
        L_0x005a:
            int r3 = r3.f14707l     // Catch:{ l -> 0x00f5 }
            if (r3 == r5) goto L_0x006f
            int r3 = r4.f14688g     // Catch:{ l -> 0x00f5 }
            r4 = -1
            if (r3 == r4) goto L_0x006f
            t4.q r3 = new t4.q     // Catch:{ l -> 0x00f5 }
            r4 = 0
            r3.<init>(r8, r4)     // Catch:{ l -> 0x00f5 }
            r3.zzb()     // Catch:{ l -> 0x00f5 }
            goto L_0x006f
        L_0x006d:
            r8.f22720k = r0     // Catch:{ l -> 0x00f5 }
        L_0x006f:
            if (r9 != 0) goto L_0x009d
            boolean r9 = r8.f22729t     // Catch:{ l -> 0x00f5 }
            if (r9 == 0) goto L_0x0087
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r9 = r8.f22712b     // Catch:{ l -> 0x00f5 }
            com.google.android.gms.internal.ads.zzcvb r9 = r9.f14720y     // Catch:{ l -> 0x00f5 }
            if (r9 == 0) goto L_0x007e
            r9.zze()     // Catch:{ l -> 0x00f5 }
        L_0x007e:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r9 = r8.f22712b     // Catch:{ l -> 0x00f5 }
            t4.t r9 = r9.f14699c     // Catch:{ l -> 0x00f5 }
            if (r9 == 0) goto L_0x0087
            r9.zzb()     // Catch:{ l -> 0x00f5 }
        L_0x0087:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r9 = r8.f22712b     // Catch:{ l -> 0x00f5 }
            int r3 = r9.f14707l     // Catch:{ l -> 0x00f5 }
            if (r3 == r1) goto L_0x009d
            com.google.android.gms.ads.internal.client.a r9 = r9.f14698b     // Catch:{ l -> 0x00f5 }
            if (r9 == 0) goto L_0x0094
            r9.onAdClicked()     // Catch:{ l -> 0x00f5 }
        L_0x0094:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r9 = r8.f22712b     // Catch:{ l -> 0x00f5 }
            com.google.android.gms.internal.ads.zzdcc r9 = r9.f14721z     // Catch:{ l -> 0x00f5 }
            if (r9 == 0) goto L_0x009d
            r9.zzr()     // Catch:{ l -> 0x00f5 }
        L_0x009d:
            t4.m r9 = new t4.m     // Catch:{ l -> 0x00f5 }
            android.app.Activity r3 = r8.f22711a     // Catch:{ l -> 0x00f5 }
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r4 = r8.f22712b     // Catch:{ l -> 0x00f5 }
            java.lang.String r6 = r4.f14710o     // Catch:{ l -> 0x00f5 }
            com.google.android.gms.internal.ads.zzbzg r7 = r4.f14709n     // Catch:{ l -> 0x00f5 }
            java.lang.String r7 = r7.zza     // Catch:{ l -> 0x00f5 }
            java.lang.String r4 = r4.f14719x     // Catch:{ l -> 0x00f5 }
            r9.<init>(r3, r6, r7, r4)     // Catch:{ l -> 0x00f5 }
            r8.f22721l = r9     // Catch:{ l -> 0x00f5 }
            r3 = 1000(0x3e8, float:1.401E-42)
            r9.setId(r3)     // Catch:{ l -> 0x00f5 }
            com.google.android.gms.ads.internal.util.b r9 = com.google.android.gms.ads.internal.t.s()     // Catch:{ l -> 0x00f5 }
            android.app.Activity r3 = r8.f22711a     // Catch:{ l -> 0x00f5 }
            r9.j(r3)     // Catch:{ l -> 0x00f5 }
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r9 = r8.f22712b     // Catch:{ l -> 0x00f5 }
            int r3 = r9.f14707l     // Catch:{ l -> 0x00f5 }
            if (r3 == r1) goto L_0x00e9
            r4 = 2
            if (r3 == r4) goto L_0x00dc
            r9 = 3
            if (r3 == r9) goto L_0x00d8
            if (r3 != r5) goto L_0x00d0
            r8.A1(r0)     // Catch:{ l -> 0x00f5 }
            return
        L_0x00d0:
            t4.l r9 = new t4.l     // Catch:{ l -> 0x00f5 }
            java.lang.String r0 = "Could not determine ad overlay type."
            r9.<init>(r0)     // Catch:{ l -> 0x00f5 }
            throw r9     // Catch:{ l -> 0x00f5 }
        L_0x00d8:
            r8.A1(r1)     // Catch:{ l -> 0x00f5 }
            return
        L_0x00dc:
            t4.n r1 = new t4.n     // Catch:{ l -> 0x00f5 }
            com.google.android.gms.internal.ads.zzcei r9 = r9.f14700d     // Catch:{ l -> 0x00f5 }
            r1.<init>(r9)     // Catch:{ l -> 0x00f5 }
            r8.f22714d = r1     // Catch:{ l -> 0x00f5 }
            r8.A1(r0)     // Catch:{ l -> 0x00f5 }
            return
        L_0x00e9:
            r8.A1(r0)     // Catch:{ l -> 0x00f5 }
            return
        L_0x00ed:
            t4.l r9 = new t4.l     // Catch:{ l -> 0x00f5 }
            java.lang.String r0 = "Could not get info for ad overlay."
            r9.<init>(r0)     // Catch:{ l -> 0x00f5 }
            throw r9     // Catch:{ l -> 0x00f5 }
        L_0x00f5:
            r9 = move-exception
            java.lang.String r9 = r9.getMessage()
            com.google.android.gms.internal.ads.zzbza.zzj(r9)
            r8.f22730u = r2
            android.app.Activity r9 = r8.f22711a
            r9.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t4.r.zzk(android.os.Bundle):void");
    }

    public final void zzl() {
        zzcei zzcei = this.f22713c;
        if (zzcei != null) {
            try {
                this.f22721l.removeView(zzcei.zzF());
            } catch (NullPointerException unused) {
            }
        }
        B1();
    }

    public final void zzm() {
        if (this.f22722m) {
            this.f22722m = false;
            zze();
        }
    }

    public final void zzn() {
        t tVar;
        zzf();
        AdOverlayInfoParcel adOverlayInfoParcel = this.f22712b;
        if (!(adOverlayInfoParcel == null || (tVar = adOverlayInfoParcel.f14699c) == null)) {
            tVar.zzbo();
        }
        if (!((Boolean) a0.c().zzb(zzbar.zzet)).booleanValue() && this.f22713c != null && (!this.f22711a.isFinishing() || this.f22714d == null)) {
            this.f22713c.onPause();
        }
        B1();
    }

    public final void zzo() {
    }

    public final void zzp() {
        t tVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f22712b;
        if (!(adOverlayInfoParcel == null || (tVar = adOverlayInfoParcel.f14699c) == null)) {
            tVar.zzbF();
        }
        C1(this.f22711a.getResources().getConfiguration());
        if (!((Boolean) a0.c().zzb(zzbar.zzet)).booleanValue()) {
            zzcei zzcei = this.f22713c;
            if (zzcei == null || zzcei.zzaz()) {
                zzbza.zzj("The webview does not exist. Ignoring action.");
            } else {
                this.f22713c.onResume();
            }
        }
    }

    public final void zzq(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.f22719j);
    }

    public final void zzr() {
        if (((Boolean) a0.c().zzb(zzbar.zzet)).booleanValue()) {
            zzcei zzcei = this.f22713c;
            if (zzcei == null || zzcei.zzaz()) {
                zzbza.zzj("The webview does not exist. Ignoring action.");
            } else {
                this.f22713c.onResume();
            }
        }
    }

    public final void zzs() {
        if (((Boolean) a0.c().zzb(zzbar.zzet)).booleanValue() && this.f22713c != null && (!this.f22711a.isFinishing() || this.f22714d == null)) {
            this.f22713c.onPause();
        }
        B1();
    }

    public final void zzt() {
        t tVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f22712b;
        if (adOverlayInfoParcel != null && (tVar = adOverlayInfoParcel.f14699c) != null) {
            tVar.zze();
        }
    }

    public final void zzv() {
        this.f22726q = true;
    }

    public final void zzx() {
        this.f22721l.removeView(this.f22715f);
        E1(true);
    }
}
