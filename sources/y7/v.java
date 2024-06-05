package y7;

import android.util.Log;

/* compiled from: Logger */
public class v {

    /* renamed from: a  reason: collision with root package name */
    private static b f31411a = b.WARN;

    /* compiled from: Logger */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f31412a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                y7.v$b[] r0 = y7.v.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f31412a = r0
                y7.v$b r1 = y7.v.b.DEBUG     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f31412a     // Catch:{ NoSuchFieldError -> 0x001d }
                y7.v$b r1 = y7.v.b.WARN     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f31412a     // Catch:{ NoSuchFieldError -> 0x0028 }
                y7.v$b r1 = y7.v.b.NONE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: y7.v.a.<clinit>():void");
        }
    }

    /* compiled from: Logger */
    public enum b {
        DEBUG,
        WARN,
        NONE
    }

    public static void a(String str, String str2, Object... objArr) {
        b(b.DEBUG, str, str2, objArr);
    }

    private static void b(b bVar, String str, String str2, Object... objArr) {
        if (bVar.ordinal() >= f31411a.ordinal()) {
            String str3 = String.format("(%s) [%s]: ", new Object[]{"24.9.1", str}) + String.format(str2, objArr);
            int i10 = a.f31412a[bVar.ordinal()];
            if (i10 == 1) {
                Log.i("Firestore", str3);
            } else if (i10 == 2) {
                Log.w("Firestore", str3);
            } else if (i10 == 3) {
                throw new IllegalStateException("Trying to log something on level NONE");
            }
        }
    }

    public static boolean c() {
        return f31411a.ordinal() >= b.DEBUG.ordinal();
    }

    public static void d(b bVar) {
        f31411a = bVar;
    }

    public static void e(String str, String str2, Object... objArr) {
        b(b.WARN, str, str2, objArr);
    }
}
