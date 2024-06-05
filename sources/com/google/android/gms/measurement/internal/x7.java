package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
final class x7 implements kb {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ b7 f25243a;

    x7(b7 b7Var) {
        this.f25243a = b7Var;
    }

    public final void a(String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            this.f25243a.R("auto", str2, bundle, str);
        } else {
            this.f25243a.s0("auto", str2, bundle);
        }
    }
}
