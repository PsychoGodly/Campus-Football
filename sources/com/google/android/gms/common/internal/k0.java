package com.google.android.gms.common.internal;

import android.content.Context;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.a;
import h5.f;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class k0 {

    /* renamed from: a  reason: collision with root package name */
    private final SparseIntArray f15425a = new SparseIntArray();

    /* renamed from: b  reason: collision with root package name */
    private f f15426b;

    public k0(f fVar) {
        q.k(fVar);
        this.f15426b = fVar;
    }

    public final int a(Context context, int i10) {
        return this.f15425a.get(i10, -1);
    }

    public final int b(Context context, a.f fVar) {
        q.k(context);
        q.k(fVar);
        int i10 = 0;
        if (!fVar.requiresGooglePlayServices()) {
            return 0;
        }
        int minApkVersion = fVar.getMinApkVersion();
        int a10 = a(context, minApkVersion);
        if (a10 == -1) {
            int i11 = 0;
            while (true) {
                if (i11 >= this.f15425a.size()) {
                    i10 = -1;
                    break;
                }
                int keyAt = this.f15425a.keyAt(i11);
                if (keyAt > minApkVersion && this.f15425a.get(keyAt) == 0) {
                    break;
                }
                i11++;
            }
            a10 = i10 == -1 ? this.f15426b.j(context, minApkVersion) : i10;
            this.f15425a.put(minApkVersion, a10);
        }
        return a10;
    }

    public final void c() {
        this.f15425a.clear();
    }
}
