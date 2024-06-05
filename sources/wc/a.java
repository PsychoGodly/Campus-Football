package wc;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Messages */
public class a {

    /* renamed from: wc.a$a  reason: collision with other inner class name */
    /* compiled from: Messages */
    public static class C0457a extends RuntimeException {

        /* renamed from: a  reason: collision with root package name */
        public final String f39194a;

        /* renamed from: b  reason: collision with root package name */
        public final Object f39195b;
    }

    /* compiled from: Messages */
    public interface b {
        List<String> a();

        String b();

        String c();

        String d();

        String e();

        String f();

        List<String> g(c cVar);
    }

    /* compiled from: Messages */
    public enum c {
        ROOT(0),
        MUSIC(1),
        PODCASTS(2),
        RINGTONES(3),
        ALARMS(4),
        NOTIFICATIONS(5),
        PICTURES(6),
        MOVIES(7),
        DOWNLOADS(8),
        DCIM(9),
        DOCUMENTS(10);
        

        /* renamed from: a  reason: collision with root package name */
        final int f39208a;

        private c(int i10) {
            this.f39208a = i10;
        }
    }

    protected static ArrayList<Object> a(Throwable th) {
        ArrayList<Object> arrayList = new ArrayList<>(3);
        if (th instanceof C0457a) {
            C0457a aVar = (C0457a) th;
            arrayList.add(aVar.f39194a);
            arrayList.add(aVar.getMessage());
            arrayList.add(aVar.f39195b);
        } else {
            arrayList.add(th.toString());
            arrayList.add(th.getClass().getSimpleName());
            arrayList.add("Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        }
        return arrayList;
    }
}
