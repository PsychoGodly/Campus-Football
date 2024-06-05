package com.unity3d.services.core.device.reader.pii;

import java.util.Locale;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;
import sd.o;
import sd.p;

/* compiled from: NonBehavioralFlag.kt */
public enum NonBehavioralFlag {
    UNKNOWN,
    TRUE,
    FALSE;
    
    public static final Companion Companion = null;

    /* compiled from: NonBehavioralFlag.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        public final NonBehavioralFlag fromString(String str) {
            NonBehavioralFlag nonBehavioralFlag;
            m.e(str, "value");
            try {
                o.a aVar = o.f38128b;
                String upperCase = str.toUpperCase(Locale.ROOT);
                m.d(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                nonBehavioralFlag = o.b(NonBehavioralFlag.valueOf(upperCase));
            } catch (Throwable th) {
                o.a aVar2 = o.f38128b;
                nonBehavioralFlag = o.b(p.a(th));
            }
            NonBehavioralFlag nonBehavioralFlag2 = NonBehavioralFlag.UNKNOWN;
            if (o.f(nonBehavioralFlag)) {
                nonBehavioralFlag = nonBehavioralFlag2;
            }
            return (NonBehavioralFlag) nonBehavioralFlag;
        }
    }

    static {
        Companion = new Companion((h) null);
    }
}
