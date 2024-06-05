package com.applovin.impl;

import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class lq {

    /* renamed from: a  reason: collision with root package name */
    private String f9262a;

    /* renamed from: b  reason: collision with root package name */
    private String f9263b;

    /* renamed from: c  reason: collision with root package name */
    private String f9264c;

    /* renamed from: d  reason: collision with root package name */
    private long f9265d = -1;

    /* renamed from: e  reason: collision with root package name */
    private int f9266e = -1;

    private lq() {
    }

    public static lq a(fs fsVar, fq fqVar, k kVar) {
        List<String> explode;
        int size;
        long seconds;
        if (fsVar == null) {
            throw new IllegalArgumentException("No node specified.");
        } else if (kVar != null) {
            try {
                String d10 = fsVar.d();
                if (StringUtils.isValidString(d10)) {
                    lq lqVar = new lq();
                    lqVar.f9264c = d10;
                    lqVar.f9262a = (String) fsVar.a().get("id");
                    lqVar.f9263b = (String) fsVar.a().get("event");
                    lqVar.f9266e = a(lqVar.a(), fqVar);
                    String str = (String) fsVar.a().get("offset");
                    if (StringUtils.isValidString(str)) {
                        String trim = str.trim();
                        if (trim.contains("%")) {
                            lqVar.f9266e = StringUtils.parseInt(trim.substring(0, trim.length() - 1));
                        } else if (trim.contains(":") && (size = explode.size()) > 0) {
                            long j10 = 0;
                            int i10 = size - 1;
                            for (int i11 = i10; i11 >= 0; i11--) {
                                String str2 = (explode = CollectionUtils.explode(trim, ":")).get(i11);
                                if (StringUtils.isNumeric(str2)) {
                                    int parseInt = Integer.parseInt(str2);
                                    if (i11 == i10) {
                                        seconds = (long) parseInt;
                                    } else if (i11 == size - 2) {
                                        seconds = TimeUnit.MINUTES.toSeconds((long) parseInt);
                                    } else if (i11 == size - 3) {
                                        seconds = TimeUnit.HOURS.toSeconds((long) parseInt);
                                    }
                                    j10 += seconds;
                                }
                            }
                            lqVar.f9265d = j10;
                            lqVar.f9266e = -1;
                        }
                    }
                    return lqVar;
                }
                kVar.L();
                if (!t.a()) {
                    return null;
                }
                kVar.L().b("VastTracker", "Unable to create tracker. Could not find URL.");
                return null;
            } catch (Throwable th) {
                kVar.L();
                if (t.a()) {
                    kVar.L().a("VastTracker", "Error occurred while initializing", th);
                }
                kVar.B().a("VastTracker", th);
                return null;
            }
        } else {
            throw new IllegalArgumentException("No sdk specified.");
        }
    }

    public String b() {
        return this.f9264c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lq)) {
            return false;
        }
        lq lqVar = (lq) obj;
        if (this.f9265d != lqVar.f9265d || this.f9266e != lqVar.f9266e) {
            return false;
        }
        String str = this.f9262a;
        if (str == null ? lqVar.f9262a != null : !str.equals(lqVar.f9262a)) {
            return false;
        }
        String str2 = this.f9263b;
        if (str2 == null ? lqVar.f9263b == null : str2.equals(lqVar.f9263b)) {
            return this.f9264c.equals(lqVar.f9264c);
        }
        return false;
    }

    public int hashCode() {
        String str = this.f9262a;
        int i10 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f9263b;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        long j10 = this.f9265d;
        return ((((((hashCode + i10) * 31) + this.f9264c.hashCode()) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + this.f9266e;
    }

    public String toString() {
        return "VastTracker{identifier='" + this.f9262a + '\'' + ", event='" + this.f9263b + '\'' + ", uriString='" + this.f9264c + '\'' + ", offsetSeconds=" + this.f9265d + ", offsetPercent=" + this.f9266e + '}';
    }

    public String a() {
        return this.f9263b;
    }

    public boolean a(long j10, int i10) {
        long j11 = this.f9265d;
        boolean z10 = j11 >= 0;
        boolean z11 = j10 >= j11;
        int i11 = this.f9266e;
        boolean z12 = i11 >= 0;
        boolean z13 = i10 >= i11;
        if (z10 && z11) {
            return true;
        }
        if (!z12 || !z13) {
            return false;
        }
        return true;
    }

    private static int a(String str, fq fqVar) {
        if ("start".equalsIgnoreCase(str)) {
            return 0;
        }
        if ("firstQuartile".equalsIgnoreCase(str)) {
            return 25;
        }
        if ("midpoint".equalsIgnoreCase(str)) {
            return 50;
        }
        if ("thirdQuartile".equalsIgnoreCase(str)) {
            return 75;
        }
        if (!"complete".equalsIgnoreCase(str)) {
            return -1;
        }
        if (fqVar != null) {
            return fqVar.g();
        }
        return 95;
    }
}
