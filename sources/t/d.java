package t;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: KeyCycleOscillator */
public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    private a f22526a;

    /* renamed from: b  reason: collision with root package name */
    private String f22527b;

    /* renamed from: c  reason: collision with root package name */
    private int f22528c = 0;

    /* renamed from: d  reason: collision with root package name */
    private String f22529d = null;

    /* renamed from: e  reason: collision with root package name */
    public int f22530e = 0;

    /* renamed from: f  reason: collision with root package name */
    ArrayList<b> f22531f = new ArrayList<>();

    /* compiled from: KeyCycleOscillator */
    static class a {
        public double a(float f10) {
            throw null;
        }
    }

    /* compiled from: KeyCycleOscillator */
    static class b {

        /* renamed from: a  reason: collision with root package name */
        int f22532a;

        /* renamed from: b  reason: collision with root package name */
        float f22533b;
    }

    public float a(float f10) {
        return (float) this.f22526a.a(f10);
    }

    public String toString() {
        String str = this.f22527b;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        Iterator<b> it = this.f22531f.iterator();
        while (it.hasNext()) {
            b next = it.next();
            str = str + "[" + next.f22532a + " , " + decimalFormat.format((double) next.f22533b) + "] ";
        }
        return str;
    }
}
