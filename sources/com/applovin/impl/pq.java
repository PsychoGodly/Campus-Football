package com.applovin.impl;

import android.net.Uri;
import android.webkit.URLUtil;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.Locale;
import java.util.Map;

public class pq {

    /* renamed from: a  reason: collision with root package name */
    private Uri f10706a;

    /* renamed from: b  reason: collision with root package name */
    private Uri f10707b;

    /* renamed from: c  reason: collision with root package name */
    private a f10708c;

    /* renamed from: d  reason: collision with root package name */
    private String f10709d;

    /* renamed from: e  reason: collision with root package name */
    private int f10710e;

    /* renamed from: f  reason: collision with root package name */
    private int f10711f;

    /* renamed from: g  reason: collision with root package name */
    private long f10712g;

    public enum a {
        Progressive,
        Streaming
    }

    private pq() {
    }

    public static pq a(fs fsVar, k kVar) {
        if (fsVar == null) {
            throw new IllegalArgumentException("No node specified.");
        } else if (kVar != null) {
            try {
                String d10 = fsVar.d();
                if (URLUtil.isValidUrl(d10)) {
                    Uri parse = Uri.parse(d10);
                    pq pqVar = new pq();
                    pqVar.f10706a = parse;
                    pqVar.f10707b = parse;
                    pqVar.f10712g = a(fsVar);
                    pqVar.f10708c = a((String) fsVar.a().get("delivery"));
                    pqVar.f10711f = StringUtils.parseInt((String) fsVar.a().get("height"));
                    pqVar.f10710e = StringUtils.parseInt((String) fsVar.a().get("width"));
                    pqVar.f10709d = ((String) fsVar.a().get("type")).toLowerCase(Locale.ENGLISH);
                    return pqVar;
                }
                kVar.L();
                if (!t.a()) {
                    return null;
                }
                kVar.L().b("VastVideoFile", "Unable to create video file. Could not find URL.");
                return null;
            } catch (Throwable th) {
                kVar.L();
                if (t.a()) {
                    kVar.L().a("VastVideoFile", "Error occurred while initializing", th);
                }
                kVar.B().a("VastVideoFile", th);
                return null;
            }
        } else {
            throw new IllegalArgumentException("No sdk specified.");
        }
    }

    public String b() {
        return this.f10709d;
    }

    public Uri c() {
        return this.f10706a;
    }

    public Uri d() {
        return this.f10707b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pq)) {
            return false;
        }
        pq pqVar = (pq) obj;
        if (this.f10710e != pqVar.f10710e || this.f10711f != pqVar.f10711f || this.f10712g != pqVar.f10712g) {
            return false;
        }
        Uri uri = this.f10706a;
        if (uri == null ? pqVar.f10706a != null : !uri.equals(pqVar.f10706a)) {
            return false;
        }
        Uri uri2 = this.f10707b;
        if (uri2 == null ? pqVar.f10707b != null : !uri2.equals(pqVar.f10707b)) {
            return false;
        }
        if (this.f10708c != pqVar.f10708c) {
            return false;
        }
        String str = this.f10709d;
        String str2 = pqVar.f10709d;
        if (str != null) {
            return str.equals(str2);
        }
        if (str2 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        Uri uri = this.f10706a;
        int i10 = 0;
        int hashCode = (uri != null ? uri.hashCode() : 0) * 31;
        Uri uri2 = this.f10707b;
        int hashCode2 = (hashCode + (uri2 != null ? uri2.hashCode() : 0)) * 31;
        a aVar = this.f10708c;
        int hashCode3 = (hashCode2 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        String str = this.f10709d;
        if (str != null) {
            i10 = str.hashCode();
        }
        return ((((((hashCode3 + i10) * 31) + this.f10710e) * 31) + this.f10711f) * 31) + Long.valueOf(this.f10712g).hashCode();
    }

    public String toString() {
        return "VastVideoFile{sourceVideoUri=" + this.f10706a + ", videoUri=" + this.f10707b + ", deliveryType=" + this.f10708c + ", fileType='" + this.f10709d + '\'' + ", width=" + this.f10710e + ", height=" + this.f10711f + ", bitrate=" + this.f10712g + '}';
    }

    public long a() {
        return this.f10712g;
    }

    private static long a(fs fsVar) {
        Map a10 = fsVar.a();
        long parseLong = StringUtils.parseLong((String) a10.get("bitrate"), 0);
        if (parseLong != 0) {
            return parseLong;
        }
        return (StringUtils.parseLong((String) a10.get("minBitrate"), 0) + StringUtils.parseLong((String) a10.get("maxBitrate"), 0)) / 2;
    }

    private static a a(String str) {
        if (StringUtils.isValidString(str)) {
            if ("progressive".equalsIgnoreCase(str)) {
                return a.Progressive;
            }
            if ("streaming".equalsIgnoreCase(str)) {
                return a.Streaming;
            }
        }
        return a.Progressive;
    }

    public void a(Uri uri) {
        this.f10707b = uri;
    }
}
