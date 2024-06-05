package com.unity3d.services.core.di;

import android.content.Context;
import fe.a;
import java.io.File;
import kotlin.jvm.internal.n;

/* compiled from: UnityAdsModule.kt */
final class UnityAdsModule$provideByteStringDataStore$1 extends n implements a<File> {
    final /* synthetic */ Context $context;
    final /* synthetic */ String $dataStoreFile;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    UnityAdsModule$provideByteStringDataStore$1(Context context, String str) {
        super(0);
        this.$context = context;
        this.$dataStoreFile = str;
    }

    public final File invoke() {
        return g0.a.a(this.$context, this.$dataStoreFile);
    }
}
