package d5;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.e;
import com.google.android.gms.internal.p000authapiphone.zzv;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.4.0 */
public abstract class b extends e<a.d.c> {
    private static final a.g<zzv> zza;
    private static final a.C0154a<zzv, a.d.c> zzb;
    private static final a<a.d.c> zzc;

    static {
        a.g<zzv> gVar = new a.g<>();
        zza = gVar;
        c cVar = new c();
        zzb = cVar;
        zzc = new a<>("SmsRetriever.API", cVar, gVar);
    }

    public b(Context context) {
        super(context, zzc, null, e.a.f15026c);
    }

    public abstract Task<Void> startSmsRetriever();

    public abstract Task<Void> startSmsUserConsent(String str);

    public b(Activity activity) {
        super(activity, zzc, null, e.a.f15026c);
    }
}
