package io.flutter.plugins.googlemobileads;

import a5.e;
import java.util.Objects;

/* compiled from: FlutterServerSideVerificationOptions */
class f0 {

    /* renamed from: a  reason: collision with root package name */
    private final String f33987a;

    /* renamed from: b  reason: collision with root package name */
    private final String f33988b;

    public f0(String str, String str2) {
        this.f33987a = str;
        this.f33988b = str2;
    }

    public e a() {
        e.a aVar = new e.a();
        String str = this.f33987a;
        if (str != null) {
            aVar.c(str);
        }
        String str2 = this.f33988b;
        if (str2 != null) {
            aVar.b(str2);
        }
        return aVar.a();
    }

    public String b() {
        return this.f33988b;
    }

    public String c() {
        return this.f33987a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        if (!Objects.equals(f0Var.f33987a, this.f33987a) || !Objects.equals(f0Var.f33988b, this.f33988b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.f33987a, this.f33988b});
    }
}
