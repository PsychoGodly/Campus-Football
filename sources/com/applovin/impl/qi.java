package com.applovin.impl;

import android.text.TextUtils;
import android.util.Base64;
import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxReward;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import com.unity3d.services.UnityAdsConstants;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public abstract class qi {

    /* renamed from: a  reason: collision with root package name */
    private static final byte[] f10992a = {-83, -98, -53, -112, -29, -118, 55, 117, 59, 8, -12, -15, 73, 110, -67, 57, 117, 4, -26, 97, 66, -12, 125, 91, -119, -103, -30, 114, 123, 54, 51, -77};

    /* renamed from: b  reason: collision with root package name */
    private static final byte[] f10993b;

    public enum a {
        NONE(-1),
        DEFAULT(0),
        V2(1);
        

        /* renamed from: a  reason: collision with root package name */
        private final int f10998a;

        private a(int i10) {
            this.f10998a = i10;
        }

        public int b() {
            return this.f10998a;
        }

        public static a a(int i10) {
            if (i10 == 0) {
                return DEFAULT;
            }
            if (i10 == 1) {
                return V2;
            }
            return DEFAULT;
        }
    }

    static {
        byte[] bArr = new byte[32];
        f10993b = bArr;
        System.arraycopy(new byte[]{Ascii.DC2, Ascii.FF, Ascii.FS, Ascii.DC4, 17, Ascii.ETB, Ascii.SUB, 9, Ascii.NAK, 3, Ascii.SO, Ascii.GS, 4, 0, 2, 7, 10, Ascii.GS, 6, Ascii.DC4, 1}, 0, bArr, 0, 21);
    }

    private static String a(String str, String str2, k kVar) {
        String str3 = str2;
        k kVar2 = kVar;
        String[] split = str.split(":");
        char c10 = 0;
        try {
            if (!UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION.equals(split[0])) {
                return null;
            }
            if (split.length != 4) {
                return null;
            }
            String str4 = split[1];
            String str5 = split[2];
            byte[] b10 = b(split[3]);
            if (!str3.endsWith(str5)) {
                return null;
            }
            byte[] bArr = f10992a;
            if (!a(bArr, kVar2).equals(str4)) {
                return null;
            }
            char c11 = ' ';
            byte[] a10 = a(str3.substring(0, 32), bArr, kVar2);
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(b10);
            char c12 = 8;
            long read = (((long) ((byteArrayInputStream.read() ^ a10[1]) & 255)) << 8) | ((long) ((byteArrayInputStream.read() ^ a10[0]) & 255)) | (((long) ((byteArrayInputStream.read() ^ a10[2]) & 255)) << 16) | (((long) ((byteArrayInputStream.read() ^ a10[3]) & 255)) << 24) | (((long) ((byteArrayInputStream.read() ^ a10[4]) & 255)) << 32) | (((long) ((byteArrayInputStream.read() ^ a10[5]) & 255)) << 40) | (((long) ((byteArrayInputStream.read() ^ a10[6]) & 255)) << 48) | (((long) ((byteArrayInputStream.read() ^ a10[7]) & 255)) << 56);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr2 = new byte[8];
            int read2 = byteArrayInputStream.read(bArr2);
            int i10 = 0;
            while (read2 >= 0) {
                long j10 = ((long) i10) + read;
                long j11 = (j10 ^ (j10 >> 33)) * -4417276706812531889L;
                long j12 = (j11 ^ (j11 >> 29)) * -8796714831421723037L;
                long j13 = j12 ^ (j12 >> c11);
                byteArrayOutputStream.write((byte) ((int) (((long) (bArr2[c10] ^ a10[i10 % a10.length])) ^ (j13 & 255))));
                byteArrayOutputStream.write((byte) ((int) (((long) (a10[(i10 + 1) % a10.length] ^ bArr2[1])) ^ ((j13 >> c12) & 255))));
                byteArrayOutputStream.write((byte) ((int) (((long) (a10[(i10 + 2) % a10.length] ^ bArr2[2])) ^ ((j13 >> 16) & 255))));
                byteArrayOutputStream.write((byte) ((int) (((long) (bArr2[3] ^ a10[(i10 + 3) % a10.length])) ^ ((j13 >> 24) & 255))));
                byteArrayOutputStream.write((byte) ((int) (((long) (a10[(i10 + 4) % a10.length] ^ bArr2[4])) ^ ((j13 >> 32) & 255))));
                long j14 = read;
                byteArrayOutputStream.write((byte) ((int) (((long) (a10[(i10 + 5) % a10.length] ^ bArr2[5])) ^ ((j13 >> 40) & 255))));
                byteArrayOutputStream.write((byte) ((int) (((long) (a10[(i10 + 6) % a10.length] ^ bArr2[6])) ^ ((j13 >> 48) & 255))));
                byteArrayOutputStream.write((byte) ((int) (((long) (bArr2[7] ^ a10[(i10 + 7) % a10.length])) ^ ((j13 >> 56) & 255))));
                ByteArrayInputStream byteArrayInputStream2 = byteArrayInputStream;
                i10 += 8;
                byteArrayInputStream = byteArrayInputStream2;
                read2 = byteArrayInputStream2.read(bArr2);
                read = j14;
                c12 = 8;
                c10 = 0;
                c11 = ' ';
            }
            return new String(byteArrayOutputStream.toByteArray(), "UTF-8").trim();
        } catch (UnsupportedEncodingException e10) {
            kVar.B().a("AppLovinSdk", "decode", (Throwable) e10);
            throw new RuntimeException("UTF-8 encoding not found", e10);
        } catch (IOException e11) {
            t.b("AppLovinSdk", "Failed to read bytes", e11);
            kVar.B().a("AppLovinSdk", "decode", (Throwable) e11);
            return null;
        }
    }

    public static String b(String str, long j10, a aVar, String str2, k kVar) {
        byte[] bArr;
        if (str2 == null) {
            throw new IllegalArgumentException("No SDK key specified");
        } else if (str2.length() < 80) {
            throw new IllegalArgumentException("SDK key is too short");
        } else if (TextUtils.isEmpty(str) || a.NONE == aVar) {
            return str;
        } else {
            if (a.V2 == aVar) {
                bArr = a(str, j10, true, str2, kVar);
            } else {
                bArr = a(str, j10, str2, kVar);
            }
            if (bArr != null) {
                return new String(bArr);
            }
            return null;
        }
    }

    private static int c(byte[] bArr, String str, k kVar) {
        int a10;
        int i10;
        if (bArr == null || bArr.length == 0 || TextUtils.isEmpty(str) || (a10 = a(bArr, (byte) 58)) < 0) {
            return 0;
        }
        byte[] bytes = a(f10993b, kVar).getBytes();
        int i11 = a10 + 1;
        int length = bytes.length + i11;
        if (bArr.length <= length || bArr[length] != 58 || bArr.length <= (i10 = length + 55) || bArr[i10] != 58 || !Arrays.equals(Arrays.copyOfRange(bArr, i11, bytes.length + i11), bytes)) {
            return 0;
        }
        int i12 = length + 56;
        if (length + 64 > bArr.length) {
            return 0;
        }
        return i12;
    }

    public static a b(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return a.NONE;
        }
        char c10 = (char) bArr[0];
        if (c10 == '2') {
            return a.V2;
        }
        if (c10 == '{') {
            return a.NONE;
        }
        return a.DEFAULT;
    }

    private static String c(byte[] bArr) {
        return a(Base64.encode(bArr, 2));
    }

    public static String b(byte[] bArr, String str, k kVar) {
        if (str == null) {
            throw new IllegalArgumentException("No SDK key specified");
        } else if (str.length() < 80) {
            throw new IllegalArgumentException("SDK key is too short");
        } else if (bArr == null) {
            return null;
        } else {
            if (bArr.length == 0) {
                return MaxReward.DEFAULT_LABEL;
            }
            a b10 = b(bArr);
            if (a.NONE == b10) {
                return new String(bArr);
            }
            if (b10 == a.V2) {
                return a(bArr, str, kVar);
            }
            return a(new String(bArr), str, kVar);
        }
    }

    private static byte[] b(String str) {
        return Base64.decode(a(str), 0);
    }

    private static String a(String str) {
        return str.replace('-', '+').replace('_', '/').replace('*', '=');
    }

    private static String a(byte[] bArr, String str, k kVar) {
        try {
            int c10 = c(bArr, str, kVar);
            if (c10 == 0) {
                return null;
            }
            byte[] copyOfRange = Arrays.copyOfRange(bArr, c10, bArr.length);
            if (copyOfRange.length < 16) {
                return null;
            }
            long a10 = zp.a(copyOfRange, 8);
            byte[] a11 = a(str.substring(0, 32), f10993b, kVar);
            return new String(zp.d(a(Arrays.copyOfRange(copyOfRange, 16, copyOfRange.length), a10 ^ zp.c(a11), a11)), "UTF-8");
        } catch (UnsupportedEncodingException e10) {
            kVar.B().a("AppLovinSdk", "decode2", (Throwable) e10);
            throw new RuntimeException("UTF-8 encoding not found", e10);
        } catch (IOException e11) {
            t.b("AppLovinSdk", "Failed to ungzip decode", e11);
            kVar.B().a("AppLovinSdk", "decode2", (Throwable) e11);
            return null;
        }
    }

    private static byte[] a(String str, long j10, String str2, k kVar) {
        String str3 = str2;
        k kVar2 = kVar;
        char c10 = ' ';
        try {
            String substring = str3.substring(32);
            String substring2 = str3.substring(0, 32);
            byte[] bytes = str.getBytes("UTF-8");
            byte[] a10 = a(substring2, f10992a, kVar2);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(((byte) ((int) (j10 & 255))) ^ a10[0]);
            byteArrayOutputStream.write(((byte) ((int) ((j10 >> 8) & 255))) ^ a10[1]);
            byteArrayOutputStream.write(((byte) ((int) ((j10 >> 16) & 255))) ^ a10[2]);
            byteArrayOutputStream.write(((byte) ((int) ((j10 >> 24) & 255))) ^ a10[3]);
            byteArrayOutputStream.write(((byte) ((int) ((j10 >> 32) & 255))) ^ a10[4]);
            byteArrayOutputStream.write(((byte) ((int) ((j10 >> 40) & 255))) ^ a10[5]);
            byteArrayOutputStream.write(((byte) ((int) ((j10 >> 48) & 255))) ^ a10[6]);
            byteArrayOutputStream.write(((byte) ((int) ((j10 >> 56) & 255))) ^ a10[7]);
            int i10 = 0;
            while (i10 < bytes.length) {
                long j11 = j10 + ((long) i10);
                long j12 = (j11 ^ (j11 >> 33)) * -4417276706812531889L;
                long j13 = (j12 ^ (j12 >> 29)) * -8796714831421723037L;
                long j14 = j13 ^ (j13 >> c10);
                String str4 = substring;
                byteArrayOutputStream.write((byte) ((int) (((long) ((i10 >= bytes.length ? 0 : bytes[i10]) ^ a10[i10 % a10.length])) ^ (j14 & 255))));
                int i11 = i10 + 1;
                byteArrayOutputStream.write((byte) ((int) (((long) (a10[i11 % a10.length] ^ (i11 >= bytes.length ? 0 : bytes[i11]))) ^ ((j14 >> 8) & 255))));
                int i12 = i10 + 2;
                byteArrayOutputStream.write((byte) ((int) (((long) (a10[i12 % a10.length] ^ (i12 >= bytes.length ? 0 : bytes[i12]))) ^ ((j14 >> 16) & 255))));
                int i13 = i10 + 3;
                byteArrayOutputStream.write((byte) ((int) (((long) (a10[i13 % a10.length] ^ (i13 >= bytes.length ? 0 : bytes[i13]))) ^ ((j14 >> 24) & 255))));
                int i14 = i10 + 4;
                byteArrayOutputStream.write((byte) ((int) (((long) (a10[i14 % a10.length] ^ (i14 >= bytes.length ? 0 : bytes[i14]))) ^ ((j14 >> 32) & 255))));
                int i15 = i10 + 5;
                byteArrayOutputStream.write((byte) ((int) (((long) (a10[i15 % a10.length] ^ (i15 >= bytes.length ? 0 : bytes[i15]))) ^ ((j14 >> 40) & 255))));
                int i16 = i10 + 6;
                byteArrayOutputStream.write((byte) ((int) (((long) (a10[i16 % a10.length] ^ (i16 >= bytes.length ? 0 : bytes[i16]))) ^ ((j14 >> 48) & 255))));
                int i17 = i10 + 7;
                byteArrayOutputStream.write((byte) ((int) (((long) (a10[i17 % a10.length] ^ (i17 >= bytes.length ? 0 : bytes[i17]))) ^ ((j14 >> 56) & 255))));
                i10 += 8;
                substring = str4;
                c10 = ' ';
            }
            String str5 = substring;
            String c11 = c(byteArrayOutputStream.toByteArray());
            String a11 = a(f10992a, kVar2);
            return ("1:" + a11 + ":" + str5 + ":" + c11).getBytes("UTF-8");
        } catch (UnsupportedEncodingException e10) {
            kVar.B().a("AppLovinSdk", "encode", (Throwable) e10);
            return null;
        }
    }

    public static byte[] a(String str, long j10, a aVar, String str2, k kVar) {
        if (str2 == null) {
            throw new IllegalArgumentException("No SDK key specified");
        } else if (str2.length() < 80) {
            throw new IllegalArgumentException("SDK key is too short");
        } else if (TextUtils.isEmpty(str)) {
            return new byte[0];
        } else {
            if (a.NONE == aVar) {
                return str.getBytes();
            }
            if (a.V2 == aVar) {
                return a(str, j10, false, str2, kVar);
            }
            return a(str, j10, str2, kVar);
        }
    }

    private static byte[] a(byte[] bArr, long j10, byte[] bArr2) {
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        long j11 = j10;
        for (int i10 = 0; i10 < bArr.length; i10++) {
            int i11 = i10 % 8;
            if (i11 == 0) {
                long j12 = ((long) i10) + j10;
                long j13 = (j12 ^ (j12 >>> 33)) * -4417276706812531889L;
                long j14 = (j13 ^ (j13 >>> 29)) * -8796714831421723037L;
                j11 = j14 ^ (j14 >>> 32);
            }
            copyOf[i10] = (byte) ((int) (((long) copyOf[i10]) ^ (((j11 >> (i11 * 8)) & 255) ^ ((long) bArr2[i10 % bArr2.length]))));
        }
        return copyOf;
    }

    private static byte[] a(String str, long j10, boolean z10, String str2, k kVar) {
        ByteBuffer byteBuffer;
        try {
            byte[] bytes = str.getBytes("UTF-8");
            int length = bytes.length;
            String substring = str2.substring(32);
            String substring2 = str2.substring(0, 32);
            byte[] bArr = f10993b;
            byte[] a10 = a(substring2, bArr, kVar);
            byte[] bytes2 = String.format("2:%s:%s:", new Object[]{a(bArr, kVar), substring}).getBytes();
            ByteBuffer allocate = ByteBuffer.allocate(16);
            allocate.order(ByteOrder.LITTLE_ENDIAN);
            allocate.putLong((long) length);
            allocate.putLong(zp.c(a10) ^ j10);
            allocate.flip();
            byte[] a11 = a(zp.a(bytes), j10, a10);
            if (z10) {
                byte[] bytes3 = c(allocate.array()).getBytes();
                byte[] bytes4 = c(a11).getBytes();
                byteBuffer = ByteBuffer.allocate(bytes2.length + bytes3.length + bytes4.length);
                byteBuffer.put(bytes2);
                byteBuffer.put(bytes3);
                byteBuffer.put(bytes4);
            } else {
                byteBuffer = ByteBuffer.allocate(bytes2.length + allocate.remaining() + a11.length);
                byteBuffer.put(bytes2);
                byteBuffer.put(allocate);
                byteBuffer.put(a11);
            }
            byteBuffer.flip();
            return byteBuffer.array();
        } catch (UnsupportedEncodingException e10) {
            kVar.B().a("AppLovinSdk", "encode2", (Throwable) e10);
            throw new RuntimeException("UTF-8 encoding not found", e10);
        } catch (IOException e11) {
            kVar.B().a("AppLovinSdk", "encode2", (Throwable) e11);
            return null;
        }
    }

    private static int a(byte[] bArr, byte b10) {
        if (!(bArr == null || bArr.length == 0)) {
            for (int i10 = 0; i10 < bArr.length; i10++) {
                if (bArr[i10] == b10) {
                    return i10;
                }
            }
        }
        return -1;
    }

    private static byte[] a(String str, byte[] bArr, k kVar) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            instance.update(bArr);
            instance.update(str.getBytes("UTF-8"));
            return instance.digest();
        } catch (NoSuchAlgorithmException e10) {
            kVar.B().a("AppLovinSdk", "SHA256", (Throwable) e10);
            throw new RuntimeException("SHA-256 algorithm not found", e10);
        }
    }

    private static String a(byte[] bArr, k kVar) {
        try {
            MessageDigest instance = MessageDigest.getInstance(AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1);
            instance.update(bArr);
            return StringUtils.toHexString(instance.digest());
        } catch (NoSuchAlgorithmException e10) {
            kVar.B().a("AppLovinSdk", "SHA1", (Throwable) e10);
            throw new RuntimeException("SHA-1 algorithm not found", e10);
        }
    }

    private static String a(byte[] bArr) {
        return new String(bArr, "UTF-8").replace('+', '-').replace('/', '_').replace('=', '*');
    }
}
