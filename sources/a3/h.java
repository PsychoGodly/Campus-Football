package a3;

import com.applovin.mediation.MaxReward;
import com.unity3d.services.UnityAdsConstants;
import f3.a;
import k3.a;
import k3.e;
import k3.i;
import k3.j;
import k3.m;
import k4.a0;
import k4.r;
import n2.r1;
import s2.x;
import s6.u;

/* compiled from: MetadataUtil */
final class h {

    /* renamed from: a  reason: collision with root package name */
    static final String[] f277a = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};

    private static e a(int i10, a0 a0Var) {
        int p10 = a0Var.p();
        if (a0Var.p() == 1684108385) {
            a0Var.U(8);
            String B = a0Var.B(p10 - 16);
            return new e("und", B, B);
        }
        r.i("MetadataUtil", "Failed to parse comment attribute: " + a.a(i10));
        return null;
    }

    private static a b(a0 a0Var) {
        int p10 = a0Var.p();
        if (a0Var.p() == 1684108385) {
            int b10 = a.b(a0Var.p());
            String str = b10 == 13 ? "image/jpeg" : b10 == 14 ? "image/png" : null;
            if (str == null) {
                r.i("MetadataUtil", "Unrecognized cover art flags: " + b10);
                return null;
            }
            a0Var.U(4);
            int i10 = p10 - 16;
            byte[] bArr = new byte[i10];
            a0Var.l(bArr, 0, i10);
            return new a(str, (String) null, 3, bArr);
        }
        r.i("MetadataUtil", "Failed to parse cover art attribute");
        return null;
    }

    public static a.b c(a0 a0Var) {
        int f10 = a0Var.f() + a0Var.p();
        int p10 = a0Var.p();
        int i10 = (p10 >> 24) & 255;
        if (i10 == 169 || i10 == 253) {
            int i11 = 16777215 & p10;
            if (i11 == 6516084) {
                e a10 = a(p10, a0Var);
                a0Var.T(f10);
                return a10;
            } else if (i11 == 7233901 || i11 == 7631467) {
                m h10 = h(p10, "TIT2", a0Var);
                a0Var.T(f10);
                return h10;
            } else if (i11 == 6516589 || i11 == 7828084) {
                m h11 = h(p10, "TCOM", a0Var);
                a0Var.T(f10);
                return h11;
            } else if (i11 == 6578553) {
                m h12 = h(p10, "TDRC", a0Var);
                a0Var.T(f10);
                return h12;
            } else if (i11 == 4280916) {
                m h13 = h(p10, "TPE1", a0Var);
                a0Var.T(f10);
                return h13;
            } else if (i11 == 7630703) {
                m h14 = h(p10, "TSSE", a0Var);
                a0Var.T(f10);
                return h14;
            } else if (i11 == 6384738) {
                m h15 = h(p10, "TALB", a0Var);
                a0Var.T(f10);
                return h15;
            } else if (i11 == 7108978) {
                m h16 = h(p10, "USLT", a0Var);
                a0Var.T(f10);
                return h16;
            } else if (i11 == 6776174) {
                m h17 = h(p10, "TCON", a0Var);
                a0Var.T(f10);
                return h17;
            } else if (i11 == 6779504) {
                m h18 = h(p10, "TIT1", a0Var);
                a0Var.T(f10);
                return h18;
            }
        } else if (p10 == 1735291493) {
            try {
                return g(a0Var);
            } finally {
                a0Var.T(f10);
            }
        } else if (p10 == 1684632427) {
            m d10 = d(p10, "TPOS", a0Var);
            a0Var.T(f10);
            return d10;
        } else if (p10 == 1953655662) {
            m d11 = d(p10, "TRCK", a0Var);
            a0Var.T(f10);
            return d11;
        } else if (p10 == 1953329263) {
            i i12 = i(p10, "TBPM", a0Var, true, false);
            a0Var.T(f10);
            return i12;
        } else if (p10 == 1668311404) {
            i i13 = i(p10, "TCMP", a0Var, true, true);
            a0Var.T(f10);
            return i13;
        } else if (p10 == 1668249202) {
            k3.a b10 = b(a0Var);
            a0Var.T(f10);
            return b10;
        } else if (p10 == 1631670868) {
            m h19 = h(p10, "TPE2", a0Var);
            a0Var.T(f10);
            return h19;
        } else if (p10 == 1936682605) {
            m h20 = h(p10, "TSOT", a0Var);
            a0Var.T(f10);
            return h20;
        } else if (p10 == 1936679276) {
            m h21 = h(p10, "TSO2", a0Var);
            a0Var.T(f10);
            return h21;
        } else if (p10 == 1936679282) {
            m h22 = h(p10, "TSOA", a0Var);
            a0Var.T(f10);
            return h22;
        } else if (p10 == 1936679265) {
            m h23 = h(p10, "TSOP", a0Var);
            a0Var.T(f10);
            return h23;
        } else if (p10 == 1936679791) {
            m h24 = h(p10, "TSOC", a0Var);
            a0Var.T(f10);
            return h24;
        } else if (p10 == 1920233063) {
            i i14 = i(p10, "ITUNESADVISORY", a0Var, false, false);
            a0Var.T(f10);
            return i14;
        } else if (p10 == 1885823344) {
            i i15 = i(p10, "ITUNESGAPLESS", a0Var, false, true);
            a0Var.T(f10);
            return i15;
        } else if (p10 == 1936683886) {
            m h25 = h(p10, "TVSHOWSORT", a0Var);
            a0Var.T(f10);
            return h25;
        } else if (p10 == 1953919848) {
            m h26 = h(p10, "TVSHOW", a0Var);
            a0Var.T(f10);
            return h26;
        } else if (p10 == 757935405) {
            i e10 = e(a0Var, f10);
            a0Var.T(f10);
            return e10;
        }
        r.b("MetadataUtil", "Skipped unknown metadata entry: " + a.a(p10));
        a0Var.T(f10);
        return null;
    }

    private static m d(int i10, String str, a0 a0Var) {
        int p10 = a0Var.p();
        if (a0Var.p() == 1684108385 && p10 >= 22) {
            a0Var.U(10);
            int M = a0Var.M();
            if (M > 0) {
                String str2 = MaxReward.DEFAULT_LABEL + M;
                int M2 = a0Var.M();
                if (M2 > 0) {
                    str2 = str2 + UnityAdsConstants.DefaultUrls.AD_ASSET_PATH + M2;
                }
                return new m(str, (String) null, u.z(str2));
            }
        }
        r.i("MetadataUtil", "Failed to parse index/count attribute: " + a.a(i10));
        return null;
    }

    private static i e(a0 a0Var, int i10) {
        String str = null;
        String str2 = null;
        int i11 = -1;
        int i12 = -1;
        while (a0Var.f() < i10) {
            int f10 = a0Var.f();
            int p10 = a0Var.p();
            int p11 = a0Var.p();
            a0Var.U(4);
            if (p11 == 1835360622) {
                str = a0Var.B(p10 - 12);
            } else if (p11 == 1851878757) {
                str2 = a0Var.B(p10 - 12);
            } else {
                if (p11 == 1684108385) {
                    i11 = f10;
                    i12 = p10;
                }
                a0Var.U(p10 - 12);
            }
        }
        if (str == null || str2 == null || i11 == -1) {
            return null;
        }
        a0Var.T(i11);
        a0Var.U(16);
        return new j(str, str2, a0Var.B(i12 - 16));
    }

    public static l3.a f(a0 a0Var, int i10, String str) {
        while (true) {
            int f10 = a0Var.f();
            if (f10 >= i10) {
                return null;
            }
            int p10 = a0Var.p();
            if (a0Var.p() == 1684108385) {
                int p11 = a0Var.p();
                int p12 = a0Var.p();
                int i11 = p10 - 16;
                byte[] bArr = new byte[i11];
                a0Var.l(bArr, 0, i11);
                return new l3.a(str, bArr, p12, p11);
            }
            a0Var.T(f10 + p10);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0014  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static k3.m g(k4.a0 r3) {
        /*
            int r3 = j(r3)
            r0 = 0
            if (r3 <= 0) goto L_0x0011
            java.lang.String[] r1 = f277a
            int r2 = r1.length
            if (r3 > r2) goto L_0x0011
            int r3 = r3 + -1
            r3 = r1[r3]
            goto L_0x0012
        L_0x0011:
            r3 = r0
        L_0x0012:
            if (r3 == 0) goto L_0x0020
            k3.m r1 = new k3.m
            s6.u r3 = s6.u.z(r3)
            java.lang.String r2 = "TCON"
            r1.<init>(r2, r0, r3)
            return r1
        L_0x0020:
            java.lang.String r3 = "MetadataUtil"
            java.lang.String r1 = "Failed to parse standard genre code"
            k4.r.i(r3, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a3.h.g(k4.a0):k3.m");
    }

    private static m h(int i10, String str, a0 a0Var) {
        int p10 = a0Var.p();
        if (a0Var.p() == 1684108385) {
            a0Var.U(8);
            return new m(str, (String) null, u.z(a0Var.B(p10 - 16)));
        }
        r.i("MetadataUtil", "Failed to parse text attribute: " + a.a(i10));
        return null;
    }

    private static i i(int i10, String str, a0 a0Var, boolean z10, boolean z11) {
        int j10 = j(a0Var);
        if (z11) {
            j10 = Math.min(1, j10);
        }
        if (j10 < 0) {
            r.i("MetadataUtil", "Failed to parse uint8 attribute: " + a.a(i10));
            return null;
        } else if (z10) {
            return new m(str, (String) null, u.z(Integer.toString(j10)));
        } else {
            return new e("und", str, Integer.toString(j10));
        }
    }

    private static int j(a0 a0Var) {
        a0Var.U(4);
        if (a0Var.p() == 1684108385) {
            a0Var.U(8);
            return a0Var.G();
        }
        r.i("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }

    public static void k(int i10, x xVar, r1.b bVar) {
        if (i10 == 1 && xVar.a()) {
            bVar.P(xVar.f22484a).Q(xVar.f22485b);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        if (r6 != null) goto L_0x003d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0040 A[LOOP:1: B:17:0x003e->B:18:0x0040, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void l(int r5, f3.a r6, f3.a r7, n2.r1.b r8, f3.a... r9) {
        /*
            f3.a r0 = new f3.a
            r1 = 0
            f3.a$b[] r2 = new f3.a.b[r1]
            r0.<init>((f3.a.b[]) r2)
            r2 = 1
            if (r5 != r2) goto L_0x000e
            if (r6 == 0) goto L_0x003c
            goto L_0x003d
        L_0x000e:
            r6 = 2
            if (r5 != r6) goto L_0x003c
            if (r7 == 0) goto L_0x003c
            r5 = 0
        L_0x0014:
            int r6 = r7.e()
            if (r5 >= r6) goto L_0x003c
            f3.a$b r6 = r7.d(r5)
            boolean r3 = r6 instanceof l3.a
            if (r3 == 0) goto L_0x0039
            l3.a r6 = (l3.a) r6
            java.lang.String r3 = r6.f19877a
            java.lang.String r4 = "com.android.capture.fps"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x0039
            f3.a r5 = new f3.a
            f3.a$b[] r7 = new f3.a.b[r2]
            r7[r1] = r6
            r5.<init>((f3.a.b[]) r7)
            r6 = r5
            goto L_0x003d
        L_0x0039:
            int r5 = r5 + 1
            goto L_0x0014
        L_0x003c:
            r6 = r0
        L_0x003d:
            int r5 = r9.length
        L_0x003e:
            if (r1 >= r5) goto L_0x0049
            r7 = r9[r1]
            f3.a r6 = r6.b(r7)
            int r1 = r1 + 1
            goto L_0x003e
        L_0x0049:
            int r5 = r6.e()
            if (r5 <= 0) goto L_0x0052
            r8.Z(r6)
        L_0x0052:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a3.h.l(int, f3.a, f3.a, n2.r1$b, f3.a[]):void");
    }
}
