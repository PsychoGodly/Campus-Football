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
import android.os.BatteryManager;
import android.os.Build;
import android.os.Environment;
import android.os.LocaleList;
import android.os.PowerManager;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.applovin.impl.c4;
import com.applovin.impl.dm;
import com.applovin.impl.kn;
import com.applovin.impl.l0;
import com.applovin.impl.oj;
import com.applovin.impl.qj;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sm;
import com.applovin.impl.x3;
import com.applovin.impl.xl;
import com.applovin.impl.zp;
import com.applovin.mediation.MaxReward;
import com.applovin.sdk.AppLovinEventTypes;
import com.applovin.sdk.AppLovinSdkUtils;
import com.unity3d.services.core.device.MimeTypes;
import java.io.File;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;

public class n {
    /* access modifiers changed from: private */
    public static final AtomicReference D = new AtomicReference();
    private static final AtomicReference E = new AtomicReference();
    private static final AtomicReference F = new AtomicReference();
    /* access modifiers changed from: private */
    public final int A;
    /* access modifiers changed from: private */
    public final k B;
    /* access modifiers changed from: private */
    public final Context C;

    /* renamed from: a  reason: collision with root package name */
    private final i f11750a = new i(this, (a) null);

    /* renamed from: b  reason: collision with root package name */
    private final j f11751b = new j(this, (a) null);

    /* renamed from: c  reason: collision with root package name */
    private final d f11752c = new d(this, (a) null);

    /* renamed from: d  reason: collision with root package name */
    private final e f11753d = new e(this, (a) null);

    /* renamed from: e  reason: collision with root package name */
    private final g f11754e = new g(this, (a) null);

    /* renamed from: f  reason: collision with root package name */
    private final h f11755f = new h(this, (a) null);

    /* renamed from: g  reason: collision with root package name */
    private final String f11756g;

    /* renamed from: h  reason: collision with root package name */
    private final String f11757h;

    /* renamed from: i  reason: collision with root package name */
    private final double f11758i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f11759j;

    /* renamed from: k  reason: collision with root package name */
    private String f11760k;

    /* renamed from: l  reason: collision with root package name */
    private long f11761l;

    /* renamed from: m  reason: collision with root package name */
    private final b f11762m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f11763n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public f f11764o;

    /* renamed from: p  reason: collision with root package name */
    private f f11765p;

    /* renamed from: q  reason: collision with root package name */
    private f f11766q;

    /* renamed from: r  reason: collision with root package name */
    private f f11767r;

    /* renamed from: s  reason: collision with root package name */
    private f f11768s;

    /* renamed from: t  reason: collision with root package name */
    private f f11769t;

    /* renamed from: u  reason: collision with root package name */
    private f f11770u;
    /* access modifiers changed from: private */

    /* renamed from: v  reason: collision with root package name */
    public final int f11771v;
    /* access modifiers changed from: private */

    /* renamed from: w  reason: collision with root package name */
    public final int f11772w;
    /* access modifiers changed from: private */

    /* renamed from: x  reason: collision with root package name */
    public final int f11773x;
    /* access modifiers changed from: private */

    /* renamed from: y  reason: collision with root package name */
    public final int f11774y;

    /* renamed from: z  reason: collision with root package name */
    private final int f11775z;

    class a implements dm.a {
        a() {
        }

        public void a(l0.a aVar) {
            n.D.set(aVar);
        }
    }

    public class b {

        /* renamed from: a  reason: collision with root package name */
        private final String f11777a;

        /* renamed from: b  reason: collision with root package name */
        private final String f11778b;

        /* renamed from: c  reason: collision with root package name */
        private final String f11779c;

        /* renamed from: d  reason: collision with root package name */
        private final String f11780d;

        /* renamed from: e  reason: collision with root package name */
        private final String f11781e;

        /* renamed from: f  reason: collision with root package name */
        private final Long f11782f;

        /* renamed from: g  reason: collision with root package name */
        private final long f11783g;

        /* renamed from: h  reason: collision with root package name */
        private final int f11784h;

        /* renamed from: i  reason: collision with root package name */
        private final int f11785i;

        /* synthetic */ b(n nVar, a aVar) {
            this();
        }

        public Long a() {
            return this.f11782f;
        }

        public long b() {
            return this.f11783g;
        }

        /* access modifiers changed from: protected */
        public Long c() {
            k d10 = n.this.B;
            qj qjVar = qj.f11002f;
            Long l10 = (Long) d10.a(qjVar);
            if (l10 != null) {
                return l10;
            }
            n.this.B.b(qjVar, (Object) Long.valueOf(this.f11783g));
            return null;
        }

        public String d() {
            return this.f11781e;
        }

        public String e() {
            return this.f11777a;
        }

        public String f() {
            return this.f11779c;
        }

        public int g() {
            return this.f11785i;
        }

        public String h() {
            return this.f11778b;
        }

        public int i() {
            return this.f11784h;
        }

        public String j() {
            return this.f11780d;
        }

        private b() {
            PackageManager packageManager = n.this.C.getPackageManager();
            ApplicationInfo applicationInfo = n.this.C.getApplicationInfo();
            File file = new File(applicationInfo.sourceDir);
            PackageInfo packageInfo = packageManager.getPackageInfo(n.this.C.getPackageName(), 0);
            this.f11777a = packageManager.getApplicationLabel(applicationInfo).toString();
            this.f11778b = packageInfo.versionName;
            this.f11784h = packageInfo.versionCode;
            String str = applicationInfo.packageName;
            this.f11779c = str;
            this.f11780d = StringUtils.toShortSHA1Hash(str);
            this.f11783g = file.lastModified();
            this.f11782f = Long.valueOf(packageInfo.firstInstallTime);
            this.f11785i = applicationInfo.targetSdkVersion;
            this.f11781e = packageManager.getInstallerPackageName(str);
        }
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        private final String f11787a;

        /* renamed from: b  reason: collision with root package name */
        private final int f11788b;

        public c(String str, int i10) {
            this.f11787a = str;
            this.f11788b = i10;
        }

        public String a() {
            return this.f11787a;
        }

        public int b() {
            return this.f11788b;
        }
    }

    protected class d {

        /* renamed from: a  reason: collision with root package name */
        private f f11789a;

        /* renamed from: b  reason: collision with root package name */
        private f f11790b;

        /* renamed from: c  reason: collision with root package name */
        private f f11791c;

        /* renamed from: d  reason: collision with root package name */
        private f f11792d;

        /* renamed from: e  reason: collision with root package name */
        private f f11793e;

        /* renamed from: f  reason: collision with root package name */
        private final AudioManager f11794f;

        /* synthetic */ d(n nVar, a aVar) {
            this();
        }

        /* access modifiers changed from: protected */
        public Integer a() {
            f fVar = this.f11789a;
            if (fVar != null && !fVar.b()) {
                Integer num = (Integer) this.f11789a.f11802a;
                num.intValue();
                return num;
            } else if (this.f11794f == null) {
                return null;
            } else {
                try {
                    f fVar2 = new f(n.this, Integer.valueOf((int) (((float) this.f11794f.getStreamVolume(3)) * ((Float) n.this.B.a(oj.f10324i4)).floatValue())), (long) n.this.f11772w, (a) null);
                    this.f11789a = fVar2;
                    Integer num2 = (Integer) fVar2.f11802a;
                    num2.intValue();
                    return num2;
                } catch (Throwable th) {
                    n.this.B.L();
                    if (t.a()) {
                        n.this.B.L().a("DataProvider", "Unable to collect device volume", th);
                    }
                    return null;
                }
            }
        }

        /* access modifiers changed from: protected */
        public int b() {
            f fVar = this.f11791c;
            if (fVar != null && !fVar.b()) {
                return ((Integer) this.f11791c.f11802a).intValue();
            }
            n nVar = n.this;
            f fVar2 = new f(nVar, Integer.valueOf(nVar.B.m().a()), (long) n.this.f11773x, (a) null);
            this.f11791c = fVar2;
            return ((Integer) fVar2.f11802a).intValue();
        }

        /* access modifiers changed from: protected */
        public String c() {
            f fVar = this.f11790b;
            if (fVar != null && !fVar.b()) {
                return (String) this.f11790b.f11802a;
            }
            if (this.f11794f == null) {
                return null;
            }
            StringBuilder sb2 = new StringBuilder();
            if (x3.g()) {
                for (AudioDeviceInfo type : this.f11794f.getDevices(2)) {
                    sb2.append(type.getType());
                    sb2.append(",");
                }
            } else {
                if (this.f11794f.isWiredHeadsetOn()) {
                    sb2.append(3);
                    sb2.append(",");
                }
                if (this.f11794f.isBluetoothScoOn()) {
                    sb2.append(7);
                    sb2.append(",");
                }
                if (this.f11794f.isBluetoothA2dpOn()) {
                    sb2.append(8);
                }
            }
            if (sb2.length() > 0 && sb2.charAt(sb2.length() - 1) == ',') {
                sb2.deleteCharAt(sb2.length() - 1);
            }
            String sb3 = sb2.toString();
            if (TextUtils.isEmpty(sb3)) {
                n.this.B.L();
                if (t.a()) {
                    n.this.B.L().a("DataProvider", "No sound outputs detected");
                }
            }
            n nVar = n.this;
            f fVar2 = new f(nVar, sb3, (long) nVar.f11774y, (a) null);
            this.f11790b = fVar2;
            return (String) fVar2.f11802a;
        }

        /* access modifiers changed from: protected */
        public Boolean d() {
            f fVar = this.f11792d;
            if (fVar == null || fVar.b()) {
                AudioManager audioManager = this.f11794f;
                if (audioManager == null) {
                    return null;
                }
                f fVar2 = new f(n.this, Boolean.valueOf(audioManager.isMusicActive()), (long) n.this.f11774y, (a) null);
                this.f11792d = fVar2;
                Boolean bool = (Boolean) fVar2.f11802a;
                bool.booleanValue();
                return bool;
            }
            Boolean bool2 = (Boolean) this.f11792d.f11802a;
            bool2.booleanValue();
            return bool2;
        }

        /* access modifiers changed from: protected */
        public Boolean e() {
            f fVar = this.f11793e;
            if (fVar == null || fVar.b()) {
                AudioManager audioManager = this.f11794f;
                if (audioManager == null) {
                    return null;
                }
                f fVar2 = new f(n.this, Boolean.valueOf(audioManager.isSpeakerphoneOn()), (long) n.this.f11774y, (a) null);
                this.f11793e = fVar2;
                Boolean bool = (Boolean) fVar2.f11802a;
                bool.booleanValue();
                return bool;
            }
            Boolean bool2 = (Boolean) this.f11793e.f11802a;
            bool2.booleanValue();
            return bool2;
        }

        private d() {
            this.f11794f = (AudioManager) n.this.C.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        }
    }

    protected class e {

        /* renamed from: a  reason: collision with root package name */
        private f f11796a;

        /* renamed from: b  reason: collision with root package name */
        private f f11797b;

        /* renamed from: c  reason: collision with root package name */
        private f f11798c;

        /* renamed from: d  reason: collision with root package name */
        private final Intent f11799d;

        /* renamed from: e  reason: collision with root package name */
        private BatteryManager f11800e;

        /* synthetic */ e(n nVar, a aVar) {
            this();
        }

        /* access modifiers changed from: protected */
        public Integer a() {
            int i10;
            BatteryManager batteryManager;
            f fVar = this.f11796a;
            if (fVar == null || fVar.b()) {
                if (!x3.f() || (batteryManager = this.f11800e) == null) {
                    Intent intent = this.f11799d;
                    if (intent == null) {
                        return null;
                    }
                    int intExtra = intent.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1);
                    int intExtra2 = this.f11799d.getIntExtra("scale", -1);
                    if (intExtra < 0 || intExtra2 < 0) {
                        return null;
                    }
                    i10 = (int) ((((float) intExtra) / ((float) intExtra2)) * 100.0f);
                } else {
                    i10 = batteryManager.getIntProperty(4);
                }
                f fVar2 = new f(n.this, Integer.valueOf(i10), (long) n.this.f11773x, (a) null);
                this.f11796a = fVar2;
                Integer num = (Integer) fVar2.f11802a;
                num.intValue();
                return num;
            }
            Integer num2 = (Integer) this.f11796a.f11802a;
            num2.intValue();
            return num2;
        }

        /* access modifiers changed from: protected */
        public Integer b() {
            int i10;
            BatteryManager batteryManager;
            f fVar = this.f11797b;
            if (fVar == null || fVar.b()) {
                if (!x3.i() || (batteryManager = this.f11800e) == null) {
                    Intent intent = this.f11799d;
                    if (intent == null || (i10 = intent.getIntExtra("status", -1)) < 0) {
                        return null;
                    }
                } else {
                    i10 = batteryManager.getIntProperty(6);
                }
                f fVar2 = new f(n.this, Integer.valueOf(i10), (long) n.this.f11773x, (a) null);
                this.f11797b = fVar2;
                Integer num = (Integer) fVar2.f11802a;
                num.intValue();
                return num;
            }
            Integer num2 = (Integer) this.f11797b.f11802a;
            num2.intValue();
            return num2;
        }

        /* access modifiers changed from: protected */
        public Boolean c() {
            f fVar = this.f11798c;
            if (fVar == null || fVar.b()) {
                boolean z10 = false;
                if (x3.d()) {
                    if (Settings.Global.getInt(n.this.C.getContentResolver(), "stay_on_while_plugged_in", -1) > 0) {
                        z10 = true;
                    }
                    this.f11798c = new f(n.this, Boolean.valueOf(z10), (long) n.this.f11773x, (a) null);
                } else {
                    Intent intent = this.f11799d;
                    if (intent == null) {
                        return null;
                    }
                    int intExtra = (intent.getIntExtra("plugged", -1) & 1) | 14;
                    n nVar = n.this;
                    if (intExtra > 0) {
                        z10 = true;
                    }
                    this.f11798c = new f(nVar, Boolean.valueOf(z10), (long) n.this.f11773x, (a) null);
                }
                Boolean bool = (Boolean) this.f11798c.f11802a;
                bool.booleanValue();
                return bool;
            }
            Boolean bool2 = (Boolean) this.f11798c.f11802a;
            bool2.booleanValue();
            return bool2;
        }

        private e() {
            this.f11799d = n.this.C.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (x3.f()) {
                this.f11800e = (BatteryManager) n.this.C.getSystemService("batterymanager");
            }
        }
    }

    private class f {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final Object f11802a;

        /* renamed from: b  reason: collision with root package name */
        private final long f11803b;

        /* synthetic */ f(n nVar, Object obj, long j10, a aVar) {
            this(obj, j10);
        }

        private f(Object obj, long j10) {
            this.f11802a = obj;
            this.f11803b = a() + j10;
        }

        private long a() {
            return System.currentTimeMillis() / 1000;
        }

        /* access modifiers changed from: private */
        public boolean b() {
            if (((Boolean) n.this.B.a(oj.G3)).booleanValue() && this.f11803b - a() > 0) {
                return false;
            }
            return true;
        }
    }

    protected class g {

        /* renamed from: a  reason: collision with root package name */
        private int f11805a;

        /* renamed from: b  reason: collision with root package name */
        private int f11806b;

        /* renamed from: c  reason: collision with root package name */
        private int f11807c;

        /* renamed from: d  reason: collision with root package name */
        private float f11808d;

        /* renamed from: e  reason: collision with root package name */
        private float f11809e;

        /* renamed from: f  reason: collision with root package name */
        private float f11810f;

        /* renamed from: g  reason: collision with root package name */
        private double f11811g;

        /* renamed from: h  reason: collision with root package name */
        private final Boolean f11812h;

        /* synthetic */ g(n nVar, a aVar) {
            this();
        }

        public float a() {
            return this.f11810f;
        }

        public int b() {
            return this.f11807c;
        }

        public int c() {
            return this.f11805a;
        }

        public int d() {
            return this.f11806b;
        }

        public Boolean e() {
            return this.f11812h;
        }

        public double f() {
            return this.f11811g;
        }

        public float g() {
            return this.f11808d;
        }

        public float h() {
            return this.f11809e;
        }

        private g() {
            this.f11812h = x3.i() ? Boolean.valueOf(n.this.C.getResources().getConfiguration().isScreenHdr()) : null;
            DisplayMetrics displayMetrics = n.this.C.getResources().getDisplayMetrics();
            if (displayMetrics != null) {
                this.f11810f = displayMetrics.density;
                this.f11808d = displayMetrics.xdpi;
                this.f11809e = displayMetrics.ydpi;
                this.f11807c = displayMetrics.densityDpi;
                Point b10 = x3.b(n.this.C);
                int i10 = b10.x;
                this.f11805a = i10;
                this.f11806b = b10.y;
                this.f11811g = Math.sqrt(Math.pow((double) i10, 2.0d) + Math.pow((double) this.f11806b, 2.0d)) / ((double) this.f11808d);
            }
        }
    }

    protected class h {

        /* renamed from: a  reason: collision with root package name */
        private long f11814a;

        /* renamed from: b  reason: collision with root package name */
        private f f11815b;

        /* renamed from: c  reason: collision with root package name */
        private f f11816c;

        /* renamed from: d  reason: collision with root package name */
        private f f11817d;

        /* renamed from: e  reason: collision with root package name */
        private final ActivityManager f11818e;

        /* synthetic */ h(n nVar, a aVar) {
            this();
        }

        /* access modifiers changed from: protected */
        public Long a() {
            f fVar = this.f11815b;
            if (fVar == null || fVar.b()) {
                ActivityManager.MemoryInfo a10 = zp.a(this.f11818e);
                if (a10 == null) {
                    return null;
                }
                f fVar2 = new f(n.this, Long.valueOf(a10.availMem), (long) n.this.f11771v, (a) null);
                this.f11815b = fVar2;
                Long l10 = (Long) fVar2.f11802a;
                l10.longValue();
                return l10;
            }
            Long l11 = (Long) this.f11815b.f11802a;
            l11.longValue();
            return l11;
        }

        /* access modifiers changed from: protected */
        public Long b() {
            f fVar = this.f11816c;
            if (fVar == null || fVar.b()) {
                ActivityManager.MemoryInfo a10 = zp.a(this.f11818e);
                if (a10 == null) {
                    return null;
                }
                f fVar2 = new f(n.this, Long.valueOf(a10.threshold), (long) n.this.f11771v, (a) null);
                this.f11816c = fVar2;
                Long l10 = (Long) fVar2.f11802a;
                l10.longValue();
                return l10;
            }
            Long l11 = (Long) this.f11816c.f11802a;
            l11.longValue();
            return l11;
        }

        public long c() {
            return this.f11814a;
        }

        /* access modifiers changed from: protected */
        public Boolean d() {
            f fVar = this.f11817d;
            if (fVar == null || fVar.b()) {
                ActivityManager.MemoryInfo a10 = zp.a(this.f11818e);
                if (a10 == null) {
                    return null;
                }
                f fVar2 = new f(n.this, Boolean.valueOf(a10.lowMemory), (long) n.this.f11771v, (a) null);
                this.f11817d = fVar2;
                Boolean bool = (Boolean) fVar2.f11802a;
                bool.booleanValue();
                return bool;
            }
            Boolean bool2 = (Boolean) this.f11817d.f11802a;
            bool2.booleanValue();
            return bool2;
        }

        private h() {
            ActivityManager.MemoryInfo a10;
            ActivityManager activityManager = (ActivityManager) n.this.C.getSystemService("activity");
            this.f11818e = activityManager;
            if (activityManager != null && (a10 = zp.a(activityManager)) != null) {
                this.f11814a = a10.totalMem;
            }
        }
    }

    protected class i {

        /* renamed from: a  reason: collision with root package name */
        private final PowerManager f11820a;

        /* synthetic */ i(n nVar, a aVar) {
            this();
        }

        /* access modifiers changed from: protected */
        public Integer a() {
            if (n.this.f11764o != null && !n.this.f11764o.b()) {
                Integer num = (Integer) n.this.f11764o.f11802a;
                num.intValue();
                return num;
            } else if (this.f11820a == null || !x3.f()) {
                return null;
            } else {
                n nVar = n.this;
                f unused = nVar.f11764o = new f(nVar, Integer.valueOf(this.f11820a.isPowerSaveMode() ? 1 : 0), (long) n.this.f11773x, (a) null);
                Integer num2 = (Integer) n.this.f11764o.f11802a;
                num2.intValue();
                return num2;
            }
        }

        private i() {
            this.f11820a = (PowerManager) n.this.C.getSystemService("power");
        }
    }

    protected class j {

        /* renamed from: a  reason: collision with root package name */
        private final TelephonyManager f11822a;

        /* renamed from: b  reason: collision with root package name */
        private String f11823b;

        /* renamed from: c  reason: collision with root package name */
        private String f11824c;

        /* renamed from: d  reason: collision with root package name */
        private String f11825d;

        /* renamed from: e  reason: collision with root package name */
        private String f11826e;

        /* renamed from: f  reason: collision with root package name */
        private String f11827f;

        /* renamed from: g  reason: collision with root package name */
        private f f11828g;

        /* synthetic */ j(n nVar, a aVar) {
            this();
        }

        public String a() {
            return this.f11825d;
        }

        public String b() {
            return this.f11824c;
        }

        /* access modifiers changed from: protected */
        public Integer c() {
            f fVar = this.f11828g;
            if (fVar != null && !fVar.b()) {
                Integer num = (Integer) this.f11828g.f11802a;
                num.intValue();
                return num;
            } else if (!x3.a("android.permission.READ_PHONE_STATE", n.this.C) || this.f11822a == null || !x3.h()) {
                return null;
            } else {
                f fVar2 = new f(n.this, Integer.valueOf(this.f11822a.getDataNetworkType()), (long) n.this.A, (a) null);
                this.f11828g = fVar2;
                Integer num2 = (Integer) fVar2.f11802a;
                num2.intValue();
                return num2;
            }
        }

        public String d() {
            return this.f11826e;
        }

        public String e() {
            return this.f11827f;
        }

        private j() {
            TelephonyManager telephonyManager = (TelephonyManager) n.this.C.getSystemService("phone");
            this.f11822a = telephonyManager;
            if (telephonyManager != null) {
                this.f11824c = telephonyManager.getSimCountryIso().toUpperCase(Locale.ENGLISH);
                try {
                    this.f11825d = telephonyManager.getNetworkOperatorName();
                } catch (Throwable th) {
                    n.this.B.L();
                    if (t.a()) {
                        n.this.B.L().a("DataProvider", "Unable to collect carrier", th);
                    }
                }
                try {
                    this.f11823b = this.f11822a.getNetworkOperator();
                } catch (Throwable th2) {
                    n.this.B.L();
                    if (t.a()) {
                        n.this.B.L().a("DataProvider", "Unable to collect get network operator", th2);
                    }
                }
                String str = this.f11823b;
                if (str != null) {
                    int min = Math.min(3, str.length());
                    this.f11826e = this.f11823b.substring(0, min);
                    this.f11827f = this.f11823b.substring(min);
                }
            }
        }
    }

    protected n(k kVar) {
        this.B = kVar;
        Context k10 = k.k();
        this.C = k10;
        this.f11771v = ((Integer) kVar.a(oj.C4)).intValue();
        this.f11772w = ((Integer) kVar.a(oj.D4)).intValue();
        this.f11773x = ((Integer) kVar.a(oj.E4)).intValue();
        this.f11774y = ((Integer) kVar.a(oj.F4)).intValue();
        this.f11775z = ((Integer) kVar.a(oj.G4)).intValue();
        this.A = ((Integer) kVar.a(oj.H4)).intValue();
        this.f11756g = AppLovinSdkUtils.isFireOS(k10) ? "fireos" : "android";
        int orientation = AppLovinSdkUtils.getOrientation(k10);
        if (orientation == 1) {
            this.f11757h = "portrait";
        } else if (orientation == 2) {
            this.f11757h = "landscape";
        } else {
            this.f11757h = "none";
        }
        this.f11758i = ((double) Math.round((((double) TimeZone.getDefault().getOffset(new Date().getTime())) * 10.0d) / 3600000.0d)) / 10.0d;
        SensorManager sensorManager = (SensorManager) k10.getSystemService("sensor");
        this.f11759j = (sensorManager == null || sensorManager.getDefaultSensor(4) == null) ? false : true;
        if (x3.h()) {
            LocaleList locales = k10.getResources().getConfiguration().getLocales();
            StringBuilder sb2 = new StringBuilder();
            for (int i10 = 0; i10 < locales.size(); i10++) {
                sb2.append(locales.get(i10));
                sb2.append(",");
            }
            if (sb2.length() > 0 && sb2.charAt(sb2.length() - 1) == ',') {
                sb2.deleteCharAt(sb2.length() - 1);
            }
            this.f11760k = sb2.toString();
        }
        try {
            this.f11761l = Environment.getDataDirectory().getTotalSpace();
        } catch (Throwable th) {
            kVar.L();
            if (t.a()) {
                kVar.L().a("DataProvider", "Unable to collect total disk space.", th);
            }
        }
        this.f11762m = new b(this, (a) null);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void I() {
        F.set(this.f11752c.a());
    }

    public long A() {
        return this.f11761l;
    }

    /* access modifiers changed from: protected */
    public Integer B() {
        return (Integer) F.get();
    }

    /* access modifiers changed from: protected */
    public boolean C() {
        boolean z10 = this.C.getResources().getConfiguration().keyboard == 2;
        boolean hasSystemFeature = this.C.getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE");
        boolean hasSystemFeature2 = this.C.getPackageManager().hasSystemFeature("android.hardware.type.pc");
        if (!z10 || (!hasSystemFeature && !hasSystemFeature2)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean D() {
        try {
            return b() || c();
        } catch (Throwable unused) {
            return false;
        }
    }

    public boolean E() {
        return this.f11759j;
    }

    /* access modifiers changed from: protected */
    public boolean F() {
        ConnectivityManager connectivityManager;
        if (!x3.h() || (connectivityManager = (ConnectivityManager) this.C.getSystemService("connectivity")) == null) {
            return false;
        }
        try {
            if (connectivityManager.getRestrictBackgroundStatus() == 3) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            this.B.L();
            if (t.a()) {
                this.B.L().a("DataProvider", "Unable to collect constrained network info.", th);
            }
            return false;
        }
    }

    public boolean G() {
        return this.f11763n;
    }

    /* access modifiers changed from: protected */
    public boolean H() {
        f fVar = this.f11766q;
        if (fVar != null && !fVar.b()) {
            return ((Boolean) this.f11766q.f11802a).booleanValue();
        }
        f fVar2 = new f(this, Boolean.valueOf(zp.j()), (long) this.f11774y, (a) null);
        this.f11766q = fVar2;
        return ((Boolean) fVar2.f11802a).booleanValue();
    }

    /* access modifiers changed from: protected */
    public void J() {
        sm l02 = this.B.l0();
        dm dmVar = new dm(this.B, new a());
        sm.b bVar = sm.b.OTHER;
        l02.a((xl) dmVar, bVar);
        this.B.l0().a((xl) new kn(this.B, true, "setDeviceVolume", new k1(this)), bVar);
    }

    public l0.a d() {
        List<String> list;
        l0.a b10 = l0.b(this.C);
        if (b10 == null) {
            return new l0.a();
        }
        if (((Boolean) this.B.a(oj.I3)).booleanValue()) {
            if (b10.c() && !((Boolean) this.B.a(oj.H3)).booleanValue()) {
                b10.a(MaxReward.DEFAULT_LABEL);
            }
            D.set(b10);
        } else {
            b10 = new l0.a();
        }
        String str = null;
        if (this.B.C0().get()) {
            list = this.B.g0().getTestDeviceAdvertisingIds();
        } else {
            list = this.B.I() != null ? this.B.I().getTestDeviceAdvertisingIds() : null;
        }
        if (list != null) {
            String a10 = b10.a();
            if (StringUtils.isValidString(a10)) {
                this.f11763n = list.contains(a10);
            }
            c h10 = h();
            if (h10 != null) {
                str = h10.a();
            }
            if (StringUtils.isValidString(str)) {
                this.f11763n = list.contains(str) | this.f11763n;
            }
        } else {
            this.f11763n = false;
        }
        return b10;
    }

    public d i() {
        return this.f11752c;
    }

    public e j() {
        return this.f11753d;
    }

    /* access modifiers changed from: protected */
    public Float k() {
        f fVar = this.f11767r;
        if (fVar != null && !fVar.b()) {
            Float f10 = (Float) this.f11767r.f11802a;
            f10.floatValue();
            return f10;
        } else if (this.B.e0() == null) {
            return null;
        } else {
            f fVar2 = new f(this, Float.valueOf(this.B.e0().a()), (long) this.f11771v, (a) null);
            this.f11767r = fVar2;
            Float f11 = (Float) fVar2.f11802a;
            f11.floatValue();
            return f11;
        }
    }

    /* access modifiers changed from: protected */
    public Float l() {
        f fVar = this.f11768s;
        if (fVar != null && !fVar.b()) {
            Float f10 = (Float) this.f11768s.f11802a;
            f10.floatValue();
            return f10;
        } else if (this.B.e0() == null) {
            return null;
        } else {
            f fVar2 = new f(this, Float.valueOf(this.B.e0().b()), (long) this.f11771v, (a) null);
            this.f11768s = fVar2;
            Float f11 = (Float) fVar2.f11802a;
            f11.floatValue();
            return f11;
        }
    }

    public g m() {
        return this.f11754e;
    }

    /* access modifiers changed from: protected */
    public float n() {
        try {
            return Settings.System.getFloat(this.C.getContentResolver(), "font_scale");
        } catch (Settings.SettingNotFoundException e10) {
            this.B.L();
            if (!t.a()) {
                return -1.0f;
            }
            this.B.L().a("DataProvider", "Error collecting font scale", e10);
            return -1.0f;
        }
    }

    /* access modifiers changed from: protected */
    public Long o() {
        f fVar = this.f11765p;
        if (fVar == null || fVar.b()) {
            try {
                f fVar2 = new f(this, Long.valueOf(Environment.getDataDirectory().getFreeSpace()), (long) this.f11774y, (a) null);
                this.f11765p = fVar2;
                Long l10 = (Long) fVar2.f11802a;
                l10.longValue();
                return l10;
            } catch (Throwable th) {
                this.B.L();
                if (!t.a()) {
                    return null;
                }
                this.B.L().a("DataProvider", "Unable to collect free space.", th);
                return null;
            }
        } else {
            Long l11 = (Long) this.f11765p.f11802a;
            l11.longValue();
            return l11;
        }
    }

    public String p() {
        return this.f11760k;
    }

    public h q() {
        return this.f11755f;
    }

    /* access modifiers changed from: protected */
    public String r() {
        f fVar = this.f11769t;
        if (fVar != null && !fVar.b()) {
            return (String) this.f11769t.f11802a;
        }
        f fVar2 = new f(this, c4.g(this.B), (long) this.A, (a) null);
        this.f11769t = fVar2;
        return (String) fVar2.f11802a;
    }

    public String s() {
        ActivityManager activityManager = (ActivityManager) this.C.getSystemService("activity");
        if (activityManager == null) {
            return null;
        }
        return activityManager.getDeviceConfigurationInfo().getGlEsVersion();
    }

    public String t() {
        return this.f11757h;
    }

    public String u() {
        return this.f11756g;
    }

    public i v() {
        return this.f11750a;
    }

    /* access modifiers changed from: protected */
    public Integer w() {
        f fVar = this.f11770u;
        if (fVar == null || fVar.b()) {
            try {
                f fVar2 = new f(this, Integer.valueOf((int) ((((float) Settings.System.getInt(this.C.getContentResolver(), "screen_brightness")) / 255.0f) * 100.0f)), (long) this.f11772w, (a) null);
                this.f11770u = fVar2;
                Integer num = (Integer) fVar2.f11802a;
                num.intValue();
                return num;
            } catch (Settings.SettingNotFoundException e10) {
                this.B.L();
                if (!t.a()) {
                    return null;
                }
                this.B.L().a("DataProvider", "Unable to collect screen brightness", e10);
                return null;
            }
        } else {
            Integer num2 = (Integer) this.f11770u.f11802a;
            num2.intValue();
            return num2;
        }
    }

    /* access modifiers changed from: protected */
    public JSONArray x() {
        if (x3.f()) {
            return CollectionUtils.toJSONArray(Build.SUPPORTED_ABIS);
        }
        JSONArray jSONArray = new JSONArray();
        JsonUtils.putStringIfValid(jSONArray, Build.CPU_ABI);
        JsonUtils.putStringIfValid(jSONArray, Build.CPU_ABI2);
        return jSONArray;
    }

    public j y() {
        return this.f11751b;
    }

    public double z() {
        return this.f11758i;
    }

    private boolean b() {
        String str = Build.TAGS;
        return str != null && str.contains(c("lz}$blpz"));
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

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x01aa  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x01c1  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x01c8  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x01d8  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x01df  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long e() {
        /*
            r6 = this;
            android.content.Context r0 = r6.C
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
            android.content.Context r0 = r6.C
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
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.n.e():long");
    }

    /* access modifiers changed from: protected */
    public l0.a f() {
        return (l0.a) D.get();
    }

    public b g() {
        return this.f11762m;
    }

    public c h() {
        return (c) E.get();
    }

    public static void a(c cVar) {
        E.set(cVar);
    }

    private int b(String str) {
        try {
            return Settings.Secure.getInt(this.C.getContentResolver(), str);
        } catch (Throwable unused) {
            return -1;
        }
    }

    public static void a(l0.a aVar) {
        D.set(aVar);
    }

    private boolean a(String str) {
        return b(str) == 1;
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
}
