package k4;

import android.os.SystemClock;
import com.applovin.exoplayer2.common.base.Ascii;
import j4.h0;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.ConcurrentModificationException;

/* compiled from: SntpClient */
public final class e0 {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final Object f19691a = new Object();
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final Object f19692b = new Object();
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static boolean f19693c = false;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static long f19694d = 0;

    /* renamed from: e  reason: collision with root package name */
    private static String f19695e = "time.android.com";

    /* compiled from: SntpClient */
    public interface b {
        void a(IOException iOException);

        void b();
    }

    /* compiled from: SntpClient */
    private static final class c implements h0.b<h0.e> {

        /* renamed from: a  reason: collision with root package name */
        private final b f19696a;

        public c(b bVar) {
            this.f19696a = bVar;
        }

        public void k(h0.e eVar, long j10, long j11) {
            if (this.f19696a == null) {
                return;
            }
            if (!e0.k()) {
                this.f19696a.a(new IOException(new ConcurrentModificationException()));
            } else {
                this.f19696a.b();
            }
        }

        public void l(h0.e eVar, long j10, long j11, boolean z10) {
        }

        public h0.c o(h0.e eVar, long j10, long j11, IOException iOException, int i10) {
            b bVar = this.f19696a;
            if (bVar != null) {
                bVar.a(iOException);
            }
            return h0.f19329f;
        }
    }

    /* compiled from: SntpClient */
    private static final class d implements h0.e {
        private d() {
        }

        public void a() throws IOException {
            synchronized (e0.f19691a) {
                synchronized (e0.f19692b) {
                    if (!e0.f19693c) {
                        long e10 = e0.l();
                        synchronized (e0.f19692b) {
                            long unused = e0.f19694d = e10;
                            boolean unused2 = e0.f19693c = true;
                        }
                    }
                }
            }
        }

        public void c() {
        }
    }

    private static void g(byte b10, byte b11, int i10, long j10) throws IOException {
        if (b10 == 3) {
            throw new IOException("SNTP: Unsynchronized server");
        } else if (b11 != 4 && b11 != 5) {
            throw new IOException("SNTP: Untrusted mode: " + b11);
        } else if (i10 == 0 || i10 > 15) {
            throw new IOException("SNTP: Untrusted stratum: " + i10);
        } else if (j10 == 0) {
            throw new IOException("SNTP: Zero transmitTime");
        }
    }

    public static long h() {
        long j10;
        synchronized (f19692b) {
            j10 = f19693c ? f19694d : -9223372036854775807L;
        }
        return j10;
    }

    public static String i() {
        String str;
        synchronized (f19692b) {
            str = f19695e;
        }
        return str;
    }

    public static void j(h0 h0Var, b bVar) {
        if (!k()) {
            if (h0Var == null) {
                h0Var = new h0("SntpClient");
            }
            h0Var.n(new d(), new c(bVar), 1);
        } else if (bVar != null) {
            bVar.b();
        }
    }

    public static boolean k() {
        boolean z10;
        synchronized (f19692b) {
            z10 = f19693c;
        }
        return z10;
    }

    /* access modifiers changed from: private */
    public static long l() throws IOException {
        InetAddress byName = InetAddress.getByName(i());
        DatagramSocket datagramSocket = new DatagramSocket();
        try {
            datagramSocket.setSoTimeout(10000);
            byte[] bArr = new byte[48];
            DatagramPacket datagramPacket = new DatagramPacket(bArr, 48, byName, 123);
            bArr[0] = Ascii.ESC;
            long currentTimeMillis = System.currentTimeMillis();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            o(bArr, 40, currentTimeMillis);
            datagramSocket.send(datagramPacket);
            datagramSocket.receive(new DatagramPacket(bArr, 48));
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            long j10 = currentTimeMillis + (elapsedRealtime2 - elapsedRealtime);
            long n10 = n(bArr, 24);
            long n11 = n(bArr, 32);
            long n12 = n(bArr, 40);
            g((byte) ((bArr[0] >> 6) & 3), (byte) (bArr[0] & 7), bArr[1] & 255, n12);
            long j11 = (j10 + (((n11 - n10) + (n12 - j10)) / 2)) - elapsedRealtime2;
            datagramSocket.close();
            return j11;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    private static long m(byte[] bArr, int i10) {
        byte b10 = bArr[i10];
        byte b11 = bArr[i10 + 1];
        byte b12 = bArr[i10 + 2];
        byte b13 = bArr[i10 + 3];
        byte b14 = b10 & true;
        int i11 = b10;
        if (b14 == true) {
            i11 = (b10 & Ascii.DEL) + 128;
        }
        byte b15 = b11 & true;
        int i12 = b11;
        if (b15 == true) {
            i12 = (b11 & Ascii.DEL) + 128;
        }
        byte b16 = b12 & true;
        int i13 = b12;
        if (b16 == true) {
            i13 = (b12 & Ascii.DEL) + 128;
        }
        byte b17 = b13 & true;
        int i14 = b13;
        if (b17 == true) {
            i14 = (b13 & Ascii.DEL) + 128;
        }
        return (((long) i11) << 24) + (((long) i12) << 16) + (((long) i13) << 8) + ((long) i14);
    }

    private static long n(byte[] bArr, int i10) {
        long m10 = m(bArr, i10);
        long m11 = m(bArr, i10 + 4);
        if (m10 == 0 && m11 == 0) {
            return 0;
        }
        return ((m10 - 2208988800L) * 1000) + ((m11 * 1000) / 4294967296L);
    }

    private static void o(byte[] bArr, int i10, long j10) {
        if (j10 == 0) {
            Arrays.fill(bArr, i10, i10 + 8, (byte) 0);
            return;
        }
        long j11 = j10 / 1000;
        long j12 = j10 - (j11 * 1000);
        long j13 = j11 + 2208988800L;
        int i11 = i10 + 1;
        bArr[i10] = (byte) ((int) (j13 >> 24));
        int i12 = i11 + 1;
        bArr[i11] = (byte) ((int) (j13 >> 16));
        int i13 = i12 + 1;
        bArr[i12] = (byte) ((int) (j13 >> 8));
        int i14 = i13 + 1;
        bArr[i13] = (byte) ((int) (j13 >> 0));
        long j14 = (j12 * 4294967296L) / 1000;
        int i15 = i14 + 1;
        bArr[i14] = (byte) ((int) (j14 >> 24));
        int i16 = i15 + 1;
        bArr[i15] = (byte) ((int) (j14 >> 16));
        bArr[i16] = (byte) ((int) (j14 >> 8));
        bArr[i16 + 1] = (byte) ((int) (Math.random() * 255.0d));
    }
}
