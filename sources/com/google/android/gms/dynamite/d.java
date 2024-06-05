package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
final class d implements DynamiteModule.b {
    d() {
    }

    public final DynamiteModule.b.C0159b a(Context context, String str, DynamiteModule.b.a aVar) throws DynamiteModule.a {
        DynamiteModule.b.C0159b bVar = new DynamiteModule.b.C0159b();
        int a10 = aVar.a(context, str, true);
        bVar.f15515b = a10;
        if (a10 != 0) {
            bVar.f15516c = 1;
        } else {
            int b10 = aVar.b(context, str);
            bVar.f15514a = b10;
            if (b10 != 0) {
                bVar.f15516c = -1;
            }
        }
        return bVar;
    }
}
