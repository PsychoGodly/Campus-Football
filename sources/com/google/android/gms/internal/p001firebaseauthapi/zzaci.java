package com.google.android.gms.internal.p001firebaseauthapi;

import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.google.android.gms.common.internal.q;
import com.google.firebase.auth.FirebaseAuth;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import k5.a;
import y6.f;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaci  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzaci extends AsyncTask<Void, Void, zzach> {
    private static final a zza = new a("FirebaseAuth", "GetAuthDomainTask");
    private final String zzb;
    private final String zzc;
    private final WeakReference<zzack> zzd;
    private final Uri.Builder zze;
    private final String zzf;
    private final f zzg;

    public zzaci(String str, String str2, Intent intent, f fVar, zzack zzack) {
        this.zzb = q.g(str);
        this.zzg = (f) q.k(fVar);
        q.g(str2);
        q.k(intent);
        String g10 = q.g(intent.getStringExtra("com.google.firebase.auth.KEY_API_KEY"));
        Uri.Builder buildUpon = Uri.parse(zzack.zza(g10)).buildUpon();
        buildUpon.appendPath("getProjectConfig").appendQueryParameter("key", g10).appendQueryParameter("androidPackageName", str).appendQueryParameter("sha1Cert", (String) q.k(str2));
        this.zzc = buildUpon.build().toString();
        this.zzd = new WeakReference<>(zzack);
        this.zze = zzack.zza(intent, str, str2);
        this.zzf = intent.getStringExtra("com.google.firebase.auth.KEY_CUSTOM_AUTH_DOMAIN");
    }

    /* access modifiers changed from: private */
    /* renamed from: zza */
    public final zzach doInBackground(Void... voidArr) {
        try {
            URL url = new URL(this.zzc);
            zzack zzack = (zzack) this.zzd.get();
            HttpURLConnection zza2 = zzack.zza(url);
            zza2.addRequestProperty("Content-Type", "application/json; charset=UTF-8");
            zza2.setConnectTimeout(60000);
            new zzact(zzack.zza(), this.zzg, zzacr.zza().zzb()).zza((URLConnection) zza2);
            int responseCode = zza2.getResponseCode();
            if (responseCode != 200) {
                String zza3 = zza(zza2);
                zza.c(String.format("Error getting project config. Failed with %s %s", new Object[]{zza3, Integer.valueOf(responseCode)}), new Object[0]);
                return zzach.zzb(zza3);
            }
            zzafi zzafi = new zzafi();
            zzafi.zza(new String(zza(zza2.getInputStream(), 128)));
            if (TextUtils.isEmpty(this.zzf)) {
                for (String next : zzafi.zza()) {
                    if (zza(next)) {
                        return zzach.zza(next);
                    }
                }
                return null;
            } else if (!zzafi.zza().contains(this.zzf)) {
                return zzach.zzb("UNAUTHORIZED_DOMAIN");
            } else {
                return zzach.zza(this.zzf);
            }
        } catch (IOException e10) {
            a aVar = zza;
            String message = e10.getMessage();
            aVar.c("IOException occurred: " + message, new Object[0]);
            return null;
        } catch (NullPointerException e11) {
            a aVar2 = zza;
            String message2 = e11.getMessage();
            aVar2.c("Null pointer encountered: " + message2, new Object[0]);
            return null;
        } catch (zzaaf e12) {
            a aVar3 = zza;
            String message3 = e12.getMessage();
            aVar3.c("ConversionException encountered: " + message3, new Object[0]);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void onCancelled(Object obj) {
        zzach zzach = (zzach) obj;
        onPostExecute((zzach) null);
    }

    private static String zza(HttpURLConnection httpURLConnection) throws zzaaf {
        try {
            if (httpURLConnection.getResponseCode() < 400) {
                return null;
            }
            InputStream errorStream = httpURLConnection.getErrorStream();
            if (errorStream != null) {
                return (String) zzacq.zza(new String(zza(errorStream, 128)), String.class);
            }
            return "WEB_INTERNAL_ERROR:" + "Could not retrieve the authDomain for this project but did not receive an error response from the network request. Please try again.";
        } catch (IOException e10) {
            a aVar = zza;
            String valueOf = String.valueOf(e10);
            aVar.h("Error parsing error message from response body in getErrorMessageFromBody. " + valueOf, new Object[0]);
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: zza */
    public final void onPostExecute(zzach zzach) {
        String str;
        Uri.Builder builder;
        zzack zzack = (zzack) this.zzd.get();
        String str2 = null;
        if (zzach != null) {
            str2 = zzach.zza();
            str = zzach.zzb();
        } else {
            str = null;
        }
        if (zzack == null) {
            zza.c("An error has occurred: the handler reference has returned null.", new Object[0]);
        } else if (TextUtils.isEmpty(str2) || (builder = this.zze) == null) {
            zzack.zza(this.zzb, d7.q.a(str));
        } else {
            builder.authority(str2);
            zzack.zza(this.zze.build(), this.zzb, FirebaseAuth.getInstance(this.zzg).t0());
        }
    }

    private static boolean zza(String str) {
        try {
            String host = new URI("https://" + str).getHost();
            if (host == null || (!host.endsWith("firebaseapp.com") && !host.endsWith("web.app"))) {
                return false;
            }
            return true;
        } catch (URISyntaxException e10) {
            a aVar = zza;
            String message = e10.getMessage();
            aVar.c("Error parsing URL for auth domain check: " + str + ". " + message, new Object[0]);
        }
    }

    private static byte[] zza(InputStream inputStream, int i10) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] bArr = new byte[128];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } finally {
            byteArrayOutputStream.close();
        }
    }
}
