package com.unity3d.ads.core.data.datasource;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

@f(c = "com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource", f = "AndroidStaticDeviceInfoDataSource.kt", l = {484}, m = "getGPUModel")
/* compiled from: AndroidStaticDeviceInfoDataSource.kt */
final class AndroidStaticDeviceInfoDataSource$getGPUModel$1 extends d {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AndroidStaticDeviceInfoDataSource this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidStaticDeviceInfoDataSource$getGPUModel$1(AndroidStaticDeviceInfoDataSource androidStaticDeviceInfoDataSource, xd.d<? super AndroidStaticDeviceInfoDataSource$getGPUModel$1> dVar) {
        super(dVar);
        this.this$0 = androidStaticDeviceInfoDataSource;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.getGPUModel(this);
    }
}
