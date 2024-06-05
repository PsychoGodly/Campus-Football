package com.applovin.impl;

import android.net.Uri;
import android.text.TextUtils;
import com.applovin.impl.sdk.ad.b;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import java.io.File;
import java.util.List;

public class e1 extends c1 {

    /* renamed from: f  reason: collision with root package name */
    private final String f7343f;

    /* renamed from: g  reason: collision with root package name */
    private final b f7344g;

    /* renamed from: h  reason: collision with root package name */
    private final List f7345h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f7346i;

    /* renamed from: j  reason: collision with root package name */
    private final s2 f7347j;

    /* renamed from: k  reason: collision with root package name */
    private final k f7348k;

    /* renamed from: l  reason: collision with root package name */
    private final a f7349l;

    public interface a {
        void a(Uri uri);
    }

    public e1(String str, b bVar, s2 s2Var, k kVar, a aVar) {
        this(str, bVar, bVar.X(), true, s2Var, kVar, aVar);
    }

    private void a(Uri uri) {
        a aVar;
        if (!this.f6819e.get() && (aVar = this.f7349l) != null) {
            aVar.a(uri);
        }
    }

    /* renamed from: b */
    public Boolean call() {
        if (this.f6819e.get()) {
            return Boolean.FALSE;
        }
        String a10 = this.f7348k.D().a(a(), this.f7343f, this.f7344g.getCachePrefix(), this.f7345h, this.f7346i, this.f7347j);
        if (TextUtils.isEmpty(a10)) {
            a((Uri) null);
            return Boolean.FALSE;
        } else if (this.f6819e.get()) {
            return Boolean.FALSE;
        } else {
            File a11 = this.f7348k.D().a(a10, a());
            if (a11 == null) {
                if (t.a()) {
                    t tVar = this.f6817c;
                    String str = this.f6816b;
                    tVar.b(str, "Unable to retrieve File for cached filename = " + a10);
                }
                a((Uri) null);
                return Boolean.FALSE;
            } else if (this.f6819e.get()) {
                return Boolean.FALSE;
            } else {
                Uri fromFile = Uri.fromFile(a11);
                if (fromFile == null) {
                    if (t.a()) {
                        this.f6817c.b(this.f6816b, "Unable to extract Uri from file");
                    }
                    a((Uri) null);
                    return Boolean.FALSE;
                } else if (this.f6819e.get()) {
                    return Boolean.FALSE;
                } else {
                    a(fromFile);
                    return Boolean.TRUE;
                }
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f7343f.equals(((e1) obj).f7343f);
    }

    public int hashCode() {
        String str = this.f7343f;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public e1(String str, b bVar, List list, boolean z10, s2 s2Var, k kVar, a aVar) {
        super("AsyncTaskCacheResource", kVar);
        this.f7343f = str;
        this.f7344g = bVar;
        this.f7345h = list;
        this.f7346i = z10;
        this.f7347j = s2Var;
        this.f7348k = kVar;
        this.f7349l = aVar;
    }
}
