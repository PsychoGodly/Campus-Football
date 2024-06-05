package kotlin.jvm.internal;

import le.c;
import le.d;

/* compiled from: FunctionReferenceImpl */
public class k extends j {
    public k(int i10, d dVar, String str, String str2) {
        super(i10, d.NO_RECEIVER, ((e) dVar).b(), str, str2, (dVar instanceof c) ^ true ? 1 : 0);
    }

    public k(int i10, Class cls, String str, String str2, int i11) {
        super(i10, d.NO_RECEIVER, cls, str, str2, i11);
    }

    public k(int i10, Object obj, Class cls, String str, String str2, int i11) {
        super(i10, obj, cls, str, str2, i11);
    }
}
