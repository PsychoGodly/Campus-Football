package o4;

import android.text.TextUtils;
import java.util.List;
import n4.g;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class a extends g {

    /* renamed from: o4.a$a  reason: collision with other inner class name */
    /* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
    public static final class C0218a extends g.a {
        public C0218a n(String str, String str2) {
            this.f20925a.x(str, str2);
            return this;
        }

        public C0218a o(String str, List<String> list) {
            if (list != null) {
                this.f20925a.x(str, TextUtils.join(",", list));
            }
            return this;
        }

        /* renamed from: p */
        public a c() {
            return new a(this, (f) null);
        }

        public C0218a q(String str) {
            this.f20925a.e(str);
            return this;
        }
    }

    /* synthetic */ a(C0218a aVar, f fVar) {
        super(aVar);
    }
}
