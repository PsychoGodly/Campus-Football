package com.startapp.sdk.adsbase.remoteconfig;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.applovin.mediation.MaxReward;
import com.startapp.a0;
import com.startapp.a1;
import com.startapp.b1;
import com.startapp.d9;
import com.startapp.f2;
import com.startapp.i3;
import com.startapp.j3;
import com.startapp.j9;
import com.startapp.p0;
import com.startapp.sdk.adsbase.AdsConstants;
import com.startapp.sdk.adsbase.consent.ConsentConfig;
import com.startapp.sdk.adsbase.crashreport.ANRRemoteConfig;
import com.startapp.sdk.adsbase.e;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest;
import com.startapp.sdk.common.Constants;
import com.startapp.sdk.components.ComponentLocator;
import com.startapp.sdk.insight.NetworkTestsMetaData;
import com.startapp.sdk.triggeredlinks.TriggeredLinksMetadata;
import com.startapp.z0;
import com.unity3d.services.core.network.model.HttpRequest;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Sta */
public class MetaData implements Serializable {

    /* renamed from: d  reason: collision with root package name */
    public static final Object f17063d = new Object();

    /* renamed from: e  reason: collision with root package name */
    public static final AtomicBoolean f17064e = new AtomicBoolean();

    /* renamed from: f  reason: collision with root package name */
    public static final Set<String> f17065f = new HashSet(Arrays.asList(new String[]{Constants.f17126a}));

    /* renamed from: g  reason: collision with root package name */
    public static final List<String> f17066g = Arrays.asList(new String[]{"https://adsmetadata.startappservice.com/adsmetadata/api/v1.0/", "https://adsmetadata.mobileadexchange.net/adsmetadata/api/v1.0/", "https://d26xw8rp6mlgfg.cloudfront.net/adsmetadata/api/v1.0/"});

    /* renamed from: h  reason: collision with root package name */
    public static final String f17067h = "https://req.startappservice.com/1.5/";

    /* renamed from: i  reason: collision with root package name */
    public static final int[] f17068i = {60, 60, 240};

    /* renamed from: j  reason: collision with root package name */
    public static final Set<String> f17069j = new HashSet(Arrays.asList(new String[]{"com.facebook.katana", "com.yandex.browser"}));

    /* renamed from: k  reason: collision with root package name */
    public static volatile MetaData f17070k = new MetaData();

    /* renamed from: l  reason: collision with root package name */
    public static a f17071l = null;
    private static final long serialVersionUID = 1334388150114613056L;
    private long IABDisplayImpressionDelayInSeconds;
    private long IABVideoImpressionDelayInSeconds;
    @d9(complex = true)
    private SimpleTokenConfig SimpleToken = new SimpleTokenConfig();
    private boolean SupportIABViewability;

    /* renamed from: a  reason: collision with root package name */
    public transient boolean f17072a;
    @d9(complex = true, name = "debug")
    private AdDebuggerMetadata adDebugger;
    private String adPlatformBannerHostSecured;
    public String adPlatformHostSecured;
    private String adPlatformNativeHostSecured;
    private String adPlatformOverlayHostSecured;
    private String adPlatformReturnHostSecured;
    private String adPlatformSplashHostSecured;
    @d9(complex = true)
    private AdvertisingIdResolverMetadata air;
    private boolean alwaysSendToken;
    @d9(complex = true)
    public AnalyticsConfig analytics;
    @d9(complex = true)
    private ANRRemoteConfig anrConfig;
    @d9(complex = true)
    private AppSessionConfig appSession;
    private String assetsBaseUrlSecured;

    /* renamed from: b  reason: collision with root package name */
    public transient boolean f17073b;
    @d9(complex = true)
    private BluetoothConfig btConfig;

    /* renamed from: c  reason: collision with root package name */
    public transient List<c> f17074c;
    private String calcProd;
    private boolean chromeCustomeTabsExternal;
    private boolean chromeCustomeTabsInternal;
    private boolean closeAdAfterClick;
    private boolean compressionEnabled;
    @d9(complex = true)
    private ConnectivityHelperMetadata connectivity;
    @d9(complex = true)
    private ConsentConfig consentDetails;
    private boolean disableSendAdvertisingId;
    private boolean dns;
    private double flh;
    @d9(complex = true)
    private ComponentInfoEventConfig httpClientInfoEvents;
    @d9(complex = true)
    private ImpressionsTrackingMetadata impressionsTracking;
    private boolean inAppBrowser;
    @d9(type = HashSet.class)
    private Set<String> installersList;
    private boolean isToken1Mandatory;
    private String lastVersion;
    @d9(complex = true)
    private LocationMetadata location;
    @d9(type = ArrayList.class)
    public List<String> metaDataHosts = f17066g;
    private String metadataUpdateVersion;
    @d9(complex = true)
    private MotionMetadata motion;
    @d9(complex = true)
    private NetworkDiagnosticConfig netDiag;
    @d9(complex = true)
    private NetworkTestsMetaData networkTests;
    private int notVisibleBannerReloadInterval;
    private boolean omSdkEnabled;
    private int[] periodicEventIntMin;
    private int[] periodicForegroundEventSec;
    private boolean periodicInfoEventEnabled;
    private boolean periodicMetaDataEnabled;
    private int periodicMetaDataIntervalInMinutes;
    @d9(type = HashSet.class)
    private Set<String> preInstalledPackages;
    private String profileId;
    @d9(complex = true)
    private RcdMetadata rcd;
    @d9(complex = true)
    private RscMetadata rsc;
    @d9(complex = true)
    private SensorsConfig sensorsConfig;
    private int sessionMaxBackgroundTime;
    private boolean simpleToken2;
    @d9(complex = true)
    private StaleDcConfig staleDc;
    private int stopAutoLoadAmount;
    private int stopAutoLoadPreCacheAmount;
    @d9(complex = true)
    private TelephonyMetadata telephony;
    public String trackDownloadHost;
    @d9(complex = true)
    private TriggeredLinksMetadata triggeredLinks;
    private boolean trueNetEnabled;
    private String vastRecorderHost;
    @d9(complex = true, name = "wvf")
    private WvfMetadata webViewFactory;
    private boolean webViewSecured;

    /* compiled from: Sta */
    public static class a implements b1.b {

        /* renamed from: a  reason: collision with root package name */
        public Context f17075a;

        /* renamed from: b  reason: collision with root package name */
        public String f17076b;

        public a(Context context, String str) {
            this.f17075a = context;
            this.f17076b = str;
        }

        public void a(Bitmap bitmap, int i10) {
            if (bitmap != null) {
                Context context = this.f17075a;
                String str = this.f17076b;
                Map<String, Bitmap> map = a1.f15597a;
                ComponentLocator.a(context).j().execute(new z0(str, ".png", bitmap, context));
            }
        }
    }

    public MetaData() {
        String str = f17067h;
        this.adPlatformHostSecured = str;
        this.trackDownloadHost = str;
        this.sessionMaxBackgroundTime = 1800;
        this.profileId = null;
        this.installersList = f17065f;
        this.preInstalledPackages = f17069j;
        this.simpleToken2 = true;
        this.alwaysSendToken = true;
        this.isToken1Mandatory = true;
        this.compressionEnabled = false;
        this.periodicMetaDataEnabled = false;
        this.periodicMetaDataIntervalInMinutes = 360;
        this.periodicInfoEventEnabled = false;
        this.periodicEventIntMin = f17068i;
        this.inAppBrowser = true;
        this.SupportIABViewability = true;
        this.IABDisplayImpressionDelayInSeconds = 1;
        this.IABVideoImpressionDelayInSeconds = 2;
        this.sensorsConfig = new SensorsConfig();
        this.btConfig = new BluetoothConfig();
        this.assetsBaseUrlSecured = MaxReward.DEFAULT_LABEL;
        this.notVisibleBannerReloadInterval = 3600;
        this.analytics = new AnalyticsConfig();
        this.f17072a = false;
        this.f17073b = false;
        this.f17074c = new ArrayList();
        this.metadataUpdateVersion = "4.10.12";
        this.dns = false;
        this.stopAutoLoadAmount = 3;
        this.stopAutoLoadPreCacheAmount = 3;
        this.trueNetEnabled = false;
        this.webViewSecured = true;
        this.omSdkEnabled = false;
        this.chromeCustomeTabsInternal = true;
        this.chromeCustomeTabsExternal = true;
        this.disableSendAdvertisingId = false;
        this.networkTests = new NetworkTestsMetaData();
        this.staleDc = new StaleDcConfig();
        this.telephony = new TelephonyMetadata();
        this.anrConfig = new ANRRemoteConfig();
        this.impressionsTracking = null;
        this.connectivity = new ConnectivityHelperMetadata();
        this.appSession = new AppSessionConfig();
    }

    public static void a(MetaData metaData) {
        synchronized (f17063d) {
            metaData.f17074c.addAll(f17070k.f17074c);
            f17070k = metaData;
        }
    }

    public static MetaData w() {
        return f17070k;
    }

    public NetworkDiagnosticConfig A() {
        return this.netDiag;
    }

    public NetworkTestsMetaData B() {
        return this.networkTests;
    }

    public int C() {
        return this.notVisibleBannerReloadInterval;
    }

    public int D() {
        return this.periodicMetaDataIntervalInMinutes;
    }

    public Set<String> E() {
        Set<String> set = this.preInstalledPackages;
        if (set == null) {
            set = f17069j;
        }
        return Collections.unmodifiableSet(set);
    }

    public String F() {
        return this.profileId;
    }

    public RcdMetadata G() {
        return this.rcd;
    }

    public RscMetadata H() {
        return this.rsc;
    }

    public SensorsConfig I() {
        return this.sensorsConfig;
    }

    public long J() {
        return TimeUnit.SECONDS.toMillis((long) this.sessionMaxBackgroundTime);
    }

    public SimpleTokenConfig K() {
        return this.SimpleToken;
    }

    public StaleDcConfig L() {
        return this.staleDc;
    }

    public int M() {
        return this.stopAutoLoadAmount;
    }

    public int N() {
        return this.stopAutoLoadPreCacheAmount;
    }

    public TelephonyMetadata O() {
        return this.telephony;
    }

    public TriggeredLinksMetadata P() {
        return this.triggeredLinks;
    }

    public String Q() {
        return this.vastRecorderHost;
    }

    public WvfMetadata R() {
        return this.webViewFactory;
    }

    public boolean S() {
        return this.alwaysSendToken;
    }

    public boolean T() {
        return this.compressionEnabled;
    }

    public boolean U() {
        Map<Activity, Integer> map = j9.f15982a;
        return this.inAppBrowser;
    }

    public boolean V() {
        return this.omSdkEnabled;
    }

    public boolean W() {
        return this.periodicForegroundEventSec != null;
    }

    public boolean X() {
        return this.periodicInfoEventEnabled;
    }

    public boolean Y() {
        return this.periodicMetaDataEnabled;
    }

    public boolean Z() {
        return this.SupportIABViewability;
    }

    public boolean a0() {
        return this.isToken1Mandatory;
    }

    public int b(Context context) {
        return a(context, this.periodicEventIntMin);
    }

    public AdDebuggerMetadata c() {
        return this.adDebugger;
    }

    public String d() {
        String str = this.adPlatformHostSecured;
        return str != null ? str : f17067h;
    }

    public AdvertisingIdResolverMetadata e() {
        return this.air;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MetaData metaData = (MetaData) obj;
        if (this.sessionMaxBackgroundTime != metaData.sessionMaxBackgroundTime || this.simpleToken2 != metaData.simpleToken2 || this.alwaysSendToken != metaData.alwaysSendToken || this.isToken1Mandatory != metaData.isToken1Mandatory || this.compressionEnabled != metaData.compressionEnabled || this.periodicMetaDataEnabled != metaData.periodicMetaDataEnabled || this.periodicMetaDataIntervalInMinutes != metaData.periodicMetaDataIntervalInMinutes || this.periodicInfoEventEnabled != metaData.periodicInfoEventEnabled || this.inAppBrowser != metaData.inAppBrowser || this.SupportIABViewability != metaData.SupportIABViewability || this.IABDisplayImpressionDelayInSeconds != metaData.IABDisplayImpressionDelayInSeconds || this.IABVideoImpressionDelayInSeconds != metaData.IABVideoImpressionDelayInSeconds || this.notVisibleBannerReloadInterval != metaData.notVisibleBannerReloadInterval || this.dns != metaData.dns || this.stopAutoLoadAmount != metaData.stopAutoLoadAmount || this.stopAutoLoadPreCacheAmount != metaData.stopAutoLoadPreCacheAmount || this.trueNetEnabled != metaData.trueNetEnabled || this.webViewSecured != metaData.webViewSecured || this.omSdkEnabled != metaData.omSdkEnabled || this.chromeCustomeTabsInternal != metaData.chromeCustomeTabsInternal || this.chromeCustomeTabsExternal != metaData.chromeCustomeTabsExternal || this.closeAdAfterClick != metaData.closeAdAfterClick || this.disableSendAdvertisingId != metaData.disableSendAdvertisingId || Double.compare(this.flh, metaData.flh) != 0 || !j9.a(this.SimpleToken, metaData.SimpleToken) || !j9.a(this.consentDetails, metaData.consentDetails) || !j9.a(this.calcProd, metaData.calcProd) || !j9.a(this.metaDataHosts, metaData.metaDataHosts) || !j9.a(this.adPlatformHostSecured, metaData.adPlatformHostSecured) || !j9.a(this.trackDownloadHost, metaData.trackDownloadHost) || !j9.a(this.vastRecorderHost, metaData.vastRecorderHost) || !j9.a(this.adPlatformBannerHostSecured, metaData.adPlatformBannerHostSecured) || !j9.a(this.adPlatformSplashHostSecured, metaData.adPlatformSplashHostSecured) || !j9.a(this.adPlatformReturnHostSecured, metaData.adPlatformReturnHostSecured) || !j9.a(this.adPlatformOverlayHostSecured, metaData.adPlatformOverlayHostSecured) || !j9.a(this.adPlatformNativeHostSecured, metaData.adPlatformNativeHostSecured) || !j9.a(this.profileId, metaData.profileId) || !j9.a(this.installersList, metaData.installersList) || !j9.a(this.preInstalledPackages, metaData.preInstalledPackages) || !Arrays.equals(this.periodicEventIntMin, metaData.periodicEventIntMin) || !Arrays.equals(this.periodicForegroundEventSec, metaData.periodicForegroundEventSec) || !j9.a(this.sensorsConfig, metaData.sensorsConfig) || !j9.a(this.btConfig, metaData.btConfig) || !j9.a(this.assetsBaseUrlSecured, metaData.assetsBaseUrlSecured) || !j9.a(this.httpClientInfoEvents, metaData.httpClientInfoEvents) || !j9.a(this.analytics, metaData.analytics) || !j9.a(this.metadataUpdateVersion, metaData.metadataUpdateVersion) || !j9.a(this.networkTests, metaData.networkTests) || !j9.a(this.triggeredLinks, metaData.triggeredLinks) || !j9.a(this.rsc, metaData.rsc) || !j9.a(this.rcd, metaData.rcd) || !j9.a(this.netDiag, metaData.netDiag) || !j9.a(this.staleDc, metaData.staleDc) || !j9.a(this.motion, metaData.motion) || !j9.a(this.air, metaData.air) || !j9.a(this.telephony, metaData.telephony) || !j9.a(this.anrConfig, metaData.anrConfig) || !j9.a(this.location, metaData.location) || !j9.a(this.impressionsTracking, metaData.impressionsTracking) || !j9.a(this.connectivity, metaData.connectivity) || !j9.a(this.adDebugger, metaData.adDebugger) || !j9.a(this.webViewFactory, metaData.webViewFactory) || !j9.a(this.appSession, metaData.appSession) || !j9.a(this.lastVersion, metaData.lastVersion)) {
            return false;
        }
        return true;
    }

    public ANRRemoteConfig f() {
        return this.anrConfig;
    }

    public AppSessionConfig g() {
        return this.appSession;
    }

    public String h() {
        String str = this.assetsBaseUrlSecured;
        return str != null ? str : MaxReward.DEFAULT_LABEL;
    }

    public int hashCode() {
        Object[] objArr = {this.SimpleToken, this.consentDetails, this.calcProd, this.metaDataHosts, this.adPlatformHostSecured, this.trackDownloadHost, this.vastRecorderHost, this.adPlatformBannerHostSecured, this.adPlatformSplashHostSecured, this.adPlatformReturnHostSecured, this.adPlatformOverlayHostSecured, this.adPlatformNativeHostSecured, Integer.valueOf(this.sessionMaxBackgroundTime), this.profileId, this.installersList, this.preInstalledPackages, Boolean.valueOf(this.simpleToken2), Boolean.valueOf(this.alwaysSendToken), Boolean.valueOf(this.isToken1Mandatory), Boolean.valueOf(this.compressionEnabled), Boolean.valueOf(this.periodicMetaDataEnabled), Integer.valueOf(this.periodicMetaDataIntervalInMinutes), Boolean.valueOf(this.periodicInfoEventEnabled), this.periodicEventIntMin, this.periodicForegroundEventSec, Boolean.valueOf(this.inAppBrowser), Boolean.valueOf(this.SupportIABViewability), Long.valueOf(this.IABDisplayImpressionDelayInSeconds), Long.valueOf(this.IABVideoImpressionDelayInSeconds), this.sensorsConfig, this.btConfig, this.assetsBaseUrlSecured, this.httpClientInfoEvents, Integer.valueOf(this.notVisibleBannerReloadInterval), this.analytics, this.metadataUpdateVersion, Boolean.valueOf(this.dns), Integer.valueOf(this.stopAutoLoadAmount), Integer.valueOf(this.stopAutoLoadPreCacheAmount), Boolean.valueOf(this.trueNetEnabled), Boolean.valueOf(this.webViewSecured), Boolean.valueOf(this.omSdkEnabled), Boolean.valueOf(this.chromeCustomeTabsInternal), Boolean.valueOf(this.chromeCustomeTabsExternal), Boolean.valueOf(this.closeAdAfterClick), Boolean.valueOf(this.disableSendAdvertisingId), Double.valueOf(this.flh), this.networkTests, this.triggeredLinks, this.rsc, this.rcd, this.netDiag, this.staleDc, this.motion, this.air, this.telephony, this.anrConfig, this.location, this.impressionsTracking, this.connectivity, this.adDebugger, this.webViewFactory, this.appSession, this.lastVersion};
        Map<Activity, Integer> map = j9.f15982a;
        return Arrays.deepHashCode(objArr);
    }

    public BluetoothConfig i() {
        return this.btConfig;
    }

    public String j() {
        return this.calcProd;
    }

    public boolean k() {
        return this.chromeCustomeTabsExternal;
    }

    public boolean l() {
        return this.chromeCustomeTabsInternal;
    }

    public boolean m() {
        return this.closeAdAfterClick;
    }

    public ConnectivityHelperMetadata n() {
        return this.connectivity;
    }

    public ConsentConfig o() {
        return this.consentDetails;
    }

    public boolean p() {
        return this.disableSendAdvertisingId;
    }

    public String q() {
        int indexOf;
        String d10 = f17070k.d();
        String str = (Build.VERSION.SDK_INT > 26 || this.webViewSecured) ? HttpRequest.DEFAULT_SCHEME : "http";
        if (d10.startsWith(str + "://") || (indexOf = d10.indexOf(58)) == -1) {
            return d10;
        }
        StringBuilder a10 = p0.a(str);
        a10.append(d10.substring(indexOf));
        return a10.toString();
    }

    public ComponentInfoEventConfig r() {
        return this.httpClientInfoEvents;
    }

    public long s() {
        return this.IABDisplayImpressionDelayInSeconds;
    }

    public long t() {
        return this.IABVideoImpressionDelayInSeconds;
    }

    public ImpressionsTrackingMetadata u() {
        return this.impressionsTracking;
    }

    public Set<String> v() {
        return this.installersList;
    }

    public String x() {
        return this.lastVersion;
    }

    public LocationMetadata y() {
        return this.location;
    }

    public MotionMetadata z() {
        return this.motion;
    }

    public static void c(Context context) {
        if (!f17064e.getAndSet(true)) {
            MetaData metaData = (MetaData) f2.a(context, "StartappMetadata", MetaData.class);
            MetaData metaData2 = new MetaData();
            if (metaData != null) {
                boolean b10 = j9.b(metaData, metaData2);
                if (!(true ^ "4.10.12".equals(metaData.metadataUpdateVersion)) && b10) {
                    i3 i3Var = new i3(j3.f15952e);
                    i3Var.f15914d = "metadata_null";
                    i3Var.a();
                }
                metaData.f17072a = false;
                metaData.f17073b = false;
                metaData.f17074c = new ArrayList();
                a(metaData);
            } else {
                a(metaData2);
            }
            f17070k.a();
        }
    }

    public boolean b() {
        return !this.dns;
    }

    public static void a(Context context, MetaData metaData, MetaDataRequest.RequestReason requestReason, boolean z10) {
        ArrayList arrayList;
        boolean z11;
        Handler handler;
        synchronized (f17063d) {
            arrayList = new ArrayList(f17070k.f17074c);
            f17070k.f17074c.clear();
            metaData.f17074c = f17070k.f17074c;
            metaData.a();
            metaData.metadataUpdateVersion = "4.10.12";
            f2.b(context, "StartappMetadata", metaData);
            z11 = false;
            metaData.f17072a = false;
            metaData.f17073b = true;
            if (!j9.a(f17070k, metaData)) {
                z10 = true;
            }
            f17070k = metaData;
            if (j9.e(context)) {
                try {
                    e e10 = ComponentLocator.a(context).e();
                    int i10 = e10.getInt("totalSessions", 0);
                    e.a a10 = e10.edit();
                    int i11 = i10 + 1;
                    a10.a("totalSessions", Integer.valueOf(i11));
                    a10.f17013a.putInt("totalSessions", i11);
                    a10.apply();
                } catch (Throwable th) {
                    i3.a(th);
                }
            }
            handler = null;
            f17071l = null;
        }
        if (Math.random() < f17070k.flh) {
            z11 = true;
        }
        if (z11) {
            handler = new Handler(Looper.getMainLooper());
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (z11) {
                handler.post(new b(cVar, requestReason, z10));
            } else {
                cVar.a(requestReason, z10);
            }
        }
    }

    public static void a(MetaDataRequest.RequestReason requestReason) {
        ArrayList arrayList;
        synchronized (f17063d) {
            arrayList = new ArrayList(f17070k.f17074c);
            f17070k.f17074c.clear();
            f17070k.f17072a = false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((c) it.next()).a(requestReason);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0015, code lost:
        if (r7 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0017, code lost:
        if (r8 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0019, code lost:
        r8.a(r6, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0051, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(android.content.Context r4, com.startapp.sdk.adsbase.model.AdPreferences r5, com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest.RequestReason r6, boolean r7, com.startapp.sdk.adsbase.remoteconfig.c r8, boolean r9) {
        /*
            r3 = this;
            r0 = 0
            if (r7 != 0) goto L_0x0008
            if (r8 == 0) goto L_0x0008
            r8.a(r6, r0)
        L_0x0008:
            java.lang.Object r1 = f17063d
            monitor-enter(r1)
            com.startapp.sdk.adsbase.remoteconfig.MetaData r2 = f17070k     // Catch:{ all -> 0x0052 }
            boolean r2 = r2.f17073b     // Catch:{ all -> 0x0052 }
            if (r2 == 0) goto L_0x001d
            if (r9 == 0) goto L_0x0014
            goto L_0x001d
        L_0x0014:
            monitor-exit(r1)     // Catch:{ all -> 0x0052 }
            if (r7 == 0) goto L_0x001c
            if (r8 == 0) goto L_0x001c
            r8.a(r6, r0)
        L_0x001c:
            return
        L_0x001d:
            com.startapp.sdk.adsbase.remoteconfig.MetaData r2 = f17070k     // Catch:{ all -> 0x0052 }
            boolean r2 = r2.f17072a     // Catch:{ all -> 0x0052 }
            if (r2 == 0) goto L_0x0025
            if (r9 == 0) goto L_0x0047
        L_0x0025:
            r9 = 1
            r3.f17072a = r9     // Catch:{ all -> 0x0052 }
            r3.f17073b = r0     // Catch:{ all -> 0x0052 }
            com.startapp.sdk.adsbase.remoteconfig.a r0 = f17071l     // Catch:{ all -> 0x0052 }
            if (r0 == 0) goto L_0x0030
            r0.f17117j = r9     // Catch:{ all -> 0x0052 }
        L_0x0030:
            com.startapp.sdk.adsbase.remoteconfig.a r9 = new com.startapp.sdk.adsbase.remoteconfig.a     // Catch:{ all -> 0x0052 }
            r9.<init>(r4, r5, r6)     // Catch:{ all -> 0x0052 }
            f17071l = r9     // Catch:{ all -> 0x0052 }
            com.startapp.sdk.components.ComponentLocator r4 = com.startapp.sdk.components.ComponentLocator.a((android.content.Context) r4)     // Catch:{ all -> 0x0052 }
            java.util.concurrent.Executor r5 = r4.r()     // Catch:{ all -> 0x0052 }
            com.startapp.o2 r6 = new com.startapp.o2     // Catch:{ all -> 0x0052 }
            r6.<init>(r9, r4)     // Catch:{ all -> 0x0052 }
            r5.execute(r6)     // Catch:{ all -> 0x0052 }
        L_0x0047:
            if (r7 == 0) goto L_0x0050
            if (r8 == 0) goto L_0x0050
            com.startapp.sdk.adsbase.remoteconfig.MetaData r4 = f17070k     // Catch:{ all -> 0x0052 }
            r4.a((com.startapp.sdk.adsbase.remoteconfig.c) r8)     // Catch:{ all -> 0x0052 }
        L_0x0050:
            monitor-exit(r1)     // Catch:{ all -> 0x0052 }
            return
        L_0x0052:
            r4 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0052 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.adsbase.remoteconfig.MetaData.a(android.content.Context, com.startapp.sdk.adsbase.model.AdPreferences, com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest$RequestReason, boolean, com.startapp.sdk.adsbase.remoteconfig.c, boolean):void");
    }

    public void a(c cVar) {
        synchronized (f17063d) {
            this.f17074c.add(cVar);
        }
    }

    public int a(Context context) {
        return a(context, this.periodicForegroundEventSec);
    }

    public static int a(Context context, int[] iArr) {
        if (iArr == null || iArr.length < 3) {
            iArr = f17068i;
        }
        if (a0.a(context, "android.permission.ACCESS_FINE_LOCATION")) {
            int i10 = iArr[0];
            if (i10 <= 0) {
                return f17068i[0];
            }
            return i10;
        } else if (!a0.a(context, "android.permission.ACCESS_COARSE_LOCATION")) {
            return iArr[2];
        } else {
            int i11 = iArr[1];
            if (i11 <= 0) {
                return f17068i[1];
            }
            return i11;
        }
    }

    public String a(AdPreferences.Placement placement) {
        int ordinal = placement.ordinal();
        if (ordinal == 1) {
            String str = this.adPlatformBannerHostSecured;
            return str != null ? str : d();
        } else if (ordinal == 7) {
            String str2 = this.adPlatformReturnHostSecured;
            return str2 != null ? str2 : d();
        } else if (ordinal == 3) {
            String str3 = this.adPlatformSplashHostSecured;
            return str3 != null ? str3 : d();
        } else if (ordinal == 4) {
            String str4 = this.adPlatformOverlayHostSecured;
            return str4 != null ? str4 : d();
        } else if (ordinal != 5) {
            return d();
        } else {
            String str5 = this.adPlatformNativeHostSecured;
            return str5 != null ? str5 : d();
        }
    }

    public void a() {
        ArrayList arrayList;
        this.adPlatformHostSecured = a(this.adPlatformHostSecured, f17067h);
        List<String> list = this.metaDataHosts;
        if (list != null) {
            arrayList = new ArrayList(list.size());
            for (String a10 : list) {
                String a11 = a(a10, (String) null);
                if (a11 != null) {
                    arrayList.add(a11);
                }
            }
        } else {
            arrayList = null;
        }
        this.metaDataHosts = arrayList;
        this.adPlatformBannerHostSecured = a(this.adPlatformBannerHostSecured, (String) null);
        this.adPlatformSplashHostSecured = a(this.adPlatformSplashHostSecured, (String) null);
        this.adPlatformReturnHostSecured = a(this.adPlatformReturnHostSecured, (String) null);
        this.adPlatformOverlayHostSecured = a(this.adPlatformOverlayHostSecured, (String) null);
        this.adPlatformNativeHostSecured = a(this.adPlatformNativeHostSecured, (String) null);
    }

    public final String a(String str, String str2) {
        return str != null ? str.replace("%AdPlatformProtocol%", "1.5") : str2;
    }

    public static void a(Context context, String str) {
        if (str != null && !str.equals(MaxReward.DEFAULT_LABEL)) {
            if (!a1.a(context, "close_button", ".png")) {
                Map<Activity, Integer> map = j9.f15982a;
                new b1(context, str + "close_button" + ".png", new a(context, "close_button"), 0).a();
            }
            Map<Activity, Integer> map2 = j9.f15982a;
            for (String str2 : AdsConstants.f16778h) {
                if (!a1.a(context, str2, ".png")) {
                    new b1(context, str + str2 + ".png", new a(context, str2), 0).a();
                }
            }
            Map<Activity, Integer> map3 = j9.f15982a;
            for (String str3 : AdsConstants.f16779i) {
                if (!a1.a(context, str3, ".png")) {
                    new b1(context, str + str3 + ".png", new a(context, str3), 0).a();
                }
            }
            if (!a1.a(context, "logo", ".png")) {
                new b1(context, str + "logo" + ".png", new a(context, "logo"), 0).a();
            }
        }
    }
}
