package com.unity3d.services.core.di;

import com.applovin.mediation.MaxReward;
import fe.a;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.m;
import le.c;
import sd.g;

/* compiled from: ServicesRegistry.kt */
public final class ServicesRegistry implements IServicesRegistry {
    private final ConcurrentHashMap<ServiceKey, g<?>> _services = new ConcurrentHashMap<>();

    public static /* synthetic */ ServiceKey factory$default(ServicesRegistry servicesRegistry, String str, a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = MaxReward.DEFAULT_LABEL;
        }
        m.e(str, "named");
        m.e(aVar, "instance");
        m.j(4, "T");
        ServiceKey serviceKey = new ServiceKey(str, a0.b(Object.class));
        servicesRegistry.updateService(serviceKey, ServiceFactoryKt.factoryOf(aVar));
        return serviceKey;
    }

    public static /* synthetic */ Object get$default(ServicesRegistry servicesRegistry, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = MaxReward.DEFAULT_LABEL;
        }
        m.e(str, "named");
        m.j(4, "T");
        return servicesRegistry.resolveService(new ServiceKey(str, a0.b(Object.class)));
    }

    public static /* synthetic */ Object getOrNull$default(ServicesRegistry servicesRegistry, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = MaxReward.DEFAULT_LABEL;
        }
        m.e(str, "named");
        m.j(4, "T");
        return servicesRegistry.resolveServiceOrNull(new ServiceKey(str, a0.b(Object.class)));
    }

    public static /* synthetic */ ServiceKey single$default(ServicesRegistry servicesRegistry, String str, a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = MaxReward.DEFAULT_LABEL;
        }
        m.e(str, "named");
        m.e(aVar, "instance");
        m.j(4, "T");
        ServiceKey serviceKey = new ServiceKey(str, a0.b(Object.class));
        servicesRegistry.updateService(serviceKey, i.a(aVar));
        return serviceKey;
    }

    public final /* synthetic */ <T> ServiceKey factory(String str, a<? extends T> aVar) {
        m.e(str, "named");
        m.e(aVar, "instance");
        m.j(4, "T");
        ServiceKey serviceKey = new ServiceKey(str, a0.b(Object.class));
        updateService(serviceKey, ServiceFactoryKt.factoryOf(aVar));
        return serviceKey;
    }

    public final /* synthetic */ <T> T get(String str) {
        m.e(str, "named");
        m.j(4, "T");
        return resolveService(new ServiceKey(str, a0.b(Object.class)));
    }

    public final /* synthetic */ <T> T getOrNull(String str) {
        m.e(str, "named");
        m.j(4, "T");
        return resolveServiceOrNull(new ServiceKey(str, a0.b(Object.class)));
    }

    public <T> T getService(String str, c<?> cVar) {
        m.e(str, "named");
        m.e(cVar, "instance");
        return resolveService(new ServiceKey(str, cVar));
    }

    public Map<ServiceKey, g<?>> getServices() {
        return this._services;
    }

    public <T> T resolveService(ServiceKey serviceKey) {
        m.e(serviceKey, "key");
        g gVar = getServices().get(serviceKey);
        if (gVar != null) {
            return gVar.getValue();
        }
        throw new IllegalStateException("No service instance found for " + serviceKey);
    }

    public <T> T resolveServiceOrNull(ServiceKey serviceKey) {
        m.e(serviceKey, "key");
        g gVar = getServices().get(serviceKey);
        if (gVar == null) {
            return null;
        }
        return gVar.getValue();
    }

    public final /* synthetic */ <T> ServiceKey single(String str, a<? extends T> aVar) {
        m.e(str, "named");
        m.e(aVar, "instance");
        m.j(4, "T");
        ServiceKey serviceKey = new ServiceKey(str, a0.b(Object.class));
        updateService(serviceKey, i.a(aVar));
        return serviceKey;
    }

    public <T> void updateService(ServiceKey serviceKey, g<? extends T> gVar) {
        m.e(serviceKey, "key");
        m.e(gVar, "instance");
        if (!getServices().containsKey(serviceKey)) {
            this._services.put(serviceKey, gVar);
            return;
        }
        throw new IllegalStateException(("Cannot have multiple identical services: " + serviceKey).toString());
    }
}
