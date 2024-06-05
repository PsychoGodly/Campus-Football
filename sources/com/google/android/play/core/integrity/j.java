package com.google.android.play.core.integrity;

import android.content.Context;
import com.google.android.play.integrity.internal.b;
import com.google.android.play.integrity.internal.c;
import com.google.android.play.integrity.internal.c0;
import com.google.android.play.integrity.internal.d;

/* compiled from: com.google.android.play:integrity@@1.1.0 */
final class j {

    /* renamed from: a  reason: collision with root package name */
    private final j f26044a = this;

    /* renamed from: b  reason: collision with root package name */
    private final d f26045b;

    /* renamed from: c  reason: collision with root package name */
    private final d f26046c;

    /* renamed from: d  reason: collision with root package name */
    private final d f26047d;

    /* renamed from: e  reason: collision with root package name */
    private final d f26048e;

    /* synthetic */ j(Context context, i iVar) {
        b b10 = c.b(context);
        this.f26045b = b10;
        d b11 = c0.b(o.f26054a);
        this.f26046c = b11;
        d b12 = c0.b(new v(b10, b11));
        this.f26047d = b12;
        this.f26048e = c0.b(new n(b12));
    }

    public final IntegrityManager a() {
        return (IntegrityManager) this.f26048e.a();
    }
}
