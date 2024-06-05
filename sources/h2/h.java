package h2;

import android.content.Context;
import android.os.Build;
import i2.e;
import i2.g;
import i2.y;
import j2.d;
import l2.a;

/* compiled from: SchedulingModule */
public abstract class h {
    static y a(Context context, d dVar, g gVar, a aVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            return new e(context, dVar, gVar);
        }
        return new i2.a(context, dVar, aVar, gVar);
    }
}
