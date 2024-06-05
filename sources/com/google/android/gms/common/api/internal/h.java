package com.google.android.gms.common.api.internal;

import android.app.Activity;
import androidx.fragment.app.e;
import com.google.android.gms.common.internal.q;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class h {

    /* renamed from: a  reason: collision with root package name */
    private final Object f15131a;

    public h(Activity activity) {
        q.l(activity, "Activity must not be null");
        this.f15131a = activity;
    }

    public final Activity a() {
        return (Activity) this.f15131a;
    }

    public final e b() {
        return (e) this.f15131a;
    }

    public final boolean c() {
        return this.f15131a instanceof Activity;
    }

    public final boolean d() {
        return this.f15131a instanceof e;
    }
}
