package com.unity3d.ads.core.data.datasource;

import com.google.protobuf.i;
import com.google.protobuf.z;
import com.unity3d.ads.core.domain.GetOpenGLRendererInfo;
import h0.d;
import kotlin.coroutines.jvm.internal.b;
import kotlin.jvm.internal.m;
import sd.w;

/* compiled from: FetchGLInfoDataMigration.kt */
public final class FetchGLInfoDataMigration implements d<c> {
    private final GetOpenGLRendererInfo getOpenGLRendererInfo;

    public FetchGLInfoDataMigration(GetOpenGLRendererInfo getOpenGLRendererInfo2) {
        m.e(getOpenGLRendererInfo2, "getOpenGLRendererInfo");
        this.getOpenGLRendererInfo = getOpenGLRendererInfo2;
    }

    private final i gatherOpenGLRendererInfo() {
        return this.getOpenGLRendererInfo.invoke();
    }

    public Object cleanUp(xd.d<? super w> dVar) {
        return w.f38141a;
    }

    public Object migrate(c cVar, xd.d<? super c> dVar) {
        i iVar;
        try {
            iVar = gatherOpenGLRendererInfo();
        } catch (Exception unused) {
            iVar = i.f27039b;
            m.d(iVar, "{\n            ByteString.EMPTY\n        }");
        }
        z s10 = c.i0().F(iVar).build();
        m.d(s10, "newBuilder()\n           …rer)\n            .build()");
        return s10;
    }

    public Object shouldMigrate(c cVar, xd.d<? super Boolean> dVar) {
        return b.a(cVar.g0().isEmpty());
    }
}
