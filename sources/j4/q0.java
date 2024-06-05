package j4;

import android.net.Uri;
import com.facebook.ads.AdError;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* compiled from: UdpDataSource */
public final class q0 extends g {

    /* renamed from: e  reason: collision with root package name */
    private final int f19415e;

    /* renamed from: f  reason: collision with root package name */
    private final byte[] f19416f;

    /* renamed from: g  reason: collision with root package name */
    private final DatagramPacket f19417g;

    /* renamed from: h  reason: collision with root package name */
    private Uri f19418h;

    /* renamed from: i  reason: collision with root package name */
    private DatagramSocket f19419i;

    /* renamed from: j  reason: collision with root package name */
    private MulticastSocket f19420j;

    /* renamed from: k  reason: collision with root package name */
    private InetAddress f19421k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f19422l;

    /* renamed from: m  reason: collision with root package name */
    private int f19423m;

    /* compiled from: UdpDataSource */
    public static final class a extends m {
        public a(Throwable th, int i10) {
            super(th, i10);
        }
    }

    public q0() {
        this(AdError.SERVER_ERROR_CODE);
    }

    public void close() {
        this.f19418h = null;
        MulticastSocket multicastSocket = this.f19420j;
        if (multicastSocket != null) {
            try {
                multicastSocket.leaveGroup((InetAddress) k4.a.e(this.f19421k));
            } catch (IOException unused) {
            }
            this.f19420j = null;
        }
        DatagramSocket datagramSocket = this.f19419i;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f19419i = null;
        }
        this.f19421k = null;
        this.f19423m = 0;
        if (this.f19422l) {
            this.f19422l = false;
            r();
        }
    }

    public long f(p pVar) throws a {
        Uri uri = pVar.f19387a;
        this.f19418h = uri;
        String str = (String) k4.a.e(uri.getHost());
        int port = this.f19418h.getPort();
        s(pVar);
        try {
            this.f19421k = InetAddress.getByName(str);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f19421k, port);
            if (this.f19421k.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f19420j = multicastSocket;
                multicastSocket.joinGroup(this.f19421k);
                this.f19419i = this.f19420j;
            } else {
                this.f19419i = new DatagramSocket(inetSocketAddress);
            }
            this.f19419i.setSoTimeout(this.f19415e);
            this.f19422l = true;
            t(pVar);
            return -1;
        } catch (SecurityException e10) {
            throw new a(e10, AdError.INTERNAL_ERROR_2006);
        } catch (IOException e11) {
            throw new a(e11, AdError.INTERNAL_ERROR_CODE);
        }
    }

    public Uri o() {
        return this.f19418h;
    }

    public int read(byte[] bArr, int i10, int i11) throws a {
        if (i11 == 0) {
            return 0;
        }
        if (this.f19423m == 0) {
            try {
                ((DatagramSocket) k4.a.e(this.f19419i)).receive(this.f19417g);
                int length = this.f19417g.getLength();
                this.f19423m = length;
                q(length);
            } catch (SocketTimeoutException e10) {
                throw new a(e10, AdError.CACHE_ERROR_CODE);
            } catch (IOException e11) {
                throw new a(e11, AdError.INTERNAL_ERROR_CODE);
            }
        }
        int length2 = this.f19417g.getLength();
        int i12 = this.f19423m;
        int min = Math.min(i12, i11);
        System.arraycopy(this.f19416f, length2 - i12, bArr, i10, min);
        this.f19423m -= min;
        return min;
    }

    public q0(int i10) {
        this(i10, 8000);
    }

    public q0(int i10, int i11) {
        super(true);
        this.f19415e = i11;
        byte[] bArr = new byte[i10];
        this.f19416f = bArr;
        this.f19417g = new DatagramPacket(bArr, 0, i10);
    }
}
