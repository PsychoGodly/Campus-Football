package com.startapp.sdk.ads.banner.bannerstandard;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.applovin.mediation.MaxReward;
import com.startapp.a0;
import com.startapp.b6;
import com.startapp.d2;
import com.startapp.e5;
import com.startapp.f9;
import com.startapp.g5;
import com.startapp.i3;
import com.startapp.j3;
import com.startapp.j4;
import com.startapp.j5;
import com.startapp.j9;
import com.startapp.k5;
import com.startapp.k7;
import com.startapp.l5;
import com.startapp.m0;
import com.startapp.n0;
import com.startapp.n5;
import com.startapp.o0;
import com.startapp.o5;
import com.startapp.p0;
import com.startapp.sa;
import com.startapp.sdk.ads.banner.BannerBase;
import com.startapp.sdk.ads.banner.BannerInterface;
import com.startapp.sdk.ads.banner.BannerListener;
import com.startapp.sdk.ads.banner.BannerMetaData;
import com.startapp.sdk.ads.banner.BannerOptions;
import com.startapp.sdk.ads.banner.bannerstandard.CloseableLayout;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.a;
import com.startapp.sdk.adsbase.adinformation.AdInformationObject;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.cache.CacheMetaData;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.mraid.bridge.MraidState;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.components.ComponentLocator;
import com.startapp.t0;
import com.startapp.u7;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import s9.c;

/* compiled from: Sta */
public class BannerStandard extends BannerBase implements AdEventListener, BannerInterface {
    public static final /* synthetic */ int Q = 0;
    public BannerListener A;
    public boolean B;
    public AdInformationObject C;
    public RelativeLayout D;
    public RelativeLayout E;
    public CloseableLayout F;
    public k7 G;
    public b6 H;
    public sa I;
    public sa J;
    public MraidBannerController K;
    public MraidBannerController L;
    public ViewGroup M;
    public final k7.a N;
    public final Runnable O;
    public final Runnable P;

    /* renamed from: q  reason: collision with root package name */
    public BannerStandardAd f16452q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f16453r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f16454s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f16455t;
    public WebView twoPartWebView;

    /* renamed from: u  reason: collision with root package name */
    public boolean f16456u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f16457v;

    /* renamed from: w  reason: collision with root package name */
    public final Handler f16458w;
    public WebView webView;

    /* renamed from: x  reason: collision with root package name */
    public long f16459x;

    /* renamed from: y  reason: collision with root package name */
    public BannerOptions f16460y;

    /* renamed from: z  reason: collision with root package name */
    public final o0 f16461z;

    /* compiled from: Sta */
    public class MraidBannerController extends t0 {
        private WebView activeWebView;
        /* access modifiers changed from: private */
        public MraidState mraidState = MraidState.LOADING;
        private boolean mraidVisibility = false;
        /* access modifiers changed from: private */
        public k5 nativeFeatureManager;
        private l5 orientationProperties;
        private n5 resizeProperties;

        /* compiled from: Sta */
        public class BannerWebViewClient extends o5 {
            public BannerWebViewClient(e5 e5Var) {
                super(e5Var);
            }

            public void onPageFinished(WebView webView, String str) {
                super.onPageFinished(webView, str);
                if (MraidBannerController.this.mraidState == MraidState.LOADING) {
                    j9.a(webView, true, "mraid.setPlacementType", "inline");
                    j5.a(BannerStandard.this.getContext(), webView, MraidBannerController.this.nativeFeatureManager);
                    MraidBannerController.this.updateDisplayMetrics(webView);
                    MraidState unused = MraidBannerController.this.mraidState = MraidState.DEFAULT;
                    g5.a(MraidBannerController.this.mraidState, webView);
                    j9.a(webView, true, "mraid.fireReadyEvent", new Object[0]);
                }
                BannerStandard bannerStandard = BannerStandard.this;
                bannerStandard.q();
                if (MetaData.f17070k.V()) {
                    try {
                        bannerStandard.b(webView);
                    } catch (Throwable th) {
                        i3.a(th);
                    }
                }
            }
        }

        public MraidBannerController(WebView webView, t0.a aVar) {
            super(aVar);
            this.activeWebView = webView;
            webView.setWebViewClient(new BannerWebViewClient(this));
            this.nativeFeatureManager = new k5(BannerStandard.this.getContext());
            this.orientationProperties = new l5();
        }

        /* access modifiers changed from: private */
        public void fireViewableChangeEvent(boolean z10) {
            if (this.mraidVisibility != z10) {
                this.mraidVisibility = z10;
                j9.a(this.activeWebView, true, "mraid.fireViewableChangeEvent", Boolean.valueOf(z10));
            }
        }

        /* access modifiers changed from: private */
        public void updateDisplayMetrics(WebView webView) {
            Context context = BannerStandard.this.getContext();
            try {
                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                int i10 = displayMetrics.widthPixels;
                int i11 = displayMetrics.heightPixels;
                int[] iArr = new int[2];
                BannerStandard.this.getLocationOnScreen(iArr);
                int i12 = iArr[0];
                int i13 = iArr[1];
                g5.b(context, i10, i11, webView);
                Point point = BannerStandard.this.f16461z.f16191a;
                g5.b(context, i12, i13, point.x, point.y, webView);
                g5.a(context, i10, i11, webView);
                Point point2 = BannerStandard.this.f16461z.f16191a;
                g5.a(context, i12, i13, point2.x, point2.y, webView);
            } catch (Throwable th) {
                i3.a(th);
            }
        }

        public void close() {
            BannerStandard.a(BannerStandard.this);
        }

        public void expand(String str) {
            BannerStandard bannerStandard = BannerStandard.this;
            int i10 = BannerStandard.Q;
            bannerStandard.b();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            boolean z10 = str != null && !TextUtils.isEmpty(str);
            if (z10) {
                bannerStandard.f16454s = false;
                if (bannerStandard.twoPartWebView == null) {
                    bannerStandard.twoPartWebView = ComponentLocator.a(bannerStandard.getContext()).x().b();
                }
                bannerStandard.L = new MraidBannerController(bannerStandard.twoPartWebView, new t0.a() {
                    public boolean onClickEvent(String str) {
                        if (!BannerStandard.this.f16454s) {
                            i3 i3Var = new i3(j3.f15952e);
                            i3Var.f15914d = "fake_click";
                            i3Var.f15917g = a.a(str, (String) null);
                            StringBuilder a10 = p0.a("jsTag=");
                            a10.append(BannerStandard.this.f16455t);
                            i3Var.f15915e = a10.toString();
                            i3Var.a();
                        }
                        BannerStandard bannerStandard = BannerStandard.this;
                        if ((!bannerStandard.f16455t || bannerStandard.f16454s) && str != null) {
                            return BannerStandard.a(bannerStandard, str);
                        }
                        return false;
                    }
                });
                bannerStandard.J = new sa(bannerStandard.twoPartWebView, BannerMetaData.f16423b.a(), new sa.b() {
                    public boolean onUpdate(boolean z10) {
                        BannerStandard.this.K.fireViewableChangeEvent(z10);
                        BannerStandard.this.L.fireViewableChangeEvent(z10);
                        return BannerStandard.this.f16452q.s();
                    }
                });
                bannerStandard.twoPartWebView.setId(159868226);
                bannerStandard.a(bannerStandard.twoPartWebView);
                bannerStandard.twoPartWebView.loadUrl(str);
            }
            if (bannerStandard.K.getState() == MraidState.DEFAULT) {
                if (z10) {
                    bannerStandard.F.addView(bannerStandard.twoPartWebView, layoutParams);
                } else {
                    RelativeLayout relativeLayout = bannerStandard.E;
                    if (relativeLayout != null) {
                        relativeLayout.removeView(bannerStandard.webView);
                        bannerStandard.E.setVisibility(4);
                    }
                    bannerStandard.F.addView(bannerStandard.webView, layoutParams);
                }
                if (bannerStandard.M == null) {
                    bannerStandard.M = bannerStandard.t();
                }
                bannerStandard.M.addView(bannerStandard.F, new FrameLayout.LayoutParams(-1, -1));
            } else if (bannerStandard.K.getState() == MraidState.RESIZED && z10) {
                bannerStandard.F.removeView(bannerStandard.webView);
                RelativeLayout relativeLayout2 = bannerStandard.E;
                if (relativeLayout2 != null) {
                    relativeLayout2.addView(bannerStandard.webView, layoutParams);
                    bannerStandard.E.setVisibility(4);
                }
                bannerStandard.F.addView(bannerStandard.twoPartWebView, layoutParams);
            }
            bannerStandard.F.setLayoutParams(layoutParams);
            bannerStandard.K.setState(MraidState.EXPANDED);
        }

        public n5 getResizeProperties() {
            return this.resizeProperties;
        }

        public MraidState getState() {
            return this.mraidState;
        }

        public boolean isFeatureSupported(String str) {
            return this.nativeFeatureManager.f16036b.contains(str);
        }

        public void resize() {
            BannerStandard bannerStandard = BannerStandard.this;
            n5 resizeProperties2 = bannerStandard.K.getResizeProperties();
            if (resizeProperties2 == null) {
                g5.a(bannerStandard.webView, "requires: setResizeProperties first", "resize");
                return;
            }
            bannerStandard.b();
            if (bannerStandard.K.getState() != MraidState.LOADING && bannerStandard.K.getState() != MraidState.HIDDEN) {
                if (bannerStandard.K.getState() == MraidState.EXPANDED) {
                    g5.a(bannerStandard.webView, "Not allowed to resize from an already expanded ad", "resize");
                    return;
                }
                int i10 = resizeProperties2.f16172a;
                int i11 = resizeProperties2.f16173b;
                int i12 = resizeProperties2.f16174c;
                int i13 = resizeProperties2.f16175d;
                int[] iArr = new int[2];
                bannerStandard.webView.getLocationOnScreen(iArr);
                Context context = bannerStandard.getContext();
                int b10 = f9.b(context, iArr[0]) + i12;
                int round = Math.round(((float) iArr[1]) / context.getResources().getDisplayMetrics().density) + i13;
                Rect rect = new Rect(b10, round, i10 + b10, i11 + round);
                ViewGroup t10 = bannerStandard.t();
                int round2 = Math.round(((float) t10.getWidth()) / context.getResources().getDisplayMetrics().density);
                int round3 = Math.round(((float) t10.getHeight()) / context.getResources().getDisplayMetrics().density);
                int[] iArr2 = new int[2];
                t10.getLocationOnScreen(iArr2);
                int round4 = Math.round(((float) iArr2[0]) / context.getResources().getDisplayMetrics().density);
                int round5 = Math.round(((float) iArr2[1]) / context.getResources().getDisplayMetrics().density);
                if (!resizeProperties2.f16177f) {
                    if (rect.width() > round2 || rect.height() > round3) {
                        g5.a(bannerStandard.webView, "Not enough room for the ad", "resize");
                        return;
                    }
                    rect.offsetTo(Math.max(round4, Math.min(rect.left, (round4 + round2) - rect.width())), Math.max(round5, Math.min(rect.top, (round5 + round3) - rect.height())));
                }
                Rect rect2 = new Rect();
                try {
                    CloseableLayout.ClosePosition a10 = CloseableLayout.ClosePosition.a(resizeProperties2.f16176e, CloseableLayout.ClosePosition.TOP_RIGHT);
                    int i14 = bannerStandard.F.f16467e;
                    Gravity.apply(a10.a(), i14, i14, rect, rect2);
                    if (!new Rect(round4, round5, round2 + round4, round3 + round5).contains(rect2)) {
                        g5.a(bannerStandard.webView, "The close region to appear within the max allowed size", "resize");
                    } else if (!rect.contains(rect2)) {
                        g5.a(bannerStandard.webView, "The close region to appear within the max allowed size", "resize");
                    } else {
                        bannerStandard.F.setCloseVisible(false);
                        bannerStandard.F.setClosePosition(a10);
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(rect.width(), rect.height());
                        layoutParams.leftMargin = rect.left - round4;
                        layoutParams.topMargin = rect.top - round5;
                        if (bannerStandard.K.getState() == MraidState.DEFAULT) {
                            RelativeLayout relativeLayout = bannerStandard.E;
                            if (relativeLayout != null) {
                                relativeLayout.removeView(bannerStandard.webView);
                                bannerStandard.E.setVisibility(4);
                            }
                            bannerStandard.F.addView(bannerStandard.webView, new FrameLayout.LayoutParams(-1, -1));
                            if (bannerStandard.M == null) {
                                bannerStandard.M = bannerStandard.t();
                            }
                            bannerStandard.M.addView(bannerStandard.F, layoutParams);
                        } else if (bannerStandard.K.getState() == MraidState.RESIZED) {
                            bannerStandard.F.setLayoutParams(layoutParams);
                        }
                        bannerStandard.F.setClosePosition(a10);
                        bannerStandard.K.setState(MraidState.RESIZED);
                    }
                } catch (Exception e10) {
                    g5.a(bannerStandard.webView, e10.getMessage(), "resize");
                }
            }
        }

        public void setExpandProperties(Map<String, String> map) {
            String str = map.get("useCustomClose");
            if (str != null) {
                BannerStandard.a(BannerStandard.this, Boolean.parseBoolean(str));
            }
        }

        public void setOrientationProperties(Map<String, String> map) {
            boolean parseBoolean = Boolean.parseBoolean(map.get("allowOrientationChange"));
            String str = map.get("forceOrientation");
            l5 l5Var = this.orientationProperties;
            if (l5Var.f16095a != parseBoolean || l5Var.f16096b != l5.a(str)) {
                l5 l5Var2 = this.orientationProperties;
                l5Var2.f16095a = parseBoolean;
                l5Var2.f16096b = l5.a(str);
                applyOrientationProperties((Activity) BannerStandard.this.getContext(), this.orientationProperties);
            }
        }

        public void setResizeProperties(Map<String, String> map) {
            boolean z10;
            try {
                int parseInt = Integer.parseInt(map.get("width"));
                int parseInt2 = Integer.parseInt(map.get("height"));
                int parseInt3 = Integer.parseInt(map.get("offsetX"));
                int parseInt4 = Integer.parseInt(map.get("offsetY"));
                String str = map.get("allowOffscreen");
                String str2 = map.get("customClosePosition");
                if (str != null) {
                    if (!Boolean.parseBoolean(str)) {
                        z10 = false;
                        this.resizeProperties = new n5(parseInt, parseInt2, parseInt3, parseInt4, str2, z10);
                    }
                }
                z10 = true;
                this.resizeProperties = new n5(parseInt, parseInt2, parseInt3, parseInt4, str2, z10);
            } catch (Exception unused) {
                g5.a(this.activeWebView, "wrong format", "setResizeProperties");
            }
        }

        public void setState(MraidState mraidState2) {
            this.mraidState = mraidState2;
            g5.a(mraidState2, this.activeWebView);
        }

        public void useCustomClose(String str) {
            BannerStandard.a(BannerStandard.this, Boolean.parseBoolean(str));
        }
    }

    public BannerStandard(Context context) {
        this(context, true, (AdPreferences) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v19, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v20, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v30, resolved type: java.lang.String[]} */
    /* JADX WARNING: type inference failed for: r1v28 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00eb A[Catch:{ all -> 0x0119 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(com.startapp.sdk.ads.banner.bannerstandard.BannerStandard r18, java.lang.String r19) {
        /*
            r0 = r18
            r2 = r19
            r18.getClass()
            r1 = 0
            java.lang.String r3 = com.startapp.sdk.adsbase.a.a((java.lang.String) r2, (java.lang.String) r1)
            android.content.Context r4 = r18.getContext()
            com.startapp.sdk.ads.banner.BannerListener r5 = r0.A
            com.startapp.m0.a(r4, r5, r0, r3)
            com.startapp.k7 r3 = r0.G
            if (r3 == 0) goto L_0x001c
            r3.a(r1, r1)
        L_0x001c:
            com.startapp.sa r3 = r0.I
            if (r3 == 0) goto L_0x0023
            r3.a()
        L_0x0023:
            com.startapp.sa r3 = r0.J
            if (r3 == 0) goto L_0x002a
            r3.a()
        L_0x002a:
            r18.q()
            android.content.Context r3 = r18.getContext()
            com.startapp.sdk.adsbase.model.AdPreferences$Placement r4 = com.startapp.sdk.adsbase.model.AdPreferences.Placement.INAPP_BANNER
            boolean r3 = com.startapp.sdk.adsbase.a.a((android.content.Context) r3, (com.startapp.sdk.adsbase.model.AdPreferences.Placement) r4)
            com.startapp.sdk.ads.banner.bannerstandard.BannerStandardAd r4 = r0.f16452q
            java.lang.String[] r4 = r4.p()
            com.startapp.sdk.ads.banner.bannerstandard.BannerStandardAd r5 = r0.f16452q
            java.lang.String[] r5 = r5.n()
            boolean r6 = r0.f16455t
            java.lang.String r7 = "adId: "
            r14 = 1
            r15 = 0
            if (r6 != 0) goto L_0x011e
            java.lang.String r6 = "index="
            boolean r6 = r2.contains(r6)
            if (r6 == 0) goto L_0x011e
            int r6 = com.startapp.sdk.adsbase.a.a((java.lang.String) r19)     // Catch:{ all -> 0x0119 }
            if (r6 >= 0) goto L_0x0080
            com.startapp.i3 r1 = new com.startapp.i3     // Catch:{ all -> 0x0119 }
            com.startapp.j3 r2 = com.startapp.j3.f15952e     // Catch:{ all -> 0x0119 }
            r1.<init>((com.startapp.j3) r2)     // Catch:{ all -> 0x0119 }
            java.lang.String r2 = "Wrong index extracted from URL"
            r1.f15914d = r2     // Catch:{ all -> 0x0119 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0119 }
            r2.<init>()     // Catch:{ all -> 0x0119 }
            r2.append(r7)     // Catch:{ all -> 0x0119 }
            com.startapp.sdk.ads.banner.bannerstandard.BannerStandardAd r0 = r0.f16452q     // Catch:{ all -> 0x0119 }
            java.lang.String r0 = r0.getAdId()     // Catch:{ all -> 0x0119 }
            r2.append(r0)     // Catch:{ all -> 0x0119 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0119 }
            r1.f15915e = r0     // Catch:{ all -> 0x0119 }
            r1.a()     // Catch:{ all -> 0x0119 }
            goto L_0x0142
        L_0x0080:
            com.startapp.sdk.ads.banner.bannerstandard.BannerStandardAd r7 = r0.f16452q     // Catch:{ all -> 0x0119 }
            r7.getClass()     // Catch:{ all -> 0x0119 }
            if (r6 < 0) goto L_0x0090
            boolean[] r7 = r7.smartRedirect     // Catch:{ all -> 0x0119 }
            int r8 = r7.length     // Catch:{ all -> 0x0119 }
            if (r6 < r8) goto L_0x008d
            goto L_0x0090
        L_0x008d:
            boolean r7 = r7[r6]     // Catch:{ all -> 0x0119 }
            goto L_0x0091
        L_0x0090:
            r7 = 0
        L_0x0091:
            if (r7 == 0) goto L_0x00e4
            if (r3 != 0) goto L_0x00e4
            android.content.Context r3 = r18.getContext()     // Catch:{ all -> 0x0119 }
            int r7 = r4.length     // Catch:{ all -> 0x0119 }
            if (r6 >= r7) goto L_0x00a3
            java.lang.String[] r7 = new java.lang.String[r14]     // Catch:{ all -> 0x0119 }
            r4 = r4[r6]     // Catch:{ all -> 0x0119 }
            r7[r15] = r4     // Catch:{ all -> 0x0119 }
            goto L_0x00a4
        L_0x00a3:
            r7 = r1
        L_0x00a4:
            int r4 = r5.length     // Catch:{ all -> 0x0119 }
            if (r6 >= r4) goto L_0x00a9
            r1 = r5[r6]     // Catch:{ all -> 0x0119 }
        L_0x00a9:
            r4 = r1
            com.startapp.sdk.adsbase.commontracking.TrackingParams r5 = new com.startapp.sdk.adsbase.commontracking.TrackingParams     // Catch:{ all -> 0x0119 }
            com.startapp.sdk.adsbase.model.AdPreferences r1 = r18.getAdPreferences()     // Catch:{ all -> 0x0119 }
            java.lang.String r1 = r1.getAdTag()     // Catch:{ all -> 0x0119 }
            r5.<init>(r1)     // Catch:{ all -> 0x0119 }
            com.startapp.sdk.adsbase.AdsCommonMetaData r1 = com.startapp.sdk.adsbase.AdsCommonMetaData.f16770h     // Catch:{ all -> 0x0119 }
            long r8 = r1.z()     // Catch:{ all -> 0x0119 }
            com.startapp.sdk.adsbase.AdsCommonMetaData r1 = com.startapp.sdk.adsbase.AdsCommonMetaData.f16770h     // Catch:{ all -> 0x0119 }
            long r10 = r1.y()     // Catch:{ all -> 0x0119 }
            com.startapp.sdk.ads.banner.bannerstandard.BannerStandardAd r1 = r0.f16452q     // Catch:{ all -> 0x0119 }
            boolean r12 = r1.a((int) r6)     // Catch:{ all -> 0x0119 }
            com.startapp.sdk.ads.banner.bannerstandard.BannerStandardAd r1 = r0.f16452q     // Catch:{ all -> 0x0119 }
            java.lang.Boolean r13 = r1.b((int) r6)     // Catch:{ all -> 0x0119 }
            r16 = 0
            r17 = 0
            r1 = r3
            r2 = r19
            r3 = r7
            r6 = r8
            r8 = r10
            r10 = r12
            r11 = r13
            r12 = r16
            r13 = r17
            com.startapp.sdk.adsbase.a.a(r1, r2, r3, r4, r5, r6, r8, r10, r11, r12, r13)     // Catch:{ all -> 0x0119 }
            goto L_0x01df
        L_0x00e4:
            android.content.Context r5 = r18.getContext()     // Catch:{ all -> 0x0119 }
            int r7 = r4.length     // Catch:{ all -> 0x0119 }
            if (r6 >= r7) goto L_0x00f1
            java.lang.String[] r1 = new java.lang.String[r14]     // Catch:{ all -> 0x0119 }
            r4 = r4[r6]     // Catch:{ all -> 0x0119 }
            r1[r15] = r4     // Catch:{ all -> 0x0119 }
        L_0x00f1:
            r4 = r1
            com.startapp.sdk.adsbase.commontracking.TrackingParams r7 = new com.startapp.sdk.adsbase.commontracking.TrackingParams     // Catch:{ all -> 0x0119 }
            com.startapp.sdk.adsbase.model.AdPreferences r1 = r18.getAdPreferences()     // Catch:{ all -> 0x0119 }
            java.lang.String r1 = r1.getAdTag()     // Catch:{ all -> 0x0119 }
            r7.<init>(r1)     // Catch:{ all -> 0x0119 }
            com.startapp.sdk.ads.banner.bannerstandard.BannerStandardAd r1 = r0.f16452q     // Catch:{ all -> 0x0119 }
            boolean r1 = r1.a((int) r6)     // Catch:{ all -> 0x0119 }
            if (r1 == 0) goto L_0x010b
            if (r3 != 0) goto L_0x010b
            r6 = 1
            goto L_0x010c
        L_0x010b:
            r6 = 0
        L_0x010c:
            r8 = 0
            r1 = r5
            r2 = r19
            r3 = r4
            r4 = r7
            r5 = r6
            r6 = r8
            com.startapp.sdk.adsbase.a.a((android.content.Context) r1, (java.lang.String) r2, (java.lang.String[]) r3, (com.startapp.sdk.adsbase.commontracking.TrackingParams) r4, (boolean) r5, (boolean) r6)     // Catch:{ all -> 0x0119 }
            goto L_0x01df
        L_0x0119:
            r0 = move-exception
            com.startapp.i3.a((java.lang.Throwable) r0)
            goto L_0x0142
        L_0x011e:
            int r1 = r4.length
            if (r1 >= r14) goto L_0x0145
            com.startapp.i3 r1 = new com.startapp.i3
            com.startapp.j3 r2 = com.startapp.j3.f15952e
            r1.<init>((com.startapp.j3) r2)
            java.lang.String r2 = "No tracking URLs"
            r1.f15914d = r2
            java.lang.StringBuilder r2 = com.startapp.p0.a(r7)
            com.startapp.sdk.ads.banner.bannerstandard.BannerStandardAd r0 = r0.f16452q
            java.lang.String r0 = r0.getAdId()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.f15915e = r0
            r1.a()
        L_0x0142:
            r14 = 0
            goto L_0x01e7
        L_0x0145:
            com.startapp.sdk.ads.banner.bannerstandard.BannerStandardAd r1 = r0.f16452q
            r1.getClass()
            boolean[] r1 = r1.smartRedirect
            int r6 = r1.length
            if (r6 > 0) goto L_0x0151
            r1 = 0
            goto L_0x0153
        L_0x0151:
            boolean r1 = r1[r15]
        L_0x0153:
            if (r1 == 0) goto L_0x01b5
            if (r3 != 0) goto L_0x01b5
            int r1 = r5.length
            if (r1 >= r14) goto L_0x017c
            com.startapp.i3 r1 = new com.startapp.i3
            com.startapp.j3 r2 = com.startapp.j3.f15952e
            r1.<init>((com.startapp.j3) r2)
            java.lang.String r2 = "No package names"
            r1.f15914d = r2
            java.lang.StringBuilder r2 = com.startapp.p0.a(r7)
            com.startapp.sdk.ads.banner.bannerstandard.BannerStandardAd r0 = r0.f16452q
            java.lang.String r0 = r0.getAdId()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.f15915e = r0
            r1.a()
            goto L_0x0142
        L_0x017c:
            android.content.Context r1 = r18.getContext()
            java.lang.String[] r3 = new java.lang.String[r14]
            r4 = r4[r15]
            r3[r15] = r4
            r4 = r5[r15]
            com.startapp.sdk.adsbase.commontracking.TrackingParams r5 = new com.startapp.sdk.adsbase.commontracking.TrackingParams
            com.startapp.sdk.adsbase.model.AdPreferences r6 = r18.getAdPreferences()
            java.lang.String r6 = r6.getAdTag()
            r5.<init>(r6)
            com.startapp.sdk.adsbase.AdsCommonMetaData r6 = com.startapp.sdk.adsbase.AdsCommonMetaData.f16770h
            long r6 = r6.z()
            com.startapp.sdk.adsbase.AdsCommonMetaData r8 = com.startapp.sdk.adsbase.AdsCommonMetaData.f16770h
            long r8 = r8.y()
            com.startapp.sdk.ads.banner.bannerstandard.BannerStandardAd r10 = r0.f16452q
            boolean r10 = r10.a((int) r15)
            com.startapp.sdk.ads.banner.bannerstandard.BannerStandardAd r11 = r0.f16452q
            java.lang.Boolean r11 = r11.b((int) r15)
            r12 = 0
            r13 = 0
            r2 = r19
            com.startapp.sdk.adsbase.a.a(r1, r2, r3, r4, r5, r6, r8, r10, r11, r12, r13)
            goto L_0x01df
        L_0x01b5:
            android.content.Context r1 = r18.getContext()
            java.lang.String[] r5 = new java.lang.String[r14]
            r4 = r4[r15]
            r5[r15] = r4
            com.startapp.sdk.adsbase.commontracking.TrackingParams r4 = new com.startapp.sdk.adsbase.commontracking.TrackingParams
            com.startapp.sdk.adsbase.model.AdPreferences r6 = r18.getAdPreferences()
            java.lang.String r6 = r6.getAdTag()
            r4.<init>(r6)
            com.startapp.sdk.ads.banner.bannerstandard.BannerStandardAd r6 = r0.f16452q
            boolean r6 = r6.a((int) r15)
            if (r6 == 0) goto L_0x01d7
            if (r3 != 0) goto L_0x01d7
            r15 = 1
        L_0x01d7:
            r6 = 0
            r2 = r19
            r3 = r5
            r5 = r15
            com.startapp.sdk.adsbase.a.a((android.content.Context) r1, (java.lang.String) r2, (java.lang.String[]) r3, (com.startapp.sdk.adsbase.commontracking.TrackingParams) r4, (boolean) r5, (boolean) r6)
        L_0x01df:
            android.webkit.WebView r1 = r0.webView
            r1.stopLoading()
            r0.setClicked(r14)
        L_0x01e7:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.ads.banner.bannerstandard.BannerStandard.a(com.startapp.sdk.ads.banner.bannerstandard.BannerStandard, java.lang.String):boolean");
    }

    public final void b(Point point, int i10) {
        if (point.x <= 0) {
            point.x = i10;
        }
    }

    public int c() {
        return Math.max(this.f16460y.i() - ((int) this.f16459x), 0);
    }

    public int d() {
        return this.f16412i;
    }

    public String e() {
        return "StartApp Banner";
    }

    public int f() {
        return this.f16460y.i();
    }

    public View g() {
        RelativeLayout relativeLayout = this.E;
        return relativeLayout != null ? relativeLayout : this;
    }

    public String getBidToken() {
        BannerStandardAd bannerStandardAd = this.f16452q;
        if (bannerStandardAd != null) {
            return bannerStandardAd.getBidToken();
        }
        return null;
    }

    public int getHeightInDp() {
        return 50;
    }

    public int getWidthInDp() {
        return 300;
    }

    public void hideBanner() {
        this.f16457v = false;
        a.a(this.P);
    }

    public void i() {
        int i10;
        try {
            Context context = getContext();
            CloseableLayout closeableLayout = new CloseableLayout(context);
            this.F = closeableLayout;
            closeableLayout.setOnCloseListener(new CloseableLayout.a() {
                public void onClose() {
                    BannerStandard.a(BannerStandard.this);
                }
            });
            WebView b10 = ComponentLocator.a(context).x().b();
            this.webView = b10;
            this.K = new MraidBannerController(b10, new t0.a() {
                public boolean onClickEvent(String str) {
                    if (!BannerStandard.this.f16454s) {
                        i3 i3Var = new i3(j3.f15952e);
                        i3Var.f15914d = "fake_click";
                        i3Var.f15917g = a.a(str, (String) null);
                        StringBuilder a10 = p0.a("jsTag=");
                        a10.append(BannerStandard.this.f16455t);
                        i3Var.f15915e = a10.toString();
                        i3Var.a();
                    }
                    BannerStandard bannerStandard = BannerStandard.this;
                    if ((!bannerStandard.f16455t || bannerStandard.f16454s) && str != null) {
                        return BannerStandard.a(bannerStandard, str);
                    }
                    return false;
                }
            });
            this.f16460y = new BannerOptions();
            if (this.f16452q == null) {
                BannerStandardAd bannerStandardAd = this.f16452q;
                if (bannerStandardAd == null) {
                    i10 = 0;
                } else {
                    i10 = bannerStandardAd.w();
                }
                this.f16452q = new BannerStandardAd(context, i10);
            }
            if (getId() == -1) {
                setId(this.f16412i);
            }
            this.webView.setId(159868225);
            a(this.webView);
            this.f16460y = BannerMetaData.f16423b.b();
            setMinimumWidth(f9.a(getContext(), this.f16461z.f16191a.x));
            setMinimumHeight(f9.a(getContext(), this.f16461z.f16191a.y));
            WebView webView2 = this.webView;
            Context context2 = getContext();
            AnonymousClass8 r42 = new Runnable() {
                public void run() {
                }
            };
            TrackingParams trackingParams = new TrackingParams(getAdPreferences().getAdTag());
            boolean a10 = this.f16452q.a(0);
            j4 j4Var = new j4(context2, r42, trackingParams);
            j4Var.f15968b = a10;
            webView2.addJavascriptInterface(j4Var, "startappwall");
            this.E = new RelativeLayout(getContext());
            a((View) this.webView);
            a.a(this.P);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(13);
            addView(this.E, layoutParams);
            if (this.f16456u) {
                getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
                    public void onGlobalLayout() {
                        ViewTreeObserver viewTreeObserver = BannerStandard.this.getViewTreeObserver();
                        int i10 = a0.f15596a;
                        if (Build.VERSION.SDK_INT >= 16) {
                            viewTreeObserver.removeOnGlobalLayoutListener(this);
                        } else {
                            viewTreeObserver.removeGlobalOnLayoutListener(this);
                        }
                        BannerStandard bannerStandard = BannerStandard.this;
                        if (!bannerStandard.f16453r) {
                            bannerStandard.k();
                        }
                    }
                });
            }
        } catch (Throwable th) {
            i3.a(th);
            hideBanner();
            a("BannerStandard.init - webview failed");
        }
    }

    public void loadHtml() {
        String k10;
        BannerStandardAd bannerStandardAd = this.f16452q;
        if (bannerStandardAd != null && (k10 = bannerStandardAd.k()) != null) {
            if (getAdPreferences().getAdTag() != null && getAdPreferences().getAdTag().length() > 0) {
                k10 = k10.replaceAll("startapp_adtag_placeholder", getAdPreferences().getAdTag());
            }
            if (CacheMetaData.d()) {
                this.f16458w.postDelayed(new Runnable() {
                    public void run() {
                        BannerStandard bannerStandard = BannerStandard.this;
                        int i10 = BannerStandard.Q;
                        bannerStandard.j();
                    }
                }, (long) this.f16460y.i());
            }
            this.f16459x = System.currentTimeMillis();
            getContext();
            j9.a(this.webView, k10);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0013  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m() {
        /*
            r4 = this;
            com.startapp.b6 r0 = r4.H
            r1 = 0
            r4.H = r1
            if (r0 == 0) goto L_0x0010
            r0.a()     // Catch:{ all -> 0x000c }
            r0 = 1
            goto L_0x0011
        L_0x000c:
            r0 = move-exception
            com.startapp.i3.a((java.lang.Throwable) r0)
        L_0x0010:
            r0 = 0
        L_0x0011:
            if (r0 == 0) goto L_0x0027
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            com.startapp.sdk.ads.banner.bannerstandard.BannerStandard$10 r1 = new com.startapp.sdk.ads.banner.bannerstandard.BannerStandard$10
            r1.<init>()
            r2 = 4000(0xfa0, double:1.9763E-320)
            r0.postDelayed(r1, r2)
            goto L_0x002a
        L_0x0027:
            r4.v()
        L_0x002a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.ads.banner.bannerstandard.BannerStandard.m():void");
    }

    public void n() {
        k7 k7Var = this.G;
        if (k7Var != null && k7Var.a()) {
            super.n();
        }
    }

    public final void o() {
        if (this.C == null && this.D == null) {
            this.D = new RelativeLayout(getContext());
            AdInformationObject adInformationObject = new AdInformationObject(getContext(), AdInformationObject.Size.SMALL, AdPreferences.Placement.INAPP_BANNER, this.f16452q.getAdInfoOverride(), this.f16452q.getConsentData(), this.f16452q.getRequestUrl(), this.f16452q.getDParam());
            this.C = adInformationObject;
            adInformationObject.a(this.D);
        }
        try {
            ViewGroup viewGroup = (ViewGroup) this.D.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.D);
            }
        } catch (Exception unused) {
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        this.webView.addView(this.D, layoutParams);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        WebView webView2 = this.webView;
        if (webView2 != null) {
            a0.b(webView2);
        }
        WebView webView3 = this.twoPartWebView;
        if (webView3 != null) {
            a0.b(webView3);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WebView webView2 = this.webView;
        if (webView2 != null) {
            a0.a(webView2);
        }
        WebView webView3 = this.twoPartWebView;
        if (webView3 != null) {
            a0.a(webView3);
        }
        k7 k7Var = this.G;
        if (k7Var != null) {
            k7Var.a("AD_CLOSED_TOO_QUICKLY", (JSONObject) null);
        }
        sa saVar = this.I;
        if (saVar != null) {
            saVar.a();
        }
        sa saVar2 = this.J;
        if (saVar2 != null) {
            saVar2.a();
        }
        q();
        b6 b6Var = this.H;
        this.H = null;
        if (b6Var != null) {
            try {
                b6Var.a();
            } catch (Throwable th) {
                i3.a(th);
            }
        }
        WebView webView4 = this.webView;
        Map<Activity, Integer> map = j9.f15982a;
        new Handler(Looper.getMainLooper()).postAtTime((Runnable) null, webView4, SystemClock.uptimeMillis() + 1000);
    }

    public void onFailedToReceiveAd(Ad ad2) {
        if (ad2 != null) {
            a(ad2.getErrorMessage());
        }
    }

    public void onReceiveAd(Ad ad2) {
        String str;
        this.f16454s = false;
        removeView(this.D);
        BannerStandardAd bannerStandardAd = this.f16452q;
        if (bannerStandardAd == null || bannerStandardAd.k() == null || this.f16452q.k().compareTo(MaxReward.DEFAULT_LABEL) == 0) {
            a("No Banner received");
            return;
        }
        this.f16455t = "true".equals(j9.a(this.f16452q.k(), "@jsTag@", "@jsTag@"));
        loadHtml();
        try {
            if (a(Integer.parseInt(j9.a(this.f16452q.k(), "@width@", "@width@")), Integer.parseInt(j9.a(this.f16452q.k(), "@height@", "@height@")))) {
                this.f16453r = true;
                o();
                u();
                a();
                p();
                if (this.f16457v) {
                    a.a(this.O);
                }
                if (this.A != null && !this.B) {
                    this.B = true;
                    Context context = getContext();
                    BannerListener bannerListener = this.A;
                    BannerStandardAd bannerStandardAd2 = this.f16452q;
                    bannerStandardAd2.getClass();
                    String[] strArr = bannerStandardAd2.trackingUrls;
                    if (strArr.length <= 0) {
                        str = null;
                    } else {
                        str = strArr[0];
                    }
                    m0.c(context, bannerListener, this, a.a(str, (String) null));
                    return;
                }
                return;
            }
            a("Banner cannot be displayed (not enough room)");
        } catch (NumberFormatException unused) {
            a("Error Casting width & height from HTML");
        } catch (Throwable th) {
            i3.a(th);
            a(th.getMessage());
        }
    }

    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        double ceil = Math.ceil((double) (((float) i10) / displayMetrics.density));
        double ceil2 = Math.ceil((double) (((float) i11) / displayMetrics.density));
        Point point = this.f16461z.f16191a;
        if (ceil < ((double) point.x) || ceil2 < ((double) point.y)) {
            a.a(this.P);
        } else if (this.f16457v && this.f16453r) {
            a.a(this.O);
        }
    }

    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        if (z10) {
            WebView webView2 = this.webView;
            if (webView2 != null) {
                a0.b(webView2);
            }
            WebView webView3 = this.twoPartWebView;
            if (webView3 != null) {
                a0.b(webView3);
                return;
            }
            return;
        }
        WebView webView4 = this.webView;
        if (webView4 != null) {
            a0.a(webView4);
        }
        WebView webView5 = this.twoPartWebView;
        if (webView5 != null) {
            a0.a(webView5);
        }
    }

    public final void p() {
        BannerStandardAd bannerStandardAd = this.f16452q;
        if (bannerStandardAd != null && bannerStandardAd.s()) {
            this.I = new sa(this.webView, BannerMetaData.f16423b.a(), new sa.b() {
                public boolean onUpdate(boolean z10) {
                    BannerStandard.this.K.fireViewableChangeEvent(z10);
                    return BannerStandard.this.f16452q.s();
                }
            });
        }
    }

    public final void q() {
        this.f16458w.removeCallbacksAndMessages((Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0096 A[SYNTHETIC, Splitter:B:32:0x0096] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a8 A[Catch:{ all -> 0x00ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00c7 A[Catch:{ all -> 0x00ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00f6 A[Catch:{ all -> 0x00ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0111 A[Catch:{ all -> 0x00ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0093 A[EDGE_INSN: B:56:0x0093->B:30:0x0093 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00f4 A[EDGE_INSN: B:57:0x00f4->B:48:0x00f4 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Point r() {
        /*
            r8 = this;
            android.graphics.Point r0 = new android.graphics.Point
            r0.<init>()
            android.view.ViewGroup$LayoutParams r1 = r8.getLayoutParams()
            r2 = 1
            if (r1 == 0) goto L_0x0025
            android.view.ViewGroup$LayoutParams r1 = r8.getLayoutParams()
            int r1 = r1.width
            if (r1 <= 0) goto L_0x0025
            android.content.Context r1 = r8.getContext()
            android.view.ViewGroup$LayoutParams r3 = r8.getLayoutParams()
            int r3 = r3.width
            int r3 = r3 + r2
            int r1 = com.startapp.f9.b(r1, r3)
            r0.x = r1
        L_0x0025:
            android.view.ViewGroup$LayoutParams r1 = r8.getLayoutParams()
            if (r1 == 0) goto L_0x0044
            android.view.ViewGroup$LayoutParams r1 = r8.getLayoutParams()
            int r1 = r1.height
            if (r1 <= 0) goto L_0x0044
            android.content.Context r1 = r8.getContext()
            android.view.ViewGroup$LayoutParams r3 = r8.getLayoutParams()
            int r3 = r3.height
            int r3 = r3 + r2
            int r1 = com.startapp.f9.b(r1, r3)
            r0.y = r1
        L_0x0044:
            android.view.ViewGroup$LayoutParams r1 = r8.getLayoutParams()
            if (r1 == 0) goto L_0x005f
            android.view.ViewGroup$LayoutParams r1 = r8.getLayoutParams()
            int r1 = r1.width
            if (r1 <= 0) goto L_0x005f
            android.view.ViewGroup$LayoutParams r1 = r8.getLayoutParams()
            int r1 = r1.height
            if (r1 <= 0) goto L_0x005f
            com.startapp.sdk.ads.banner.bannerstandard.BannerStandardAd r1 = r8.f16452q
            r1.b(r2)
        L_0x005f:
            android.view.ViewGroup$LayoutParams r1 = r8.getLayoutParams()
            if (r1 == 0) goto L_0x0075
            android.view.ViewGroup$LayoutParams r1 = r8.getLayoutParams()
            int r1 = r1.width
            if (r1 <= 0) goto L_0x0075
            android.view.ViewGroup$LayoutParams r1 = r8.getLayoutParams()
            int r1 = r1.height
            if (r1 > 0) goto L_0x0163
        L_0x0075:
            android.content.Context r1 = r8.getContext()
            android.content.res.Resources r1 = r1.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            android.view.ViewParent r2 = r8.getParent()     // Catch:{ all -> 0x0144 }
            boolean r2 = r2 instanceof android.view.View     // Catch:{ all -> 0x0144 }
            if (r2 == 0) goto L_0x0092
            android.view.ViewParent r2 = r8.getParent()     // Catch:{ all -> 0x0144 }
            android.view.View r2 = (android.view.View) r2     // Catch:{ all -> 0x0144 }
            r3 = r2
            r2 = r8
            goto L_0x0094
        L_0x0092:
            r2 = r8
        L_0x0093:
            r3 = 0
        L_0x0094:
            if (r3 == 0) goto L_0x00f4
            int r4 = r3.getMeasuredWidth()     // Catch:{ all -> 0x00ef }
            if (r4 <= 0) goto L_0x00a2
            int r4 = r3.getMeasuredHeight()     // Catch:{ all -> 0x00ef }
            if (r4 > 0) goto L_0x00f4
        L_0x00a2:
            int r4 = r3.getMeasuredWidth()     // Catch:{ all -> 0x00ef }
            if (r4 <= 0) goto L_0x00c1
            android.content.Context r4 = r2.getContext()     // Catch:{ all -> 0x00ef }
            int r5 = r3.getMeasuredWidth()     // Catch:{ all -> 0x00ef }
            int r6 = r3.getPaddingLeft()     // Catch:{ all -> 0x00ef }
            int r5 = r5 - r6
            int r6 = r3.getPaddingRight()     // Catch:{ all -> 0x00ef }
            int r5 = r5 - r6
            int r4 = com.startapp.f9.b(r4, r5)     // Catch:{ all -> 0x00ef }
            r2.b(r0, r4)     // Catch:{ all -> 0x00ef }
        L_0x00c1:
            int r4 = r3.getMeasuredHeight()     // Catch:{ all -> 0x00ef }
            if (r4 <= 0) goto L_0x00e0
            android.content.Context r4 = r2.getContext()     // Catch:{ all -> 0x00ef }
            int r5 = r3.getMeasuredHeight()     // Catch:{ all -> 0x00ef }
            int r6 = r3.getPaddingBottom()     // Catch:{ all -> 0x00ef }
            int r5 = r5 - r6
            int r6 = r3.getPaddingTop()     // Catch:{ all -> 0x00ef }
            int r5 = r5 - r6
            int r4 = com.startapp.f9.b(r4, r5)     // Catch:{ all -> 0x00ef }
            r2.a((android.graphics.Point) r0, (int) r4)     // Catch:{ all -> 0x00ef }
        L_0x00e0:
            android.view.ViewParent r4 = r3.getParent()     // Catch:{ all -> 0x00ef }
            boolean r4 = r4 instanceof android.view.View     // Catch:{ all -> 0x00ef }
            if (r4 == 0) goto L_0x0093
            android.view.ViewParent r3 = r3.getParent()     // Catch:{ all -> 0x00ef }
            android.view.View r3 = (android.view.View) r3     // Catch:{ all -> 0x00ef }
            goto L_0x0094
        L_0x00ef:
            r3 = move-exception
            r7 = r3
            r3 = r2
            r2 = r7
            goto L_0x0146
        L_0x00f4:
            if (r3 != 0) goto L_0x0111
            android.content.Context r3 = r2.getContext()     // Catch:{ all -> 0x00ef }
            int r4 = r1.widthPixels     // Catch:{ all -> 0x00ef }
            int r3 = com.startapp.f9.b(r3, r4)     // Catch:{ all -> 0x00ef }
            r2.b(r0, r3)     // Catch:{ all -> 0x00ef }
            android.content.Context r3 = r2.getContext()     // Catch:{ all -> 0x00ef }
            int r4 = r1.heightPixels     // Catch:{ all -> 0x00ef }
            int r3 = com.startapp.f9.b(r3, r4)     // Catch:{ all -> 0x00ef }
            r2.a((android.graphics.Point) r0, (int) r3)     // Catch:{ all -> 0x00ef }
            goto L_0x0163
        L_0x0111:
            android.content.Context r4 = r2.getContext()     // Catch:{ all -> 0x00ef }
            int r5 = r3.getMeasuredWidth()     // Catch:{ all -> 0x00ef }
            int r6 = r3.getPaddingLeft()     // Catch:{ all -> 0x00ef }
            int r5 = r5 - r6
            int r6 = r3.getPaddingRight()     // Catch:{ all -> 0x00ef }
            int r5 = r5 - r6
            int r4 = com.startapp.f9.b(r4, r5)     // Catch:{ all -> 0x00ef }
            r2.b(r0, r4)     // Catch:{ all -> 0x00ef }
            android.content.Context r4 = r2.getContext()     // Catch:{ all -> 0x00ef }
            int r5 = r3.getMeasuredHeight()     // Catch:{ all -> 0x00ef }
            int r6 = r3.getPaddingBottom()     // Catch:{ all -> 0x00ef }
            int r5 = r5 - r6
            int r3 = r3.getPaddingTop()     // Catch:{ all -> 0x00ef }
            int r5 = r5 - r3
            int r3 = com.startapp.f9.b(r4, r5)     // Catch:{ all -> 0x00ef }
            r2.a((android.graphics.Point) r0, (int) r3)     // Catch:{ all -> 0x00ef }
            goto L_0x0163
        L_0x0144:
            r2 = move-exception
            r3 = r8
        L_0x0146:
            com.startapp.i3.a((java.lang.Throwable) r2)
            android.content.Context r2 = r3.getContext()
            int r4 = r1.widthPixels
            int r2 = com.startapp.f9.b(r2, r4)
            r3.b(r0, r2)
            android.content.Context r2 = r3.getContext()
            int r1 = r1.heightPixels
            int r1 = com.startapp.f9.b(r2, r1)
            r3.a((android.graphics.Point) r0, (int) r1)
        L_0x0163:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.ads.banner.bannerstandard.BannerStandard.r():android.graphics.Point");
    }

    public int s() {
        return 0;
    }

    public void setBannerListener(BannerListener bannerListener) {
        this.A = bannerListener;
    }

    public void showBanner() {
        try {
            ComponentLocator.a(getContext()).t().a(2048);
        } catch (Throwable unused) {
        }
        this.f16457v = true;
        a.a(this.O);
    }

    public final ViewGroup t() {
        View view;
        View rootView;
        ViewGroup viewGroup = this.M;
        if (viewGroup != null) {
            return viewGroup;
        }
        Context context = getContext();
        RelativeLayout relativeLayout = this.E;
        View view2 = null;
        if (!(context instanceof Activity)) {
            view = null;
        } else {
            view = ((Activity) context).getWindow().getDecorView().findViewById(16908290);
        }
        if (!(relativeLayout == null || (rootView = relativeLayout.getRootView()) == null || (view2 = rootView.findViewById(16908290)) != null)) {
            view2 = rootView;
        }
        if (view == null) {
            view = view2;
        }
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return this.E;
    }

    public void u() {
        long j10;
        Context context = getContext();
        AdPreferences.Placement placement = AdPreferences.Placement.INAPP_BANNER;
        String[] strArr = this.f16452q.trackingUrls;
        TrackingParams trackingParams = new TrackingParams(getAdPreferences().getAdTag());
        if (this.f16452q.i() != null) {
            j10 = TimeUnit.SECONDS.toMillis(this.f16452q.i().longValue());
        } else {
            j10 = TimeUnit.SECONDS.toMillis(MetaData.f17070k.s());
        }
        k7 k7Var = new k7(context, placement, strArr, trackingParams, j10);
        this.G = k7Var;
        k7Var.a(this.N);
        a(this.G);
    }

    public final void v() {
        if (this.f16452q != null) {
            Point point = this.f16409f;
            if (point == null) {
                point = r();
            }
            this.f16452q.a(point.x, point.y);
            this.f16452q.setState(Ad.AdState.UN_INITIALIZED);
            this.f16452q.c(s());
            this.f16452q.load(l(), this);
        }
    }

    public BannerStandard(Context context, AdPreferences adPreferences) {
        this(context, true, adPreferences);
    }

    public BannerStandard(Context context, BannerListener bannerListener) {
        this(context, true, (AdPreferences) null);
        setBannerListener(bannerListener);
    }

    public final void b(WebView webView2) {
        b6 b6Var = this.H;
        if (b6Var == null) {
            b6Var = new b6(webView2);
            this.H = b6Var;
        }
        if (b6Var.c()) {
            try {
                RelativeLayout relativeLayout = this.D;
                if (relativeLayout != null) {
                    b6Var.a(relativeLayout, c.OTHER, (String) null);
                }
                CloseableLayout closeableLayout = this.F;
                if (closeableLayout != null) {
                    b6Var.a(closeableLayout, c.CLOSE_AD, (String) null);
                }
            } catch (RuntimeException unused) {
            }
            b6Var.a(webView2);
            b6Var.e();
            b6Var.d();
            b6Var.b();
        }
    }

    public BannerStandard(Context context, AdPreferences adPreferences, BannerListener bannerListener) {
        this(context, true, adPreferences);
        setBannerListener(bannerListener);
    }

    public BannerStandard(Context context, boolean z10) {
        this(context, z10, (AdPreferences) null);
    }

    public BannerStandard(Context context, boolean z10, AdPreferences adPreferences) {
        this(context, z10, adPreferences, (BannerStandardAd) null);
    }

    public BannerStandard(Context context, boolean z10, AdPreferences adPreferences, BannerStandardAd bannerStandardAd) {
        super(context);
        this.f16453r = false;
        this.f16454s = true;
        this.f16455t = false;
        this.f16456u = true;
        this.f16457v = true;
        this.f16458w = new Handler(Looper.getMainLooper());
        this.f16461z = new o0(getWidthInDp(), getHeightInDp());
        this.B = false;
        this.C = null;
        this.D = null;
        this.N = new k7.a() {
            public void onSent(String str) {
                BannerStandard bannerStandard = BannerStandard.this;
                int i10 = BannerStandard.Q;
                Context context = bannerStandard.getContext();
                BannerListener bannerListener = bannerStandard.A;
                n0 n0Var = null;
                d2.a("onImpression", bannerListener != null, str, (String) null);
                if (bannerListener != null) {
                    n0Var = new n0(bannerListener, bannerStandard, context);
                }
                a.a((Runnable) n0Var);
                bannerStandard.f16459x = System.currentTimeMillis() - bannerStandard.f16459x;
                bannerStandard.n();
            }
        };
        this.O = new Runnable() {
            public void run() {
                BannerStandard bannerStandard = BannerStandard.this;
                RelativeLayout relativeLayout = bannerStandard.E;
                if (relativeLayout != null) {
                    relativeLayout.setVisibility(0);
                }
                if (bannerStandard.f16452q != null) {
                    u7 u10 = ComponentLocator.a(bannerStandard.getContext()).u();
                    AdPreferences.Placement placement = AdPreferences.Placement.INAPP_BANNER;
                    int s10 = bannerStandard.s();
                    String adId = bannerStandard.f16452q.getAdId();
                    if (adId != null) {
                        u10.f17374a.put(new u7.a(placement, s10), adId);
                    }
                }
            }
        };
        this.P = new Runnable() {
            public void run() {
                RelativeLayout relativeLayout = BannerStandard.this.E;
                if (relativeLayout != null) {
                    relativeLayout.setVisibility(4);
                }
            }
        };
        try {
            this.f16456u = z10;
            this.f16452q = bannerStandardAd;
            setAdPreferences(adPreferences);
            h();
        } catch (Throwable th) {
            i3.a(th);
        }
    }

    public BannerStandard(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BannerStandard(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f16453r = false;
        this.f16454s = true;
        this.f16455t = false;
        this.f16456u = true;
        this.f16457v = true;
        this.f16458w = new Handler(Looper.getMainLooper());
        this.f16461z = new o0(getWidthInDp(), getHeightInDp());
        this.B = false;
        this.C = null;
        this.D = null;
        this.N = new k7.a() {
            public void onSent(String str) {
                BannerStandard bannerStandard = BannerStandard.this;
                int i10 = BannerStandard.Q;
                Context context = bannerStandard.getContext();
                BannerListener bannerListener = bannerStandard.A;
                n0 n0Var = null;
                d2.a("onImpression", bannerListener != null, str, (String) null);
                if (bannerListener != null) {
                    n0Var = new n0(bannerListener, bannerStandard, context);
                }
                a.a((Runnable) n0Var);
                bannerStandard.f16459x = System.currentTimeMillis() - bannerStandard.f16459x;
                bannerStandard.n();
            }
        };
        this.O = new Runnable() {
            public void run() {
                BannerStandard bannerStandard = BannerStandard.this;
                RelativeLayout relativeLayout = bannerStandard.E;
                if (relativeLayout != null) {
                    relativeLayout.setVisibility(0);
                }
                if (bannerStandard.f16452q != null) {
                    u7 u10 = ComponentLocator.a(bannerStandard.getContext()).u();
                    AdPreferences.Placement placement = AdPreferences.Placement.INAPP_BANNER;
                    int s10 = bannerStandard.s();
                    String adId = bannerStandard.f16452q.getAdId();
                    if (adId != null) {
                        u10.f17374a.put(new u7.a(placement, s10), adId);
                    }
                }
            }
        };
        this.P = new Runnable() {
            public void run() {
                RelativeLayout relativeLayout = BannerStandard.this.E;
                if (relativeLayout != null) {
                    relativeLayout.setVisibility(4);
                }
            }
        };
        try {
            h();
        } catch (Throwable th) {
            i3.a(th);
        }
    }

    public final void a(WebView webView2) {
        webView2.setBackgroundColor(0);
        webView2.setHorizontalScrollBarEnabled(false);
        webView2.getSettings().setJavaScriptEnabled(true);
        webView2.setVerticalScrollBarEnabled(false);
        webView2.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View view, MotionEvent motionEvent) {
                BannerStandard.this.f16454s = true;
                if (motionEvent.getAction() == 2) {
                    return true;
                }
                return false;
            }
        });
        webView2.setOnLongClickListener(new View.OnLongClickListener() {
            public boolean onLongClick(View view) {
                return true;
            }
        });
        webView2.setLongClickable(false);
    }

    public final void a(View view) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(f9.a(getContext(), this.f16461z.f16191a.x), f9.a(getContext(), this.f16461z.f16191a.y));
        layoutParams.addRule(13);
        this.E.addView(view, layoutParams);
    }

    public final void a(Point point, int i10) {
        if (point.y <= 0) {
            point.y = i10;
        }
    }

    public final void a(String str) {
        setErrorMessage(str);
        if (this.A != null && !this.B) {
            this.B = true;
            m0.b(getContext(), this.A, this, (String) null);
        }
    }

    public final boolean a(int i10, int i11) {
        Point r10 = r();
        if (r10.x < i10 || r10.y < i11) {
            Point point = new Point(0, 0);
            ViewGroup.LayoutParams layoutParams = this.webView.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new RelativeLayout.LayoutParams(point.x, point.y);
            } else {
                layoutParams.width = point.x;
                layoutParams.height = point.y;
            }
            this.webView.setLayoutParams(layoutParams);
            return false;
        }
        Point point2 = this.f16461z.f16191a;
        point2.x = i10;
        point2.y = i11;
        int a10 = f9.a(getContext(), this.f16461z.f16191a.x);
        int a11 = f9.a(getContext(), this.f16461z.f16191a.y);
        this.E.setMinimumWidth(a10);
        this.E.setMinimumHeight(a11);
        ViewGroup.LayoutParams layoutParams2 = this.webView.getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams2 = new RelativeLayout.LayoutParams(a10, a11);
        } else {
            layoutParams2.width = a10;
            layoutParams2.height = a11;
        }
        this.webView.setLayoutParams(layoutParams2);
        return true;
    }

    public void a(int i10) {
        this.f16412i = i10;
    }

    public static void a(BannerStandard bannerStandard, boolean z10) {
        if (z10 != (!bannerStandard.F.f16465c.isVisible())) {
            bannerStandard.F.setCloseVisible(!z10);
        }
    }

    public static void a(BannerStandard bannerStandard) {
        MraidState mraidState;
        if (bannerStandard.K.getState() != MraidState.LOADING && bannerStandard.K.getState() != (mraidState = MraidState.HIDDEN)) {
            if (bannerStandard.K.getState() == MraidState.RESIZED || bannerStandard.K.getState() == MraidState.EXPANDED) {
                if (bannerStandard.L != null) {
                    bannerStandard.F.removeView(bannerStandard.twoPartWebView);
                    bannerStandard.J.a();
                    bannerStandard.J = null;
                    bannerStandard.L = null;
                    bannerStandard.twoPartWebView.stopLoading();
                    bannerStandard.twoPartWebView = null;
                } else {
                    bannerStandard.F.removeView(bannerStandard.webView);
                    bannerStandard.a((View) bannerStandard.webView);
                    a.a(bannerStandard.O);
                }
                CloseableLayout closeableLayout = bannerStandard.F;
                if (!(closeableLayout == null || closeableLayout.getParent() == null || !(closeableLayout.getParent() instanceof ViewGroup))) {
                    ((ViewGroup) closeableLayout.getParent()).removeView(closeableLayout);
                }
                bannerStandard.K.setState(MraidState.DEFAULT);
            } else if (bannerStandard.K.getState() == MraidState.DEFAULT) {
                a.a(bannerStandard.P);
                bannerStandard.K.setState(mraidState);
            }
            bannerStandard.n();
        }
    }
}
