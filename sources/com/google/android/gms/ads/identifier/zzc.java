package com.google.android.gms.ads.identifier;

import android.util.Log;
import com.google.android.gms.internal.ads_identifier.zzi;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* compiled from: com.google.android.gms:play-services-ads-identifier@@17.1.0 */
public final class zzc {
    public static final void zza(String str) {
        HttpURLConnection httpURLConnection;
        try {
            zzi.zzb(263);
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode < 200 || responseCode >= 300) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 65);
                sb2.append("Received non-success response code ");
                sb2.append(responseCode);
                sb2.append(" from pinging URL: ");
                sb2.append(str);
                Log.w("HttpUrlPinger", sb2.toString());
            }
            httpURLConnection.disconnect();
            zzi.zza();
        } catch (IndexOutOfBoundsException e10) {
            String message = e10.getMessage();
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 32 + String.valueOf(message).length());
            sb3.append("Error while parsing ping URL: ");
            sb3.append(str);
            sb3.append(". ");
            sb3.append(message);
            Log.w("HttpUrlPinger", sb3.toString(), e10);
            zzi.zza();
        } catch (IOException | RuntimeException e11) {
            try {
                String message2 = e11.getMessage();
                StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 27 + String.valueOf(message2).length());
                sb4.append("Error while pinging URL: ");
                sb4.append(str);
                sb4.append(". ");
                sb4.append(message2);
                Log.w("HttpUrlPinger", sb4.toString(), e11);
            } finally {
                zzi.zza();
            }
        } catch (Throwable th) {
            httpURLConnection.disconnect();
            throw th;
        }
    }
}
