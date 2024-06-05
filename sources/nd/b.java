package nd;

import android.view.Surface;
import fe.l;
import kotlin.jvm.internal.m;

/* compiled from: Messages.kt */
public final class b {
    public static final <R> R a(Surface surface, l<? super Surface, ? extends R> lVar) {
        m.e(surface, "<this>");
        m.e(lVar, "block");
        try {
            return lVar.invoke(surface);
        } finally {
            surface.release();
        }
    }
}
