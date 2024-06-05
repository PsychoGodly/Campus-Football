package com.unity3d.services.core.di;

import com.applovin.mediation.MaxReward;
import java.util.Map;
import le.c;
import sd.g;

/* compiled from: IServicesRegistry.kt */
public interface IServicesRegistry {

    /* compiled from: IServicesRegistry.kt */
    public static final class DefaultImpls {
        public static /* synthetic */ Object getService$default(IServicesRegistry iServicesRegistry, String str, c cVar, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 1) != 0) {
                    str = MaxReward.DEFAULT_LABEL;
                }
                return iServicesRegistry.getService(str, cVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getService");
        }
    }

    <T> T getService(String str, c<?> cVar);

    Map<ServiceKey, g<?>> getServices();

    <T> T resolveService(ServiceKey serviceKey);

    <T> T resolveServiceOrNull(ServiceKey serviceKey);

    <T> void updateService(ServiceKey serviceKey, g<? extends T> gVar);
}
