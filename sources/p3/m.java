package p3;

import android.content.Context;
import j4.l;
import j4.t;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p3.x;
import r6.v;
import s2.r;

/* compiled from: DefaultMediaSourceFactory */
public final class m implements x.a {

    /* renamed from: a  reason: collision with root package name */
    private final a f21550a;

    /* renamed from: b  reason: collision with root package name */
    private l.a f21551b;

    /* renamed from: c  reason: collision with root package name */
    private long f21552c;

    /* renamed from: d  reason: collision with root package name */
    private long f21553d;

    /* renamed from: e  reason: collision with root package name */
    private long f21554e;

    /* renamed from: f  reason: collision with root package name */
    private float f21555f;

    /* renamed from: g  reason: collision with root package name */
    private float f21556g;

    /* compiled from: DefaultMediaSourceFactory */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final r f21557a;

        /* renamed from: b  reason: collision with root package name */
        private final Map<Integer, v<x.a>> f21558b = new HashMap();

        /* renamed from: c  reason: collision with root package name */
        private final Set<Integer> f21559c = new HashSet();

        /* renamed from: d  reason: collision with root package name */
        private final Map<Integer, x.a> f21560d = new HashMap();

        /* renamed from: e  reason: collision with root package name */
        private l.a f21561e;

        public a(r rVar) {
            this.f21557a = rVar;
        }

        public void a(l.a aVar) {
            if (aVar != this.f21561e) {
                this.f21561e = aVar;
                this.f21558b.clear();
                this.f21560d.clear();
            }
        }
    }

    public m(Context context, r rVar) {
        this((l.a) new t.a(context), rVar);
    }

    public m(l.a aVar, r rVar) {
        this.f21551b = aVar;
        a aVar2 = new a(rVar);
        this.f21550a = aVar2;
        aVar2.a(aVar);
        this.f21552c = -9223372036854775807L;
        this.f21553d = -9223372036854775807L;
        this.f21554e = -9223372036854775807L;
        this.f21555f = -3.4028235E38f;
        this.f21556g = -3.4028235E38f;
    }
}
