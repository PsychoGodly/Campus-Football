package n4;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.client.y2;
import com.google.android.gms.ads.internal.client.z2;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.internal.ads.zzbza;
import java.util.Date;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public class g {

    /* renamed from: a  reason: collision with root package name */
    protected final z2 f20924a;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        protected final y2 f20925a;

        public a() {
            y2 y2Var = new y2();
            this.f20925a = y2Var;
            y2Var.A("B3EEABB8EE11C2BE770B684D95219ECB");
        }

        public a a(String str) {
            this.f20925a.y(str);
            return this;
        }

        public a b(Class<Object> cls, Bundle bundle) {
            this.f20925a.z(cls, bundle);
            if (cls.equals(AdMobAdapter.class) && bundle.getBoolean("_emulatorLiveAds")) {
                this.f20925a.B("B3EEABB8EE11C2BE770B684D95219ECB");
            }
            return this;
        }

        public g c() {
            return new g(this);
        }

        public a d(String str) {
            this.f20925a.C(str);
            return this;
        }

        public a e(String str) {
            q.l(str, "Content URL must be non-null.");
            q.h(str, "Content URL must be non-empty.");
            int length = str.length();
            boolean z10 = false;
            Object[] objArr = {512, Integer.valueOf(str.length())};
            if (length <= 512) {
                z10 = true;
            }
            q.c(z10, "Content URL must not exceed %d in length.  Provided length was %d.", objArr);
            this.f20925a.E(str);
            return this;
        }

        public a f(int i10) {
            this.f20925a.b(i10);
            return this;
        }

        public a g(List<String> list) {
            if (list == null) {
                zzbza.zzj("neighboring content URLs list should not be null");
                return this;
            }
            this.f20925a.d(list);
            return this;
        }

        public a h(String str) {
            this.f20925a.f(str);
            return this;
        }

        @Deprecated
        public final a i(String str) {
            this.f20925a.A(str);
            return this;
        }

        @Deprecated
        public final a j(Date date) {
            this.f20925a.D(date);
            return this;
        }

        @Deprecated
        public final a k(int i10) {
            this.f20925a.a(i10);
            return this;
        }

        @Deprecated
        public final a l(boolean z10) {
            this.f20925a.c(z10);
            return this;
        }

        @Deprecated
        public final a m(boolean z10) {
            this.f20925a.g(z10);
            return this;
        }
    }

    protected g(a aVar) {
        this.f20924a = new z2(aVar.f20925a, (c5.a) null);
    }

    public final z2 a() {
        return this.f20924a;
    }
}
