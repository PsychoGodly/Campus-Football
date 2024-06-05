package com.unity3d.services.core.di;

import android.content.Context;
import fe.a;
import java.io.File;
import kotlin.jvm.internal.n;

/* compiled from: UnityAdsModule.kt */
final class UnityAdsModule$glInfoDataStore$1 extends n implements a<File> {
    final /* synthetic */ Context $context;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    UnityAdsModule$glInfoDataStore$1(Context context) {
        super(0);
        this.$context = context;
    }

    public final File invoke() {
        return g0.a.a(this.$context, ServiceProvider.DATA_STORE_GL_INFO);
    }
}
