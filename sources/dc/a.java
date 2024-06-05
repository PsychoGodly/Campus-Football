package dc;

import android.content.Context;
import io.flutter.embedding.engine.d;
import io.flutter.plugin.platform.h;
import io.flutter.view.f;
import lc.c;

/* compiled from: FlutterPlugin */
public interface a {

    /* renamed from: dc.a$a  reason: collision with other inner class name */
    /* compiled from: FlutterPlugin */
    public interface C0360a {
        String a(String str);
    }

    /* compiled from: FlutterPlugin */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private final Context f32100a;

        /* renamed from: b  reason: collision with root package name */
        private final io.flutter.embedding.engine.a f32101b;

        /* renamed from: c  reason: collision with root package name */
        private final c f32102c;

        /* renamed from: d  reason: collision with root package name */
        private final f f32103d;

        /* renamed from: e  reason: collision with root package name */
        private final h f32104e;

        /* renamed from: f  reason: collision with root package name */
        private final C0360a f32105f;

        /* renamed from: g  reason: collision with root package name */
        private final d f32106g;

        public b(Context context, io.flutter.embedding.engine.a aVar, c cVar, f fVar, h hVar, C0360a aVar2, d dVar) {
            this.f32100a = context;
            this.f32101b = aVar;
            this.f32102c = cVar;
            this.f32103d = fVar;
            this.f32104e = hVar;
            this.f32105f = aVar2;
            this.f32106g = dVar;
        }

        public Context a() {
            return this.f32100a;
        }

        public c b() {
            return this.f32102c;
        }

        public C0360a c() {
            return this.f32105f;
        }

        @Deprecated
        public io.flutter.embedding.engine.a d() {
            return this.f32101b;
        }

        public h e() {
            return this.f32104e;
        }

        public f f() {
            return this.f32103d;
        }
    }

    void onAttachedToEngine(b bVar);

    void onDetachedFromEngine(b bVar);
}
