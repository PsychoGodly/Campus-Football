package com.applovin.impl.sdk.network;

import com.applovin.impl.fm;
import com.applovin.impl.sdk.EventServiceImpl;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sm;
import com.applovin.impl.xl;
import com.applovin.sdk.AppLovinPostbackListener;
import com.applovin.sdk.AppLovinPostbackService;
import java.util.Map;

public class PostbackServiceImpl implements AppLovinPostbackService {

    /* renamed from: a  reason: collision with root package name */
    private final k f11880a;

    public PostbackServiceImpl(k kVar) {
        this.f11880a = kVar;
    }

    private boolean a(e eVar) {
        Map i10 = eVar.i();
        if (i10 == null) {
            return false;
        }
        Object obj = i10.get("event");
        if ("postinstall".equals(obj)) {
            obj = i10.get("sub_event");
        }
        return EventServiceImpl.ALLOW_PRE_INIT_EVENT_TYPES.contains(obj);
    }

    public void dispatchPostbackAsync(String str, AppLovinPostbackListener appLovinPostbackListener) {
        dispatchPostbackRequest(e.b(this.f11880a).b(str).a(false).a(), appLovinPostbackListener);
    }

    public void dispatchPostbackRequest(e eVar, sm.b bVar, AppLovinPostbackListener appLovinPostbackListener) {
        fm fmVar = new fm(eVar, bVar, this.f11880a, appLovinPostbackListener);
        fmVar.a(a(eVar));
        this.f11880a.l0().a((xl) fmVar, bVar);
    }

    public String toString() {
        return "PostbackService{}";
    }

    public void dispatchPostbackRequest(e eVar, AppLovinPostbackListener appLovinPostbackListener) {
        dispatchPostbackRequest(eVar, sm.b.OTHER, appLovinPostbackListener);
    }
}
