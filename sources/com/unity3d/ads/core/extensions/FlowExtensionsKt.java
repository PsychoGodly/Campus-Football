package com.unity3d.ads.core.extensions;

import fe.l;
import kotlin.jvm.internal.m;
import sd.w;
import se.e;
import se.g;
import xd.d;

/* compiled from: FlowExtensions.kt */
public final class FlowExtensionsKt {
    public static final <T> e<T> timeoutAfter(e<? extends T> eVar, long j10, boolean z10, l<? super d<? super w>, ? extends Object> lVar) {
        m.e(eVar, "<this>");
        m.e(lVar, "block");
        return g.h(new FlowExtensionsKt$timeoutAfter$1(j10, z10, lVar, eVar, (d<? super FlowExtensionsKt$timeoutAfter$1>) null));
    }

    public static /* synthetic */ e timeoutAfter$default(e eVar, long j10, boolean z10, l lVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return timeoutAfter(eVar, j10, z10, lVar);
    }
}
