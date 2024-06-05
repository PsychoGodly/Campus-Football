package com.google.android.gms.internal.consent_sdk;

import android.text.TextUtils;
import android.util.Log;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.1.0 */
public final /* synthetic */ class zze implements Runnable {
    public final /* synthetic */ String zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ zzf[] zzc;

    public /* synthetic */ zze(String str, String str2, zzf[] zzfArr) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzfArr;
    }

    public final void run() {
        JSONObject jSONObject;
        String str = this.zza;
        String str2 = this.zzb;
        zzf[] zzfArr = this.zzc;
        if (TextUtils.isEmpty(str)) {
            Log.d("UserMessagingPlatform", "Error on action: empty action name");
            return;
        }
        String lowerCase = str.toLowerCase();
        if (TextUtils.isEmpty(str2)) {
            jSONObject = new JSONObject();
        } else {
            try {
                jSONObject = new JSONObject(str2);
            } catch (JSONException unused) {
                Log.d("UserMessagingPlatform", "Action[" + lowerCase + "]: failed to parse args: " + str2);
                return;
            }
        }
        String obj = jSONObject.toString();
        Log.d("UserMessagingPlatform", "Action[" + lowerCase + "]: " + obj);
        int length = zzfArr.length;
        int i10 = 0;
        while (i10 < length) {
            zzf zzf = zzfArr[i10];
            FutureTask futureTask = new FutureTask(new zzd(zzf, lowerCase, jSONObject));
            zzf.zza().execute(futureTask);
            try {
                if (!((Boolean) futureTask.get()).booleanValue()) {
                    i10++;
                } else {
                    return;
                }
            } catch (ExecutionException e10) {
                Log.d("UserMessagingPlatform", "Failed to run Action[" + lowerCase + "]: ", e10.getCause());
            } catch (InterruptedException e11) {
                Log.d("UserMessagingPlatform", "Thread interrupted for Action[" + lowerCase + "]: ", e11);
            }
        }
    }
}
