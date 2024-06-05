package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.view.View;
import androidx.collection.b;
import com.google.android.gms.common.api.Scope;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final Account f15352a;

    /* renamed from: b  reason: collision with root package name */
    private final Set<Scope> f15353b;

    /* renamed from: c  reason: collision with root package name */
    private final Set<Scope> f15354c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<com.google.android.gms.common.api.a<?>, b0> f15355d;

    /* renamed from: e  reason: collision with root package name */
    private final int f15356e;

    /* renamed from: f  reason: collision with root package name */
    private final View f15357f;

    /* renamed from: g  reason: collision with root package name */
    private final String f15358g;

    /* renamed from: h  reason: collision with root package name */
    private final String f15359h;

    /* renamed from: i  reason: collision with root package name */
    private final u5.a f15360i;

    /* renamed from: j  reason: collision with root package name */
    private Integer f15361j;

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private Account f15362a;

        /* renamed from: b  reason: collision with root package name */
        private b<Scope> f15363b;

        /* renamed from: c  reason: collision with root package name */
        private String f15364c;

        /* renamed from: d  reason: collision with root package name */
        private String f15365d;

        /* renamed from: e  reason: collision with root package name */
        private u5.a f15366e = u5.a.f30568k;

        public d a() {
            return new d(this.f15362a, this.f15363b, (Map<com.google.android.gms.common.api.a<?>, b0>) null, 0, (View) null, this.f15364c, this.f15365d, this.f15366e, false);
        }

        public a b(String str) {
            this.f15364c = str;
            return this;
        }

        public final a c(Collection<Scope> collection) {
            if (this.f15363b == null) {
                this.f15363b = new b<>();
            }
            this.f15363b.addAll(collection);
            return this;
        }

        public final a d(Account account) {
            this.f15362a = account;
            return this;
        }

        public final a e(String str) {
            this.f15365d = str;
            return this;
        }
    }

    public d(Account account, Set<Scope> set, Map<com.google.android.gms.common.api.a<?>, b0> map, int i10, View view, String str, String str2, u5.a aVar, boolean z10) {
        this.f15352a = account;
        Set<Scope> emptySet = set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
        this.f15353b = emptySet;
        map = map == null ? Collections.emptyMap() : map;
        this.f15355d = map;
        this.f15357f = view;
        this.f15356e = i10;
        this.f15358g = str;
        this.f15359h = str2;
        this.f15360i = aVar == null ? u5.a.f30568k : aVar;
        HashSet hashSet = new HashSet(emptySet);
        for (b0 b0Var : map.values()) {
            hashSet.addAll(b0Var.f15344a);
        }
        this.f15354c = Collections.unmodifiableSet(hashSet);
    }

    public Account a() {
        return this.f15352a;
    }

    public Account b() {
        Account account = this.f15352a;
        return account != null ? account : new Account(c.DEFAULT_ACCOUNT, "com.google");
    }

    public Set<Scope> c() {
        return this.f15354c;
    }

    public String d() {
        return this.f15358g;
    }

    public Set<Scope> e() {
        return this.f15353b;
    }

    public final u5.a f() {
        return this.f15360i;
    }

    public final Integer g() {
        return this.f15361j;
    }

    public final String h() {
        return this.f15359h;
    }

    public final Map<com.google.android.gms.common.api.a<?>, b0> i() {
        return this.f15355d;
    }

    public final void j(Integer num) {
        this.f15361j = num;
    }
}
