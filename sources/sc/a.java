package sc;

import android.util.Log;
import com.google.firebase.firestore.z;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import qc.y;

/* compiled from: ExceptionConverter */
public class a {
    public static Map<String, String> a(Exception exc) {
        Throwable th;
        HashMap hashMap = new HashMap();
        if (exc == null) {
            return hashMap;
        }
        qc.a aVar = null;
        if (exc instanceof z) {
            aVar = new qc.a((z) exc, exc.getCause());
        } else if (exc.getCause() != null && (exc.getCause() instanceof z)) {
            z zVar = (z) exc.getCause();
            if (exc.getCause().getCause() != null) {
                th = exc.getCause().getCause();
            } else {
                th = exc.getCause();
            }
            aVar = new qc.a(zVar, th);
        }
        if (aVar != null) {
            hashMap.put("code", aVar.a());
            hashMap.put("message", aVar.getMessage());
        }
        if (hashMap.containsKey("code")) {
            String str = (String) hashMap.get("code");
            Objects.requireNonNull(str);
            if (str.equals("unknown")) {
                Log.e("FLTFirebaseFirestore", "An unknown error occurred", exc);
            }
        }
        return hashMap;
    }

    public static void b(y.v vVar, Exception exc) {
        vVar.a(new y.j("firebase_firestore", exc != null ? exc.getMessage() : null, a(exc)));
    }
}
