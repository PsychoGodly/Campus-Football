package com.google.android.play.core.integrity;

import android.content.Context;

/* compiled from: com.google.android.play:integrity@@1.1.0 */
final class l {

    /* renamed from: a  reason: collision with root package name */
    private static j f26049a;

    static synchronized j a(Context context) {
        j jVar;
        synchronized (l.class) {
            if (f26049a == null) {
                h hVar = new h((g) null);
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    context = applicationContext;
                }
                hVar.a(context);
                f26049a = hVar.b();
            }
            jVar = f26049a;
        }
        return jVar;
    }
}
