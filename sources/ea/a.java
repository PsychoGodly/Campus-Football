package ea;

import ea.b;
import java.util.HashSet;
import org.json.JSONObject;

public abstract class a extends b {

    /* renamed from: c  reason: collision with root package name */
    protected final HashSet<String> f28832c;

    /* renamed from: d  reason: collision with root package name */
    protected final JSONObject f28833d;

    /* renamed from: e  reason: collision with root package name */
    protected final long f28834e;

    public a(b.C0300b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(bVar);
        this.f28832c = new HashSet<>(hashSet);
        this.f28833d = jSONObject;
        this.f28834e = j10;
    }
}
