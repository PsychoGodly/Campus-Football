package lf;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: Okio */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    static final Logger f36271a = Logger.getLogger(l.class.getName());

    /* compiled from: Okio */
    class a implements r {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ t f36272a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ OutputStream f36273b;

        a(t tVar, OutputStream outputStream) {
            this.f36272a = tVar;
            this.f36273b = outputStream;
        }

        public void V0(c cVar, long j10) throws IOException {
            u.b(cVar.f36252b, 0, j10);
            while (j10 > 0) {
                this.f36272a.f();
                o oVar = cVar.f36251a;
                int min = (int) Math.min(j10, (long) (oVar.f36285c - oVar.f36284b));
                this.f36273b.write(oVar.f36283a, oVar.f36284b, min);
                int i10 = oVar.f36284b + min;
                oVar.f36284b = i10;
                long j11 = (long) min;
                j10 -= j11;
                cVar.f36252b -= j11;
                if (i10 == oVar.f36285c) {
                    cVar.f36251a = oVar.b();
                    p.a(oVar);
                }
            }
        }

        public void close() throws IOException {
            this.f36273b.close();
        }

        public t e() {
            return this.f36272a;
        }

        public void flush() throws IOException {
            this.f36273b.flush();
        }

        public String toString() {
            return "sink(" + this.f36273b + ")";
        }
    }

    /* compiled from: Okio */
    class b implements s {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ t f36274a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ InputStream f36275b;

        b(t tVar, InputStream inputStream) {
            this.f36274a = tVar;
            this.f36275b = inputStream;
        }

        public long P(c cVar, long j10) throws IOException {
            int i10 = (j10 > 0 ? 1 : (j10 == 0 ? 0 : -1));
            if (i10 < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j10);
            } else if (i10 == 0) {
                return 0;
            } else {
                try {
                    this.f36274a.f();
                    o C0 = cVar.C0(1);
                    int read = this.f36275b.read(C0.f36283a, C0.f36285c, (int) Math.min(j10, (long) (8192 - C0.f36285c)));
                    if (read != -1) {
                        C0.f36285c += read;
                        long j11 = (long) read;
                        cVar.f36252b += j11;
                        return j11;
                    } else if (C0.f36284b != C0.f36285c) {
                        return -1;
                    } else {
                        cVar.f36251a = C0.b();
                        p.a(C0);
                        return -1;
                    }
                } catch (AssertionError e10) {
                    if (l.c(e10)) {
                        throw new IOException(e10);
                    }
                    throw e10;
                }
            }
        }

        public void close() throws IOException {
            this.f36275b.close();
        }

        public t e() {
            return this.f36274a;
        }

        public String toString() {
            return "source(" + this.f36275b + ")";
        }
    }

    /* compiled from: Okio */
    class c extends a {

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ Socket f36276k;

        c(Socket socket) {
            this.f36276k = socket;
        }

        /* access modifiers changed from: protected */
        public IOException o(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        /* access modifiers changed from: protected */
        public void t() {
            try {
                this.f36276k.close();
            } catch (Exception e10) {
                Logger logger = l.f36271a;
                Level level = Level.WARNING;
                logger.log(level, "Failed to close timed out socket " + this.f36276k, e10);
            } catch (AssertionError e11) {
                if (l.c(e11)) {
                    Logger logger2 = l.f36271a;
                    Level level2 = Level.WARNING;
                    logger2.log(level2, "Failed to close timed out socket " + this.f36276k, e11);
                    return;
                }
                throw e11;
            }
        }
    }

    private l() {
    }

    public static d a(r rVar) {
        return new m(rVar);
    }

    public static e b(s sVar) {
        return new n(sVar);
    }

    static boolean c(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    public static r d(File file) throws FileNotFoundException {
        if (file != null) {
            return e(new FileOutputStream(file));
        }
        throw new IllegalArgumentException("file == null");
    }

    public static r e(OutputStream outputStream) {
        return f(outputStream, new t());
    }

    private static r f(OutputStream outputStream, t tVar) {
        if (outputStream == null) {
            throw new IllegalArgumentException("out == null");
        } else if (tVar != null) {
            return new a(tVar, outputStream);
        } else {
            throw new IllegalArgumentException("timeout == null");
        }
    }

    public static r g(Socket socket) throws IOException {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        } else if (socket.getOutputStream() != null) {
            a k10 = k(socket);
            return k10.r(f(socket.getOutputStream(), k10));
        } else {
            throw new IOException("socket's output stream == null");
        }
    }

    public static s h(InputStream inputStream) {
        return i(inputStream, new t());
    }

    private static s i(InputStream inputStream, t tVar) {
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        } else if (tVar != null) {
            return new b(tVar, inputStream);
        } else {
            throw new IllegalArgumentException("timeout == null");
        }
    }

    public static s j(Socket socket) throws IOException {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        } else if (socket.getInputStream() != null) {
            a k10 = k(socket);
            return k10.s(i(socket.getInputStream(), k10));
        } else {
            throw new IOException("socket's input stream == null");
        }
    }

    private static a k(Socket socket) {
        return new c(socket);
    }
}
