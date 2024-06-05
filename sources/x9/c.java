package x9;

import ca.g;
import org.json.JSONObject;

public class c {

    /* renamed from: a  reason: collision with root package name */
    private final k f31221a;

    /* renamed from: b  reason: collision with root package name */
    private final k f31222b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f31223c;

    /* renamed from: d  reason: collision with root package name */
    private final f f31224d;

    /* renamed from: e  reason: collision with root package name */
    private final i f31225e;

    private c(f fVar, i iVar, k kVar, k kVar2, boolean z10) {
        this.f31224d = fVar;
        this.f31225e = iVar;
        this.f31221a = kVar;
        if (kVar2 == null) {
            this.f31222b = k.NONE;
        } else {
            this.f31222b = kVar2;
        }
        this.f31223c = z10;
    }

    public static c a(f fVar, i iVar, k kVar, k kVar2, boolean z10) {
        g.b(fVar, "CreativeType is null");
        g.b(iVar, "ImpressionType is null");
        g.b(kVar, "Impression owner is null");
        g.e(kVar, fVar, iVar);
        return new c(fVar, iVar, kVar, kVar2, z10);
    }

    public boolean b() {
        return k.NATIVE == this.f31221a;
    }

    public JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        ca.c.h(jSONObject, "impressionOwner", this.f31221a);
        ca.c.h(jSONObject, "mediaEventsOwner", this.f31222b);
        ca.c.h(jSONObject, "creativeType", this.f31224d);
        ca.c.h(jSONObject, "impressionType", this.f31225e);
        ca.c.h(jSONObject, "isolateVerificationScripts", Boolean.valueOf(this.f31223c));
        return jSONObject;
    }
}
