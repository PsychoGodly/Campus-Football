package com.startapp.sdk.ads.splash;

import android.app.Activity;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import com.applovin.mediation.MaxReward;
import com.startapp.a0;
import com.startapp.h0;
import com.startapp.i3;
import com.startapp.sdk.ads.splash.SplashConfig;
import com.startapp.sdk.ads.splash.SplashEventHandler;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.adsbase.adlisteners.AdDisplayListener;
import com.startapp.sdk.adsbase.adrules.AdRulesResult;
import com.startapp.sdk.adsbase.cache.CacheKey;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.z7;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: Sta */
public class SplashScreen {

    /* renamed from: a  reason: collision with root package name */
    public Activity f16589a;

    /* renamed from: b  reason: collision with root package name */
    public SplashEventHandler f16590b;

    /* renamed from: c  reason: collision with root package name */
    public SplashConfig f16591c;

    /* renamed from: d  reason: collision with root package name */
    public final AtomicReference<CacheKey> f16592d = new AtomicReference<>();

    /* renamed from: e  reason: collision with root package name */
    public SplashHtml f16593e = null;

    /* renamed from: f  reason: collision with root package name */
    public Handler f16594f = new Handler();

    /* renamed from: g  reason: collision with root package name */
    public boolean f16595g = false;

    /* renamed from: h  reason: collision with root package name */
    public SplashStartAppAd f16596h;

    /* renamed from: i  reason: collision with root package name */
    public AdPreferences f16597i;

    /* renamed from: j  reason: collision with root package name */
    public Runnable f16598j = new a();

    /* renamed from: k  reason: collision with root package name */
    public final Runnable f16599k = new b();

    /* compiled from: Sta */
    public static class SplashStartAppAd extends StartAppAd {
        private static final long serialVersionUID = 1;

        public SplashStartAppAd(Context context) {
            super(context);
            this.placement = AdPreferences.Placement.INAPP_SPLASH;
        }

        public AdRulesResult a(String str, AdPreferences.Placement placement) {
            return new AdRulesResult(true, MaxReward.DEFAULT_LABEL);
        }
    }

    /* compiled from: Sta */
    public class a implements Runnable {
        public a() {
        }

        public void run() {
            boolean z10;
            SplashScreen splashScreen = SplashScreen.this;
            if (splashScreen.f16591c.b(splashScreen.f16589a)) {
                View view = null;
                if (splashScreen.b()) {
                    view = splashScreen.f16591c.a((Context) splashScreen.f16589a);
                } else {
                    SplashHtml splashHtml = splashScreen.f16593e;
                    if (splashHtml != null) {
                        view = splashHtml.b();
                    }
                }
                if (view != null) {
                    splashScreen.f16589a.setContentView(view, new ViewGroup.LayoutParams(-1, -1));
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    SplashScreen splashScreen2 = SplashScreen.this;
                    Context a10 = h0.a(splashScreen2.f16589a);
                    if (a10 == null) {
                        a10 = splashScreen2.f16589a;
                    }
                    SplashStartAppAd splashStartAppAd = new SplashStartAppAd(a10);
                    splashScreen2.f16596h = splashStartAppAd;
                    splashStartAppAd.loadSplash(splashScreen2.f16597i, new c(splashScreen2));
                    SplashScreen splashScreen3 = SplashScreen.this;
                    splashScreen3.f16594f.postDelayed(new d(splashScreen3), splashScreen3.f16591c.a().longValue());
                    splashScreen3.f16594f.postDelayed(new e(splashScreen3), splashScreen3.f16591c.getMinSplashTime().getIndex());
                    return;
                }
                SplashScreen.this.f16589a.finish();
                return;
            }
            throw new IllegalArgumentException(splashScreen.f16591c.getErrorMessage());
        }
    }

    /* compiled from: Sta */
    public class b implements Runnable {

        /* compiled from: Sta */
        public class a implements z7 {

            /* renamed from: com.startapp.sdk.ads.splash.SplashScreen$b$a$a  reason: collision with other inner class name */
            /* compiled from: Sta */
            public class C0167a implements AdDisplayListener {
                public C0167a() {
                }

                public void adClicked(Ad ad2) {
                    SplashScreen.this.f16590b.f16572f = true;
                }

                public void adDisplayed(Ad ad2) {
                    SplashScreen.this.f16590b.f16575i = SplashEventHandler.SplashState.DISPLAYED;
                }

                public void adHidden(Ad ad2) {
                    SplashEventHandler splashEventHandler = SplashScreen.this.f16590b;
                    splashEventHandler.f16575i = SplashEventHandler.SplashState.HIDDEN;
                    splashEventHandler.b();
                }

                public void adNotDisplayed(Ad ad2) {
                }
            }

            public a() {
            }

            public void a() {
                SplashStartAppAd splashStartAppAd;
                SplashScreen splashScreen = SplashScreen.this;
                if (!splashScreen.f16595g && (splashStartAppAd = splashScreen.f16596h) != null) {
                    splashStartAppAd.showAd((AdDisplayListener) new C0167a());
                    SplashScreen splashScreen2 = SplashScreen.this;
                    if (splashScreen2.f16591c.getMaxAdDisplayTime() != SplashConfig.MaxAdDisplayTime.FOR_EVER) {
                        splashScreen2.f16594f.postDelayed(new f(splashScreen2), splashScreen2.f16591c.getMaxAdDisplayTime().getIndex());
                    }
                    SplashScreen.this.f16589a.finish();
                }
            }
        }

        public b() {
        }

        public void run() {
            SplashScreen splashScreen = SplashScreen.this;
            SplashEventHandler splashEventHandler = splashScreen.f16590b;
            SplashHtml splashHtml = splashScreen.f16593e;
            a aVar = new a();
            splashEventHandler.getClass();
            if (splashHtml == null) {
                aVar.a();
                return;
            }
            splashHtml.callback = aVar;
            splashHtml.a();
        }
    }

    /* compiled from: Sta */
    public static /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f16604a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.startapp.sdk.ads.splash.SplashConfig$Orientation[] r0 = com.startapp.sdk.ads.splash.SplashConfig.Orientation.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f16604a = r0
                com.startapp.sdk.ads.splash.SplashConfig$Orientation r1 = com.startapp.sdk.ads.splash.SplashConfig.Orientation.PORTRAIT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f16604a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.startapp.sdk.ads.splash.SplashConfig$Orientation r1 = com.startapp.sdk.ads.splash.SplashConfig.Orientation.LANDSCAPE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.ads.splash.SplashScreen.c.<clinit>():void");
        }
    }

    public SplashScreen(Activity activity, SplashConfig splashConfig, AdPreferences adPreferences) {
        this.f16589a = activity;
        this.f16591c = splashConfig;
        this.f16597i = adPreferences;
        try {
            a();
            this.f16590b = new SplashEventHandler(activity, this.f16593e);
        } catch (Throwable th) {
            SplashEventHandler splashEventHandler = new SplashEventHandler(activity);
            this.f16590b = splashEventHandler;
            splashEventHandler.d();
            this.f16590b.a();
            i3.a(th);
        }
    }

    public final void a() {
        SplashConfig splashConfig = this.f16591c;
        Activity activity = this.f16589a;
        if (splashConfig.getLogo() == null && splashConfig.getLogoRes() == -1 && splashConfig.getLogoByteArray() != null) {
            byte[] logoByteArray = splashConfig.getLogoByteArray();
            splashConfig.f16565a = new BitmapDrawable(activity.getResources(), BitmapFactory.decodeByteArray(logoByteArray, 0, logoByteArray.length));
        }
        if (!b()) {
            this.f16593e = this.f16591c.a(this.f16589a);
        }
    }

    public final boolean b() {
        return !this.f16591c.isHtmlSplash() || this.f16591c.b();
    }

    public final boolean c() {
        int i10 = this.f16589a.getResources().getConfiguration().orientation;
        if (this.f16591c.getOrientation() == SplashConfig.Orientation.AUTO) {
            if (i10 == 2) {
                this.f16591c.setOrientation(SplashConfig.Orientation.LANDSCAPE);
            } else {
                this.f16591c.setOrientation(SplashConfig.Orientation.PORTRAIT);
            }
        }
        int i11 = c.f16604a[this.f16591c.getOrientation().ordinal()];
        boolean z10 = false;
        boolean z11 = true;
        if (i11 == 1) {
            if (i10 == 2) {
                z10 = true;
            }
            Activity activity = this.f16589a;
            int i12 = a0.f15596a;
            if (Build.VERSION.SDK_INT >= 9) {
                try {
                    activity.setRequestedOrientation(7);
                    return z10;
                } catch (Throwable unused) {
                    return z10;
                }
            } else {
                activity.setRequestedOrientation(1);
                return z10;
            }
        } else if (i11 != 2) {
            return false;
        } else {
            if (i10 != 1) {
                z11 = false;
            }
            Activity activity2 = this.f16589a;
            int i13 = a0.f15596a;
            if (Build.VERSION.SDK_INT >= 9) {
                try {
                    activity2.setRequestedOrientation(6);
                } catch (Throwable unused2) {
                }
            } else {
                activity2.setRequestedOrientation(0);
            }
            return z11;
        }
    }
}
