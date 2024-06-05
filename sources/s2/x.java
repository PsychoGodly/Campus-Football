package s2;

import f3.a;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k3.e;
import k3.j;
import k4.n0;

/* compiled from: GaplessInfoHolder */
public final class x {

    /* renamed from: c  reason: collision with root package name */
    private static final Pattern f22483c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a  reason: collision with root package name */
    public int f22484a = -1;

    /* renamed from: b  reason: collision with root package name */
    public int f22485b = -1;

    private boolean b(String str) {
        Matcher matcher = f22483c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            int parseInt = Integer.parseInt((String) n0.j(matcher.group(1)), 16);
            int parseInt2 = Integer.parseInt((String) n0.j(matcher.group(2)), 16);
            if (parseInt <= 0 && parseInt2 <= 0) {
                return false;
            }
            this.f22484a = parseInt;
            this.f22485b = parseInt2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public boolean a() {
        return (this.f22484a == -1 || this.f22485b == -1) ? false : true;
    }

    public boolean c(a aVar) {
        for (int i10 = 0; i10 < aVar.e(); i10++) {
            a.b d10 = aVar.d(i10);
            if (d10 instanceof e) {
                e eVar = (e) d10;
                if ("iTunSMPB".equals(eVar.f19643c) && b(eVar.f19644d)) {
                    return true;
                }
            } else if (d10 instanceof j) {
                j jVar = (j) d10;
                if ("com.apple.iTunes".equals(jVar.f19655b) && "iTunSMPB".equals(jVar.f19656c) && b(jVar.f19657d)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    public boolean d(int i10) {
        int i11 = i10 >> 12;
        int i12 = i10 & 4095;
        if (i11 <= 0 && i12 <= 0) {
            return false;
        }
        this.f22484a = i11;
        this.f22485b = i12;
        return true;
    }
}
