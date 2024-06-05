package com.google.android.datatransport.cct;

import b2.g;
import com.applovin.mediation.MaxReward;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import z1.b;

/* compiled from: CCTDestination */
public final class a implements g {

    /* renamed from: c  reason: collision with root package name */
    static final String f14176c;

    /* renamed from: d  reason: collision with root package name */
    static final String f14177d;

    /* renamed from: e  reason: collision with root package name */
    private static final String f14178e;

    /* renamed from: f  reason: collision with root package name */
    private static final Set<b> f14179f = Collections.unmodifiableSet(new HashSet(Arrays.asList(new b[]{b.b("proto"), b.b("json")})));

    /* renamed from: g  reason: collision with root package name */
    public static final a f14180g;

    /* renamed from: h  reason: collision with root package name */
    public static final a f14181h;

    /* renamed from: a  reason: collision with root package name */
    private final String f14182a;

    /* renamed from: b  reason: collision with root package name */
    private final String f14183b;

    static {
        String a10 = e.a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f14176c = a10;
        String a11 = e.a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        f14177d = a11;
        String a12 = e.a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f14178e = a12;
        f14180g = new a(a10, (String) null);
        f14181h = new a(a11, a12);
    }

    public a(String str, String str2) {
        this.f14182a = str;
        this.f14183b = str2;
    }

    public static a c(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (str.startsWith("1$")) {
            String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
            if (split.length == 2) {
                String str2 = split[0];
                if (!str2.isEmpty()) {
                    String str3 = split[1];
                    if (str3.isEmpty()) {
                        str3 = null;
                    }
                    return new a(str2, str3);
                }
                throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
            }
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        throw new IllegalArgumentException("Version marker missing from extras");
    }

    public Set<b> a() {
        return f14179f;
    }

    public byte[] b() {
        String str = this.f14183b;
        if (str == null && this.f14182a == null) {
            return null;
        }
        Object[] objArr = new Object[4];
        objArr[0] = "1$";
        objArr[1] = this.f14182a;
        objArr[2] = "\\";
        if (str == null) {
            str = MaxReward.DEFAULT_LABEL;
        }
        objArr[3] = str;
        return String.format("%s%s%s%s", objArr).getBytes(Charset.forName("UTF-8"));
    }

    public String d() {
        return this.f14183b;
    }

    public String e() {
        return this.f14182a;
    }

    public String getName() {
        return "cct";
    }

    public byte[] l() {
        return b();
    }
}
