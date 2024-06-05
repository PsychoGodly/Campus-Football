package com.startapp.sdk.ads.interstitials;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import com.startapp.a0;
import com.startapp.j9;
import com.startapp.k2;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.a;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.components.ComponentLocator;
import com.startapp.u7;
import com.unity3d.services.ads.adunit.AdUnitActivity;
import java.io.Serializable;
import java.util.Map;

/* compiled from: Sta */
public class OverlayActivity extends Activity {

    /* renamed from: a  reason: collision with root package name */
    public k2 f16486a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f16487b;

    /* renamed from: c  reason: collision with root package name */
    public int f16488c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f16489d;

    /* renamed from: e  reason: collision with root package name */
    public Bundle f16490e;

    /* renamed from: f  reason: collision with root package name */
    public int f16491f = -1;

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r8 = this;
            android.content.Intent r0 = r8.getIntent()
            java.lang.String r1 = "placement"
            r2 = 0
            int r0 = r0.getIntExtra(r1, r2)
            android.content.Intent r1 = r8.getIntent()
            com.startapp.sdk.adsbase.model.AdPreferences$Placement r0 = com.startapp.sdk.adsbase.model.AdPreferences.Placement.a(r0)
            int r3 = r0.ordinal()
            if (r3 == 0) goto L_0x0063
            r4 = 2
            if (r3 == r4) goto L_0x005b
            r4 = 3
            if (r3 == r4) goto L_0x0053
            r4 = 4
            if (r3 == r4) goto L_0x002f
            r4 = 7
            if (r3 == r4) goto L_0x002f
            r4 = 8
            if (r3 == r4) goto L_0x0063
            com.startapp.d4 r3 = new com.startapp.d4
            r3.<init>()
            goto L_0x0078
        L_0x002f:
            java.util.Map<android.app.Activity, java.lang.Integer> r3 = com.startapp.j9.f15982a
            java.lang.String r3 = "videoAd"
            boolean r3 = r1.getBooleanExtra(r3, r2)
            if (r3 == 0) goto L_0x003f
            com.startapp.sdk.ads.video.VideoMode r3 = new com.startapp.sdk.ads.video.VideoMode
            r3.<init>()
            goto L_0x0078
        L_0x003f:
            java.lang.String r3 = "mraidAd"
            boolean r3 = r1.getBooleanExtra(r3, r2)
            if (r3 == 0) goto L_0x004d
            com.startapp.h5 r3 = new com.startapp.h5
            r3.<init>()
            goto L_0x0078
        L_0x004d:
            com.startapp.h6 r3 = new com.startapp.h6
            r3.<init>()
            goto L_0x0078
        L_0x0053:
            java.util.Map<android.app.Activity, java.lang.Integer> r3 = com.startapp.j9.f15982a
            com.startapp.sdk.ads.splash.b r3 = new com.startapp.sdk.ads.splash.b
            r3.<init>()
            goto L_0x0078
        L_0x005b:
            java.util.Map<android.app.Activity, java.lang.Integer> r3 = com.startapp.j9.f15982a
            com.startapp.d6 r3 = new com.startapp.d6
            r3.<init>()
            goto L_0x0078
        L_0x0063:
            java.util.Map<android.app.Activity, java.lang.Integer> r3 = com.startapp.j9.f15982a
            android.net.Uri r3 = r1.getData()
            if (r3 != 0) goto L_0x006e
            r0 = 0
            goto L_0x015a
        L_0x006e:
            java.lang.String r3 = r3.toString()
            com.startapp.c3 r4 = new com.startapp.c3
            r4.<init>(r3)
            r3 = r4
        L_0x0078:
            r3.f15995a = r1
            r3.f15996b = r8
            java.lang.String r4 = "position"
            java.lang.String r4 = r1.getStringExtra(r4)
            r3.f16002h = r4
            java.lang.String r4 = "tracking"
            java.lang.String[] r4 = r1.getStringArrayExtra(r4)
            r3.f16003i = r4
            java.lang.String r4 = "trackingClickUrl"
            java.lang.String[] r4 = r1.getStringArrayExtra(r4)
            r3.f16004j = r4
            java.lang.String r4 = "packageNames"
            java.lang.String[] r4 = r1.getStringArrayExtra(r4)
            r3.f16005k = r4
            java.lang.String r4 = "closingUrl"
            java.lang.String[] r5 = r1.getStringArrayExtra(r4)
            r3.f15999e = r5
            java.lang.String r5 = "smartRedirect"
            boolean[] r5 = r1.getBooleanArrayExtra(r5)
            r3.f16000f = r5
            java.lang.String r5 = "browserEnabled"
            boolean[] r5 = r1.getBooleanArrayExtra(r5)
            r3.f16001g = r5
            java.lang.String r5 = "adTag"
            java.lang.String r5 = r1.getStringExtra(r5)
            r3.f16010p = r5
            java.lang.String r5 = "htmlUuid"
            java.lang.String r5 = r1.getStringExtra(r5)
            if (r5 == 0) goto L_0x00e7
            java.lang.Boolean r6 = com.startapp.sdk.adsbase.AdsConstants.f16776f
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L_0x00da
            com.startapp.sdk.adsbase.cache.d r6 = com.startapp.sdk.adsbase.cache.d.f16928h
            java.util.Map<java.lang.String, java.lang.String> r6 = r6.f16930b
            java.lang.Object r5 = r6.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            r3.a((java.lang.String) r5)
            goto L_0x00e7
        L_0x00da:
            com.startapp.sdk.adsbase.cache.d r6 = com.startapp.sdk.adsbase.cache.d.f16928h
            java.util.Map<java.lang.String, java.lang.String> r6 = r6.f16930b
            java.lang.Object r5 = r6.remove(r5)
            java.lang.String r5 = (java.lang.String) r5
            r3.a((java.lang.String) r5)
        L_0x00e7:
            java.lang.String r5 = "isSplash"
            r1.getBooleanExtra(r5, r2)
            java.lang.String r5 = "adInfoOverride"
            java.io.Serializable r5 = r1.getSerializableExtra(r5)
            com.startapp.sdk.adsbase.adinformation.AdInformationOverrides r5 = (com.startapp.sdk.adsbase.adinformation.AdInformationOverrides) r5
            r3.f16009o = r5
            r3.f16008n = r0
            java.lang.String[] r0 = r1.getStringArrayExtra(r4)
            r3.f15999e = r0
            java.lang.String r0 = "rewardDuration"
            int r0 = r1.getIntExtra(r0, r2)
            r3.f16013s = r0
            java.lang.String r0 = "rewardedHideTimer"
            boolean r0 = r1.getBooleanExtra(r0, r2)
            r3.f16014t = r0
            boolean[] r0 = r3.f16000f
            r4 = 1
            if (r0 != 0) goto L_0x0119
            boolean[] r0 = new boolean[r4]
            r0[r2] = r4
            r3.f16000f = r0
        L_0x0119:
            boolean[] r0 = r3.f16001g
            if (r0 != 0) goto L_0x0123
            boolean[] r0 = new boolean[r4]
            r0[r2] = r4
            r3.f16001g = r0
        L_0x0123:
            java.lang.String r0 = "ad"
            java.io.Serializable r0 = r1.getSerializableExtra(r0)
            com.startapp.sdk.adsbase.Ad r0 = (com.startapp.sdk.adsbase.Ad) r0
            r3.f16006l = r0
            java.lang.String r0 = "delayCloseInterval"
            r4 = -1
            long r6 = r1.getLongExtra(r0, r4)
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x013f
            java.lang.Long r0 = java.lang.Long.valueOf(r6)
            r3.f16015u = r0
        L_0x013f:
            java.lang.String r0 = "delayImpressionSeconds"
            long r6 = r1.getLongExtra(r0, r4)
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x014f
            java.lang.Long r0 = java.lang.Long.valueOf(r6)
            r3.f16011q = r0
        L_0x014f:
            java.lang.String r0 = "sendRedirectHops"
            java.io.Serializable r0 = r1.getSerializableExtra(r0)
            java.lang.Boolean[] r0 = (java.lang.Boolean[]) r0
            r3.f16012r = r0
            r0 = r3
        L_0x015a:
            r8.f16486a = r0
            if (r0 != 0) goto L_0x0161
            r8.finish()
        L_0x0161:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.ads.interstitials.OverlayActivity.a():void");
    }

    public final boolean b() {
        return this.f16487b && Build.VERSION.SDK_INT != 26;
    }

    public void finish() {
        k2 k2Var = this.f16486a;
        if (k2Var != null) {
            k2Var.h();
        }
        super.finish();
    }

    public void onBackPressed() {
        k2 k2Var = this.f16486a;
        if (k2Var == null || !k2Var.c()) {
            super.onBackPressed();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (b()) {
            a();
            k2 k2Var = this.f16486a;
            if (k2Var != null) {
                k2Var.a(this.f16490e);
                this.f16486a.f();
            }
            this.f16487b = false;
        }
        k2 k2Var2 = this.f16486a;
        if (k2Var2 != null) {
            k2Var2.a(configuration);
        }
    }

    public void onCreate(Bundle bundle) {
        boolean z10 = false;
        overridePendingTransition(0, 0);
        super.onCreate(bundle);
        int intExtra = getIntent().getIntExtra("placement", -1);
        Serializable serializableExtra = getIntent().getSerializableExtra("ad");
        if (intExtra >= 0 && (serializableExtra instanceof Ad)) {
            u7 u10 = ComponentLocator.a(getApplicationContext()).u();
            AdPreferences.Placement a10 = AdPreferences.Placement.a(intExtra);
            String adId = ((Ad) serializableExtra).getAdId();
            if (adId != null) {
                u10.f17374a.put(new u7.a(a10, -1), adId);
            }
        }
        boolean booleanExtra = getIntent().getBooleanExtra("videoAd", false);
        requestWindowFeature(1);
        if (getIntent().getBooleanExtra("fullscreen", false) || booleanExtra) {
            getWindow().setFlags(1024, 1024);
        }
        this.f16489d = getIntent().getBooleanExtra("activityShouldLockOrientation", true);
        if (bundle != null) {
            this.f16491f = bundle.getInt("activityLockedOrientation", -1);
            this.f16489d = bundle.getBoolean("activityShouldLockOrientation", true);
        }
        this.f16488c = getIntent().getIntExtra(AdUnitActivity.EXTRA_ORIENTATION, getResources().getConfiguration().orientation);
        if (getResources().getConfiguration().orientation != this.f16488c) {
            z10 = true;
        }
        this.f16487b = z10;
        if (b()) {
            this.f16490e = bundle;
            return;
        }
        a();
        k2 k2Var = this.f16486a;
        if (k2Var != null) {
            k2Var.a(bundle);
        }
    }

    public void onDestroy() {
        if (!b()) {
            k2 k2Var = this.f16486a;
            if (k2Var != null) {
                k2Var.d();
                this.f16486a = null;
            }
            Map<Activity, Integer> map = j9.f15982a;
            j9.a((Activity) this, getResources().getConfiguration().orientation, false);
        }
        super.onDestroy();
    }

    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        k2 k2Var = this.f16486a;
        if (k2Var == null || k2Var.a(i10, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    public void onPause() {
        super.onPause();
        if (!b()) {
            k2 k2Var = this.f16486a;
            if (k2Var != null) {
                k2Var.e();
            }
            a.c((Context) this);
        }
        overridePendingTransition(0, 0);
    }

    public void onResume() {
        k2 k2Var;
        super.onResume();
        int i10 = this.f16491f;
        if (i10 == -1) {
            this.f16491f = j9.a((Activity) this, this.f16488c, this.f16489d);
        } else {
            int i11 = a0.f15596a;
            try {
                setRequestedOrientation(i10);
            } catch (Throwable unused) {
            }
        }
        if (!b() && (k2Var = this.f16486a) != null) {
            k2Var.f();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (!b()) {
            k2 k2Var = this.f16486a;
            if (k2Var != null) {
                k2Var.b(bundle);
            }
            bundle.putInt("activityLockedOrientation", this.f16491f);
            bundle.putBoolean("activityShouldLockOrientation", this.f16489d);
        }
    }

    public void onStop() {
        k2 k2Var;
        super.onStop();
        if (!b() && (k2Var = this.f16486a) != null) {
            k2Var.g();
        }
    }
}
