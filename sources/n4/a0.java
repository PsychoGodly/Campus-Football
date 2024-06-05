package n4;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.m4;
import com.google.android.gms.ads.internal.client.s2;
import com.google.android.gms.internal.ads.zzbza;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class a0 {

    /* renamed from: a  reason: collision with root package name */
    private final Object f20897a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private s2 f20898b;

    /* renamed from: c  reason: collision with root package name */
    private a f20899c;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
    public static abstract class a {
        public void onVideoEnd() {
        }

        public void onVideoMute(boolean z10) {
        }

        public void onVideoPause() {
        }

        public void onVideoPlay() {
        }

        public void onVideoStart() {
        }
    }

    public void a(a aVar) {
        m4 m4Var;
        synchronized (this.f20897a) {
            this.f20899c = aVar;
            s2 s2Var = this.f20898b;
            if (s2Var != null) {
                if (aVar == null) {
                    m4Var = null;
                } else {
                    try {
                        m4Var = new m4(aVar);
                    } catch (RemoteException e10) {
                        zzbza.zzh("Unable to call setVideoLifecycleCallbacks on video controller.", e10);
                        return;
                    }
                }
                s2Var.zzm(m4Var);
            }
        }
    }

    public final s2 b() {
        s2 s2Var;
        synchronized (this.f20897a) {
            s2Var = this.f20898b;
        }
        return s2Var;
    }

    public final void c(s2 s2Var) {
        synchronized (this.f20897a) {
            this.f20898b = s2Var;
            a aVar = this.f20899c;
            if (aVar != null) {
                a(aVar);
            }
        }
    }
}
