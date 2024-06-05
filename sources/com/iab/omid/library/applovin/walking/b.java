package com.iab.omid.library.applovin.walking;

import com.iab.omid.library.applovin.walking.async.b;
import com.iab.omid.library.applovin.walking.async.c;
import com.iab.omid.library.applovin.walking.async.d;
import com.iab.omid.library.applovin.walking.async.e;
import com.iab.omid.library.applovin.walking.async.f;
import java.util.HashSet;
import org.json.JSONObject;

public class b implements b.C0288b {

    /* renamed from: a  reason: collision with root package name */
    private JSONObject f27470a;

    /* renamed from: b  reason: collision with root package name */
    private final c f27471b;

    public b(c cVar) {
        this.f27471b = cVar;
    }

    public JSONObject a() {
        return this.f27470a;
    }

    public void b() {
        this.f27471b.b(new d(this));
    }

    public void a(JSONObject jSONObject) {
        this.f27470a = jSONObject;
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f27471b.b(new f(this, hashSet, jSONObject, j10));
    }

    public void a(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f27471b.b(new e(this, hashSet, jSONObject, j10));
    }
}
