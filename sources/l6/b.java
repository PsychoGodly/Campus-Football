package l6;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;

/* compiled from: RippleUtils */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f29181a = (Build.VERSION.SDK_INT >= 21);

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f29182b = {16842919};

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f29183c = {16843623, 16842908};

    /* renamed from: d  reason: collision with root package name */
    private static final int[] f29184d = {16842908};

    /* renamed from: e  reason: collision with root package name */
    private static final int[] f29185e = {16843623};

    /* renamed from: f  reason: collision with root package name */
    private static final int[] f29186f = {16842913, 16842919};

    /* renamed from: g  reason: collision with root package name */
    private static final int[] f29187g = {16842913, 16843623, 16842908};

    /* renamed from: h  reason: collision with root package name */
    private static final int[] f29188h = {16842913, 16842908};

    /* renamed from: i  reason: collision with root package name */
    private static final int[] f29189i = {16842913, 16843623};

    /* renamed from: j  reason: collision with root package name */
    private static final int[] f29190j = {16842913};

    /* renamed from: k  reason: collision with root package name */
    private static final int[] f29191k = {16842910, 16842919};

    /* renamed from: l  reason: collision with root package name */
    static final String f29192l = b.class.getSimpleName();

    private b() {
    }

    public static ColorStateList a(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 22 && i10 <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f29191k, 0)) != 0) {
            Log.w(f29192l, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
        }
        return colorStateList;
    }

    public static boolean b(int[] iArr) {
        boolean z10 = false;
        boolean z11 = false;
        for (int i10 : iArr) {
            if (i10 == 16842910) {
                z10 = true;
            } else if (i10 == 16842908 || i10 == 16842919 || i10 == 16843623) {
                z11 = true;
            }
        }
        return z10 && z11;
    }
}
