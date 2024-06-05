package a5;

import com.applovin.mediation.MaxReward;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private final String f423a;

    /* renamed from: b  reason: collision with root package name */
    private final String f424b;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
    public static final class a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public String f425a = MaxReward.DEFAULT_LABEL;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public String f426b = MaxReward.DEFAULT_LABEL;

        public e a() {
            return new e(this, (i) null);
        }

        public a b(String str) {
            this.f426b = str;
            return this;
        }

        public a c(String str) {
            this.f425a = str;
            return this;
        }
    }

    /* synthetic */ e(a aVar, i iVar) {
        this.f423a = aVar.f425a;
        this.f424b = aVar.f426b;
    }

    public String a() {
        return this.f424b;
    }

    public String b() {
        return this.f423a;
    }
}
