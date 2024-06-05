package ff;

import cf.c;
import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* compiled from: HttpDate */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private static final ThreadLocal<DateFormat> f32775a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final String[] f32776b;

    /* renamed from: c  reason: collision with root package name */
    private static final DateFormat[] f32777c;

    /* compiled from: HttpDate */
    class a extends ThreadLocal<DateFormat> {
        a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public DateFormat initialValue() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            simpleDateFormat.setLenient(false);
            simpleDateFormat.setTimeZone(c.f31998p);
            return simpleDateFormat;
        }
    }

    static {
        String[] strArr = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};
        f32776b = strArr;
        f32777c = new DateFormat[strArr.length];
    }

    public static String a(Date date) {
        return f32775a.get().format(date);
    }

    public static Date b(String str) {
        if (str.length() == 0) {
            return null;
        }
        ParsePosition parsePosition = new ParsePosition(0);
        Date parse = f32775a.get().parse(str, parsePosition);
        if (parsePosition.getIndex() == str.length()) {
            return parse;
        }
        String[] strArr = f32776b;
        synchronized (strArr) {
            int length = strArr.length;
            for (int i10 = 0; i10 < length; i10++) {
                DateFormat[] dateFormatArr = f32777c;
                DateFormat dateFormat = dateFormatArr[i10];
                if (dateFormat == null) {
                    dateFormat = new SimpleDateFormat(f32776b[i10], Locale.US);
                    dateFormat.setTimeZone(c.f31998p);
                    dateFormatArr[i10] = dateFormat;
                }
                parsePosition.setIndex(0);
                Date parse2 = dateFormat.parse(str, parsePosition);
                if (parsePosition.getIndex() != 0) {
                    return parse2;
                }
            }
            return null;
        }
    }
}
