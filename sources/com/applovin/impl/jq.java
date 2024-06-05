package com.applovin.impl;

import android.net.Uri;
import android.webkit.URLUtil;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.StringUtils;

public class jq {

    /* renamed from: a  reason: collision with root package name */
    private a f8793a;

    /* renamed from: b  reason: collision with root package name */
    private Uri f8794b;

    /* renamed from: c  reason: collision with root package name */
    private String f8795c;

    public enum a {
        UNSPECIFIED,
        STATIC,
        IFRAME,
        HTML
    }

    private jq() {
    }

    static jq a(fs fsVar, jq jqVar, k kVar) {
        if (fsVar == null) {
            throw new IllegalArgumentException("No node specified.");
        } else if (kVar != null) {
            if (jqVar == null) {
                try {
                    jqVar = new jq();
                } catch (Throwable th) {
                    kVar.L();
                    if (t.a()) {
                        kVar.L().a("VastNonVideoResource", "Error occurred while initializing", th);
                    }
                    kVar.B().a("VastNonVideoResource", th);
                    return null;
                }
            }
            if (jqVar.f8794b == null && !StringUtils.isValidString(jqVar.f8795c)) {
                String a10 = a(fsVar, "StaticResource");
                if (URLUtil.isValidUrl(a10)) {
                    jqVar.f8794b = Uri.parse(a10);
                    jqVar.f8793a = a.STATIC;
                    return jqVar;
                }
                String a11 = a(fsVar, "IFrameResource");
                if (StringUtils.isValidString(a11)) {
                    jqVar.f8793a = a.IFRAME;
                    if (URLUtil.isValidUrl(a11)) {
                        jqVar.f8794b = Uri.parse(a11);
                    } else {
                        jqVar.f8795c = a11;
                    }
                    return jqVar;
                }
                String a12 = a(fsVar, "HTMLResource");
                if (StringUtils.isValidString(a12)) {
                    jqVar.f8793a = a.HTML;
                    if (URLUtil.isValidUrl(a12)) {
                        jqVar.f8794b = Uri.parse(a12);
                    } else {
                        jqVar.f8795c = a12;
                    }
                }
            }
            return jqVar;
        } else {
            throw new IllegalArgumentException("No sdk specified.");
        }
    }

    public Uri b() {
        return this.f8794b;
    }

    public a c() {
        return this.f8793a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jq)) {
            return false;
        }
        jq jqVar = (jq) obj;
        if (this.f8793a != jqVar.f8793a) {
            return false;
        }
        Uri uri = this.f8794b;
        if (uri == null ? jqVar.f8794b != null : !uri.equals(jqVar.f8794b)) {
            return false;
        }
        String str = this.f8795c;
        String str2 = jqVar.f8795c;
        if (str != null) {
            return str.equals(str2);
        }
        if (str2 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        a aVar = this.f8793a;
        int i10 = 0;
        int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        Uri uri = this.f8794b;
        int hashCode2 = (hashCode + (uri != null ? uri.hashCode() : 0)) * 31;
        String str = this.f8795c;
        if (str != null) {
            i10 = str.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        return "VastNonVideoResource{type=" + this.f8793a + ", resourceUri=" + this.f8794b + ", resourceContents='" + this.f8795c + '\'' + '}';
    }

    public String a() {
        return this.f8795c;
    }

    public void a(String str) {
        this.f8795c = str;
    }

    public void a(Uri uri) {
        this.f8794b = uri;
    }

    private static String a(fs fsVar, String str) {
        fs c10 = fsVar.c(str);
        if (c10 != null) {
            return c10.d();
        }
        return null;
    }
}
