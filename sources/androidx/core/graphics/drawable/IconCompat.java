package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.util.h;
import androidx.versionedparcelable.CustomVersionedParcelable;
import com.unity3d.services.UnityAdsConstants;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;

public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k  reason: collision with root package name */
    static final PorterDuff.Mode f2903k = PorterDuff.Mode.SRC_IN;

    /* renamed from: a  reason: collision with root package name */
    public int f2904a = -1;

    /* renamed from: b  reason: collision with root package name */
    Object f2905b;

    /* renamed from: c  reason: collision with root package name */
    public byte[] f2906c = null;

    /* renamed from: d  reason: collision with root package name */
    public Parcelable f2907d = null;

    /* renamed from: e  reason: collision with root package name */
    public int f2908e = 0;

    /* renamed from: f  reason: collision with root package name */
    public int f2909f = 0;

    /* renamed from: g  reason: collision with root package name */
    public ColorStateList f2910g = null;

    /* renamed from: h  reason: collision with root package name */
    PorterDuff.Mode f2911h = f2903k;

    /* renamed from: i  reason: collision with root package name */
    public String f2912i = null;

    /* renamed from: j  reason: collision with root package name */
    public String f2913j;

    static class a {
        static IconCompat a(Object obj) {
            h.f(obj);
            int d10 = d(obj);
            if (d10 == 2) {
                return IconCompat.n((Resources) null, c(obj), b(obj));
            }
            if (d10 == 4) {
                return IconCompat.k(e(obj));
            }
            if (d10 == 6) {
                return IconCompat.h(e(obj));
            }
            IconCompat iconCompat = new IconCompat(-1);
            iconCompat.f2905b = obj;
            return iconCompat;
        }

        static int b(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.a(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getResId", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException e10) {
                Log.e("IconCompat", "Unable to get icon resource", e10);
                return 0;
            } catch (InvocationTargetException e11) {
                Log.e("IconCompat", "Unable to get icon resource", e11);
                return 0;
            } catch (NoSuchMethodException e12) {
                Log.e("IconCompat", "Unable to get icon resource", e12);
                return 0;
            }
        }

        static String c(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.b(obj);
            }
            try {
                return (String) obj.getClass().getMethod("getResPackage", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException e10) {
                Log.e("IconCompat", "Unable to get icon package", e10);
                return null;
            } catch (InvocationTargetException e11) {
                Log.e("IconCompat", "Unable to get icon package", e11);
                return null;
            } catch (NoSuchMethodException e12) {
                Log.e("IconCompat", "Unable to get icon package", e12);
                return null;
            }
        }

        static int d(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.c(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getType", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException e10) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e10);
                return -1;
            } catch (InvocationTargetException e11) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e11);
                return -1;
            } catch (NoSuchMethodException e12) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e12);
                return -1;
            }
        }

        static Uri e(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.d(obj);
            }
            try {
                return (Uri) obj.getClass().getMethod("getUri", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException e10) {
                Log.e("IconCompat", "Unable to get icon uri", e10);
                return null;
            } catch (InvocationTargetException e11) {
                Log.e("IconCompat", "Unable to get icon uri", e11);
                return null;
            } catch (NoSuchMethodException e12) {
                Log.e("IconCompat", "Unable to get icon uri", e12);
                return null;
            }
        }

        static Drawable f(Icon icon, Context context) {
            return icon.loadDrawable(context);
        }

        static Icon g(IconCompat iconCompat, Context context) {
            Icon icon;
            switch (iconCompat.f2904a) {
                case -1:
                    return (Icon) iconCompat.f2905b;
                case 1:
                    icon = Icon.createWithBitmap((Bitmap) iconCompat.f2905b);
                    break;
                case 2:
                    icon = Icon.createWithResource(iconCompat.q(), iconCompat.f2908e);
                    break;
                case 3:
                    icon = Icon.createWithData((byte[]) iconCompat.f2905b, iconCompat.f2908e, iconCompat.f2909f);
                    break;
                case 4:
                    icon = Icon.createWithContentUri((String) iconCompat.f2905b);
                    break;
                case 5:
                    if (Build.VERSION.SDK_INT < 26) {
                        icon = Icon.createWithBitmap(IconCompat.g((Bitmap) iconCompat.f2905b, false));
                        break;
                    } else {
                        icon = b.b((Bitmap) iconCompat.f2905b);
                        break;
                    }
                case 6:
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 >= 30) {
                        icon = d.a(iconCompat.t());
                        break;
                    } else if (context != null) {
                        InputStream u10 = iconCompat.u(context);
                        if (u10 != null) {
                            if (i10 < 26) {
                                icon = Icon.createWithBitmap(IconCompat.g(BitmapFactory.decodeStream(u10), false));
                                break;
                            } else {
                                icon = b.b(BitmapFactory.decodeStream(u10));
                                break;
                            }
                        } else {
                            throw new IllegalStateException("Cannot load adaptive icon from uri: " + iconCompat.t());
                        }
                    } else {
                        throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + iconCompat.t());
                    }
                default:
                    throw new IllegalArgumentException("Unknown type");
            }
            ColorStateList colorStateList = iconCompat.f2910g;
            if (colorStateList != null) {
                icon.setTintList(colorStateList);
            }
            PorterDuff.Mode mode = iconCompat.f2911h;
            if (mode != IconCompat.f2903k) {
                icon.setTintMode(mode);
            }
            return icon;
        }
    }

    static class b {
        static Drawable a(Drawable drawable, Drawable drawable2) {
            return new AdaptiveIconDrawable(drawable, drawable2);
        }

        static Icon b(Bitmap bitmap) {
            return Icon.createWithAdaptiveBitmap(bitmap);
        }
    }

    static class c {
        static int a(Object obj) {
            return ((Icon) obj).getResId();
        }

        static String b(Object obj) {
            return ((Icon) obj).getResPackage();
        }

        static int c(Object obj) {
            return ((Icon) obj).getType();
        }

        static Uri d(Object obj) {
            return ((Icon) obj).getUri();
        }
    }

    static class d {
        static Icon a(Uri uri) {
            return Icon.createWithAdaptiveBitmapContentUri(uri);
        }
    }

    public IconCompat() {
    }

    public static IconCompat f(Icon icon) {
        return a.a(icon);
    }

    static Bitmap g(Bitmap bitmap, boolean z10) {
        int min = (int) (((float) Math.min(bitmap.getWidth(), bitmap.getHeight())) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f10 = (float) min;
        float f11 = 0.5f * f10;
        float f12 = 0.9166667f * f11;
        if (z10) {
            float f13 = 0.010416667f * f10;
            paint.setColor(0);
            paint.setShadowLayer(f13, 0.0f, f10 * 0.020833334f, 1023410176);
            canvas.drawCircle(f11, f11, f12, paint);
            paint.setShadowLayer(f13, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f11, f11, f12, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate(((float) (-(bitmap.getWidth() - min))) / 2.0f, ((float) (-(bitmap.getHeight() - min))) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f11, f11, f12, paint);
        canvas.setBitmap((Bitmap) null);
        return createBitmap;
    }

    public static IconCompat h(Uri uri) {
        androidx.core.util.c.d(uri);
        return i(uri.toString());
    }

    public static IconCompat i(String str) {
        androidx.core.util.c.d(str);
        IconCompat iconCompat = new IconCompat(6);
        iconCompat.f2905b = str;
        return iconCompat;
    }

    public static IconCompat j(Bitmap bitmap) {
        androidx.core.util.c.d(bitmap);
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.f2905b = bitmap;
        return iconCompat;
    }

    public static IconCompat k(Uri uri) {
        androidx.core.util.c.d(uri);
        return l(uri.toString());
    }

    public static IconCompat l(String str) {
        androidx.core.util.c.d(str);
        IconCompat iconCompat = new IconCompat(4);
        iconCompat.f2905b = str;
        return iconCompat;
    }

    public static IconCompat m(Context context, int i10) {
        androidx.core.util.c.d(context);
        return n(context.getResources(), context.getPackageName(), i10);
    }

    public static IconCompat n(Resources resources, String str, int i10) {
        androidx.core.util.c.d(str);
        if (i10 != 0) {
            IconCompat iconCompat = new IconCompat(2);
            iconCompat.f2908e = i10;
            if (resources != null) {
                try {
                    iconCompat.f2905b = resources.getResourceName(i10);
                } catch (Resources.NotFoundException unused) {
                    throw new IllegalArgumentException("Icon resource cannot be found");
                }
            } else {
                iconCompat.f2905b = str;
            }
            iconCompat.f2913j = str;
            return iconCompat;
        }
        throw new IllegalArgumentException("Drawable resource ID must not be 0");
    }

    static Resources r(Context context, String str) {
        if ("android".equals(str)) {
            return Resources.getSystem();
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 8192);
            if (applicationInfo != null) {
                return packageManager.getResourcesForApplication(applicationInfo);
            }
            return null;
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e("IconCompat", String.format("Unable to find pkg=%s for icon", new Object[]{str}), e10);
            return null;
        }
    }

    private Drawable w(Context context) {
        switch (this.f2904a) {
            case 1:
                return new BitmapDrawable(context.getResources(), (Bitmap) this.f2905b);
            case 2:
                String q10 = q();
                if (TextUtils.isEmpty(q10)) {
                    q10 = context.getPackageName();
                }
                try {
                    return androidx.core.content.res.h.d(r(context, q10), this.f2908e, context.getTheme());
                } catch (RuntimeException e10) {
                    Log.e("IconCompat", String.format("Unable to load resource 0x%08x from pkg=%s", new Object[]{Integer.valueOf(this.f2908e), this.f2905b}), e10);
                    break;
                }
            case 3:
                return new BitmapDrawable(context.getResources(), BitmapFactory.decodeByteArray((byte[]) this.f2905b, this.f2908e, this.f2909f));
            case 4:
                InputStream u10 = u(context);
                if (u10 != null) {
                    return new BitmapDrawable(context.getResources(), BitmapFactory.decodeStream(u10));
                }
                break;
            case 5:
                return new BitmapDrawable(context.getResources(), g((Bitmap) this.f2905b, false));
            case 6:
                InputStream u11 = u(context);
                if (u11 != null) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        return b.a((Drawable) null, new BitmapDrawable(context.getResources(), BitmapFactory.decodeStream(u11)));
                    }
                    return new BitmapDrawable(context.getResources(), g(BitmapFactory.decodeStream(u11), false));
                }
                break;
        }
        return null;
    }

    private static String z(int i10) {
        switch (i10) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    public void c() {
        this.f2911h = PorterDuff.Mode.valueOf(this.f2912i);
        switch (this.f2904a) {
            case -1:
                Parcelable parcelable = this.f2907d;
                if (parcelable != null) {
                    this.f2905b = parcelable;
                    return;
                }
                throw new IllegalArgumentException("Invalid icon");
            case 1:
            case 5:
                Parcelable parcelable2 = this.f2907d;
                if (parcelable2 != null) {
                    this.f2905b = parcelable2;
                    return;
                }
                byte[] bArr = this.f2906c;
                this.f2905b = bArr;
                this.f2904a = 3;
                this.f2908e = 0;
                this.f2909f = bArr.length;
                return;
            case 2:
            case 4:
            case 6:
                String str = new String(this.f2906c, Charset.forName("UTF-16"));
                this.f2905b = str;
                if (this.f2904a == 2 && this.f2913j == null) {
                    this.f2913j = str.split(":", -1)[0];
                    return;
                }
                return;
            case 3:
                this.f2905b = this.f2906c;
                return;
            default:
                return;
        }
    }

    public void d(boolean z10) {
        this.f2912i = this.f2911h.name();
        switch (this.f2904a) {
            case -1:
                if (!z10) {
                    this.f2907d = (Parcelable) this.f2905b;
                    return;
                }
                throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
            case 1:
            case 5:
                if (z10) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    ((Bitmap) this.f2905b).compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                    this.f2906c = byteArrayOutputStream.toByteArray();
                    return;
                }
                this.f2907d = (Parcelable) this.f2905b;
                return;
            case 2:
                this.f2906c = ((String) this.f2905b).getBytes(Charset.forName("UTF-16"));
                return;
            case 3:
                this.f2906c = (byte[]) this.f2905b;
                return;
            case 4:
            case 6:
                this.f2906c = this.f2905b.toString().getBytes(Charset.forName("UTF-16"));
                return;
            default:
                return;
        }
    }

    public void e(Context context) {
        Object obj;
        if (this.f2904a == 2 && (obj = this.f2905b) != null) {
            String str = (String) obj;
            if (str.contains(":")) {
                String str2 = str.split(":", -1)[1];
                String str3 = str2.split(UnityAdsConstants.DefaultUrls.AD_ASSET_PATH, -1)[0];
                String str4 = str2.split(UnityAdsConstants.DefaultUrls.AD_ASSET_PATH, -1)[1];
                String str5 = str.split(":", -1)[0];
                if ("0_resource_name_obfuscated".equals(str4)) {
                    Log.i("IconCompat", "Found obfuscated resource, not trying to update resource id for it");
                    return;
                }
                String q10 = q();
                int identifier = r(context, q10).getIdentifier(str4, str3, str5);
                if (this.f2908e != identifier) {
                    Log.i("IconCompat", "Id has changed for " + q10 + " " + str);
                    this.f2908e = identifier;
                }
            }
        }
    }

    public Bitmap o() {
        int i10 = this.f2904a;
        if (i10 == -1 && Build.VERSION.SDK_INT >= 23) {
            Object obj = this.f2905b;
            if (obj instanceof Bitmap) {
                return (Bitmap) obj;
            }
            return null;
        } else if (i10 == 1) {
            return (Bitmap) this.f2905b;
        } else {
            if (i10 == 5) {
                return g((Bitmap) this.f2905b, true);
            }
            throw new IllegalStateException("called getBitmap() on " + this);
        }
    }

    public int p() {
        int i10 = this.f2904a;
        if (i10 == -1 && Build.VERSION.SDK_INT >= 23) {
            return a.b(this.f2905b);
        }
        if (i10 == 2) {
            return this.f2908e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    public String q() {
        int i10 = this.f2904a;
        if (i10 == -1 && Build.VERSION.SDK_INT >= 23) {
            return a.c(this.f2905b);
        }
        if (i10 == 2) {
            String str = this.f2913j;
            if (str == null || TextUtils.isEmpty(str)) {
                return ((String) this.f2905b).split(":", -1)[0];
            }
            return this.f2913j;
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    public int s() {
        int i10 = this.f2904a;
        return (i10 != -1 || Build.VERSION.SDK_INT < 23) ? i10 : a.d(this.f2905b);
    }

    public Uri t() {
        int i10 = this.f2904a;
        if (i10 == -1 && Build.VERSION.SDK_INT >= 23) {
            return a.e(this.f2905b);
        }
        if (i10 == 4 || i10 == 6) {
            return Uri.parse((String) this.f2905b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    public String toString() {
        if (this.f2904a == -1) {
            return String.valueOf(this.f2905b);
        }
        StringBuilder sb2 = new StringBuilder("Icon(typ=");
        sb2.append(z(this.f2904a));
        switch (this.f2904a) {
            case 1:
            case 5:
                sb2.append(" size=");
                sb2.append(((Bitmap) this.f2905b).getWidth());
                sb2.append("x");
                sb2.append(((Bitmap) this.f2905b).getHeight());
                break;
            case 2:
                sb2.append(" pkg=");
                sb2.append(this.f2913j);
                sb2.append(" id=");
                sb2.append(String.format("0x%08x", new Object[]{Integer.valueOf(p())}));
                break;
            case 3:
                sb2.append(" len=");
                sb2.append(this.f2908e);
                if (this.f2909f != 0) {
                    sb2.append(" off=");
                    sb2.append(this.f2909f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb2.append(" uri=");
                sb2.append(this.f2905b);
                break;
        }
        if (this.f2910g != null) {
            sb2.append(" tint=");
            sb2.append(this.f2910g);
        }
        if (this.f2911h != f2903k) {
            sb2.append(" mode=");
            sb2.append(this.f2911h);
        }
        sb2.append(")");
        return sb2.toString();
    }

    public InputStream u(Context context) {
        Uri t10 = t();
        String scheme = t10.getScheme();
        if ("content".equals(scheme) || "file".equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(t10);
            } catch (Exception e10) {
                Log.w("IconCompat", "Unable to load image from URI: " + t10, e10);
                return null;
            }
        } else {
            try {
                return new FileInputStream(new File((String) this.f2905b));
            } catch (FileNotFoundException e11) {
                Log.w("IconCompat", "Unable to load image from path: " + t10, e11);
                return null;
            }
        }
    }

    public Drawable v(Context context) {
        e(context);
        if (Build.VERSION.SDK_INT >= 23) {
            return a.f(y(context), context);
        }
        Drawable w10 = w(context);
        if (!(w10 == null || (this.f2910g == null && this.f2911h == f2903k))) {
            w10.mutate();
            a.o(w10, this.f2910g);
            a.p(w10, this.f2911h);
        }
        return w10;
    }

    @Deprecated
    public Icon x() {
        return y((Context) null);
    }

    public Icon y(Context context) {
        if (Build.VERSION.SDK_INT >= 23) {
            return a.g(this, context);
        }
        throw new UnsupportedOperationException("This method is only supported on API level 23+");
    }

    IconCompat(int i10) {
        this.f2904a = i10;
    }
}
