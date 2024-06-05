package com.unity3d.services.store.core;

import com.unity3d.scar.adapter.common.m;
import com.unity3d.services.core.webview.WebViewEventCategory;
import java.util.Arrays;

/* compiled from: StoreWebViewError.kt */
public final class StoreWebViewError extends m {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StoreWebViewError(Enum<?> enumR, String str, Object... objArr) {
        super(enumR, str, Arrays.copyOf(objArr, objArr.length));
        kotlin.jvm.internal.m.e(objArr, "errorArguments");
    }

    public String getDomain() {
        return WebViewEventCategory.STORE.name();
    }
}
