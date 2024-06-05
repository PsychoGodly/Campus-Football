package d7;

/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class k1 extends g1 {

    /* renamed from: a  reason: collision with root package name */
    private final String f28569a;

    /* renamed from: b  reason: collision with root package name */
    private final String f28570b;

    /* renamed from: c  reason: collision with root package name */
    private final String f28571c;

    private k1(String str, String str2, String str3) {
        this.f28569a = str;
        this.f28570b = str2;
        this.f28571c = null;
    }

    public final String a() {
        return this.f28570b;
    }

    public final String b() {
        return this.f28571c;
    }

    public final String c() {
        return this.f28569a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g1) {
            g1 g1Var = (g1) obj;
            String str = this.f28569a;
            if (str != null ? str.equals(g1Var.c()) : g1Var.c() == null) {
                String str2 = this.f28570b;
                if (str2 != null ? str2.equals(g1Var.a()) : g1Var.a() == null) {
                    String str3 = this.f28571c;
                    return str3 != null ? str3.equals(g1Var.b()) : g1Var.b() == null;
                }
            }
        }
    }

    public final int hashCode() {
        String str = this.f28569a;
        int i10 = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f28570b;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f28571c;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        return hashCode2 ^ i10;
    }

    public final String toString() {
        String str = this.f28569a;
        String str2 = this.f28570b;
        String str3 = this.f28571c;
        return "AttestationResult{recaptchaV2Token=" + str + ", playIntegrityToken=" + str2 + ", recaptchaEnterpriseToken=" + str3 + "}";
    }
}
