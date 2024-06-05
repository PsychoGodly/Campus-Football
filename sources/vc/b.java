package vc;

import android.content.Context;
import com.google.android.ump.ConsentRequestParameters;
import java.util.Objects;

/* compiled from: ConsentRequestParametersWrapper */
class b {

    /* renamed from: a  reason: collision with root package name */
    private final Boolean f39134a;

    /* renamed from: b  reason: collision with root package name */
    private final a f39135b;

    b(Boolean bool, a aVar) {
        this.f39134a = bool;
        this.f39135b = aVar;
    }

    /* access modifiers changed from: package-private */
    public ConsentRequestParameters a(Context context) {
        ConsentRequestParameters.Builder builder = new ConsentRequestParameters.Builder();
        Boolean bool = this.f39134a;
        if (bool != null) {
            builder.setTagForUnderAgeOfConsent(bool.booleanValue());
        }
        a aVar = this.f39135b;
        if (aVar != null) {
            builder.setConsentDebugSettings(aVar.a(context));
        }
        return builder.build();
    }

    /* access modifiers changed from: package-private */
    public a b() {
        return this.f39135b;
    }

    /* access modifiers changed from: package-private */
    public Boolean c() {
        return this.f39134a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (!Objects.equals(this.f39134a, bVar.c()) || !Objects.equals(this.f39135b, bVar.b())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.f39134a, this.f39135b});
    }
}
