package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import com.facebook.ads.AdError;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzgg extends zzfa {
    private final Resources zza;
    private final String zzb;
    private Uri zzc;
    private AssetFileDescriptor zzd;
    private InputStream zze;
    private long zzf;
    private boolean zzg;

    public zzgg(Context context) {
        super(false);
        this.zza = context.getResources();
        this.zzb = context.getPackageName();
    }

    public static Uri buildRawResourceUri(int i10) {
        return Uri.parse("rawresource:///" + i10);
    }

    public final int zza(byte[] bArr, int i10, int i11) throws zzgf {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.zzf;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, (long) i11);
            } catch (IOException e10) {
                throw new zzgf((String) null, e10, AdError.SERVER_ERROR_CODE);
            }
        }
        InputStream inputStream = this.zze;
        int i12 = zzew.zza;
        int read = inputStream.read(bArr, i10, i11);
        if (read != -1) {
            long j11 = this.zzf;
            if (j11 != -1) {
                this.zzf = j11 - ((long) read);
            }
            zzg(read);
            return read;
        } else if (this.zzf == -1) {
            return -1;
        } else {
            throw new zzgf("End of stream reached having not read sufficient data.", new EOFException(), AdError.SERVER_ERROR_CODE);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x003d, code lost:
        if (r3.matches("\\d+") != false) goto L_0x0099;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0156  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long zzb(com.google.android.gms.internal.ads.zzfl r18) throws com.google.android.gms.internal.ads.zzgf {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            android.net.Uri r2 = r0.zza
            r1.zzc = r2
            java.lang.String r3 = r2.getScheme()
            java.lang.String r4 = "rawresource"
            boolean r3 = android.text.TextUtils.equals(r4, r3)
            r4 = 2005(0x7d5, float:2.81E-42)
            r5 = 1004(0x3ec, float:1.407E-42)
            r6 = 1
            r7 = 0
            if (r3 != 0) goto L_0x0099
            java.lang.String r3 = r2.getScheme()
            java.lang.String r8 = "android.resource"
            boolean r3 = android.text.TextUtils.equals(r8, r3)
            if (r3 == 0) goto L_0x0040
            java.util.List r3 = r2.getPathSegments()
            int r3 = r3.size()
            if (r3 != r6) goto L_0x0040
            java.lang.String r3 = r2.getLastPathSegment()
            java.util.Objects.requireNonNull(r3)
            java.lang.String r9 = "\\d+"
            boolean r3 = r3.matches(r9)
            if (r3 == 0) goto L_0x0040
            goto L_0x0099
        L_0x0040:
            java.lang.String r3 = r2.getScheme()
            boolean r3 = android.text.TextUtils.equals(r8, r3)
            if (r3 == 0) goto L_0x0091
            java.lang.String r3 = r2.getPath()
            java.util.Objects.requireNonNull(r3)
            java.lang.String r5 = "/"
            boolean r5 = r3.startsWith(r5)
            if (r5 == 0) goto L_0x005d
            java.lang.String r3 = r3.substring(r6)
        L_0x005d:
            java.lang.String r5 = r2.getHost()
            boolean r8 = android.text.TextUtils.isEmpty(r5)
            if (r8 == 0) goto L_0x006a
            java.lang.String r5 = ""
            goto L_0x0074
        L_0x006a:
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r8 = ":"
            java.lang.String r5 = r5.concat(r8)
        L_0x0074:
            java.lang.String r3 = java.lang.String.valueOf(r3)
            android.content.res.Resources r8 = r1.zza
            java.lang.String r9 = r1.zzb
            java.lang.String r3 = r5.concat(r3)
            java.lang.String r5 = "raw"
            int r3 = r8.getIdentifier(r3, r5, r9)
            if (r3 == 0) goto L_0x0089
            goto L_0x00a4
        L_0x0089:
            com.google.android.gms.internal.ads.zzgf r0 = new com.google.android.gms.internal.ads.zzgf
            java.lang.String r2 = "Resource not found."
            r0.<init>(r2, r7, r4)
            throw r0
        L_0x0091:
            com.google.android.gms.internal.ads.zzgf r0 = new com.google.android.gms.internal.ads.zzgf
            java.lang.String r2 = "URI must either use scheme rawresource or android.resource"
            r0.<init>(r2, r7, r5)
            throw r0
        L_0x0099:
            java.lang.String r3 = r2.getLastPathSegment()     // Catch:{ NumberFormatException -> 0x016f }
            java.util.Objects.requireNonNull(r3)
            int r3 = java.lang.Integer.parseInt(r3)     // Catch:{ NumberFormatException -> 0x016f }
        L_0x00a4:
            r17.zzi(r18)
            android.content.res.Resources r5 = r1.zza     // Catch:{ NotFoundException -> 0x0168 }
            android.content.res.AssetFileDescriptor r3 = r5.openRawResourceFd(r3)     // Catch:{ NotFoundException -> 0x0168 }
            r1.zzd = r3
            if (r3 == 0) goto L_0x0156
            long r8 = r3.getLength()
            java.io.FileInputStream r2 = new java.io.FileInputStream
            java.io.FileDescriptor r5 = r3.getFileDescriptor()
            r2.<init>(r5)
            r1.zze = r2
            r5 = 2008(0x7d8, float:2.814E-42)
            r10 = -1
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 == 0) goto L_0x00d5
            long r13 = r0.zzf     // Catch:{ zzgf -> 0x0154, IOException -> 0x014b }
            int r15 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r15 > 0) goto L_0x00cf
            goto L_0x00d5
        L_0x00cf:
            com.google.android.gms.internal.ads.zzgf r0 = new com.google.android.gms.internal.ads.zzgf     // Catch:{ zzgf -> 0x0154, IOException -> 0x014b }
            r0.<init>(r7, r7, r5)     // Catch:{ zzgf -> 0x0154, IOException -> 0x014b }
            throw r0     // Catch:{ zzgf -> 0x0154, IOException -> 0x014b }
        L_0x00d5:
            long r13 = r3.getStartOffset()     // Catch:{ zzgf -> 0x0154, IOException -> 0x014b }
            long r4 = r0.zzf     // Catch:{ zzgf -> 0x0154, IOException -> 0x014b }
            long r4 = r4 + r13
            long r4 = r2.skip(r4)     // Catch:{ zzgf -> 0x0154, IOException -> 0x014b }
            long r4 = r4 - r13
            long r13 = r0.zzf     // Catch:{ zzgf -> 0x0154, IOException -> 0x014b }
            int r16 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r16 != 0) goto L_0x0143
            r13 = 0
            if (r12 != 0) goto L_0x0113
            java.nio.channels.FileChannel r2 = r2.getChannel()     // Catch:{ zzgf -> 0x0154, IOException -> 0x014b }
            long r4 = r2.size()     // Catch:{ zzgf -> 0x0154, IOException -> 0x014b }
            int r8 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r8 != 0) goto L_0x00fb
            r1.zzf = r10     // Catch:{ zzgf -> 0x0154, IOException -> 0x014b }
            r4 = r10
            goto L_0x011b
        L_0x00fb:
            long r4 = r2.size()     // Catch:{ zzgf -> 0x0154, IOException -> 0x014b }
            long r8 = r2.position()     // Catch:{ zzgf -> 0x0154, IOException -> 0x014b }
            long r4 = r4 - r8
            r1.zzf = r4     // Catch:{ zzgf -> 0x0154, IOException -> 0x014b }
            int r2 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r2 < 0) goto L_0x010b
            goto L_0x011b
        L_0x010b:
            com.google.android.gms.internal.ads.zzgf r0 = new com.google.android.gms.internal.ads.zzgf     // Catch:{ zzgf -> 0x0154, IOException -> 0x014b }
            r2 = 2008(0x7d8, float:2.814E-42)
            r0.<init>(r7, r7, r2)     // Catch:{ zzgf -> 0x0154, IOException -> 0x014b }
            throw r0     // Catch:{ zzgf -> 0x0154, IOException -> 0x014b }
        L_0x0113:
            long r4 = r8 - r4
            r1.zzf = r4     // Catch:{ zzgf -> 0x0154, IOException -> 0x014b }
            int r2 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r2 < 0) goto L_0x013b
        L_0x011b:
            long r2 = r0.zzg
            int r7 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r7 == 0) goto L_0x012c
            int r7 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r7 != 0) goto L_0x0126
            goto L_0x012a
        L_0x0126:
            long r2 = java.lang.Math.min(r4, r2)
        L_0x012a:
            r1.zzf = r2
        L_0x012c:
            r1.zzg = r6
            r17.zzj(r18)
            long r2 = r0.zzg
            int r0 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x0138
            return r2
        L_0x0138:
            long r2 = r1.zzf
            return r2
        L_0x013b:
            com.google.android.gms.internal.ads.zzfh r0 = new com.google.android.gms.internal.ads.zzfh     // Catch:{ zzgf -> 0x0154, IOException -> 0x014b }
            r2 = 2008(0x7d8, float:2.814E-42)
            r0.<init>(r2)     // Catch:{ zzgf -> 0x0154, IOException -> 0x014b }
            throw r0     // Catch:{ zzgf -> 0x0154, IOException -> 0x014b }
        L_0x0143:
            com.google.android.gms.internal.ads.zzgf r0 = new com.google.android.gms.internal.ads.zzgf     // Catch:{ zzgf -> 0x0154, IOException -> 0x014b }
            r2 = 2008(0x7d8, float:2.814E-42)
            r0.<init>(r7, r7, r2)     // Catch:{ zzgf -> 0x0154, IOException -> 0x014b }
            throw r0     // Catch:{ zzgf -> 0x0154, IOException -> 0x014b }
        L_0x014b:
            r0 = move-exception
            com.google.android.gms.internal.ads.zzgf r2 = new com.google.android.gms.internal.ads.zzgf
            r3 = 2000(0x7d0, float:2.803E-42)
            r2.<init>(r7, r0, r3)
            throw r2
        L_0x0154:
            r0 = move-exception
            throw r0
        L_0x0156:
            r3 = 2000(0x7d0, float:2.803E-42)
            com.google.android.gms.internal.ads.zzgf r0 = new com.google.android.gms.internal.ads.zzgf
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r4 = "Resource is compressed: "
            java.lang.String r2 = r4.concat(r2)
            r0.<init>(r2, r7, r3)
            throw r0
        L_0x0168:
            r0 = move-exception
            com.google.android.gms.internal.ads.zzgf r2 = new com.google.android.gms.internal.ads.zzgf
            r2.<init>(r7, r0, r4)
            throw r2
        L_0x016f:
            com.google.android.gms.internal.ads.zzgf r0 = new com.google.android.gms.internal.ads.zzgf
            java.lang.String r2 = "Resource identifier must be an integer."
            r0.<init>(r2, r7, r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgg.zzb(com.google.android.gms.internal.ads.zzfl):long");
    }

    public final Uri zzc() {
        return this.zzc;
    }

    public final void zzd() throws zzgf {
        this.zzc = null;
        try {
            InputStream inputStream = this.zze;
            if (inputStream != null) {
                inputStream.close();
            }
            this.zze = null;
            try {
                AssetFileDescriptor assetFileDescriptor = this.zzd;
                if (assetFileDescriptor != null) {
                    assetFileDescriptor.close();
                }
                this.zzd = null;
                if (this.zzg) {
                    this.zzg = false;
                    zzh();
                }
            } catch (IOException e10) {
                throw new zzgf((String) null, e10, AdError.SERVER_ERROR_CODE);
            } catch (Throwable th) {
                this.zzd = null;
                if (this.zzg) {
                    this.zzg = false;
                    zzh();
                }
                throw th;
            }
        } catch (IOException e11) {
            throw new zzgf((String) null, e11, AdError.SERVER_ERROR_CODE);
        } catch (Throwable th2) {
            this.zze = null;
            try {
                AssetFileDescriptor assetFileDescriptor2 = this.zzd;
                if (assetFileDescriptor2 != null) {
                    assetFileDescriptor2.close();
                }
                this.zzd = null;
                if (this.zzg) {
                    this.zzg = false;
                    zzh();
                }
                throw th2;
            } catch (IOException e12) {
                throw new zzgf((String) null, e12, AdError.SERVER_ERROR_CODE);
            } catch (Throwable th3) {
                this.zzd = null;
                if (this.zzg) {
                    this.zzg = false;
                    zzh();
                }
                throw th3;
            }
        }
    }
}
