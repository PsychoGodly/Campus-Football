package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public interface i {
    void a(String str, LifecycleCallback lifecycleCallback);

    <T extends LifecycleCallback> T b(String str, Class<T> cls);

    Activity c();

    void startActivityForResult(Intent intent, int i10);
}
