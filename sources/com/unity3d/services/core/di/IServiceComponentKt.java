package com.unity3d.services.core.di;

import com.applovin.mediation.MaxReward;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.m;
import sd.g;
import sd.k;

/* compiled from: IServiceComponent.kt */
public final class IServiceComponentKt {
    public static final /* synthetic */ <T> T get(IServiceComponent iServiceComponent, String str) {
        m.e(iServiceComponent, "<this>");
        m.e(str, "named");
        IServicesRegistry registry = iServiceComponent.getServiceProvider().getRegistry();
        m.j(4, "T");
        return registry.getService(str, a0.b(Object.class));
    }

    public static /* synthetic */ Object get$default(IServiceComponent iServiceComponent, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = MaxReward.DEFAULT_LABEL;
        }
        m.e(iServiceComponent, "<this>");
        m.e(str, "named");
        IServicesRegistry registry = iServiceComponent.getServiceProvider().getRegistry();
        m.j(4, "T");
        return registry.getService(str, a0.b(Object.class));
    }

    public static final /* synthetic */ <T> g<T> inject(IServiceComponent iServiceComponent, String str, k kVar) {
        m.e(iServiceComponent, "<this>");
        m.e(str, "named");
        m.e(kVar, "mode");
        m.i();
        return i.b(kVar, new IServiceComponentKt$inject$1(iServiceComponent, str));
    }

    public static /* synthetic */ g inject$default(IServiceComponent iServiceComponent, String str, k kVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = MaxReward.DEFAULT_LABEL;
        }
        if ((i10 & 2) != 0) {
            kVar = k.NONE;
        }
        m.e(iServiceComponent, "<this>");
        m.e(str, "named");
        m.e(kVar, "mode");
        m.i();
        return i.b(kVar, new IServiceComponentKt$inject$1(iServiceComponent, str));
    }
}
