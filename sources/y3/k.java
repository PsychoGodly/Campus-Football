package y3;

import h4.h;
import n2.r1;
import z3.c;

/* compiled from: SubtitleDecoderFactory */
public interface k {

    /* renamed from: a  reason: collision with root package name */
    public static final k f23878a = new a();

    /* compiled from: SubtitleDecoderFactory */
    class a implements k {
        a() {
        }

        public boolean a(r1 r1Var) {
            String str = r1Var.f20654m;
            return "text/vtt".equals(str) || "text/x-ssa".equals(str) || "application/ttml+xml".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-subrip".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/cea-608".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/cea-708".equals(str) || "application/dvbsubs".equals(str) || "application/pgs".equals(str) || "text/x-exoplayer-cues".equals(str);
        }

        public i b(r1 r1Var) {
            String str = r1Var.f20654m;
            if (str != null) {
                char c10 = 65535;
                switch (str.hashCode()) {
                    case -1351681404:
                        if (str.equals("application/dvbsubs")) {
                            c10 = 0;
                            break;
                        }
                        break;
                    case -1248334819:
                        if (str.equals("application/pgs")) {
                            c10 = 1;
                            break;
                        }
                        break;
                    case -1026075066:
                        if (str.equals("application/x-mp4-vtt")) {
                            c10 = 2;
                            break;
                        }
                        break;
                    case -1004728940:
                        if (str.equals("text/vtt")) {
                            c10 = 3;
                            break;
                        }
                        break;
                    case 691401887:
                        if (str.equals("application/x-quicktime-tx3g")) {
                            c10 = 4;
                            break;
                        }
                        break;
                    case 822864842:
                        if (str.equals("text/x-ssa")) {
                            c10 = 5;
                            break;
                        }
                        break;
                    case 930165504:
                        if (str.equals("application/x-mp4-cea-608")) {
                            c10 = 6;
                            break;
                        }
                        break;
                    case 1201784583:
                        if (str.equals("text/x-exoplayer-cues")) {
                            c10 = 7;
                            break;
                        }
                        break;
                    case 1566015601:
                        if (str.equals("application/cea-608")) {
                            c10 = 8;
                            break;
                        }
                        break;
                    case 1566016562:
                        if (str.equals("application/cea-708")) {
                            c10 = 9;
                            break;
                        }
                        break;
                    case 1668750253:
                        if (str.equals("application/x-subrip")) {
                            c10 = 10;
                            break;
                        }
                        break;
                    case 1693976202:
                        if (str.equals("application/ttml+xml")) {
                            c10 = 11;
                            break;
                        }
                        break;
                }
                switch (c10) {
                    case 0:
                        return new a4.a(r1Var.f20656o);
                    case 1:
                        return new b4.a();
                    case 2:
                        return new h4.a();
                    case 3:
                        return new h();
                    case 4:
                        return new g4.a(r1Var.f20656o);
                    case 5:
                        return new d4.a(r1Var.f20656o);
                    case 6:
                    case 8:
                        return new z3.a(str, r1Var.E, 16000);
                    case 7:
                        return new f();
                    case 9:
                        return new c(r1Var.E, r1Var.f20656o);
                    case 10:
                        return new e4.a();
                    case 11:
                        return new f4.c();
                }
            }
            throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: " + str);
        }
    }

    boolean a(r1 r1Var);

    i b(r1 r1Var);
}
