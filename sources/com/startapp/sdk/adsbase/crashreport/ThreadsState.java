package com.startapp.sdk.adsbase.crashreport;

import android.os.Looper;
import java.io.Serializable;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* compiled from: Sta */
public class ThreadsState implements Serializable {
    private static final long serialVersionUID = -4777916407910409315L;

    /* renamed from: a  reason: collision with root package name */
    public final transient String f16987a;

    /* renamed from: b  reason: collision with root package name */
    public final transient boolean f16988b;

    /* renamed from: c  reason: collision with root package name */
    public final transient boolean f16989c;

    /* renamed from: d  reason: collision with root package name */
    public final transient Set<String> f16990d;
    private final long delay;
    private final String handlerDescription;
    private Map<String, ShrunkStackTraceElement[]> threadsStackTraces;

    /* compiled from: Sta */
    public static class MainThreadComparator implements Comparator<String>, Serializable {

        /* renamed from: a  reason: collision with root package name */
        public final transient String f16991a;

        private MainThreadComparator() {
            this.f16991a = Looper.getMainLooper().getThread().getName();
        }

        public int compare(Object obj, Object obj2) {
            String str = (String) obj;
            String str2 = (String) obj2;
            if (str.startsWith(this.f16991a)) {
                return -1;
            }
            if (str2.startsWith(this.f16991a)) {
                return 1;
            }
            return str.compareTo(str2);
        }
    }

    /* compiled from: Sta */
    public static class ShrunkStackTraceElement implements Serializable {
        private static final long serialVersionUID = -7615438011343681512L;
        private final long skipBeforeAmount;
        private final StackTraceElement stackTraceElement;

        public ShrunkStackTraceElement(long j10, StackTraceElement stackTraceElement2) {
            this.skipBeforeAmount = j10;
            this.stackTraceElement = stackTraceElement2;
        }

        public long a() {
            return this.skipBeforeAmount;
        }

        public StackTraceElement b() {
            return this.stackTraceElement;
        }
    }

    /* compiled from: Sta */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public String f16992a;

        /* renamed from: b  reason: collision with root package name */
        public String f16993b;

        /* renamed from: c  reason: collision with root package name */
        public Set<String> f16994c;

        /* renamed from: d  reason: collision with root package name */
        public long f16995d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f16996e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f16997f;
    }

    public ThreadsState(b bVar) {
        this.f16987a = bVar.f16992a;
        this.f16988b = bVar.f16996e;
        this.f16989c = bVar.f16997f;
        this.delay = bVar.f16995d;
        this.handlerDescription = bVar.f16993b;
        this.f16990d = bVar.f16994c;
        a();
    }

    public final void a() {
        Thread thread = Looper.getMainLooper().getThread();
        String a10 = a(thread);
        TreeMap treeMap = new TreeMap(new MainThreadComparator());
        boolean z10 = false;
        for (Map.Entry next : Thread.getAllStackTraces().entrySet()) {
            Thread thread2 = (Thread) next.getKey();
            StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) next.getValue();
            if (stackTraceElementArr != null && stackTraceElementArr.length > 0) {
                ShrunkStackTraceElement[] b10 = b(stackTraceElementArr);
                if (b10 != null && b10.length > 0) {
                    Thread.State state = thread2.getState();
                    if (thread2 == thread) {
                        if (!a(stackTraceElementArr)) {
                            z10 = true;
                            treeMap.put(a10, b10);
                        } else {
                            return;
                        }
                    } else if (!this.f16989c || state == Thread.State.BLOCKED || state == Thread.State.WAITING) {
                        treeMap.put(a(thread2), b10);
                    }
                } else if (thread2 == thread) {
                    return;
                }
            } else if (thread2 == thread) {
                return;
            }
        }
        if (!z10) {
            StackTraceElement[] stackTrace = thread.getStackTrace();
            ShrunkStackTraceElement[] b11 = b(stackTrace);
            if (b11 != null && b11.length > 0 && !a(stackTrace)) {
                treeMap.put(a10, b11);
            } else {
                return;
            }
        }
        this.threadsStackTraces = treeMap;
    }

    public long b() {
        return this.delay;
    }

    public String c() {
        return this.handlerDescription;
    }

    public Map<String, ShrunkStackTraceElement[]> d() {
        return this.threadsStackTraces;
    }

    public final ShrunkStackTraceElement[] b(StackTraceElement[] stackTraceElementArr) {
        ShrunkStackTraceElement[] shrunkStackTraceElementArr;
        String className;
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        StackTraceElement stackTraceElement = null;
        long j10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        while (i10 < stackTraceElementArr2.length) {
            StackTraceElement stackTraceElement2 = stackTraceElementArr2[i10];
            if (stackTraceElement2 != null && (className = stackTraceElement2.getClassName()) != null) {
                boolean z12 = i10 < 3;
                String str = this.f16987a;
                boolean z13 = str == null || className.startsWith(str);
                if (z13) {
                    z10 = true;
                }
                if (!this.f16988b || z13 || z12 || z11) {
                    if (stackTraceElement != null) {
                        arrayList.add(new ShrunkStackTraceElement(j10, stackTraceElement));
                        stackTraceElement = null;
                        j10 = 0;
                    }
                    arrayList.add(new ShrunkStackTraceElement(0, stackTraceElement2));
                } else {
                    if (stackTraceElement != null) {
                        j10++;
                    }
                    stackTraceElement = stackTraceElement2;
                }
                z11 = z13;
            }
            i10++;
        }
        if (stackTraceElement != null) {
            shrunkStackTraceElementArr = null;
            arrayList.add(new ShrunkStackTraceElement(j10 + 1, (StackTraceElement) null));
        } else {
            shrunkStackTraceElementArr = null;
        }
        return z10 ? (ShrunkStackTraceElement[]) arrayList.toArray(new ShrunkStackTraceElement[0]) : shrunkStackTraceElementArr;
    }

    public final boolean a(StackTraceElement[] stackTraceElementArr) {
        if (this.f16990d == null) {
            return false;
        }
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            String className = stackTraceElement.getClassName();
            String methodName = stackTraceElement.getMethodName();
            if (!(className == null || methodName == null)) {
                if (this.f16990d.contains(className + '.' + methodName)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String a(Thread thread) {
        return thread.getName() + " (state = " + thread.getState() + ")";
    }
}
