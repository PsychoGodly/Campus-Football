package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
final class h implements DynamiteModule.b {
    h() {
    }

    public final DynamiteModule.b.C0159b a(Context context, String str, DynamiteModule.b.a aVar) throws DynamiteModule.a {
        int i10;
        DynamiteModule.b.C0159b bVar = new DynamiteModule.b.C0159b();
        int b10 = aVar.b(context, str);
        bVar.f15514a = b10;
        int i11 = 0;
        if (b10 != 0) {
            i10 = aVar.a(context, str, false);
            bVar.f15515b = i10;
        } else {
            i10 = aVar.a(context, str, true);
            bVar.f15515b = i10;
        }
        int i12 = bVar.f15514a;
        if (i12 != 0) {
            i11 = i12;
        } else if (i10 == 0) {
            bVar.f15516c = 0;
            return bVar;
        }
        if (i11 >= i10) {
            bVar.f15516c = -1;
        } else {
            bVar.f15516c = 1;
        }
        return bVar;
    }
}
