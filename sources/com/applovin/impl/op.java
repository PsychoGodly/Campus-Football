package com.applovin.impl;

import android.net.Uri;
import com.facebook.ads.AdError;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

public final class op extends z1 {

    /* renamed from: e  reason: collision with root package name */
    private final int f10518e;

    /* renamed from: f  reason: collision with root package name */
    private final byte[] f10519f;

    /* renamed from: g  reason: collision with root package name */
    private final DatagramPacket f10520g;

    /* renamed from: h  reason: collision with root package name */
    private Uri f10521h;

    /* renamed from: i  reason: collision with root package name */
    private DatagramSocket f10522i;

    /* renamed from: j  reason: collision with root package name */
    private MulticastSocket f10523j;

    /* renamed from: k  reason: collision with root package name */
    private InetAddress f10524k;

    /* renamed from: l  reason: collision with root package name */
    private InetSocketAddress f10525l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f10526m;

    /* renamed from: n  reason: collision with root package name */
    private int f10527n;

    public static final class a extends h5 {
        public a(Throwable th, int i10) {
            super(th, i10);
        }
    }

    public op() {
        this(AdError.SERVER_ERROR_CODE);
    }

    public long a(j5 j5Var) {
        Uri uri = j5Var.f8675a;
        this.f10521h = uri;
        String host = uri.getHost();
        int port = this.f10521h.getPort();
        b(j5Var);
        try {
            this.f10524k = InetAddress.getByName(host);
            this.f10525l = new InetSocketAddress(this.f10524k, port);
            if (this.f10524k.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(this.f10525l);
                this.f10523j = multicastSocket;
                multicastSocket.joinGroup(this.f10524k);
                this.f10522i = this.f10523j;
            } else {
                this.f10522i = new DatagramSocket(this.f10525l);
            }
            this.f10522i.setSoTimeout(this.f10518e);
            this.f10526m = true;
            c(j5Var);
            return -1;
        } catch (SecurityException e10) {
            throw new a(e10, AdError.INTERNAL_ERROR_2006);
        } catch (IOException e11) {
            throw new a(e11, AdError.INTERNAL_ERROR_CODE);
        }
    }

    public Uri c() {
        return this.f10521h;
    }

    public void close() {
        this.f10521h = null;
        MulticastSocket multicastSocket = this.f10523j;
        if (multicastSocket != null) {
            try {
                multicastSocket.leaveGroup(this.f10524k);
            } catch (IOException unused) {
            }
            this.f10523j = null;
        }
        DatagramSocket datagramSocket = this.f10522i;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f10522i = null;
        }
        this.f10524k = null;
        this.f10525l = null;
        this.f10527n = 0;
        if (this.f10526m) {
            this.f10526m = false;
            g();
        }
    }

    public op(int i10) {
        this(i10, 8000);
    }

    public op(int i10, int i11) {
        super(true);
        this.f10518e = i11;
        byte[] bArr = new byte[i10];
        this.f10519f = bArr;
        this.f10520g = new DatagramPacket(bArr, 0, i10);
    }

    public int a(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        if (this.f10527n == 0) {
            try {
                this.f10522i.receive(this.f10520g);
                int length = this.f10520g.getLength();
                this.f10527n = length;
                d(length);
            } catch (SocketTimeoutException e10) {
                throw new a(e10, AdError.CACHE_ERROR_CODE);
            } catch (IOException e11) {
                throw new a(e11, AdError.INTERNAL_ERROR_CODE);
            }
        }
        int length2 = this.f10520g.getLength();
        int i12 = this.f10527n;
        int min = Math.min(i12, i11);
        System.arraycopy(this.f10519f, length2 - i12, bArr, i10, min);
        this.f10527n -= min;
        return min;
    }
}
