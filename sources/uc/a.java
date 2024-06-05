package uc;

import android.graphics.Typeface;
import android.util.Log;

/* compiled from: FlutterNativeTemplateFontStyle */
public enum a {
    NORMAL,
    BOLD,
    ITALIC,
    MONOSPACE;

    /* renamed from: uc.a$a  reason: collision with other inner class name */
    /* compiled from: FlutterNativeTemplateFontStyle */
    static /* synthetic */ class C0447a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f38750a = null;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                uc.a[] r0 = uc.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f38750a = r0
                uc.a r1 = uc.a.NORMAL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f38750a     // Catch:{ NoSuchFieldError -> 0x001d }
                uc.a r1 = uc.a.BOLD     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f38750a     // Catch:{ NoSuchFieldError -> 0x0028 }
                uc.a r1 = uc.a.ITALIC     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f38750a     // Catch:{ NoSuchFieldError -> 0x0033 }
                uc.a r1 = uc.a.MONOSPACE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: uc.a.C0447a.<clinit>():void");
        }
    }

    public static a a(int i10) {
        if (i10 >= 0 && i10 < values().length) {
            return values()[i10];
        }
        Log.w("NativeTemplateFontStyle", "Invalid index for NativeTemplateFontStyle: " + i10);
        return NORMAL;
    }

    /* access modifiers changed from: package-private */
    public Typeface c() {
        int i10 = C0447a.f38750a[ordinal()];
        if (i10 == 1) {
            return Typeface.DEFAULT;
        }
        if (i10 == 2) {
            return Typeface.DEFAULT_BOLD;
        }
        if (i10 == 3) {
            return Typeface.defaultFromStyle(2);
        }
        if (i10 != 4) {
            return Typeface.DEFAULT;
        }
        return Typeface.MONOSPACE;
    }
}
