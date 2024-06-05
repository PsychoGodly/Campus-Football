package io.grpc.internal;

import dd.c0;
import dd.f;
import java.io.Closeable;
import java.net.SocketAddress;
import java.util.concurrent.ScheduledExecutorService;
import r6.k;
import r6.o;

/* compiled from: ClientTransportFactory */
public interface t extends Closeable {

    /* compiled from: ClientTransportFactory */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private String f35382a = "unknown-authority";

        /* renamed from: b  reason: collision with root package name */
        private dd.a f35383b = dd.a.f32108c;

        /* renamed from: c  reason: collision with root package name */
        private String f35384c;

        /* renamed from: d  reason: collision with root package name */
        private c0 f35385d;

        public String a() {
            return this.f35382a;
        }

        public dd.a b() {
            return this.f35383b;
        }

        public c0 c() {
            return this.f35385d;
        }

        public String d() {
            return this.f35384c;
        }

        public a e(String str) {
            this.f35382a = (String) o.p(str, "authority");
            return this;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!this.f35382a.equals(aVar.f35382a) || !this.f35383b.equals(aVar.f35383b) || !k.a(this.f35384c, aVar.f35384c) || !k.a(this.f35385d, aVar.f35385d)) {
                return false;
            }
            return true;
        }

        public a f(dd.a aVar) {
            o.p(aVar, "eagAttributes");
            this.f35383b = aVar;
            return this;
        }

        public a g(c0 c0Var) {
            this.f35385d = c0Var;
            return this;
        }

        public a h(String str) {
            this.f35384c = str;
            return this;
        }

        public int hashCode() {
            return k.b(this.f35382a, this.f35383b, this.f35384c, this.f35385d);
        }
    }

    ScheduledExecutorService D0();

    v F0(SocketAddress socketAddress, a aVar, f fVar);

    void close();
}
