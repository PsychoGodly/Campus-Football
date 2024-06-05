package com.unity3d.ads.core.data.repository;

import fe.p;
import java.io.File;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pe.p0;
import sd.w;
import xd.d;

@f(c = "com.unity3d.ads.core.data.repository.AndroidCacheRepository$clearCache$2", f = "AndroidCacheRepository.kt", l = {}, m = "invokeSuspend")
/* compiled from: AndroidCacheRepository.kt */
final class AndroidCacheRepository$clearCache$2 extends l implements p<p0, d<? super w>, Object> {
    int label;
    final /* synthetic */ AndroidCacheRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidCacheRepository$clearCache$2(AndroidCacheRepository androidCacheRepository, d<? super AndroidCacheRepository$clearCache$2> dVar) {
        super(2, dVar);
        this.this$0 = androidCacheRepository;
    }

    public final d<w> create(Object obj, d<?> dVar) {
        return new AndroidCacheRepository$clearCache$2(this.this$0, dVar);
    }

    public final Object invoke(p0 p0Var, d<? super w> dVar) {
        return ((AndroidCacheRepository$clearCache$2) create(p0Var, dVar)).invokeSuspend(w.f38141a);
    }

    public final Object invokeSuspend(Object obj) {
        Object unused = d.c();
        if (this.label == 0) {
            sd.p.b(obj);
            File[] listFiles = this.this$0.cacheDir.listFiles();
            if (listFiles == null) {
                return null;
            }
            for (File delete : listFiles) {
                delete.delete();
            }
            return w.f38141a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
