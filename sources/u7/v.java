package u7;

import com.google.protobuf.t1;
import p8.d0;
import p8.u;
import y6.q;

/* compiled from: ServerTimestamps */
public final class v {
    public static t1 a(d0 d0Var) {
        return d0Var.x0().k0("__local_write_time__").A0();
    }

    public static d0 b(d0 d0Var) {
        d0 j02 = d0Var.x0().j0("__previous_value__", (d0) null);
        return c(j02) ? b(j02) : j02;
    }

    public static boolean c(d0 d0Var) {
        d0 d0Var2 = null;
        if (d0Var != null) {
            d0Var2 = d0Var.x0().j0("__type__", (d0) null);
        }
        return d0Var2 != null && "server_timestamp".equals(d0Var2.z0());
    }

    public static d0 d(q qVar, d0 d0Var) {
        u.b H = u.o0().H("__type__", (d0) d0.C0().R("server_timestamp").build()).H("__local_write_time__", (d0) d0.C0().S(t1.k0().G(qVar.d()).F(qVar.c())).build());
        if (c(d0Var)) {
            d0Var = b(d0Var);
        }
        if (d0Var != null) {
            H.H("__previous_value__", d0Var);
        }
        return (d0) d0.C0().N(H).build();
    }
}
