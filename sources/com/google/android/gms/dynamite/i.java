package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
final class i implements DynamiteModule.b {
    i() {
    }

    public final DynamiteModule.b.C0159b a(Context context, String str, DynamiteModule.b.a aVar) throws DynamiteModule.a {
        DynamiteModule.b.C0159b bVar = new DynamiteModule.b.C0159b();
        bVar.f15514a = aVar.b(context, str);
        int a10 = aVar.a(context, str, true);
        bVar.f15515b = a10;
        int i10 = bVar.f15514a;
        if (i10 == 0) {
            if (a10 == 0) {
                bVar.f15516c = 0;
                return bVar;
            }
            i10 = 0;
        }
        if (a10 >= i10) {
            bVar.f15516c = 1;
        } else {
            bVar.f15516c = -1;
        }
        return bVar;
    }
}
