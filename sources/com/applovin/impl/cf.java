package com.applovin.impl;

import com.applovin.impl.d9;
import com.applovin.impl.we;
import com.applovin.mediation.MaxReward;
import com.unity3d.services.UnityAdsConstants;

abstract class cf {

    /* renamed from: a  reason: collision with root package name */
    static final String[] f6980a = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};

    private static s3 a(int i10, yg ygVar) {
        int j10 = ygVar.j();
        if (ygVar.j() == 1684108385) {
            ygVar.g(8);
            String b10 = ygVar.b(j10 - 16);
            return new s3("und", b10, b10);
        }
        kc.d("MetadataUtil", "Failed to parse comment attribute: " + i1.a(i10));
        return null;
    }

    public static we.b b(yg ygVar) {
        int d10 = ygVar.d() + ygVar.j();
        int j10 = ygVar.j();
        int i10 = (j10 >> 24) & 255;
        if (i10 == 169 || i10 == 253) {
            int i11 = 16777215 & j10;
            if (i11 == 6516084) {
                s3 a10 = a(j10, ygVar);
                ygVar.f(d10);
                return a10;
            } else if (i11 == 7233901 || i11 == 7631467) {
                ao b10 = b(j10, "TIT2", ygVar);
                ygVar.f(d10);
                return b10;
            } else if (i11 == 6516589 || i11 == 7828084) {
                ao b11 = b(j10, "TCOM", ygVar);
                ygVar.f(d10);
                return b11;
            } else if (i11 == 6578553) {
                ao b12 = b(j10, "TDRC", ygVar);
                ygVar.f(d10);
                return b12;
            } else if (i11 == 4280916) {
                ao b13 = b(j10, "TPE1", ygVar);
                ygVar.f(d10);
                return b13;
            } else if (i11 == 7630703) {
                ao b14 = b(j10, "TSSE", ygVar);
                ygVar.f(d10);
                return b14;
            } else if (i11 == 6384738) {
                ao b15 = b(j10, "TALB", ygVar);
                ygVar.f(d10);
                return b15;
            } else if (i11 == 7108978) {
                ao b16 = b(j10, "USLT", ygVar);
                ygVar.f(d10);
                return b16;
            } else if (i11 == 6776174) {
                ao b17 = b(j10, "TCON", ygVar);
                ygVar.f(d10);
                return b17;
            } else if (i11 == 6779504) {
                ao b18 = b(j10, "TIT1", ygVar);
                ygVar.f(d10);
                return b18;
            }
        } else if (j10 == 1735291493) {
            try {
                return c(ygVar);
            } finally {
                ygVar.f(d10);
            }
        } else if (j10 == 1684632427) {
            ao a11 = a(j10, "TPOS", ygVar);
            ygVar.f(d10);
            return a11;
        } else if (j10 == 1953655662) {
            ao a12 = a(j10, "TRCK", ygVar);
            ygVar.f(d10);
            return a12;
        } else if (j10 == 1953329263) {
            ua a13 = a(j10, "TBPM", ygVar, true, false);
            ygVar.f(d10);
            return a13;
        } else if (j10 == 1668311404) {
            ua a14 = a(j10, "TCMP", ygVar, true, true);
            ygVar.f(d10);
            return a14;
        } else if (j10 == 1668249202) {
            u0 a15 = a(ygVar);
            ygVar.f(d10);
            return a15;
        } else if (j10 == 1631670868) {
            ao b19 = b(j10, "TPE2", ygVar);
            ygVar.f(d10);
            return b19;
        } else if (j10 == 1936682605) {
            ao b20 = b(j10, "TSOT", ygVar);
            ygVar.f(d10);
            return b20;
        } else if (j10 == 1936679276) {
            ao b21 = b(j10, "TSO2", ygVar);
            ygVar.f(d10);
            return b21;
        } else if (j10 == 1936679282) {
            ao b22 = b(j10, "TSOA", ygVar);
            ygVar.f(d10);
            return b22;
        } else if (j10 == 1936679265) {
            ao b23 = b(j10, "TSOP", ygVar);
            ygVar.f(d10);
            return b23;
        } else if (j10 == 1936679791) {
            ao b24 = b(j10, "TSOC", ygVar);
            ygVar.f(d10);
            return b24;
        } else if (j10 == 1920233063) {
            ua a16 = a(j10, "ITUNESADVISORY", ygVar, false, false);
            ygVar.f(d10);
            return a16;
        } else if (j10 == 1885823344) {
            ua a17 = a(j10, "ITUNESGAPLESS", ygVar, false, true);
            ygVar.f(d10);
            return a17;
        } else if (j10 == 1936683886) {
            ao b25 = b(j10, "TVSHOWSORT", ygVar);
            ygVar.f(d10);
            return b25;
        } else if (j10 == 1953919848) {
            ao b26 = b(j10, "TVSHOW", ygVar);
            ygVar.f(d10);
            return b26;
        } else if (j10 == 757935405) {
            ua a18 = a(ygVar, d10);
            ygVar.f(d10);
            return a18;
        }
        kc.a("MetadataUtil", "Skipped unknown metadata entry: " + i1.a(j10));
        ygVar.f(d10);
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0014  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.applovin.impl.ao c(com.applovin.impl.yg r3) {
        /*
            int r3 = d(r3)
            r0 = 0
            if (r3 <= 0) goto L_0x0011
            java.lang.String[] r1 = f6980a
            int r2 = r1.length
            if (r3 > r2) goto L_0x0011
            int r3 = r3 + -1
            r3 = r1[r3]
            goto L_0x0012
        L_0x0011:
            r3 = r0
        L_0x0012:
            if (r3 == 0) goto L_0x001c
            com.applovin.impl.ao r1 = new com.applovin.impl.ao
            java.lang.String r2 = "TCON"
            r1.<init>(r2, r0, r3)
            return r1
        L_0x001c:
            java.lang.String r3 = "MetadataUtil"
            java.lang.String r1 = "Failed to parse standard genre code"
            com.applovin.impl.kc.d(r3, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.cf.c(com.applovin.impl.yg):com.applovin.impl.ao");
    }

    private static int d(yg ygVar) {
        ygVar.g(4);
        if (ygVar.j() == 1684108385) {
            ygVar.g(8);
            return ygVar.w();
        }
        kc.d("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }

    private static u0 a(yg ygVar) {
        int j10 = ygVar.j();
        if (ygVar.j() == 1684108385) {
            int b10 = i1.b(ygVar.j());
            String str = b10 == 13 ? "image/jpeg" : b10 == 14 ? "image/png" : null;
            if (str == null) {
                kc.d("MetadataUtil", "Unrecognized cover art flags: " + b10);
                return null;
            }
            ygVar.g(4);
            int i10 = j10 - 16;
            byte[] bArr = new byte[i10];
            ygVar.a(bArr, 0, i10);
            return new u0(str, (String) null, 3, bArr);
        }
        kc.d("MetadataUtil", "Failed to parse cover art attribute");
        return null;
    }

    private static ao a(int i10, String str, yg ygVar) {
        int j10 = ygVar.j();
        if (ygVar.j() == 1684108385 && j10 >= 22) {
            ygVar.g(10);
            int C = ygVar.C();
            if (C > 0) {
                String str2 = MaxReward.DEFAULT_LABEL + C;
                int C2 = ygVar.C();
                if (C2 > 0) {
                    str2 = str2 + UnityAdsConstants.DefaultUrls.AD_ASSET_PATH + C2;
                }
                return new ao(str, (String) null, str2);
            }
        }
        kc.d("MetadataUtil", "Failed to parse index/count attribute: " + i1.a(i10));
        return null;
    }

    private static ua a(yg ygVar, int i10) {
        String str = null;
        String str2 = null;
        int i11 = -1;
        int i12 = -1;
        while (ygVar.d() < i10) {
            int d10 = ygVar.d();
            int j10 = ygVar.j();
            int j11 = ygVar.j();
            ygVar.g(4);
            if (j11 == 1835360622) {
                str = ygVar.b(j10 - 12);
            } else if (j11 == 1851878757) {
                str2 = ygVar.b(j10 - 12);
            } else {
                if (j11 == 1684108385) {
                    i11 = d10;
                    i12 = j10;
                }
                ygVar.g(j10 - 12);
            }
        }
        if (str == null || str2 == null || i11 == -1) {
            return null;
        }
        ygVar.f(i11);
        ygVar.g(16);
        return new nb(str, str2, ygVar.b(i12 - 16));
    }

    public static ad a(yg ygVar, int i10, String str) {
        while (true) {
            int d10 = ygVar.d();
            if (d10 >= i10) {
                return null;
            }
            int j10 = ygVar.j();
            if (ygVar.j() == 1684108385) {
                int j11 = ygVar.j();
                int j12 = ygVar.j();
                int i11 = j10 - 16;
                byte[] bArr = new byte[i11];
                ygVar.a(bArr, 0, i11);
                return new ad(str, bArr, j12, j11);
            }
            ygVar.f(d10 + j10);
        }
    }

    private static ua a(int i10, String str, yg ygVar, boolean z10, boolean z11) {
        int d10 = d(ygVar);
        if (z11) {
            d10 = Math.min(1, d10);
        }
        if (d10 < 0) {
            kc.d("MetadataUtil", "Failed to parse uint8 attribute: " + i1.a(i10));
            return null;
        } else if (z10) {
            return new ao(str, (String) null, Integer.toString(d10));
        } else {
            return new s3("und", str, Integer.toString(d10));
        }
    }

    public static void a(int i10, x9 x9Var, d9.b bVar) {
        if (i10 == 1 && x9Var.a()) {
            bVar.e(x9Var.f13304a).f(x9Var.f13305b);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        if (r6 != null) goto L_0x003d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0040 A[LOOP:1: B:17:0x003e->B:18:0x0040, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(int r5, com.applovin.impl.we r6, com.applovin.impl.we r7, com.applovin.impl.d9.b r8, com.applovin.impl.we... r9) {
        /*
            com.applovin.impl.we r0 = new com.applovin.impl.we
            r1 = 0
            com.applovin.impl.we$b[] r2 = new com.applovin.impl.we.b[r1]
            r0.<init>((com.applovin.impl.we.b[]) r2)
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
            int r6 = r7.c()
            if (r5 >= r6) goto L_0x003c
            com.applovin.impl.we$b r6 = r7.a((int) r5)
            boolean r3 = r6 instanceof com.applovin.impl.ad
            if (r3 == 0) goto L_0x0039
            com.applovin.impl.ad r6 = (com.applovin.impl.ad) r6
            java.lang.String r3 = r6.f6368a
            java.lang.String r4 = "com.android.capture.fps"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x0039
            com.applovin.impl.we r5 = new com.applovin.impl.we
            com.applovin.impl.we$b[] r7 = new com.applovin.impl.we.b[r2]
            r7[r1] = r6
            r5.<init>((com.applovin.impl.we.b[]) r7)
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
            com.applovin.impl.we r6 = r6.a((com.applovin.impl.we) r7)
            int r1 = r1 + 1
            goto L_0x003e
        L_0x0049:
            int r5 = r6.c()
            if (r5 <= 0) goto L_0x0052
            r8.a((com.applovin.impl.we) r6)
        L_0x0052:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.cf.a(int, com.applovin.impl.we, com.applovin.impl.we, com.applovin.impl.d9$b, com.applovin.impl.we[]):void");
    }

    private static ao b(int i10, String str, yg ygVar) {
        int j10 = ygVar.j();
        if (ygVar.j() == 1684108385) {
            ygVar.g(8);
            return new ao(str, (String) null, ygVar.b(j10 - 16));
        }
        kc.d("MetadataUtil", "Failed to parse text attribute: " + i1.a(i10));
        return null;
    }
}
