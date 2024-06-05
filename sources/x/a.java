package x;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.widget.b;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: CustomSupport */
public class a {

    /* renamed from: x.a$a  reason: collision with other inner class name */
    /* compiled from: CustomSupport */
    static /* synthetic */ class C0245a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f23551a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                androidx.constraintlayout.widget.b$b[] r0 = androidx.constraintlayout.widget.b.C0024b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f23551a = r0
                androidx.constraintlayout.widget.b$b r1 = androidx.constraintlayout.widget.b.C0024b.INT_TYPE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f23551a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.constraintlayout.widget.b$b r1 = androidx.constraintlayout.widget.b.C0024b.FLOAT_TYPE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f23551a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.constraintlayout.widget.b$b r1 = androidx.constraintlayout.widget.b.C0024b.COLOR_DRAWABLE_TYPE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f23551a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.constraintlayout.widget.b$b r1 = androidx.constraintlayout.widget.b.C0024b.COLOR_TYPE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f23551a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.constraintlayout.widget.b$b r1 = androidx.constraintlayout.widget.b.C0024b.STRING_TYPE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f23551a     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.constraintlayout.widget.b$b r1 = androidx.constraintlayout.widget.b.C0024b.BOOLEAN_TYPE     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f23551a     // Catch:{ NoSuchFieldError -> 0x0054 }
                androidx.constraintlayout.widget.b$b r1 = androidx.constraintlayout.widget.b.C0024b.DIMENSION_TYPE     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: x.a.C0245a.<clinit>():void");
        }
    }

    private static int a(int i10) {
        int i11 = (i10 & (~(i10 >> 31))) - 255;
        return (i11 & (i11 >> 31)) + 255;
    }

    public static void b(b bVar, View view, float[] fArr) {
        View view2 = view;
        Class<?> cls = view.getClass();
        String str = "set" + bVar.b();
        try {
            boolean z10 = true;
            switch (C0245a.f23551a[bVar.c().ordinal()]) {
                case 1:
                    cls.getMethod(str, new Class[]{Integer.TYPE}).invoke(view2, new Object[]{Integer.valueOf((int) fArr[0])});
                    return;
                case 2:
                    cls.getMethod(str, new Class[]{Float.TYPE}).invoke(view2, new Object[]{Float.valueOf(fArr[0])});
                    return;
                case 3:
                    Method method = cls.getMethod(str, new Class[]{Drawable.class});
                    int a10 = a((int) (((float) Math.pow((double) fArr[0], 0.45454545454545453d)) * 255.0f));
                    int a11 = a((int) (((float) Math.pow((double) fArr[1], 0.45454545454545453d)) * 255.0f));
                    ColorDrawable colorDrawable = new ColorDrawable();
                    colorDrawable.setColor((a10 << 16) | (a((int) (fArr[3] * 255.0f)) << 24) | (a11 << 8) | a((int) (((float) Math.pow((double) fArr[2], 0.45454545454545453d)) * 255.0f)));
                    method.invoke(view2, new Object[]{colorDrawable});
                    return;
                case 4:
                    cls.getMethod(str, new Class[]{Integer.TYPE}).invoke(view2, new Object[]{Integer.valueOf((a((int) (((float) Math.pow((double) fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (a((int) (fArr[3] * 255.0f)) << 24) | (a((int) (((float) Math.pow((double) fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | a((int) (((float) Math.pow((double) fArr[2], 0.45454545454545453d)) * 255.0f)))});
                    return;
                case 5:
                    throw new RuntimeException("unable to interpolate strings " + bVar.b());
                case 6:
                    Method method2 = cls.getMethod(str, new Class[]{Boolean.TYPE});
                    Object[] objArr = new Object[1];
                    if (fArr[0] <= 0.5f) {
                        z10 = false;
                    }
                    objArr[0] = Boolean.valueOf(z10);
                    method2.invoke(view2, objArr);
                    return;
                case 7:
                    cls.getMethod(str, new Class[]{Float.TYPE}).invoke(view2, new Object[]{Float.valueOf(fArr[0])});
                    return;
                default:
                    return;
            }
        } catch (NoSuchMethodException e10) {
            Log.e("CustomSupport", "no method " + str + " on View \"" + androidx.constraintlayout.motion.widget.a.b(view) + "\"");
            e10.printStackTrace();
        } catch (IllegalAccessException e11) {
            Log.e("CustomSupport", "cannot access method " + str + " on View \"" + androidx.constraintlayout.motion.widget.a.b(view) + "\"");
            e11.printStackTrace();
        } catch (InvocationTargetException e12) {
            e12.printStackTrace();
        }
    }
}
