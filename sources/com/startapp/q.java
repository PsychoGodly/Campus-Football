package com.startapp;

import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import s9.a;

/* compiled from: Sta */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    public final i6 f16269a;

    /* renamed from: b  reason: collision with root package name */
    public final WebView f16270b;

    /* renamed from: c  reason: collision with root package name */
    public final List<v9> f16271c;

    /* renamed from: d  reason: collision with root package name */
    public final Map<String, v9> f16272d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public final String f16273e;

    /* renamed from: f  reason: collision with root package name */
    public final String f16274f;

    /* renamed from: g  reason: collision with root package name */
    public final String f16275g;

    /* renamed from: h  reason: collision with root package name */
    public final a f16276h;

    public q(i6 i6Var, WebView webView, String str, List<v9> list, String str2, String str3, a aVar) {
        ArrayList arrayList = new ArrayList();
        this.f16271c = arrayList;
        this.f16269a = i6Var;
        this.f16270b = webView;
        this.f16273e = str;
        this.f16276h = aVar;
        if (list != null) {
            arrayList.addAll(list);
            for (v9 put : list) {
                String uuid = UUID.randomUUID().toString();
                this.f16272d.put(uuid, put);
            }
        }
        this.f16275g = str2;
        this.f16274f = str3;
    }

    public a a() {
        return this.f16276h;
    }

    public Map<String, v9> b() {
        return Collections.unmodifiableMap(this.f16272d);
    }

    public String c() {
        return this.f16273e;
    }

    public WebView d() {
        return this.f16270b;
    }
}
