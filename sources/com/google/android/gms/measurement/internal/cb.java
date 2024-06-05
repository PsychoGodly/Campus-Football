package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
final class cb implements kb {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ va f24445a;

    cb(va vaVar) {
        this.f24445a = vaVar;
    }

    public final void a(String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            this.f24445a.zzl().y(new bb(this, str, str2, bundle));
        } else if (this.f24445a.f25150l != null) {
            this.f24445a.f25150l.zzj().B().b("AppId not known when logging event", str2);
        }
    }
}
