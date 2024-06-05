package pf;

import java.util.Locale;
import kotlin.jvm.internal.m;
import lc.j;
import ne.e;

/* compiled from: AudioplayersPlugin.kt */
public final class n {
    /* access modifiers changed from: private */
    public static final a b(j jVar) {
        Boolean bool = (Boolean) jVar.a("isSpeakerphoneOn");
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            Boolean bool2 = (Boolean) jVar.a("stayAwake");
            if (bool2 != null) {
                boolean booleanValue2 = bool2.booleanValue();
                Integer num = (Integer) jVar.a("contentType");
                if (num != null) {
                    int intValue = num.intValue();
                    Integer num2 = (Integer) jVar.a("usageType");
                    if (num2 != null) {
                        int intValue2 = num2.intValue();
                        Integer num3 = (Integer) jVar.a("audioFocus");
                        if (num3 != null) {
                            int intValue3 = num3.intValue();
                            Integer num4 = (Integer) jVar.a("audioMode");
                            if (num4 != null) {
                                return new a(booleanValue, booleanValue2, intValue, intValue2, intValue3, num4.intValue());
                            }
                            throw new IllegalStateException("audioMode is required".toString());
                        }
                        throw new IllegalStateException("audioFocus is required".toString());
                    }
                    throw new IllegalStateException("usageType is required".toString());
                }
                throw new IllegalStateException("contentType is required".toString());
            }
            throw new IllegalStateException("stayAwake is required".toString());
        }
        throw new IllegalStateException("isSpeakerphoneOn is required".toString());
    }

    public static final String c(String str) {
        m.e(str, "<this>");
        String upperCase = new e("(.) (.)").a(new e("(.)(\\p{Upper})").a(str, "$1_$2"), "$1_$2").toUpperCase(Locale.ROOT);
        m.d(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return upperCase;
    }
}
