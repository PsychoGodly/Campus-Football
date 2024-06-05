package com.applovin.impl;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import android.widget.FrameLayout;
import com.applovin.creative.MaxCreativeDebuggerActivity;
import com.applovin.creative.MaxCreativeDebuggerDisplayedAdActivity;
import com.applovin.impl.q6;
import com.applovin.impl.r;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.ActionBroadcastReceiver;
import com.unity3d.ads.core.domain.InitializeAndroidBoldSDK;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public class w4 implements q6.a {
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public static WeakReference f12948m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public static final AtomicBoolean f12949n = new AtomicBoolean();
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final k f12950a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f12951b;

    /* renamed from: c  reason: collision with root package name */
    private final List f12952c = new ArrayList(10);

    /* renamed from: d  reason: collision with root package name */
    private final Object f12953d = new Object();
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final v4 f12954e;

    /* renamed from: f  reason: collision with root package name */
    private WeakReference f12955f = new WeakReference((Object) null);

    /* renamed from: g  reason: collision with root package name */
    private q6 f12956g;

    /* renamed from: h  reason: collision with root package name */
    private ho f12957h;

    /* renamed from: i  reason: collision with root package name */
    private int f12958i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f12959j;

    /* renamed from: k  reason: collision with root package name */
    private long f12960k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f12961l;

    class a extends p {
        a() {
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (activity instanceof MaxCreativeDebuggerActivity) {
                t.g("AppLovinSdk", "Started Creative Debugger");
                if (!w4.this.h() || w4.f12948m.get() != activity) {
                    MaxCreativeDebuggerActivity maxCreativeDebuggerActivity = (MaxCreativeDebuggerActivity) activity;
                    WeakReference unused = w4.f12948m = new WeakReference(maxCreativeDebuggerActivity);
                    maxCreativeDebuggerActivity.a(w4.this.f12954e, w4.this.f12950a.e());
                }
                w4.f12949n.set(false);
            }
        }

        public void onActivityDestroyed(Activity activity) {
            if (activity instanceof MaxCreativeDebuggerActivity) {
                t.g("AppLovinSdk", "Creative Debugger destroyed");
                WeakReference unused = w4.f12948m = null;
            }
        }
    }

    class b implements r.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object f12963a;

        b(Object obj) {
            this.f12963a = obj;
        }

        public void a(MaxCreativeDebuggerDisplayedAdActivity maxCreativeDebuggerDisplayedAdActivity) {
            maxCreativeDebuggerDisplayedAdActivity.a(new u6(this.f12963a, w4.this.f12950a.E().b()), w4.this.f12950a);
            w4.f12949n.set(false);
        }
    }

    public w4(k kVar) {
        this.f12950a = kVar;
        Context k10 = k.k();
        this.f12951b = k10;
        this.f12954e = new v4(k10);
    }

    /* access modifiers changed from: private */
    public void e() {
        if (g() && this.f12955f.get() == null && !h()) {
            Activity b10 = this.f12950a.e().b();
            if (b10 == null) {
                this.f12950a.L();
                if (t.a()) {
                    this.f12950a.L().b("AppLovinSdk", "Failed to display Creative Debugger button");
                    return;
                }
                return;
            }
            View findViewById = b10.findViewById(16908290);
            if (findViewById instanceof FrameLayout) {
                FrameLayout frameLayout = (FrameLayout) findViewById;
                View a10 = a(frameLayout, b10);
                frameLayout.addView(a10);
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setDuration(150);
                a10.startAnimation(alphaAnimation);
                ViewTreeObserver viewTreeObserver = findViewById.getViewTreeObserver();
                v60 v60 = new v60(this, a10, frameLayout);
                viewTreeObserver.addOnGlobalLayoutListener(v60);
                AppLovinSdkUtils.runOnUiThreadDelayed(new z60(this, a10, frameLayout, viewTreeObserver, v60), TimeUnit.SECONDS.toMillis(5));
                this.f12955f = new WeakReference(a10);
            }
        }
    }

    private Drawable f() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(Color.rgb(5, 131, 170));
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(1);
        gradientDrawable2.setColor(Color.rgb(2, 98, 127));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842919}, gradientDrawable2);
        stateListDrawable.addState(new int[0], gradientDrawable);
        return stateListDrawable;
    }

    /* access modifiers changed from: private */
    public boolean h() {
        WeakReference weakReference = f12948m;
        return (weakReference == null || weakReference.get() == null) ? false : true;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void i() {
        long seconds = TimeUnit.MILLISECONDS.toSeconds(SystemClock.elapsedRealtime() - this.f12960k);
        if (this.f12960k != 0 && seconds >= 10) {
            this.f12950a.B().a(o.b.GENERIC, "showingMediationDebuggerFromHoldingCreativeDebuggerButton");
            this.f12950a.X0();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void j() {
        this.f12958i = 0;
    }

    private void m() {
        this.f12950a.e().a(new a());
    }

    public void d(Object obj) {
        if (!g() || obj == null) {
            return;
        }
        if (ve.b(obj) && !c(obj)) {
            return;
        }
        if (!ve.a(obj) || !c(obj)) {
            synchronized (this.f12953d) {
                this.f12952c.add(0, new u6(obj, System.currentTimeMillis()));
                if (this.f12952c.size() > 10) {
                    List list = this.f12952c;
                    list.remove(list.size() - 1);
                }
            }
        }
    }

    public boolean g() {
        return ((Boolean) this.f12950a.a(oj.D1)).booleanValue() && this.f12950a.g0().isCreativeDebuggerEnabled();
    }

    public void k() {
        q6 q6Var = this.f12956g;
        if (q6Var != null) {
            q6Var.b();
        }
    }

    public void l() {
        if (g()) {
            this.f12959j = ((Boolean) this.f12950a.a(oj.E1)).booleanValue();
            if (this.f12956g == null) {
                this.f12956g = new q6(this.f12950a, this);
            }
            this.f12956g.a();
        }
    }

    public void n() {
        ArrayList arrayList;
        if (h() || !f12949n.compareAndSet(false, true)) {
            t.h("AppLovinSdk", "Creative Debugger is already showing");
            return;
        }
        Object a10 = this.f12950a.E().a();
        if (a10 != null) {
            e(a10);
            return;
        }
        synchronized (this.f12953d) {
            arrayList = new ArrayList(this.f12952c);
        }
        this.f12954e.a(arrayList, this.f12950a);
        if (!this.f12961l) {
            m();
            this.f12961l = true;
        }
        t.g("AppLovinSdk", "Starting Creative Debugger...");
        r.a(this.f12951b, MaxCreativeDebuggerActivity.class);
    }

    private boolean c(Object obj) {
        MaxAdFormat maxAdFormat;
        if (obj instanceof com.applovin.impl.sdk.ad.b) {
            maxAdFormat = ((com.applovin.impl.sdk.ad.b) obj).getAdZone().d();
        } else {
            maxAdFormat = obj instanceof be ? ((be) obj).getFormat() : null;
        }
        return maxAdFormat != null && maxAdFormat.isFullscreenAd();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0020, code lost:
        r3 = new com.applovin.impl.w(r0, r2.f12950a).a();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String b(java.lang.Object r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof com.applovin.impl.sdk.ad.b
            if (r0 == 0) goto L_0x000f
            com.applovin.impl.sdk.ad.b r3 = (com.applovin.impl.sdk.ad.b) r3
            org.json.JSONObject r3 = r3.getOriginalFullResponse()
            java.lang.String r3 = r3.toString()
            return r3
        L_0x000f:
            boolean r0 = r3 instanceof com.applovin.impl.be
            if (r0 == 0) goto L_0x0033
            r0 = r3
            com.applovin.impl.be r0 = (com.applovin.impl.be) r0
            java.lang.String r0 = r0.C()
            boolean r3 = com.applovin.impl.ve.a((java.lang.Object) r3)
            if (r3 == 0) goto L_0x0032
            com.applovin.impl.w r3 = new com.applovin.impl.w
            com.applovin.impl.sdk.k r1 = r2.f12950a
            r3.<init>(r0, r1)
            org.json.JSONObject r3 = r3.a()
            if (r3 == 0) goto L_0x0032
            java.lang.String r3 = r3.toString()
            return r3
        L_0x0032:
            return r0
        L_0x0033:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.w4.b(java.lang.Object):java.lang.String");
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [android.widget.ImageButton, android.widget.ImageView, android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.view.View a(android.widget.FrameLayout r6, android.app.Activity r7) {
        /*
            r5 = this;
            r0 = 40
            int r0 = com.applovin.sdk.AppLovinSdkUtils.dpToPx(r7, r0)
            int r1 = r0 / 10
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r3 = 8388629(0x800015, float:1.1754973E-38)
            r2.<init>(r0, r0, r3)
            r2.setMargins(r1, r1, r1, r1)
            android.widget.ImageButton r0 = new android.widget.ImageButton     // Catch:{ all -> 0x0030 }
            r0.<init>(r7)     // Catch:{ all -> 0x0030 }
            android.content.res.Resources r3 = r7.getResources()     // Catch:{ all -> 0x0030 }
            int r4 = com.applovin.sdk.R.drawable.applovin_ic_white_small     // Catch:{ all -> 0x0030 }
            android.graphics.drawable.Drawable r3 = r3.getDrawable(r4)     // Catch:{ all -> 0x0030 }
            r0.setImageDrawable(r3)     // Catch:{ all -> 0x0030 }
            android.widget.ImageView$ScaleType r3 = android.widget.ImageView.ScaleType.FIT_CENTER     // Catch:{ all -> 0x0030 }
            r0.setScaleType(r3)     // Catch:{ all -> 0x0030 }
            int r3 = r1 * 2
            r0.setPadding(r1, r1, r1, r3)     // Catch:{ all -> 0x0030 }
            goto L_0x004b
        L_0x0030:
            android.widget.Button r0 = new android.widget.Button
            r0.<init>(r7)
            java.lang.String r1 = "ⓘ"
            r0.setText(r1)
            r1 = -1
            r0.setTextColor(r1)
            r1 = 0
            r0.setAllCaps(r1)
            r3 = 1101004800(0x41a00000, float:20.0)
            r4 = 2
            r0.setTextSize(r4, r3)
            r0.setPadding(r1, r1, r1, r1)
        L_0x004b:
            r0.setLayoutParams(r2)
            android.graphics.drawable.Drawable r1 = r5.f()
            r0.setBackground(r1)
            boolean r1 = r5.f12959j
            if (r1 == 0) goto L_0x0062
            com.applovin.impl.u60 r1 = new com.applovin.impl.u60
            r1.<init>(r5, r6)
            r0.setOnTouchListener(r1)
            goto L_0x006a
        L_0x0062:
            com.applovin.impl.t60 r6 = new com.applovin.impl.t60
            r6.<init>(r5)
            r0.setOnClickListener(r6)
        L_0x006a:
            boolean r6 = com.applovin.impl.x3.f()
            if (r6 == 0) goto L_0x0079
            r6 = 5
            int r6 = com.applovin.sdk.AppLovinSdkUtils.dpToPx(r7, r6)
            float r6 = (float) r6
            r0.setElevation(r6)
        L_0x0079:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.w4.a(android.widget.FrameLayout, android.app.Activity):android.view.View");
    }

    public void b() {
        if (this.f12958i == 0) {
            this.f12957h = ho.a(TimeUnit.SECONDS.toMillis(3), this.f12950a, new w60(this));
        }
        int i10 = this.f12958i;
        if (i10 % 2 == 0) {
            this.f12958i = i10 + 1;
        }
    }

    private void b(View view, FrameLayout frameLayout) {
        if (this.f12959j) {
            view.setOnTouchListener((View.OnTouchListener) null);
            this.f12960k = 0;
        }
        frameLayout.removeView(view);
        this.f12955f = new WeakReference((Object) null);
    }

    private void e(Object obj) {
        t.g("AppLovinSdk", "Starting Creative Debugger for current fullscreen ad...");
        r.a(this.f12951b, MaxCreativeDebuggerDisplayedAdActivity.class, this.f12950a.e(), new b(obj));
    }

    public void a(u6 u6Var, Context context, boolean z10) {
        Object a10 = u6Var.a();
        String a11 = a(u6Var);
        lc lcVar = new lc();
        if (z10) {
            lcVar.b("Please describe the issue you had with this ad:\n\n\n\n");
        }
        lcVar.b(a11);
        String b10 = this.f12950a.v().b(a10);
        if (b10 != null) {
            lcVar.a("\nBid Response:\n");
            lcVar.a(b10);
        }
        String str = "AppLovin Ad Report";
        Intent createChooser = Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra(ActionBroadcastReceiver.KEY_URL_TITLE, a10 instanceof com.applovin.impl.sdk.ad.b ? str : "MAX Ad Report").putExtra("android.intent.extra.TEXT", lcVar.toString()).setPackage((String) null), "Share Ad Report");
        if (z10) {
            try {
                Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("mailto:"));
                if (!(a10 instanceof com.applovin.impl.sdk.ad.b)) {
                    str = "MAX Ad Report";
                }
                context.startActivity(intent.putExtra(ActionBroadcastReceiver.KEY_URL_TITLE, str).putExtra("android.intent.extra.TEXT", lcVar.toString()).setPackage("com.google.android.gm"));
            } catch (ActivityNotFoundException unused) {
                context.startActivity(createChooser);
            }
        } else {
            context.startActivity(createChooser);
        }
    }

    public String a(u6 u6Var) {
        String str;
        Object a10 = u6Var.a();
        lc lcVar = new lc();
        lcVar.b("Ad Info:\n");
        if (a10 instanceof com.applovin.impl.sdk.ad.b) {
            com.applovin.impl.sdk.ad.b bVar = (com.applovin.impl.sdk.ad.b) a10;
            lcVar.a(InitializeAndroidBoldSDK.MSG_NETWORK, "APPLOVIN").a(bVar).b(bVar);
        } else if (a10 instanceof be) {
            lcVar.a((be) a10);
        }
        lcVar.a(this.f12950a);
        lcVar.a("Epoch Timestamp (ms)", Long.valueOf(u6Var.b()));
        if (this.f12950a.y() != null) {
            str = this.f12950a.z().u();
        } else {
            str = this.f12950a.x().v();
        }
        lcVar.a("\nDebug Info:\n").a("Platform", "fireos".equals(str) ? "Fire OS" : "Android").a("AppLovin SDK Version", AppLovinSdk.VERSION).a("Plugin Version", this.f12950a.a(oj.U3)).a("App Package Name", this.f12951b.getPackageName()).a("Device", String.format("%s %s (%s)", new Object[]{Build.BRAND, Build.MODEL, Build.DEVICE})).a("OS Version", Build.VERSION.RELEASE).a("AppLovin Random Token", this.f12950a.c0()).a("Ad Review Version", v.b()).a(a(a10)).a("User ID", this.f12950a.t0().c() != null ? this.f12950a.t0().c() : "None").a("AEI", this.f12950a.a(oj.f10455z)).a("MEI", this.f12950a.a(oj.A)).a("MD", this.f12950a.a(oj.B));
        return lcVar.toString();
    }

    private Bundle a(Object obj) {
        this.f12950a.L();
        if (t.a()) {
            t L = this.f12950a.L();
            L.a("CreativeDebuggerService", "Retrieving Ad Review info for ad: " + obj);
        }
        String a10 = zp.a(obj);
        Bundle a11 = this.f12950a.h().a(a10);
        this.f12950a.L();
        if (t.a()) {
            t L2 = this.f12950a.L();
            L2.a("CreativeDebuggerService", "Serve id: " + a10);
        }
        this.f12950a.L();
        if (t.a()) {
            t L3 = this.f12950a.L();
            L3.a("CreativeDebuggerService", "Public data: " + a11);
        }
        if (a11 == null) {
            return null;
        }
        for (String str : a11.keySet()) {
            Object obj2 = a11.get(str);
            a11.remove(str);
            BundleUtils.put(StringUtils.toHumanReadableString(str), obj2, a11);
        }
        return a11;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view, FrameLayout frameLayout) {
        if (view.getParent() == null && this.f12955f.get() != null) {
            frameLayout.addView(view);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view, FrameLayout frameLayout, ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (this.f12960k <= 0 || !this.f12959j) {
            b(view, frameLayout);
        } else {
            view.setVisibility(4);
        }
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ boolean a(FrameLayout frameLayout, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f12960k = SystemClock.elapsedRealtime();
            AppLovinSdkUtils.runOnUiThreadDelayed(new x60(this), TimeUnit.SECONDS.toMillis(10));
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (view.getVisibility() == 0) {
                this.f12960k = 0;
                n();
            } else {
                b(view, frameLayout);
            }
        }
        return true;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        n();
    }

    public void a() {
        int i10 = this.f12958i;
        if (i10 % 2 == 1) {
            this.f12958i = i10 + 1;
        }
        if (this.f12958i / 2 == 2) {
            AppLovinSdkUtils.runOnUiThread(new y60(this));
            this.f12958i = 0;
            this.f12957h.a();
        }
    }
}
