package oe;

import kotlin.jvm.internal.m;

/* compiled from: DurationUnitJvm.kt */
class f {
    public static final double a(double d10, e eVar, e eVar2) {
        m.e(eVar, "sourceUnit");
        m.e(eVar2, "targetUnit");
        long convert = eVar2.c().convert(1, eVar.c());
        if (convert > 0) {
            return d10 * ((double) convert);
        }
        return d10 / ((double) eVar.c().convert(1, eVar2.c()));
    }

    public static final long b(long j10, e eVar, e eVar2) {
        m.e(eVar, "sourceUnit");
        m.e(eVar2, "targetUnit");
        return eVar2.c().convert(j10, eVar.c());
    }

    public static final long c(long j10, e eVar, e eVar2) {
        m.e(eVar, "sourceUnit");
        m.e(eVar2, "targetUnit");
        return eVar2.c().convert(j10, eVar.c());
    }
}
