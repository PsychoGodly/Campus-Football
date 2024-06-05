package io.grpc.internal;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import r6.o;
import r8.b;

/* compiled from: JsonParser */
public final class a1 {

    /* renamed from: a  reason: collision with root package name */
    private static final Logger f34729a = Logger.getLogger(a1.class.getName());

    /* compiled from: JsonParser */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f34730a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                r8.b[] r0 = r8.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f34730a = r0
                r8.b r1 = r8.b.BEGIN_ARRAY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f34730a     // Catch:{ NoSuchFieldError -> 0x001d }
                r8.b r1 = r8.b.BEGIN_OBJECT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f34730a     // Catch:{ NoSuchFieldError -> 0x0028 }
                r8.b r1 = r8.b.STRING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f34730a     // Catch:{ NoSuchFieldError -> 0x0033 }
                r8.b r1 = r8.b.NUMBER     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f34730a     // Catch:{ NoSuchFieldError -> 0x003e }
                r8.b r1 = r8.b.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f34730a     // Catch:{ NoSuchFieldError -> 0x0049 }
                r8.b r1 = r8.b.NULL     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.a1.a.<clinit>():void");
        }
    }

    private a1() {
    }

    public static Object a(String str) throws IOException {
        r8.a aVar = new r8.a(new StringReader(str));
        try {
            return e(aVar);
        } finally {
            try {
                aVar.close();
            } catch (IOException e10) {
                f34729a.log(Level.WARNING, "Failed to close", e10);
            }
        }
    }

    private static List<?> b(r8.a aVar) throws IOException {
        aVar.h();
        ArrayList arrayList = new ArrayList();
        while (aVar.L()) {
            arrayList.add(e(aVar));
        }
        boolean z10 = aVar.w0() == b.END_ARRAY;
        o.v(z10, "Bad token: " + aVar.o0());
        aVar.u();
        return Collections.unmodifiableList(arrayList);
    }

    private static Void c(r8.a aVar) throws IOException {
        aVar.l0();
        return null;
    }

    private static Map<String, ?> d(r8.a aVar) throws IOException {
        aVar.i();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (aVar.L()) {
            linkedHashMap.put(aVar.h0(), e(aVar));
        }
        boolean z10 = aVar.w0() == b.END_OBJECT;
        o.v(z10, "Bad token: " + aVar.o0());
        aVar.A();
        return Collections.unmodifiableMap(linkedHashMap);
    }

    private static Object e(r8.a aVar) throws IOException {
        o.v(aVar.L(), "unexpected end of JSON");
        switch (a.f34730a[aVar.w0().ordinal()]) {
            case 1:
                return b(aVar);
            case 2:
                return d(aVar);
            case 3:
                return aVar.u0();
            case 4:
                return Double.valueOf(aVar.g0());
            case 5:
                return Boolean.valueOf(aVar.e0());
            case 6:
                return c(aVar);
            default:
                throw new IllegalStateException("Bad token: " + aVar.o0());
        }
    }
}
