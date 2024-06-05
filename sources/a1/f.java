package a1;

import android.database.Cursor;
import android.os.Build;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* compiled from: TableInfo */
public class f {

    /* renamed from: a  reason: collision with root package name */
    public final String f8a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, a> f9b;

    /* renamed from: c  reason: collision with root package name */
    public final Set<b> f10c;

    /* renamed from: d  reason: collision with root package name */
    public final Set<d> f11d;

    /* compiled from: TableInfo */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f12a;

        /* renamed from: b  reason: collision with root package name */
        public final String f13b;

        /* renamed from: c  reason: collision with root package name */
        public final int f14c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f15d;

        /* renamed from: e  reason: collision with root package name */
        public final int f16e;

        /* renamed from: f  reason: collision with root package name */
        public final String f17f;

        /* renamed from: g  reason: collision with root package name */
        private final int f18g;

        public a(String str, String str2, boolean z10, int i10, String str3, int i11) {
            this.f12a = str;
            this.f13b = str2;
            this.f15d = z10;
            this.f16e = i10;
            this.f14c = a(str2);
            this.f17f = str3;
            this.f18g = i11;
        }

        private static int a(String str) {
            if (str == null) {
                return 5;
            }
            String upperCase = str.toUpperCase(Locale.US);
            if (upperCase.contains("INT")) {
                return 3;
            }
            if (upperCase.contains("CHAR") || upperCase.contains("CLOB") || upperCase.contains(AdPreferences.TYPE_TEXT)) {
                return 2;
            }
            if (upperCase.contains("BLOB")) {
                return 5;
            }
            return (upperCase.contains("REAL") || upperCase.contains("FLOA") || upperCase.contains("DOUB")) ? 4 : 1;
        }

        public boolean b() {
            return this.f16e > 0;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (Build.VERSION.SDK_INT >= 20) {
                if (this.f16e != aVar.f16e) {
                    return false;
                }
            } else if (b() != aVar.b()) {
                return false;
            }
            if (!this.f12a.equals(aVar.f12a) || this.f15d != aVar.f15d) {
                return false;
            }
            if (this.f18g == 1 && aVar.f18g == 2 && (str3 = this.f17f) != null && !str3.equals(aVar.f17f)) {
                return false;
            }
            if (this.f18g == 2 && aVar.f18g == 1 && (str2 = aVar.f17f) != null && !str2.equals(this.f17f)) {
                return false;
            }
            int i10 = this.f18g;
            if ((i10 == 0 || i10 != aVar.f18g || ((str = this.f17f) == null ? aVar.f17f == null : str.equals(aVar.f17f))) && this.f14c == aVar.f14c) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((((this.f12a.hashCode() * 31) + this.f14c) * 31) + (this.f15d ? 1231 : 1237)) * 31) + this.f16e;
        }

        public String toString() {
            return "Column{name='" + this.f12a + '\'' + ", type='" + this.f13b + '\'' + ", affinity='" + this.f14c + '\'' + ", notNull=" + this.f15d + ", primaryKeyPosition=" + this.f16e + ", defaultValue='" + this.f17f + '\'' + '}';
        }
    }

    /* compiled from: TableInfo */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f19a;

        /* renamed from: b  reason: collision with root package name */
        public final String f20b;

        /* renamed from: c  reason: collision with root package name */
        public final String f21c;

        /* renamed from: d  reason: collision with root package name */
        public final List<String> f22d;

        /* renamed from: e  reason: collision with root package name */
        public final List<String> f23e;

        public b(String str, String str2, String str3, List<String> list, List<String> list2) {
            this.f19a = str;
            this.f20b = str2;
            this.f21c = str3;
            this.f22d = Collections.unmodifiableList(list);
            this.f23e = Collections.unmodifiableList(list2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f19a.equals(bVar.f19a) && this.f20b.equals(bVar.f20b) && this.f21c.equals(bVar.f21c) && this.f22d.equals(bVar.f22d)) {
                return this.f23e.equals(bVar.f23e);
            }
            return false;
        }

        public int hashCode() {
            return (((((((this.f19a.hashCode() * 31) + this.f20b.hashCode()) * 31) + this.f21c.hashCode()) * 31) + this.f22d.hashCode()) * 31) + this.f23e.hashCode();
        }

        public String toString() {
            return "ForeignKey{referenceTable='" + this.f19a + '\'' + ", onDelete='" + this.f20b + '\'' + ", onUpdate='" + this.f21c + '\'' + ", columnNames=" + this.f22d + ", referenceColumnNames=" + this.f23e + '}';
        }
    }

    /* compiled from: TableInfo */
    static class c implements Comparable<c> {

        /* renamed from: a  reason: collision with root package name */
        final int f24a;

        /* renamed from: b  reason: collision with root package name */
        final int f25b;

        /* renamed from: c  reason: collision with root package name */
        final String f26c;

        /* renamed from: d  reason: collision with root package name */
        final String f27d;

        c(int i10, int i11, String str, String str2) {
            this.f24a = i10;
            this.f25b = i11;
            this.f26c = str;
            this.f27d = str2;
        }

        /* renamed from: a */
        public int compareTo(c cVar) {
            int i10 = this.f24a - cVar.f24a;
            return i10 == 0 ? this.f25b - cVar.f25b : i10;
        }
    }

    /* compiled from: TableInfo */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final String f28a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f29b;

        /* renamed from: c  reason: collision with root package name */
        public final List<String> f30c;

        public d(String str, boolean z10, List<String> list) {
            this.f28a = str;
            this.f29b = z10;
            this.f30c = list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            if (this.f29b != dVar.f29b || !this.f30c.equals(dVar.f30c)) {
                return false;
            }
            if (this.f28a.startsWith("index_")) {
                return dVar.f28a.startsWith("index_");
            }
            return this.f28a.equals(dVar.f28a);
        }

        public int hashCode() {
            int i10;
            if (this.f28a.startsWith("index_")) {
                i10 = -1184239155;
            } else {
                i10 = this.f28a.hashCode();
            }
            return (((i10 * 31) + (this.f29b ? 1 : 0)) * 31) + this.f30c.hashCode();
        }

        public String toString() {
            return "Index{name='" + this.f28a + '\'' + ", unique=" + this.f29b + ", columns=" + this.f30c + '}';
        }
    }

    public f(String str, Map<String, a> map, Set<b> set, Set<d> set2) {
        Set<d> set3;
        this.f8a = str;
        this.f9b = Collections.unmodifiableMap(map);
        this.f10c = Collections.unmodifiableSet(set);
        if (set2 == null) {
            set3 = null;
        } else {
            set3 = Collections.unmodifiableSet(set2);
        }
        this.f11d = set3;
    }

    public static f a(c1.b bVar, String str) {
        return new f(str, b(bVar, str), d(bVar, str), f(bVar, str));
    }

    private static Map<String, a> b(c1.b bVar, String str) {
        Cursor V = bVar.V("PRAGMA table_info(`" + str + "`)");
        HashMap hashMap = new HashMap();
        try {
            if (V.getColumnCount() > 0) {
                int columnIndex = V.getColumnIndex(MediationMetaData.KEY_NAME);
                int columnIndex2 = V.getColumnIndex("type");
                int columnIndex3 = V.getColumnIndex("notnull");
                int columnIndex4 = V.getColumnIndex("pk");
                int columnIndex5 = V.getColumnIndex("dflt_value");
                while (V.moveToNext()) {
                    String string = V.getString(columnIndex);
                    hashMap.put(string, new a(string, V.getString(columnIndex2), V.getInt(columnIndex3) != 0, V.getInt(columnIndex4), V.getString(columnIndex5), 2));
                }
            }
            return hashMap;
        } finally {
            V.close();
        }
    }

    private static List<c> c(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        int count = cursor.getCount();
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < count; i10++) {
            cursor.moveToPosition(i10);
            arrayList.add(new c(cursor.getInt(columnIndex), cursor.getInt(columnIndex2), cursor.getString(columnIndex3), cursor.getString(columnIndex4)));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static Set<b> d(c1.b bVar, String str) {
        HashSet hashSet = new HashSet();
        Cursor V = bVar.V("PRAGMA foreign_key_list(`" + str + "`)");
        try {
            int columnIndex = V.getColumnIndex("id");
            int columnIndex2 = V.getColumnIndex("seq");
            int columnIndex3 = V.getColumnIndex("table");
            int columnIndex4 = V.getColumnIndex("on_delete");
            int columnIndex5 = V.getColumnIndex("on_update");
            List<c> c10 = c(V);
            int count = V.getCount();
            for (int i10 = 0; i10 < count; i10++) {
                V.moveToPosition(i10);
                if (V.getInt(columnIndex2) == 0) {
                    int i11 = V.getInt(columnIndex);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (c next : c10) {
                        if (next.f24a == i11) {
                            arrayList.add(next.f26c);
                            arrayList2.add(next.f27d);
                        }
                    }
                    hashSet.add(new b(V.getString(columnIndex3), V.getString(columnIndex4), V.getString(columnIndex5), arrayList, arrayList2));
                }
            }
            return hashSet;
        } finally {
            V.close();
        }
    }

    private static d e(c1.b bVar, String str, boolean z10) {
        Cursor V = bVar.V("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = V.getColumnIndex("seqno");
            int columnIndex2 = V.getColumnIndex("cid");
            int columnIndex3 = V.getColumnIndex(MediationMetaData.KEY_NAME);
            if (!(columnIndex == -1 || columnIndex2 == -1)) {
                if (columnIndex3 != -1) {
                    TreeMap treeMap = new TreeMap();
                    while (V.moveToNext()) {
                        if (V.getInt(columnIndex2) >= 0) {
                            int i10 = V.getInt(columnIndex);
                            treeMap.put(Integer.valueOf(i10), V.getString(columnIndex3));
                        }
                    }
                    ArrayList arrayList = new ArrayList(treeMap.size());
                    arrayList.addAll(treeMap.values());
                    d dVar = new d(str, z10, arrayList);
                    V.close();
                    return dVar;
                }
            }
            return null;
        } finally {
            V.close();
        }
    }

    private static Set<d> f(c1.b bVar, String str) {
        Cursor V = bVar.V("PRAGMA index_list(`" + str + "`)");
        try {
            int columnIndex = V.getColumnIndex(MediationMetaData.KEY_NAME);
            int columnIndex2 = V.getColumnIndex("origin");
            int columnIndex3 = V.getColumnIndex("unique");
            if (!(columnIndex == -1 || columnIndex2 == -1)) {
                if (columnIndex3 != -1) {
                    HashSet hashSet = new HashSet();
                    while (V.moveToNext()) {
                        if ("c".equals(V.getString(columnIndex2))) {
                            String string = V.getString(columnIndex);
                            boolean z10 = true;
                            if (V.getInt(columnIndex3) != 1) {
                                z10 = false;
                            }
                            d e10 = e(bVar, string, z10);
                            if (e10 == null) {
                                V.close();
                                return null;
                            }
                            hashSet.add(e10);
                        }
                    }
                    V.close();
                    return hashSet;
                }
            }
            return null;
        } finally {
            V.close();
        }
    }

    public boolean equals(Object obj) {
        Set<d> set;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        String str = this.f8a;
        if (str == null ? fVar.f8a != null : !str.equals(fVar.f8a)) {
            return false;
        }
        Map<String, a> map = this.f9b;
        if (map == null ? fVar.f9b != null : !map.equals(fVar.f9b)) {
            return false;
        }
        Set<b> set2 = this.f10c;
        if (set2 == null ? fVar.f10c != null : !set2.equals(fVar.f10c)) {
            return false;
        }
        Set<d> set3 = this.f11d;
        if (set3 == null || (set = fVar.f11d) == null) {
            return true;
        }
        return set3.equals(set);
    }

    public int hashCode() {
        String str = this.f8a;
        int i10 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Map<String, a> map = this.f9b;
        int hashCode2 = (hashCode + (map != null ? map.hashCode() : 0)) * 31;
        Set<b> set = this.f10c;
        if (set != null) {
            i10 = set.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        return "TableInfo{name='" + this.f8a + '\'' + ", columns=" + this.f9b + ", foreignKeys=" + this.f10c + ", indices=" + this.f11d + '}';
    }
}
