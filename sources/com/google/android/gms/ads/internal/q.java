package com.google.android.gms.ads.internal;

import android.os.AsyncTask;
import com.applovin.mediation.MaxReward;
import com.google.android.gms.internal.ads.zzapw;
import com.google.android.gms.internal.ads.zzbza;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class q extends AsyncTask {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ s f14722a;

    /* synthetic */ q(s sVar, p pVar) {
        this.f14722a = sVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String doInBackground(Void... voidArr) {
        try {
            s sVar = this.f14722a;
            sVar.f14736i = (zzapw) sVar.f14731c.get(1000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException e10) {
            zzbza.zzk(MaxReward.DEFAULT_LABEL, e10);
        } catch (TimeoutException e11) {
            zzbza.zzk(MaxReward.DEFAULT_LABEL, e11);
        }
        return this.f14722a.zzp();
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        s sVar = this.f14722a;
        if (sVar.f14734g != null && str != null) {
            sVar.f14734g.loadUrl(str);
        }
    }
}
