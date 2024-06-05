package com.unity3d.ads.core.data.repository;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

@f(c = "com.unity3d.ads.core.data.repository.AndroidDeviceInfoRepository", f = "AndroidDeviceInfoRepository.kt", l = {38}, m = "getAuidByteString")
/* compiled from: AndroidDeviceInfoRepository.kt */
final class AndroidDeviceInfoRepository$getAuidByteString$1 extends d {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AndroidDeviceInfoRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidDeviceInfoRepository$getAuidByteString$1(AndroidDeviceInfoRepository androidDeviceInfoRepository, xd.d<? super AndroidDeviceInfoRepository$getAuidByteString$1> dVar) {
        super(dVar);
        this.this$0 = androidDeviceInfoRepository;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.getAuidByteString(this);
    }
}
