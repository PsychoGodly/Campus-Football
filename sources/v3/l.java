package v3;

import android.net.Uri;
import j4.g0;
import java.io.IOException;
import p3.e0;
import u3.g;

/* compiled from: HlsPlaylistTracker */
public interface l {

    /* compiled from: HlsPlaylistTracker */
    public interface a {
        l a(g gVar, g0 g0Var, k kVar);
    }

    /* compiled from: HlsPlaylistTracker */
    public interface b {
        void a();

        boolean e(Uri uri, g0.c cVar, boolean z10);
    }

    /* compiled from: HlsPlaylistTracker */
    public static final class c extends IOException {

        /* renamed from: a  reason: collision with root package name */
        public final Uri f23311a;

        public c(Uri uri) {
            this.f23311a = uri;
        }
    }

    /* compiled from: HlsPlaylistTracker */
    public static final class d extends IOException {

        /* renamed from: a  reason: collision with root package name */
        public final Uri f23312a;

        public d(Uri uri) {
            this.f23312a = uri;
        }
    }

    /* compiled from: HlsPlaylistTracker */
    public interface e {
        void e(g gVar);
    }

    void a(Uri uri, e0.a aVar, e eVar);

    boolean b(Uri uri);

    void c(b bVar);

    void d(Uri uri) throws IOException;

    void e(b bVar);

    long f();

    boolean g();

    h h();

    boolean i(Uri uri, long j10);

    void j() throws IOException;

    void m(Uri uri);

    g n(Uri uri, boolean z10);

    void stop();
}
