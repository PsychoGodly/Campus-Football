package com.applovin.impl;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxReward;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.util.Collection;
import java.util.HashSet;

public abstract class l0 {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f9110a = true;

    /* renamed from: b  reason: collision with root package name */
    private static final Object f9111b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private static final Collection f9112c = new HashSet();

    /* renamed from: d  reason: collision with root package name */
    private static boolean f9113d = false;

    /* renamed from: e  reason: collision with root package name */
    private static a f9114e = null;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private boolean f9115a;

        /* renamed from: b  reason: collision with root package name */
        private String f9116b = MaxReward.DEFAULT_LABEL;

        /* renamed from: c  reason: collision with root package name */
        private C0123a f9117c = C0123a.NOT_SET;

        /* renamed from: com.applovin.impl.l0$a$a  reason: collision with other inner class name */
        public enum C0123a {
            NOT_SET("dnt_not_set"),
            ON("dnt_on"),
            OFF("dnt_off");
            

            /* renamed from: a  reason: collision with root package name */
            private final String f9122a;

            private C0123a(String str) {
                this.f9122a = str;
            }

            public String b() {
                return this.f9122a;
            }
        }

        /* access modifiers changed from: protected */
        public boolean a(Object obj) {
            return obj instanceof a;
        }

        public C0123a b() {
            return this.f9117c;
        }

        public boolean c() {
            return this.f9115a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!aVar.a((Object) this) || c() != aVar.c()) {
                return false;
            }
            String a10 = a();
            String a11 = aVar.a();
            if (a10 != null ? !a10.equals(a11) : a11 != null) {
                return false;
            }
            C0123a b10 = b();
            C0123a b11 = aVar.b();
            return b10 != null ? b10.equals(b11) : b11 == null;
        }

        public int hashCode() {
            int i10 = c() ? 79 : 97;
            String a10 = a();
            int i11 = 43;
            int hashCode = ((i10 + 59) * 59) + (a10 == null ? 43 : a10.hashCode());
            C0123a b10 = b();
            int i12 = hashCode * 59;
            if (b10 != null) {
                i11 = b10.hashCode();
            }
            return i12 + i11;
        }

        public String toString() {
            return "AdvertisingInfoCollector.AdvertisingIdInformation(adTrackingLimited=" + c() + ", advertisingId=" + a() + ", dntCode=" + b() + ")";
        }

        public String a() {
            return this.f9116b;
        }

        public void a(boolean z10) {
            this.f9115a = z10;
        }

        public void a(String str) {
            this.f9116b = str;
        }

        public void a(C0123a aVar) {
            this.f9117c = aVar;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001e, code lost:
        if (r2 == false) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0020, code lost:
        r5 = c(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        f9113d = true;
        f9114e = r5;
        r5 = new java.util.HashSet(r1);
        r1.clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0031, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0032, code lost:
        r5 = r5.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003a, code lost:
        if (r5.hasNext() == false) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003c, code lost:
        ((java.util.concurrent.CountDownLatch) r5.next()).countDown();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0051, code lost:
        if (r3.await(60, java.util.concurrent.TimeUnit.SECONDS) != false) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0053, code lost:
        com.applovin.impl.sdk.t.h("DataCollector", "Could not collect Google Advertising ID - this will negatively impact your eCPMs! Please integrate the Google Play Services SDK into your application. More info can be found online at http://developer.android.com/google/play-services/setup.html. If you're sure you've integrated the SDK and are still seeing this message, you may need to add a ProGuard exception: -keep public class com.google.android.gms.** { public protected *; }: collection timeout");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005b, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x005c, code lost:
        com.applovin.impl.sdk.t.c("DataCollector", "Could not collect Google Advertising ID - this will negatively impact your eCPMs! Please integrate the Google Play Services SDK into your application. More info can be found online at http://developer.android.com/google/play-services/setup.html. If you're sure you've integrated the SDK and are still seeing this message, you may need to add a ProGuard exception: -keep public class com.google.android.gms.** { public protected *; }", r5);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.applovin.impl.l0.a a(android.content.Context r5) {
        /*
            com.applovin.impl.zp.a()
            java.lang.Object r0 = f9111b
            monitor-enter(r0)
            boolean r1 = f9113d     // Catch:{ all -> 0x006d }
            if (r1 == 0) goto L_0x000e
            com.applovin.impl.l0$a r5 = f9114e     // Catch:{ all -> 0x006d }
            monitor-exit(r0)     // Catch:{ all -> 0x006d }
            return r5
        L_0x000e:
            java.util.Collection r1 = f9112c     // Catch:{ all -> 0x006d }
            boolean r2 = r1.isEmpty()     // Catch:{ all -> 0x006d }
            java.util.concurrent.CountDownLatch r3 = new java.util.concurrent.CountDownLatch     // Catch:{ all -> 0x006d }
            r4 = 1
            r3.<init>(r4)     // Catch:{ all -> 0x006d }
            r1.add(r3)     // Catch:{ all -> 0x006d }
            monitor-exit(r0)     // Catch:{ all -> 0x006d }
            if (r2 == 0) goto L_0x0049
            com.applovin.impl.l0$a r5 = c(r5)
            monitor-enter(r0)
            f9113d = r4     // Catch:{ all -> 0x0046 }
            f9114e = r5     // Catch:{ all -> 0x0046 }
            java.util.HashSet r5 = new java.util.HashSet     // Catch:{ all -> 0x0046 }
            r5.<init>(r1)     // Catch:{ all -> 0x0046 }
            r1.clear()     // Catch:{ all -> 0x0046 }
            monitor-exit(r0)     // Catch:{ all -> 0x0046 }
            java.util.Iterator r5 = r5.iterator()
        L_0x0036:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0049
            java.lang.Object r0 = r5.next()
            java.util.concurrent.CountDownLatch r0 = (java.util.concurrent.CountDownLatch) r0
            r0.countDown()
            goto L_0x0036
        L_0x0046:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0046 }
            throw r5
        L_0x0049:
            r0 = 60
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x005b }
            boolean r5 = r3.await(r0, r5)     // Catch:{ InterruptedException -> 0x005b }
            if (r5 != 0) goto L_0x0063
            java.lang.String r5 = "DataCollector"
            java.lang.String r0 = "Could not collect Google Advertising ID - this will negatively impact your eCPMs! Please integrate the Google Play Services SDK into your application. More info can be found online at http://developer.android.com/google/play-services/setup.html. If you're sure you've integrated the SDK and are still seeing this message, you may need to add a ProGuard exception: -keep public class com.google.android.gms.** { public protected *; }: collection timeout"
            com.applovin.impl.sdk.t.h(r5, r0)     // Catch:{ InterruptedException -> 0x005b }
            goto L_0x0063
        L_0x005b:
            r5 = move-exception
            java.lang.String r0 = "DataCollector"
            java.lang.String r1 = "Could not collect Google Advertising ID - this will negatively impact your eCPMs! Please integrate the Google Play Services SDK into your application. More info can be found online at http://developer.android.com/google/play-services/setup.html. If you're sure you've integrated the SDK and are still seeing this message, you may need to add a ProGuard exception: -keep public class com.google.android.gms.** { public protected *; }"
            com.applovin.impl.sdk.t.c(r0, r1, r5)
        L_0x0063:
            java.lang.Object r5 = f9111b
            monitor-enter(r5)
            com.applovin.impl.l0$a r0 = f9114e     // Catch:{ all -> 0x006a }
            monitor-exit(r5)     // Catch:{ all -> 0x006a }
            return r0
        L_0x006a:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x006a }
            throw r0
        L_0x006d:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x006d }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.l0.a(android.content.Context):com.applovin.impl.l0$a");
    }

    public static a b(Context context) {
        return a(context);
    }

    private static a c(Context context) {
        a collectGoogleAdvertisingInfo = collectGoogleAdvertisingInfo(context);
        if (collectGoogleAdvertisingInfo == null) {
            collectGoogleAdvertisingInfo = collectFireOSAdvertisingInfo(context);
        }
        return collectGoogleAdvertisingInfo == null ? new a() : collectGoogleAdvertisingInfo;
    }

    private static a collectFireOSAdvertisingInfo(Context context) {
        a.C0123a aVar;
        if (f9110a) {
            try {
                ContentResolver contentResolver = context.getContentResolver();
                a aVar2 = new a();
                aVar2.a(StringUtils.emptyIfNull(Settings.Secure.getString(contentResolver, "advertising_id")));
                boolean z10 = Settings.Secure.getInt(contentResolver, "limit_ad_tracking") != 0;
                aVar2.a(z10);
                if (z10) {
                    aVar = a.C0123a.ON;
                } else {
                    aVar = a.C0123a.OFF;
                }
                aVar2.a(aVar);
                return aVar2;
            } catch (Settings.SettingNotFoundException e10) {
                t.c("DataCollector", "Unable to determine if Fire OS limited ad tracking is turned on", e10);
            } catch (Throwable th) {
                t.c("DataCollector", "Unable to collect Fire OS IDFA", th);
            }
        }
        f9110a = false;
        return null;
    }

    private static a collectGoogleAdvertisingInfo(Context context) {
        a.C0123a aVar;
        zp.a();
        if (a()) {
            try {
                a aVar2 = new a();
                AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
                boolean isLimitAdTrackingEnabled = advertisingIdInfo.isLimitAdTrackingEnabled();
                aVar2.a(isLimitAdTrackingEnabled);
                if (isLimitAdTrackingEnabled) {
                    aVar = a.C0123a.ON;
                } else {
                    aVar = a.C0123a.OFF;
                }
                aVar2.a(aVar);
                aVar2.a(advertisingIdInfo.getId());
                return aVar2;
            } catch (Throwable th) {
                if (AppLovinSdkUtils.isFireOS(context)) {
                    return null;
                }
                t.c("DataCollector", "Could not collect Google Advertising ID - this will negatively impact your eCPMs! Please integrate the Google Play Services SDK into your application. More info can be found online at http://developer.android.com/google/play-services/setup.html. If you're sure you've integrated the SDK and are still seeing this message, you may need to add a ProGuard exception: -keep public class com.google.android.gms.** { public protected *; }", th);
                return null;
            }
        } else if (AppLovinSdkUtils.isFireOS(context)) {
            return null;
        } else {
            t.h("DataCollector", "Could not collect Google Advertising ID - this will negatively impact your eCPMs! Please integrate the Google Play Services SDK into your application. More info can be found online at http://developer.android.com/google/play-services/setup.html. If you're sure you've integrated the SDK and are still seeing this message, you may need to add a ProGuard exception: -keep public class com.google.android.gms.** { public protected *; }");
            return null;
        }
    }

    public static boolean a() {
        return zp.a("com.google.android.gms.ads.identifier.AdvertisingIdClient");
    }
}
