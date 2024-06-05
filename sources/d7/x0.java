package d7;

import android.app.Application;
import android.content.Context;
import com.google.android.gms.common.api.internal.c;
import com.google.android.gms.internal.p001firebaseauthapi.zzafn;
import y6.f;

/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class x0 {

    /* renamed from: a  reason: collision with root package name */
    private volatile int f28644a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final s f28645b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public volatile boolean f28646c;

    public x0(f fVar) {
        this(fVar.m(), new s(fVar));
    }

    /* access modifiers changed from: private */
    public final boolean f() {
        return this.f28644a > 0 && !this.f28646c;
    }

    public final void b() {
        this.f28645b.b();
    }

    public final void c(int i10) {
        if (i10 > 0 && this.f28644a == 0) {
            this.f28644a = i10;
            if (f()) {
                this.f28645b.c();
            }
        } else if (i10 == 0 && this.f28644a != 0) {
            this.f28645b.b();
        }
        this.f28644a = i10;
    }

    public final void d(zzafn zzafn) {
        if (zzafn != null) {
            long zza = zzafn.zza();
            if (zza <= 0) {
                zza = 3600;
            }
            s sVar = this.f28645b;
            sVar.f28612b = zzafn.zzb() + (zza * 1000);
            sVar.f28613c = -1;
            if (f()) {
                this.f28645b.c();
            }
        }
    }

    private x0(Context context, s sVar) {
        this.f28646c = false;
        this.f28644a = 0;
        this.f28645b = sVar;
        c.c((Application) context.getApplicationContext());
        c.b().a(new a1(this));
    }
}
