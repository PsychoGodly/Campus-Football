package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.common.internal.q;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import org.json.JSONException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzadn  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzadn {
    private static void zza(HttpURLConnection httpURLConnection, zzadk<?> zzadk, Type type) {
        InputStream inputStream;
        BufferedReader bufferedReader;
        try {
            int responseCode = httpURLConnection.getResponseCode();
            if (zza(responseCode)) {
                inputStream = httpURLConnection.getInputStream();
            } else {
                inputStream = httpURLConnection.getErrorStream();
            }
            StringBuilder sb2 = new StringBuilder();
            bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb2.append(readLine);
            }
            bufferedReader.close();
            String sb3 = sb2.toString();
            if (!zza(responseCode)) {
                zzadk.zza((String) zzacq.zza(sb3, String.class));
            } else {
                zzadk.zza((zzacs) zzacq.zza(sb3, type));
            }
            httpURLConnection.disconnect();
            return;
        } catch (SocketTimeoutException unused) {
            zzadk.zza("TIMEOUT");
            httpURLConnection.disconnect();
            return;
        } catch (zzaaf | IOException e10) {
            try {
                zzadk.zza(e10.getMessage());
                return;
            } finally {
                httpURLConnection.disconnect();
            }
        } catch (Throwable th) {
            zzadm.zza(th, th);
        }
        throw th;
    }

    private static final boolean zza(int i10) {
        return i10 >= 200 && i10 < 300;
    }

    public static void zza(String str, zzadk<?> zzadk, Type type, zzact zzact) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setConnectTimeout(60000);
            zzact.zza((URLConnection) httpURLConnection);
            zza(httpURLConnection, zzadk, type);
        } catch (SocketTimeoutException unused) {
            zzadk.zza("TIMEOUT");
        } catch (UnknownHostException unused2) {
            zzadk.zza("<<Network Error>>");
        } catch (IOException e10) {
            zzadk.zza(e10.getMessage());
        }
    }

    public static void zza(String str, zzacp zzacp, zzadk<?> zzadk, Type type, zzact zzact) {
        BufferedOutputStream bufferedOutputStream;
        try {
            q.k(zzacp);
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setDoOutput(true);
            byte[] bytes = zzacp.zza().getBytes(Charset.defaultCharset());
            httpURLConnection.setFixedLengthStreamingMode(bytes.length);
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            httpURLConnection.setConnectTimeout(60000);
            zzact.zza((URLConnection) httpURLConnection);
            bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream(), bytes.length);
            bufferedOutputStream.write(bytes, 0, bytes.length);
            bufferedOutputStream.close();
            zza(httpURLConnection, zzadk, type);
            return;
        } catch (SocketTimeoutException unused) {
            zzadk.zza("TIMEOUT");
            return;
        } catch (UnknownHostException unused2) {
            zzadk.zza("<<Network Error>>");
            return;
        } catch (IOException | NullPointerException | JSONException e10) {
            zzadk.zza(e10.getMessage());
            return;
        } catch (Throwable th) {
            zzadm.zza(th, th);
        }
        throw th;
    }
}
