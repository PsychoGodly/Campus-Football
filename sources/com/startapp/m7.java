package com.startapp;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.regex.Pattern;

/* compiled from: Sta */
public final class m7 {
    public static String a(String str, String str2) {
        Pattern pattern = ob.f16233a;
        String str3 = "<script type=\"text/javascript\">" + str + "</script>";
        fc.a(str2, "HTML is null or empty");
        ArrayList arrayList = new ArrayList();
        int length = str2.length();
        int i10 = 0;
        while (i10 < length) {
            int indexOf = str2.indexOf("<!--", i10);
            if (indexOf >= 0) {
                int indexOf2 = str2.indexOf("-->", indexOf);
                int[] iArr = new int[2];
                if (indexOf2 >= 0) {
                    iArr[0] = indexOf;
                    iArr[1] = indexOf2;
                    arrayList.add(iArr);
                    i10 = indexOf2 + 3;
                } else {
                    iArr[0] = indexOf;
                    iArr[1] = length;
                    arrayList.add(iArr);
                }
            }
            i10 = length;
        }
        int[][] iArr2 = (int[][]) arrayList.toArray((int[][]) Array.newInstance(int.class, new int[]{0, 2}));
        StringBuilder sb2 = new StringBuilder(str3.length() + str2.length() + 16);
        if (ob.b(str2, sb2, ob.f16234b, str3, iArr2) || ob.a(str2, sb2, ob.f16233a, str3, iArr2) || ob.b(str2, sb2, ob.f16236d, str3, iArr2) || ob.a(str2, sb2, ob.f16235c, str3, iArr2) || ob.b(str2, sb2, ob.f16238f, str3, iArr2) || ob.a(str2, sb2, ob.f16237e, str3, iArr2) || ob.a(str2, sb2, ob.f16239g, str3, iArr2)) {
            return sb2.toString();
        }
        return str3 + str2;
    }
}
