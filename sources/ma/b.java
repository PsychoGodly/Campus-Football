package ma;

import kotlin.jvm.internal.m;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: OSOutcomeEventParams.kt */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final String f29290a;

    /* renamed from: b  reason: collision with root package name */
    private final d f29291b;

    /* renamed from: c  reason: collision with root package name */
    private float f29292c;

    /* renamed from: d  reason: collision with root package name */
    private long f29293d;

    public b(String str, d dVar, float f10, long j10) {
        m.e(str, "outcomeId");
        this.f29290a = str;
        this.f29291b = dVar;
        this.f29292c = f10;
        this.f29293d = j10;
    }

    public final String a() {
        return this.f29290a;
    }

    public final d b() {
        return this.f29291b;
    }

    public final long c() {
        return this.f29293d;
    }

    public final float d() {
        return this.f29292c;
    }

    public final boolean e() {
        d dVar = this.f29291b;
        return dVar == null || (dVar.a() == null && this.f29291b.b() == null);
    }

    public final void f(long j10) {
        this.f29293d = j10;
    }

    public final JSONObject g() throws JSONException {
        JSONObject put = new JSONObject().put("id", this.f29290a);
        d dVar = this.f29291b;
        if (dVar != null) {
            put.put("sources", dVar.g());
        }
        float f10 = this.f29292c;
        if (f10 > 0.0f) {
            put.put("weight", Float.valueOf(f10));
        }
        long j10 = this.f29293d;
        if (j10 > 0) {
            put.put("timestamp", j10);
        }
        m.d(put, "json");
        return put;
    }

    public String toString() {
        return "OSOutcomeEventParams{outcomeId='" + this.f29290a + "', outcomeSource=" + this.f29291b + ", weight=" + this.f29292c + ", timestamp=" + this.f29293d + '}';
    }
}
