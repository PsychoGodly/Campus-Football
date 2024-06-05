package d7;

import android.text.TextUtils;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.internal.p001firebaseauthapi.zzafr;
import com.google.android.gms.internal.p001firebaseauthapi.zzagr;
import com.google.firebase.auth.j0;
import com.google.firebase.auth.t0;
import com.google.firebase.auth.y0;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class i0 {
    public static j0 a(zzafr zzafr) {
        if (zzafr == null) {
            return null;
        }
        if (!TextUtils.isEmpty(zzafr.zze())) {
            return new t0(zzafr.zzd(), zzafr.zzc(), zzafr.zza(), q.g(zzafr.zze()));
        }
        if (zzafr.zzb() != null) {
            return new y0(zzafr.zzd(), zzafr.zzc(), zzafr.zza(), (zzagr) q.l(zzafr.zzb(), "totpInfo cannot be null."));
        }
        return null;
    }

    public static List<j0> b(List<zzafr> list) {
        if (list == null || list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (zzafr a10 : list) {
            j0 a11 = a(a10);
            if (a11 != null) {
                arrayList.add(a11);
            }
        }
        return arrayList;
    }
}
