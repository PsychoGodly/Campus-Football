package com.iab.omid.library.applovin;

import com.iab.omid.library.applovin.utils.g;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class c {

    /* renamed from: a  reason: collision with root package name */
    private static final Pattern f27364a = Pattern.compile("<(head)( [^>]*)?>", 2);

    /* renamed from: b  reason: collision with root package name */
    private static final Pattern f27365b = Pattern.compile("<(head)( [^>]*)?/>", 2);

    /* renamed from: c  reason: collision with root package name */
    private static final Pattern f27366c = Pattern.compile("<(body)( [^>]*?)?>", 2);

    /* renamed from: d  reason: collision with root package name */
    private static final Pattern f27367d = Pattern.compile("<(body)( [^>]*?)?/>", 2);

    /* renamed from: e  reason: collision with root package name */
    private static final Pattern f27368e = Pattern.compile("<(html)( [^>]*?)?>", 2);

    /* renamed from: f  reason: collision with root package name */
    private static final Pattern f27369f = Pattern.compile("<(html)( [^>]*?)?/>", 2);

    /* renamed from: g  reason: collision with root package name */
    private static final Pattern f27370g = Pattern.compile("<!DOCTYPE [^>]*>", 2);

    static String a(String str, String str2) {
        g.a(str, "HTML is null or empty");
        int[][] a10 = a(str);
        StringBuilder sb2 = new StringBuilder(str.length() + str2.length() + 16);
        if (b(str, sb2, f27365b, str2, a10)) {
            return sb2.toString();
        }
        if (a(str, sb2, f27364a, str2, a10)) {
            return sb2.toString();
        }
        if (b(str, sb2, f27367d, str2, a10)) {
            return sb2.toString();
        }
        if (a(str, sb2, f27366c, str2, a10)) {
            return sb2.toString();
        }
        if (b(str, sb2, f27369f, str2, a10)) {
            return sb2.toString();
        }
        if (a(str, sb2, f27368e, str2, a10)) {
            return sb2.toString();
        }
        if (a(str, sb2, f27370g, str2, a10)) {
            return sb2.toString();
        }
        return str2 + str;
    }

    static String b(String str, String str2) {
        return a(str2, "<script type=\"text/javascript\">" + str + "</script>");
    }

    private static boolean a(int i10, int[][] iArr) {
        if (iArr != null) {
            for (int[] iArr2 : iArr) {
                if (i10 >= iArr2[0] && i10 <= iArr2[1]) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean b(String str, StringBuilder sb2, Pattern pattern, String str2, int[][] iArr) {
        Matcher matcher = pattern.matcher(str);
        int i10 = 0;
        while (matcher.find(i10)) {
            int start = matcher.start();
            int end = matcher.end();
            if (!a(start, iArr)) {
                sb2.append(str.substring(0, matcher.end() - 2));
                sb2.append(">");
                sb2.append(str2);
                sb2.append("</");
                sb2.append(matcher.group(1));
                sb2.append(">");
                sb2.append(str.substring(matcher.end()));
                return true;
            }
            i10 = end;
        }
        return false;
    }

    private static boolean a(String str, StringBuilder sb2, Pattern pattern, String str2, int[][] iArr) {
        Matcher matcher = pattern.matcher(str);
        int i10 = 0;
        while (matcher.find(i10)) {
            int start = matcher.start();
            int end = matcher.end();
            if (!a(start, iArr)) {
                sb2.append(str.substring(0, matcher.end()));
                sb2.append(str2);
                sb2.append(str.substring(matcher.end()));
                return true;
            }
            i10 = end;
        }
        return false;
    }

    private static int[][] a(String str) {
        ArrayList arrayList = new ArrayList();
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            int indexOf = str.indexOf("<!--", i10);
            if (indexOf >= 0) {
                int indexOf2 = str.indexOf("-->", indexOf);
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
        return (int[][]) arrayList.toArray((int[][]) Array.newInstance(int.class, new int[]{0, 2}));
    }
}
