package h4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k4.a0;
import k4.n0;
import n2.y2;

/* compiled from: WebvttParserUtil */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    private static final Pattern f18796a = Pattern.compile("^NOTE([ \t].*)?$");

    public static Matcher a(a0 a0Var) {
        String r10;
        while (true) {
            String r11 = a0Var.r();
            if (r11 == null) {
                return null;
            }
            if (f18796a.matcher(r11).matches()) {
                do {
                    r10 = a0Var.r();
                    if (r10 == null) {
                        break;
                    }
                } while (r10.isEmpty());
            } else {
                Matcher matcher = f.f18770a.matcher(r11);
                if (matcher.matches()) {
                    return matcher;
                }
            }
        }
    }

    public static boolean b(a0 a0Var) {
        String r10 = a0Var.r();
        return r10 != null && r10.startsWith("WEBVTT");
    }

    public static float c(String str) throws NumberFormatException {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long d(String str) throws NumberFormatException {
        String[] S0 = n0.S0(str, "\\.");
        long j10 = 0;
        for (String parseLong : n0.R0(S0[0], ":")) {
            j10 = (j10 * 60) + Long.parseLong(parseLong);
        }
        long j11 = j10 * 1000;
        if (S0.length == 2) {
            j11 += Long.parseLong(S0[1]);
        }
        return j11 * 1000;
    }

    public static void e(a0 a0Var) throws y2 {
        int f10 = a0Var.f();
        if (!b(a0Var)) {
            a0Var.T(f10);
            throw y2.a("Expected WEBVTT. Got " + a0Var.r(), (Throwable) null);
        }
    }
}
