package com.startapp;

import com.startapp.rb;
import java.util.HashSet;
import org.json.JSONObject;

/* compiled from: Sta */
public abstract class jb extends rb {

    /* renamed from: c  reason: collision with root package name */
    public final HashSet<String> f15988c;

    /* renamed from: d  reason: collision with root package name */
    public final JSONObject f15989d;

    /* renamed from: e  reason: collision with root package name */
    public final long f15990e;

    public jb(rb.b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(bVar);
        this.f15988c = new HashSet<>(hashSet);
        this.f15989d = jSONObject;
        this.f15990e = j10;
    }

    public /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        onPostExecute((String) obj);
    }
}
