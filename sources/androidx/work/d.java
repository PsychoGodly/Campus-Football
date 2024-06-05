package androidx.work;

import android.net.Uri;
import java.util.HashSet;
import java.util.Set;

/* compiled from: ContentUriTriggers */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final Set<a> f5162a = new HashSet();

    /* compiled from: ContentUriTriggers */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Uri f5163a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f5164b;

        a(Uri uri, boolean z10) {
            this.f5163a = uri;
            this.f5164b = z10;
        }

        public Uri a() {
            return this.f5163a;
        }

        public boolean b() {
            return this.f5164b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f5164b != aVar.f5164b || !this.f5163a.equals(aVar.f5163a)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (this.f5163a.hashCode() * 31) + (this.f5164b ? 1 : 0);
        }
    }

    public void a(Uri uri, boolean z10) {
        this.f5162a.add(new a(uri, z10));
    }

    public Set<a> b() {
        return this.f5162a;
    }

    public int c() {
        return this.f5162a.size();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        return this.f5162a.equals(((d) obj).f5162a);
    }

    public int hashCode() {
        return this.f5162a.hashCode();
    }
}
