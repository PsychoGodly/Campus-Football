package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
final class f implements DynamiteModule.b {
    f() {
    }

    public final DynamiteModule.b.C0159b a(Context context, String str, DynamiteModule.b.a aVar) throws DynamiteModule.a {
        DynamiteModule.b.C0159b bVar = new DynamiteModule.b.C0159b();
        int a10 = aVar.a(context, str, false);
        bVar.f15515b = a10;
        if (a10 == 0) {
            bVar.f15516c = 0;
        } else {
            bVar.f15516c = 1;
        }
        return bVar;
    }
}
