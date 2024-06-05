package com.google.android.gms.common.api;

import android.util.Log;
import com.google.android.gms.common.api.i;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public abstract class k<R extends i> implements j<R> {
    public final void a(R r10) {
        Status p10 = r10.p();
        if (p10.z()) {
            c(r10);
            return;
        }
        b(p10);
        if (r10 instanceof g) {
            try {
                ((g) r10).release();
            } catch (RuntimeException e10) {
                Log.w("ResultCallbacks", "Unable to release ".concat(String.valueOf(r10)), e10);
            }
        }
    }

    public abstract void b(Status status);

    public abstract void c(R r10);
}
