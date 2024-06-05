package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import com.facebook.ads.AdError;
import java.io.FileInputStream;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzfd extends zzfa {
    private final ContentResolver zza;
    private Uri zzb;
    private AssetFileDescriptor zzc;
    private FileInputStream zzd;
    private long zze;
    private boolean zzf;

    public zzfd(Context context) {
        super(false);
        this.zza = context.getContentResolver();
    }

    public final int zza(byte[] bArr, int i10, int i11) throws zzfc {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.zze;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, (long) i11);
            } catch (IOException e10) {
                throw new zzfc(e10, AdError.SERVER_ERROR_CODE);
            }
        }
        FileInputStream fileInputStream = this.zzd;
        int i12 = zzew.zza;
        int read = fileInputStream.read(bArr, i10, i11);
        if (read == -1) {
            return -1;
        }
        long j11 = this.zze;
        if (j11 != -1) {
            this.zze = j11 - ((long) read);
        }
        zzg(read);
        return read;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00ef, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00f0, code lost:
        r3 = com.facebook.ads.AdError.SERVER_ERROR_CODE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00fa, code lost:
        r3 = 2005;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0100, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0101, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0100 A[ExcHandler: zzfc (r0v1 'e' com.google.android.gms.internal.ads.zzfc A[CUSTOM_DECLARE]), Splitter:B:1:0x0005] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long zzb(com.google.android.gms.internal.ads.zzfl r18) throws com.google.android.gms.internal.ads.zzfc {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            r3 = 1
            android.net.Uri r4 = r0.zza     // Catch:{ zzfc -> 0x0100, IOException -> 0x00ef }
            r1.zzb = r4     // Catch:{ zzfc -> 0x0100, IOException -> 0x00ef }
            r17.zzi(r18)     // Catch:{ zzfc -> 0x0100, IOException -> 0x00ef }
            java.lang.String r5 = "content"
            android.net.Uri r6 = r0.zza     // Catch:{ zzfc -> 0x0100, IOException -> 0x00ef }
            java.lang.String r6 = r6.getScheme()     // Catch:{ zzfc -> 0x0100, IOException -> 0x00ef }
            boolean r5 = r5.equals(r6)     // Catch:{ zzfc -> 0x0100, IOException -> 0x00ef }
            if (r5 == 0) goto L_0x002d
            android.os.Bundle r5 = new android.os.Bundle     // Catch:{ zzfc -> 0x0100, IOException -> 0x00ef }
            r5.<init>()     // Catch:{ zzfc -> 0x0100, IOException -> 0x00ef }
            java.lang.String r6 = "android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT"
            r5.putBoolean(r6, r3)     // Catch:{ zzfc -> 0x0100, IOException -> 0x00ef }
            android.content.ContentResolver r6 = r1.zza     // Catch:{ zzfc -> 0x0100, IOException -> 0x00ef }
            java.lang.String r7 = "*/*"
            android.content.res.AssetFileDescriptor r5 = r6.openTypedAssetFileDescriptor(r4, r7, r5)     // Catch:{ zzfc -> 0x0100, IOException -> 0x00ef }
            goto L_0x0035
        L_0x002d:
            android.content.ContentResolver r5 = r1.zza     // Catch:{ zzfc -> 0x0100, IOException -> 0x00ef }
            java.lang.String r6 = "r"
            android.content.res.AssetFileDescriptor r5 = r5.openAssetFileDescriptor(r4, r6)     // Catch:{ zzfc -> 0x0100, IOException -> 0x00ef }
        L_0x0035:
            r1.zzc = r5     // Catch:{ zzfc -> 0x0100, IOException -> 0x00ef }
            if (r5 == 0) goto L_0x00cb
            long r6 = r5.getLength()     // Catch:{ zzfc -> 0x0100, IOException -> 0x00ef }
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ zzfc -> 0x0100, IOException -> 0x00ef }
            java.io.FileDescriptor r8 = r5.getFileDescriptor()     // Catch:{ zzfc -> 0x0100, IOException -> 0x00ef }
            r4.<init>(r8)     // Catch:{ zzfc -> 0x0100, IOException -> 0x00ef }
            r1.zzd = r4     // Catch:{ zzfc -> 0x0100, IOException -> 0x00ef }
            r8 = 2008(0x7d8, float:2.814E-42)
            r9 = 0
            r10 = -1
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L_0x005e
            long r13 = r0.zzf     // Catch:{ zzfc -> 0x0100, IOException -> 0x00ef }
            int r15 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r15 > 0) goto L_0x0058
            goto L_0x005e
        L_0x0058:
            com.google.android.gms.internal.ads.zzfc r0 = new com.google.android.gms.internal.ads.zzfc     // Catch:{ zzfc -> 0x0100, IOException -> 0x00ef }
            r0.<init>(r9, r8)     // Catch:{ zzfc -> 0x0100, IOException -> 0x00ef }
            throw r0     // Catch:{ zzfc -> 0x0100, IOException -> 0x00ef }
        L_0x005e:
            long r13 = r5.getStartOffset()     // Catch:{ zzfc -> 0x0100, IOException -> 0x00ef }
            long r2 = r0.zzf     // Catch:{ zzfc -> 0x0100, IOException -> 0x00ef }
            long r2 = r2 + r13
            long r2 = r4.skip(r2)     // Catch:{ zzfc -> 0x0100, IOException -> 0x00ef }
            long r2 = r2 - r13
            long r13 = r0.zzf     // Catch:{ zzfc -> 0x0100, IOException -> 0x00ef }
            int r16 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r16 != 0) goto L_0x00c5
            r13 = 0
            if (r12 != 0) goto L_0x0096
            java.nio.channels.FileChannel r2 = r4.getChannel()     // Catch:{ zzfc -> 0x0100, IOException -> 0x00ef }
            long r3 = r2.size()     // Catch:{ zzfc -> 0x0100, IOException -> 0x00ef }
            int r6 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r6 != 0) goto L_0x0084
            r1.zze = r10     // Catch:{ zzfc -> 0x0100, IOException -> 0x00ef }
            r3 = r10
            goto L_0x009e
        L_0x0084:
            long r6 = r2.position()     // Catch:{ zzfc -> 0x0100, IOException -> 0x00ef }
            long r3 = r3 - r6
            r1.zze = r3     // Catch:{ zzfc -> 0x0100, IOException -> 0x00ef }
            int r2 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r2 < 0) goto L_0x0090
            goto L_0x009e
        L_0x0090:
            com.google.android.gms.internal.ads.zzfc r0 = new com.google.android.gms.internal.ads.zzfc     // Catch:{ zzfc -> 0x0100, IOException -> 0x00ef }
            r0.<init>(r9, r8)     // Catch:{ zzfc -> 0x0100, IOException -> 0x00ef }
            throw r0     // Catch:{ zzfc -> 0x0100, IOException -> 0x00ef }
        L_0x0096:
            long r3 = r6 - r2
            r1.zze = r3     // Catch:{ zzfc -> 0x0100, IOException -> 0x00ef }
            int r2 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r2 < 0) goto L_0x00bf
        L_0x009e:
            long r5 = r0.zzg
            int r2 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r2 == 0) goto L_0x00af
            int r2 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r2 != 0) goto L_0x00a9
            goto L_0x00ad
        L_0x00a9:
            long r5 = java.lang.Math.min(r3, r5)
        L_0x00ad:
            r1.zze = r5
        L_0x00af:
            r2 = 1
            r1.zzf = r2
            r17.zzj(r18)
            long r2 = r0.zzg
            int r0 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x00bc
            return r2
        L_0x00bc:
            long r2 = r1.zze
            return r2
        L_0x00bf:
            com.google.android.gms.internal.ads.zzfc r0 = new com.google.android.gms.internal.ads.zzfc     // Catch:{ zzfc -> 0x0100, IOException -> 0x00ef }
            r0.<init>(r9, r8)     // Catch:{ zzfc -> 0x0100, IOException -> 0x00ef }
            throw r0     // Catch:{ zzfc -> 0x0100, IOException -> 0x00ef }
        L_0x00c5:
            com.google.android.gms.internal.ads.zzfc r0 = new com.google.android.gms.internal.ads.zzfc     // Catch:{ zzfc -> 0x0100, IOException -> 0x00ef }
            r0.<init>(r9, r8)     // Catch:{ zzfc -> 0x0100, IOException -> 0x00ef }
            throw r0     // Catch:{ zzfc -> 0x0100, IOException -> 0x00ef }
        L_0x00cb:
            com.google.android.gms.internal.ads.zzfc r0 = new com.google.android.gms.internal.ads.zzfc     // Catch:{ zzfc -> 0x0100, IOException -> 0x00ef }
            java.io.IOException r2 = new java.io.IOException     // Catch:{ zzfc -> 0x0100, IOException -> 0x00ef }
            java.lang.String r3 = java.lang.String.valueOf(r4)     // Catch:{ zzfc -> 0x0100, IOException -> 0x00ef }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ zzfc -> 0x0100, IOException -> 0x00ef }
            r4.<init>()     // Catch:{ zzfc -> 0x0100, IOException -> 0x00ef }
            java.lang.String r6 = "Could not open file descriptor for: "
            r4.append(r6)     // Catch:{ zzfc -> 0x0100, IOException -> 0x00ef }
            r4.append(r3)     // Catch:{ zzfc -> 0x0100, IOException -> 0x00ef }
            java.lang.String r3 = r4.toString()     // Catch:{ zzfc -> 0x0100, IOException -> 0x00ef }
            r2.<init>(r3)     // Catch:{ zzfc -> 0x0100, IOException -> 0x00ef }
            r3 = 2000(0x7d0, float:2.803E-42)
            r0.<init>(r2, r3)     // Catch:{ zzfc -> 0x0100, IOException -> 0x00ed }
            throw r0     // Catch:{ zzfc -> 0x0100, IOException -> 0x00ed }
        L_0x00ed:
            r0 = move-exception
            goto L_0x00f2
        L_0x00ef:
            r0 = move-exception
            r3 = 2000(0x7d0, float:2.803E-42)
        L_0x00f2:
            com.google.android.gms.internal.ads.zzfc r2 = new com.google.android.gms.internal.ads.zzfc
            boolean r4 = r0 instanceof java.io.FileNotFoundException
            r5 = 1
            if (r5 == r4) goto L_0x00fa
            goto L_0x00fc
        L_0x00fa:
            r3 = 2005(0x7d5, float:2.81E-42)
        L_0x00fc:
            r2.<init>(r0, r3)
            throw r2
        L_0x0100:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfd.zzb(com.google.android.gms.internal.ads.zzfl):long");
    }

    public final Uri zzc() {
        return this.zzb;
    }

    public final void zzd() throws zzfc {
        this.zzb = null;
        try {
            FileInputStream fileInputStream = this.zzd;
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            this.zzd = null;
            try {
                AssetFileDescriptor assetFileDescriptor = this.zzc;
                if (assetFileDescriptor != null) {
                    assetFileDescriptor.close();
                }
                this.zzc = null;
                if (this.zzf) {
                    this.zzf = false;
                    zzh();
                }
            } catch (IOException e10) {
                throw new zzfc(e10, AdError.SERVER_ERROR_CODE);
            } catch (Throwable th) {
                this.zzc = null;
                if (this.zzf) {
                    this.zzf = false;
                    zzh();
                }
                throw th;
            }
        } catch (IOException e11) {
            throw new zzfc(e11, AdError.SERVER_ERROR_CODE);
        } catch (Throwable th2) {
            this.zzd = null;
            try {
                AssetFileDescriptor assetFileDescriptor2 = this.zzc;
                if (assetFileDescriptor2 != null) {
                    assetFileDescriptor2.close();
                }
                this.zzc = null;
                if (this.zzf) {
                    this.zzf = false;
                    zzh();
                }
                throw th2;
            } catch (IOException e12) {
                throw new zzfc(e12, AdError.SERVER_ERROR_CODE);
            } catch (Throwable th3) {
                this.zzc = null;
                if (this.zzf) {
                    this.zzf = false;
                    zzh();
                }
                throw th3;
            }
        }
    }
}
