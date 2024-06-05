package com.applovin.impl.sdk.network;

import com.applovin.impl.oj;
import com.applovin.impl.qi;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.network.a;
import java.util.Map;
import org.json.JSONObject;

public class e extends a {

    /* renamed from: s  reason: collision with root package name */
    private String f11957s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f11958t;

    public static class a extends a.C0139a {
        /* access modifiers changed from: private */

        /* renamed from: r  reason: collision with root package name */
        public String f11959r;
        /* access modifiers changed from: private */

        /* renamed from: s  reason: collision with root package name */
        public boolean f11960s;

        public a(k kVar) {
            super(kVar);
            this.f11906h = ((Integer) kVar.a(oj.U2)).intValue();
            this.f11907i = ((Integer) kVar.a(oj.T2)).intValue();
            this.f11908j = ((Integer) kVar.a(oj.f10261a3)).intValue();
        }

        /* renamed from: b */
        public a a(qi.a aVar) {
            this.f11915q = aVar;
            return this;
        }

        /* renamed from: d */
        public a a(String str) {
            this.f11901c = str;
            return this;
        }

        /* renamed from: e */
        public a b(int i10) {
            this.f11908j = i10;
            return this;
        }

        /* renamed from: f */
        public a b(String str) {
            this.f11900b = str;
            return this;
        }

        /* renamed from: g */
        public a c(String str) {
            this.f11899a = str;
            return this;
        }

        public a h(boolean z10) {
            this.f11960s = z10;
            return this;
        }

        /* renamed from: i */
        public a b(boolean z10) {
            this.f11914p = z10;
            return this;
        }

        /* renamed from: d */
        public a b(Map map) {
            this.f11902d = map;
            return this;
        }

        public a e(String str) {
            this.f11959r = str;
            return this;
        }

        /* renamed from: f */
        public a c(int i10) {
            this.f11907i = i10;
            return this;
        }

        /* renamed from: g */
        public a a(boolean z10) {
            this.f11912n = z10;
            return this;
        }

        /* renamed from: c */
        public a a(Map map) {
            this.f11903e = map;
            return this;
        }

        /* renamed from: d */
        public a a(int i10) {
            this.f11906h = i10;
            return this;
        }

        /* renamed from: b */
        public a a(JSONObject jSONObject) {
            this.f11904f = jSONObject;
            return this;
        }

        /* renamed from: b */
        public a a(Object obj) {
            this.f11905g = obj;
            return this;
        }

        /* renamed from: b */
        public e a() {
            return new e(this);
        }
    }

    protected e(a aVar) {
        super(aVar);
        this.f11957s = aVar.f11959r;
        this.f11958t = aVar.f11960s;
    }

    public static a b(k kVar) {
        return new a(kVar);
    }

    public String s() {
        return this.f11957s;
    }

    public boolean t() {
        return this.f11957s != null;
    }

    public boolean u() {
        return this.f11958t;
    }
}
