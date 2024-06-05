package com.startapp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: Sta */
public class ob {

    /* renamed from: a  reason: collision with root package name */
    public static final Pattern f16233a = Pattern.compile("<(head)( [^>]*)?>", 2);

    /* renamed from: b  reason: collision with root package name */
    public static final Pattern f16234b = Pattern.compile("<(head)( [^>]*)?/>", 2);

    /* renamed from: c  reason: collision with root package name */
    public static final Pattern f16235c = Pattern.compile("<(body)( [^>]*?)?>", 2);

    /* renamed from: d  reason: collision with root package name */
    public static final Pattern f16236d = Pattern.compile("<(body)( [^>]*?)?/>", 2);

    /* renamed from: e  reason: collision with root package name */
    public static final Pattern f16237e = Pattern.compile("<(html)( [^>]*?)?>", 2);

    /* renamed from: f  reason: collision with root package name */
    public static final Pattern f16238f = Pattern.compile("<(html)( [^>]*?)?/>", 2);

    /* renamed from: g  reason: collision with root package name */
    public static final Pattern f16239g = Pattern.compile("<!DOCTYPE [^>]*>", 2);

    public static boolean a(int i10, int[][] iArr) {
        if (iArr != null) {
            for (int[] iArr2 : iArr) {
                if (i10 >= iArr2[0] && i10 <= iArr2[1]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean a(String str, StringBuilder sb2, Pattern pattern, String str2, int[][] iArr) {
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

    public static boolean b(String str, StringBuilder sb2, Pattern pattern, String str2, int[][] iArr) {
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
}
