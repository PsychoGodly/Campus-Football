package me;

import fe.p;
import java.util.Iterator;
import kotlin.jvm.internal.m;
import sd.w;
import xd.d;

/* compiled from: SequenceBuilder.kt */
class h {

    /* compiled from: Sequences.kt */
    public static final class a implements d<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f36357a;

        public a(p pVar) {
            this.f36357a = pVar;
        }

        public Iterator<T> iterator() {
            return h.a(this.f36357a);
        }
    }

    public static <T> Iterator<T> a(p<? super f<? super T>, ? super d<? super w>, ? extends Object> pVar) {
        m.e(pVar, "block");
        e eVar = new e();
        eVar.e(c.a(pVar, eVar, eVar));
        return eVar;
    }

    public static <T> d<T> b(p<? super f<? super T>, ? super d<? super w>, ? extends Object> pVar) {
        m.e(pVar, "block");
        return new a(pVar);
    }
}
