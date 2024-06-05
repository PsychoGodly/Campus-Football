package com.unity3d.ads.core.data.datasource;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

@f(c = "com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource", f = "AndroidStaticDeviceInfoDataSource.kt", l = {95}, m = "fetch")
/* compiled from: AndroidStaticDeviceInfoDataSource.kt */
final class AndroidStaticDeviceInfoDataSource$fetch$1 extends d {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AndroidStaticDeviceInfoDataSource this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidStaticDeviceInfoDataSource$fetch$1(AndroidStaticDeviceInfoDataSource androidStaticDeviceInfoDataSource, xd.d<? super AndroidStaticDeviceInfoDataSource$fetch$1> dVar) {
        super(dVar);
        this.this$0 = androidStaticDeviceInfoDataSource;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.fetch((List<String>) null, this);
    }
}
