package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: ConstraintLayoutStates */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f2245a;

    /* renamed from: b  reason: collision with root package name */
    e f2246b;

    /* renamed from: c  reason: collision with root package name */
    int f2247c = -1;

    /* renamed from: d  reason: collision with root package name */
    int f2248d = -1;

    /* renamed from: e  reason: collision with root package name */
    private SparseArray<a> f2249e = new SparseArray<>();

    /* renamed from: f  reason: collision with root package name */
    private SparseArray<e> f2250f = new SparseArray<>();

    /* compiled from: ConstraintLayoutStates */
    static class a {

        /* renamed from: a  reason: collision with root package name */
        int f2251a;

        /* renamed from: b  reason: collision with root package name */
        ArrayList<b> f2252b = new ArrayList<>();

        /* renamed from: c  reason: collision with root package name */
        int f2253c = -1;

        /* renamed from: d  reason: collision with root package name */
        e f2254d;

        public a(Context context, XmlPullParser xmlPullParser) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), k.U6);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == k.V6) {
                    this.f2251a = obtainStyledAttributes.getResourceId(index, this.f2251a);
                } else if (index == k.W6) {
                    this.f2253c = obtainStyledAttributes.getResourceId(index, this.f2253c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f2253c);
                    context.getResources().getResourceName(this.f2253c);
                    if ("layout".equals(resourceTypeName)) {
                        e eVar = new e();
                        this.f2254d = eVar;
                        eVar.e(context, this.f2253c);
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }

        /* access modifiers changed from: package-private */
        public void a(b bVar) {
            this.f2252b.add(bVar);
        }

        public int b(float f10, float f11) {
            for (int i10 = 0; i10 < this.f2252b.size(); i10++) {
                if (this.f2252b.get(i10).a(f10, f11)) {
                    return i10;
                }
            }
            return -1;
        }
    }

    /* compiled from: ConstraintLayoutStates */
    static class b {

        /* renamed from: a  reason: collision with root package name */
        float f2255a = Float.NaN;

        /* renamed from: b  reason: collision with root package name */
        float f2256b = Float.NaN;

        /* renamed from: c  reason: collision with root package name */
        float f2257c = Float.NaN;

        /* renamed from: d  reason: collision with root package name */
        float f2258d = Float.NaN;

        /* renamed from: e  reason: collision with root package name */
        int f2259e = -1;

        /* renamed from: f  reason: collision with root package name */
        e f2260f;

        public b(Context context, XmlPullParser xmlPullParser) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), k.f2546s7);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == k.f2555t7) {
                    this.f2259e = obtainStyledAttributes.getResourceId(index, this.f2259e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f2259e);
                    context.getResources().getResourceName(this.f2259e);
                    if ("layout".equals(resourceTypeName)) {
                        e eVar = new e();
                        this.f2260f = eVar;
                        eVar.e(context, this.f2259e);
                    }
                } else if (index == k.f2564u7) {
                    this.f2258d = obtainStyledAttributes.getDimension(index, this.f2258d);
                } else if (index == k.f2573v7) {
                    this.f2256b = obtainStyledAttributes.getDimension(index, this.f2256b);
                } else if (index == k.f2582w7) {
                    this.f2257c = obtainStyledAttributes.getDimension(index, this.f2257c);
                } else if (index == k.f2591x7) {
                    this.f2255a = obtainStyledAttributes.getDimension(index, this.f2255a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            obtainStyledAttributes.recycle();
        }

        /* access modifiers changed from: package-private */
        public boolean a(float f10, float f11) {
            if (!Float.isNaN(this.f2255a) && f10 < this.f2255a) {
                return false;
            }
            if (!Float.isNaN(this.f2256b) && f11 < this.f2256b) {
                return false;
            }
            if (!Float.isNaN(this.f2257c) && f10 > this.f2257c) {
                return false;
            }
            if (Float.isNaN(this.f2258d) || f11 <= this.f2258d) {
                return true;
            }
            return false;
        }
    }

    d(Context context, ConstraintLayout constraintLayout, int i10) {
        this.f2245a = constraintLayout;
        a(context, i10);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(android.content.Context r9, int r10) {
        /*
            r8 = this;
            android.content.res.Resources r0 = r9.getResources()
            android.content.res.XmlResourceParser r10 = r0.getXml(r10)
            r0 = 0
            int r1 = r10.getEventType()     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
        L_0x000d:
            r2 = 1
            if (r1 == r2) goto L_0x008c
            if (r1 == 0) goto L_0x007b
            r3 = 2
            if (r1 == r3) goto L_0x0017
            goto L_0x007e
        L_0x0017:
            java.lang.String r1 = r10.getName()     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
            r4 = -1
            int r5 = r1.hashCode()     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
            r6 = 4
            r7 = 3
            switch(r5) {
                case -1349929691: goto L_0x004d;
                case 80204913: goto L_0x0043;
                case 1382829617: goto L_0x003a;
                case 1657696882: goto L_0x0030;
                case 1901439077: goto L_0x0026;
                default: goto L_0x0025;
            }     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
        L_0x0025:
            goto L_0x0057
        L_0x0026:
            java.lang.String r2 = "Variant"
            boolean r1 = r1.equals(r2)     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
            if (r1 == 0) goto L_0x0057
            r2 = 3
            goto L_0x0058
        L_0x0030:
            java.lang.String r2 = "layoutDescription"
            boolean r1 = r1.equals(r2)     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
            if (r1 == 0) goto L_0x0057
            r2 = 0
            goto L_0x0058
        L_0x003a:
            java.lang.String r5 = "StateSet"
            boolean r1 = r1.equals(r5)     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
            if (r1 == 0) goto L_0x0057
            goto L_0x0058
        L_0x0043:
            java.lang.String r2 = "State"
            boolean r1 = r1.equals(r2)     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
            if (r1 == 0) goto L_0x0057
            r2 = 2
            goto L_0x0058
        L_0x004d:
            java.lang.String r2 = "ConstraintSet"
            boolean r1 = r1.equals(r2)     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
            if (r1 == 0) goto L_0x0057
            r2 = 4
            goto L_0x0058
        L_0x0057:
            r2 = -1
        L_0x0058:
            if (r2 == r3) goto L_0x006e
            if (r2 == r7) goto L_0x0063
            if (r2 == r6) goto L_0x005f
            goto L_0x007e
        L_0x005f:
            r8.b(r9, r10)     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
            goto L_0x007e
        L_0x0063:
            androidx.constraintlayout.widget.d$b r1 = new androidx.constraintlayout.widget.d$b     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
            r1.<init>(r9, r10)     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
            if (r0 == 0) goto L_0x007e
            r0.a(r1)     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
            goto L_0x007e
        L_0x006e:
            androidx.constraintlayout.widget.d$a r0 = new androidx.constraintlayout.widget.d$a     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
            r0.<init>(r9, r10)     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
            android.util.SparseArray<androidx.constraintlayout.widget.d$a> r1 = r8.f2249e     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
            int r2 = r0.f2251a     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
            r1.put(r2, r0)     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
            goto L_0x007e
        L_0x007b:
            r10.getName()     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
        L_0x007e:
            int r1 = r10.next()     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
            goto L_0x000d
        L_0x0083:
            r9 = move-exception
            r9.printStackTrace()
            goto L_0x008c
        L_0x0088:
            r9 = move-exception
            r9.printStackTrace()
        L_0x008c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.d.a(android.content.Context, int):void");
    }

    private void b(Context context, XmlPullParser xmlPullParser) {
        int i10;
        e eVar = new e();
        int attributeCount = xmlPullParser.getAttributeCount();
        int i11 = 0;
        while (i11 < attributeCount) {
            String attributeName = xmlPullParser.getAttributeName(i11);
            String attributeValue = xmlPullParser.getAttributeValue(i11);
            if (attributeName == null || attributeValue == null || !"id".equals(attributeName)) {
                i11++;
            } else {
                if (attributeValue.contains(UnityAdsConstants.DefaultUrls.AD_ASSET_PATH)) {
                    i10 = context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName());
                } else {
                    i10 = -1;
                }
                if (i10 == -1) {
                    if (attributeValue.length() > 1) {
                        i10 = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                eVar.k(context, xmlPullParser);
                this.f2250f.put(i10, eVar);
                return;
            }
        }
    }

    public void c(g gVar) {
    }

    public void d(int i10, float f10, float f11) {
        e eVar;
        a aVar;
        int b10;
        e eVar2;
        int i11 = this.f2247c;
        if (i11 == i10) {
            if (i10 == -1) {
                aVar = this.f2249e.valueAt(0);
            } else {
                aVar = this.f2249e.get(i11);
            }
            int i12 = this.f2248d;
            if ((i12 == -1 || !aVar.f2252b.get(i12).a(f10, f11)) && this.f2248d != (b10 = aVar.b(f10, f11))) {
                if (b10 == -1) {
                    eVar2 = this.f2246b;
                } else {
                    eVar2 = aVar.f2252b.get(b10).f2260f;
                }
                if (b10 != -1) {
                    int i13 = aVar.f2252b.get(b10).f2259e;
                }
                if (eVar2 != null) {
                    this.f2248d = b10;
                    eVar2.c(this.f2245a);
                    return;
                }
                return;
            }
            return;
        }
        this.f2247c = i10;
        a aVar2 = this.f2249e.get(i10);
        int b11 = aVar2.b(f10, f11);
        if (b11 == -1) {
            eVar = aVar2.f2254d;
        } else {
            eVar = aVar2.f2252b.get(b11).f2260f;
        }
        if (b11 != -1) {
            int i14 = aVar2.f2252b.get(b11).f2259e;
        }
        if (eVar == null) {
            Log.v("ConstraintLayoutStates", "NO Constraint set found ! id=" + i10 + ", dim =" + f10 + ", " + f11);
            return;
        }
        this.f2248d = b11;
        eVar.c(this.f2245a);
    }
}
