package com.unity3d.ads.core.data.repository;

import com.google.protobuf.i;
import com.google.protobuf.z;
import com.unity3d.ads.core.domain.GetSharedDataTimestamps;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.m;
import sd.n;
import sd.s;
import sd.w;
import se.k0;
import se.v;
import vb.a0;
import vb.b0;
import vb.x;
import vb.y;

/* compiled from: AndroidCampaignRepository.kt */
public final class AndroidCampaignRepository implements CampaignRepository {
    private final v<Map<String, a0>> campaigns = k0.a(k0.g());
    private final GetSharedDataTimestamps getSharedDataTimestamps;

    public AndroidCampaignRepository(GetSharedDataTimestamps getSharedDataTimestamps2) {
        m.e(getSharedDataTimestamps2, "getSharedDataTimestamps");
        this.getSharedDataTimestamps = getSharedDataTimestamps2;
    }

    public a0 getCampaign(i iVar) {
        m.e(iVar, "opportunityId");
        return (a0) this.campaigns.getValue().get(iVar.N());
    }

    public b0 getCampaignState() {
        Collection values = this.campaigns.getValue().values();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object next : values) {
            if (((a0) next).l0()) {
                arrayList.add(next);
            } else {
                arrayList2.add(next);
            }
        }
        n nVar = new n(arrayList, arrayList2);
        y.a aVar = y.f39116b;
        b0.a n02 = b0.n0();
        m.d(n02, "newBuilder()");
        y a10 = aVar.a(n02);
        a10.c(a10.e(), (List) nVar.a());
        a10.b(a10.d(), (List) nVar.b());
        return a10.a();
    }

    public void removeState(i iVar) {
        Map<String, a0> value;
        String N;
        m.e(iVar, "opportunityId");
        v<Map<String, a0>> vVar = this.campaigns;
        do {
            value = vVar.getValue();
            N = iVar.N();
            m.d(N, "opportunityId.toStringUtf8()");
        } while (!vVar.a(value, k0.k(value, N)));
    }

    public void setCampaign(i iVar, a0 a0Var) {
        Map<String, a0> value;
        m.e(iVar, "opportunityId");
        m.e(a0Var, "campaign");
        v<Map<String, a0>> vVar = this.campaigns;
        do {
            value = vVar.getValue();
        } while (!vVar.a(value, k0.o(value, s.a(iVar.N(), a0Var))));
    }

    public void setLoadTimestamp(i iVar) {
        m.e(iVar, "opportunityId");
        a0 campaign = getCampaign(iVar);
        if (campaign != null) {
            x.a aVar = x.f39110b;
            z.a d02 = campaign.b();
            m.d(d02, "this.toBuilder()");
            x a10 = aVar.a((a0.a) d02);
            a10.e(this.getSharedDataTimestamps.invoke());
            w wVar = w.f38141a;
            setCampaign(iVar, a10.a());
        }
    }

    public void setShowTimestamp(i iVar) {
        m.e(iVar, "opportunityId");
        a0 campaign = getCampaign(iVar);
        if (campaign != null) {
            x.a aVar = x.f39110b;
            z.a d02 = campaign.b();
            m.d(d02, "this.toBuilder()");
            x a10 = aVar.a((a0.a) d02);
            a10.g(this.getSharedDataTimestamps.invoke());
            w wVar = w.f38141a;
            setCampaign(iVar, a10.a());
        }
    }
}
