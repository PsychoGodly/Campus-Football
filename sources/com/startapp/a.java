package com.startapp;

import android.util.Base64;
import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.mediation.MaxReward;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.security.MessageDigest;

/* compiled from: Sta */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f15589a = {10, Ascii.RS, 84, 95, 101, Ascii.DC4, 0, Ascii.SO, Ascii.SI, 80, 36, 84, 64, 82, 84, 64, 80, 80, 65, 78, 84, 73, 70, 82, 65, 85, 68, 75, 69, 89, 1, 2, 3, 8, Ascii.SI, 42, 10, 51, 44, 32};

    /* renamed from: b  reason: collision with root package name */
    public static final String f15590b = "ts";

    /* renamed from: c  reason: collision with root package name */
    public static final String f15591c = "tsh";

    /* renamed from: d  reason: collision with root package name */
    public static final String f15592d = "afh";

    /* renamed from: e  reason: collision with root package name */
    public static final String f15593e = "MD5";

    /* renamed from: f  reason: collision with root package name */
    public static final String f15594f = "UTF-8";

    /* renamed from: g  reason: collision with root package name */
    public static final byte[] f15595g = {Ascii.FF, Ascii.US, 86, 96, 103, 10, Ascii.FS, Ascii.SI, 17, Ascii.FS, 36, 84, 64, 82, 84, 64, 80, 80, 69, 78, 67, 82, 89, 80, 84, 73, 79, 78, 75, 69, 89, 4, 32, Ascii.DC2, Ascii.DLE, Ascii.DC2, Ascii.VT, 53, 45, 34};

    static {
        a0.a((Class<?>) a.class);
    }

    public static String a() {
        int hashCode = f15589a.hashCode();
        long currentTimeMillis = System.currentTimeMillis();
        if (hashCode > 0) {
            int i10 = (int) ((((currentTimeMillis * 25214903917L) + 11) & 281474976710655L) >>> 17);
            if (((-hashCode) & hashCode) != hashCode) {
                int i11 = i10 % hashCode;
            }
        }
        return new Long(System.currentTimeMillis()).toString();
    }

    public static String b(String str) {
        return Base64.encodeToString(a(str.getBytes()), 2);
    }

    public static String c(String str) {
        String str2 = MaxReward.DEFAULT_LABEL;
        if (str != null) {
            try {
                str2 = URLDecoder.decode(str, f15594f);
            } catch (UnsupportedEncodingException unused) {
            }
        }
        String a10 = a();
        StringBuilder a11 = p0.a("&");
        a11.append(f15590b);
        a11.append("=");
        a11.append(a10);
        a11.append("&");
        a11.append(f15592d);
        a11.append("=");
        a11.append(a(str2 + a10));
        return a11.toString();
    }

    public static String a(String str) {
        byte[] bytes = str.getBytes();
        byte[] bArr = f15589a;
        int length = bytes.length < bArr.length ? bytes.length : bArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            byte b10 = bytes[i10];
            byte b11 = bArr[i10];
        }
        byte[] bytes2 = str.getBytes();
        byte b12 = f15589a[5];
        byte[] bArr2 = new byte[Math.min(bytes2.length, b12)];
        for (int i11 = 0; i11 < bytes2.length; i11++) {
            int i12 = i11 % b12;
            bArr2[i12] = (byte) (bArr2[i12] ^ bytes2[i11]);
        }
        byte[] bArr3 = f15589a;
        try {
            return URLEncoder.encode(Base64.encodeToString(MessageDigest.getInstance(f15593e).digest(a(bArr2, new String(bArr3).substring(bArr3[0], bArr3[1]).getBytes())), 3), f15594f);
        } catch (Throwable unused) {
            return MaxReward.DEFAULT_LABEL;
        }
    }

    public static byte[] a(byte[] bArr) {
        byte[] bArr2 = f15595g;
        int hashCode = bArr2.hashCode();
        long hashCode2 = (long) bArr.hashCode();
        if (((long) hashCode) > hashCode2) {
            int i10 = (int) ((((hashCode2 * 29509871405L) + 11) & 16777215) >>> 17);
            if (hashCode >= 1000) {
                int i11 = i10 % hashCode;
            }
        }
        return a(a(bArr, new String(bArr2).substring(bArr2[5], bArr2[33]).getBytes()), new String(bArr2).substring(bArr2[35], bArr2[1]).getBytes());
    }

    public static byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length];
        for (int i10 = 0; i10 < bArr.length; i10++) {
            bArr3[i10] = (byte) (bArr[i10] ^ bArr2[i10 % bArr2.length]);
        }
        return bArr3;
    }
}
