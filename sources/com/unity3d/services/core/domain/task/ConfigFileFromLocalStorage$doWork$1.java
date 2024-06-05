package com.unity3d.services.core.domain.task;

import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import sd.o;

@f(c = "com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage", f = "ConfigFileFromLocalStorage.kt", l = {27}, m = "doWork-gIAlu-s")
/* compiled from: ConfigFileFromLocalStorage.kt */
final class ConfigFileFromLocalStorage$doWork$1 extends d {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ConfigFileFromLocalStorage this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ConfigFileFromLocalStorage$doWork$1(ConfigFileFromLocalStorage configFileFromLocalStorage, xd.d<? super ConfigFileFromLocalStorage$doWork$1> dVar) {
        super(dVar);
        this.this$0 = configFileFromLocalStorage;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        Object r22 = this.this$0.m37doWorkgIAlus((ConfigFileFromLocalStorage.Params) null, (xd.d<? super o<? extends Configuration>>) this);
        return r22 == d.c() ? r22 : o.a(r22);
    }
}
