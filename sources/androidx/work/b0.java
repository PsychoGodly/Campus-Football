package androidx.work;

import android.content.Context;

/* compiled from: WorkerFactory */
public abstract class b0 {

    /* renamed from: a  reason: collision with root package name */
    private static final String f5144a = p.f("WorkerFactory");

    /* compiled from: WorkerFactory */
    class a extends b0 {
        a() {
        }

        public ListenableWorker a(Context context, String str, WorkerParameters workerParameters) {
            return null;
        }
    }

    public static b0 c() {
        return new a();
    }

    public abstract ListenableWorker a(Context context, String str, WorkerParameters workerParameters);

    public final ListenableWorker b(Context context, String str, WorkerParameters workerParameters) {
        ListenableWorker a10 = a(context, str, workerParameters);
        if (a10 == null) {
            Class<? extends U> cls = null;
            try {
                cls = Class.forName(str).asSubclass(ListenableWorker.class);
            } catch (Throwable th) {
                p c10 = p.c();
                String str2 = f5144a;
                c10.b(str2, "Invalid class: " + str, th);
            }
            if (cls != null) {
                try {
                    a10 = (ListenableWorker) cls.getDeclaredConstructor(new Class[]{Context.class, WorkerParameters.class}).newInstance(new Object[]{context, workerParameters});
                } catch (Throwable th2) {
                    p c11 = p.c();
                    String str3 = f5144a;
                    c11.b(str3, "Could not instantiate " + str, th2);
                }
            }
        }
        if (a10 == null || !a10.isUsed()) {
            return a10;
        }
        throw new IllegalStateException(String.format("WorkerFactory (%s) returned an instance of a ListenableWorker (%s) which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.", new Object[]{getClass().getName(), str}));
    }
}
