package com.unity3d.ads.core.data.repository;

import sd.w;
import se.e;
import se.f;
import vb.z1;
import xd.d;

/* compiled from: SafeCollector.common.kt */
public final class AndroidSessionRepository$special$$inlined$map$1 implements e<z1> {
    final /* synthetic */ e $this_unsafeTransform$inlined;

    public AndroidSessionRepository$special$$inlined$map$1(e eVar) {
        this.$this_unsafeTransform$inlined = eVar;
    }

    public Object collect(final f fVar, d dVar) {
        Object collect = this.$this_unsafeTransform$inlined.collect(new f() {
            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, xd.d r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$map$1.AnonymousClass2.AnonymousClass1
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$map$1$2$1 r0 = (com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L_0x0018
                L_0x0013:
                    com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$map$1$2$1 r0 = new com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$map$1$2$1
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.result
                    java.lang.Object r1 = yd.d.c()
                    int r2 = r0.label
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    sd.p.b(r6)
                    goto L_0x0045
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    sd.p.b(r6)
                    se.f r6 = r3
                    sd.n r5 = (sd.n) r5
                    java.lang.Object r5 = r5.c()
                    r0.label = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0045
                    return r1
                L_0x0045:
                    sd.w r5 = sd.w.f38141a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, xd.d):java.lang.Object");
            }
        }, dVar);
        if (collect == d.c()) {
            return collect;
        }
        return w.f38141a;
    }
}
