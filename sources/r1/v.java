package r1;

import android.os.Build;
import androidx.work.q;
import androidx.work.t;
import androidx.work.y;

/* compiled from: WorkTypeConverters */
public class v {

    /* compiled from: WorkTypeConverters */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f21976a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f21977b;

        /* renamed from: c  reason: collision with root package name */
        static final /* synthetic */ int[] f21978c;

        /* renamed from: d  reason: collision with root package name */
        static final /* synthetic */ int[] f21979d;

        /* JADX WARNING: Can't wrap try/catch for region: R(31:0|(2:1|2)|3|(2:5|6)|7|9|10|(2:11|12)|13|(2:15|16)|17|(2:19|20)|21|23|24|25|27|28|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|(3:43|44|46)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(37:0|1|2|3|(2:5|6)|7|9|10|11|12|13|15|16|17|(2:19|20)|21|23|24|25|27|28|29|30|31|33|34|35|36|37|38|39|40|41|42|43|44|46) */
        /* JADX WARNING: Can't wrap try/catch for region: R(38:0|1|2|3|(2:5|6)|7|9|10|11|12|13|15|16|17|19|20|21|23|24|25|27|28|29|30|31|33|34|35|36|37|38|39|40|41|42|43|44|46) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x006a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x0085 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x008f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x0099 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00a3 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00ad */
        static {
            /*
                androidx.work.t[] r0 = androidx.work.t.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f21979d = r0
                r1 = 1
                androidx.work.t r2 = androidx.work.t.RUN_AS_NON_EXPEDITED_WORK_REQUEST     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f21979d     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.work.t r3 = androidx.work.t.DROP_WORK_REQUEST     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                androidx.work.q[] r2 = androidx.work.q.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f21978c = r2
                androidx.work.q r3 = androidx.work.q.NOT_REQUIRED     // Catch:{ NoSuchFieldError -> 0x002e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = f21978c     // Catch:{ NoSuchFieldError -> 0x0038 }
                androidx.work.q r3 = androidx.work.q.CONNECTED     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                r2 = 3
                int[] r3 = f21978c     // Catch:{ NoSuchFieldError -> 0x0043 }
                androidx.work.q r4 = androidx.work.q.UNMETERED     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                r3 = 4
                int[] r4 = f21978c     // Catch:{ NoSuchFieldError -> 0x004e }
                androidx.work.q r5 = androidx.work.q.NOT_ROAMING     // Catch:{ NoSuchFieldError -> 0x004e }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                r4 = 5
                int[] r5 = f21978c     // Catch:{ NoSuchFieldError -> 0x0059 }
                androidx.work.q r6 = androidx.work.q.METERED     // Catch:{ NoSuchFieldError -> 0x0059 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0059 }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x0059 }
            L_0x0059:
                androidx.work.a[] r5 = androidx.work.a.values()
                int r5 = r5.length
                int[] r5 = new int[r5]
                f21977b = r5
                androidx.work.a r6 = androidx.work.a.EXPONENTIAL     // Catch:{ NoSuchFieldError -> 0x006a }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x006a }
                r5[r6] = r1     // Catch:{ NoSuchFieldError -> 0x006a }
            L_0x006a:
                int[] r5 = f21977b     // Catch:{ NoSuchFieldError -> 0x0074 }
                androidx.work.a r6 = androidx.work.a.LINEAR     // Catch:{ NoSuchFieldError -> 0x0074 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0074 }
                r5[r6] = r0     // Catch:{ NoSuchFieldError -> 0x0074 }
            L_0x0074:
                androidx.work.y$a[] r5 = androidx.work.y.a.values()
                int r5 = r5.length
                int[] r5 = new int[r5]
                f21976a = r5
                androidx.work.y$a r6 = androidx.work.y.a.ENQUEUED     // Catch:{ NoSuchFieldError -> 0x0085 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0085 }
                r5[r6] = r1     // Catch:{ NoSuchFieldError -> 0x0085 }
            L_0x0085:
                int[] r1 = f21976a     // Catch:{ NoSuchFieldError -> 0x008f }
                androidx.work.y$a r5 = androidx.work.y.a.RUNNING     // Catch:{ NoSuchFieldError -> 0x008f }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x008f }
                r1[r5] = r0     // Catch:{ NoSuchFieldError -> 0x008f }
            L_0x008f:
                int[] r0 = f21976a     // Catch:{ NoSuchFieldError -> 0x0099 }
                androidx.work.y$a r1 = androidx.work.y.a.SUCCEEDED     // Catch:{ NoSuchFieldError -> 0x0099 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0099 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0099 }
            L_0x0099:
                int[] r0 = f21976a     // Catch:{ NoSuchFieldError -> 0x00a3 }
                androidx.work.y$a r1 = androidx.work.y.a.FAILED     // Catch:{ NoSuchFieldError -> 0x00a3 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a3 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x00a3 }
            L_0x00a3:
                int[] r0 = f21976a     // Catch:{ NoSuchFieldError -> 0x00ad }
                androidx.work.y$a r1 = androidx.work.y.a.BLOCKED     // Catch:{ NoSuchFieldError -> 0x00ad }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00ad }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x00ad }
            L_0x00ad:
                int[] r0 = f21976a     // Catch:{ NoSuchFieldError -> 0x00b8 }
                androidx.work.y$a r1 = androidx.work.y.a.CANCELLED     // Catch:{ NoSuchFieldError -> 0x00b8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b8 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b8 }
            L_0x00b8:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: r1.v.a.<clinit>():void");
        }
    }

    public static int a(androidx.work.a aVar) {
        int i10 = a.f21977b[aVar.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        throw new IllegalArgumentException("Could not convert " + aVar + " to int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0046 A[SYNTHETIC, Splitter:B:25:0x0046] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x005a A[SYNTHETIC, Splitter:B:36:0x005a] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:15:0x0033=Splitter:B:15:0x0033, B:29:0x004e=Splitter:B:29:0x004e} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.work.d b(byte[] r6) {
        /*
            androidx.work.d r0 = new androidx.work.d
            r0.<init>()
            if (r6 != 0) goto L_0x0008
            return r0
        L_0x0008:
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            r1.<init>(r6)
            r6 = 0
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch:{ IOException -> 0x003d, all -> 0x0039 }
            r2.<init>(r1)     // Catch:{ IOException -> 0x003d, all -> 0x0039 }
            int r6 = r2.readInt()     // Catch:{ IOException -> 0x0037 }
        L_0x0017:
            if (r6 <= 0) goto L_0x002b
            java.lang.String r3 = r2.readUTF()     // Catch:{ IOException -> 0x0037 }
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch:{ IOException -> 0x0037 }
            boolean r4 = r2.readBoolean()     // Catch:{ IOException -> 0x0037 }
            r0.a(r3, r4)     // Catch:{ IOException -> 0x0037 }
            int r6 = r6 + -1
            goto L_0x0017
        L_0x002b:
            r2.close()     // Catch:{ IOException -> 0x002f }
            goto L_0x0033
        L_0x002f:
            r6 = move-exception
            r6.printStackTrace()
        L_0x0033:
            r1.close()     // Catch:{ IOException -> 0x0052 }
            goto L_0x0056
        L_0x0037:
            r6 = move-exception
            goto L_0x0041
        L_0x0039:
            r0 = move-exception
            r2 = r6
            r6 = r0
            goto L_0x0058
        L_0x003d:
            r2 = move-exception
            r5 = r2
            r2 = r6
            r6 = r5
        L_0x0041:
            r6.printStackTrace()     // Catch:{ all -> 0x0057 }
            if (r2 == 0) goto L_0x004e
            r2.close()     // Catch:{ IOException -> 0x004a }
            goto L_0x004e
        L_0x004a:
            r6 = move-exception
            r6.printStackTrace()
        L_0x004e:
            r1.close()     // Catch:{ IOException -> 0x0052 }
            goto L_0x0056
        L_0x0052:
            r6 = move-exception
            r6.printStackTrace()
        L_0x0056:
            return r0
        L_0x0057:
            r6 = move-exception
        L_0x0058:
            if (r2 == 0) goto L_0x0062
            r2.close()     // Catch:{ IOException -> 0x005e }
            goto L_0x0062
        L_0x005e:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0062:
            r1.close()     // Catch:{ IOException -> 0x0066 }
            goto L_0x006a
        L_0x0066:
            r0 = move-exception
            r0.printStackTrace()
        L_0x006a:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: r1.v.b(byte[]):androidx.work.d");
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x005a A[SYNTHETIC, Splitter:B:26:0x005a] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0071 A[SYNTHETIC, Splitter:B:37:0x0071] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:30:0x0062=Splitter:B:30:0x0062, B:15:0x0048=Splitter:B:15:0x0048} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] c(androidx.work.d r4) {
        /*
            int r0 = r4.c()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            java.io.ObjectOutputStream r2 = new java.io.ObjectOutputStream     // Catch:{ IOException -> 0x0054 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x0054 }
            int r1 = r4.c()     // Catch:{ IOException -> 0x004f, all -> 0x004c }
            r2.writeInt(r1)     // Catch:{ IOException -> 0x004f, all -> 0x004c }
            java.util.Set r4 = r4.b()     // Catch:{ IOException -> 0x004f, all -> 0x004c }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ IOException -> 0x004f, all -> 0x004c }
        L_0x0021:
            boolean r1 = r4.hasNext()     // Catch:{ IOException -> 0x004f, all -> 0x004c }
            if (r1 == 0) goto L_0x0040
            java.lang.Object r1 = r4.next()     // Catch:{ IOException -> 0x004f, all -> 0x004c }
            androidx.work.d$a r1 = (androidx.work.d.a) r1     // Catch:{ IOException -> 0x004f, all -> 0x004c }
            android.net.Uri r3 = r1.a()     // Catch:{ IOException -> 0x004f, all -> 0x004c }
            java.lang.String r3 = r3.toString()     // Catch:{ IOException -> 0x004f, all -> 0x004c }
            r2.writeUTF(r3)     // Catch:{ IOException -> 0x004f, all -> 0x004c }
            boolean r1 = r1.b()     // Catch:{ IOException -> 0x004f, all -> 0x004c }
            r2.writeBoolean(r1)     // Catch:{ IOException -> 0x004f, all -> 0x004c }
            goto L_0x0021
        L_0x0040:
            r2.close()     // Catch:{ IOException -> 0x0044 }
            goto L_0x0048
        L_0x0044:
            r4 = move-exception
            r4.printStackTrace()
        L_0x0048:
            r0.close()     // Catch:{ IOException -> 0x0066 }
            goto L_0x006a
        L_0x004c:
            r4 = move-exception
            r1 = r2
            goto L_0x006f
        L_0x004f:
            r4 = move-exception
            r1 = r2
            goto L_0x0055
        L_0x0052:
            r4 = move-exception
            goto L_0x006f
        L_0x0054:
            r4 = move-exception
        L_0x0055:
            r4.printStackTrace()     // Catch:{ all -> 0x0052 }
            if (r1 == 0) goto L_0x0062
            r1.close()     // Catch:{ IOException -> 0x005e }
            goto L_0x0062
        L_0x005e:
            r4 = move-exception
            r4.printStackTrace()
        L_0x0062:
            r0.close()     // Catch:{ IOException -> 0x0066 }
            goto L_0x006a
        L_0x0066:
            r4 = move-exception
            r4.printStackTrace()
        L_0x006a:
            byte[] r4 = r0.toByteArray()
            return r4
        L_0x006f:
            if (r1 == 0) goto L_0x0079
            r1.close()     // Catch:{ IOException -> 0x0075 }
            goto L_0x0079
        L_0x0075:
            r1 = move-exception
            r1.printStackTrace()
        L_0x0079:
            r0.close()     // Catch:{ IOException -> 0x007d }
            goto L_0x0081
        L_0x007d:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0081:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: r1.v.c(androidx.work.d):byte[]");
    }

    public static androidx.work.a d(int i10) {
        if (i10 == 0) {
            return androidx.work.a.EXPONENTIAL;
        }
        if (i10 == 1) {
            return androidx.work.a.LINEAR;
        }
        throw new IllegalArgumentException("Could not convert " + i10 + " to BackoffPolicy");
    }

    public static q e(int i10) {
        if (i10 == 0) {
            return q.NOT_REQUIRED;
        }
        if (i10 == 1) {
            return q.CONNECTED;
        }
        if (i10 == 2) {
            return q.UNMETERED;
        }
        if (i10 == 3) {
            return q.NOT_ROAMING;
        }
        if (i10 == 4) {
            return q.METERED;
        }
        if (Build.VERSION.SDK_INT >= 30 && i10 == 5) {
            return q.TEMPORARILY_UNMETERED;
        }
        throw new IllegalArgumentException("Could not convert " + i10 + " to NetworkType");
    }

    public static t f(int i10) {
        if (i10 == 0) {
            return t.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        }
        if (i10 == 1) {
            return t.DROP_WORK_REQUEST;
        }
        throw new IllegalArgumentException("Could not convert " + i10 + " to OutOfQuotaPolicy");
    }

    public static y.a g(int i10) {
        if (i10 == 0) {
            return y.a.ENQUEUED;
        }
        if (i10 == 1) {
            return y.a.RUNNING;
        }
        if (i10 == 2) {
            return y.a.SUCCEEDED;
        }
        if (i10 == 3) {
            return y.a.FAILED;
        }
        if (i10 == 4) {
            return y.a.BLOCKED;
        }
        if (i10 == 5) {
            return y.a.CANCELLED;
        }
        throw new IllegalArgumentException("Could not convert " + i10 + " to State");
    }

    public static int h(q qVar) {
        int i10 = a.f21978c[qVar.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        if (i10 == 3) {
            return 2;
        }
        if (i10 == 4) {
            return 3;
        }
        if (i10 == 5) {
            return 4;
        }
        if (Build.VERSION.SDK_INT >= 30 && qVar == q.TEMPORARILY_UNMETERED) {
            return 5;
        }
        throw new IllegalArgumentException("Could not convert " + qVar + " to int");
    }

    public static int i(t tVar) {
        int i10 = a.f21979d[tVar.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        throw new IllegalArgumentException("Could not convert " + tVar + " to int");
    }

    public static int j(y.a aVar) {
        switch (a.f21976a[aVar.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            default:
                throw new IllegalArgumentException("Could not convert " + aVar + " to int");
        }
    }
}
