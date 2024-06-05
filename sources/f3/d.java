package f3;

import g3.b;
import k3.h;
import m3.c;
import n2.r1;

/* compiled from: MetadataDecoderFactory */
public interface d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f17987a = new a();

    /* compiled from: MetadataDecoderFactory */
    class a implements d {
        a() {
        }

        public boolean a(r1 r1Var) {
            String str = r1Var.f20654m;
            return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
        }

        public c b(r1 r1Var) {
            String str = r1Var.f20654m;
            if (str != null) {
                char c10 = 65535;
                switch (str.hashCode()) {
                    case -1354451219:
                        if (str.equals("application/vnd.dvb.ait")) {
                            c10 = 0;
                            break;
                        }
                        break;
                    case -1348231605:
                        if (str.equals("application/x-icy")) {
                            c10 = 1;
                            break;
                        }
                        break;
                    case -1248341703:
                        if (str.equals("application/id3")) {
                            c10 = 2;
                            break;
                        }
                        break;
                    case 1154383568:
                        if (str.equals("application/x-emsg")) {
                            c10 = 3;
                            break;
                        }
                        break;
                    case 1652648887:
                        if (str.equals("application/x-scte35")) {
                            c10 = 4;
                            break;
                        }
                        break;
                }
                switch (c10) {
                    case 0:
                        return new b();
                    case 1:
                        return new j3.a();
                    case 2:
                        return new h();
                    case 3:
                        return new h3.b();
                    case 4:
                        return new c();
                }
            }
            throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: " + str);
        }
    }

    boolean a(r1 r1Var);

    c b(r1 r1Var);
}
