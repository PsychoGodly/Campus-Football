package androidx.appcompat.app;

import androidx.core.os.j;
import java.util.LinkedHashSet;
import java.util.Locale;

/* compiled from: LocaleOverlayHelper */
final class q {
    private static j a(j jVar, j jVar2) {
        Locale locale;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (int i10 = 0; i10 < jVar.g() + jVar2.g(); i10++) {
            if (i10 < jVar.g()) {
                locale = jVar.d(i10);
            } else {
                locale = jVar2.d(i10 - jVar.g());
            }
            if (locale != null) {
                linkedHashSet.add(locale);
            }
        }
        return j.a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
    }

    static j b(j jVar, j jVar2) {
        if (jVar == null || jVar.f()) {
            return j.e();
        }
        return a(jVar, jVar2);
    }
}
