package androidx.core.app;

import android.app.AppOpsManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.util.Log;
import d.a;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: NotificationManagerCompat */
public final class o {

    /* renamed from: c  reason: collision with root package name */
    private static final Object f2794c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private static String f2795d;

    /* renamed from: e  reason: collision with root package name */
    private static Set<String> f2796e = new HashSet();

    /* renamed from: f  reason: collision with root package name */
    private static final Object f2797f = new Object();

    /* renamed from: g  reason: collision with root package name */
    private static f f2798g;

    /* renamed from: a  reason: collision with root package name */
    private final Context f2799a;

    /* renamed from: b  reason: collision with root package name */
    private final NotificationManager f2800b;

    /* compiled from: NotificationManagerCompat */
    static class a {
        static boolean a(NotificationManager notificationManager) {
            return notificationManager.areNotificationsEnabled();
        }

        static int b(NotificationManager notificationManager) {
            return notificationManager.getImportance();
        }
    }

    /* compiled from: NotificationManagerCompat */
    static class b {
        static void a(NotificationManager notificationManager, NotificationChannel notificationChannel) {
            notificationManager.createNotificationChannel(notificationChannel);
        }

        static void b(NotificationManager notificationManager, NotificationChannelGroup notificationChannelGroup) {
            notificationManager.createNotificationChannelGroup(notificationChannelGroup);
        }

        static void c(NotificationManager notificationManager, List<NotificationChannelGroup> list) {
            notificationManager.createNotificationChannelGroups(list);
        }

        static void d(NotificationManager notificationManager, List<NotificationChannel> list) {
            notificationManager.createNotificationChannels(list);
        }

        static void e(NotificationManager notificationManager, String str) {
            notificationManager.deleteNotificationChannel(str);
        }

        static void f(NotificationManager notificationManager, String str) {
            notificationManager.deleteNotificationChannelGroup(str);
        }

        static String g(NotificationChannel notificationChannel) {
            return notificationChannel.getId();
        }

        static String h(NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.getId();
        }

        static NotificationChannel i(NotificationManager notificationManager, String str) {
            return notificationManager.getNotificationChannel(str);
        }

        static List<NotificationChannelGroup> j(NotificationManager notificationManager) {
            return notificationManager.getNotificationChannelGroups();
        }

        static List<NotificationChannel> k(NotificationManager notificationManager) {
            return notificationManager.getNotificationChannels();
        }
    }

    /* compiled from: NotificationManagerCompat */
    private static class c implements g {

        /* renamed from: a  reason: collision with root package name */
        final String f2801a;

        /* renamed from: b  reason: collision with root package name */
        final int f2802b;

        /* renamed from: c  reason: collision with root package name */
        final String f2803c;

        /* renamed from: d  reason: collision with root package name */
        final boolean f2804d = false;

        c(String str, int i10, String str2) {
            this.f2801a = str;
            this.f2802b = i10;
            this.f2803c = str2;
        }

        public void a(d.a aVar) throws RemoteException {
            if (this.f2804d) {
                aVar.U(this.f2801a);
            } else {
                aVar.L0(this.f2801a, this.f2802b, this.f2803c);
            }
        }

        public String toString() {
            return "CancelTask[" + "packageName:" + this.f2801a + ", id:" + this.f2802b + ", tag:" + this.f2803c + ", all:" + this.f2804d + "]";
        }
    }

    /* compiled from: NotificationManagerCompat */
    private static class d implements g {

        /* renamed from: a  reason: collision with root package name */
        final String f2805a;

        /* renamed from: b  reason: collision with root package name */
        final int f2806b;

        /* renamed from: c  reason: collision with root package name */
        final String f2807c;

        /* renamed from: d  reason: collision with root package name */
        final Notification f2808d;

        d(String str, int i10, String str2, Notification notification) {
            this.f2805a = str;
            this.f2806b = i10;
            this.f2807c = str2;
            this.f2808d = notification;
        }

        public void a(d.a aVar) throws RemoteException {
            aVar.o1(this.f2805a, this.f2806b, this.f2807c, this.f2808d);
        }

        public String toString() {
            return "NotifyTask[" + "packageName:" + this.f2805a + ", id:" + this.f2806b + ", tag:" + this.f2807c + "]";
        }
    }

    /* compiled from: NotificationManagerCompat */
    private static class e {

        /* renamed from: a  reason: collision with root package name */
        final ComponentName f2809a;

        /* renamed from: b  reason: collision with root package name */
        final IBinder f2810b;

        e(ComponentName componentName, IBinder iBinder) {
            this.f2809a = componentName;
            this.f2810b = iBinder;
        }
    }

    /* compiled from: NotificationManagerCompat */
    private static class f implements Handler.Callback, ServiceConnection {

        /* renamed from: a  reason: collision with root package name */
        private final Context f2811a;

        /* renamed from: b  reason: collision with root package name */
        private final HandlerThread f2812b;

        /* renamed from: c  reason: collision with root package name */
        private final Handler f2813c;

        /* renamed from: d  reason: collision with root package name */
        private final Map<ComponentName, a> f2814d = new HashMap();

        /* renamed from: f  reason: collision with root package name */
        private Set<String> f2815f = new HashSet();

        /* compiled from: NotificationManagerCompat */
        private static class a {

            /* renamed from: a  reason: collision with root package name */
            final ComponentName f2816a;

            /* renamed from: b  reason: collision with root package name */
            boolean f2817b = false;

            /* renamed from: c  reason: collision with root package name */
            d.a f2818c;

            /* renamed from: d  reason: collision with root package name */
            ArrayDeque<g> f2819d = new ArrayDeque<>();

            /* renamed from: e  reason: collision with root package name */
            int f2820e = 0;

            a(ComponentName componentName) {
                this.f2816a = componentName;
            }
        }

        f(Context context) {
            this.f2811a = context;
            HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
            this.f2812b = handlerThread;
            handlerThread.start();
            this.f2813c = new Handler(handlerThread.getLooper(), this);
        }

        private boolean a(a aVar) {
            if (aVar.f2817b) {
                return true;
            }
            boolean bindService = this.f2811a.bindService(new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(aVar.f2816a), this, 33);
            aVar.f2817b = bindService;
            if (bindService) {
                aVar.f2820e = 0;
            } else {
                Log.w("NotifManCompat", "Unable to bind to listener " + aVar.f2816a);
                this.f2811a.unbindService(this);
            }
            return aVar.f2817b;
        }

        private void b(a aVar) {
            if (aVar.f2817b) {
                this.f2811a.unbindService(this);
                aVar.f2817b = false;
            }
            aVar.f2818c = null;
        }

        private void c(g gVar) {
            j();
            for (a next : this.f2814d.values()) {
                next.f2819d.add(gVar);
                g(next);
            }
        }

        private void d(ComponentName componentName) {
            a aVar = this.f2814d.get(componentName);
            if (aVar != null) {
                g(aVar);
            }
        }

        private void e(ComponentName componentName, IBinder iBinder) {
            a aVar = this.f2814d.get(componentName);
            if (aVar != null) {
                aVar.f2818c = a.C0173a.M0(iBinder);
                aVar.f2820e = 0;
                g(aVar);
            }
        }

        private void f(ComponentName componentName) {
            a aVar = this.f2814d.get(componentName);
            if (aVar != null) {
                b(aVar);
            }
        }

        private void g(a aVar) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Processing component " + aVar.f2816a + ", " + aVar.f2819d.size() + " queued tasks");
            }
            if (!aVar.f2819d.isEmpty()) {
                if (!a(aVar) || aVar.f2818c == null) {
                    i(aVar);
                    return;
                }
                while (true) {
                    g peek = aVar.f2819d.peek();
                    if (peek == null) {
                        break;
                    }
                    try {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Sending task " + peek);
                        }
                        peek.a(aVar.f2818c);
                        aVar.f2819d.remove();
                    } catch (DeadObjectException unused) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Remote service has died: " + aVar.f2816a);
                        }
                    } catch (RemoteException e10) {
                        Log.w("NotifManCompat", "RemoteException communicating with " + aVar.f2816a, e10);
                    }
                }
                if (!aVar.f2819d.isEmpty()) {
                    i(aVar);
                }
            }
        }

        private void i(a aVar) {
            if (!this.f2813c.hasMessages(3, aVar.f2816a)) {
                int i10 = aVar.f2820e + 1;
                aVar.f2820e = i10;
                if (i10 > 6) {
                    Log.w("NotifManCompat", "Giving up on delivering " + aVar.f2819d.size() + " tasks to " + aVar.f2816a + " after " + aVar.f2820e + " retries");
                    aVar.f2819d.clear();
                    return;
                }
                int i11 = (1 << (i10 - 1)) * 1000;
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Scheduling retry for " + i11 + " ms");
                }
                this.f2813c.sendMessageDelayed(this.f2813c.obtainMessage(3, aVar.f2816a), (long) i11);
            }
        }

        private void j() {
            Set<String> f10 = o.f(this.f2811a);
            if (!f10.equals(this.f2815f)) {
                this.f2815f = f10;
                List<ResolveInfo> queryIntentServices = this.f2811a.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
                HashSet<ComponentName> hashSet = new HashSet<>();
                for (ResolveInfo next : queryIntentServices) {
                    if (f10.contains(next.serviceInfo.packageName)) {
                        ServiceInfo serviceInfo = next.serviceInfo;
                        ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                        if (next.serviceInfo.permission != null) {
                            Log.w("NotifManCompat", "Permission present on component " + componentName + ", not adding listener record.");
                        } else {
                            hashSet.add(componentName);
                        }
                    }
                }
                for (ComponentName componentName2 : hashSet) {
                    if (!this.f2814d.containsKey(componentName2)) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Adding listener record for " + componentName2);
                        }
                        this.f2814d.put(componentName2, new a(componentName2));
                    }
                }
                Iterator<Map.Entry<ComponentName, a>> it = this.f2814d.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry next2 = it.next();
                    if (!hashSet.contains(next2.getKey())) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Removing listener record for " + next2.getKey());
                        }
                        b((a) next2.getValue());
                        it.remove();
                    }
                }
            }
        }

        public void h(g gVar) {
            this.f2813c.obtainMessage(0, gVar).sendToTarget();
        }

        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 0) {
                c((g) message.obj);
                return true;
            } else if (i10 == 1) {
                e eVar = (e) message.obj;
                e(eVar.f2809a, eVar.f2810b);
                return true;
            } else if (i10 == 2) {
                f((ComponentName) message.obj);
                return true;
            } else if (i10 != 3) {
                return false;
            } else {
                d((ComponentName) message.obj);
                return true;
            }
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Connected to service " + componentName);
            }
            this.f2813c.obtainMessage(1, new e(componentName, iBinder)).sendToTarget();
        }

        public void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Disconnected from service " + componentName);
            }
            this.f2813c.obtainMessage(2, componentName).sendToTarget();
        }
    }

    /* compiled from: NotificationManagerCompat */
    private interface g {
        void a(d.a aVar) throws RemoteException;
    }

    private o(Context context) {
        this.f2799a = context;
        this.f2800b = (NotificationManager) context.getSystemService("notification");
    }

    public static o e(Context context) {
        return new o(context);
    }

    public static Set<String> f(Context context) {
        Set<String> set;
        String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        synchronized (f2794c) {
            if (string != null) {
                if (!string.equals(f2795d)) {
                    String[] split = string.split(":", -1);
                    HashSet hashSet = new HashSet(split.length);
                    for (String unflattenFromString : split) {
                        ComponentName unflattenFromString2 = ComponentName.unflattenFromString(unflattenFromString);
                        if (unflattenFromString2 != null) {
                            hashSet.add(unflattenFromString2.getPackageName());
                        }
                    }
                    f2796e = hashSet;
                    f2795d = string;
                }
            }
            set = f2796e;
        }
        return set;
    }

    private void i(g gVar) {
        synchronized (f2797f) {
            if (f2798g == null) {
                f2798g = new f(this.f2799a.getApplicationContext());
            }
            f2798g.h(gVar);
        }
    }

    private static boolean j(Notification notification) {
        Bundle a10 = l.a(notification);
        return a10 != null && a10.getBoolean("android.support.useSideChannel");
    }

    public boolean a() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 24) {
            return a.a(this.f2800b);
        }
        if (i10 < 19) {
            return true;
        }
        AppOpsManager appOpsManager = (AppOpsManager) this.f2799a.getSystemService("appops");
        ApplicationInfo applicationInfo = this.f2799a.getApplicationInfo();
        String packageName = this.f2799a.getApplicationContext().getPackageName();
        int i11 = applicationInfo.uid;
        try {
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            Class cls2 = Integer.TYPE;
            if (((Integer) cls.getMethod("checkOpNoThrow", new Class[]{cls2, cls2, String.class}).invoke(appOpsManager, new Object[]{Integer.valueOf(((Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class)).intValue()), Integer.valueOf(i11), packageName})).intValue() == 0) {
                return true;
            }
            return false;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
            return true;
        }
    }

    public void b(int i10) {
        c((String) null, i10);
    }

    public void c(String str, int i10) {
        this.f2800b.cancel(str, i10);
        if (Build.VERSION.SDK_INT <= 19) {
            i(new c(this.f2799a.getPackageName(), i10, str));
        }
    }

    public void d(NotificationChannel notificationChannel) {
        if (Build.VERSION.SDK_INT >= 26) {
            b.a(this.f2800b, notificationChannel);
        }
    }

    public void g(int i10, Notification notification) {
        h((String) null, i10, notification);
    }

    public void h(String str, int i10, Notification notification) {
        if (j(notification)) {
            i(new d(this.f2799a.getPackageName(), i10, str, notification));
            this.f2800b.cancel(str, i10);
            return;
        }
        this.f2800b.notify(str, i10, notification);
    }
}
