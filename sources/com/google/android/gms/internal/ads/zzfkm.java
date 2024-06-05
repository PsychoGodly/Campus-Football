package com.google.android.gms.internal.ads;

import android.net.Network;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class zzfkm extends zzfka {
    private zzfok<Integer> zza;
    private zzfok<Integer> zzb;
    private zzfkl zzc;
    private HttpURLConnection zzd;

    zzfkm() {
        this(zzfkj.zza, zzfkk.zza, (zzfkl) null);
    }

    zzfkm(zzfok<Integer> zzfok, zzfok<Integer> zzfok2, zzfkl zzfkl) {
        this.zza = zzfok;
        this.zzb = zzfok2;
        this.zzc = zzfkl;
    }

    static /* synthetic */ Integer zzf() {
        return -1;
    }

    static /* synthetic */ Integer zzg() {
        return -1;
    }

    public static void zzs(HttpURLConnection httpURLConnection) {
        zzfkb.zza();
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    public void close() {
        zzs(this.zzd);
    }

    public HttpURLConnection zzm() throws IOException {
        zzfkb.zzb(((Integer) this.zza.zza()).intValue(), ((Integer) this.zzb.zza()).intValue());
        zzfkl zzfkl = this.zzc;
        Objects.requireNonNull(zzfkl);
        HttpURLConnection httpURLConnection = (HttpURLConnection) zzfkl.zza();
        this.zzd = httpURLConnection;
        return httpURLConnection;
    }

    public HttpURLConnection zzn(zzfkl zzfkl, int i10, int i11) throws IOException {
        this.zza = new zzfkc(i10);
        this.zzb = new zzfkd(i11);
        this.zzc = zzfkl;
        return zzm();
    }

    public HttpURLConnection zzo(Network network, URL url, int i10, int i11) throws IOException {
        this.zza = new zzfke(i10);
        this.zzb = new zzfkf(i11);
        this.zzc = new zzfkg(network, url);
        return zzm();
    }

    public URLConnection zzr(URL url, int i10) throws IOException {
        this.zza = new zzfkh(i10);
        this.zzc = new zzfki(url);
        return zzm();
    }
}
