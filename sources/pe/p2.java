package pe;

import kotlin.jvm.internal.m;
import ue.u;
import ue.w;

/* compiled from: JobSupport.kt */
public final class p2 extends u implements x1 {
    public p2 b() {
        return this;
    }

    public boolean isActive() {
        return true;
    }

    public final String q(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("List{");
        sb2.append(str);
        sb2.append("}[");
        Object i10 = i();
        m.c(i10, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        boolean z10 = true;
        for (w wVar = (w) i10; !m.a(wVar, this); wVar = wVar.j()) {
            if (wVar instanceof j2) {
                j2 j2Var = (j2) wVar;
                if (z10) {
                    z10 = false;
                } else {
                    sb2.append(", ");
                }
                sb2.append(j2Var);
            }
        }
        sb2.append("]");
        String sb3 = sb2.toString();
        m.d(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public String toString() {
        return t0.c() ? q("Active") : super.toString();
    }
}
