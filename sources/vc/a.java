package vc;

import android.content.Context;
import com.google.android.ump.ConsentDebugSettings;
import java.util.List;
import java.util.Objects;

/* compiled from: ConsentDebugSettingsWrapper */
class a {

    /* renamed from: a  reason: collision with root package name */
    private final Integer f39132a;

    /* renamed from: b  reason: collision with root package name */
    private final List<String> f39133b;

    a(Integer num, List<String> list) {
        this.f39132a = num;
        this.f39133b = list;
    }

    /* access modifiers changed from: package-private */
    public ConsentDebugSettings a(Context context) {
        ConsentDebugSettings.Builder builder = new ConsentDebugSettings.Builder(context);
        Integer num = this.f39132a;
        if (num != null) {
            builder.setDebugGeography(num.intValue());
        }
        List<String> list = this.f39133b;
        if (list != null) {
            for (String addTestDeviceHashedId : list) {
                builder.addTestDeviceHashedId(addTestDeviceHashedId);
            }
        }
        return builder.build();
    }

    /* access modifiers changed from: package-private */
    public Integer b() {
        return this.f39132a;
    }

    /* access modifiers changed from: package-private */
    public List<String> c() {
        return this.f39133b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (!Objects.equals(this.f39132a, aVar.b()) || !Objects.equals(this.f39133b, aVar.c())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.f39132a, this.f39133b});
    }
}
