package com.startapp.sdk.ads.list3d;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import com.applovin.mediation.MaxReward;
import com.startapp.c6;
import com.startapp.g3;
import com.startapp.i3;
import com.startapp.j9;
import com.startapp.k7;
import com.startapp.s4;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.AdsConstants;
import com.startapp.sdk.adsbase.StartAppSDKInternal;
import com.startapp.sdk.adsbase.commontracking.CloseTrackingParams;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.u4;
import com.startapp.v4;
import com.startapp.w4;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: Sta */
public class List3DActivity extends Activity implements c6 {

    /* renamed from: a  reason: collision with root package name */
    public List3DView f16492a;

    /* renamed from: b  reason: collision with root package name */
    public int f16493b;

    /* renamed from: c  reason: collision with root package name */
    public Long f16494c;

    /* renamed from: d  reason: collision with root package name */
    public Long f16495d;

    /* renamed from: e  reason: collision with root package name */
    public long f16496e = 0;

    /* renamed from: f  reason: collision with root package name */
    public String f16497f;

    /* renamed from: g  reason: collision with root package name */
    public String f16498g;

    /* renamed from: h  reason: collision with root package name */
    public List<s4> f16499h;

    /* renamed from: i  reason: collision with root package name */
    public BroadcastReceiver f16500i = new a();

    /* compiled from: Sta */
    public class a extends BroadcastReceiver {
        public a() {
        }

        public void onReceive(Context context, Intent intent) {
            List3DActivity.this.finish();
        }
    }

    /* compiled from: Sta */
    public class b implements AdapterView.OnItemClickListener {

        /* compiled from: Sta */
        public class a implements Runnable {
            public a() {
            }

            public void run() {
                List3DActivity.this.finish();
            }
        }

        public b() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            k7 k7Var;
            int i11 = i10;
            String str = List3DActivity.this.f16499h.get(i11).f16375b;
            String[] strArr = List3DActivity.this.f16499h.get(i11).f16377d;
            String str2 = List3DActivity.this.f16499h.get(i11).f16379f;
            boolean z10 = List3DActivity.this.f16499h.get(i11).f16384k;
            boolean z11 = List3DActivity.this.f16499h.get(i11).f16385l;
            String str3 = List3DActivity.this.f16499h.get(i11).f16387n;
            String str4 = List3DActivity.this.f16499h.get(i11).f16386m;
            Boolean bool = List3DActivity.this.f16499h.get(i11).f16389p;
            u4 a10 = v4.f17398b.a(List3DActivity.this.f16497f);
            String[] strArr2 = List3DActivity.this.f16499h.get(i11).f16376c;
            g3 g3Var = a10.f17363a;
            String a11 = g3Var.a(strArr2, a10.f17365c);
            HashMap<String, k7> hashMap = g3Var.f15831a;
            if (!(hashMap == null || (k7Var = hashMap.get(a11)) == null)) {
                k7Var.a((String) null, (JSONObject) null);
            }
            if (str3 != null && !TextUtils.isEmpty(str3)) {
                List3DActivity list3DActivity = List3DActivity.this;
                com.startapp.sdk.adsbase.a.a(str3, str4, str, (Context) list3DActivity, new TrackingParams(list3DActivity.f16498g));
                List3DActivity.this.finish();
            } else if (!TextUtils.isEmpty(str)) {
                boolean m10 = MetaData.f17070k.m();
                boolean a12 = com.startapp.sdk.adsbase.a.a(List3DActivity.this.getApplicationContext(), AdPreferences.Placement.INAPP_OFFER_WALL);
                if (!z10 || a12) {
                    List3DActivity list3DActivity2 = List3DActivity.this;
                    com.startapp.sdk.adsbase.a.a((Context) list3DActivity2, str, strArr, list3DActivity2.a(), z11 && !a12, false);
                    if (m10) {
                        List3DActivity.this.finish();
                        return;
                    }
                    return;
                }
                List3DActivity list3DActivity3 = List3DActivity.this;
                com.startapp.sdk.adsbase.a.a(list3DActivity3, str, strArr, str2, list3DActivity3.a(), AdsCommonMetaData.f16770h.z(), AdsCommonMetaData.f16770h.y(), z11, bool, false, m10 ? new a() : null);
            }
        }
    }

    /* compiled from: Sta */
    public class c implements View.OnClickListener {
        public c() {
        }

        public void onClick(View view) {
            List3DActivity list3DActivity = List3DActivity.this;
            com.startapp.sdk.adsbase.a.a((Context) list3DActivity, list3DActivity.b(), List3DActivity.this.a());
            List3DActivity.this.finish();
        }
    }

    /* compiled from: Sta */
    public class d implements Runnable {
        public d() {
        }

        public void run() {
            try {
                List3DActivity.this.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
            } catch (Throwable th) {
                if (!j9.a(th, (Class<? extends Throwable>) RemoteException.class)) {
                    i3.a(th);
                }
            }
        }
    }

    public TrackingParams a() {
        return new CloseTrackingParams((SystemClock.uptimeMillis() - this.f16496e) / 1000, this.f16498g);
    }

    public String b() {
        List<s4> list = this.f16499h;
        if (list == null || list.isEmpty() || this.f16499h.get(0).f16378e == null) {
            return MaxReward.DEFAULT_LABEL;
        }
        return this.f16499h.get(0).f16378e;
    }

    public void finish() {
        try {
            SystemClock.uptimeMillis();
            com.startapp.sdk.adsbase.a.a((Context) this, b(), a());
            Object obj = StartAppSDKInternal.D;
            StartAppSDKInternal.d.f16847a.f16821o = false;
            if (this.f16493b == getResources().getConfiguration().orientation) {
                w4.a((Context) this).a(new Intent("com.startapp.android.HideDisplayBroadcastListener"));
            }
            synchronized (this) {
                if (this.f16500i != null) {
                    w4.a((Context) this).a(this.f16500i);
                    this.f16500i = null;
                }
            }
            String str = this.f16497f;
            if (str != null) {
                v4.f17398b.a(str).a();
                if (!AdsConstants.f16776f.booleanValue()) {
                    v4 v4Var = v4.f17398b;
                    v4Var.f17399a.remove(this.f16497f);
                }
            }
        } catch (Throwable th) {
            i3.a(th);
        }
        super.finish();
    }

    public void onBackPressed() {
        v4.f17398b.a(this.f16497f).a();
        super.onBackPressed();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: android.widget.TextView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: android.widget.ImageButton} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: android.widget.TextView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v10, resolved type: android.widget.TextView} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r15) {
        /*
            r14 = this;
            r0 = 0
            r14.overridePendingTransition(r0, r0)     // Catch:{ all -> 0x0380 }
            super.onCreate(r15)     // Catch:{ all -> 0x0380 }
            android.content.Intent r1 = r14.getIntent()     // Catch:{ all -> 0x0380 }
            java.lang.String r2 = "fullscreen"
            boolean r1 = r1.getBooleanExtra(r2, r0)     // Catch:{ all -> 0x0380 }
            r2 = 1
            if (r1 == 0) goto L_0x0020
            r14.requestWindowFeature(r2)     // Catch:{ all -> 0x0380 }
            android.view.Window r1 = r14.getWindow()     // Catch:{ all -> 0x0380 }
            r3 = 1024(0x400, float:1.435E-42)
            r1.setFlags(r3, r3)     // Catch:{ all -> 0x0380 }
        L_0x0020:
            java.lang.String r1 = "adCacheTtl"
            java.lang.String r3 = "lastLoadTime"
            if (r15 != 0) goto L_0x004d
            com.startapp.w4 r15 = com.startapp.w4.a((android.content.Context) r14)     // Catch:{ all -> 0x0380 }
            android.content.Intent r4 = new android.content.Intent     // Catch:{ all -> 0x0380 }
            java.lang.String r5 = "com.startapp.android.ShowDisplayBroadcastListener"
            r4.<init>(r5)     // Catch:{ all -> 0x0380 }
            r15.a((android.content.Intent) r4)     // Catch:{ all -> 0x0380 }
            android.content.Intent r15 = r14.getIntent()     // Catch:{ all -> 0x0380 }
            java.io.Serializable r15 = r15.getSerializableExtra(r3)     // Catch:{ all -> 0x0380 }
            java.lang.Long r15 = (java.lang.Long) r15     // Catch:{ all -> 0x0380 }
            r14.f16494c = r15     // Catch:{ all -> 0x0380 }
            android.content.Intent r15 = r14.getIntent()     // Catch:{ all -> 0x0380 }
            java.io.Serializable r15 = r15.getSerializableExtra(r1)     // Catch:{ all -> 0x0380 }
            java.lang.Long r15 = (java.lang.Long) r15     // Catch:{ all -> 0x0380 }
            r14.f16495d = r15     // Catch:{ all -> 0x0380 }
            goto L_0x0069
        L_0x004d:
            boolean r4 = r15.containsKey(r3)     // Catch:{ all -> 0x0380 }
            if (r4 == 0) goto L_0x005b
            java.io.Serializable r3 = r15.getSerializable(r3)     // Catch:{ all -> 0x0380 }
            java.lang.Long r3 = (java.lang.Long) r3     // Catch:{ all -> 0x0380 }
            r14.f16494c = r3     // Catch:{ all -> 0x0380 }
        L_0x005b:
            boolean r3 = r15.containsKey(r1)     // Catch:{ all -> 0x0380 }
            if (r3 == 0) goto L_0x0069
            java.io.Serializable r15 = r15.getSerializable(r1)     // Catch:{ all -> 0x0380 }
            java.lang.Long r15 = (java.lang.Long) r15     // Catch:{ all -> 0x0380 }
            r14.f16495d = r15     // Catch:{ all -> 0x0380 }
        L_0x0069:
            android.content.Intent r15 = r14.getIntent()     // Catch:{ all -> 0x0380 }
            java.lang.String r1 = "position"
            r15.getStringExtra(r1)     // Catch:{ all -> 0x0380 }
            android.content.Intent r15 = r14.getIntent()     // Catch:{ all -> 0x0380 }
            java.lang.String r1 = "listModelUuid"
            java.lang.String r15 = r15.getStringExtra(r1)     // Catch:{ all -> 0x0380 }
            r14.f16497f = r15     // Catch:{ all -> 0x0380 }
            com.startapp.w4 r15 = com.startapp.w4.a((android.content.Context) r14)     // Catch:{ all -> 0x0380 }
            android.content.BroadcastReceiver r1 = r14.f16500i     // Catch:{ all -> 0x0380 }
            android.content.IntentFilter r3 = new android.content.IntentFilter     // Catch:{ all -> 0x0380 }
            java.lang.String r4 = "com.startapp.android.CloseAdActivity"
            r3.<init>(r4)     // Catch:{ all -> 0x0380 }
            r15.a(r1, r3)     // Catch:{ all -> 0x0380 }
            android.content.res.Resources r15 = r14.getResources()     // Catch:{ all -> 0x0380 }
            android.content.res.Configuration r15 = r15.getConfiguration()     // Catch:{ all -> 0x0380 }
            int r15 = r15.orientation     // Catch:{ all -> 0x0380 }
            r14.f16493b = r15     // Catch:{ all -> 0x0380 }
            java.util.Map<android.app.Activity, java.lang.Integer> r15 = com.startapp.j9.f15982a     // Catch:{ all -> 0x0380 }
            android.content.res.Resources r15 = r14.getResources()     // Catch:{ all -> 0x0380 }
            android.content.res.Configuration r15 = r15.getConfiguration()     // Catch:{ all -> 0x0380 }
            int r15 = r15.orientation     // Catch:{ all -> 0x0380 }
            com.startapp.j9.a((android.app.Activity) r14, (int) r15, (boolean) r2)     // Catch:{ all -> 0x0380 }
            r14.requestWindowFeature(r2)     // Catch:{ all -> 0x0380 }
            android.content.Intent r15 = r14.getIntent()     // Catch:{ all -> 0x0380 }
            java.lang.String r1 = "adTag"
            java.lang.String r15 = r15.getStringExtra(r1)     // Catch:{ all -> 0x0380 }
            r14.f16498g = r15     // Catch:{ all -> 0x0380 }
            com.startapp.sdk.adsbase.AdsCommonMetaData r15 = com.startapp.sdk.adsbase.AdsCommonMetaData.f16770h     // Catch:{ all -> 0x0380 }
            int r15 = r15.d()     // Catch:{ all -> 0x0380 }
            com.startapp.sdk.adsbase.AdsCommonMetaData r1 = com.startapp.sdk.adsbase.AdsCommonMetaData.f16770h     // Catch:{ all -> 0x0380 }
            int r1 = r1.c()     // Catch:{ all -> 0x0380 }
            com.startapp.sdk.ads.list3d.List3DView r3 = new com.startapp.sdk.ads.list3d.List3DView     // Catch:{ all -> 0x0380 }
            java.lang.String r4 = r14.f16498g     // Catch:{ all -> 0x0380 }
            java.lang.String r5 = r14.f16497f     // Catch:{ all -> 0x0380 }
            r6 = 0
            r3.<init>(r14, r6, r4, r5)     // Catch:{ all -> 0x0380 }
            r14.f16492a = r3     // Catch:{ all -> 0x0380 }
            android.graphics.drawable.GradientDrawable r3 = new android.graphics.drawable.GradientDrawable     // Catch:{ all -> 0x0380 }
            android.graphics.drawable.GradientDrawable$Orientation r4 = android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM     // Catch:{ all -> 0x0380 }
            r5 = 2
            int[] r7 = new int[r5]     // Catch:{ all -> 0x0380 }
            r7[r0] = r15     // Catch:{ all -> 0x0380 }
            r7[r2] = r1     // Catch:{ all -> 0x0380 }
            r3.<init>(r4, r7)     // Catch:{ all -> 0x0380 }
            com.startapp.sdk.ads.list3d.List3DView r15 = r14.f16492a     // Catch:{ all -> 0x0380 }
            r15.setBackgroundDrawable(r3)     // Catch:{ all -> 0x0380 }
            com.startapp.v4 r15 = com.startapp.v4.f17398b     // Catch:{ all -> 0x0380 }
            java.lang.String r1 = r14.f16497f     // Catch:{ all -> 0x0380 }
            com.startapp.u4 r15 = r15.a(r1)     // Catch:{ all -> 0x0380 }
            java.util.List<com.startapp.s4> r15 = r15.f17364b     // Catch:{ all -> 0x0380 }
            r14.f16499h = r15     // Catch:{ all -> 0x0380 }
            if (r15 != 0) goto L_0x00f5
            r14.finish()     // Catch:{ all -> 0x0380 }
            return
        L_0x00f5:
            com.startapp.sdk.ads.list3d.List3DView r15 = r14.f16492a     // Catch:{ all -> 0x0380 }
            r15.setStarted()     // Catch:{ all -> 0x0380 }
            com.startapp.sdk.ads.list3d.List3DView r15 = r14.f16492a     // Catch:{ all -> 0x0380 }
            r15.setHint(r2)     // Catch:{ all -> 0x0380 }
            com.startapp.sdk.ads.list3d.List3DView r15 = r14.f16492a     // Catch:{ all -> 0x0380 }
            r15.setFade(r2)     // Catch:{ all -> 0x0380 }
            com.startapp.o4 r15 = new com.startapp.o4     // Catch:{ all -> 0x0380 }
            java.util.List<com.startapp.s4> r1 = r14.f16499h     // Catch:{ all -> 0x0380 }
            java.lang.String r3 = r14.f16498g     // Catch:{ all -> 0x0380 }
            java.lang.String r4 = r14.f16497f     // Catch:{ all -> 0x0380 }
            r15.<init>(r14, r1, r3, r4)     // Catch:{ all -> 0x0380 }
            com.startapp.v4 r1 = com.startapp.v4.f17398b     // Catch:{ all -> 0x0380 }
            java.lang.String r3 = r14.f16497f     // Catch:{ all -> 0x0380 }
            com.startapp.u4 r1 = r1.a(r3)     // Catch:{ all -> 0x0380 }
            r1.a(r14, r2)     // Catch:{ all -> 0x0380 }
            com.startapp.sdk.ads.list3d.List3DView r1 = r14.f16492a     // Catch:{ all -> 0x0380 }
            r1.setAdapter(r15)     // Catch:{ all -> 0x0380 }
            com.startapp.sdk.ads.list3d.List3DView r15 = r14.f16492a     // Catch:{ all -> 0x0380 }
            com.startapp.v7 r1 = new com.startapp.v7     // Catch:{ all -> 0x0380 }
            r3 = 1063675494(0x3f666666, float:0.9)
            r4 = 1058642330(0x3f19999a, float:0.6)
            r1.<init>(r3, r4)     // Catch:{ all -> 0x0380 }
            r15.setDynamics(r1)     // Catch:{ all -> 0x0380 }
            com.startapp.sdk.ads.list3d.List3DView r15 = r14.f16492a     // Catch:{ all -> 0x0380 }
            com.startapp.sdk.ads.list3d.List3DActivity$b r1 = new com.startapp.sdk.ads.list3d.List3DActivity$b     // Catch:{ all -> 0x0380 }
            r1.<init>()     // Catch:{ all -> 0x0380 }
            r15.setOnItemClickListener(r1)     // Catch:{ all -> 0x0380 }
            android.widget.RelativeLayout r15 = new android.widget.RelativeLayout     // Catch:{ all -> 0x0380 }
            r15.<init>(r14)     // Catch:{ all -> 0x0380 }
            java.lang.String r1 = "StartApp Ad"
            r15.setContentDescription(r1)     // Catch:{ all -> 0x0380 }
            r1 = 1475346432(0x57f00000, float:5.27765581E14)
            r15.setId(r1)     // Catch:{ all -> 0x0380 }
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams     // Catch:{ all -> 0x0380 }
            r3 = -1
            r1.<init>(r3, r3)     // Catch:{ all -> 0x0380 }
            android.widget.RelativeLayout$LayoutParams r4 = new android.widget.RelativeLayout$LayoutParams     // Catch:{ all -> 0x0380 }
            r4.<init>(r3, r3)     // Catch:{ all -> 0x0380 }
            android.widget.LinearLayout r7 = new android.widget.LinearLayout     // Catch:{ all -> 0x0380 }
            r7.<init>(r14)     // Catch:{ all -> 0x0380 }
            r7.setOrientation(r2)     // Catch:{ all -> 0x0380 }
            r15.addView(r7, r4)     // Catch:{ all -> 0x0380 }
            android.widget.RelativeLayout r4 = new android.widget.RelativeLayout     // Catch:{ all -> 0x0380 }
            r4.<init>(r14)     // Catch:{ all -> 0x0380 }
            android.widget.RelativeLayout$LayoutParams r8 = new android.widget.RelativeLayout$LayoutParams     // Catch:{ all -> 0x0380 }
            r9 = -2
            r8.<init>(r3, r9)     // Catch:{ all -> 0x0380 }
            r4.setLayoutParams(r8)     // Catch:{ all -> 0x0380 }
            com.startapp.sdk.adsbase.AdsCommonMetaData r8 = com.startapp.sdk.adsbase.AdsCommonMetaData.f16770h     // Catch:{ all -> 0x0380 }
            java.lang.Integer r8 = r8.A()     // Catch:{ all -> 0x0380 }
            int r8 = r8.intValue()     // Catch:{ all -> 0x0380 }
            r4.setBackgroundColor(r8)     // Catch:{ all -> 0x0380 }
            r7.addView(r4)     // Catch:{ all -> 0x0380 }
            android.widget.TextView r8 = new android.widget.TextView     // Catch:{ all -> 0x0380 }
            r8.<init>(r14)     // Catch:{ all -> 0x0380 }
            android.widget.RelativeLayout$LayoutParams r10 = new android.widget.RelativeLayout$LayoutParams     // Catch:{ all -> 0x0380 }
            r10.<init>(r9, r9)     // Catch:{ all -> 0x0380 }
            r11 = 13
            r10.addRule(r11)     // Catch:{ all -> 0x0380 }
            r8.setLayoutParams(r10)     // Catch:{ all -> 0x0380 }
            float r5 = (float) r5     // Catch:{ all -> 0x0380 }
            android.content.res.Resources r10 = r14.getResources()     // Catch:{ all -> 0x0380 }
            android.util.DisplayMetrics r10 = r10.getDisplayMetrics()     // Catch:{ all -> 0x0380 }
            float r10 = android.util.TypedValue.applyDimension(r2, r5, r10)     // Catch:{ all -> 0x0380 }
            int r10 = java.lang.Math.round(r10)     // Catch:{ all -> 0x0380 }
            r11 = 5
            float r11 = (float) r11     // Catch:{ all -> 0x0380 }
            android.content.res.Resources r12 = r14.getResources()     // Catch:{ all -> 0x0380 }
            android.util.DisplayMetrics r12 = r12.getDisplayMetrics()     // Catch:{ all -> 0x0380 }
            float r11 = android.util.TypedValue.applyDimension(r2, r11, r12)     // Catch:{ all -> 0x0380 }
            int r11 = java.lang.Math.round(r11)     // Catch:{ all -> 0x0380 }
            r8.setPadding(r0, r10, r0, r11)     // Catch:{ all -> 0x0380 }
            com.startapp.sdk.adsbase.AdsCommonMetaData r10 = com.startapp.sdk.adsbase.AdsCommonMetaData.f16770h     // Catch:{ all -> 0x0380 }
            java.lang.Integer r10 = r10.D()     // Catch:{ all -> 0x0380 }
            int r10 = r10.intValue()     // Catch:{ all -> 0x0380 }
            r8.setTextColor(r10)     // Catch:{ all -> 0x0380 }
            com.startapp.sdk.adsbase.AdsCommonMetaData r10 = com.startapp.sdk.adsbase.AdsCommonMetaData.f16770h     // Catch:{ all -> 0x0380 }
            java.lang.Integer r10 = r10.F()     // Catch:{ all -> 0x0380 }
            int r10 = r10.intValue()     // Catch:{ all -> 0x0380 }
            float r10 = (float) r10     // Catch:{ all -> 0x0380 }
            r8.setTextSize(r10)     // Catch:{ all -> 0x0380 }
            r8.setSingleLine(r2)     // Catch:{ all -> 0x0380 }
            android.text.TextUtils$TruncateAt r10 = android.text.TextUtils.TruncateAt.END     // Catch:{ all -> 0x0380 }
            r8.setEllipsize(r10)     // Catch:{ all -> 0x0380 }
            com.startapp.sdk.adsbase.AdsCommonMetaData r10 = com.startapp.sdk.adsbase.AdsCommonMetaData.f16770h     // Catch:{ all -> 0x0380 }
            java.lang.String r10 = r10.B()     // Catch:{ all -> 0x0380 }
            r8.setText(r10)     // Catch:{ all -> 0x0380 }
            r10 = 1075838976(0x40200000, float:2.5)
            r11 = -1073741824(0xffffffffc0000000, float:-2.0)
            r12 = 1073741824(0x40000000, float:2.0)
            r13 = -11513776(0xffffffffff505050, float:-2.7689643E38)
            r8.setShadowLayer(r10, r11, r12, r13)     // Catch:{ all -> 0x0380 }
            com.startapp.sdk.adsbase.AdsCommonMetaData r10 = com.startapp.sdk.adsbase.AdsCommonMetaData.f16770h     // Catch:{ all -> 0x0380 }
            java.util.Set r10 = r10.E()     // Catch:{ all -> 0x0380 }
            com.startapp.f9.a((android.widget.TextView) r8, (java.util.Set<java.lang.String>) r10)     // Catch:{ all -> 0x0380 }
            r4.addView(r8)     // Catch:{ all -> 0x0380 }
            android.widget.RelativeLayout$LayoutParams r8 = new android.widget.RelativeLayout$LayoutParams     // Catch:{ all -> 0x0380 }
            r8.<init>(r9, r9)     // Catch:{ all -> 0x0380 }
            r10 = 11
            r8.addRule(r10)     // Catch:{ all -> 0x0380 }
            r10 = 15
            r8.addRule(r10)     // Catch:{ all -> 0x0380 }
            java.lang.String r10 = "close_button.png"
            android.graphics.Bitmap r10 = com.startapp.a1.a(r14, r10)     // Catch:{ all -> 0x0380 }
            if (r10 == 0) goto L_0x0242
            android.widget.ImageButton r11 = new android.widget.ImageButton     // Catch:{ all -> 0x0380 }
            r12 = 16973839(0x103000f, float:2.4060942E-38)
            r11.<init>(r14, r6, r12)     // Catch:{ all -> 0x0380 }
            r6 = 36
            float r6 = (float) r6     // Catch:{ all -> 0x0380 }
            android.content.res.Resources r12 = r14.getResources()     // Catch:{ all -> 0x0380 }
            android.util.DisplayMetrics r12 = r12.getDisplayMetrics()     // Catch:{ all -> 0x0380 }
            float r12 = android.util.TypedValue.applyDimension(r2, r6, r12)     // Catch:{ all -> 0x0380 }
            int r12 = java.lang.Math.round(r12)     // Catch:{ all -> 0x0380 }
            android.content.res.Resources r13 = r14.getResources()     // Catch:{ all -> 0x0380 }
            android.util.DisplayMetrics r13 = r13.getDisplayMetrics()     // Catch:{ all -> 0x0380 }
            float r6 = android.util.TypedValue.applyDimension(r2, r6, r13)     // Catch:{ all -> 0x0380 }
            int r6 = java.lang.Math.round(r6)     // Catch:{ all -> 0x0380 }
            android.graphics.Bitmap r6 = android.graphics.Bitmap.createScaledBitmap(r10, r12, r6, r2)     // Catch:{ all -> 0x0380 }
            r11.setImageBitmap(r6)     // Catch:{ all -> 0x0380 }
            goto L_0x0251
        L_0x0242:
            android.widget.TextView r11 = new android.widget.TextView     // Catch:{ all -> 0x0380 }
            r11.<init>(r14)     // Catch:{ all -> 0x0380 }
            java.lang.String r6 = "   x   "
            r11.setText(r6)     // Catch:{ all -> 0x0380 }
            r6 = 1101004800(0x41a00000, float:20.0)
            r11.setTextSize(r6)     // Catch:{ all -> 0x0380 }
        L_0x0251:
            r11.setLayoutParams(r8)     // Catch:{ all -> 0x0380 }
            com.startapp.sdk.ads.list3d.List3DActivity$c r6 = new com.startapp.sdk.ads.list3d.List3DActivity$c     // Catch:{ all -> 0x0380 }
            r6.<init>()     // Catch:{ all -> 0x0380 }
            r11.setOnClickListener(r6)     // Catch:{ all -> 0x0380 }
            java.lang.String r6 = "x"
            r11.setContentDescription(r6)     // Catch:{ all -> 0x0380 }
            r6 = 1475346435(0x57f00003, float:5.27765682E14)
            r11.setId(r6)     // Catch:{ all -> 0x0380 }
            r4.addView(r11)     // Catch:{ all -> 0x0380 }
            android.view.View r4 = new android.view.View     // Catch:{ all -> 0x0380 }
            r4.<init>(r14)     // Catch:{ all -> 0x0380 }
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams     // Catch:{ all -> 0x0380 }
            android.content.res.Resources r8 = r14.getResources()     // Catch:{ all -> 0x0380 }
            android.util.DisplayMetrics r8 = r8.getDisplayMetrics()     // Catch:{ all -> 0x0380 }
            float r8 = android.util.TypedValue.applyDimension(r2, r5, r8)     // Catch:{ all -> 0x0380 }
            int r8 = java.lang.Math.round(r8)     // Catch:{ all -> 0x0380 }
            r6.<init>(r3, r8)     // Catch:{ all -> 0x0380 }
            r4.setLayoutParams(r6)     // Catch:{ all -> 0x0380 }
            com.startapp.sdk.adsbase.AdsCommonMetaData r6 = com.startapp.sdk.adsbase.AdsCommonMetaData.f16770h     // Catch:{ all -> 0x0380 }
            java.lang.Integer r6 = r6.C()     // Catch:{ all -> 0x0380 }
            int r6 = r6.intValue()     // Catch:{ all -> 0x0380 }
            r4.setBackgroundColor(r6)     // Catch:{ all -> 0x0380 }
            r7.addView(r4)     // Catch:{ all -> 0x0380 }
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams     // Catch:{ all -> 0x0380 }
            r4.<init>(r3, r0)     // Catch:{ all -> 0x0380 }
            r6 = 1065353216(0x3f800000, float:1.0)
            r4.weight = r6     // Catch:{ all -> 0x0380 }
            com.startapp.sdk.ads.list3d.List3DView r6 = r14.f16492a     // Catch:{ all -> 0x0380 }
            r6.setLayoutParams(r4)     // Catch:{ all -> 0x0380 }
            com.startapp.sdk.ads.list3d.List3DView r4 = r14.f16492a     // Catch:{ all -> 0x0380 }
            r7.addView(r4)     // Catch:{ all -> 0x0380 }
            android.widget.LinearLayout r4 = new android.widget.LinearLayout     // Catch:{ all -> 0x0380 }
            r4.<init>(r14)     // Catch:{ all -> 0x0380 }
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams     // Catch:{ all -> 0x0380 }
            r6.<init>(r3, r9)     // Catch:{ all -> 0x0380 }
            r3 = 80
            r6.gravity = r3     // Catch:{ all -> 0x0380 }
            r4.setLayoutParams(r6)     // Catch:{ all -> 0x0380 }
            com.startapp.sdk.adsbase.AdsCommonMetaData r3 = com.startapp.sdk.adsbase.AdsCommonMetaData.f16770h     // Catch:{ all -> 0x0380 }
            java.lang.Integer r3 = r3.u()     // Catch:{ all -> 0x0380 }
            int r3 = r3.intValue()     // Catch:{ all -> 0x0380 }
            r4.setBackgroundColor(r3)     // Catch:{ all -> 0x0380 }
            r3 = 17
            r4.setGravity(r3)     // Catch:{ all -> 0x0380 }
            r7.addView(r4)     // Catch:{ all -> 0x0380 }
            android.widget.TextView r3 = new android.widget.TextView     // Catch:{ all -> 0x0380 }
            r3.<init>(r14)     // Catch:{ all -> 0x0380 }
            com.startapp.sdk.adsbase.AdsCommonMetaData r6 = com.startapp.sdk.adsbase.AdsCommonMetaData.f16770h     // Catch:{ all -> 0x0380 }
            java.lang.Integer r6 = r6.v()     // Catch:{ all -> 0x0380 }
            int r6 = r6.intValue()     // Catch:{ all -> 0x0380 }
            r3.setTextColor(r6)     // Catch:{ all -> 0x0380 }
            android.content.res.Resources r6 = r14.getResources()     // Catch:{ all -> 0x0380 }
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()     // Catch:{ all -> 0x0380 }
            float r5 = android.util.TypedValue.applyDimension(r2, r5, r6)     // Catch:{ all -> 0x0380 }
            int r5 = java.lang.Math.round(r5)     // Catch:{ all -> 0x0380 }
            r6 = 3
            float r6 = (float) r6     // Catch:{ all -> 0x0380 }
            android.content.res.Resources r7 = r14.getResources()     // Catch:{ all -> 0x0380 }
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()     // Catch:{ all -> 0x0380 }
            float r6 = android.util.TypedValue.applyDimension(r2, r6, r7)     // Catch:{ all -> 0x0380 }
            int r6 = java.lang.Math.round(r6)     // Catch:{ all -> 0x0380 }
            r3.setPadding(r0, r5, r0, r6)     // Catch:{ all -> 0x0380 }
            java.lang.String r0 = "Powered By "
            r3.setText(r0)     // Catch:{ all -> 0x0380 }
            r0 = 1098907648(0x41800000, float:16.0)
            r3.setTextSize(r0)     // Catch:{ all -> 0x0380 }
            r4.addView(r3)     // Catch:{ all -> 0x0380 }
            android.widget.ImageView r0 = new android.widget.ImageView     // Catch:{ all -> 0x0380 }
            r0.<init>(r14)     // Catch:{ all -> 0x0380 }
            java.lang.String r3 = "logo.png"
            android.graphics.Bitmap r3 = com.startapp.a1.a(r14, r3)     // Catch:{ all -> 0x0380 }
            r5 = 56
            float r5 = (float) r5     // Catch:{ all -> 0x0380 }
            android.content.res.Resources r6 = r14.getResources()     // Catch:{ all -> 0x0380 }
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()     // Catch:{ all -> 0x0380 }
            float r5 = android.util.TypedValue.applyDimension(r2, r5, r6)     // Catch:{ all -> 0x0380 }
            int r5 = java.lang.Math.round(r5)     // Catch:{ all -> 0x0380 }
            r6 = 12
            float r6 = (float) r6     // Catch:{ all -> 0x0380 }
            android.content.res.Resources r7 = r14.getResources()     // Catch:{ all -> 0x0380 }
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()     // Catch:{ all -> 0x0380 }
            float r6 = android.util.TypedValue.applyDimension(r2, r6, r7)     // Catch:{ all -> 0x0380 }
            int r6 = java.lang.Math.round(r6)     // Catch:{ all -> 0x0380 }
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createScaledBitmap(r3, r5, r6, r2)     // Catch:{ all -> 0x0380 }
            r0.setImageBitmap(r2)     // Catch:{ all -> 0x0380 }
            r4.addView(r0)     // Catch:{ all -> 0x0380 }
            android.content.Intent r0 = r14.getIntent()     // Catch:{ all -> 0x0380 }
            java.lang.String r2 = "adInfoOverride"
            java.io.Serializable r0 = r0.getSerializableExtra(r2)     // Catch:{ all -> 0x0380 }
            r6 = r0
            com.startapp.sdk.adsbase.adinformation.AdInformationOverrides r6 = (com.startapp.sdk.adsbase.adinformation.AdInformationOverrides) r6     // Catch:{ all -> 0x0380 }
            com.startapp.sdk.adsbase.adinformation.AdInformationObject r0 = new com.startapp.sdk.adsbase.adinformation.AdInformationObject     // Catch:{ all -> 0x0380 }
            com.startapp.sdk.adsbase.adinformation.AdInformationObject$Size r4 = com.startapp.sdk.adsbase.adinformation.AdInformationObject.Size.LARGE     // Catch:{ all -> 0x0380 }
            com.startapp.sdk.adsbase.model.AdPreferences$Placement r5 = com.startapp.sdk.adsbase.model.AdPreferences.Placement.INAPP_OFFER_WALL     // Catch:{ all -> 0x0380 }
            r7 = 0
            r8 = 0
            r9 = 0
            r2 = r0
            r3 = r14
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0380 }
            r0.a(r15)     // Catch:{ all -> 0x0380 }
            r14.setContentView(r15, r1)     // Catch:{ all -> 0x0380 }
            android.os.Handler r15 = new android.os.Handler     // Catch:{ all -> 0x0380 }
            r15.<init>()     // Catch:{ all -> 0x0380 }
            com.startapp.sdk.ads.list3d.List3DActivity$d r0 = new com.startapp.sdk.ads.list3d.List3DActivity$d     // Catch:{ all -> 0x0380 }
            r0.<init>()     // Catch:{ all -> 0x0380 }
            r1 = 500(0x1f4, double:2.47E-321)
            r15.postDelayed(r0, r1)     // Catch:{ all -> 0x0380 }
            goto L_0x0387
        L_0x0380:
            r15 = move-exception
            com.startapp.i3.a((java.lang.Throwable) r15)
            r14.finish()
        L_0x0387:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.ads.list3d.List3DActivity.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        if (this.f16500i != null) {
            w4.a((Context) this).a(this.f16500i);
        }
        Map<Activity, Integer> map = j9.f15982a;
        j9.a((Activity) this, getResources().getConfiguration().orientation, false);
        super.onDestroy();
    }

    public void onPause() {
        super.onPause();
        for (k7 next : v4.f17398b.a(this.f16497f).f17363a.f15831a.values()) {
            if (next != null) {
                next.b();
            }
        }
        overridePendingTransition(0, 0);
    }

    public void onResume() {
        super.onResume();
        if ((this.f16494c == null || this.f16495d == null || System.currentTimeMillis() - this.f16494c.longValue() <= this.f16495d.longValue()) ? false : true) {
            finish();
            return;
        }
        Object obj = StartAppSDKInternal.D;
        StartAppSDKInternal.d.f16847a.f16821o = true;
        this.f16496e = SystemClock.uptimeMillis();
        g3 g3Var = v4.f17398b.a(this.f16497f).f17363a;
        for (String next : g3Var.f15831a.keySet()) {
            if (g3Var.f15831a.get(next) != null) {
                g3Var.f15831a.get(next).c();
            }
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Long l10 = this.f16494c;
        if (l10 != null) {
            bundle.putSerializable("lastLoadTime", l10);
        }
        Long l11 = this.f16495d;
        if (l11 != null) {
            bundle.putSerializable("adCacheTtl", l11);
        }
    }
}
