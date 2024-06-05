package com.unity3d.services.core.di;

import com.applovin.mediation.MaxReward;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;
import le.c;

/* compiled from: ServiceKey.kt */
public final class ServiceKey {
    private final c<?> instanceClass;
    private final String named;

    public ServiceKey(String str, c<?> cVar) {
        m.e(str, "named");
        m.e(cVar, "instanceClass");
        this.named = str;
        this.instanceClass = cVar;
    }

    public static /* synthetic */ ServiceKey copy$default(ServiceKey serviceKey, String str, c<?> cVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = serviceKey.named;
        }
        if ((i10 & 2) != 0) {
            cVar = serviceKey.instanceClass;
        }
        return serviceKey.copy(str, cVar);
    }

    public final String component1() {
        return this.named;
    }

    public final c<?> component2() {
        return this.instanceClass;
    }

    public final ServiceKey copy(String str, c<?> cVar) {
        m.e(str, "named");
        m.e(cVar, "instanceClass");
        return new ServiceKey(str, cVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServiceKey)) {
            return false;
        }
        ServiceKey serviceKey = (ServiceKey) obj;
        return m.a(this.named, serviceKey.named) && m.a(this.instanceClass, serviceKey.instanceClass);
    }

    public final c<?> getInstanceClass() {
        return this.instanceClass;
    }

    public final String getNamed() {
        return this.named;
    }

    public int hashCode() {
        return (this.named.hashCode() * 31) + this.instanceClass.hashCode();
    }

    public String toString() {
        return "ServiceKey(named=" + this.named + ", instanceClass=" + this.instanceClass + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ServiceKey(String str, c cVar, int i10, h hVar) {
        this((i10 & 1) != 0 ? MaxReward.DEFAULT_LABEL : str, cVar);
    }
}
