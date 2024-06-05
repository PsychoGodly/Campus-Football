package c2;

import android.content.Context;
import java.util.Objects;
import l2.a;

/* compiled from: AutoValue_CreationContext */
final class c extends h {

    /* renamed from: a  reason: collision with root package name */
    private final Context f5590a;

    /* renamed from: b  reason: collision with root package name */
    private final a f5591b;

    /* renamed from: c  reason: collision with root package name */
    private final a f5592c;

    /* renamed from: d  reason: collision with root package name */
    private final String f5593d;

    c(Context context, a aVar, a aVar2, String str) {
        Objects.requireNonNull(context, "Null applicationContext");
        this.f5590a = context;
        Objects.requireNonNull(aVar, "Null wallClock");
        this.f5591b = aVar;
        Objects.requireNonNull(aVar2, "Null monotonicClock");
        this.f5592c = aVar2;
        Objects.requireNonNull(str, "Null backendName");
        this.f5593d = str;
    }

    public Context b() {
        return this.f5590a;
    }

    public String c() {
        return this.f5593d;
    }

    public a d() {
        return this.f5592c;
    }

    public a e() {
        return this.f5591b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (!this.f5590a.equals(hVar.b()) || !this.f5591b.equals(hVar.e()) || !this.f5592c.equals(hVar.d()) || !this.f5593d.equals(hVar.c())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((this.f5590a.hashCode() ^ 1000003) * 1000003) ^ this.f5591b.hashCode()) * 1000003) ^ this.f5592c.hashCode()) * 1000003) ^ this.f5593d.hashCode();
    }

    public String toString() {
        return "CreationContext{applicationContext=" + this.f5590a + ", wallClock=" + this.f5591b + ", monotonicClock=" + this.f5592c + ", backendName=" + this.f5593d + "}";
    }
}
