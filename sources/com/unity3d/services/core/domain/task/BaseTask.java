package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.di.IServiceComponent;
import com.unity3d.services.core.di.IServiceProvider;
import com.unity3d.services.core.domain.task.BaseParams;
import sd.o;
import xd.d;

/* compiled from: BaseTask.kt */
public interface BaseTask<P extends BaseParams, R> extends IServiceComponent {

    /* compiled from: BaseTask.kt */
    public static final class DefaultImpls {
        public static <P extends BaseParams, R> IServiceProvider getServiceProvider(BaseTask<? super P, R> baseTask) {
            return IServiceComponent.DefaultImpls.getServiceProvider(baseTask);
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
        /* renamed from: invoke-gIAlu-s  reason: not valid java name */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static <P extends com.unity3d.services.core.domain.task.BaseParams, R> java.lang.Object m36invokegIAlus(com.unity3d.services.core.domain.task.BaseTask<? super P, R> r4, P r5, xd.d<? super sd.o<? extends R>> r6) {
            /*
                boolean r0 = r6 instanceof com.unity3d.services.core.domain.task.BaseTask$invoke$1
                if (r0 == 0) goto L_0x0013
                r0 = r6
                com.unity3d.services.core.domain.task.BaseTask$invoke$1 r0 = (com.unity3d.services.core.domain.task.BaseTask$invoke$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.label = r1
                goto L_0x0018
            L_0x0013:
                com.unity3d.services.core.domain.task.BaseTask$invoke$1 r0 = new com.unity3d.services.core.domain.task.BaseTask$invoke$1
                r0.<init>(r6)
            L_0x0018:
                java.lang.Object r6 = r0.result
                java.lang.Object r1 = yd.d.c()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L_0x0037
                if (r2 != r3) goto L_0x002f
                sd.p.b(r6)
                sd.o r6 = (sd.o) r6
                java.lang.Object r4 = r6.i()
                goto L_0x0043
            L_0x002f:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L_0x0037:
                sd.p.b(r6)
                r0.label = r3
                java.lang.Object r4 = r4.m34doWorkgIAlus(r5, r0)
                if (r4 != r1) goto L_0x0043
                return r1
            L_0x0043:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.domain.task.BaseTask.DefaultImpls.m36invokegIAlus(com.unity3d.services.core.domain.task.BaseTask, com.unity3d.services.core.domain.task.BaseParams, xd.d):java.lang.Object");
        }
    }

    /* renamed from: doWork-gIAlu-s  reason: not valid java name */
    Object m34doWorkgIAlus(P p10, d<? super o<? extends R>> dVar);

    /* renamed from: invoke-gIAlu-s  reason: not valid java name */
    Object m35invokegIAlus(P p10, d<? super o<? extends R>> dVar);
}
