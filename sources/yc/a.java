package yc;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: Messages */
public class a {

    /* renamed from: yc.a$a  reason: collision with other inner class name */
    /* compiled from: Messages */
    public static class C0464a extends RuntimeException {

        /* renamed from: a  reason: collision with root package name */
        public final String f39417a;

        /* renamed from: b  reason: collision with root package name */
        public final Object f39418b;
    }

    /* compiled from: Messages */
    public interface b {
        Map<String, Object> a(String str, List<String> list);

        Boolean b(String str, List<String> list);

        Boolean c(String str, List<String> list);

        Boolean d(String str, Long l10);

        Boolean e(String str, String str2);

        Boolean f(String str, Boolean bool);

        Boolean g(String str, Double d10);

        Boolean remove(String str);
    }

    protected static ArrayList<Object> a(Throwable th) {
        ArrayList<Object> arrayList = new ArrayList<>(3);
        if (th instanceof C0464a) {
            C0464a aVar = (C0464a) th;
            arrayList.add(aVar.f39417a);
            arrayList.add(aVar.getMessage());
            arrayList.add(aVar.f39418b);
        } else {
            arrayList.add(th.toString());
            arrayList.add(th.getClass().getSimpleName());
            arrayList.add("Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        }
        return arrayList;
    }
}
