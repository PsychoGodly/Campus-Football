package ue;

import a.a;
import a.b;
import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.internal.m;
import pe.t0;
import sd.n;
import sd.o;
import sd.p;
import sd.s;

/* compiled from: StackTraceRecovery.kt */
public final class k0 {

    /* renamed from: a  reason: collision with root package name */
    private static final StackTraceElement f38810a = new a().a();

    /* renamed from: b  reason: collision with root package name */
    private static final String f38811b;

    /* renamed from: c  reason: collision with root package name */
    private static final String f38812c;

    static {
        Object obj;
        Object obj2;
        try {
            o.a aVar = o.f38128b;
            obj = o.b(Class.forName("kotlin.coroutines.jvm.internal.a").getCanonicalName());
        } catch (Throwable th) {
            o.a aVar2 = o.f38128b;
            obj = o.b(p.a(th));
        }
        if (o.d(obj) != null) {
            obj = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        f38811b = (String) obj;
        try {
            o.a aVar3 = o.f38128b;
            obj2 = o.b(k0.class.getCanonicalName());
        } catch (Throwable th2) {
            o.a aVar4 = o.f38128b;
            obj2 = o.b(p.a(th2));
        }
        if (o.d(obj2) != null) {
            obj2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        f38812c = (String) obj2;
    }

    private static final <E extends Throwable> n<E, StackTraceElement[]> b(E e10) {
        boolean z10;
        Throwable cause = e10.getCause();
        if (cause == null || !m.a(cause.getClass(), e10.getClass())) {
            return s.a(e10, new StackTraceElement[0]);
        }
        StackTraceElement[] stackTrace = e10.getStackTrace();
        int length = stackTrace.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                z10 = false;
                break;
            } else if (g(stackTrace[i10])) {
                z10 = true;
                break;
            } else {
                i10++;
            }
        }
        if (z10) {
            return s.a(cause, stackTrace);
        }
        return s.a(e10, new StackTraceElement[0]);
    }

    private static final <E extends Throwable> E c(E e10, E e11, ArrayDeque<StackTraceElement> arrayDeque) {
        arrayDeque.addFirst(f38810a);
        StackTraceElement[] stackTrace = e10.getStackTrace();
        int f10 = f(stackTrace, f38811b);
        int i10 = 0;
        if (f10 == -1) {
            e11.setStackTrace((StackTraceElement[]) arrayDeque.toArray(new StackTraceElement[0]));
            return e11;
        }
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[(arrayDeque.size() + f10)];
        for (int i11 = 0; i11 < f10; i11++) {
            stackTraceElementArr[i11] = stackTrace[i11];
        }
        Iterator<StackTraceElement> it = arrayDeque.iterator();
        while (it.hasNext()) {
            int i12 = i10 + 1;
            stackTraceElementArr[i10 + f10] = it.next();
            i10 = i12;
        }
        e11.setStackTrace(stackTraceElementArr);
        return e11;
    }

    private static final ArrayDeque<StackTraceElement> d(e eVar) {
        ArrayDeque<StackTraceElement> arrayDeque = new ArrayDeque<>();
        StackTraceElement stackTraceElement = eVar.getStackTraceElement();
        if (stackTraceElement != null) {
            arrayDeque.add(stackTraceElement);
        }
        while (true) {
            eVar = eVar.getCallerFrame();
            if (eVar == null) {
                return arrayDeque;
            }
            StackTraceElement stackTraceElement2 = eVar.getStackTraceElement();
            if (stackTraceElement2 != null) {
                arrayDeque.add(stackTraceElement2);
            }
        }
    }

    private static final boolean e(StackTraceElement stackTraceElement, StackTraceElement stackTraceElement2) {
        return stackTraceElement.getLineNumber() == stackTraceElement2.getLineNumber() && m.a(stackTraceElement.getMethodName(), stackTraceElement2.getMethodName()) && m.a(stackTraceElement.getFileName(), stackTraceElement2.getFileName()) && m.a(stackTraceElement.getClassName(), stackTraceElement2.getClassName());
    }

    private static final int f(StackTraceElement[] stackTraceElementArr, String str) {
        int length = stackTraceElementArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (m.a(str, stackTraceElementArr[i10].getClassName())) {
                return i10;
            }
        }
        return -1;
    }

    public static final boolean g(StackTraceElement stackTraceElement) {
        return o.r(stackTraceElement.getClassName(), b.c(), false, 2, (Object) null);
    }

    private static final void h(StackTraceElement[] stackTraceElementArr, ArrayDeque<StackTraceElement> arrayDeque) {
        int length = stackTraceElementArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                i10 = -1;
                break;
            } else if (g(stackTraceElementArr[i10])) {
                break;
            } else {
                i10++;
            }
        }
        int i11 = i10 + 1;
        int length2 = stackTraceElementArr.length - 1;
        if (i11 <= length2) {
            while (true) {
                if (e(stackTraceElementArr[length2], arrayDeque.getLast())) {
                    arrayDeque.removeLast();
                }
                arrayDeque.addFirst(stackTraceElementArr[length2]);
                if (length2 != i11) {
                    length2--;
                } else {
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public static final <E extends Throwable> E i(E e10, e eVar) {
        n b10 = b(e10);
        E e11 = (Throwable) b10.a();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) b10.b();
        Throwable g10 = o.g(e11);
        if (g10 == null) {
            return e10;
        }
        ArrayDeque d10 = d(eVar);
        if (d10.isEmpty()) {
            return e10;
        }
        if (e11 != e10) {
            h(stackTraceElementArr, d10);
        }
        return c(e11, g10, d10);
    }

    public static final <E extends Throwable> E j(E e10) {
        Throwable g10;
        if (t0.d() && (g10 = o.g(e10)) != null) {
            return k(g10);
        }
        return e10;
    }

    private static final <E extends Throwable> E k(E e10) {
        StackTraceElement stackTraceElement;
        StackTraceElement[] stackTrace = e10.getStackTrace();
        int length = stackTrace.length;
        int length2 = stackTrace.length - 1;
        if (length2 >= 0) {
            while (true) {
                int i10 = length2 - 1;
                if (m.a(f38812c, stackTrace[length2].getClassName())) {
                    break;
                } else if (i10 < 0) {
                    break;
                } else {
                    length2 = i10;
                }
            }
        }
        length2 = -1;
        int i11 = length2 + 1;
        int f10 = f(stackTrace, f38811b);
        int i12 = (length - length2) - (f10 == -1 ? 0 : length - f10);
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[i12];
        for (int i13 = 0; i13 < i12; i13++) {
            if (i13 == 0) {
                stackTraceElement = f38810a;
            } else {
                stackTraceElement = stackTrace[(i11 + i13) - 1];
            }
            stackTraceElementArr[i13] = stackTraceElement;
        }
        e10.setStackTrace(stackTraceElementArr);
        return e10;
    }

    public static final <E extends Throwable> E l(E e10) {
        E cause = e10.getCause();
        if (cause != null && m.a(cause.getClass(), e10.getClass())) {
            StackTraceElement[] stackTrace = e10.getStackTrace();
            int length = stackTrace.length;
            boolean z10 = false;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                } else if (g(stackTrace[i10])) {
                    z10 = true;
                    break;
                } else {
                    i10++;
                }
            }
            if (z10) {
                return cause;
            }
        }
        return e10;
    }
}
