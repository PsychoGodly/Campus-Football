package com.applovin.impl;

import com.applovin.impl.hm;
import com.applovin.impl.jm;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class x0 implements jm.b, hm.b {

    /* renamed from: a  reason: collision with root package name */
    private final k f13212a;

    /* renamed from: b  reason: collision with root package name */
    private final a f13213b;

    /* renamed from: c  reason: collision with root package name */
    private v0 f13214c;

    /* renamed from: d  reason: collision with root package name */
    private String f13215d;

    public interface a {
        void a(v0 v0Var, String str);

        void a(b bVar, String str);
    }

    public enum b {
        DEVELOPER_URI_NOT_FOUND,
        APPADSTXT_NOT_FOUND,
        MISSING_APPLOVIN_ENTRIES,
        MISSING_NON_APPLOVIN_ENTRIES
    }

    public x0(k kVar, a aVar) {
        this.f13212a = kVar;
        this.f13213b = aVar;
    }

    public void a(b bVar, String str) {
        this.f13213b.a(bVar, str);
    }

    public void a(String str, String str2) {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        String[] split = str.split("\n");
        int length = split.length;
        int i10 = 1;
        int i11 = 0;
        while (i11 < length) {
            int i12 = i10 + 1;
            w0 w0Var = new w0(split[i11], i10);
            if (w0Var.h()) {
                String b10 = w0Var.b();
                List arrayList2 = hashMap.containsKey(b10) ? (List) hashMap.get(b10) : new ArrayList();
                if (arrayList2 != null) {
                    arrayList2.add(w0Var);
                    hashMap.put(b10, arrayList2);
                }
            } else {
                arrayList.add(w0Var);
            }
            i11++;
            i10 = i12;
        }
        this.f13214c = new v0(hashMap, arrayList);
        this.f13215d = str2;
        this.f13212a.L();
        if (t.a()) {
            t L = this.f13212a.L();
            L.a("AppAdsTxtService", "app-ads.txt fetched: " + this.f13214c);
        }
        this.f13213b.a(this.f13214c, str2);
    }

    public void a(b bVar) {
        this.f13213b.a(bVar, (String) null);
    }

    public void a(String str) {
        this.f13212a.l0().a((xl) new hm(this.f13212a, str, this));
    }

    public void a() {
        v0 v0Var = this.f13214c;
        if (v0Var != null) {
            this.f13213b.a(v0Var, this.f13215d);
            return;
        }
        this.f13212a.l0().a((xl) new jm(this.f13212a, this));
    }
}
