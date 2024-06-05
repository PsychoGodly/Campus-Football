package com.google.android.play.core.integrity;

import android.content.Context;
import java.util.Objects;

/* compiled from: com.google.android.play:integrity@@1.1.0 */
final class h implements k {

    /* renamed from: a  reason: collision with root package name */
    private Context f26043a;

    private h() {
    }

    /* synthetic */ h(g gVar) {
    }

    public final h a(Context context) {
        Objects.requireNonNull(context);
        this.f26043a = context;
        return this;
    }

    public final j b() {
        Context context = this.f26043a;
        if (context != null) {
            return new j(context, (i) null);
        }
        throw new IllegalStateException(String.valueOf(Context.class.getCanonicalName()).concat(" must be set"));
    }
}
