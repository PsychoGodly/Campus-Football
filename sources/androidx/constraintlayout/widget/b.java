package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: ConstraintAttribute */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private boolean f2218a = false;

    /* renamed from: b  reason: collision with root package name */
    String f2219b;

    /* renamed from: c  reason: collision with root package name */
    private C0024b f2220c;

    /* renamed from: d  reason: collision with root package name */
    private int f2221d;

    /* renamed from: e  reason: collision with root package name */
    private float f2222e;

    /* renamed from: f  reason: collision with root package name */
    private String f2223f;

    /* renamed from: g  reason: collision with root package name */
    boolean f2224g;

    /* renamed from: h  reason: collision with root package name */
    private int f2225h;

    /* compiled from: ConstraintAttribute */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f2226a;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                androidx.constraintlayout.widget.b$b[] r0 = androidx.constraintlayout.widget.b.C0024b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f2226a = r0
                androidx.constraintlayout.widget.b$b r1 = androidx.constraintlayout.widget.b.C0024b.REFERENCE_TYPE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f2226a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.constraintlayout.widget.b$b r1 = androidx.constraintlayout.widget.b.C0024b.BOOLEAN_TYPE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f2226a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.constraintlayout.widget.b$b r1 = androidx.constraintlayout.widget.b.C0024b.STRING_TYPE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f2226a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.constraintlayout.widget.b$b r1 = androidx.constraintlayout.widget.b.C0024b.COLOR_TYPE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f2226a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.constraintlayout.widget.b$b r1 = androidx.constraintlayout.widget.b.C0024b.COLOR_DRAWABLE_TYPE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f2226a     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.constraintlayout.widget.b$b r1 = androidx.constraintlayout.widget.b.C0024b.INT_TYPE     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f2226a     // Catch:{ NoSuchFieldError -> 0x0054 }
                androidx.constraintlayout.widget.b$b r1 = androidx.constraintlayout.widget.b.C0024b.FLOAT_TYPE     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f2226a     // Catch:{ NoSuchFieldError -> 0x0060 }
                androidx.constraintlayout.widget.b$b r1 = androidx.constraintlayout.widget.b.C0024b.DIMENSION_TYPE     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.b.a.<clinit>():void");
        }
    }

    /* renamed from: androidx.constraintlayout.widget.b$b  reason: collision with other inner class name */
    /* compiled from: ConstraintAttribute */
    public enum C0024b {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE,
        REFERENCE_TYPE
    }

    public b(String str, C0024b bVar, Object obj, boolean z10) {
        this.f2219b = str;
        this.f2220c = bVar;
        this.f2218a = z10;
        f(obj);
    }

    public static HashMap<String, b> a(HashMap<String, b> hashMap, View view) {
        HashMap<String, b> hashMap2 = new HashMap<>();
        Class<?> cls = view.getClass();
        for (String next : hashMap.keySet()) {
            b bVar = hashMap.get(next);
            try {
                if (next.equals("BackgroundColor")) {
                    hashMap2.put(next, new b(bVar, Integer.valueOf(((ColorDrawable) view.getBackground()).getColor())));
                } else {
                    hashMap2.put(next, new b(bVar, cls.getMethod("getMap" + next, new Class[0]).invoke(view, new Object[0])));
                }
            } catch (NoSuchMethodException e10) {
                e10.printStackTrace();
            } catch (IllegalAccessException e11) {
                e11.printStackTrace();
            } catch (InvocationTargetException e12) {
                e12.printStackTrace();
            }
        }
        return hashMap2;
    }

    public static void d(Context context, XmlPullParser xmlPullParser, HashMap<String, b> hashMap) {
        C0024b bVar;
        Object valueOf;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), k.f2597y4);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        Object obj = null;
        C0024b bVar2 = null;
        boolean z10 = false;
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = obtainStyledAttributes.getIndex(i10);
            if (index == k.f2606z4) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }
            } else if (index == k.J4) {
                str = obtainStyledAttributes.getString(index);
                z10 = true;
            } else if (index == k.A4) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                bVar2 = C0024b.BOOLEAN_TYPE;
            } else {
                if (index == k.C4) {
                    bVar = C0024b.COLOR_TYPE;
                    valueOf = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else if (index == k.B4) {
                    bVar = C0024b.COLOR_DRAWABLE_TYPE;
                    valueOf = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else if (index == k.G4) {
                    bVar = C0024b.DIMENSION_TYPE;
                    valueOf = Float.valueOf(TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                } else if (index == k.D4) {
                    bVar = C0024b.DIMENSION_TYPE;
                    valueOf = Float.valueOf(obtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == k.E4) {
                    bVar = C0024b.FLOAT_TYPE;
                    valueOf = Float.valueOf(obtainStyledAttributes.getFloat(index, Float.NaN));
                } else if (index == k.F4) {
                    bVar = C0024b.INT_TYPE;
                    valueOf = Integer.valueOf(obtainStyledAttributes.getInteger(index, -1));
                } else if (index == k.I4) {
                    bVar = C0024b.STRING_TYPE;
                    valueOf = obtainStyledAttributes.getString(index);
                } else if (index == k.H4) {
                    bVar = C0024b.REFERENCE_TYPE;
                    int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                    if (resourceId == -1) {
                        resourceId = obtainStyledAttributes.getInt(index, -1);
                    }
                    valueOf = Integer.valueOf(resourceId);
                }
                Object obj2 = valueOf;
                bVar2 = bVar;
                obj = obj2;
            }
        }
        if (!(str == null || obj == null)) {
            hashMap.put(str, new b(str, bVar2, obj, z10));
        }
        obtainStyledAttributes.recycle();
    }

    public static void e(View view, HashMap<String, b> hashMap) {
        String str;
        Class<?> cls = view.getClass();
        for (String next : hashMap.keySet()) {
            b bVar = hashMap.get(next);
            if (!bVar.f2218a) {
                str = "set" + next;
            } else {
                str = next;
            }
            try {
                switch (a.f2226a[bVar.f2220c.ordinal()]) {
                    case 1:
                        cls.getMethod(str, new Class[]{Integer.TYPE}).invoke(view, new Object[]{Integer.valueOf(bVar.f2221d)});
                        break;
                    case 2:
                        cls.getMethod(str, new Class[]{Boolean.TYPE}).invoke(view, new Object[]{Boolean.valueOf(bVar.f2224g)});
                        break;
                    case 3:
                        cls.getMethod(str, new Class[]{CharSequence.class}).invoke(view, new Object[]{bVar.f2223f});
                        break;
                    case 4:
                        cls.getMethod(str, new Class[]{Integer.TYPE}).invoke(view, new Object[]{Integer.valueOf(bVar.f2225h)});
                        break;
                    case 5:
                        Method method = cls.getMethod(str, new Class[]{Drawable.class});
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(bVar.f2225h);
                        method.invoke(view, new Object[]{colorDrawable});
                        break;
                    case 6:
                        cls.getMethod(str, new Class[]{Integer.TYPE}).invoke(view, new Object[]{Integer.valueOf(bVar.f2221d)});
                        break;
                    case 7:
                        cls.getMethod(str, new Class[]{Float.TYPE}).invoke(view, new Object[]{Float.valueOf(bVar.f2222e)});
                        break;
                    case 8:
                        cls.getMethod(str, new Class[]{Float.TYPE}).invoke(view, new Object[]{Float.valueOf(bVar.f2222e)});
                        break;
                }
            } catch (NoSuchMethodException e10) {
                Log.e("TransitionLayout", e10.getMessage());
                Log.e("TransitionLayout", " Custom Attribute \"" + next + "\" not found on " + cls.getName());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(cls.getName());
                sb2.append(" must have a method ");
                sb2.append(str);
                Log.e("TransitionLayout", sb2.toString());
            } catch (IllegalAccessException e11) {
                Log.e("TransitionLayout", " Custom Attribute \"" + next + "\" not found on " + cls.getName());
                e11.printStackTrace();
            } catch (InvocationTargetException e12) {
                Log.e("TransitionLayout", " Custom Attribute \"" + next + "\" not found on " + cls.getName());
                e12.printStackTrace();
            }
        }
    }

    public String b() {
        return this.f2219b;
    }

    public C0024b c() {
        return this.f2220c;
    }

    public void f(Object obj) {
        switch (a.f2226a[this.f2220c.ordinal()]) {
            case 1:
            case 6:
                this.f2221d = ((Integer) obj).intValue();
                return;
            case 2:
                this.f2224g = ((Boolean) obj).booleanValue();
                return;
            case 3:
                this.f2223f = (String) obj;
                return;
            case 4:
            case 5:
                this.f2225h = ((Integer) obj).intValue();
                return;
            case 7:
                this.f2222e = ((Float) obj).floatValue();
                return;
            case 8:
                this.f2222e = ((Float) obj).floatValue();
                return;
            default:
                return;
        }
    }

    public b(b bVar, Object obj) {
        this.f2219b = bVar.f2219b;
        this.f2220c = bVar.f2220c;
        f(obj);
    }
}
