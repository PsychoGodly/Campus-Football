package androidx.core.os;

import android.os.OutcomeReceiver;
import kotlin.jvm.internal.m;
import xd.d;

/* compiled from: OutcomeReceiver.kt */
public final class n {
    public static final <R, E extends Throwable> OutcomeReceiver<R, E> a(d<? super R> dVar) {
        m.e(dVar, "<this>");
        return new g(dVar);
    }
}
