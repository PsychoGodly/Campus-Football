package pc;

import com.google.firebase.auth.h;
import com.google.firebase.auth.j0;
import com.google.firebase.auth.k0;
import com.google.firebase.auth.l0;
import com.google.firebase.auth.q;
import com.google.firebase.auth.u;
import com.google.firebase.auth.x;
import com.google.firebase.auth.y;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import pc.a1;
import y6.c;
import y6.m;
import y6.o;

/* compiled from: FlutterFirebaseAuthPluginException */
public class v {
    static a1.g a() {
        return new a1.g("PROVIDER_ALREADY_LINKED", "User has already been linked to the given provider.", (Object) null);
    }

    static a1.g b() {
        return new a1.g("INVALID_CREDENTIAL", "The supplied auth credential is malformed, has expired or is not currently supported.", (Object) null);
    }

    static a1.g c() {
        return new a1.g("NO_SUCH_PROVIDER", "User was not linked to an account with the given provider.", (Object) null);
    }

    static a1.g d() {
        return new a1.g("NO_CURRENT_USER", "No user currently signed in.", (Object) null);
    }

    static a1.g e(Exception exc) {
        String str = "UNKNOWN";
        if (exc == null) {
            return new a1.g(str, (String) null, (Object) null);
        }
        String message = exc.getMessage();
        HashMap hashMap = new HashMap();
        if (exc instanceof u) {
            u uVar = (u) exc;
            HashMap hashMap2 = new HashMap();
            k0 b10 = uVar.b();
            List<j0> w10 = b10.w();
            l0 x10 = b10.x();
            String uuid = UUID.randomUUID().toString();
            w0.f37207b.put(uuid, x10);
            String uuid2 = UUID.randomUUID().toString();
            w0.f37208c.put(uuid2, b10);
            List<List<Object>> c10 = g3.c(w10);
            hashMap2.put("appName", uVar.b().v().l().q());
            hashMap2.put("multiFactorHints", c10);
            hashMap2.put("multiFactorSessionId", uuid);
            hashMap2.put("multiFactorResolverId", uuid2);
            return new a1.g(uVar.a(), uVar.getLocalizedMessage(), hashMap2);
        } else if (exc instanceof ExecutionException) {
            return c();
        } else {
            if ((exc instanceof m) || (exc.getCause() != null && (exc.getCause() instanceof m))) {
                return new a1.g("network-request-failed", "A network error (such as timeout, interrupted connection or unreachable host) has occurred.", (Object) null);
            }
            if ((exc instanceof c) || (exc.getCause() != null && (exc.getCause() instanceof c))) {
                return new a1.g("api-not-available", "The requested API is not available.", (Object) null);
            }
            if ((exc instanceof o) || (exc.getCause() != null && (exc.getCause() instanceof o))) {
                return new a1.g("too-many-requests", "We have blocked all requests from this device due to unusual activity. Try again later.", (Object) null);
            }
            if (exc.getMessage() != null && exc.getMessage().startsWith("Cannot create PhoneAuthCredential without either verificationProof")) {
                return new a1.g("invalid-verification-code", "The verification ID used to create the phone auth credential is invalid.", (Object) null);
            }
            if (message != null && message.contains("User has already been linked to the given provider.")) {
                return a();
            }
            if (exc instanceof q) {
                str = ((q) exc).a();
            }
            if (exc instanceof y) {
                message = ((y) exc).b();
            }
            if (exc instanceof x) {
                x xVar = (x) exc;
                String b11 = xVar.b();
                if (b11 != null) {
                    hashMap.put("email", b11);
                }
                h c11 = xVar.c();
                if (c11 != null) {
                    hashMap.put("authCredential", g3.g(c11));
                }
            }
            return new a1.g(str, message, hashMap);
        }
    }
}
