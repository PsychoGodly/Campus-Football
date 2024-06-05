package com.applovin.impl;

import android.net.Uri;
import android.text.TextUtils;
import com.applovin.impl.e1;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ExecutorService;

public class d1 extends c1 {
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final String f7072f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final com.applovin.impl.sdk.ad.b f7073g;

    /* renamed from: h  reason: collision with root package name */
    private final List f7074h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final s2 f7075i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public final c f7076j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public StringBuffer f7077k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public final Object f7078l = new Object();

    /* renamed from: m  reason: collision with root package name */
    private final ExecutorService f7079m;

    /* renamed from: n  reason: collision with root package name */
    private List f7080n;

    class a implements e1.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f7081a;

        a(String str) {
            this.f7081a = str;
        }

        public void a(Uri uri) {
            if (uri != null) {
                synchronized (d1.this.f7078l) {
                    int indexOf = d1.this.f7077k.indexOf(this.f7081a);
                    d1.this.f7077k.replace(indexOf, this.f7081a.length() + indexOf, uri.toString());
                }
                d1.this.f7073g.a(uri);
                d1.this.f7075i.b();
                return;
            }
            t tVar = d1.this.f6817c;
            if (t.a()) {
                d1 d1Var = d1.this;
                t tVar2 = d1Var.f6817c;
                String str = d1Var.f6816b;
                tVar2.a(str, "Failed to cache JavaScript resource " + this.f7081a);
            }
            if (d1.this.f7076j != null) {
                d1.this.f7076j.a(d1.this.f7072f, true);
            }
            d1.this.f7075i.a();
        }
    }

    class b implements e1.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f7083a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f7084b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f7085c;

        b(String str, String str2, String str3) {
            this.f7083a = str;
            this.f7084b = str2;
            this.f7085c = str3;
        }

        public void a(Uri uri) {
            if (uri != null) {
                synchronized (d1.this.f7078l) {
                    int indexOf = d1.this.f7077k.indexOf(this.f7083a);
                    d1.this.f7077k.replace(indexOf, this.f7083a.length() + indexOf, uri.toString());
                }
                d1.this.f7073g.a(uri);
                d1.this.f7075i.b();
                return;
            }
            List W = d1.this.f7073g.W();
            if (W.contains(this.f7084b + this.f7085c) && d1.this.f7076j != null) {
                d1.this.f7076j.a(d1.this.f7072f, true);
            }
            d1.this.f7075i.a();
        }
    }

    public interface c {
        void a(String str, boolean z10);
    }

    public d1(String str, com.applovin.impl.sdk.ad.b bVar, List list, s2 s2Var, ExecutorService executorService, k kVar, c cVar) {
        super("AsyncTaskCacheHTMLResources", kVar);
        this.f7072f = str;
        this.f7073g = bVar;
        this.f7074h = list;
        this.f7075i = s2Var;
        this.f7079m = executorService;
        this.f7076j = cVar;
        this.f7077k = new StringBuffer(str);
    }

    private void a(String str) {
        c cVar;
        if (!this.f6819e.get() && (cVar = this.f7076j) != null) {
            cVar.a(str, false);
        }
    }

    private HashSet c() {
        HashSet hashSet = new HashSet();
        Collection e10 = e();
        for (String str : this.f7074h) {
            int i10 = 0;
            int i11 = 0;
            while (i10 < this.f7072f.length()) {
                if (this.f6819e.get()) {
                    return null;
                }
                i10 = this.f7072f.indexOf(str, i11);
                if (i10 == -1) {
                    continue;
                    break;
                }
                int length = this.f7072f.length();
                int i12 = i10;
                while (!e10.contains(Character.valueOf(this.f7072f.charAt(i12))) && i12 < length) {
                    i12++;
                }
                if (i12 <= i10 || i12 == length) {
                    if (t.a()) {
                        this.f6817c.b(this.f6816b, "Unable to cache resource; ad HTML is invalid.");
                    }
                    return null;
                }
                String substring = this.f7072f.substring(str.length() + i10, i12);
                if (StringUtils.isValidString(substring)) {
                    if (this.f7073g.I0()) {
                        if (this.f7073g.P().equals(str + substring)) {
                            if (t.a()) {
                                this.f6817c.a(this.f6816b, "Postponing caching for \"" + substring + "\" video resource");
                            }
                        }
                    }
                    String str2 = str + substring;
                    hashSet.add(new e1(str2, this.f7073g, Arrays.asList(new String[]{str}), true, this.f7075i, this.f6815a, new b(str2, str, substring)));
                } else if (t.a()) {
                    this.f6817c.a(this.f6816b, "Skip caching of non-resource " + substring);
                }
                i11 = i12;
            }
        }
        return hashSet;
    }

    private HashSet d() {
        HashSet hashSet = new HashSet();
        for (String next : StringUtils.getRegexMatches(StringUtils.match(this.f7072f, (String) this.f6815a.a(oj.f10317h5)), 1)) {
            if (this.f6819e.get()) {
                return null;
            }
            if (StringUtils.isValidString(next)) {
                hashSet.add(new e1(next, this.f7073g, Collections.emptyList(), false, this.f7075i, this.f6815a, new a(next)));
            } else if (t.a()) {
                t tVar = this.f6817c;
                String str = this.f6816b;
                tVar.a(str, "Skip caching of non-resource " + next);
            }
        }
        return hashSet;
    }

    private Collection e() {
        HashSet hashSet = new HashSet();
        for (char valueOf : ((String) this.f6815a.a(oj.X0)).toCharArray()) {
            hashSet.add(Character.valueOf(valueOf));
        }
        hashSet.add('\"');
        return hashSet;
    }

    /* renamed from: b */
    public Boolean call() {
        HashSet d10;
        if (this.f6819e.get()) {
            return Boolean.FALSE;
        }
        if (TextUtils.isEmpty(this.f7072f)) {
            a(this.f7072f);
            return Boolean.FALSE;
        } else if (!((Boolean) this.f6815a.a(oj.Y0)).booleanValue()) {
            if (t.a()) {
                this.f6817c.a(this.f6816b, "Resource caching is disabled, skipping cache...");
            }
            a(this.f7072f);
            return Boolean.FALSE;
        } else {
            HashSet hashSet = new HashSet();
            HashSet c10 = c();
            if (c10 != null) {
                hashSet.addAll(c10);
            }
            if (((Boolean) this.f6815a.a(oj.f10309g5)).booleanValue() && (d10 = d()) != null) {
                hashSet.addAll(d10);
            }
            this.f7080n = new ArrayList(hashSet);
            if (this.f6819e.get()) {
                return Boolean.FALSE;
            }
            List list = this.f7080n;
            if (list == null || list.isEmpty()) {
                a(this.f7072f);
                return Boolean.FALSE;
            }
            if (t.a()) {
                t tVar = this.f6817c;
                String str = this.f6816b;
                tVar.a(str, "Executing " + this.f7080n.size() + " caching operations...");
            }
            this.f7079m.invokeAll(this.f7080n);
            synchronized (this.f7078l) {
                a(this.f7077k.toString());
            }
            return Boolean.TRUE;
        }
    }
}
