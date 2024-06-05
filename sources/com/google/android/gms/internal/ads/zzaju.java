package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.security.DigestException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzaju {
    public static X509Certificate[][] zza(String str) throws zzajr, SecurityException, IOException {
        ByteBuffer byteBuffer;
        int limit;
        int position;
        RandomAccessFile randomAccessFile = new RandomAccessFile(str, AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ);
        try {
            Pair zzc = zzajv.zzc(randomAccessFile);
            if (zzc != null) {
                ByteBuffer byteBuffer2 = (ByteBuffer) zzc.first;
                long longValue = ((Long) zzc.second).longValue();
                long j10 = -20 + longValue;
                if (j10 >= 0) {
                    randomAccessFile.seek(j10);
                    if (randomAccessFile.readInt() == 1347094023) {
                        throw new zzajr("ZIP64 APK not supported");
                    }
                }
                long zza = zzajv.zza(byteBuffer2);
                if (zza >= longValue) {
                    throw new zzajr("ZIP Central Directory offset out of range: " + zza + ". ZIP End of Central Directory offset: " + longValue);
                } else if (zzajv.zzb(byteBuffer2) + zza != longValue) {
                    throw new zzajr("ZIP Central Directory is not immediately followed by End of Central Directory");
                } else if (zza >= 32) {
                    ByteBuffer allocate = ByteBuffer.allocate(24);
                    ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                    allocate.order(byteOrder);
                    randomAccessFile.seek(zza - ((long) allocate.capacity()));
                    randomAccessFile.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
                    if (allocate.getLong(8) == 2334950737559900225L && allocate.getLong(16) == 3617552046287187010L) {
                        int i10 = 0;
                        long j11 = allocate.getLong(0);
                        if (j11 < ((long) allocate.capacity()) || j11 > 2147483639) {
                            throw new zzajr("APK Signing Block size out of range: " + j11);
                        }
                        int i11 = (int) (8 + j11);
                        long j12 = zza - ((long) i11);
                        if (j12 >= 0) {
                            ByteBuffer allocate2 = ByteBuffer.allocate(i11);
                            allocate2.order(byteOrder);
                            randomAccessFile.seek(j12);
                            randomAccessFile.readFully(allocate2.array(), allocate2.arrayOffset(), allocate2.capacity());
                            long j13 = allocate2.getLong(0);
                            if (j13 == j11) {
                                Pair create = Pair.create(allocate2, Long.valueOf(j12));
                                byteBuffer = (ByteBuffer) create.first;
                                long longValue2 = ((Long) create.second).longValue();
                                if (byteBuffer.order() == byteOrder) {
                                    int capacity = byteBuffer.capacity() - 24;
                                    if (capacity >= 8) {
                                        int capacity2 = byteBuffer.capacity();
                                        if (capacity <= byteBuffer.capacity()) {
                                            limit = byteBuffer.limit();
                                            position = byteBuffer.position();
                                            byteBuffer.position(0);
                                            byteBuffer.limit(capacity);
                                            byteBuffer.position(8);
                                            ByteBuffer slice = byteBuffer.slice();
                                            slice.order(byteBuffer.order());
                                            byteBuffer.position(0);
                                            byteBuffer.limit(limit);
                                            byteBuffer.position(position);
                                            while (slice.hasRemaining()) {
                                                i10++;
                                                if (slice.remaining() >= 8) {
                                                    long j14 = slice.getLong();
                                                    if (j14 < 4 || j14 > 2147483647L) {
                                                        throw new zzajr("APK Signing Block entry #" + i10 + " size out of range: " + j14);
                                                    }
                                                    int i12 = (int) j14;
                                                    int position2 = slice.position() + i12;
                                                    if (i12 > slice.remaining()) {
                                                        throw new zzajr("APK Signing Block entry #" + i10 + " size out of range: " + i12 + ", available: " + slice.remaining());
                                                    } else if (slice.getInt() == 1896449818) {
                                                        X509Certificate[][] zzl = zzl(randomAccessFile.getChannel(), new zzajq(zze(slice, i12 - 4), longValue2, zza, longValue, byteBuffer2, (zzajp) null));
                                                        randomAccessFile.close();
                                                        try {
                                                            randomAccessFile.close();
                                                        } catch (IOException unused) {
                                                        }
                                                        return zzl;
                                                    } else {
                                                        slice.position(position2);
                                                    }
                                                } else {
                                                    throw new zzajr("Insufficient data to read size of APK Signing Block entry #" + i10);
                                                }
                                            }
                                            throw new zzajr("No APK Signature Scheme v2 block in APK Signing Block");
                                        }
                                        throw new IllegalArgumentException("end > capacity: " + capacity + " > " + capacity2);
                                    }
                                    throw new IllegalArgumentException("end < start: " + capacity + " < " + 8);
                                }
                                throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
                            }
                            throw new zzajr("APK Signing Block sizes in header and footer do not match: " + j13 + " vs " + j11);
                        }
                        throw new zzajr("APK Signing Block offset out of range: " + j12);
                    }
                    throw new zzajr("No APK Signing Block before ZIP Central Directory");
                } else {
                    throw new zzajr("APK too small for APK Signing Block. ZIP Central Directory offset: " + zza);
                }
            } else {
                throw new zzajr("Not an APK file: ZIP End of Central Directory record not found in file with " + randomAccessFile.length() + " bytes");
            }
        } catch (Throwable th) {
            try {
                randomAccessFile.close();
            } catch (IOException unused2) {
            }
            throw th;
        }
    }

    private static int zzb(int i10) {
        if (i10 == 1) {
            return 32;
        }
        if (i10 == 2) {
            return 64;
        }
        throw new IllegalArgumentException("Unknown content digest algorthm: " + i10);
    }

    private static int zzc(int i10) {
        if (i10 == 513) {
            return 1;
        }
        if (i10 == 514) {
            return 2;
        }
        if (i10 == 769) {
            return 1;
        }
        switch (i10) {
            case 257:
            case 259:
                return 1;
            case 258:
            case 260:
                return 2;
            default:
                throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString((long) i10))));
        }
    }

    private static String zzd(int i10) {
        if (i10 == 1) {
            return "SHA-256";
        }
        if (i10 == 2) {
            return "SHA-512";
        }
        throw new IllegalArgumentException("Unknown content digest algorthm: " + i10);
    }

    private static ByteBuffer zze(ByteBuffer byteBuffer, int i10) throws BufferUnderflowException {
        int limit = byteBuffer.limit();
        int position = byteBuffer.position();
        int i11 = i10 + position;
        if (i11 < position || i11 > limit) {
            throw new BufferUnderflowException();
        }
        byteBuffer.limit(i11);
        try {
            ByteBuffer slice = byteBuffer.slice();
            slice.order(byteBuffer.order());
            byteBuffer.position(i11);
            return slice;
        } finally {
            byteBuffer.limit(limit);
        }
    }

    private static ByteBuffer zzf(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.remaining() >= 4) {
            int i10 = byteBuffer.getInt();
            if (i10 < 0) {
                throw new IllegalArgumentException("Negative length");
            } else if (i10 <= byteBuffer.remaining()) {
                return zze(byteBuffer, i10);
            } else {
                int remaining = byteBuffer.remaining();
                throw new IOException("Length-prefixed field longer than remaining buffer. Field length: " + i10 + ", remaining: " + remaining);
            }
        } else {
            int remaining2 = byteBuffer.remaining();
            throw new IOException("Remaining buffer too short to contain length of length-prefixed field. Remaining: " + remaining2);
        }
    }

    private static void zzg(int i10, byte[] bArr, int i11) {
        bArr[1] = (byte) (i10 & 255);
        bArr[2] = (byte) ((i10 >>> 8) & 255);
        bArr[3] = (byte) ((i10 >>> 16) & 255);
        bArr[4] = (byte) (i10 >> 24);
    }

    private static void zzh(Map map, FileChannel fileChannel, long j10, long j11, long j12, ByteBuffer byteBuffer) throws SecurityException {
        if (!map.isEmpty()) {
            zzajo zzajo = new zzajo(fileChannel, 0, j10);
            zzajo zzajo2 = new zzajo(fileChannel, j11, j12 - j11);
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.order(ByteOrder.LITTLE_ENDIAN);
            long j13 = j10;
            zzajv.zzd(duplicate, j10);
            zzajm zzajm = new zzajm(duplicate);
            int size = map.size();
            int[] iArr = new int[size];
            int i10 = 0;
            int i11 = 0;
            for (Integer intValue : map.keySet()) {
                iArr[i11] = intValue.intValue();
                i11++;
            }
            try {
                byte[][] zzk = zzk(iArr, new zzajn[]{zzajo, zzajo2, zzajm});
                while (i10 < size) {
                    int i12 = iArr[i10];
                    Map map2 = map;
                    if (MessageDigest.isEqual((byte[]) map.get(Integer.valueOf(i12)), zzk[i10])) {
                        i10++;
                    } else {
                        throw new SecurityException(zzd(i12).concat(" digest of contents did not verify"));
                    }
                }
            } catch (DigestException e10) {
                throw new SecurityException("Failed to compute digest(s) of contents", e10);
            }
        } else {
            throw new SecurityException("No digests provided");
        }
    }

    private static byte[] zzi(ByteBuffer byteBuffer) throws IOException {
        int i10 = byteBuffer.getInt();
        if (i10 < 0) {
            throw new IOException("Negative length");
        } else if (i10 <= byteBuffer.remaining()) {
            byte[] bArr = new byte[i10];
            byteBuffer.get(bArr);
            return bArr;
        } else {
            int remaining = byteBuffer.remaining();
            throw new IOException("Underflow while reading length-prefixed value. Length: " + i10 + ", available: " + remaining);
        }
    }

    private static X509Certificate[] zzj(ByteBuffer byteBuffer, Map map, CertificateFactory certificateFactory) throws SecurityException, IOException {
        String str;
        Pair pair;
        ByteBuffer zzf = zzf(byteBuffer);
        ByteBuffer zzf2 = zzf(byteBuffer);
        byte[] zzi = zzi(byteBuffer);
        ArrayList arrayList = new ArrayList();
        byte[] bArr = null;
        byte[] bArr2 = null;
        int i10 = -1;
        int i11 = 0;
        while (zzf2.hasRemaining()) {
            i11++;
            try {
                ByteBuffer zzf3 = zzf(zzf2);
                if (zzf3.remaining() >= 8) {
                    int i12 = zzf3.getInt();
                    arrayList.add(Integer.valueOf(i12));
                    if (!(i12 == 513 || i12 == 514 || i12 == 769)) {
                        switch (i12) {
                            case 257:
                            case 258:
                            case 259:
                            case 260:
                                break;
                            default:
                                continue;
                        }
                    }
                    if (i10 != -1) {
                        int zzc = zzc(i12);
                        int zzc2 = zzc(i10);
                        if (zzc != 1) {
                            if (zzc2 != 1) {
                            }
                        }
                    }
                    bArr2 = zzi(zzf3);
                    i10 = i12;
                } else {
                    throw new SecurityException("Signature record too short");
                }
            } catch (IOException | BufferUnderflowException e10) {
                throw new SecurityException("Failed to parse signature record #" + i11, e10);
            }
        }
        if (i10 != -1) {
            if (i10 == 513 || i10 == 514) {
                str = "EC";
            } else if (i10 != 769) {
                switch (i10) {
                    case 257:
                    case 258:
                    case 259:
                    case 260:
                        str = "RSA";
                        break;
                    default:
                        throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString((long) i10))));
                }
            } else {
                str = "DSA";
            }
            if (i10 == 513) {
                pair = Pair.create("SHA256withECDSA", (Object) null);
            } else if (i10 == 514) {
                pair = Pair.create("SHA512withECDSA", (Object) null);
            } else if (i10 != 769) {
                switch (i10) {
                    case 257:
                        pair = Pair.create("SHA256withRSA/PSS", new PSSParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, 32, 1));
                        break;
                    case 258:
                        pair = Pair.create("SHA512withRSA/PSS", new PSSParameterSpec("SHA-512", "MGF1", MGF1ParameterSpec.SHA512, 64, 1));
                        break;
                    case 259:
                        pair = Pair.create("SHA256withRSA", (Object) null);
                        break;
                    case 260:
                        pair = Pair.create("SHA512withRSA", (Object) null);
                        break;
                    default:
                        throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString((long) i10))));
                }
            } else {
                pair = Pair.create("SHA256withDSA", (Object) null);
            }
            String str2 = (String) pair.first;
            AlgorithmParameterSpec algorithmParameterSpec = (AlgorithmParameterSpec) pair.second;
            try {
                PublicKey generatePublic = KeyFactory.getInstance(str).generatePublic(new X509EncodedKeySpec(zzi));
                Signature instance = Signature.getInstance(str2);
                instance.initVerify(generatePublic);
                if (algorithmParameterSpec != null) {
                    instance.setParameter(algorithmParameterSpec);
                }
                instance.update(zzf);
                if (instance.verify(bArr2)) {
                    zzf.clear();
                    ByteBuffer zzf4 = zzf(zzf);
                    ArrayList arrayList2 = new ArrayList();
                    int i13 = 0;
                    while (zzf4.hasRemaining()) {
                        i13++;
                        try {
                            ByteBuffer zzf5 = zzf(zzf4);
                            if (zzf5.remaining() >= 8) {
                                int i14 = zzf5.getInt();
                                arrayList2.add(Integer.valueOf(i14));
                                if (i14 == i10) {
                                    bArr = zzi(zzf5);
                                }
                            } else {
                                throw new IOException("Record too short");
                            }
                        } catch (IOException | BufferUnderflowException e11) {
                            throw new IOException("Failed to parse digest record #" + i13, e11);
                        }
                    }
                    if (arrayList.equals(arrayList2)) {
                        int zzc3 = zzc(i10);
                        byte[] bArr3 = (byte[]) map.put(Integer.valueOf(zzc3), bArr);
                        if (bArr3 == null || MessageDigest.isEqual(bArr3, bArr)) {
                            ByteBuffer zzf6 = zzf(zzf);
                            ArrayList arrayList3 = new ArrayList();
                            int i15 = 0;
                            while (zzf6.hasRemaining()) {
                                i15++;
                                byte[] zzi2 = zzi(zzf6);
                                try {
                                    arrayList3.add(new zzajs((X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(zzi2)), zzi2));
                                } catch (CertificateException e12) {
                                    throw new SecurityException("Failed to decode certificate #" + i15, e12);
                                }
                            }
                            if (arrayList3.isEmpty()) {
                                throw new SecurityException("No certificates listed");
                            } else if (Arrays.equals(zzi, ((X509Certificate) arrayList3.get(0)).getPublicKey().getEncoded())) {
                                return (X509Certificate[]) arrayList3.toArray(new X509Certificate[arrayList3.size()]);
                            } else {
                                throw new SecurityException("Public key mismatch between certificate and signature record");
                            }
                        } else {
                            throw new SecurityException(zzd(zzc3).concat(" contents digest does not match the digest specified by a preceding signer"));
                        }
                    } else {
                        throw new SecurityException("Signature algorithms don't match between digests and signatures records");
                    }
                } else {
                    throw new SecurityException(String.valueOf(str2).concat(" signature did not verify"));
                }
            } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | SignatureException | InvalidKeySpecException e13) {
                throw new SecurityException("Failed to verify " + str2 + " signature", e13);
            }
        } else if (i11 == 0) {
            throw new SecurityException("No signatures found");
        } else {
            throw new SecurityException("No supported signatures found");
        }
    }

    private static byte[][] zzk(int[] iArr, zzajn[] zzajnArr) throws DigestException {
        long j10;
        int i10;
        int length;
        int[] iArr2 = iArr;
        long j11 = 0;
        int i11 = 0;
        long j12 = 0;
        int i12 = 0;
        while (true) {
            j10 = 1048576;
            if (i12 >= 3) {
                break;
            }
            j12 += (zzajnArr[i12].zza() + 1048575) / 1048576;
            i12++;
        }
        if (j12 < 2097151) {
            byte[][] bArr = new byte[iArr2.length][];
            int i13 = 0;
            while (true) {
                length = iArr2.length;
                if (i13 >= length) {
                    break;
                }
                int i14 = (int) j12;
                byte[] bArr2 = new byte[((zzb(iArr2[i13]) * i14) + 5)];
                bArr2[0] = 90;
                zzg(i14, bArr2, 1);
                bArr[i13] = bArr2;
                i13++;
            }
            byte[] bArr3 = new byte[5];
            bArr3[0] = -91;
            MessageDigest[] messageDigestArr = new MessageDigest[length];
            int i15 = 0;
            while (i15 < iArr2.length) {
                String zzd = zzd(iArr2[i15]);
                try {
                    messageDigestArr[i15] = MessageDigest.getInstance(zzd);
                    i15++;
                } catch (NoSuchAlgorithmException e10) {
                    throw new RuntimeException(zzd.concat(" digest not supported"), e10);
                }
            }
            int i16 = 0;
            int i17 = 0;
            for (i10 = 3; i16 < i10; i10 = 3) {
                zzajn zzajn = zzajnArr[i16];
                long j13 = j11;
                long zza = zzajn.zza();
                while (zza > j11) {
                    int min = (int) Math.min(zza, j10);
                    zzg(min, bArr3, 1);
                    for (int i18 = 0; i18 < length; i18++) {
                        messageDigestArr[i18].update(bArr3);
                    }
                    long j14 = j13;
                    try {
                        zzajn.zzb(messageDigestArr, j14, min);
                        byte[] bArr4 = bArr3;
                        int i19 = 0;
                        while (i19 < iArr2.length) {
                            int i20 = iArr2[i19];
                            zzajn zzajn2 = zzajn;
                            byte[] bArr5 = bArr[i19];
                            int zzb = zzb(i20);
                            int i21 = length;
                            MessageDigest messageDigest = messageDigestArr[i19];
                            MessageDigest[] messageDigestArr2 = messageDigestArr;
                            int digest = messageDigest.digest(bArr5, (i17 * zzb) + 5, zzb);
                            if (digest == zzb) {
                                i19++;
                                zzajn = zzajn2;
                                length = i21;
                                messageDigestArr = messageDigestArr2;
                            } else {
                                throw new RuntimeException("Unexpected output size of " + messageDigest.getAlgorithm() + " digest: " + digest);
                            }
                        }
                        zzajn zzajn3 = zzajn;
                        int i22 = length;
                        long j15 = (long) min;
                        long j16 = j14 + j15;
                        zza -= j15;
                        i17++;
                        j11 = 0;
                        j10 = 1048576;
                        long j17 = j16;
                        bArr3 = bArr4;
                        j13 = j17;
                        messageDigestArr = messageDigestArr;
                    } catch (IOException e11) {
                        throw new DigestException("Failed to digest chunk #" + i17 + " of section #" + i11, e11);
                    }
                }
                byte[] bArr6 = bArr3;
                MessageDigest[] messageDigestArr3 = messageDigestArr;
                int i23 = length;
                i11++;
                i16++;
                j11 = 0;
                j10 = 1048576;
            }
            byte[][] bArr7 = new byte[iArr2.length][];
            int i24 = 0;
            while (i24 < iArr2.length) {
                int i25 = iArr2[i24];
                byte[] bArr8 = bArr[i24];
                String zzd2 = zzd(i25);
                try {
                    bArr7[i24] = MessageDigest.getInstance(zzd2).digest(bArr8);
                    i24++;
                } catch (NoSuchAlgorithmException e12) {
                    throw new RuntimeException(zzd2.concat(" digest not supported"), e12);
                }
            }
            return bArr7;
        }
        throw new DigestException("Too many chunks: " + j12);
    }

    private static X509Certificate[][] zzl(FileChannel fileChannel, zzajq zzajq) throws SecurityException {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory instance = CertificateFactory.getInstance(AndroidStaticDeviceInfoDataSource.CERTIFICATE_TYPE_X509);
            try {
                ByteBuffer zzf = zzf(zzajq.zza);
                int i10 = 0;
                while (zzf.hasRemaining()) {
                    i10++;
                    try {
                        arrayList.add(zzj(zzf(zzf), hashMap, instance));
                    } catch (IOException | SecurityException | BufferUnderflowException e10) {
                        throw new SecurityException("Failed to parse/verify signer #" + i10 + " block", e10);
                    }
                }
                if (i10 <= 0) {
                    throw new SecurityException("No signers found");
                } else if (!hashMap.isEmpty()) {
                    zzh(hashMap, fileChannel, zzajq.zzb, zzajq.zzc, zzajq.zzd, zzajq.zze);
                    return (X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()][]);
                } else {
                    throw new SecurityException("No content digests found");
                }
            } catch (IOException e11) {
                throw new SecurityException("Failed to read list of signers", e11);
            }
        } catch (CertificateException e12) {
            throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e12);
        }
    }
}
