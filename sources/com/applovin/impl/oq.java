package com.applovin.impl;

import android.net.Uri;
import android.webkit.MimeTypeMap;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class oq {

    /* renamed from: a  reason: collision with root package name */
    private List f10528a = Collections.emptyList();

    /* renamed from: b  reason: collision with root package name */
    private List f10529b = Collections.emptyList();

    /* renamed from: c  reason: collision with root package name */
    private int f10530c;

    /* renamed from: d  reason: collision with root package name */
    private Uri f10531d;

    /* renamed from: e  reason: collision with root package name */
    private final Set f10532e = new HashSet();

    /* renamed from: f  reason: collision with root package name */
    private hq f10533f;

    /* renamed from: g  reason: collision with root package name */
    private final Map f10534g = new HashMap();

    private oq(fq fqVar) {
        this.f10529b = fqVar.f();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x007a, code lost:
        r0 = r0.c("Icon");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.applovin.impl.oq a(com.applovin.impl.fs r4, com.applovin.impl.oq r5, com.applovin.impl.fq r6, com.applovin.impl.sdk.k r7) {
        /*
            if (r4 == 0) goto L_0x00de
            if (r6 == 0) goto L_0x00d6
            if (r7 == 0) goto L_0x00ce
            if (r5 == 0) goto L_0x0009
            goto L_0x000e
        L_0x0009:
            com.applovin.impl.oq r5 = new com.applovin.impl.oq     // Catch:{ all -> 0x00b0 }
            r5.<init>(r6)     // Catch:{ all -> 0x00b0 }
        L_0x000e:
            int r0 = r5.f10530c     // Catch:{ all -> 0x00b0 }
            if (r0 != 0) goto L_0x0026
            java.lang.String r0 = "Duration"
            com.applovin.impl.fs r0 = r4.c(r0)     // Catch:{ all -> 0x00b0 }
            if (r0 == 0) goto L_0x0026
            java.lang.String r0 = r0.d()     // Catch:{ all -> 0x00b0 }
            int r0 = a((java.lang.String) r0, (com.applovin.impl.sdk.k) r7)     // Catch:{ all -> 0x00b0 }
            if (r0 <= 0) goto L_0x0026
            r5.f10530c = r0     // Catch:{ all -> 0x00b0 }
        L_0x0026:
            java.lang.String r0 = "MediaFiles"
            com.applovin.impl.fs r0 = r4.c(r0)     // Catch:{ all -> 0x00b0 }
            if (r0 == 0) goto L_0x0043
            java.util.List r0 = a((com.applovin.impl.fs) r0, (com.applovin.impl.sdk.k) r7)     // Catch:{ all -> 0x00b0 }
            if (r0 == 0) goto L_0x0043
            int r1 = r0.size()     // Catch:{ all -> 0x00b0 }
            if (r1 <= 0) goto L_0x0043
            java.util.List r1 = r5.f10528a     // Catch:{ all -> 0x00b0 }
            if (r1 == 0) goto L_0x0041
            r0.addAll(r1)     // Catch:{ all -> 0x00b0 }
        L_0x0041:
            r5.f10528a = r0     // Catch:{ all -> 0x00b0 }
        L_0x0043:
            java.lang.String r0 = "VideoClicks"
            com.applovin.impl.fs r0 = r4.c(r0)     // Catch:{ all -> 0x00b0 }
            if (r0 == 0) goto L_0x0072
            android.net.Uri r1 = r5.f10531d     // Catch:{ all -> 0x00b0 }
            if (r1 != 0) goto L_0x0067
            java.lang.String r1 = "ClickThrough"
            com.applovin.impl.fs r1 = r0.c(r1)     // Catch:{ all -> 0x00b0 }
            if (r1 == 0) goto L_0x0067
            java.lang.String r1 = r1.d()     // Catch:{ all -> 0x00b0 }
            boolean r2 = com.applovin.impl.sdk.utils.StringUtils.isValidString(r1)     // Catch:{ all -> 0x00b0 }
            if (r2 == 0) goto L_0x0067
            android.net.Uri r1 = android.net.Uri.parse(r1)     // Catch:{ all -> 0x00b0 }
            r5.f10531d = r1     // Catch:{ all -> 0x00b0 }
        L_0x0067:
            java.lang.String r1 = "ClickTracking"
            java.util.List r0 = r0.a(r1)     // Catch:{ all -> 0x00b0 }
            java.util.Set r1 = r5.f10532e     // Catch:{ all -> 0x00b0 }
            com.applovin.impl.nq.a((java.util.List) r0, (java.util.Set) r1, (com.applovin.impl.fq) r6, (com.applovin.impl.sdk.k) r7)     // Catch:{ all -> 0x00b0 }
        L_0x0072:
            java.lang.String r0 = "Icons"
            com.applovin.impl.fs r0 = r4.c(r0)     // Catch:{ all -> 0x00b0 }
            if (r0 == 0) goto L_0x00aa
            java.lang.String r1 = "Icon"
            com.applovin.impl.fs r0 = r0.c(r1)     // Catch:{ all -> 0x00b0 }
            com.applovin.impl.hq r1 = com.applovin.impl.hq.a(r0, r7)     // Catch:{ all -> 0x00b0 }
            if (r1 == 0) goto L_0x00aa
            java.lang.String r2 = "IconClicks"
            com.applovin.impl.fs r2 = r0.c(r2)     // Catch:{ all -> 0x00b0 }
            if (r2 == 0) goto L_0x009b
            java.lang.String r3 = "IconClickTracking"
            java.util.List r2 = r2.a(r3)     // Catch:{ all -> 0x00b0 }
            if (r2 == 0) goto L_0x009b
            java.util.Set r3 = r1.f8357a     // Catch:{ all -> 0x00b0 }
            com.applovin.impl.nq.a((java.util.List) r2, (java.util.Set) r3, (com.applovin.impl.fq) r6, (com.applovin.impl.sdk.k) r7)     // Catch:{ all -> 0x00b0 }
        L_0x009b:
            java.lang.String r2 = "IconViewTracking"
            java.util.List r0 = r0.a(r2)     // Catch:{ all -> 0x00b0 }
            if (r0 == 0) goto L_0x00a8
            java.util.Set r2 = r1.f8358b     // Catch:{ all -> 0x00b0 }
            com.applovin.impl.nq.a((java.util.List) r0, (java.util.Set) r2, (com.applovin.impl.fq) r6, (com.applovin.impl.sdk.k) r7)     // Catch:{ all -> 0x00b0 }
        L_0x00a8:
            r5.f10533f = r1     // Catch:{ all -> 0x00b0 }
        L_0x00aa:
            java.util.Map r0 = r5.f10534g     // Catch:{ all -> 0x00b0 }
            com.applovin.impl.nq.a((com.applovin.impl.fs) r4, (java.util.Map) r0, (com.applovin.impl.fq) r6, (com.applovin.impl.sdk.k) r7)     // Catch:{ all -> 0x00b0 }
            return r5
        L_0x00b0:
            r4 = move-exception
            r7.L()
            boolean r5 = com.applovin.impl.sdk.t.a()
            java.lang.String r6 = "VastVideoCreative"
            if (r5 == 0) goto L_0x00c5
            com.applovin.impl.sdk.t r5 = r7.L()
            java.lang.String r0 = "Error occurred while initializing"
            r5.a(r6, r0, r4)
        L_0x00c5:
            com.applovin.impl.sdk.o r5 = r7.B()
            r5.a((java.lang.String) r6, (java.lang.Throwable) r4)
            r4 = 0
            return r4
        L_0x00ce:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "No sdk specified."
            r4.<init>(r5)
            throw r4
        L_0x00d6:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "No context specified."
            r4.<init>(r5)
            throw r4
        L_0x00de:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "No node specified."
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.oq.a(com.applovin.impl.fs, com.applovin.impl.oq, com.applovin.impl.fq, com.applovin.impl.sdk.k):com.applovin.impl.oq");
    }

    public Uri b() {
        return this.f10531d;
    }

    public int c() {
        return this.f10530c;
    }

    public Map d() {
        return this.f10534g;
    }

    public hq e() {
        return this.f10533f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oq)) {
            return false;
        }
        oq oqVar = (oq) obj;
        if (this.f10530c != oqVar.f10530c) {
            return false;
        }
        List list = this.f10528a;
        if (list == null ? oqVar.f10528a != null : !list.equals(oqVar.f10528a)) {
            return false;
        }
        Uri uri = this.f10531d;
        if (uri == null ? oqVar.f10531d != null : !uri.equals(oqVar.f10531d)) {
            return false;
        }
        Set set = this.f10532e;
        if (set == null ? oqVar.f10532e != null : !set.equals(oqVar.f10532e)) {
            return false;
        }
        Map map = this.f10534g;
        Map map2 = oqVar.f10534g;
        if (map != null) {
            return map.equals(map2);
        }
        if (map2 == null) {
            return true;
        }
        return false;
    }

    public List f() {
        return this.f10528a;
    }

    public int hashCode() {
        List list = this.f10528a;
        int i10 = 0;
        int hashCode = (((list != null ? list.hashCode() : 0) * 31) + this.f10530c) * 31;
        Uri uri = this.f10531d;
        int hashCode2 = (hashCode + (uri != null ? uri.hashCode() : 0)) * 31;
        Set set = this.f10532e;
        int hashCode3 = (hashCode2 + (set != null ? set.hashCode() : 0)) * 31;
        Map map = this.f10534g;
        if (map != null) {
            i10 = map.hashCode();
        }
        return hashCode3 + i10;
    }

    public String toString() {
        return "VastVideoCreative{videoFiles=" + this.f10528a + ", durationSeconds=" + this.f10530c + ", destinationUri=" + this.f10531d + ", clickTrackers=" + this.f10532e + ", eventTrackers=" + this.f10534g + ", industryIcon=" + this.f10533f + '}';
    }

    public Set a() {
        return this.f10532e;
    }

    public pq a(long j10) {
        List list = this.f10528a;
        pq pqVar = null;
        if (list == null || list.size() == 0) {
            return null;
        }
        List<pq> arrayList = new ArrayList<>(3);
        for (String str : this.f10529b) {
            for (pq pqVar2 : this.f10528a) {
                String b10 = pqVar2.b();
                if (StringUtils.isValidString(b10) && str.equalsIgnoreCase(b10)) {
                    arrayList.add(pqVar2);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            arrayList = this.f10528a;
        }
        Collections.sort(arrayList, b10.f6607a);
        for (pq pqVar3 : arrayList) {
            if (pqVar3.a() > j10) {
                break;
            }
            pqVar = pqVar3;
        }
        return pqVar != null ? pqVar : (pq) arrayList.get(0);
    }

    private static int a(String str, k kVar) {
        try {
            List<String> explode = CollectionUtils.explode(str, ":");
            if (explode.size() == 3) {
                return (int) (TimeUnit.HOURS.toSeconds((long) StringUtils.parseInt(explode.get(0))) + TimeUnit.MINUTES.toSeconds((long) StringUtils.parseInt(explode.get(1))) + ((long) StringUtils.parseInt(explode.get(2))));
            }
        } catch (Throwable unused) {
            kVar.L();
            if (t.a()) {
                t L = kVar.L();
                L.b("VastVideoCreative", "Unable to parse duration from \"" + str + "\"");
            }
        }
        return 0;
    }

    private static List a(fs fsVar, k kVar) {
        List<fs> a10 = fsVar.a("MediaFile");
        ArrayList arrayList = new ArrayList(a10.size());
        List<String> explode = CollectionUtils.explode((String) kVar.a(oj.S4));
        List<String> explode2 = CollectionUtils.explode((String) kVar.a(oj.R4));
        for (fs a11 : a10) {
            pq a12 = pq.a(a11, kVar);
            if (a12 != null) {
                try {
                    String b10 = a12.b();
                    if (!StringUtils.isValidString(b10) || explode.contains(b10)) {
                        if (((Boolean) kVar.a(oj.T4)).booleanValue()) {
                            String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(a12.d().toString());
                            if (StringUtils.isValidString(fileExtensionFromUrl) && !explode2.contains(fileExtensionFromUrl)) {
                                arrayList.add(a12);
                            }
                        }
                        kVar.L();
                        if (t.a()) {
                            t L = kVar.L();
                            L.k("VastVideoCreative", "Video file not supported: " + a12);
                        }
                    } else {
                        arrayList.add(a12);
                    }
                } catch (Throwable th) {
                    kVar.L();
                    if (t.a()) {
                        t L2 = kVar.L();
                        L2.a("VastVideoCreative", "Failed to validate video file: " + a12, th);
                    }
                }
            }
        }
        return arrayList;
    }
}
