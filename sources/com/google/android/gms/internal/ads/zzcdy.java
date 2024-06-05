package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzcdy extends zzfa implements zzgd {
    private static final Pattern zzb = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    private final int zzc;
    private final int zzd;
    private final String zze;
    private final zzgc zzf = new zzgc();
    private zzfl zzg;
    private HttpURLConnection zzh;
    private final Queue zzi;
    private InputStream zzj;
    private boolean zzk;
    private int zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;
    private final long zzr;
    private final long zzs;

    zzcdy(String str, zzgi zzgi, int i10, int i11, long j10, long j11) {
        super(true);
        zzdl.zzc(str);
        this.zze = str;
        this.zzc = i10;
        this.zzd = i11;
        this.zzi = new ArrayDeque();
        this.zzr = j10;
        this.zzs = j11;
        if (zzgi != null) {
            zzf(zzgi);
        }
    }

    private final void zzl() {
        while (!this.zzi.isEmpty()) {
            try {
                ((HttpURLConnection) this.zzi.remove()).disconnect();
            } catch (Exception e10) {
                zzbza.zzh("Unexpected error while disconnecting", e10);
            }
        }
        this.zzh = null;
    }

    public final int zza(byte[] bArr, int i10, int i11) throws zzfz {
        int i12 = i11;
        if (i12 == 0) {
            return 0;
        }
        try {
            long j10 = this.zzm;
            long j11 = this.zzn;
            if (j10 - j11 == 0) {
                return -1;
            }
            long j12 = this.zzo + j11;
            long j13 = (long) i12;
            long j14 = this.zzs;
            long j15 = this.zzq;
            long j16 = j15 + 1;
            if (j12 + j13 + j14 > j16) {
                long j17 = this.zzp;
                if (j15 < j17) {
                    long min = Math.min(j17, Math.max(((this.zzr + j16) - j14) - 1, -1 + j16 + j13));
                    long j18 = j16;
                    long j19 = min;
                    zzk(j18, min, 2);
                    this.zzq = j19;
                    j15 = j19;
                }
            }
            int read = this.zzj.read(bArr, i10, (int) Math.min(j13, ((j15 + 1) - this.zzo) - this.zzn));
            if (read != -1) {
                this.zzn += (long) read;
                zzg(read);
                return read;
            }
            throw new EOFException();
        } catch (IOException e10) {
            throw new zzfz(e10, this.zzg, (int) AdError.SERVER_ERROR_CODE, 2);
        }
    }

    public final long zzb(zzfl zzfl) throws zzfz {
        long j10;
        this.zzg = zzfl;
        this.zzn = 0;
        long j11 = zzfl.zzf;
        long j12 = zzfl.zzg;
        if (j12 == -1) {
            j10 = this.zzr;
        } else {
            j10 = Math.min(this.zzr, j12);
        }
        this.zzo = j11;
        HttpURLConnection zzk2 = zzk(j11, (j10 + j11) - 1, 1);
        this.zzh = zzk2;
        String headerField = zzk2.getHeaderField("Content-Range");
        if (!TextUtils.isEmpty(headerField)) {
            Matcher matcher = zzb.matcher(headerField);
            if (matcher.find()) {
                try {
                    Long.parseLong(matcher.group(1));
                    long parseLong = Long.parseLong(matcher.group(2));
                    long parseLong2 = Long.parseLong(matcher.group(3));
                    long j13 = zzfl.zzg;
                    if (j13 != -1) {
                        this.zzm = j13;
                        this.zzp = Math.max(parseLong, (this.zzo + j13) - 1);
                    } else {
                        this.zzm = parseLong2 - this.zzo;
                        this.zzp = parseLong2 - 1;
                    }
                    this.zzq = parseLong;
                    this.zzk = true;
                    zzj(zzfl);
                    return this.zzm;
                } catch (NumberFormatException unused) {
                    zzbza.zzg("Unexpected Content-Range [" + headerField + "]");
                }
            }
        }
        throw new zzcdw(headerField, zzfl);
    }

    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.zzh;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    public final void zzd() throws zzfz {
        try {
            InputStream inputStream = this.zzj;
            if (inputStream != null) {
                inputStream.close();
            }
            this.zzj = null;
            zzl();
            if (this.zzk) {
                this.zzk = false;
                zzh();
            }
        } catch (IOException e10) {
            throw new zzfz(e10, this.zzg, (int) AdError.SERVER_ERROR_CODE, 3);
        } catch (Throwable th) {
            this.zzj = null;
            zzl();
            if (this.zzk) {
                this.zzk = false;
                zzh();
            }
            throw th;
        }
    }

    public final Map zze() {
        HttpURLConnection httpURLConnection = this.zzh;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    /* access modifiers changed from: package-private */
    public final HttpURLConnection zzk(long j10, long j11, int i10) throws zzfz {
        String uri = this.zzg.zza.toString();
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri).openConnection();
            httpURLConnection.setConnectTimeout(this.zzc);
            httpURLConnection.setReadTimeout(this.zzd);
            for (Map.Entry entry : this.zzf.zza().entrySet()) {
                httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            httpURLConnection.setRequestProperty("Range", "bytes=" + j10 + "-" + j11);
            httpURLConnection.setRequestProperty("User-Agent", this.zze);
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.connect();
            this.zzi.add(httpURLConnection);
            String uri2 = this.zzg.zza.toString();
            try {
                int responseCode = httpURLConnection.getResponseCode();
                this.zzl = responseCode;
                if (responseCode < 200 || responseCode > 299) {
                    Map headerFields = httpURLConnection.getHeaderFields();
                    zzl();
                    throw new zzcdx(this.zzl, headerFields, this.zzg, i10);
                }
                try {
                    InputStream inputStream = httpURLConnection.getInputStream();
                    if (this.zzj != null) {
                        inputStream = new SequenceInputStream(this.zzj, inputStream);
                    }
                    this.zzj = inputStream;
                    return httpURLConnection;
                } catch (IOException e10) {
                    zzl();
                    throw new zzfz(e10, this.zzg, (int) AdError.SERVER_ERROR_CODE, i10);
                }
            } catch (IOException e11) {
                zzl();
                String valueOf = String.valueOf(uri2);
                zzfl zzfl = this.zzg;
                throw new zzfz("Unable to connect to ".concat(valueOf), e11, zzfl, AdError.SERVER_ERROR_CODE, i10);
            }
        } catch (IOException e12) {
            IOException iOException = e12;
            String valueOf2 = String.valueOf(uri);
            throw new zzfz("Unable to connect to ".concat(valueOf2), iOException, this.zzg, AdError.SERVER_ERROR_CODE, i10);
        }
    }
}
