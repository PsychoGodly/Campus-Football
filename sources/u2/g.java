package u2;

import com.unity3d.services.core.device.MimeTypes;
import k4.a0;
import k4.n0;
import k4.r;
import n2.r1;
import s6.u;

/* compiled from: StreamFormatChunk */
final class g implements a {

    /* renamed from: a  reason: collision with root package name */
    public final r1 f22838a;

    public g(r1 r1Var) {
        this.f22838a = r1Var;
    }

    private static String a(int i10) {
        switch (i10) {
            case 808802372:
            case 877677894:
            case 1145656883:
            case 1145656920:
            case 1482049860:
            case 1684633208:
            case 2021026148:
                return "video/mp4v-es";
            case 826496577:
            case 828601953:
            case 875967048:
                return MimeTypes.VIDEO_H264;
            case 842289229:
                return "video/mp42";
            case 859066445:
                return "video/mp43";
            case 1196444237:
            case 1735420525:
                return "video/mjpeg";
            default:
                return null;
        }
    }

    private static String b(int i10) {
        if (i10 == 1) {
            return "audio/raw";
        }
        if (i10 == 85) {
            return "audio/mpeg";
        }
        if (i10 == 255) {
            return "audio/mp4a-latm";
        }
        if (i10 == 8192) {
            return "audio/ac3";
        }
        if (i10 != 8193) {
            return null;
        }
        return "audio/vnd.dts";
    }

    private static a c(a0 a0Var) {
        a0Var.U(4);
        int t10 = a0Var.t();
        int t11 = a0Var.t();
        a0Var.U(4);
        int t12 = a0Var.t();
        String a10 = a(t12);
        if (a10 == null) {
            r.i("StreamFormatChunk", "Ignoring track with unsupported compression " + t12);
            return null;
        }
        r1.b bVar = new r1.b();
        bVar.n0(t10).S(t11).g0(a10);
        return new g(bVar.G());
    }

    public static a d(int i10, a0 a0Var) {
        if (i10 == 2) {
            return c(a0Var);
        }
        if (i10 == 1) {
            return e(a0Var);
        }
        r.i("StreamFormatChunk", "Ignoring strf box for unsupported track type: " + n0.k0(i10));
        return null;
    }

    private static a e(a0 a0Var) {
        int y10 = a0Var.y();
        String b10 = b(y10);
        if (b10 == null) {
            r.i("StreamFormatChunk", "Ignoring track with unsupported format tag " + y10);
            return null;
        }
        int y11 = a0Var.y();
        int t10 = a0Var.t();
        a0Var.U(6);
        int b02 = n0.b0(a0Var.M());
        int y12 = a0Var.y();
        byte[] bArr = new byte[y12];
        a0Var.l(bArr, 0, y12);
        r1.b bVar = new r1.b();
        bVar.g0(b10).J(y11).h0(t10);
        if ("audio/raw".equals(b10) && b02 != 0) {
            bVar.a0(b02);
        }
        if ("audio/mp4a-latm".equals(b10) && y12 > 0) {
            bVar.V(u.z(bArr));
        }
        return new g(bVar.G());
    }

    public int getType() {
        return 1718776947;
    }
}
