package com.iab.omid.library.applovin.walking.async;

import com.iab.omid.library.applovin.walking.async.b;
import java.util.HashSet;
import org.json.JSONObject;

public abstract class a extends b {

    /* renamed from: c  reason: collision with root package name */
    protected final HashSet<String> f27461c;

    /* renamed from: d  reason: collision with root package name */
    protected final JSONObject f27462d;

    /* renamed from: e  reason: collision with root package name */
    protected final long f27463e;

    public a(b.C0288b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(bVar);
        this.f27461c = new HashSet<>(hashSet);
        this.f27462d = jSONObject;
        this.f27463e = j10;
    }
}
