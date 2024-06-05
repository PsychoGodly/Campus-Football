package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.facebook.ads.AdError;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.Socket;
import java.net.SocketException;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzcdf extends zzfa implements zzgd {
    private static final Pattern zzb = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    private static final AtomicReference zzc = new AtomicReference();
    private final SSLSocketFactory zzd = new zzcde(this);
    private final int zze;
    private final int zzf;
    private final String zzg;
    private final zzgc zzh;
    private zzfl zzi;
    private HttpURLConnection zzj;
    private InputStream zzk;
    private boolean zzl;
    private int zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;
    /* access modifiers changed from: private */
    public int zzr;
    private final Set zzs = new HashSet();

    zzcdf(String str, zzgi zzgi, int i10, int i11, int i12) {
        super(true);
        zzdl.zzc(str);
        this.zzg = str;
        this.zzh = new zzgc();
        this.zze = i10;
        this.zzf = i11;
        this.zzr = i12;
        if (zzgi != null) {
            zzf(zzgi);
        }
    }

    private final void zzn() {
        HttpURLConnection httpURLConnection = this.zzj;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e10) {
                zzbza.zzh("Unexpected error while disconnecting", e10);
            }
            this.zzj = null;
        }
    }

    public final int zza(byte[] bArr, int i10, int i11) throws zzfz {
        try {
            if (this.zzp != this.zzn) {
                byte[] bArr2 = (byte[]) zzc.getAndSet((Object) null);
                if (bArr2 == null) {
                    bArr2 = new byte[4096];
                }
                while (true) {
                    long j10 = this.zzp;
                    long j11 = this.zzn;
                    if (j10 == j11) {
                        zzc.set(bArr2);
                        break;
                    }
                    int read = this.zzk.read(bArr2, 0, (int) Math.min(j11 - j10, (long) bArr2.length));
                    if (Thread.interrupted()) {
                        throw new InterruptedIOException();
                    } else if (read != -1) {
                        this.zzp += (long) read;
                        zzg(read);
                    } else {
                        throw new EOFException();
                    }
                }
            }
            if (i11 == 0) {
                return 0;
            }
            long j12 = this.zzo;
            if (j12 != -1) {
                long j13 = j12 - this.zzq;
                if (j13 != 0) {
                    i11 = (int) Math.min((long) i11, j13);
                }
                return -1;
            }
            int read2 = this.zzk.read(bArr, i10, i11);
            if (read2 != -1) {
                this.zzq += (long) read2;
                zzg(read2);
                return read2;
            } else if (this.zzo == -1) {
                return -1;
            } else {
                throw new EOFException();
            }
        } catch (IOException e10) {
            throw new zzfz(e10, this.zzi, (int) AdError.SERVER_ERROR_CODE, 2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0100, code lost:
        if (r2 == 0) goto L_0x0102;
     */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x00e6 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00b7 A[Catch:{ IOException -> 0x0290 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e4 A[Catch:{ IOException -> 0x0290 }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01bf  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long zzb(com.google.android.gms.internal.ads.zzfl r21) throws com.google.android.gms.internal.ads.zzfz {
        /*
            r20 = this;
            r1 = r20
            r7 = r21
            java.lang.String r2 = "Unable to connect to "
            r1.zzi = r7
            r3 = 0
            r1.zzq = r3
            r1.zzp = r3
            java.net.URL r0 = new java.net.URL     // Catch:{ IOException -> 0x0290 }
            android.net.Uri r5 = r7.zza     // Catch:{ IOException -> 0x0290 }
            java.lang.String r5 = r5.toString()     // Catch:{ IOException -> 0x0290 }
            r0.<init>(r5)     // Catch:{ IOException -> 0x0290 }
            long r5 = r7.zzf     // Catch:{ IOException -> 0x0290 }
            long r8 = r7.zzg     // Catch:{ IOException -> 0x0290 }
            r10 = 1
            boolean r11 = r7.zzb(r10)     // Catch:{ IOException -> 0x0290 }
            r13 = 0
        L_0x0023:
            int r14 = r13 + 1
            r15 = 20
            if (r13 > r15) goto L_0x0279
            java.net.URLConnection r13 = r0.openConnection()     // Catch:{ IOException -> 0x0290 }
            java.net.HttpURLConnection r13 = (java.net.HttpURLConnection) r13     // Catch:{ IOException -> 0x0290 }
            boolean r15 = r13 instanceof javax.net.ssl.HttpsURLConnection     // Catch:{ IOException -> 0x0290 }
            if (r15 == 0) goto L_0x003b
            r15 = r13
            javax.net.ssl.HttpsURLConnection r15 = (javax.net.ssl.HttpsURLConnection) r15     // Catch:{ IOException -> 0x0290 }
            javax.net.ssl.SSLSocketFactory r10 = r1.zzd     // Catch:{ IOException -> 0x0290 }
            r15.setSSLSocketFactory(r10)     // Catch:{ IOException -> 0x0290 }
        L_0x003b:
            int r10 = r1.zze     // Catch:{ IOException -> 0x0290 }
            r13.setConnectTimeout(r10)     // Catch:{ IOException -> 0x0290 }
            int r10 = r1.zzf     // Catch:{ IOException -> 0x0290 }
            r13.setReadTimeout(r10)     // Catch:{ IOException -> 0x0290 }
            com.google.android.gms.internal.ads.zzgc r10 = r1.zzh     // Catch:{ IOException -> 0x0290 }
            java.util.Map r10 = r10.zza()     // Catch:{ IOException -> 0x0290 }
            java.util.Set r10 = r10.entrySet()     // Catch:{ IOException -> 0x0290 }
            java.util.Iterator r10 = r10.iterator()     // Catch:{ IOException -> 0x0290 }
        L_0x0053:
            boolean r15 = r10.hasNext()     // Catch:{ IOException -> 0x0290 }
            if (r15 == 0) goto L_0x0071
            java.lang.Object r15 = r10.next()     // Catch:{ IOException -> 0x0290 }
            java.util.Map$Entry r15 = (java.util.Map.Entry) r15     // Catch:{ IOException -> 0x0290 }
            java.lang.Object r16 = r15.getKey()     // Catch:{ IOException -> 0x0290 }
            r12 = r16
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ IOException -> 0x0290 }
            java.lang.Object r15 = r15.getValue()     // Catch:{ IOException -> 0x0290 }
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ IOException -> 0x0290 }
            r13.setRequestProperty(r12, r15)     // Catch:{ IOException -> 0x0290 }
            goto L_0x0053
        L_0x0071:
            r18 = -1
            int r10 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r10 != 0) goto L_0x007c
            int r10 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r10 == 0) goto L_0x00ae
            goto L_0x007d
        L_0x007c:
            r3 = r5
        L_0x007d:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0290 }
            r10.<init>()     // Catch:{ IOException -> 0x0290 }
            java.lang.String r12 = "bytes="
            r10.append(r12)     // Catch:{ IOException -> 0x0290 }
            r10.append(r3)     // Catch:{ IOException -> 0x0290 }
            java.lang.String r12 = "-"
            r10.append(r12)     // Catch:{ IOException -> 0x0290 }
            java.lang.String r10 = r10.toString()     // Catch:{ IOException -> 0x0290 }
            int r12 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r12 == 0) goto L_0x00a9
            long r3 = r3 + r8
            long r3 = r3 + r18
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0290 }
            r12.<init>()     // Catch:{ IOException -> 0x0290 }
            r12.append(r10)     // Catch:{ IOException -> 0x0290 }
            r12.append(r3)     // Catch:{ IOException -> 0x0290 }
            java.lang.String r10 = r12.toString()     // Catch:{ IOException -> 0x0290 }
        L_0x00a9:
            java.lang.String r3 = "Range"
            r13.setRequestProperty(r3, r10)     // Catch:{ IOException -> 0x0290 }
        L_0x00ae:
            java.lang.String r3 = "User-Agent"
            java.lang.String r4 = r1.zzg     // Catch:{ IOException -> 0x0290 }
            r13.setRequestProperty(r3, r4)     // Catch:{ IOException -> 0x0290 }
            if (r11 != 0) goto L_0x00be
            java.lang.String r3 = "Accept-Encoding"
            java.lang.String r4 = "identity"
            r13.setRequestProperty(r3, r4)     // Catch:{ IOException -> 0x0290 }
        L_0x00be:
            r3 = 0
            r13.setInstanceFollowRedirects(r3)     // Catch:{ IOException -> 0x0290 }
            r13.setDoOutput(r3)     // Catch:{ IOException -> 0x0290 }
            r13.connect()     // Catch:{ IOException -> 0x0290 }
            int r4 = r13.getResponseCode()     // Catch:{ IOException -> 0x0290 }
            r10 = 300(0x12c, float:4.2E-43)
            if (r4 == r10) goto L_0x0232
            r10 = 301(0x12d, float:4.22E-43)
            if (r4 == r10) goto L_0x0232
            r10 = 302(0x12e, float:4.23E-43)
            if (r4 == r10) goto L_0x0232
            r10 = 303(0x12f, float:4.25E-43)
            if (r4 == r10) goto L_0x0232
            r10 = 307(0x133, float:4.3E-43)
            if (r4 == r10) goto L_0x0232
            r10 = 308(0x134, float:4.32E-43)
            if (r4 != r10) goto L_0x00e6
            goto L_0x0232
        L_0x00e6:
            r1.zzj = r13     // Catch:{ IOException -> 0x0290 }
            int r0 = r13.getResponseCode()     // Catch:{ IOException -> 0x0212 }
            r1.zzm = r0     // Catch:{ IOException -> 0x0212 }
            r2 = 200(0xc8, float:2.8E-43)
            if (r0 < r2) goto L_0x01ea
            r3 = 299(0x12b, float:4.19E-43)
            if (r0 <= r3) goto L_0x00f8
            goto L_0x01ea
        L_0x00f8:
            if (r0 != r2) goto L_0x0102
            long r2 = r7.zzf
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x0104
        L_0x0102:
            r2 = 0
        L_0x0104:
            r1.zzn = r2
            r2 = 1
            boolean r0 = r7.zzb(r2)
            if (r0 != 0) goto L_0x01c8
            long r2 = r7.zzg
            int r0 = (r2 > r18 ? 1 : (r2 == r18 ? 0 : -1))
            if (r0 == 0) goto L_0x0117
            r1.zzo = r2
            goto L_0x01cc
        L_0x0117:
            java.net.HttpURLConnection r0 = r1.zzj
            java.lang.String r2 = "Content-Length"
            java.lang.String r2 = r0.getHeaderField(r2)
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            java.lang.String r4 = "]"
            if (r3 != 0) goto L_0x0143
            long r5 = java.lang.Long.parseLong(r2)     // Catch:{ NumberFormatException -> 0x012c }
            goto L_0x0145
        L_0x012c:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Unexpected Content-Length ["
            r3.append(r5)
            r3.append(r2)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.google.android.gms.internal.ads.zzbza.zzg(r3)
        L_0x0143:
            r5 = r18
        L_0x0145:
            java.lang.String r3 = "Content-Range"
            java.lang.String r0 = r0.getHeaderField(r3)
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 != 0) goto L_0x01bb
            java.util.regex.Pattern r3 = zzb
            java.util.regex.Matcher r3 = r3.matcher(r0)
            boolean r8 = r3.find()
            if (r8 == 0) goto L_0x01bb
            r8 = 2
            java.lang.String r8 = r3.group(r8)     // Catch:{ NumberFormatException -> 0x01a4 }
            long r8 = java.lang.Long.parseLong(r8)     // Catch:{ NumberFormatException -> 0x01a4 }
            r10 = 1
            java.lang.String r3 = r3.group(r10)     // Catch:{ NumberFormatException -> 0x01a4 }
            long r10 = java.lang.Long.parseLong(r3)     // Catch:{ NumberFormatException -> 0x01a4 }
            long r8 = r8 - r10
            r16 = 0
            int r3 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            r10 = 1
            long r8 = r8 + r10
            if (r3 >= 0) goto L_0x017b
            r5 = r8
            goto L_0x01bb
        L_0x017b:
            int r3 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r3 == 0) goto L_0x01bb
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x01a4 }
            r3.<init>()     // Catch:{ NumberFormatException -> 0x01a4 }
            java.lang.String r10 = "Inconsistent headers ["
            r3.append(r10)     // Catch:{ NumberFormatException -> 0x01a4 }
            r3.append(r2)     // Catch:{ NumberFormatException -> 0x01a4 }
            java.lang.String r2 = "] ["
            r3.append(r2)     // Catch:{ NumberFormatException -> 0x01a4 }
            r3.append(r0)     // Catch:{ NumberFormatException -> 0x01a4 }
            r3.append(r4)     // Catch:{ NumberFormatException -> 0x01a4 }
            java.lang.String r2 = r3.toString()     // Catch:{ NumberFormatException -> 0x01a4 }
            com.google.android.gms.internal.ads.zzbza.zzj(r2)     // Catch:{ NumberFormatException -> 0x01a4 }
            long r2 = java.lang.Math.max(r5, r8)     // Catch:{ NumberFormatException -> 0x01a4 }
            r5 = r2
            goto L_0x01bb
        L_0x01a4:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unexpected Content-Range ["
            r2.append(r3)
            r2.append(r0)
            r2.append(r4)
            java.lang.String r0 = r2.toString()
            com.google.android.gms.internal.ads.zzbza.zzg(r0)
        L_0x01bb:
            int r0 = (r5 > r18 ? 1 : (r5 == r18 ? 0 : -1))
            if (r0 == 0) goto L_0x01c3
            long r2 = r1.zzn
            long r18 = r5 - r2
        L_0x01c3:
            r2 = r18
            r1.zzo = r2
            goto L_0x01cc
        L_0x01c8:
            long r2 = r7.zzg
            r1.zzo = r2
        L_0x01cc:
            java.net.HttpURLConnection r0 = r1.zzj     // Catch:{ IOException -> 0x01dd }
            java.io.InputStream r0 = r0.getInputStream()     // Catch:{ IOException -> 0x01dd }
            r1.zzk = r0     // Catch:{ IOException -> 0x01dd }
            r2 = 1
            r1.zzl = r2
            r20.zzj(r21)
            long r2 = r1.zzo
            return r2
        L_0x01dd:
            r0 = move-exception
            r20.zzn()
            com.google.android.gms.internal.ads.zzfz r2 = new com.google.android.gms.internal.ads.zzfz
            r3 = 2000(0x7d0, float:2.803E-42)
            r4 = 1
            r2.<init>((java.io.IOException) r0, (com.google.android.gms.internal.ads.zzfl) r7, (int) r3, (int) r4)
            throw r2
        L_0x01ea:
            java.net.HttpURLConnection r0 = r1.zzj
            java.util.Map r6 = r0.getHeaderFields()
            r20.zzn()
            com.google.android.gms.internal.ads.zzgb r0 = new com.google.android.gms.internal.ads.zzgb
            int r3 = r1.zzm
            r4 = 0
            r5 = 0
            byte[] r8 = com.google.android.gms.internal.ads.zzew.zzf
            r2 = r0
            r7 = r21
            r2.<init>(r3, r4, r5, r6, r7, r8)
            int r2 = r1.zzm
            r3 = 416(0x1a0, float:5.83E-43)
            if (r2 != r3) goto L_0x0211
            com.google.android.gms.internal.ads.zzfh r2 = new com.google.android.gms.internal.ads.zzfh
            r3 = 2008(0x7d8, float:2.814E-42)
            r2.<init>(r3)
            r0.initCause(r2)
        L_0x0211:
            throw r0
        L_0x0212:
            r0 = move-exception
            r4 = r0
            r20.zzn()
            com.google.android.gms.internal.ads.zzfz r0 = new com.google.android.gms.internal.ads.zzfz
            android.net.Uri r3 = r7.zza
            java.lang.String r3 = r3.toString()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r3 = r2.concat(r3)
            r6 = 2000(0x7d0, float:2.803E-42)
            r8 = 1
            r2 = r0
            r5 = r21
            r7 = r8
            r2.<init>(r3, r4, r5, r6, r7)
            throw r0
        L_0x0232:
            r4 = 1
            r16 = 0
            java.lang.String r10 = "Location"
            java.lang.String r10 = r13.getHeaderField(r10)     // Catch:{ IOException -> 0x0290 }
            r13.disconnect()     // Catch:{ IOException -> 0x0290 }
            if (r10 == 0) goto L_0x0271
            java.net.URL r12 = new java.net.URL     // Catch:{ IOException -> 0x0290 }
            r12.<init>(r0, r10)     // Catch:{ IOException -> 0x0290 }
            java.lang.String r0 = r12.getProtocol()     // Catch:{ IOException -> 0x0290 }
            java.lang.String r10 = "https"
            boolean r10 = r10.equals(r0)     // Catch:{ IOException -> 0x0290 }
            if (r10 != 0) goto L_0x026a
            java.lang.String r10 = "http"
            boolean r10 = r10.equals(r0)     // Catch:{ IOException -> 0x0290 }
            if (r10 == 0) goto L_0x025a
            goto L_0x026a
        L_0x025a:
            java.net.ProtocolException r3 = new java.net.ProtocolException     // Catch:{ IOException -> 0x0290 }
            java.lang.String r4 = "Unsupported protocol redirect: "
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ IOException -> 0x0290 }
            java.lang.String r0 = r4.concat(r0)     // Catch:{ IOException -> 0x0290 }
            r3.<init>(r0)     // Catch:{ IOException -> 0x0290 }
            throw r3     // Catch:{ IOException -> 0x0290 }
        L_0x026a:
            r0 = r12
            r13 = r14
            r3 = r16
            r10 = 1
            goto L_0x0023
        L_0x0271:
            java.net.ProtocolException r0 = new java.net.ProtocolException     // Catch:{ IOException -> 0x0290 }
            java.lang.String r3 = "Null location redirect"
            r0.<init>(r3)     // Catch:{ IOException -> 0x0290 }
            throw r0     // Catch:{ IOException -> 0x0290 }
        L_0x0279:
            java.net.NoRouteToHostException r0 = new java.net.NoRouteToHostException     // Catch:{ IOException -> 0x0290 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0290 }
            r3.<init>()     // Catch:{ IOException -> 0x0290 }
            java.lang.String r4 = "Too many redirects: "
            r3.append(r4)     // Catch:{ IOException -> 0x0290 }
            r3.append(r14)     // Catch:{ IOException -> 0x0290 }
            java.lang.String r3 = r3.toString()     // Catch:{ IOException -> 0x0290 }
            r0.<init>(r3)     // Catch:{ IOException -> 0x0290 }
            throw r0     // Catch:{ IOException -> 0x0290 }
        L_0x0290:
            r0 = move-exception
            r4 = r0
            com.google.android.gms.internal.ads.zzfz r0 = new com.google.android.gms.internal.ads.zzfz
            android.net.Uri r3 = r7.zza
            java.lang.String r3 = r3.toString()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r3 = r2.concat(r3)
            r6 = 2000(0x7d0, float:2.803E-42)
            r8 = 1
            r2 = r0
            r5 = r21
            r7 = r8
            r2.<init>(r3, r4, r5, r6, r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcdf.zzb(com.google.android.gms.internal.ads.zzfl):long");
    }

    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.zzj;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:4|(1:6)(1:7)|8|9|(5:13|14|(2:16|(1:18))(2:19|(1:21))|22|(1:26))|27|28) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0067 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzd() throws com.google.android.gms.internal.ads.zzfz {
        /*
            r9 = this;
            r0 = 0
            r1 = 0
            java.io.InputStream r2 = r9.zzk     // Catch:{ all -> 0x008d }
            if (r2 == 0) goto L_0x0079
            java.net.HttpURLConnection r2 = r9.zzj     // Catch:{ all -> 0x008d }
            long r3 = r9.zzo     // Catch:{ all -> 0x008d }
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0011
            goto L_0x0014
        L_0x0011:
            long r7 = r9.zzq     // Catch:{ all -> 0x008d }
            long r3 = r3 - r7
        L_0x0014:
            int r7 = com.google.android.gms.internal.ads.zzew.zza     // Catch:{ all -> 0x008d }
            r8 = 19
            if (r7 == r8) goto L_0x001f
            r8 = 20
            if (r7 == r8) goto L_0x001f
            goto L_0x0067
        L_0x001f:
            java.io.InputStream r2 = r2.getInputStream()     // Catch:{ Exception -> 0x0067 }
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x002f
            int r3 = r2.read()     // Catch:{ Exception -> 0x0067 }
            r4 = -1
            if (r3 == r4) goto L_0x0067
            goto L_0x0036
        L_0x002f:
            r5 = 2048(0x800, double:1.0118E-320)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 > 0) goto L_0x0036
            goto L_0x0067
        L_0x0036:
            java.lang.Class r3 = r2.getClass()     // Catch:{ Exception -> 0x0067 }
            java.lang.String r3 = r3.getName()     // Catch:{ Exception -> 0x0067 }
            java.lang.String r4 = "com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream"
            boolean r4 = r3.equals(r4)     // Catch:{ Exception -> 0x0067 }
            if (r4 != 0) goto L_0x004e
            java.lang.String r4 = "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream"
            boolean r3 = r3.equals(r4)     // Catch:{ Exception -> 0x0067 }
            if (r3 == 0) goto L_0x0067
        L_0x004e:
            java.lang.Class r3 = r2.getClass()     // Catch:{ Exception -> 0x0067 }
            java.lang.Class r3 = r3.getSuperclass()     // Catch:{ Exception -> 0x0067 }
            java.lang.String r4 = "unexpectedEndOfInput"
            java.lang.Class[] r5 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x0067 }
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r4, r5)     // Catch:{ Exception -> 0x0067 }
            r4 = 1
            r3.setAccessible(r4)     // Catch:{ Exception -> 0x0067 }
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0067 }
            r3.invoke(r2, r4)     // Catch:{ Exception -> 0x0067 }
        L_0x0067:
            java.io.InputStream r2 = r9.zzk     // Catch:{ IOException -> 0x006d }
            r2.close()     // Catch:{ IOException -> 0x006d }
            goto L_0x0079
        L_0x006d:
            r2 = move-exception
            com.google.android.gms.internal.ads.zzfz r3 = new com.google.android.gms.internal.ads.zzfz     // Catch:{ all -> 0x008d }
            com.google.android.gms.internal.ads.zzfl r4 = r9.zzi     // Catch:{ all -> 0x008d }
            r5 = 2000(0x7d0, float:2.803E-42)
            r6 = 3
            r3.<init>((java.io.IOException) r2, (com.google.android.gms.internal.ads.zzfl) r4, (int) r5, (int) r6)     // Catch:{ all -> 0x008d }
            throw r3     // Catch:{ all -> 0x008d }
        L_0x0079:
            r9.zzk = r0
            r9.zzn()
            boolean r0 = r9.zzl
            if (r0 == 0) goto L_0x0087
            r9.zzl = r1
            r9.zzh()
        L_0x0087:
            java.util.Set r0 = r9.zzs
            r0.clear()
            return
        L_0x008d:
            r2 = move-exception
            r9.zzk = r0
            r9.zzn()
            boolean r0 = r9.zzl
            if (r0 == 0) goto L_0x009c
            r9.zzl = r1
            r9.zzh()
        L_0x009c:
            java.util.Set r0 = r9.zzs
            r0.clear()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcdf.zzd():void");
    }

    public final Map zze() {
        HttpURLConnection httpURLConnection = this.zzj;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    /* access modifiers changed from: package-private */
    public final void zzm(int i10) {
        this.zzr = i10;
        for (Socket socket : this.zzs) {
            if (!socket.isClosed()) {
                try {
                    socket.setReceiveBufferSize(this.zzr);
                } catch (SocketException e10) {
                    zzbza.zzk("Failed to update receive buffer size.", e10);
                }
            }
        }
    }
}
