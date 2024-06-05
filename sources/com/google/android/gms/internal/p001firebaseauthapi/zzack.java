package com.google.android.gms.internal.p001firebaseauthapi;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import b8.b;
import com.google.android.gms.common.api.Status;
import java.net.HttpURLConnection;
import java.net.URL;
import k5.a;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzack  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public interface zzack {
    public static final a zza = new a("FirebaseAuth", "GetAuthDomainTaskResponseHandler");

    Context zza();

    Uri.Builder zza(Intent intent, String str, String str2);

    String zza(String str);

    HttpURLConnection zza(URL url);

    void zza(Uri uri, String str, b<c7.b> bVar);

    void zza(String str, Status status);
}
