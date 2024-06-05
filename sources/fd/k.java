package fd;

import gd.g;
import gd.h;
import gd.i;
import gd.l;
import io.grpc.internal.r0;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import r6.o;

/* compiled from: OkHttpProtocolNegotiator */
class k {
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final Logger f32736b;

    /* renamed from: c  reason: collision with root package name */
    private static final h f32737c = h.e();

    /* renamed from: d  reason: collision with root package name */
    private static k f32738d;

    /* renamed from: a  reason: collision with root package name */
    protected final h f32739a;

    /* compiled from: OkHttpProtocolNegotiator */
    static final class a extends k {

        /* renamed from: e  reason: collision with root package name */
        private static final g<Socket> f32740e;

        /* renamed from: f  reason: collision with root package name */
        private static final g<Socket> f32741f;

        /* renamed from: g  reason: collision with root package name */
        private static final g<Socket> f32742g;

        /* renamed from: h  reason: collision with root package name */
        private static final g<Socket> f32743h;

        /* renamed from: i  reason: collision with root package name */
        private static final g<Socket> f32744i;

        /* renamed from: j  reason: collision with root package name */
        private static final g<Socket> f32745j;

        /* renamed from: k  reason: collision with root package name */
        private static final Method f32746k;

        /* renamed from: l  reason: collision with root package name */
        private static final Method f32747l;

        /* renamed from: m  reason: collision with root package name */
        private static final Method f32748m;

        /* renamed from: n  reason: collision with root package name */
        private static final Method f32749n;

        /* renamed from: o  reason: collision with root package name */
        private static final Method f32750o;

        /* renamed from: p  reason: collision with root package name */
        private static final Method f32751p;

        /* renamed from: q  reason: collision with root package name */
        private static final Constructor<?> f32752q;

        static {
            Method method;
            Method method2;
            Method method3;
            Method method4;
            Method method5;
            Method method6;
            Method method7;
            Class<String> cls = String.class;
            Class<byte[]> cls2 = byte[].class;
            Class cls3 = Boolean.TYPE;
            Constructor<?> constructor = null;
            f32740e = new g<>((Class<?>) null, "setUseSessionTickets", cls3);
            f32741f = new g<>((Class<?>) null, "setHostname", cls);
            f32742g = new g<>(cls2, "getAlpnSelectedProtocol", new Class[0]);
            f32743h = new g<>((Class<?>) null, "setAlpnProtocols", cls2);
            f32744i = new g<>(cls2, "getNpnSelectedProtocol", new Class[0]);
            f32745j = new g<>((Class<?>) null, "setNpnProtocols", cls2);
            Class<SSLParameters> cls4 = SSLParameters.class;
            try {
                method3 = cls4.getMethod("setApplicationProtocols", new Class[]{String[].class});
                try {
                    method4 = cls4.getMethod("getApplicationProtocols", new Class[0]);
                } catch (ClassNotFoundException e10) {
                    e = e10;
                    method4 = null;
                    method7 = null;
                    method = method2;
                    k.f32736b.log(Level.FINER, "Failed to find Android 10.0+ APIs", e);
                    method5 = null;
                    f32748m = method3;
                    f32749n = method4;
                    f32750o = method2;
                    f32746k = method;
                    f32747l = method5;
                    method6 = SSLParameters.class.getMethod("setServerNames", new Class[]{List.class});
                    constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(new Class[]{cls});
                    f32751p = method6;
                    f32752q = constructor;
                } catch (NoSuchMethodException e11) {
                    e = e11;
                    method4 = null;
                    method2 = null;
                    method = method2;
                    k.f32736b.log(Level.FINER, "Failed to find Android 10.0+ APIs", e);
                    method5 = null;
                    f32748m = method3;
                    f32749n = method4;
                    f32750o = method2;
                    f32746k = method;
                    f32747l = method5;
                    method6 = SSLParameters.class.getMethod("setServerNames", new Class[]{List.class});
                    constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(new Class[]{cls});
                    f32751p = method6;
                    f32752q = constructor;
                }
                try {
                    method2 = SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]);
                    try {
                        Class<?> cls5 = Class.forName("android.net.ssl.SSLSockets");
                        method = cls5.getMethod("isSupportedSocket", new Class[]{SSLSocket.class});
                        try {
                            method5 = cls5.getMethod("setUseSessionTickets", new Class[]{SSLSocket.class, cls3});
                        } catch (ClassNotFoundException e12) {
                            e = e12;
                            k.f32736b.log(Level.FINER, "Failed to find Android 10.0+ APIs", e);
                            method5 = null;
                            f32748m = method3;
                            f32749n = method4;
                            f32750o = method2;
                            f32746k = method;
                            f32747l = method5;
                            method6 = SSLParameters.class.getMethod("setServerNames", new Class[]{List.class});
                            constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(new Class[]{cls});
                            f32751p = method6;
                            f32752q = constructor;
                        } catch (NoSuchMethodException e13) {
                            e = e13;
                            k.f32736b.log(Level.FINER, "Failed to find Android 10.0+ APIs", e);
                            method5 = null;
                            f32748m = method3;
                            f32749n = method4;
                            f32750o = method2;
                            f32746k = method;
                            f32747l = method5;
                            method6 = SSLParameters.class.getMethod("setServerNames", new Class[]{List.class});
                            constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(new Class[]{cls});
                            f32751p = method6;
                            f32752q = constructor;
                        }
                    } catch (ClassNotFoundException e14) {
                        e = e14;
                        method = null;
                        k.f32736b.log(Level.FINER, "Failed to find Android 10.0+ APIs", e);
                        method5 = null;
                        f32748m = method3;
                        f32749n = method4;
                        f32750o = method2;
                        f32746k = method;
                        f32747l = method5;
                        method6 = SSLParameters.class.getMethod("setServerNames", new Class[]{List.class});
                        constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(new Class[]{cls});
                        f32751p = method6;
                        f32752q = constructor;
                    } catch (NoSuchMethodException e15) {
                        e = e15;
                        method = null;
                        k.f32736b.log(Level.FINER, "Failed to find Android 10.0+ APIs", e);
                        method5 = null;
                        f32748m = method3;
                        f32749n = method4;
                        f32750o = method2;
                        f32746k = method;
                        f32747l = method5;
                        method6 = SSLParameters.class.getMethod("setServerNames", new Class[]{List.class});
                        constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(new Class[]{cls});
                        f32751p = method6;
                        f32752q = constructor;
                    }
                } catch (ClassNotFoundException e16) {
                    e = e16;
                    method7 = null;
                    method = method2;
                    k.f32736b.log(Level.FINER, "Failed to find Android 10.0+ APIs", e);
                    method5 = null;
                    f32748m = method3;
                    f32749n = method4;
                    f32750o = method2;
                    f32746k = method;
                    f32747l = method5;
                    method6 = SSLParameters.class.getMethod("setServerNames", new Class[]{List.class});
                    constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(new Class[]{cls});
                    f32751p = method6;
                    f32752q = constructor;
                } catch (NoSuchMethodException e17) {
                    e = e17;
                    method2 = null;
                    method = method2;
                    k.f32736b.log(Level.FINER, "Failed to find Android 10.0+ APIs", e);
                    method5 = null;
                    f32748m = method3;
                    f32749n = method4;
                    f32750o = method2;
                    f32746k = method;
                    f32747l = method5;
                    method6 = SSLParameters.class.getMethod("setServerNames", new Class[]{List.class});
                    constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(new Class[]{cls});
                    f32751p = method6;
                    f32752q = constructor;
                }
            } catch (ClassNotFoundException e18) {
                e = e18;
                method4 = null;
                method3 = null;
                method7 = null;
                method = method2;
                k.f32736b.log(Level.FINER, "Failed to find Android 10.0+ APIs", e);
                method5 = null;
                f32748m = method3;
                f32749n = method4;
                f32750o = method2;
                f32746k = method;
                f32747l = method5;
                method6 = SSLParameters.class.getMethod("setServerNames", new Class[]{List.class});
                constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(new Class[]{cls});
                f32751p = method6;
                f32752q = constructor;
            } catch (NoSuchMethodException e19) {
                e = e19;
                method4 = null;
                method3 = null;
                method2 = null;
                method = method2;
                k.f32736b.log(Level.FINER, "Failed to find Android 10.0+ APIs", e);
                method5 = null;
                f32748m = method3;
                f32749n = method4;
                f32750o = method2;
                f32746k = method;
                f32747l = method5;
                method6 = SSLParameters.class.getMethod("setServerNames", new Class[]{List.class});
                constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(new Class[]{cls});
                f32751p = method6;
                f32752q = constructor;
            }
            f32748m = method3;
            f32749n = method4;
            f32750o = method2;
            f32746k = method;
            f32747l = method5;
            try {
                method6 = SSLParameters.class.getMethod("setServerNames", new Class[]{List.class});
                try {
                    constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(new Class[]{cls});
                } catch (ClassNotFoundException e20) {
                    e = e20;
                    k.f32736b.log(Level.FINER, "Failed to find Android 7.0+ APIs", e);
                    f32751p = method6;
                    f32752q = constructor;
                } catch (NoSuchMethodException e21) {
                    e = e21;
                    k.f32736b.log(Level.FINER, "Failed to find Android 7.0+ APIs", e);
                    f32751p = method6;
                    f32752q = constructor;
                }
            } catch (ClassNotFoundException e22) {
                e = e22;
                method6 = null;
                k.f32736b.log(Level.FINER, "Failed to find Android 7.0+ APIs", e);
                f32751p = method6;
                f32752q = constructor;
            } catch (NoSuchMethodException e23) {
                e = e23;
                method6 = null;
                k.f32736b.log(Level.FINER, "Failed to find Android 7.0+ APIs", e);
                f32751p = method6;
                f32752q = constructor;
            }
            f32751p = method6;
            f32752q = constructor;
        }

        a(h hVar) {
            super(hVar);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.Object[]} */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Code restructure failed: missing block: B:45:0x00dc, code lost:
            r9 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:0x00e2, code lost:
            throw new java.lang.RuntimeException(r9);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x00ea, code lost:
            r9 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:53:0x00f0, code lost:
            throw new java.lang.RuntimeException(r9);
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0049 A[Catch:{ InvocationTargetException -> 0x007a, IllegalAccessException -> 0x00ea, InstantiationException -> 0x00dc, IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }] */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x005d A[Catch:{ InvocationTargetException -> 0x007a, IllegalAccessException -> 0x00ea, InstantiationException -> 0x00dc, IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }] */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x00ac A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x00ad  */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x00dc A[ExcHandler: InstantiationException (r9v3 'e' java.lang.InstantiationException A[CUSTOM_DECLARE]), Splitter:B:2:0x000c] */
        /* JADX WARNING: Removed duplicated region for block: B:51:0x00ea A[ExcHandler: IllegalAccessException (r9v1 'e' java.lang.IllegalAccessException A[CUSTOM_DECLARE]), Splitter:B:2:0x000c] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void c(javax.net.ssl.SSLSocket r9, java.lang.String r10, java.util.List<gd.i> r11) {
            /*
                r8 = this;
                java.lang.String[] r0 = fd.k.i(r11)
                javax.net.ssl.SSLParameters r1 = r9.getSSLParameters()
                r2 = 1
                r3 = 0
                if (r10 == 0) goto L_0x0066
                boolean r4 = fd.k.g(r10)     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
                if (r4 == 0) goto L_0x0066
                java.lang.reflect.Method r4 = f32746k     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
                if (r4 == 0) goto L_0x0036
                java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
                r5[r3] = r9     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
                r6 = 0
                java.lang.Object r4 = r4.invoke(r6, r5)     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
                java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
                boolean r4 = r4.booleanValue()     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
                if (r4 == 0) goto L_0x0036
                java.lang.reflect.Method r4 = f32747l     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
                r5 = 2
                java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
                r5[r3] = r9     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
                java.lang.Boolean r7 = java.lang.Boolean.TRUE     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
                r5[r2] = r7     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
                r4.invoke(r6, r5)     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
                goto L_0x0041
            L_0x0036:
                gd.g<java.net.Socket> r4 = f32740e     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
                java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
                java.lang.Boolean r6 = java.lang.Boolean.TRUE     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
                r5[r3] = r6     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
                r4.e(r9, r5)     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
            L_0x0041:
                java.lang.reflect.Method r4 = f32751p     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
                if (r4 == 0) goto L_0x005d
                java.lang.reflect.Constructor<?> r5 = f32752q     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
                if (r5 == 0) goto L_0x005d
                java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
                java.lang.Object[] r7 = new java.lang.Object[r2]     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
                r7[r3] = r10     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
                java.lang.Object r10 = r5.newInstance(r7)     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
                java.util.List r10 = java.util.Collections.singletonList(r10)     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
                r6[r3] = r10     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
                r4.invoke(r1, r6)     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
                goto L_0x0066
            L_0x005d:
                gd.g<java.net.Socket> r4 = f32741f     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
                java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
                r5[r3] = r10     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
                r4.e(r9, r5)     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
            L_0x0066:
                java.lang.reflect.Method r10 = f32750o     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
                if (r10 == 0) goto L_0x0090
                java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ InvocationTargetException -> 0x007a, IllegalAccessException -> 0x00ea, InstantiationException -> 0x00dc }
                r10.invoke(r9, r4)     // Catch:{ InvocationTargetException -> 0x007a, IllegalAccessException -> 0x00ea, InstantiationException -> 0x00dc }
                java.lang.reflect.Method r10 = f32748m     // Catch:{ InvocationTargetException -> 0x007a, IllegalAccessException -> 0x00ea, InstantiationException -> 0x00dc }
                java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch:{ InvocationTargetException -> 0x007a, IllegalAccessException -> 0x00ea, InstantiationException -> 0x00dc }
                r4[r3] = r0     // Catch:{ InvocationTargetException -> 0x007a, IllegalAccessException -> 0x00ea, InstantiationException -> 0x00dc }
                r10.invoke(r1, r4)     // Catch:{ InvocationTargetException -> 0x007a, IllegalAccessException -> 0x00ea, InstantiationException -> 0x00dc }
                r10 = 1
                goto L_0x0091
            L_0x007a:
                r10 = move-exception
                java.lang.Throwable r4 = r10.getTargetException()     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
                boolean r4 = r4 instanceof java.lang.UnsupportedOperationException     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
                if (r4 == 0) goto L_0x008f
                java.util.logging.Logger r10 = fd.k.f32736b     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
                java.util.logging.Level r4 = java.util.logging.Level.FINER     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
                java.lang.String r5 = "setApplicationProtocol unsupported, will try old methods"
                r10.log(r4, r5)     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
                goto L_0x0090
            L_0x008f:
                throw r10     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
            L_0x0090:
                r10 = 0
            L_0x0091:
                r9.setSSLParameters(r1)     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
                if (r10 == 0) goto L_0x00ad
                java.lang.reflect.Method r10 = f32749n     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
                if (r10 == 0) goto L_0x00ad
                javax.net.ssl.SSLParameters r1 = r9.getSSLParameters()     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
                java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
                java.lang.Object r10 = r10.invoke(r1, r4)     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
                java.lang.String[] r10 = (java.lang.String[]) r10     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
                boolean r10 = java.util.Arrays.equals(r0, r10)     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
                if (r10 == 0) goto L_0x00ad
                return
            L_0x00ad:
                java.lang.Object[] r10 = new java.lang.Object[r2]
                byte[] r11 = gd.h.b(r11)
                r10[r3] = r11
                gd.h r11 = r8.f32739a
                gd.h$h r11 = r11.i()
                gd.h$h r0 = gd.h.C0374h.ALPN_AND_NPN
                if (r11 != r0) goto L_0x00c4
                gd.g<java.net.Socket> r11 = f32743h
                r11.f(r9, r10)
            L_0x00c4:
                gd.h r11 = r8.f32739a
                gd.h$h r11 = r11.i()
                gd.h$h r0 = gd.h.C0374h.NONE
                if (r11 == r0) goto L_0x00d4
                gd.g<java.net.Socket> r11 = f32745j
                r11.f(r9, r10)
                return
            L_0x00d4:
                java.lang.RuntimeException r9 = new java.lang.RuntimeException
                java.lang.String r10 = "We can not do TLS handshake on this Android version, please install the Google Play Services Dynamic Security Provider to use TLS"
                r9.<init>(r10)
                throw r9
            L_0x00dc:
                r9 = move-exception
                java.lang.RuntimeException r10 = new java.lang.RuntimeException
                r10.<init>(r9)
                throw r10
            L_0x00e3:
                r9 = move-exception
                java.lang.RuntimeException r10 = new java.lang.RuntimeException
                r10.<init>(r9)
                throw r10
            L_0x00ea:
                r9 = move-exception
                java.lang.RuntimeException r10 = new java.lang.RuntimeException
                r10.<init>(r9)
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: fd.k.a.c(javax.net.ssl.SSLSocket, java.lang.String, java.util.List):void");
        }

        public String f(SSLSocket sSLSocket) {
            Method method = f32750o;
            if (method != null) {
                try {
                    return (String) method.invoke(sSLSocket, new Object[0]);
                } catch (IllegalAccessException e10) {
                    throw new RuntimeException(e10);
                } catch (InvocationTargetException e11) {
                    if (e11.getTargetException() instanceof UnsupportedOperationException) {
                        k.f32736b.log(Level.FINER, "Socket unsupported for getApplicationProtocol, will try old methods");
                    } else {
                        throw new RuntimeException(e11);
                    }
                }
            }
            if (this.f32739a.i() == h.C0374h.ALPN_AND_NPN) {
                try {
                    byte[] bArr = (byte[]) f32742g.f(sSLSocket, new Object[0]);
                    if (bArr != null) {
                        return new String(bArr, l.f32938b);
                    }
                } catch (Exception e12) {
                    k.f32736b.log(Level.FINE, "Failed calling getAlpnSelectedProtocol()", e12);
                }
            }
            if (this.f32739a.i() == h.C0374h.NONE) {
                return null;
            }
            try {
                byte[] bArr2 = (byte[]) f32744i.f(sSLSocket, new Object[0]);
                if (bArr2 != null) {
                    return new String(bArr2, l.f32938b);
                }
                return null;
            } catch (Exception e13) {
                k.f32736b.log(Level.FINE, "Failed calling getNpnSelectedProtocol()", e13);
                return null;
            }
        }

        public String h(SSLSocket sSLSocket, String str, List<i> list) throws IOException {
            String f10 = f(sSLSocket);
            return f10 == null ? k.super.h(sSLSocket, str, list) : f10;
        }
    }

    static {
        Class<k> cls = k.class;
        f32736b = Logger.getLogger(cls.getName());
        f32738d = d(cls.getClassLoader());
    }

    k(h hVar) {
        this.f32739a = (h) o.p(hVar, "platform");
    }

    static k d(ClassLoader classLoader) {
        boolean z10;
        try {
            classLoader.loadClass("com.android.org.conscrypt.OpenSSLSocketImpl");
        } catch (ClassNotFoundException e10) {
            f32736b.log(Level.FINE, "Unable to find Conscrypt. Skipping", e10);
            try {
                classLoader.loadClass("org.apache.harmony.xnet.provider.jsse.OpenSSLSocketImpl");
            } catch (ClassNotFoundException e11) {
                f32736b.log(Level.FINE, "Unable to find any OpenSSLSocketImpl. Skipping", e11);
                z10 = false;
            }
        }
        z10 = true;
        if (z10) {
            return new a(f32737c);
        }
        return new k(f32737c);
    }

    public static k e() {
        return f32738d;
    }

    static boolean g(String str) {
        if (str.contains("_")) {
            return false;
        }
        try {
            r0.c(str);
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    /* access modifiers changed from: private */
    public static String[] i(List<i> list) {
        ArrayList arrayList = new ArrayList();
        for (i iVar : list) {
            arrayList.add(iVar.toString());
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* access modifiers changed from: protected */
    public void c(SSLSocket sSLSocket, String str, List<i> list) {
        this.f32739a.c(sSLSocket, str, list);
    }

    public String f(SSLSocket sSLSocket) {
        return this.f32739a.h(sSLSocket);
    }

    public String h(SSLSocket sSLSocket, String str, List<i> list) throws IOException {
        if (list != null) {
            c(sSLSocket, str, list);
        }
        try {
            sSLSocket.startHandshake();
            String f10 = f(sSLSocket);
            if (f10 != null) {
                return f10;
            }
            throw new RuntimeException("TLS ALPN negotiation failed with protocols: " + list);
        } finally {
            this.f32739a.a(sSLSocket);
        }
    }
}
