package com.unity3d.ads.core.utils;

import com.applovin.mediation.MaxReward;
import com.unity3d.ads.core.data.model.exception.ExposureException;
import com.unity3d.services.core.webview.bridge.WebViewCallback;
import kotlin.jvm.internal.m;
import sd.o;
import sd.p;
import xd.d;

/* compiled from: ContinuationFromCallback.kt */
public final class ContinuationFromCallback extends WebViewCallback {
    private final d<Object> continuation;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContinuationFromCallback(d<Object> dVar) {
        super(MaxReward.DEFAULT_LABEL, 0);
        m.e(dVar, "continuation");
        this.continuation = dVar;
    }

    public void error(Enum<?> enumR, Object... objArr) {
        m.e(objArr, "params");
        d<Object> dVar = this.continuation;
        o.a aVar = o.f38128b;
        dVar.resumeWith(o.b(p.a(new ExposureException("Invocation failed with: " + enumR, objArr))));
    }

    public void invoke(Object... objArr) {
        m.e(objArr, "params");
        d<Object> dVar = this.continuation;
        o.a aVar = o.f38128b;
        dVar.resumeWith(o.b(objArr));
    }
}
