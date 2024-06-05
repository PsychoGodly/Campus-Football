package com.startapp.sdk.ads.banner;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Point;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.View;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Keep;
import com.startapp.a0;
import com.startapp.e;
import com.startapp.f;
import com.startapp.f9;
import com.startapp.k7;
import com.startapp.l0;
import com.startapp.ra;
import com.startapp.sdk.adsbase.adrules.AdRulesResult;
import com.startapp.sdk.adsbase.adrules.AdaptMetaData;
import com.startapp.sdk.adsbase.cache.CacheMetaData;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.components.ComponentLocator;
import com.unity3d.services.UnityAdsConstants;
import java.util.Random;

/* compiled from: Sta */
public abstract class BannerBase extends RelativeLayout {

    /* renamed from: a  reason: collision with root package name */
    public boolean f16404a;

    /* renamed from: b  reason: collision with root package name */
    public AdPreferences f16405b;

    /* renamed from: c  reason: collision with root package name */
    public AdRulesResult f16406c;

    /* renamed from: d  reason: collision with root package name */
    public int f16407d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f16408e;

    /* renamed from: f  reason: collision with root package name */
    public Point f16409f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f16410g;

    /* renamed from: h  reason: collision with root package name */
    public int f16411h;

    /* renamed from: i  reason: collision with root package name */
    public int f16412i;

    /* renamed from: j  reason: collision with root package name */
    public ra f16413j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f16414k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f16415l;

    /* renamed from: m  reason: collision with root package name */
    public String f16416m;

    /* renamed from: n  reason: collision with root package name */
    public final Runnable f16417n;

    /* renamed from: o  reason: collision with root package name */
    public final Handler f16418o;

    /* renamed from: p  reason: collision with root package name */
    public final Object f16419p;

    /* compiled from: Sta */
    public class a implements Runnable {
        public a() {
        }

        public void run() {
            AdRulesResult adRulesResult;
            if (BannerBase.this.isShown() || ((adRulesResult = BannerBase.this.f16406c) != null && !adRulesResult.b())) {
                BannerBase.this.j();
            }
        }
    }

    /* compiled from: Sta */
    public class b implements Handler.Callback {
        public b() {
        }

        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 1 || i10 == 2) {
                BannerBase bannerBase = BannerBase.this;
                bannerBase.n();
                bannerBase.j();
            }
            return true;
        }
    }

    public BannerBase(Context context) {
        super(context);
        this.f16404a = false;
        this.f16407d = 0;
        this.f16408e = true;
        this.f16410g = false;
        int nextInt = new Random().nextInt(100000) + 159868227;
        this.f16411h = nextInt;
        this.f16412i = nextInt + 1;
        this.f16414k = false;
        this.f16415l = false;
        this.f16417n = new a();
        this.f16418o = new Handler(Looper.getMainLooper(), new b());
        this.f16419p = new Object();
        try {
            ComponentLocator.a(context).t().a(512);
        } catch (Throwable unused) {
        }
    }

    public abstract void a(int i10);

    public void a(k7 k7Var) {
        if (this.f16413j == null) {
            ra raVar = new ra(g(), k7Var, BannerMetaData.f16423b.a());
            this.f16413j = raVar;
            if (raVar.b()) {
                raVar.run();
            }
        }
    }

    public void b() {
        if (!isInEditMode()) {
            removeCallbacks(this.f16417n);
            synchronized (this.f16419p) {
                this.f16418o.removeMessages(2);
            }
        }
    }

    public int c() {
        return f();
    }

    public abstract int d();

    public abstract String e();

    public abstract int f();

    public View g() {
        return this;
    }

    public AdPreferences getAdPreferences() {
        AdPreferences adPreferences = this.f16405b;
        if (adPreferences != null) {
            return adPreferences;
        }
        AdPreferences adPreferences2 = new AdPreferences();
        this.f16405b = adPreferences2;
        return adPreferences2;
    }

    public abstract String getBidToken();

    public String getErrorMessage() {
        return this.f16416m;
    }

    @Keep
    public abstract int getHeightInDp();

    @Keep
    public abstract int getWidthInDp();

    public void h() {
        if (!isInEditMode()) {
            i();
            return;
        }
        setMinimumWidth(f9.a(getContext(), getWidthInDp()));
        setMinimumHeight(f9.a(getContext(), getHeightInDp()));
        setBackgroundColor(Color.rgb(169, 169, 169));
        TextView textView = new TextView(getContext());
        textView.setText(e());
        textView.setTextColor(-16777216);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        addView(textView, layoutParams);
    }

    public abstract void hideBanner();

    public abstract void i();

    public boolean isClicked() {
        return this.f16414k;
    }

    public boolean isFirstLoad() {
        return this.f16408e;
    }

    public void j() {
        ra raVar = this.f16413j;
        if (raVar != null) {
            raVar.a();
            this.f16413j = null;
        }
        if (this.f16406c == null || AdaptMetaData.f16908a.a().a()) {
            AdRulesResult a10 = AdaptMetaData.f16908a.a().a(AdPreferences.Placement.INAPP_BANNER, getAdPreferences().getAdTag());
            this.f16406c = a10;
            if (a10.b()) {
                m();
            } else {
                hideBanner();
            }
        } else if (this.f16406c.b()) {
            m();
        }
    }

    public void k() {
        synchronized (this.f16419p) {
            if (!this.f16418o.hasMessages(1)) {
                this.f16418o.sendEmptyMessage(1);
            }
        }
    }

    public AdPreferences l() {
        AdPreferences adPreferences = getAdPreferences();
        boolean z10 = false;
        if (adPreferences.getPlacementId() == null) {
            String str = null;
            if (Build.VERSION.SDK_INT >= 9) {
                StringBuilder sb2 = null;
                String str2 = null;
                for (ViewParent viewParent = this; viewParent instanceof View; viewParent = ((View) viewParent).getParent()) {
                    if (str2 == null) {
                        str2 = com.startapp.sdk.adsbase.a.a(((View) viewParent).getContext());
                    }
                    try {
                        String resourceEntryName = ((View) viewParent).getResources().getResourceEntryName(((View) viewParent).getId());
                        if (sb2 == null) {
                            sb2 = new StringBuilder();
                        } else {
                            sb2.insert(0, UnityAdsConstants.DefaultUrls.AD_ASSET_PATH);
                        }
                        sb2.insert(0, resourceEntryName);
                    } catch (Resources.NotFoundException unused) {
                    }
                }
                if (sb2 != null) {
                    str = sb2.toString();
                }
                Pair pair = new Pair(str2, str);
                str = com.startapp.sdk.adsbase.a.a(getContext().getPackageName(), getClass().getName(), (String) pair.first, (String) pair.second);
            }
            adPreferences.setPlacementId(str);
        }
        boolean z11 = this.f16404a;
        int i10 = a0.f15596a;
        if (Build.VERSION.SDK_INT >= 11 && 1 != getLayerType() && z11) {
            z10 = isHardwareAccelerated();
        }
        adPreferences.setHardwareAccelerated(z10);
        return adPreferences;
    }

    public void loadAd(int i10, int i11) {
        if (getParent() == null) {
            try {
                ComponentLocator.a(getContext()).t().a(1024);
            } catch (Throwable unused) {
            }
            this.f16409f = new Point(i10, i11);
            k();
        }
    }

    public abstract void m();

    public void n() {
        if (this.f16404a && !isInEditMode() && CacheMetaData.d()) {
            removeCallbacks(this.f16417n);
            postDelayed(this.f16417n, (long) c());
            long C = (long) (MetaData.f17070k.C() * 1000);
            synchronized (this.f16419p) {
                this.f16418o.removeMessages(2);
                this.f16418o.sendEmptyMessageDelayed(2, C);
            }
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        try {
            ComponentLocator.a(getContext()).t().a(4096);
        } catch (Throwable unused) {
        }
        this.f16404a = true;
        n();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f16404a = false;
        b();
        ra raVar = this.f16413j;
        if (raVar != null) {
            raVar.a();
            this.f16413j = null;
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        a(bundle.getInt("bannerId"));
        this.f16406c = (AdRulesResult) bundle.getSerializable("adRulesResult");
        this.f16405b = (AdPreferences) bundle.getSerializable("adPreferences");
        this.f16407d = bundle.getInt("offset");
        this.f16408e = bundle.getBoolean("firstLoad");
        this.f16415l = bundle.getBoolean("shouldReloadBanner");
        super.onRestoreInstanceState(bundle.getParcelable("upperState"));
    }

    public Parcelable onSaveInstanceState() {
        if (isClicked()) {
            setClicked(false);
            this.f16415l = true;
        }
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        Bundle bundle = new Bundle();
        bundle.putInt("bannerId", d());
        bundle.putParcelable("upperState", onSaveInstanceState);
        bundle.putSerializable("adRulesResult", this.f16406c);
        bundle.putSerializable("adPreferences", this.f16405b);
        bundle.putInt("offset", this.f16407d);
        bundle.putBoolean("firstLoad", this.f16408e);
        bundle.putBoolean("shouldReloadBanner", this.f16415l);
        return bundle;
    }

    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        if (z10) {
            if (this.f16415l) {
                this.f16415l = false;
                j();
            }
            this.f16404a = true;
            n();
            return;
        }
        this.f16404a = false;
        b();
    }

    public void setAdPreferences(AdPreferences adPreferences) {
        this.f16405b = adPreferences != null ? new AdPreferences(adPreferences) : null;
    }

    public void setAdTag(String str) {
        getAdPreferences().setAdTag(str);
    }

    public void setClicked(boolean z10) {
        this.f16414k = z10;
    }

    public void setErrorMessage(String str) {
        this.f16416m = str;
    }

    public void setFirstLoad(boolean z10) {
        this.f16408e = z10;
    }

    public final void a(Context context, AttributeSet attributeSet) {
        setAdTag(new l0(context, attributeSet).f16077b);
    }

    public void loadAd() {
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        loadAd(f9.b(getContext(), displayMetrics.widthPixels), f9.b(getContext(), displayMetrics.heightPixels));
    }

    public void a() {
        if (isFirstLoad() || AdaptMetaData.f16908a.a().a()) {
            setFirstLoad(false);
            f.f15802d.a(new e(AdPreferences.Placement.INAPP_BANNER, getAdPreferences().getAdTag()));
        }
    }

    public BannerBase(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BannerBase(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f16404a = false;
        this.f16407d = 0;
        this.f16408e = true;
        this.f16410g = false;
        int nextInt = new Random().nextInt(100000) + 159868227;
        this.f16411h = nextInt;
        this.f16412i = nextInt + 1;
        this.f16414k = false;
        this.f16415l = false;
        this.f16417n = new a();
        this.f16418o = new Handler(Looper.getMainLooper(), new b());
        this.f16419p = new Object();
        a(context, attributeSet);
    }
}
