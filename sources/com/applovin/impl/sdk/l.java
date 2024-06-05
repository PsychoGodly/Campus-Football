package com.applovin.impl.sdk;

import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Point;
import android.hardware.SensorManager;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.Environment;
import android.os.LocaleList;
import android.os.PowerManager;
import android.os.SystemClock;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import com.applovin.impl.aa;
import com.applovin.impl.b4;
import com.applovin.impl.ba;
import com.applovin.impl.bc;
import com.applovin.impl.c4;
import com.applovin.impl.dm;
import com.applovin.impl.kn;
import com.applovin.impl.l0;
import com.applovin.impl.oj;
import com.applovin.impl.qi;
import com.applovin.impl.qj;
import com.applovin.impl.sdk.array.ArrayService;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sm;
import com.applovin.impl.th;
import com.applovin.impl.tr;
import com.applovin.impl.v;
import com.applovin.impl.x3;
import com.applovin.impl.xl;
import com.applovin.impl.xp;
import com.applovin.impl.y3;
import com.applovin.impl.zp;
import com.applovin.mediation.MaxReward;
import com.applovin.sdk.AppLovinBidTokenCollectionListener;
import com.applovin.sdk.AppLovinEventTypes;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.unity3d.services.core.device.MimeTypes;
import java.io.File;
import java.nio.charset.Charset;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONObject;

public class l {
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public static final AtomicReference f11714i = new AtomicReference();

    /* renamed from: j  reason: collision with root package name */
    private static final AtomicReference f11715j = new AtomicReference();

    /* renamed from: a  reason: collision with root package name */
    private final k f11716a;

    /* renamed from: b  reason: collision with root package name */
    private final t f11717b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f11718c;

    /* renamed from: d  reason: collision with root package name */
    private final Map f11719d;

    /* renamed from: e  reason: collision with root package name */
    private final Object f11720e = new Object();

    /* renamed from: f  reason: collision with root package name */
    private final Map f11721f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f11722g;

    /* renamed from: h  reason: collision with root package name */
    private final AtomicReference f11723h = new AtomicReference();

    class a implements dm.a {
        a() {
        }

        public void a(l0.a aVar) {
            l.f11714i.set(aVar);
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f11725a;

        /* renamed from: b  reason: collision with root package name */
        public final int f11726b;

        public b(String str, int i10) {
            this.f11725a = str;
            this.f11726b = i10;
        }
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public int f11727a = -1;

        /* renamed from: b  reason: collision with root package name */
        public int f11728b = -1;

        /* renamed from: c  reason: collision with root package name */
        public Boolean f11729c = null;
    }

    protected l(k kVar) {
        if (kVar != null) {
            this.f11716a = kVar;
            this.f11717b = kVar.L();
            this.f11718c = k.k();
            this.f11719d = y();
            this.f11721f = x();
            return;
        }
        throw new IllegalArgumentException("No sdk specified");
    }

    private Map E() {
        return zp.a(a((Map) null, true, false));
    }

    private JSONArray H() {
        if (x3.f()) {
            return CollectionUtils.toJSONArray(Build.SUPPORTED_ABIS);
        }
        JSONArray jSONArray = new JSONArray();
        JsonUtils.putStringIfValid(jSONArray, Build.CPU_ABI);
        JsonUtils.putStringIfValid(jSONArray, Build.CPU_ABI2);
        return jSONArray;
    }

    private boolean I() {
        try {
            return b() || c();
        } catch (Throwable unused) {
            return false;
        }
    }

    private boolean J() {
        ConnectivityManager connectivityManager;
        if (x3.h() && (connectivityManager = (ConnectivityManager) this.f11718c.getSystemService("connectivity")) != null) {
            try {
                if (connectivityManager.getRestrictBackgroundStatus() == 3) {
                    return true;
                }
                return false;
            } catch (Throwable th) {
                this.f11716a.L();
                if (t.a()) {
                    this.f11716a.L().a("DataCollector", "Unable to collect constrained network info.", th);
                }
            }
        }
        return false;
    }

    private Boolean K() {
        if (!x3.i()) {
            return null;
        }
        return Boolean.valueOf(this.f11718c.getResources().getConfiguration().isScreenHdr());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void M() {
        this.f11723h.set(n());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(AppLovinBidTokenCollectionListener appLovinBidTokenCollectionListener) {
        try {
            String C = C();
            if (StringUtils.isValidString(C)) {
                this.f11716a.L();
                if (t.a()) {
                    this.f11716a.L().a("DataCollector", "Successfully retrieved bid token");
                }
                bc.a(appLovinBidTokenCollectionListener, C);
                return;
            }
            this.f11716a.L();
            if (t.a()) {
                this.f11716a.L().b("DataCollector", "Empty bid token");
            }
            bc.b(appLovinBidTokenCollectionListener, "Empty bid token");
        } catch (Throwable th) {
            if (t.a()) {
                this.f11717b.a("DataCollector", "Failed to collect bid token", th);
            }
            this.f11716a.B().a("DataCollector", "collectBidToken", th);
            bc.b(appLovinBidTokenCollectionListener, "Failed to collect bid token");
        }
    }

    private boolean c() {
        String[] strArr = {"&zpz}ld&hyy&Z|yl{|zl{'hyb", "&zk`g&z|", "&zpz}ld&k`g&z|", "&zpz}ld&qk`g&z|", "&mh}h&efjhe&qk`g&z|", "&mh}h&efjhe&k`g&z|", "&zpz}ld&zm&qk`g&z|", "&zpz}ld&k`g&oh`ezhol&z|", "&mh}h&efjhe&z|"};
        for (int i10 = 0; i10 < 9; i10++) {
            if (new File(c(strArr[i10])).exists()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x01aa  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x01c1  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x01c8  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x01d8  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x01df  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private long d() {
        /*
            r6 = this;
            android.content.Context r0 = r6.f11718c
            android.content.ContentResolver r0 = r0.getContentResolver()
            java.lang.String r1 = "enabled_accessibility_services"
            java.lang.String r0 = android.provider.Settings.Secure.getString(r0, r1)
            java.lang.String r0 = com.applovin.impl.sdk.utils.StringUtils.emptyIfNull(r0)
            java.lang.String r1 = ":"
            java.lang.String[] r0 = r0.split(r1)
            java.util.List r0 = java.util.Arrays.asList(r0)
            java.lang.String r1 = "AccessibilityMenuService"
            boolean r1 = r0.contains(r1)
            if (r1 == 0) goto L_0x0025
            r1 = 256(0x100, double:1.265E-321)
            goto L_0x0027
        L_0x0025:
            r1 = 0
        L_0x0027:
            java.lang.String r3 = "SelectToSpeakService"
            boolean r3 = r0.contains(r3)
            if (r3 == 0) goto L_0x0032
            r3 = 512(0x200, double:2.53E-321)
            long r1 = r1 | r3
        L_0x0032:
            java.lang.String r3 = "SoundAmplifierService"
            boolean r3 = r0.contains(r3)
            if (r3 == 0) goto L_0x003d
            r3 = 2
            long r1 = r1 | r3
        L_0x003d:
            java.lang.String r3 = "SpeechToTextAccessibilityService"
            boolean r3 = r0.contains(r3)
            if (r3 == 0) goto L_0x0048
            r3 = 128(0x80, double:6.32E-322)
            long r1 = r1 | r3
        L_0x0048:
            java.lang.String r3 = "SwitchAccessService"
            boolean r0 = r0.contains(r3)
            if (r0 == 0) goto L_0x0053
            r3 = 4
            long r1 = r1 | r3
        L_0x0053:
            android.content.Context r0 = r6.f11718c
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.uiMode
            r0 = r0 & 48
            r3 = 32
            if (r0 != r3) goto L_0x0068
            r3 = 1024(0x400, double:5.06E-321)
            long r1 = r1 | r3
        L_0x0068:
            java.lang.String r0 = "accessibility_enabled"
            boolean r0 = r6.a((java.lang.String) r0)
            if (r0 == 0) goto L_0x0073
            r3 = 8
            long r1 = r1 | r3
        L_0x0073:
            java.lang.String r0 = "touch_exploration_enabled"
            boolean r0 = r6.a((java.lang.String) r0)
            if (r0 == 0) goto L_0x007e
            r3 = 16
            long r1 = r1 | r3
        L_0x007e:
            boolean r0 = com.applovin.impl.x3.f()
            if (r0 == 0) goto L_0x009a
            java.lang.String r0 = "accessibility_display_inversion_enabled"
            boolean r0 = r6.a((java.lang.String) r0)
            if (r0 == 0) goto L_0x008f
            r3 = 32
            long r1 = r1 | r3
        L_0x008f:
            java.lang.String r0 = "skip_first_use_hints"
            boolean r0 = r6.a((java.lang.String) r0)
            if (r0 == 0) goto L_0x009a
            r3 = 64
            long r1 = r1 | r3
        L_0x009a:
            java.lang.String r0 = "lock_screen_allow_remote_input"
            boolean r0 = r6.a((java.lang.String) r0)
            if (r0 == 0) goto L_0x00a5
            r3 = 2048(0x800, double:1.0118E-320)
            long r1 = r1 | r3
        L_0x00a5:
            java.lang.String r0 = "enabled_accessibility_audio_description_by_default"
            boolean r0 = r6.a((java.lang.String) r0)
            if (r0 == 0) goto L_0x00b0
            r3 = 4096(0x1000, double:2.0237E-320)
            long r1 = r1 | r3
        L_0x00b0:
            java.lang.String r0 = "accessibility_shortcut_on_lock_screen"
            boolean r0 = r6.a((java.lang.String) r0)
            if (r0 == 0) goto L_0x00bb
            r3 = 8192(0x2000, double:4.0474E-320)
            long r1 = r1 | r3
        L_0x00bb:
            java.lang.String r0 = "wear_talkback_enabled"
            boolean r0 = r6.a((java.lang.String) r0)
            if (r0 == 0) goto L_0x00c6
            r3 = 16384(0x4000, double:8.0948E-320)
            long r1 = r1 | r3
        L_0x00c6:
            java.lang.String r0 = "hush_gesture_used"
            boolean r0 = r6.a((java.lang.String) r0)
            if (r0 == 0) goto L_0x00d2
            r3 = 32768(0x8000, double:1.61895E-319)
            long r1 = r1 | r3
        L_0x00d2:
            java.lang.String r0 = "high_text_contrast_enabled"
            boolean r0 = r6.a((java.lang.String) r0)
            if (r0 == 0) goto L_0x00de
            r3 = 65536(0x10000, double:3.2379E-319)
            long r1 = r1 | r3
        L_0x00de:
            java.lang.String r0 = "accessibility_display_magnification_enabled"
            boolean r0 = r6.a((java.lang.String) r0)
            if (r0 == 0) goto L_0x00ea
            r3 = 131072(0x20000, double:6.47582E-319)
            long r1 = r1 | r3
        L_0x00ea:
            java.lang.String r0 = "accessibility_display_magnification_navbar_enabled"
            boolean r0 = r6.a((java.lang.String) r0)
            if (r0 == 0) goto L_0x00f6
            r3 = 262144(0x40000, double:1.295163E-318)
            long r1 = r1 | r3
        L_0x00f6:
            java.lang.String r0 = "accessibility_captioning_enabled"
            boolean r0 = r6.a((java.lang.String) r0)
            if (r0 == 0) goto L_0x0102
            r3 = 524288(0x80000, double:2.590327E-318)
            long r1 = r1 | r3
        L_0x0102:
            java.lang.String r0 = "accessibility_display_daltonizer_enabled"
            boolean r0 = r6.a((java.lang.String) r0)
            if (r0 == 0) goto L_0x010e
            r3 = 1048576(0x100000, double:5.180654E-318)
            long r1 = r1 | r3
        L_0x010e:
            java.lang.String r0 = "accessibility_autoclick_enabled"
            boolean r0 = r6.a((java.lang.String) r0)
            if (r0 == 0) goto L_0x011a
            r3 = 2097152(0x200000, double:1.0361308E-317)
            long r1 = r1 | r3
        L_0x011a:
            java.lang.String r0 = "accessibility_large_pointer_icon"
            boolean r0 = r6.a((java.lang.String) r0)
            if (r0 == 0) goto L_0x0126
            r3 = 4194304(0x400000, double:2.0722615E-317)
            long r1 = r1 | r3
        L_0x0126:
            java.lang.String r0 = "reduce_bright_colors_activated"
            boolean r0 = r6.a((java.lang.String) r0)
            if (r0 == 0) goto L_0x0132
            r3 = 8388608(0x800000, double:4.144523E-317)
            long r1 = r1 | r3
        L_0x0132:
            java.lang.String r0 = "reduce_bright_colors_persist_across_reboots"
            boolean r0 = r6.a((java.lang.String) r0)
            if (r0 == 0) goto L_0x013e
            r3 = 16777216(0x1000000, double:8.289046E-317)
            long r1 = r1 | r3
        L_0x013e:
            java.lang.String r0 = "tty_mode_enabled"
            boolean r0 = r6.a((java.lang.String) r0)
            if (r0 == 0) goto L_0x014a
            r3 = 33554432(0x2000000, double:1.6578092E-316)
            long r1 = r1 | r3
        L_0x014a:
            java.lang.String r0 = "rtt_calling_mode"
            boolean r0 = r6.a((java.lang.String) r0)
            if (r0 == 0) goto L_0x0156
            r3 = 67108864(0x4000000, double:3.31561842E-316)
            long r1 = r1 | r3
        L_0x0156:
            java.lang.String r0 = "accessibility_floating_menu_fade_enabled"
            boolean r0 = r6.a((java.lang.String) r0)
            if (r0 == 0) goto L_0x0162
            r3 = 134217728(0x8000000, double:6.63123685E-316)
            long r1 = r1 | r3
        L_0x0162:
            java.lang.String r0 = "accessibility_show_window_magnification_prompt"
            boolean r0 = r6.a((java.lang.String) r0)
            if (r0 == 0) goto L_0x016e
            r3 = 268435456(0x10000000, double:1.32624737E-315)
            long r1 = r1 | r3
        L_0x016e:
            java.lang.String r0 = "accessibility_floating_menu_migration_tooltip_prompt"
            boolean r0 = r6.a((java.lang.String) r0)
            if (r0 == 0) goto L_0x017a
            r3 = 536870912(0x20000000, double:2.652494739E-315)
            long r1 = r1 | r3
        L_0x017a:
            java.lang.String r0 = "accessibility_magnification_mode"
            int r0 = r6.b((java.lang.String) r0)
            r3 = 1
            if (r0 != 0) goto L_0x0188
            r4 = 1073741824(0x40000000, double:5.304989477E-315)
        L_0x0186:
            long r1 = r1 | r4
            goto L_0x01a2
        L_0x0188:
            if (r0 != r3) goto L_0x0190
            r4 = 2147483648(0x80000000, double:1.0609978955E-314)
            goto L_0x0186
        L_0x0190:
            r4 = 2
            if (r0 != r4) goto L_0x0199
            r4 = 4294967296(0x100000000, double:2.121995791E-314)
            goto L_0x0186
        L_0x0199:
            r4 = 3
            if (r0 != r4) goto L_0x01a2
            r4 = 8589934592(0x200000000, double:4.243991582E-314)
            goto L_0x0186
        L_0x01a2:
            java.lang.String r0 = "accessibility_button_mode"
            int r0 = r6.b((java.lang.String) r0)
            if (r0 != 0) goto L_0x01b1
            r4 = 17179869184(0x400000000, double:8.4879831639E-314)
        L_0x01af:
            long r1 = r1 | r4
            goto L_0x01b9
        L_0x01b1:
            if (r0 != r3) goto L_0x01b9
            r4 = 34359738368(0x800000000, double:1.69759663277E-313)
            goto L_0x01af
        L_0x01b9:
            java.lang.String r0 = "accessibility_floating_menu_size"
            int r0 = r6.b((java.lang.String) r0)
            if (r0 != 0) goto L_0x01c8
            r4 = 68719476736(0x1000000000, double:3.39519326554E-313)
        L_0x01c6:
            long r1 = r1 | r4
            goto L_0x01d0
        L_0x01c8:
            if (r0 != r3) goto L_0x01d0
            r4 = 137438953472(0x2000000000, double:6.7903865311E-313)
            goto L_0x01c6
        L_0x01d0:
            java.lang.String r0 = "accessibility_floating_menu_icon_type"
            int r0 = r6.b((java.lang.String) r0)
            if (r0 != 0) goto L_0x01df
            r3 = 274877906944(0x4000000000, double:1.358077306218E-312)
        L_0x01dd:
            long r1 = r1 | r3
            goto L_0x01e7
        L_0x01df:
            if (r0 != r3) goto L_0x01e7
            r3 = 549755813888(0x8000000000, double:2.716154612436E-312)
            goto L_0x01dd
        L_0x01e7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.l.d():long");
    }

    private String g() {
        int orientation = AppLovinSdkUtils.getOrientation(this.f11718c);
        if (orientation == 1) {
            return "portrait";
        }
        return orientation == 2 ? "landscape" : "none";
    }

    private c h() {
        c cVar = new c();
        Intent registerReceiver = this.f11718c.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        int intExtra = registerReceiver != null ? registerReceiver.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1) : -1;
        int intExtra2 = registerReceiver != null ? registerReceiver.getIntExtra("scale", -1) : -1;
        if (intExtra <= 0 || intExtra2 <= 0) {
            cVar.f11728b = -1;
        } else {
            cVar.f11728b = (int) ((((float) intExtra) / ((float) intExtra2)) * 100.0f);
        }
        cVar.f11727a = registerReceiver != null ? registerReceiver.getIntExtra("status", -1) : -1;
        boolean z10 = false;
        if (x3.d()) {
            if (Settings.Global.getInt(this.f11718c.getContentResolver(), "stay_on_while_plugged_in", -1) > 0) {
                z10 = true;
            }
            cVar.f11729c = Boolean.valueOf(z10);
        } else {
            if (((registerReceiver.getIntExtra("plugged", -1) & 1) | 14) > 0) {
                z10 = true;
            }
            cVar.f11729c = Boolean.valueOf(z10);
        }
        return cVar;
    }

    private String i() {
        TelephonyManager telephonyManager = (TelephonyManager) this.f11718c.getSystemService("phone");
        if (telephonyManager == null) {
            return MaxReward.DEFAULT_LABEL;
        }
        try {
            return telephonyManager.getNetworkOperatorName();
        } catch (Throwable th) {
            if (!t.a()) {
                return MaxReward.DEFAULT_LABEL;
            }
            this.f11717b.a("DataCollector", "Unable to collect carrier", th);
            return MaxReward.DEFAULT_LABEL;
        }
    }

    private String k() {
        TelephonyManager telephonyManager = (TelephonyManager) this.f11718c.getSystemService("phone");
        return telephonyManager != null ? telephonyManager.getSimCountryIso().toUpperCase(Locale.ENGLISH) : MaxReward.DEFAULT_LABEL;
    }

    private String m() {
        if (!x3.h()) {
            return null;
        }
        try {
            StringBuilder sb2 = new StringBuilder();
            LocaleList locales = this.f11718c.getResources().getConfiguration().getLocales();
            for (int i10 = 0; i10 < locales.size(); i10++) {
                sb2.append(locales.get(i10));
                sb2.append(",");
            }
            if (sb2.length() > 0 && sb2.charAt(sb2.length() - 1) == ',') {
                sb2.deleteCharAt(sb2.length() - 1);
            }
            return sb2.toString();
        } catch (Throwable unused) {
            return null;
        }
    }

    private Integer n() {
        AudioManager audioManager = (AudioManager) this.f11718c.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        if (audioManager == null) {
            return null;
        }
        try {
            return Integer.valueOf((int) (((float) audioManager.getStreamVolume(3)) * ((Float) this.f11716a.a(oj.f10324i4)).floatValue()));
        } catch (Throwable th) {
            this.f11716a.L();
            if (t.a()) {
                this.f11716a.L().a("DataCollector", "Unable to collect device volume", th);
            }
            return null;
        }
    }

    private float o() {
        try {
            return Settings.System.getFloat(this.f11718c.getContentResolver(), "font_scale");
        } catch (Settings.SettingNotFoundException e10) {
            if (!t.a()) {
                return -1.0f;
            }
            this.f11717b.a("DataCollector", "Error collecting font scale", e10);
            return -1.0f;
        }
    }

    private boolean p() {
        SensorManager sensorManager = (SensorManager) this.f11718c.getSystemService("sensor");
        return (sensorManager == null || sensorManager.getDefaultSensor(4) == null) ? false : true;
    }

    private Map q() {
        HashMap hashMap = new HashMap();
        CollectionUtils.putIntegerIfValid("IABTCF_gdprApplies", this.f11716a.m0().g(), hashMap);
        CollectionUtils.putStringIfValid("IABTCF_TCString", this.f11716a.m0().k(), hashMap);
        CollectionUtils.putStringIfValid("IABTCF_AddtlConsent", this.f11716a.m0().c(), hashMap);
        return hashMap;
    }

    private Boolean r() {
        AudioManager audioManager = (AudioManager) this.f11718c.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        if (audioManager == null) {
            return null;
        }
        return Boolean.valueOf(audioManager.isMusicActive());
    }

    private Boolean s() {
        AudioManager audioManager = (AudioManager) this.f11718c.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        if (audioManager == null) {
            return null;
        }
        return Boolean.valueOf(audioManager.isSpeakerphoneOn());
    }

    private String t() {
        TelephonyManager telephonyManager = (TelephonyManager) this.f11718c.getSystemService("phone");
        if (telephonyManager == null) {
            return MaxReward.DEFAULT_LABEL;
        }
        try {
            String networkOperator = telephonyManager.getNetworkOperator();
            return networkOperator.substring(0, Math.min(3, networkOperator.length()));
        } catch (Throwable th) {
            if (!t.a()) {
                return MaxReward.DEFAULT_LABEL;
            }
            this.f11717b.a("DataCollector", "Unable to collect mobile country code", th);
            return MaxReward.DEFAULT_LABEL;
        }
    }

    private String u() {
        TelephonyManager telephonyManager = (TelephonyManager) this.f11718c.getSystemService("phone");
        if (telephonyManager == null) {
            return MaxReward.DEFAULT_LABEL;
        }
        try {
            String networkOperator = telephonyManager.getNetworkOperator();
            return networkOperator.substring(Math.min(3, networkOperator.length()));
        } catch (Throwable th) {
            if (!t.a()) {
                return MaxReward.DEFAULT_LABEL;
            }
            this.f11717b.a("DataCollector", "Unable to collect mobile network code", th);
            return MaxReward.DEFAULT_LABEL;
        }
    }

    private String w() {
        AudioManager audioManager = (AudioManager) this.f11718c.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        if (audioManager == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        if (x3.g()) {
            for (AudioDeviceInfo type : audioManager.getDevices(2)) {
                sb2.append(type.getType());
                sb2.append(",");
            }
        } else {
            if (audioManager.isWiredHeadsetOn()) {
                sb2.append(3);
                sb2.append(",");
            }
            if (audioManager.isBluetoothScoOn()) {
                sb2.append(7);
                sb2.append(",");
            }
            if (audioManager.isBluetoothA2dpOn()) {
                sb2.append(8);
            }
        }
        if (sb2.length() > 0 && sb2.charAt(sb2.length() - 1) == ',') {
            sb2.deleteCharAt(sb2.length() - 1);
        }
        String sb3 = sb2.toString();
        if (TextUtils.isEmpty(sb3) && t.a()) {
            this.f11717b.a("DataCollector", "No sound outputs detected");
        }
        return sb3;
    }

    private Map x() {
        PackageInfo packageInfo;
        HashMap hashMap = new HashMap();
        PackageManager packageManager = this.f11718c.getPackageManager();
        ApplicationInfo applicationInfo = this.f11718c.getApplicationInfo();
        long lastModified = new File(applicationInfo.sourceDir).lastModified();
        String str = null;
        try {
            packageInfo = packageManager.getPackageInfo(this.f11718c.getPackageName(), 0);
            try {
                str = packageManager.getInstallerPackageName(applicationInfo.packageName);
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            packageInfo = null;
        }
        hashMap.put("app_name", packageManager.getApplicationLabel(applicationInfo));
        Object obj = MaxReward.DEFAULT_LABEL;
        hashMap.put("app_version", packageInfo != null ? packageInfo.versionName : obj);
        hashMap.put("app_version_code", Integer.valueOf(packageInfo != null ? packageInfo.versionCode : -1));
        hashMap.put("package_name", applicationInfo.packageName);
        hashMap.put("vz", StringUtils.toShortSHA1Hash(applicationInfo.packageName));
        if (str == null) {
            str = obj;
        }
        hashMap.put("installer_name", str);
        hashMap.put("tg", xp.a(this.f11716a));
        hashMap.put("debug", Boolean.valueOf(zp.c(this.f11716a)));
        hashMap.put("ia", Long.valueOf(lastModified));
        hashMap.put("alts_ms", Long.valueOf(k.j()));
        hashMap.put("j8", Boolean.valueOf(k.B0()));
        hashMap.put("ps_tpg", Boolean.valueOf(th.d(this.f11718c)));
        hashMap.put("ps_apg", Boolean.valueOf(th.b(this.f11718c)));
        hashMap.put("ps_capg", Boolean.valueOf(th.c(this.f11718c)));
        hashMap.put("ps_aipg", Boolean.valueOf(th.a(this.f11718c)));
        k kVar = this.f11716a;
        qj qjVar = qj.f11002f;
        Long l10 = (Long) kVar.a(qjVar);
        if (l10 != null) {
            hashMap.put("ia_v2", l10);
        } else {
            this.f11716a.b(qjVar, (Object) Long.valueOf(lastModified));
        }
        hashMap.put("sdk_version", AppLovinSdk.VERSION);
        hashMap.put("omid_sdk_version", this.f11716a.Y().c());
        CollectionUtils.putStringIfValid("ad_review_sdk_version", v.b(), hashMap);
        hashMap.put("api_did", this.f11716a.a(oj.f10303g));
        if (packageInfo != null) {
            obj = Long.valueOf(packageInfo.firstInstallTime);
        }
        hashMap.put("first_install_v3_ms", obj);
        hashMap.put("target_sdk", Integer.valueOf(applicationInfo.targetSdkVersion));
        hashMap.put("epv", Integer.valueOf(zp.f()));
        return hashMap;
    }

    private Map y() {
        HashMap hashMap = new HashMap(34);
        hashMap.put("api_level", Integer.valueOf(Build.VERSION.SDK_INT));
        hashMap.put("brand", Build.MANUFACTURER);
        hashMap.put("brand_name", Build.BRAND);
        hashMap.put("hardware", Build.HARDWARE);
        hashMap.put("sim", Boolean.valueOf(AppLovinSdkUtils.isEmulator()));
        hashMap.put("aida", Boolean.valueOf(l0.a()));
        hashMap.put("locale", Locale.getDefault().toString());
        hashMap.put("model", Build.MODEL);
        hashMap.put("os", Build.VERSION.RELEASE);
        hashMap.put("platform", v());
        hashMap.put("revision", Build.DEVICE);
        hashMap.put("tz_offset", Double.valueOf(z()));
        hashMap.put("gy", Boolean.valueOf(p()));
        hashMap.put("country_code", k());
        hashMap.put("mcc", t());
        hashMap.put("mnc", u());
        hashMap.put("carrier", i());
        hashMap.put("is_tablet", Boolean.valueOf(AppLovinSdkUtils.isTablet(this.f11718c)));
        hashMap.put("tv", Boolean.valueOf(AppLovinSdkUtils.isTv(this.f11718c)));
        hashMap.put("pc", Integer.valueOf(Runtime.getRuntime().availableProcessors()));
        hashMap.put("hdr", K());
        hashMap.put("supported_abis", H());
        DisplayMetrics displayMetrics = this.f11718c.getResources().getDisplayMetrics();
        if (displayMetrics != null) {
            hashMap.put("adns", Float.valueOf(displayMetrics.density));
            hashMap.put("adnsd", Integer.valueOf(displayMetrics.densityDpi));
            hashMap.put("xdpi", Float.valueOf(displayMetrics.xdpi));
            hashMap.put("ydpi", Float.valueOf(displayMetrics.ydpi));
            Point b10 = x3.b(this.f11718c);
            hashMap.put("screen_size_in", Double.valueOf(Math.sqrt(Math.pow((double) b10.x, 2.0d) + Math.pow((double) b10.y, 2.0d)) / ((double) displayMetrics.xdpi)));
            x3.a a10 = x3.a(this.f11718c, this.f11716a);
            if (a10 != null) {
                hashMap.put("tl_cr", Integer.valueOf(a10.c()));
                hashMap.put("tr_cr", Integer.valueOf(a10.d()));
                hashMap.put("bl_cr", Integer.valueOf(a10.a()));
                hashMap.put("br_cr", Integer.valueOf(a10.b()));
            }
        }
        hashMap.put("bt_ms", Long.valueOf(System.currentTimeMillis() - SystemClock.elapsedRealtime()));
        hashMap.put("tbalsi_ms", Long.valueOf(this.f11716a.J() - k.j()));
        CollectionUtils.putBooleanIfValid("psase", Boolean.valueOf(th.e(this.f11718c)), hashMap);
        CollectionUtils.putStringIfValid("process_name", zp.b(this.f11718c), hashMap);
        CollectionUtils.putBooleanIfValid("is_main_process", zp.g(this.f11718c), hashMap);
        try {
            PackageInfo packageInfo = this.f11718c.getPackageManager().getPackageInfo("com.android.vending", 0);
            hashMap.put("ps_version", packageInfo.versionName);
            hashMap.put("ps_version_code", Integer.valueOf(packageInfo.versionCode));
        } catch (Throwable unused) {
            hashMap.put("ps_version", MaxReward.DEFAULT_LABEL);
            hashMap.put("ps_version_code", -1);
        }
        a((Map) hashMap);
        return hashMap;
    }

    private double z() {
        return ((double) Math.round((((double) TimeZone.getDefault().getOffset(new Date().getTime())) * 10.0d) / 3600000.0d)) / 10.0d;
    }

    public Map A() {
        Map map = CollectionUtils.map(this.f11721f);
        map.put("first_install", Boolean.valueOf(this.f11716a.z0()));
        map.put("first_install_v2", Boolean.valueOf(!this.f11716a.w0()));
        map.put("test_ads", Boolean.valueOf(this.f11722g));
        map.put("muted", Boolean.valueOf(this.f11716a.g0().isMuted()));
        if (((Boolean) this.f11716a.a(oj.K3)).booleanValue()) {
            CollectionUtils.putStringIfValid("cuid", this.f11716a.t0().c(), map);
        }
        if (((Boolean) this.f11716a.a(oj.N3)).booleanValue()) {
            map.put("compass_random_token", this.f11716a.p());
        }
        if (((Boolean) this.f11716a.a(oj.P3)).booleanValue()) {
            map.put("applovin_random_token", this.f11716a.c0());
        }
        if (this.f11716a.r0() != null) {
            String name = this.f11716a.r0().getName();
            if (StringUtils.isValidString(name)) {
                map.put("user_segment_name", name);
            }
        }
        map.putAll(q());
        if (this.f11716a.b0() != null) {
            CollectionUtils.putJsonArrayIfValid("ps_topics", this.f11716a.b0().a(), map);
        }
        return map;
    }

    public b B() {
        return (b) f11715j.get();
    }

    /* access modifiers changed from: protected */
    public String C() {
        String encodeToString = Base64.encodeToString(new JSONObject(E()).toString().getBytes(Charset.defaultCharset()), 2);
        return ((Boolean) this.f11716a.a(oj.f10349l5)).booleanValue() ? qi.b(encodeToString, zp.a(this.f11716a), qi.a.a(((Integer) this.f11716a.a(oj.f10357m5)).intValue()), this.f11716a.d0(), this.f11716a) : encodeToString;
    }

    public String D() {
        ActivityManager activityManager = (ActivityManager) this.f11718c.getSystemService("activity");
        if (activityManager == null) {
            return null;
        }
        return activityManager.getDeviceConfigurationInfo().getGlEsVersion();
    }

    public Map F() {
        return CollectionUtils.map(this.f11721f);
    }

    public Map G() {
        return CollectionUtils.map(this.f11719d);
    }

    public boolean L() {
        return this.f11722g;
    }

    public Map N() {
        if (!this.f11716a.g0().isLocationCollectionEnabled() || !((Boolean) this.f11716a.a(oj.I4)).booleanValue()) {
            return null;
        }
        HashMap hashMap = new HashMap();
        s K = this.f11716a.K();
        boolean e10 = K.e();
        hashMap.put("loc_services_enabled", Boolean.valueOf(e10));
        if (!e10) {
            return hashMap;
        }
        hashMap.put("loc_auth", Boolean.valueOf(K.c()));
        if (K.d()) {
            double a10 = K.a();
            k kVar = this.f11716a;
            oj ojVar = oj.K4;
            hashMap.put("loc_lat", zp.a(a10, ((Integer) kVar.a(ojVar)).intValue()));
            hashMap.put("loc_long", zp.a(K.b(), ((Integer) this.f11716a.a(ojVar)).intValue()));
        }
        return hashMap;
    }

    public void O() {
        sm l02 = this.f11716a.l0();
        dm dmVar = new dm(this.f11716a, new a());
        sm.b bVar = sm.b.OTHER;
        l02.a((xl) dmVar, bVar);
        this.f11716a.l0().a((xl) new kn(this.f11716a, true, "setDeviceVolume", new h1(this)), bVar);
    }

    public void P() {
        synchronized (this.f11720e) {
            a(this.f11719d);
        }
    }

    public Map e() {
        HashMap hashMap = new HashMap();
        hashMap.put("sc", this.f11716a.a(oj.f10383q));
        hashMap.put("sc2", this.f11716a.a(oj.f10391r));
        hashMap.put("sc3", this.f11716a.a(oj.f10399s));
        hashMap.put("server_installed_at", this.f11716a.a(oj.f10407t));
        CollectionUtils.putStringIfValid("persisted_data", (String) this.f11716a.a(qj.H), hashMap);
        return hashMap;
    }

    public l0.a f() {
        List<String> list;
        l0.a b10 = l0.b(this.f11718c);
        if (b10 == null) {
            return new l0.a();
        }
        if (((Boolean) this.f11716a.a(oj.I3)).booleanValue()) {
            if (b10.c() && !((Boolean) this.f11716a.a(oj.H3)).booleanValue()) {
                b10.a(MaxReward.DEFAULT_LABEL);
            }
            f11714i.set(b10);
        } else {
            b10 = new l0.a();
        }
        String str = null;
        if (this.f11716a.C0().get()) {
            list = this.f11716a.g0().getTestDeviceAdvertisingIds();
        } else {
            list = this.f11716a.I() != null ? this.f11716a.I().getTestDeviceAdvertisingIds() : null;
        }
        if (list != null) {
            String a10 = b10.a();
            if (StringUtils.isValidString(a10)) {
                this.f11722g = list.contains(a10);
            }
            b B = B();
            if (B != null) {
                str = B.f11725a;
            }
            if (StringUtils.isValidString(str)) {
                this.f11722g = list.contains(str) | this.f11722g;
            }
        } else {
            this.f11722g = false;
        }
        return b10;
    }

    public Map j() {
        b4.d a10 = this.f11716a.r().a();
        if (a10 == null) {
            return null;
        }
        HashMap hashMap = new HashMap(4);
        hashMap.put("lrm_ts_ms", String.valueOf(a10.c()));
        hashMap.put("lrm_url", a10.d());
        hashMap.put("lrm_ct_ms", String.valueOf(a10.a()));
        hashMap.put("lrm_rs", String.valueOf(a10.b()));
        return hashMap;
    }

    public Map l() {
        return a(false);
    }

    public String v() {
        return AppLovinSdkUtils.isFireOS(this.f11718c) ? "fireos" : "android";
    }

    /* access modifiers changed from: protected */
    public void a(AppLovinBidTokenCollectionListener appLovinBidTokenCollectionListener) {
        this.f11716a.l0().a((xl) new kn(this.f11716a, ((Boolean) this.f11716a.a(oj.V3)).booleanValue(), "DataCollector", new i1(this, appLovinBidTokenCollectionListener)), sm.b.CORE);
    }

    public Map a(Map map, boolean z10, boolean z11) {
        HashMap hashMap = new HashMap(64);
        Map a10 = a(z10);
        Map A = A();
        Map j10 = j();
        Map N = N();
        Map k02 = this.f11716a.k0();
        if (z11) {
            hashMap.put("device_info", a10);
            hashMap.put("app_info", A);
            if (j10 != null) {
                hashMap.put("connection_info", j10);
            }
            if (map != null) {
                hashMap.put("ad_info", map);
            }
            if (N != null) {
                hashMap.put("location_info", N);
            }
            if (k02 != null && !k02.isEmpty()) {
                hashMap.put("targeting_data", k02);
            }
        } else {
            hashMap.putAll(a10);
            hashMap.putAll(A);
            if (j10 != null) {
                hashMap.putAll(j10);
            }
            if (map != null) {
                hashMap.putAll(map);
            }
            if (N != null) {
                hashMap.putAll(N);
            }
            if (k02 != null && !k02.isEmpty()) {
                hashMap.putAll(k02);
            }
        }
        hashMap.put("accept", "custom_size,launch_app,video");
        hashMap.put("format", "json");
        CollectionUtils.putStringIfValid("mediation_provider", this.f11716a.Q(), hashMap);
        CollectionUtils.putStringIfValid("mediation_provider_v2", this.f11716a.A(), hashMap);
        CollectionUtils.putStringIfValid("plugin_version", (String) this.f11716a.a(oj.U3), hashMap);
        CollectionUtils.putLongIfValid("tssf_ms", Long.valueOf(this.f11716a.o0()), hashMap);
        if (!((Boolean) this.f11716a.a(oj.f10333j5)).booleanValue()) {
            hashMap.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f11716a.d0());
        }
        hashMap.putAll(e());
        if (((Boolean) this.f11716a.a(oj.L4)).booleanValue()) {
            ba F = this.f11716a.F();
            hashMap.put("li", Long.valueOf(F.b(aa.f6343e)));
            hashMap.put("si", Long.valueOf(F.b(aa.f6346h)));
            hashMap.put("mad", Long.valueOf(F.b(aa.f6344f)));
            hashMap.put("msad", Long.valueOf(F.b(aa.f6347i)));
            hashMap.put("pf", Long.valueOf(F.b(aa.f6351m)));
            hashMap.put("mpf", Long.valueOf(F.b(aa.f6358t)));
            hashMap.put("gpf", Long.valueOf(F.b(aa.f6352n)));
            hashMap.put("asoac", Long.valueOf(F.b(aa.f6356r)));
        }
        hashMap.put("rid", UUID.randomUUID().toString());
        return hashMap;
    }

    private String c(String str) {
        int length = str.length();
        int[] iArr = {11, 12, 10, 3, 2, 1, 15, 10, 15, 14};
        char[] cArr = new char[length];
        for (int i10 = 0; i10 < length; i10++) {
            cArr[i10] = str.charAt(i10);
            for (int i11 = 9; i11 >= 0; i11--) {
                cArr[i10] = (char) (cArr[i10] ^ iArr[i11]);
            }
        }
        return new String(cArr);
    }

    private int b(String str) {
        try {
            return Settings.Secure.getInt(this.f11718c.getContentResolver(), str);
        } catch (Throwable unused) {
            return -1;
        }
    }

    private boolean b() {
        String str = Build.TAGS;
        return str != null && str.contains(c("lz}$blpz"));
    }

    public Map a(boolean z10) {
        Map map;
        synchronized (this.f11720e) {
            map = CollectionUtils.map(this.f11719d);
        }
        return a(map, z10);
    }

    private void a(Map map) {
        if (((Boolean) this.f11716a.a(oj.f10277c4)).booleanValue() && !map.containsKey("af")) {
            map.put("af", Long.valueOf(d()));
        }
        if (((Boolean) this.f11716a.a(oj.f10285d4)).booleanValue() && !map.containsKey("font")) {
            map.put("font", Float.valueOf(o()));
        }
        if (((Boolean) this.f11716a.a(oj.f10340k4)).booleanValue() && zp.d(this.f11716a)) {
            tr.a(this.f11716a);
        }
        if (((Boolean) this.f11716a.a(oj.f10444x4)).booleanValue()) {
            tr.b(this.f11716a);
        }
        if (((Boolean) this.f11716a.a(oj.f10332j4)).booleanValue() && !map.containsKey("sua")) {
            map.put("sua", System.getProperty("http.agent"));
        }
        if (((Boolean) this.f11716a.a(oj.f10300f4)).booleanValue() && !map.containsKey("network_restricted")) {
            map.put("network_restricted", Boolean.valueOf(J()));
        }
        if (((Boolean) this.f11716a.a(oj.f10364n4)).booleanValue()) {
            boolean z10 = true;
            boolean z11 = this.f11718c.getResources().getConfiguration().keyboard == 2;
            boolean hasSystemFeature = this.f11718c.getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE");
            boolean hasSystemFeature2 = this.f11718c.getPackageManager().hasSystemFeature("android.hardware.type.pc");
            if (!z11 || (!hasSystemFeature && !hasSystemFeature2)) {
                z10 = false;
            }
            map.put("is_pc", Boolean.valueOf(z10));
        }
        if (((Boolean) this.f11716a.a(oj.f10460z4)).booleanValue()) {
            CollectionUtils.putStringIfValid("oglv", D(), map);
        }
    }

    private Map a(Map map, boolean z10) {
        l0.a aVar;
        PowerManager powerManager;
        Map map2 = CollectionUtils.map(map);
        Point b10 = x3.b(this.f11718c);
        map2.put("dx", Integer.valueOf(b10.x));
        map2.put("dy", Integer.valueOf(b10.y));
        if (z10) {
            aVar = (l0.a) f11714i.get();
            if (aVar != null) {
                O();
            } else if (zp.h()) {
                aVar = new l0.a();
                map2.put("inc", Boolean.TRUE);
            } else {
                aVar = f();
            }
        } else {
            aVar = f();
        }
        String a10 = aVar.a();
        if (StringUtils.isValidString(a10)) {
            map2.put("idfa", a10);
        }
        map2.put("dnt", Boolean.valueOf(aVar.c()));
        map2.put("dnt_code", aVar.b().b());
        b bVar = (b) f11715j.get();
        if (((Boolean) this.f11716a.a(oj.J3)).booleanValue() && bVar != null) {
            map2.put("idfv", bVar.f11725a);
            map2.put("idfv_scope", Integer.valueOf(bVar.f11726b));
        }
        Boolean b11 = y3.b().b(this.f11718c);
        if (b11 != null) {
            map2.put("huc", b11);
        }
        Boolean b12 = y3.c().b(this.f11718c);
        if (b12 != null) {
            map2.put("aru", b12);
        }
        Boolean b13 = y3.a().b(this.f11718c);
        if (b13 != null) {
            map2.put("dns", b13);
        }
        if (((Boolean) this.f11716a.a(oj.W3)).booleanValue()) {
            c h10 = h();
            CollectionUtils.putIntegerIfValid("act", Integer.valueOf(h10.f11727a), map2);
            CollectionUtils.putIntegerIfValid("acm", Integer.valueOf(h10.f11728b), map2);
            CollectionUtils.putBooleanIfValid("sowpie", h10.f11729c, map2);
        }
        if (((Boolean) this.f11716a.a(oj.f10292e4)).booleanValue()) {
            map2.put("mtl", Integer.valueOf(this.f11716a.f0().getLastTrimMemoryLevel()));
        }
        if (((Boolean) this.f11716a.a(oj.f10316h4)).booleanValue()) {
            map2.put("adr", Boolean.valueOf(I()));
        }
        Integer n10 = z10 ? (Integer) this.f11723h.get() : n();
        if (n10 != null) {
            map2.put("volume", n10);
        }
        CollectionUtils.putBooleanIfValid("ma", r(), map2);
        CollectionUtils.putBooleanIfValid("spo", s(), map2);
        CollectionUtils.putBooleanIfValid("aif", Boolean.valueOf(!this.f11716a.f0().isApplicationPaused()), map2);
        CollectionUtils.putLongIfValid("af_ts_ms", Long.valueOf(this.f11716a.f0().getAppEnteredForegroundTimeMillis()), map2);
        CollectionUtils.putLongIfValid("ab_ts_ms", Long.valueOf(this.f11716a.f0().getAppEnteredBackgroundTimeMillis()), map2);
        try {
            map2.put("sb", Integer.valueOf((int) ((((float) Settings.System.getInt(this.f11718c.getContentResolver(), "screen_brightness")) / 255.0f) * 100.0f)));
        } catch (Settings.SettingNotFoundException e10) {
            if (t.a()) {
                this.f11717b.a("DataCollector", "Unable to collect screen brightness", e10);
            }
        }
        if (((Boolean) this.f11716a.a(oj.f10340k4)).booleanValue() && zp.d(this.f11716a)) {
            tr.a(this.f11716a);
            String a11 = tr.a();
            if (StringUtils.isValidString(a11)) {
                map2.put("ua", a11);
            }
        }
        if (((Boolean) this.f11716a.a(oj.f10444x4)).booleanValue()) {
            tr.b(this.f11716a);
            CollectionUtils.putIntegerIfValid("wvvc", Integer.valueOf(tr.d()), map2);
            CollectionUtils.putStringIfValid("wvv", tr.c(), map2);
            CollectionUtils.putStringIfValid("wvpn", tr.b(), map2);
        }
        if (((Boolean) this.f11716a.a(oj.Y3)).booleanValue()) {
            try {
                map2.put("fs", Long.valueOf(Environment.getDataDirectory().getFreeSpace()));
                map2.put("tds", Long.valueOf(Environment.getDataDirectory().getTotalSpace()));
            } catch (Throwable th) {
                map2.put("fs", -1);
                map2.put("tds", -1);
                if (t.a()) {
                    this.f11717b.a("DataCollector", "Unable to collect total & free space.", th);
                }
            }
        }
        if (((Boolean) this.f11716a.a(oj.Z3)).booleanValue()) {
            ActivityManager.MemoryInfo a12 = zp.a((ActivityManager) this.f11718c.getSystemService("activity"));
            if (a12 != null) {
                map2.put("fm", Long.valueOf(a12.availMem));
                map2.put("tm", Long.valueOf(a12.totalMem));
                map2.put("lmt", Long.valueOf(a12.threshold));
                map2.put("lm", Boolean.valueOf(a12.lowMemory));
            } else {
                map2.put("fm", -1);
                map2.put("tm", -1);
                map2.put("lmt", -1);
            }
        }
        if (((Boolean) this.f11716a.a(oj.f10262a4)).booleanValue() && x3.a("android.permission.READ_PHONE_STATE", this.f11718c) && x3.h()) {
            map2.put("rat", Integer.valueOf(((TelephonyManager) this.f11718c.getSystemService("phone")).getDataNetworkType()));
        }
        if (((Boolean) this.f11716a.a(oj.X3)).booleanValue()) {
            String w10 = w();
            if (!TextUtils.isEmpty(w10)) {
                map2.put("so", w10);
            }
        }
        map2.put("orientation_lock", g());
        if (((Boolean) this.f11716a.a(oj.f10269b4)).booleanValue()) {
            map2.put("vs", Boolean.valueOf(zp.j()));
        }
        if (x3.f() && (powerManager = (PowerManager) this.f11718c.getSystemService("power")) != null) {
            map2.put("lpm", Integer.valueOf(powerManager.isPowerSaveMode() ? 1 : 0));
        }
        if (((Boolean) this.f11716a.a(oj.f10348l4)).booleanValue() && this.f11716a.e0() != null) {
            map2.put("da", Float.valueOf(this.f11716a.e0().a()));
        }
        if (((Boolean) this.f11716a.a(oj.f10356m4)).booleanValue() && this.f11716a.e0() != null) {
            map2.put("dm", Float.valueOf(this.f11716a.e0().b()));
        }
        map2.put("mute_switch", Integer.valueOf(this.f11716a.m().a()));
        map2.put("network", c4.g(this.f11716a));
        String m10 = m();
        if (StringUtils.isValidString(m10)) {
            map2.put("kb", m10);
        }
        ArrayService l10 = this.f11716a.l();
        if (l10.isAppHubInstalled()) {
            if (l10.getIsDirectDownloadEnabled() != null) {
                map2.put("ah_dd_enabled", l10.getIsDirectDownloadEnabled());
            }
            map2.put("ah_sdk_version_code", Long.valueOf(l10.getAppHubVersionCode()));
            map2.put("ah_random_user_token", StringUtils.emptyIfNull(l10.getRandomUserToken()));
            map2.put("ah_sdk_package_name", StringUtils.emptyIfNull(l10.getAppHubPackageName()));
        }
        return map2;
    }

    public static void a(l0.a aVar) {
        f11714i.set(aVar);
    }

    public static void a(b bVar) {
        f11715j.set(bVar);
    }

    private boolean a(String str) {
        return b(str) == 1;
    }
}
