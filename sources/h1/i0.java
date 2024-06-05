package h1;

import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: ViewUtilsBase */
class i0 {

    /* renamed from: a  reason: collision with root package name */
    private static Method f18626a;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f18627b;

    /* renamed from: c  reason: collision with root package name */
    private static Field f18628c;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f18629d;

    i0() {
    }

    private void b() {
        if (!f18627b) {
            Class<View> cls = View.class;
            try {
                Class cls2 = Integer.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("setFrame", new Class[]{cls2, cls2, cls2, cls2});
                f18626a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e10) {
                Log.i("ViewUtilsBase", "Failed to retrieve setFrame method", e10);
            }
            f18627b = true;
        }
    }

    public void a(View view) {
        if (view.getVisibility() == 0) {
            view.setTag(j.save_non_transition_alpha, (Object) null);
        }
    }

    public float c(View view) {
        Float f10 = (Float) view.getTag(j.save_non_transition_alpha);
        if (f10 != null) {
            return view.getAlpha() / f10.floatValue();
        }
        return view.getAlpha();
    }

    public void d(View view) {
        int i10 = j.save_non_transition_alpha;
        if (view.getTag(i10) == null) {
            view.setTag(i10, Float.valueOf(view.getAlpha()));
        }
    }

    public void e(View view, int i10, int i11, int i12, int i13) {
        b();
        Method method = f18626a;
        if (method != null) {
            try {
                method.invoke(view, new Object[]{Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13)});
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e10) {
                throw new RuntimeException(e10.getCause());
            }
        }
    }

    public void f(View view, float f10) {
        Float f11 = (Float) view.getTag(j.save_non_transition_alpha);
        if (f11 != null) {
            view.setAlpha(f11.floatValue() * f10);
        } else {
            view.setAlpha(f10);
        }
    }

    public void g(View view, int i10) {
        if (!f18629d) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f18628c = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsBase", "fetchViewFlagsField: ");
            }
            f18629d = true;
        }
        Field field = f18628c;
        if (field != null) {
            try {
                f18628c.setInt(view, i10 | (field.getInt(view) & -13));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public void h(View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            h(view2, matrix);
            matrix.preTranslate((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
        }
        matrix.preTranslate((float) view.getLeft(), (float) view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (!matrix2.isIdentity()) {
            matrix.preConcat(matrix2);
        }
    }

    public void i(View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            i(view2, matrix);
            matrix.postTranslate((float) view2.getScrollX(), (float) view2.getScrollY());
        }
        matrix.postTranslate((float) (-view.getLeft()), (float) (-view.getTop()));
        Matrix matrix2 = view.getMatrix();
        if (!matrix2.isIdentity()) {
            Matrix matrix3 = new Matrix();
            if (matrix2.invert(matrix3)) {
                matrix.postConcat(matrix3);
            }
        }
    }
}
