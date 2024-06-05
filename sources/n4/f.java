package n4;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.n0;
import com.google.android.gms.ads.internal.client.n4;
import com.google.android.gms.ads.internal.client.p4;
import com.google.android.gms.ads.internal.client.q0;
import com.google.android.gms.ads.internal.client.x;
import com.google.android.gms.ads.internal.client.x3;
import com.google.android.gms.ads.internal.client.y4;
import com.google.android.gms.ads.internal.client.z2;
import com.google.android.gms.ads.nativead.b;
import com.google.android.gms.ads.nativead.c;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.internal.ads.zzbar;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbdl;
import com.google.android.gms.internal.ads.zzbgc;
import com.google.android.gms.internal.ads.zzbgf;
import com.google.android.gms.internal.ads.zzbnc;
import com.google.android.gms.internal.ads.zzbqr;
import com.google.android.gms.internal.ads.zzbyp;
import com.google.android.gms.internal.ads.zzbza;
import q4.e;
import q4.f;
import q4.i;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public class f {

    /* renamed from: a  reason: collision with root package name */
    private final y4 f20918a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f20919b;

    /* renamed from: c  reason: collision with root package name */
    private final n0 f20920c;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final Context f20921a;

        /* renamed from: b  reason: collision with root package name */
        private final q0 f20922b;

        public a(Context context, String str) {
            q0 c10 = x.a().c(context, str, new zzbnc());
            this.f20921a = (Context) q.l(context, "context cannot be null");
            this.f20922b = c10;
        }

        public f a() {
            try {
                return new f(this.f20921a, this.f20922b.zze(), y4.f14626a);
            } catch (RemoteException e10) {
                zzbza.zzh("Failed to build AdLoader.", e10);
                return new f(this.f20921a, new x3().A1(), y4.f14626a);
            }
        }

        @Deprecated
        public a b(String str, f.c cVar, f.b bVar) {
            zzbgc zzbgc = new zzbgc(cVar, bVar);
            try {
                this.f20922b.zzh(str, zzbgc.zze(), zzbgc.zzd());
            } catch (RemoteException e10) {
                zzbza.zzk("Failed to add custom template ad listener", e10);
            }
            return this;
        }

        public a c(b.c cVar) {
            try {
                this.f20922b.zzk(new zzbqr(cVar));
            } catch (RemoteException e10) {
                zzbza.zzk("Failed to add google native ad listener", e10);
            }
            return this;
        }

        @Deprecated
        public a d(i.a aVar) {
            try {
                this.f20922b.zzk(new zzbgf(aVar));
            } catch (RemoteException e10) {
                zzbza.zzk("Failed to add google native ad listener", e10);
            }
            return this;
        }

        public a e(d dVar) {
            try {
                this.f20922b.zzl(new p4(dVar));
            } catch (RemoteException e10) {
                zzbza.zzk("Failed to set AdListener.", e10);
            }
            return this;
        }

        public a f(c cVar) {
            try {
                this.f20922b.zzo(new zzbdl(4, cVar.e(), -1, cVar.d(), cVar.a(), cVar.c() != null ? new n4(cVar.c()) : null, cVar.h(), cVar.b(), cVar.f(), cVar.g()));
            } catch (RemoteException e10) {
                zzbza.zzk("Failed to specify native ad options", e10);
            }
            return this;
        }

        @Deprecated
        public a g(e eVar) {
            try {
                this.f20922b.zzo(new zzbdl(eVar));
            } catch (RemoteException e10) {
                zzbza.zzk("Failed to specify native ad options", e10);
            }
            return this;
        }
    }

    f(Context context, n0 n0Var, y4 y4Var) {
        this.f20919b = context;
        this.f20920c = n0Var;
        this.f20918a = y4Var;
    }

    private final void d(z2 z2Var) {
        zzbar.zzc(this.f20919b);
        if (((Boolean) zzbci.zzc.zze()).booleanValue()) {
            if (((Boolean) a0.c().zzb(zzbar.zzjw)).booleanValue()) {
                zzbyp.zzb.execute(new c0(this, z2Var));
                return;
            }
        }
        try {
            this.f20920c.zzg(this.f20918a.a(this.f20919b, z2Var));
        } catch (RemoteException e10) {
            zzbza.zzh("Failed to load ad.", e10);
        }
    }

    public void a(g gVar) {
        d(gVar.f20924a);
    }

    public void b(o4.a aVar) {
        d(aVar.f20924a);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void c(z2 z2Var) {
        try {
            this.f20920c.zzg(this.f20918a.a(this.f20919b, z2Var));
        } catch (RemoteException e10) {
            zzbza.zzh("Failed to load ad.", e10);
        }
    }
}
