package d7;

import com.google.android.gms.internal.p001firebaseauthapi.zzafw;
import com.google.firebase.auth.b;
import com.google.firebase.auth.d;

/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class v1 implements d {

    /* renamed from: a  reason: collision with root package name */
    private final int f28633a;

    /* renamed from: b  reason: collision with root package name */
    private final String f28634b;

    /* renamed from: c  reason: collision with root package name */
    private final String f28635c;

    /* renamed from: d  reason: collision with root package name */
    private final b f28636d;

    public v1(zzafw zzafw) {
        this.f28634b = zzafw.zzg() ? zzafw.zzc() : zzafw.zzb();
        this.f28635c = zzafw.zzb();
        b bVar = null;
        if (!zzafw.zzh()) {
            this.f28633a = 3;
            this.f28636d = null;
            return;
        }
        String zzd = zzafw.zzd();
        zzd.hashCode();
        char c10 = 65535;
        int i10 = 5;
        switch (zzd.hashCode()) {
            case -1874510116:
                if (zzd.equals("REVERT_SECOND_FACTOR_ADDITION")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1452371317:
                if (zzd.equals("PASSWORD_RESET")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1341836234:
                if (zzd.equals("VERIFY_EMAIL")) {
                    c10 = 2;
                    break;
                }
                break;
            case -1099157829:
                if (zzd.equals("VERIFY_AND_CHANGE_EMAIL")) {
                    c10 = 3;
                    break;
                }
                break;
            case 870738373:
                if (zzd.equals("EMAIL_SIGNIN")) {
                    c10 = 4;
                    break;
                }
                break;
            case 970484929:
                if (zzd.equals("RECOVER_EMAIL")) {
                    c10 = 5;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                i10 = 6;
                break;
            case 1:
                i10 = 0;
                break;
            case 2:
                i10 = 1;
                break;
            case 3:
                break;
            case 4:
                i10 = 4;
                break;
            case 5:
                i10 = 2;
                break;
            default:
                i10 = 3;
                break;
        }
        this.f28633a = i10;
        if (i10 == 4 || i10 == 3) {
            this.f28636d = null;
            return;
        }
        if (zzafw.zzf()) {
            bVar = new s1(zzafw.zzb(), i0.a(zzafw.zza()));
        } else if (zzafw.zzg()) {
            bVar = new q1(zzafw.zzc(), zzafw.zzb());
        } else if (zzafw.zze()) {
            bVar = new t1(zzafw.zzb());
        }
        this.f28636d = bVar;
    }

    public final int a() {
        return this.f28633a;
    }

    public final b b() {
        return this.f28636d;
    }
}
