package q5;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzdf;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.5.0 */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private final zzdf f29676a;

    public a(zzdf zzdf) {
        this.f29676a = zzdf;
    }

    public static a k(Context context, String str, String str2, String str3, Bundle bundle) {
        return zzdf.zza(context, str, str2, str3, bundle).zzb();
    }

    public void a(String str) {
        this.f29676a.zzb(str);
    }

    public void b(String str, String str2, Bundle bundle) {
        this.f29676a.zza(str, str2, bundle);
    }

    public void c(String str) {
        this.f29676a.zzc(str);
    }

    public long d() {
        return this.f29676a.zza();
    }

    public String e() {
        return this.f29676a.zzd();
    }

    public String f() {
        return this.f29676a.zzf();
    }

    public List<Bundle> g(String str, String str2) {
        return this.f29676a.zza(str, str2);
    }

    public String h() {
        return this.f29676a.zzg();
    }

    public String i() {
        return this.f29676a.zzh();
    }

    public String j() {
        return this.f29676a.zzi();
    }

    public int l(String str) {
        return this.f29676a.zza(str);
    }

    public Map<String, Object> m(String str, String str2, boolean z10) {
        return this.f29676a.zza(str, str2, z10);
    }

    public void n(String str, String str2, Bundle bundle) {
        this.f29676a.zzb(str, str2, bundle);
    }

    public void o(Bundle bundle) {
        this.f29676a.zza(bundle, false);
    }

    public Bundle p(Bundle bundle) {
        return this.f29676a.zza(bundle, true);
    }

    public void q(Bundle bundle) {
        this.f29676a.zza(bundle);
    }

    public void r(Bundle bundle) {
        this.f29676a.zzb(bundle);
    }

    public void s(Activity activity, String str, String str2) {
        this.f29676a.zza(activity, str, str2);
    }

    public void t(String str, String str2, Object obj) {
        this.f29676a.zza(str, str2, obj, true);
    }

    public final void u(boolean z10) {
        this.f29676a.zza(z10);
    }
}
