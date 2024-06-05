package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import androidx.versionedparcelable.a;

public class IconCompatParcelizer {
    public static IconCompat read(a aVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f2904a = aVar.v(iconCompat.f2904a, 1);
        iconCompat.f2906c = aVar.m(iconCompat.f2906c, 2);
        iconCompat.f2907d = aVar.A(iconCompat.f2907d, 3);
        iconCompat.f2908e = aVar.v(iconCompat.f2908e, 4);
        iconCompat.f2909f = aVar.v(iconCompat.f2909f, 5);
        iconCompat.f2910g = (ColorStateList) aVar.A(iconCompat.f2910g, 6);
        iconCompat.f2912i = aVar.E(iconCompat.f2912i, 7);
        iconCompat.f2913j = aVar.E(iconCompat.f2913j, 8);
        iconCompat.c();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, a aVar) {
        aVar.K(true, true);
        iconCompat.d(aVar.g());
        int i10 = iconCompat.f2904a;
        if (-1 != i10) {
            aVar.Y(i10, 1);
        }
        byte[] bArr = iconCompat.f2906c;
        if (bArr != null) {
            aVar.Q(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f2907d;
        if (parcelable != null) {
            aVar.d0(parcelable, 3);
        }
        int i11 = iconCompat.f2908e;
        if (i11 != 0) {
            aVar.Y(i11, 4);
        }
        int i12 = iconCompat.f2909f;
        if (i12 != 0) {
            aVar.Y(i12, 5);
        }
        ColorStateList colorStateList = iconCompat.f2910g;
        if (colorStateList != null) {
            aVar.d0(colorStateList, 6);
        }
        String str = iconCompat.f2912i;
        if (str != null) {
            aVar.h0(str, 7);
        }
        String str2 = iconCompat.f2913j;
        if (str2 != null) {
            aVar.h0(str2, 8);
        }
    }
}
