package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzcde extends SSLSocketFactory {
    final SSLSocketFactory zza = ((SSLSocketFactory) SSLSocketFactory.getDefault());
    final /* synthetic */ zzcdf zzb;

    zzcde(zzcdf zzcdf) {
        this.zzb = zzcdf;
    }

    private final Socket zza(Socket socket) throws SocketException {
        zzcdf zzcdf = this.zzb;
        if (zzcdf.zzr > 0) {
            socket.setReceiveBufferSize(zzcdf.zzr);
        }
        this.zzb.zzs.add(socket);
        return socket;
    }

    public final Socket createSocket(String str, int i10) throws IOException {
        Socket createSocket = this.zza.createSocket(str, i10);
        zza(createSocket);
        return createSocket;
    }

    public final String[] getDefaultCipherSuites() {
        return this.zza.getDefaultCipherSuites();
    }

    public final String[] getSupportedCipherSuites() {
        return this.zza.getSupportedCipherSuites();
    }

    public final Socket createSocket(String str, int i10, InetAddress inetAddress, int i11) throws IOException {
        Socket createSocket = this.zza.createSocket(str, i10, inetAddress, i11);
        zza(createSocket);
        return createSocket;
    }

    public final Socket createSocket(InetAddress inetAddress, int i10) throws IOException {
        Socket createSocket = this.zza.createSocket(inetAddress, i10);
        zza(createSocket);
        return createSocket;
    }

    public final Socket createSocket(InetAddress inetAddress, int i10, InetAddress inetAddress2, int i11) throws IOException {
        Socket createSocket = this.zza.createSocket(inetAddress, i10, inetAddress2, i11);
        zza(createSocket);
        return createSocket;
    }

    public final Socket createSocket(Socket socket, String str, int i10, boolean z10) throws IOException {
        Socket createSocket = this.zza.createSocket(socket, str, i10, z10);
        zza(createSocket);
        return createSocket;
    }
}
