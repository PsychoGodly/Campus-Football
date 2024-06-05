package com.startapp;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.res.Resources;
import android.os.Build;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Sta */
public class y {

    /* renamed from: c  reason: collision with root package name */
    public static final String f17545c = j9.a(71, 13, -10, 14, -3, -6, -5, -54, 66, -11, 13, -5, -4, 10, 0, -10, 6, -1, -64, 19, 2, 0, 2, 14, 0, 12);

    /* renamed from: d  reason: collision with root package name */
    public static final String f17546d = j9.a(66, 3, 5, -9);

    /* renamed from: e  reason: collision with root package name */
    public static final String f17547e = j9.a(61, 12, -14, 17, 1, -14);

    /* renamed from: f  reason: collision with root package name */
    public static final String f17548f = j9.a(56, -1, 2, 8, -4, 11, -3, 6, -7, -10);

    /* renamed from: g  reason: collision with root package name */
    public static final String f17549g = j9.a(86, -19, 3, -12, -2, 19, -11, 6, -1);

    /* renamed from: a  reason: collision with root package name */
    public final Context f17550a;

    /* renamed from: b  reason: collision with root package name */
    public final AtomicInteger f17551b = new AtomicInteger(0);

    public y(Context context) {
        this.f17550a = context;
    }

    public void a(int i10) {
        Locale locale = Locale.ENGLISH;
        Object[] objArr = new Object[3];
        int i11 = 0;
        objArr[0] = Integer.valueOf(this.f17551b.incrementAndGet());
        Context context = this.f17550a;
        try {
            Resources resources = context.getResources();
            int identifier = resources.getIdentifier("com_startapp_sdk_aar", "integer", context.getPackageName());
            if (identifier != 0) {
                i11 = resources.getInteger(identifier);
            }
        } catch (Throwable unused) {
        }
        objArr[1] = Integer.valueOf(i11);
        objArr[2] = Integer.valueOf(i10);
        String format = String.format(locale, "cnt=%d,aar=%d,mds=%d", objArr);
        i3 i3Var = new i3(j3.f15951d);
        i3Var.f15914d = MobileAdsBridgeBase.initializeMethodName;
        i3Var.f15915e = format;
        i3Var.a();
    }

    public String a() {
        Context context = this.f17550a;
        StringBuilder sb2 = new StringBuilder();
        String str = f17545c;
        sb2.append(str);
        sb2.append(f17547e);
        String str2 = f17549g;
        sb2.append(str2);
        StringBuilder a10 = p0.a(str);
        a10.append(f17546d);
        a10.append(str2);
        StringBuilder a11 = p0.a(str);
        a11.append(f17548f);
        a11.append(str2);
        String[] strArr = {sb2.toString(), a10.toString(), a11.toString()};
        int[] iArr = new int[3];
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096);
            String[] strArr2 = packageInfo.requestedPermissions;
            if (strArr2 != null) {
                int length = strArr2.length;
                for (int i10 = 0; i10 < length; i10++) {
                    for (int i11 = 0; i11 < 3; i11++) {
                        if (strArr[i11].equals(packageInfo.requestedPermissions[i10])) {
                            if (Build.VERSION.SDK_INT < 16) {
                                iArr[i11] = 2;
                            } else if ((packageInfo.requestedPermissionsFlags[i10] & 2) == 2) {
                                iArr[i11] = 2;
                            } else {
                                iArr[i11] = 1;
                            }
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
        StringBuilder sb3 = new StringBuilder(3);
        for (int i12 = 0; i12 < 3; i12++) {
            sb3.append(iArr[i12]);
        }
        return sb3.toString();
    }
}
