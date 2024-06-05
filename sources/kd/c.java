package kd;

import dd.c;
import java.util.logging.Logger;
import r6.u;

/* compiled from: ClientCalls */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static final Logger f35998a = Logger.getLogger(c.class.getName());

    /* renamed from: b  reason: collision with root package name */
    static boolean f35999b = (!u.a(System.getenv("GRPC_CLIENT_CALL_REJECT_RUNNABLE")) && Boolean.parseBoolean(System.getenv("GRPC_CLIENT_CALL_REJECT_RUNNABLE")));

    /* renamed from: c  reason: collision with root package name */
    static final c.C0363c<a> f36000c = c.C0363c.b("internal-stub-type");

    /* compiled from: ClientCalls */
    enum a {
        BLOCKING,
        FUTURE,
        ASYNC
    }

    private c() {
    }
}
