package x7;

import com.google.firebase.firestore.a;
import com.google.protobuf.t1;
import dd.j1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import p8.a0;
import p8.b0;
import p8.e;
import p8.e0;
import p8.h0;
import p8.j;
import p8.k;
import p8.n;
import p8.o;
import p8.p;
import p8.t;
import p8.v;
import p8.y;
import p8.z;
import r7.a1;
import r7.f1;
import r7.k;
import r7.p;
import r7.q;
import r7.z0;
import t7.h1;
import t7.i4;
import u7.f;
import u7.l;
import u7.r;
import u7.s;
import u7.t;
import u7.u;
import u7.w;
import v7.a;
import v7.c;
import v7.d;
import v7.e;
import v7.i;
import v7.j;
import v7.m;
import x7.x0;
import y7.b;

/* compiled from: RemoteSerializer */
public final class n0 {

    /* renamed from: a  reason: collision with root package name */
    private final f f31087a;

    /* renamed from: b  reason: collision with root package name */
    private final String f31088b;

    /* compiled from: RemoteSerializer */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f31089a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f31090b;

        /* renamed from: c  reason: collision with root package name */
        static final /* synthetic */ int[] f31091c;

        /* renamed from: d  reason: collision with root package name */
        static final /* synthetic */ int[] f31092d;

        /* renamed from: e  reason: collision with root package name */
        static final /* synthetic */ int[] f31093e;

        /* renamed from: f  reason: collision with root package name */
        static final /* synthetic */ int[] f31094f;

        /* renamed from: g  reason: collision with root package name */
        static final /* synthetic */ int[] f31095g;

        /* renamed from: h  reason: collision with root package name */
        static final /* synthetic */ int[] f31096h;

        /* renamed from: i  reason: collision with root package name */
        static final /* synthetic */ int[] f31097i;

        /* renamed from: j  reason: collision with root package name */
        static final /* synthetic */ int[] f31098j;

        /* renamed from: k  reason: collision with root package name */
        static final /* synthetic */ int[] f31099k;

        /* renamed from: l  reason: collision with root package name */
        static final /* synthetic */ int[] f31100l;

        /* renamed from: m  reason: collision with root package name */
        static final /* synthetic */ int[] f31101m;

        /* JADX WARNING: Can't wrap try/catch for region: R(120:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|21|22|23|25|26|27|28|29|30|31|32|33|34|(2:35|36)|37|39|40|(2:41|42)|43|45|46|47|48|49|50|51|52|53|54|(2:55|56)|57|(2:59|60)|61|(2:63|64)|65|(2:67|68)|69|(2:71|72)|73|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|(2:93|94)|95|97|98|99|100|101|102|103|104|105|107|108|109|110|(2:111|112)|113|115|116|(2:117|118)|119|121|122|(2:123|124)|125|127|128|129|130|131|132|(2:133|134)|135|137|138|139|140|141|142|(2:143|144)|145|147|148|149|150|(2:151|152)|153|155|156|157|158|(3:159|160|162)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(121:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|21|22|23|25|26|27|28|29|30|31|32|33|34|(2:35|36)|37|39|40|(2:41|42)|43|45|46|47|48|49|50|51|52|53|54|(2:55|56)|57|(2:59|60)|61|(2:63|64)|65|(2:67|68)|69|(2:71|72)|73|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|97|98|99|100|101|102|103|104|105|107|108|109|110|(2:111|112)|113|115|116|(2:117|118)|119|121|122|(2:123|124)|125|127|128|129|130|131|132|(2:133|134)|135|137|138|139|140|141|142|(2:143|144)|145|147|148|149|150|(2:151|152)|153|155|156|157|158|(3:159|160|162)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(123:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|21|22|23|25|26|27|28|29|30|31|32|33|34|(2:35|36)|37|39|40|(2:41|42)|43|45|46|47|48|49|50|51|52|53|54|(2:55|56)|57|(2:59|60)|61|63|64|65|(2:67|68)|69|(2:71|72)|73|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|97|98|99|100|101|102|103|104|105|107|108|109|110|(2:111|112)|113|115|116|(2:117|118)|119|121|122|(2:123|124)|125|127|128|129|130|131|132|(2:133|134)|135|137|138|139|140|141|142|(2:143|144)|145|147|148|149|150|(2:151|152)|153|155|156|157|158|(3:159|160|162)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(124:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|21|22|23|25|26|27|28|29|30|31|32|33|34|(2:35|36)|37|39|40|(2:41|42)|43|45|46|47|48|49|50|51|52|53|54|(2:55|56)|57|(2:59|60)|61|63|64|65|(2:67|68)|69|(2:71|72)|73|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|97|98|99|100|101|102|103|104|105|107|108|109|110|(2:111|112)|113|115|116|(2:117|118)|119|121|122|(2:123|124)|125|127|128|129|130|131|132|133|134|135|137|138|139|140|141|142|(2:143|144)|145|147|148|149|150|(2:151|152)|153|155|156|157|158|(3:159|160|162)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(127:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|21|22|23|25|26|27|28|29|30|31|32|33|34|(2:35|36)|37|39|40|(2:41|42)|43|45|46|47|48|49|50|51|52|53|54|(2:55|56)|57|59|60|61|63|64|65|(2:67|68)|69|(2:71|72)|73|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|97|98|99|100|101|102|103|104|105|107|108|109|110|(2:111|112)|113|115|116|(2:117|118)|119|121|122|(2:123|124)|125|127|128|129|130|131|132|133|134|135|137|138|139|140|141|142|(2:143|144)|145|147|148|149|150|(2:151|152)|153|155|156|157|158|159|160|162) */
        /* JADX WARNING: Can't wrap try/catch for region: R(128:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|21|22|23|25|26|27|28|29|30|31|32|33|34|(2:35|36)|37|39|40|(2:41|42)|43|45|46|47|48|49|50|51|52|53|54|(2:55|56)|57|59|60|61|63|64|65|(2:67|68)|69|(2:71|72)|73|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|97|98|99|100|101|102|103|104|105|107|108|109|110|(2:111|112)|113|115|116|117|118|119|121|122|(2:123|124)|125|127|128|129|130|131|132|133|134|135|137|138|139|140|141|142|(2:143|144)|145|147|148|149|150|(2:151|152)|153|155|156|157|158|159|160|162) */
        /* JADX WARNING: Can't wrap try/catch for region: R(129:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|17|18|19|21|22|23|25|26|27|28|29|30|31|32|33|34|(2:35|36)|37|39|40|(2:41|42)|43|45|46|47|48|49|50|51|52|53|54|(2:55|56)|57|59|60|61|63|64|65|(2:67|68)|69|(2:71|72)|73|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|97|98|99|100|101|102|103|104|105|107|108|109|110|(2:111|112)|113|115|116|117|118|119|121|122|(2:123|124)|125|127|128|129|130|131|132|133|134|135|137|138|139|140|141|142|(2:143|144)|145|147|148|149|150|(2:151|152)|153|155|156|157|158|159|160|162) */
        /* JADX WARNING: Can't wrap try/catch for region: R(131:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|17|18|19|21|22|23|25|26|27|28|29|30|31|32|33|34|(2:35|36)|37|39|40|(2:41|42)|43|45|46|47|48|49|50|51|52|53|54|55|56|57|59|60|61|63|64|65|(2:67|68)|69|(2:71|72)|73|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|97|98|99|100|101|102|103|104|105|107|108|109|110|(2:111|112)|113|115|116|117|118|119|121|122|(2:123|124)|125|127|128|129|130|131|132|133|134|135|137|138|139|140|141|142|143|144|145|147|148|149|150|(2:151|152)|153|155|156|157|158|159|160|162) */
        /* JADX WARNING: Can't wrap try/catch for region: R(133:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|28|29|30|31|32|33|34|(2:35|36)|37|39|40|41|42|43|45|46|47|48|49|50|51|52|53|54|55|56|57|59|60|61|63|64|65|(2:67|68)|69|(2:71|72)|73|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|97|98|99|100|101|102|103|104|105|107|108|109|110|(2:111|112)|113|115|116|117|118|119|121|122|(2:123|124)|125|127|128|129|130|131|132|133|134|135|137|138|139|140|141|142|143|144|145|147|148|149|150|(2:151|152)|153|155|156|157|158|159|160|162) */
        /* JADX WARNING: Can't wrap try/catch for region: R(134:0|(2:1|2)|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|28|29|30|31|32|33|34|(2:35|36)|37|39|40|41|42|43|45|46|47|48|49|50|51|52|53|54|55|56|57|59|60|61|63|64|65|(2:67|68)|69|(2:71|72)|73|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|97|98|99|100|101|102|103|104|105|107|108|109|110|(2:111|112)|113|115|116|117|118|119|121|122|(2:123|124)|125|127|128|129|130|131|132|133|134|135|137|138|139|140|141|142|143|144|145|147|148|149|150|(2:151|152)|153|155|156|157|158|159|160|162) */
        /* JADX WARNING: Can't wrap try/catch for region: R(135:0|(2:1|2)|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|28|29|30|31|32|33|34|(2:35|36)|37|39|40|41|42|43|45|46|47|48|49|50|51|52|53|54|55|56|57|59|60|61|63|64|65|(2:67|68)|69|71|72|73|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|97|98|99|100|101|102|103|104|105|107|108|109|110|(2:111|112)|113|115|116|117|118|119|121|122|(2:123|124)|125|127|128|129|130|131|132|133|134|135|137|138|139|140|141|142|143|144|145|147|148|149|150|(2:151|152)|153|155|156|157|158|159|160|162) */
        /* JADX WARNING: Can't wrap try/catch for region: R(136:0|(2:1|2)|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|28|29|30|31|32|33|34|(2:35|36)|37|39|40|41|42|43|45|46|47|48|49|50|51|52|53|54|55|56|57|59|60|61|63|64|65|(2:67|68)|69|71|72|73|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|97|98|99|100|101|102|103|104|105|107|108|109|110|111|112|113|115|116|117|118|119|121|122|(2:123|124)|125|127|128|129|130|131|132|133|134|135|137|138|139|140|141|142|143|144|145|147|148|149|150|(2:151|152)|153|155|156|157|158|159|160|162) */
        /* JADX WARNING: Can't wrap try/catch for region: R(137:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|28|29|30|31|32|33|34|(2:35|36)|37|39|40|41|42|43|45|46|47|48|49|50|51|52|53|54|55|56|57|59|60|61|63|64|65|(2:67|68)|69|71|72|73|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|97|98|99|100|101|102|103|104|105|107|108|109|110|111|112|113|115|116|117|118|119|121|122|(2:123|124)|125|127|128|129|130|131|132|133|134|135|137|138|139|140|141|142|143|144|145|147|148|149|150|(2:151|152)|153|155|156|157|158|159|160|162) */
        /* JADX WARNING: Can't wrap try/catch for region: R(139:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|28|29|30|31|32|33|34|(2:35|36)|37|39|40|41|42|43|45|46|47|48|49|50|51|52|53|54|55|56|57|59|60|61|63|64|65|(2:67|68)|69|71|72|73|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|97|98|99|100|101|102|103|104|105|107|108|109|110|111|112|113|115|116|117|118|119|121|122|123|124|125|127|128|129|130|131|132|133|134|135|137|138|139|140|141|142|143|144|145|147|148|149|150|151|152|153|155|156|157|158|159|160|162) */
        /* JADX WARNING: Can't wrap try/catch for region: R(141:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|28|29|30|31|32|33|34|35|36|37|39|40|41|42|43|45|46|47|48|49|50|51|52|53|54|55|56|57|59|60|61|63|64|65|67|68|69|71|72|73|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|97|98|99|100|101|102|103|104|105|107|108|109|110|111|112|113|115|116|117|118|119|121|122|123|124|125|127|128|129|130|131|132|133|134|135|137|138|139|140|141|142|143|144|145|147|148|149|150|151|152|153|155|156|157|158|159|160|162) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:101:0x019f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:103:0x01a9 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:109:0x01c4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:111:0x01ce */
        /* JADX WARNING: Missing exception handler attribute for start block: B:117:0x01e9 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:123:0x0204 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:129:0x021f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:131:0x0229 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:133:0x0233 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:139:0x024e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:141:0x0258 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:143:0x0262 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:149:0x027d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:151:0x0287 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:157:0x02a2 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:159:0x02ac */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x005a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0064 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x006e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x0082 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x009d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00b8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x00c2 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x00cc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x00d6 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x00e0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:77:0x012a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:79:0x0134 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:81:0x013e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:83:0x0148 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:85:0x0152 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:87:0x015c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:89:0x0166 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:91:0x0170 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:93:0x017a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:99:0x0195 */
        static {
            /*
                p8.t$c[] r0 = p8.t.c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f31101m = r0
                r1 = 1
                p8.t$c r2 = p8.t.c.TARGET_CHANGE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f31101m     // Catch:{ NoSuchFieldError -> 0x001d }
                p8.t$c r3 = p8.t.c.DOCUMENT_CHANGE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f31101m     // Catch:{ NoSuchFieldError -> 0x0028 }
                p8.t$c r4 = p8.t.c.DOCUMENT_DELETE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f31101m     // Catch:{ NoSuchFieldError -> 0x0033 }
                p8.t$c r5 = p8.t.c.DOCUMENT_REMOVE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                r4 = 5
                int[] r5 = f31101m     // Catch:{ NoSuchFieldError -> 0x003e }
                p8.t$c r6 = p8.t.c.FILTER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                r5 = 6
                int[] r6 = f31101m     // Catch:{ NoSuchFieldError -> 0x0049 }
                p8.t$c r7 = p8.t.c.RESPONSETYPE_NOT_SET     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r6[r7] = r5     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                p8.b0$c[] r6 = p8.b0.c.values()
                int r6 = r6.length
                int[] r6 = new int[r6]
                f31100l = r6
                p8.b0$c r7 = p8.b0.c.NO_CHANGE     // Catch:{ NoSuchFieldError -> 0x005a }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x005a }
                r6[r7] = r1     // Catch:{ NoSuchFieldError -> 0x005a }
            L_0x005a:
                int[] r6 = f31100l     // Catch:{ NoSuchFieldError -> 0x0064 }
                p8.b0$c r7 = p8.b0.c.ADD     // Catch:{ NoSuchFieldError -> 0x0064 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0064 }
                r6[r7] = r0     // Catch:{ NoSuchFieldError -> 0x0064 }
            L_0x0064:
                int[] r6 = f31100l     // Catch:{ NoSuchFieldError -> 0x006e }
                p8.b0$c r7 = p8.b0.c.REMOVE     // Catch:{ NoSuchFieldError -> 0x006e }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r6[r7] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                int[] r6 = f31100l     // Catch:{ NoSuchFieldError -> 0x0078 }
                p8.b0$c r7 = p8.b0.c.CURRENT     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r6[r7] = r3     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r6 = f31100l     // Catch:{ NoSuchFieldError -> 0x0082 }
                p8.b0$c r7 = p8.b0.c.RESET     // Catch:{ NoSuchFieldError -> 0x0082 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0082 }
                r6[r7] = r4     // Catch:{ NoSuchFieldError -> 0x0082 }
            L_0x0082:
                int[] r6 = f31100l     // Catch:{ NoSuchFieldError -> 0x008c }
                p8.b0$c r7 = p8.b0.c.UNRECOGNIZED     // Catch:{ NoSuchFieldError -> 0x008c }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x008c }
                r6[r7] = r5     // Catch:{ NoSuchFieldError -> 0x008c }
            L_0x008c:
                p8.z$e[] r6 = p8.z.e.values()
                int r6 = r6.length
                int[] r6 = new int[r6]
                f31099k = r6
                p8.z$e r7 = p8.z.e.ASCENDING     // Catch:{ NoSuchFieldError -> 0x009d }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x009d }
                r6[r7] = r1     // Catch:{ NoSuchFieldError -> 0x009d }
            L_0x009d:
                int[] r6 = f31099k     // Catch:{ NoSuchFieldError -> 0x00a7 }
                p8.z$e r7 = p8.z.e.DESCENDING     // Catch:{ NoSuchFieldError -> 0x00a7 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a7 }
                r6[r7] = r0     // Catch:{ NoSuchFieldError -> 0x00a7 }
            L_0x00a7:
                p8.z$f$b[] r6 = p8.z.f.b.values()
                int r6 = r6.length
                int[] r6 = new int[r6]
                f31098j = r6
                p8.z$f$b r7 = p8.z.f.b.LESS_THAN     // Catch:{ NoSuchFieldError -> 0x00b8 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b8 }
                r6[r7] = r1     // Catch:{ NoSuchFieldError -> 0x00b8 }
            L_0x00b8:
                int[] r6 = f31098j     // Catch:{ NoSuchFieldError -> 0x00c2 }
                p8.z$f$b r7 = p8.z.f.b.LESS_THAN_OR_EQUAL     // Catch:{ NoSuchFieldError -> 0x00c2 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c2 }
                r6[r7] = r0     // Catch:{ NoSuchFieldError -> 0x00c2 }
            L_0x00c2:
                int[] r6 = f31098j     // Catch:{ NoSuchFieldError -> 0x00cc }
                p8.z$f$b r7 = p8.z.f.b.EQUAL     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r6[r7] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                int[] r6 = f31098j     // Catch:{ NoSuchFieldError -> 0x00d6 }
                p8.z$f$b r7 = p8.z.f.b.NOT_EQUAL     // Catch:{ NoSuchFieldError -> 0x00d6 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d6 }
                r6[r7] = r3     // Catch:{ NoSuchFieldError -> 0x00d6 }
            L_0x00d6:
                int[] r6 = f31098j     // Catch:{ NoSuchFieldError -> 0x00e0 }
                p8.z$f$b r7 = p8.z.f.b.GREATER_THAN_OR_EQUAL     // Catch:{ NoSuchFieldError -> 0x00e0 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e0 }
                r6[r7] = r4     // Catch:{ NoSuchFieldError -> 0x00e0 }
            L_0x00e0:
                int[] r6 = f31098j     // Catch:{ NoSuchFieldError -> 0x00ea }
                p8.z$f$b r7 = p8.z.f.b.GREATER_THAN     // Catch:{ NoSuchFieldError -> 0x00ea }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x00ea }
                r6[r7] = r5     // Catch:{ NoSuchFieldError -> 0x00ea }
            L_0x00ea:
                r6 = 7
                int[] r7 = f31098j     // Catch:{ NoSuchFieldError -> 0x00f5 }
                p8.z$f$b r8 = p8.z.f.b.ARRAY_CONTAINS     // Catch:{ NoSuchFieldError -> 0x00f5 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f5 }
                r7[r8] = r6     // Catch:{ NoSuchFieldError -> 0x00f5 }
            L_0x00f5:
                r7 = 8
                int[] r8 = f31098j     // Catch:{ NoSuchFieldError -> 0x0101 }
                p8.z$f$b r9 = p8.z.f.b.IN     // Catch:{ NoSuchFieldError -> 0x0101 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x0101 }
                r8[r9] = r7     // Catch:{ NoSuchFieldError -> 0x0101 }
            L_0x0101:
                r8 = 9
                int[] r9 = f31098j     // Catch:{ NoSuchFieldError -> 0x010d }
                p8.z$f$b r10 = p8.z.f.b.ARRAY_CONTAINS_ANY     // Catch:{ NoSuchFieldError -> 0x010d }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x010d }
                r9[r10] = r8     // Catch:{ NoSuchFieldError -> 0x010d }
            L_0x010d:
                r9 = 10
                int[] r10 = f31098j     // Catch:{ NoSuchFieldError -> 0x0119 }
                p8.z$f$b r11 = p8.z.f.b.NOT_IN     // Catch:{ NoSuchFieldError -> 0x0119 }
                int r11 = r11.ordinal()     // Catch:{ NoSuchFieldError -> 0x0119 }
                r10[r11] = r9     // Catch:{ NoSuchFieldError -> 0x0119 }
            L_0x0119:
                r7.p$b[] r10 = r7.p.b.values()
                int r10 = r10.length
                int[] r10 = new int[r10]
                f31097i = r10
                r7.p$b r11 = r7.p.b.LESS_THAN     // Catch:{ NoSuchFieldError -> 0x012a }
                int r11 = r11.ordinal()     // Catch:{ NoSuchFieldError -> 0x012a }
                r10[r11] = r1     // Catch:{ NoSuchFieldError -> 0x012a }
            L_0x012a:
                int[] r10 = f31097i     // Catch:{ NoSuchFieldError -> 0x0134 }
                r7.p$b r11 = r7.p.b.LESS_THAN_OR_EQUAL     // Catch:{ NoSuchFieldError -> 0x0134 }
                int r11 = r11.ordinal()     // Catch:{ NoSuchFieldError -> 0x0134 }
                r10[r11] = r0     // Catch:{ NoSuchFieldError -> 0x0134 }
            L_0x0134:
                int[] r10 = f31097i     // Catch:{ NoSuchFieldError -> 0x013e }
                r7.p$b r11 = r7.p.b.EQUAL     // Catch:{ NoSuchFieldError -> 0x013e }
                int r11 = r11.ordinal()     // Catch:{ NoSuchFieldError -> 0x013e }
                r10[r11] = r2     // Catch:{ NoSuchFieldError -> 0x013e }
            L_0x013e:
                int[] r10 = f31097i     // Catch:{ NoSuchFieldError -> 0x0148 }
                r7.p$b r11 = r7.p.b.NOT_EQUAL     // Catch:{ NoSuchFieldError -> 0x0148 }
                int r11 = r11.ordinal()     // Catch:{ NoSuchFieldError -> 0x0148 }
                r10[r11] = r3     // Catch:{ NoSuchFieldError -> 0x0148 }
            L_0x0148:
                int[] r10 = f31097i     // Catch:{ NoSuchFieldError -> 0x0152 }
                r7.p$b r11 = r7.p.b.GREATER_THAN     // Catch:{ NoSuchFieldError -> 0x0152 }
                int r11 = r11.ordinal()     // Catch:{ NoSuchFieldError -> 0x0152 }
                r10[r11] = r4     // Catch:{ NoSuchFieldError -> 0x0152 }
            L_0x0152:
                int[] r4 = f31097i     // Catch:{ NoSuchFieldError -> 0x015c }
                r7.p$b r10 = r7.p.b.GREATER_THAN_OR_EQUAL     // Catch:{ NoSuchFieldError -> 0x015c }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x015c }
                r4[r10] = r5     // Catch:{ NoSuchFieldError -> 0x015c }
            L_0x015c:
                int[] r4 = f31097i     // Catch:{ NoSuchFieldError -> 0x0166 }
                r7.p$b r5 = r7.p.b.ARRAY_CONTAINS     // Catch:{ NoSuchFieldError -> 0x0166 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0166 }
                r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x0166 }
            L_0x0166:
                int[] r4 = f31097i     // Catch:{ NoSuchFieldError -> 0x0170 }
                r7.p$b r5 = r7.p.b.IN     // Catch:{ NoSuchFieldError -> 0x0170 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0170 }
                r4[r5] = r7     // Catch:{ NoSuchFieldError -> 0x0170 }
            L_0x0170:
                int[] r4 = f31097i     // Catch:{ NoSuchFieldError -> 0x017a }
                r7.p$b r5 = r7.p.b.ARRAY_CONTAINS_ANY     // Catch:{ NoSuchFieldError -> 0x017a }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x017a }
                r4[r5] = r8     // Catch:{ NoSuchFieldError -> 0x017a }
            L_0x017a:
                int[] r4 = f31097i     // Catch:{ NoSuchFieldError -> 0x0184 }
                r7.p$b r5 = r7.p.b.NOT_IN     // Catch:{ NoSuchFieldError -> 0x0184 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0184 }
                r4[r5] = r9     // Catch:{ NoSuchFieldError -> 0x0184 }
            L_0x0184:
                p8.z$k$b[] r4 = p8.z.k.b.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f31096h = r4
                p8.z$k$b r5 = p8.z.k.b.IS_NAN     // Catch:{ NoSuchFieldError -> 0x0195 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0195 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0195 }
            L_0x0195:
                int[] r4 = f31096h     // Catch:{ NoSuchFieldError -> 0x019f }
                p8.z$k$b r5 = p8.z.k.b.IS_NULL     // Catch:{ NoSuchFieldError -> 0x019f }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x019f }
                r4[r5] = r0     // Catch:{ NoSuchFieldError -> 0x019f }
            L_0x019f:
                int[] r4 = f31096h     // Catch:{ NoSuchFieldError -> 0x01a9 }
                p8.z$k$b r5 = p8.z.k.b.IS_NOT_NAN     // Catch:{ NoSuchFieldError -> 0x01a9 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x01a9 }
                r4[r5] = r2     // Catch:{ NoSuchFieldError -> 0x01a9 }
            L_0x01a9:
                int[] r4 = f31096h     // Catch:{ NoSuchFieldError -> 0x01b3 }
                p8.z$k$b r5 = p8.z.k.b.IS_NOT_NULL     // Catch:{ NoSuchFieldError -> 0x01b3 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x01b3 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x01b3 }
            L_0x01b3:
                p8.z$h$b[] r4 = p8.z.h.b.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f31095g = r4
                p8.z$h$b r5 = p8.z.h.b.COMPOSITE_FILTER     // Catch:{ NoSuchFieldError -> 0x01c4 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x01c4 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x01c4 }
            L_0x01c4:
                int[] r4 = f31095g     // Catch:{ NoSuchFieldError -> 0x01ce }
                p8.z$h$b r5 = p8.z.h.b.FIELD_FILTER     // Catch:{ NoSuchFieldError -> 0x01ce }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x01ce }
                r4[r5] = r0     // Catch:{ NoSuchFieldError -> 0x01ce }
            L_0x01ce:
                int[] r4 = f31095g     // Catch:{ NoSuchFieldError -> 0x01d8 }
                p8.z$h$b r5 = p8.z.h.b.UNARY_FILTER     // Catch:{ NoSuchFieldError -> 0x01d8 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x01d8 }
                r4[r5] = r2     // Catch:{ NoSuchFieldError -> 0x01d8 }
            L_0x01d8:
                p8.z$d$b[] r4 = p8.z.d.b.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f31094f = r4
                p8.z$d$b r5 = p8.z.d.b.AND     // Catch:{ NoSuchFieldError -> 0x01e9 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x01e9 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x01e9 }
            L_0x01e9:
                int[] r4 = f31094f     // Catch:{ NoSuchFieldError -> 0x01f3 }
                p8.z$d$b r5 = p8.z.d.b.OR     // Catch:{ NoSuchFieldError -> 0x01f3 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x01f3 }
                r4[r5] = r0     // Catch:{ NoSuchFieldError -> 0x01f3 }
            L_0x01f3:
                r7.k$a[] r4 = r7.k.a.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f31093e = r4
                r7.k$a r5 = r7.k.a.AND     // Catch:{ NoSuchFieldError -> 0x0204 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0204 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0204 }
            L_0x0204:
                int[] r4 = f31093e     // Catch:{ NoSuchFieldError -> 0x020e }
                r7.k$a r5 = r7.k.a.OR     // Catch:{ NoSuchFieldError -> 0x020e }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x020e }
                r4[r5] = r0     // Catch:{ NoSuchFieldError -> 0x020e }
            L_0x020e:
                t7.h1[] r4 = t7.h1.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f31092d = r4
                t7.h1 r5 = t7.h1.LISTEN     // Catch:{ NoSuchFieldError -> 0x021f }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x021f }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x021f }
            L_0x021f:
                int[] r4 = f31092d     // Catch:{ NoSuchFieldError -> 0x0229 }
                t7.h1 r5 = t7.h1.EXISTENCE_FILTER_MISMATCH     // Catch:{ NoSuchFieldError -> 0x0229 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0229 }
                r4[r5] = r0     // Catch:{ NoSuchFieldError -> 0x0229 }
            L_0x0229:
                int[] r4 = f31092d     // Catch:{ NoSuchFieldError -> 0x0233 }
                t7.h1 r5 = t7.h1.EXISTENCE_FILTER_MISMATCH_BLOOM     // Catch:{ NoSuchFieldError -> 0x0233 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0233 }
                r4[r5] = r2     // Catch:{ NoSuchFieldError -> 0x0233 }
            L_0x0233:
                int[] r4 = f31092d     // Catch:{ NoSuchFieldError -> 0x023d }
                t7.h1 r5 = t7.h1.LIMBO_RESOLUTION     // Catch:{ NoSuchFieldError -> 0x023d }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x023d }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x023d }
            L_0x023d:
                p8.p$c$c[] r4 = p8.p.c.C0324c.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f31091c = r4
                p8.p$c$c r5 = p8.p.c.C0324c.SET_TO_SERVER_VALUE     // Catch:{ NoSuchFieldError -> 0x024e }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x024e }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x024e }
            L_0x024e:
                int[] r4 = f31091c     // Catch:{ NoSuchFieldError -> 0x0258 }
                p8.p$c$c r5 = p8.p.c.C0324c.APPEND_MISSING_ELEMENTS     // Catch:{ NoSuchFieldError -> 0x0258 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0258 }
                r4[r5] = r0     // Catch:{ NoSuchFieldError -> 0x0258 }
            L_0x0258:
                int[] r4 = f31091c     // Catch:{ NoSuchFieldError -> 0x0262 }
                p8.p$c$c r5 = p8.p.c.C0324c.REMOVE_ALL_FROM_ARRAY     // Catch:{ NoSuchFieldError -> 0x0262 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0262 }
                r4[r5] = r2     // Catch:{ NoSuchFieldError -> 0x0262 }
            L_0x0262:
                int[] r4 = f31091c     // Catch:{ NoSuchFieldError -> 0x026c }
                p8.p$c$c r5 = p8.p.c.C0324c.INCREMENT     // Catch:{ NoSuchFieldError -> 0x026c }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x026c }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x026c }
            L_0x026c:
                p8.v$c[] r3 = p8.v.c.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f31090b = r3
                p8.v$c r4 = p8.v.c.UPDATE_TIME     // Catch:{ NoSuchFieldError -> 0x027d }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x027d }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x027d }
            L_0x027d:
                int[] r3 = f31090b     // Catch:{ NoSuchFieldError -> 0x0287 }
                p8.v$c r4 = p8.v.c.EXISTS     // Catch:{ NoSuchFieldError -> 0x0287 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0287 }
                r3[r4] = r0     // Catch:{ NoSuchFieldError -> 0x0287 }
            L_0x0287:
                int[] r3 = f31090b     // Catch:{ NoSuchFieldError -> 0x0291 }
                p8.v$c r4 = p8.v.c.CONDITIONTYPE_NOT_SET     // Catch:{ NoSuchFieldError -> 0x0291 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0291 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0291 }
            L_0x0291:
                p8.e0$c[] r3 = p8.e0.c.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f31089a = r3
                p8.e0$c r4 = p8.e0.c.UPDATE     // Catch:{ NoSuchFieldError -> 0x02a2 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x02a2 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x02a2 }
            L_0x02a2:
                int[] r1 = f31089a     // Catch:{ NoSuchFieldError -> 0x02ac }
                p8.e0$c r3 = p8.e0.c.DELETE     // Catch:{ NoSuchFieldError -> 0x02ac }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x02ac }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x02ac }
            L_0x02ac:
                int[] r0 = f31089a     // Catch:{ NoSuchFieldError -> 0x02b6 }
                p8.e0$c r1 = p8.e0.c.VERIFY     // Catch:{ NoSuchFieldError -> 0x02b6 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x02b6 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x02b6 }
            L_0x02b6:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: x7.n0.a.<clinit>():void");
        }
    }

    public n0(f fVar) {
        this.f31087a = fVar;
        this.f31088b = Z(fVar).d();
    }

    private n E(d dVar) {
        n.b l02 = n.l0();
        for (r d10 : dVar.c()) {
            l02.F(d10.d());
        }
        return (n) l02.build();
    }

    private z.f.b G(p.b bVar) {
        switch (a.f31097i[bVar.ordinal()]) {
            case 1:
                return z.f.b.LESS_THAN;
            case 2:
                return z.f.b.LESS_THAN_OR_EQUAL;
            case 3:
                return z.f.b.EQUAL;
            case 4:
                return z.f.b.NOT_EQUAL;
            case 5:
                return z.f.b.GREATER_THAN;
            case 6:
                return z.f.b.GREATER_THAN_OR_EQUAL;
            case 7:
                return z.f.b.ARRAY_CONTAINS;
            case 8:
                return z.f.b.IN;
            case 9:
                return z.f.b.ARRAY_CONTAINS_ANY;
            case 10:
                return z.f.b.NOT_IN;
            default:
                throw b.a("Unknown operator %d", bVar);
        }
    }

    private z.g H(r rVar) {
        return (z.g) z.g.i0().F(rVar.d()).build();
    }

    private p.c I(e eVar) {
        v7.p b10 = eVar.b();
        if (b10 instanceof v7.n) {
            return (p.c) p.c.q0().G(eVar.a().d()).J(p.c.b.REQUEST_TIME).build();
        }
        if (b10 instanceof a.b) {
            return (p.c) p.c.q0().G(eVar.a().d()).F(p8.b.o0().F(((a.b) b10).f())).build();
        }
        if (b10 instanceof a.C0345a) {
            return (p.c) p.c.q0().G(eVar.a().d()).I(p8.b.o0().F(((a.C0345a) b10).f())).build();
        }
        if (b10 instanceof j) {
            return (p.c) p.c.q0().G(eVar.a().d()).H(((j) b10).d()).build();
        }
        throw b.a("Unknown transform: %s", b10);
    }

    private z.h K(List<q> list) {
        return J(new k(list, k.a.AND));
    }

    private String M(h1 h1Var) {
        int i10 = a.f31092d[h1Var.ordinal()];
        if (i10 == 1) {
            return null;
        }
        if (i10 == 2) {
            return "existence-filter-mismatch";
        }
        if (i10 == 3) {
            return "existence-filter-mismatch-bloom";
        }
        if (i10 == 4) {
            return "limbo-document";
        }
        throw b.a("Unrecognized query purpose: %s", h1Var);
    }

    private z.i P(z0 z0Var) {
        z.i.a j02 = z.i.j0();
        if (z0Var.b().equals(z0.a.ASCENDING)) {
            j02.F(z.e.ASCENDING);
        } else {
            j02.F(z.e.DESCENDING);
        }
        j02.G(H(z0Var.c()));
        return (z.i) j02.build();
    }

    private v Q(m mVar) {
        b.d(!mVar.d(), "Can't serialize an empty precondition", new Object[0]);
        v.b l02 = v.l0();
        if (mVar.c() != null) {
            return (v) l02.G(Y(mVar.c())).build();
        }
        if (mVar.b() != null) {
            return (v) l02.F(mVar.b().booleanValue()).build();
        }
        throw b.a("Unknown Precondition", new Object[0]);
    }

    private String R(u uVar) {
        return T(this.f31087a, uVar);
    }

    private String T(f fVar, u uVar) {
        return ((u) ((u) Z(fVar).a("documents")).c(uVar)).d();
    }

    private static u Z(f fVar) {
        return u.o(Arrays.asList(new String[]{"projects", fVar.f(), "databases", fVar.e()}));
    }

    private static u a0(u uVar) {
        b.d(uVar.k() > 4 && uVar.h(4).equals("documents"), "Tried to deserialize invalid key %s", uVar);
        return (u) uVar.l(5);
    }

    private j1 b0(t8.a aVar) {
        return j1.h(aVar.f0()).q(aVar.h0());
    }

    private d d(n nVar) {
        int k02 = nVar.k0();
        HashSet hashSet = new HashSet(k02);
        for (int i10 = 0; i10 < k02; i10++) {
            hashSet.add(r.p(nVar.j0(i10)));
        }
        return d.b(hashSet);
    }

    private static boolean d0(u uVar) {
        if (uVar.k() < 4 || !uVar.h(0).equals("projects") || !uVar.h(2).equals("databases")) {
            return false;
        }
        return true;
    }

    private p.b g(z.f.b bVar) {
        switch (a.f31098j[bVar.ordinal()]) {
            case 1:
                return p.b.LESS_THAN;
            case 2:
                return p.b.LESS_THAN_OR_EQUAL;
            case 3:
                return p.b.EQUAL;
            case 4:
                return p.b.NOT_EQUAL;
            case 5:
                return p.b.GREATER_THAN_OR_EQUAL;
            case 6:
                return p.b.GREATER_THAN;
            case 7:
                return p.b.ARRAY_CONTAINS;
            case 8:
                return p.b.IN;
            case 9:
                return p.b.ARRAY_CONTAINS_ANY;
            case 10:
                return p.b.NOT_IN;
            default:
                throw b.a("Unhandled FieldFilter.operator %d", bVar);
        }
    }

    private e h(p.c cVar) {
        int i10 = a.f31091c[cVar.p0().ordinal()];
        if (i10 == 1) {
            b.d(cVar.o0() == p.c.b.REQUEST_TIME, "Unknown transform setToServerValue: %s", cVar.o0());
            return new e(r.p(cVar.l0()), v7.n.d());
        } else if (i10 == 2) {
            return new e(r.p(cVar.l0()), new a.b(cVar.k0().g()));
        } else {
            if (i10 == 3) {
                return new e(r.p(cVar.l0()), new a.C0345a(cVar.n0().g()));
            }
            if (i10 == 4) {
                return new e(r.p(cVar.l0()), new j(cVar.m0()));
            }
            throw b.a("Unknown FieldTransform proto: %s", cVar);
        }
    }

    private List<q> j(z.h hVar) {
        q i10 = i(hVar);
        if (i10 instanceof k) {
            k kVar = (k) i10;
            if (kVar.i()) {
                return kVar.b();
            }
        }
        return Collections.singletonList(i10);
    }

    private s k(p8.e eVar) {
        b.d(eVar.j0().equals(e.c.FOUND), "Tried to deserialize a found document from a missing document.", new Object[0]);
        l l10 = l(eVar.g0().l0());
        t g10 = t.g(eVar.g0().j0());
        w y10 = y(eVar.g0().m0());
        b.d(!y10.equals(w.f30653b), "Got a document response with no snapshot version", new Object[0]);
        return s.n(l10, y10, g10);
    }

    private s n(p8.e eVar) {
        b.d(eVar.j0().equals(e.c.MISSING), "Tried to deserialize a missing document from a found document.", new Object[0]);
        l l10 = l(eVar.h0());
        w y10 = y(eVar.i0());
        b.d(!y10.equals(w.f30653b), "Got a no document response with no snapshot version", new Object[0]);
        return s.p(l10, y10);
    }

    private z0 q(z.i iVar) {
        z0.a aVar;
        r p10 = r.p(iVar.i0().h0());
        int i10 = a.f31099k[iVar.h0().ordinal()];
        if (i10 == 1) {
            aVar = z0.a.ASCENDING;
        } else if (i10 == 2) {
            aVar = z0.a.DESCENDING;
        } else {
            throw b.a("Unrecognized direction %d", iVar.h0());
        }
        return z0.d(aVar, p10);
    }

    private m r(v vVar) {
        int i10 = a.f31090b[vVar.h0().ordinal()];
        if (i10 == 1) {
            return m.f(y(vVar.k0()));
        }
        if (i10 == 2) {
            return m.a(vVar.j0());
        }
        if (i10 == 3) {
            return m.f30717c;
        }
        throw b.a("Unknown precondition", new Object[0]);
    }

    private u s(String str) {
        u v10 = v(str);
        if (v10.k() == 4) {
            return u.f30652b;
        }
        return a0(v10);
    }

    private u v(String str) {
        u p10 = u.p(str);
        b.d(d0(p10), "Tried to deserialize invalid key %s", p10);
        return p10;
    }

    private q x(z.k kVar) {
        r p10 = r.p(kVar.i0().h0());
        int i10 = a.f31096h[kVar.j0().ordinal()];
        if (i10 == 1) {
            return r7.p.e(p10, p.b.EQUAL, u7.z.f30659a);
        }
        if (i10 == 2) {
            return r7.p.e(p10, p.b.EQUAL, u7.z.f30660b);
        }
        if (i10 == 3) {
            return r7.p.e(p10, p.b.NOT_EQUAL, u7.z.f30659a);
        }
        if (i10 == 4) {
            return r7.p.e(p10, p.b.NOT_EQUAL, u7.z.f30660b);
        }
        throw b.a("Unrecognized UnaryFilter.operator %d", kVar.j0());
    }

    public x0 A(p8.t tVar) {
        x0.e eVar;
        x0 dVar;
        int i10 = a.f31101m[tVar.k0().ordinal()];
        j1 j1Var = null;
        if (i10 == 1) {
            b0 l02 = tVar.l0();
            int i11 = a.f31100l[l02.j0().ordinal()];
            if (i11 == 1) {
                eVar = x0.e.NoChange;
            } else if (i11 == 2) {
                eVar = x0.e.Added;
            } else if (i11 == 3) {
                eVar = x0.e.Removed;
                j1Var = b0(l02.f0());
            } else if (i11 == 4) {
                eVar = x0.e.Current;
            } else if (i11 == 5) {
                eVar = x0.e.Reset;
            } else {
                throw new IllegalArgumentException("Unknown target change type");
            }
            dVar = new x0.d(eVar, l02.l0(), l02.i0(), j1Var);
        } else if (i10 == 2) {
            p8.l g02 = tVar.g0();
            List<Integer> i02 = g02.i0();
            List<Integer> h02 = g02.h0();
            l l10 = l(g02.g0().l0());
            w y10 = y(g02.g0().m0());
            b.d(!y10.equals(w.f30653b), "Got a document change without an update time", new Object[0]);
            s n10 = s.n(l10, y10, t.g(g02.g0().j0()));
            dVar = new x0.b(i02, h02, n10.getKey(), n10);
        } else if (i10 == 3) {
            p8.m h03 = tVar.h0();
            List<Integer> i03 = h03.i0();
            s p10 = s.p(l(h03.g0()), y(h03.h0()));
            return new x0.b(Collections.emptyList(), i03, p10.getKey(), p10);
        } else if (i10 == 4) {
            o i04 = tVar.i0();
            dVar = new x0.b(Collections.emptyList(), i04.h0(), l(i04.g0()), (s) null);
        } else if (i10 == 5) {
            p8.q j02 = tVar.j0();
            return new x0.c(j02.h0(), new r(j02.f0(), j02.i0()));
        } else {
            throw new IllegalArgumentException("Unknown change type set");
        }
        return dVar;
    }

    /* access modifiers changed from: package-private */
    public z.h B(k kVar) {
        ArrayList arrayList = new ArrayList(kVar.b().size());
        for (q J : kVar.b()) {
            arrayList.add(J(J));
        }
        if (arrayList.size() == 1) {
            return (z.h) arrayList.get(0);
        }
        z.d.a m02 = z.d.m0();
        m02.G(C(kVar.e()));
        m02.F(arrayList);
        return (z.h) z.h.n0().F(m02).build();
    }

    /* access modifiers changed from: package-private */
    public z.d.b C(k.a aVar) {
        int i10 = a.f31093e[aVar.ordinal()];
        if (i10 == 1) {
            return z.d.b.AND;
        }
        if (i10 == 2) {
            return z.d.b.OR;
        }
        throw b.a("Unrecognized composite filter type.", new Object[0]);
    }

    public p8.k D(l lVar, t tVar) {
        k.b p02 = p8.k.p0();
        p02.G(L(lVar));
        p02.F(tVar.k());
        return (p8.k) p02.build();
    }

    public a0.c F(f1 f1Var) {
        a0.c.a l02 = a0.c.l0();
        l02.F(R(f1Var.n()));
        return (a0.c) l02.build();
    }

    /* access modifiers changed from: package-private */
    public z.h J(q qVar) {
        if (qVar instanceof r7.p) {
            return X((r7.p) qVar);
        }
        if (qVar instanceof r7.k) {
            return B((r7.k) qVar);
        }
        throw b.a("Unrecognized filter type %s", qVar.toString());
    }

    public String L(l lVar) {
        return T(this.f31087a, lVar.l());
    }

    public Map<String, String> N(i4 i4Var) {
        String M = M(i4Var.c());
        if (M == null) {
            return null;
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("goog-listen-tags", M);
        return hashMap;
    }

    public e0 O(v7.f fVar) {
        e0.b z02 = e0.z0();
        if (fVar instanceof v7.o) {
            z02.I(D(fVar.g(), ((v7.o) fVar).o()));
        } else if (fVar instanceof v7.l) {
            z02.I(D(fVar.g(), ((v7.l) fVar).q()));
            z02.J(E(fVar.e()));
        } else if (fVar instanceof c) {
            z02.H(L(fVar.g()));
        } else if (fVar instanceof v7.q) {
            z02.K(L(fVar.g()));
        } else {
            throw b.a("unknown mutation type %s", fVar.getClass());
        }
        for (v7.e I : fVar.f()) {
            z02.F(I(I));
        }
        if (!fVar.h().d()) {
            z02.G(Q(fVar.h()));
        }
        return (e0) z02.build();
    }

    public a0.d S(f1 f1Var) {
        a0.d.a k02 = a0.d.k0();
        z.b C0 = z.C0();
        u n10 = f1Var.n();
        if (f1Var.d() != null) {
            b.d(n10.k() % 2 == 0, "Collection Group queries should be within a document path or root.", new Object[0]);
            k02.F(R(n10));
            z.c.a j02 = z.c.j0();
            j02.G(f1Var.d());
            j02.F(true);
            C0.F(j02);
        } else {
            b.d(n10.k() % 2 != 0, "Document queries with filters are not supported.", new Object[0]);
            k02.F(R((u) n10.m()));
            z.c.a j03 = z.c.j0();
            j03.G(n10.g());
            C0.F(j03);
        }
        if (f1Var.h().size() > 0) {
            C0.K(K(f1Var.h()));
        }
        for (z0 P : f1Var.m()) {
            C0.G(P(P));
        }
        if (f1Var.r()) {
            C0.I(com.google.protobuf.a0.i0().F((int) f1Var.j()));
        }
        if (f1Var.p() != null) {
            j.b l02 = p8.j.l0();
            l02.F(f1Var.p().b());
            l02.G(f1Var.p().c());
            C0.J(l02);
        }
        if (f1Var.f() != null) {
            j.b l03 = p8.j.l0();
            l03.F(f1Var.f().b());
            l03.G(!f1Var.f().c());
            C0.H(l03);
        }
        k02.G(C0);
        return (a0.d) k02.build();
    }

    /* access modifiers changed from: package-private */
    public y U(a0.d dVar, List<com.google.firebase.firestore.a> list, HashMap<String, String> hashMap) {
        y.c j02 = y.j0();
        j02.G(dVar.j0());
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        int i10 = 1;
        for (com.google.firebase.firestore.a next : list) {
            if (!hashSet.contains(next.c())) {
                hashSet.add(next.c());
                StringBuilder sb2 = new StringBuilder();
                sb2.append("aggregate_");
                int i11 = i10 + 1;
                sb2.append(i10);
                String sb3 = sb2.toString();
                hashMap.put(sb3, next.c());
                y.b.C0326b j03 = y.b.j0();
                z.g gVar = (z.g) z.g.i0().F(next.d()).build();
                if (next instanceof a.c) {
                    j03.H(y.b.c.f0());
                } else if (next instanceof a.d) {
                    j03.I((y.b.d) y.b.d.g0().F(gVar).build());
                } else if (next instanceof a.b) {
                    j03.G((y.b.a) y.b.a.g0().F(gVar).build());
                } else {
                    throw new RuntimeException("Unsupported aggregation");
                }
                j03.F(sb3);
                arrayList.add((y.b) j03.build());
                i10 = i11;
            }
        }
        j02.F(arrayList);
        return (y) j02.build();
    }

    public a0 V(i4 i4Var) {
        a0.b l02 = a0.l0();
        f1 g10 = i4Var.g();
        if (g10.s()) {
            l02.F(F(g10));
        } else {
            l02.H(S(g10));
        }
        l02.K(i4Var.h());
        if (!i4Var.d().isEmpty() || i4Var.f().compareTo(w.f30653b) <= 0) {
            l02.J(i4Var.d());
        } else {
            l02.I(W(i4Var.f().c()));
        }
        if (i4Var.a() != null && (!i4Var.d().isEmpty() || i4Var.f().compareTo(w.f30653b) > 0)) {
            l02.G(com.google.protobuf.a0.i0().F(i4Var.a().intValue()));
        }
        return (a0) l02.build();
    }

    public t1 W(y6.q qVar) {
        t1.b k02 = t1.k0();
        k02.G(qVar.d());
        k02.F(qVar.c());
        return (t1) k02.build();
    }

    /* access modifiers changed from: package-private */
    public z.h X(r7.p pVar) {
        z.k.b bVar;
        z.k.b bVar2;
        p.b g10 = pVar.g();
        p.b bVar3 = p.b.EQUAL;
        if (g10 == bVar3 || pVar.g() == p.b.NOT_EQUAL) {
            z.k.a k02 = z.k.k0();
            k02.F(H(pVar.f()));
            if (u7.z.y(pVar.h())) {
                if (pVar.g() == bVar3) {
                    bVar2 = z.k.b.IS_NAN;
                } else {
                    bVar2 = z.k.b.IS_NOT_NAN;
                }
                k02.G(bVar2);
                return (z.h) z.h.n0().H(k02).build();
            } else if (u7.z.z(pVar.h())) {
                if (pVar.g() == bVar3) {
                    bVar = z.k.b.IS_NULL;
                } else {
                    bVar = z.k.b.IS_NOT_NULL;
                }
                k02.G(bVar);
                return (z.h) z.h.n0().H(k02).build();
            }
        }
        z.f.a m02 = z.f.m0();
        m02.F(H(pVar.f()));
        m02.G(G(pVar.g()));
        m02.H(pVar.h());
        return (z.h) z.h.n0().G(m02).build();
    }

    public t1 Y(w wVar) {
        return W(wVar.c());
    }

    public String a() {
        return this.f31088b;
    }

    /* access modifiers changed from: package-private */
    public r7.k b(z.d dVar) {
        ArrayList arrayList = new ArrayList();
        for (z.h i10 : dVar.k0()) {
            arrayList.add(i(i10));
        }
        return new r7.k(arrayList, c(dVar.l0()));
    }

    /* access modifiers changed from: package-private */
    public k.a c(z.d.b bVar) {
        int i10 = a.f31094f[bVar.ordinal()];
        if (i10 == 1) {
            return k.a.AND;
        }
        if (i10 == 2) {
            return k.a.OR;
        }
        throw b.a("Only AND and OR composite filter types are supported.", new Object[0]);
    }

    public boolean c0(u uVar) {
        if (!d0(uVar) || !uVar.h(1).equals(this.f31087a.f()) || !uVar.h(3).equals(this.f31087a.e())) {
            return false;
        }
        return true;
    }

    public f1 e(a0.c cVar) {
        int k02 = cVar.k0();
        b.d(k02 == 1, "DocumentsTarget contained other than 1 document %d", Integer.valueOf(k02));
        return a1.b(s(cVar.j0(0))).D();
    }

    /* access modifiers changed from: package-private */
    public r7.p f(z.f fVar) {
        return r7.p.e(r.p(fVar.j0().h0()), g(fVar.k0()), fVar.l0());
    }

    /* access modifiers changed from: package-private */
    public q i(z.h hVar) {
        int i10 = a.f31095g[hVar.l0().ordinal()];
        if (i10 == 1) {
            return b(hVar.i0());
        }
        if (i10 == 2) {
            return f(hVar.k0());
        }
        if (i10 == 3) {
            return x(hVar.m0());
        }
        throw b.a("Unrecognized Filter.filterType %d", hVar.l0());
    }

    public l l(String str) {
        u v10 = v(str);
        b.d(v10.h(1).equals(this.f31087a.f()), "Tried to deserialize key from different project.", new Object[0]);
        b.d(v10.h(3).equals(this.f31087a.e()), "Tried to deserialize key from different database.", new Object[0]);
        return l.g(a0(v10));
    }

    public s m(p8.e eVar) {
        if (eVar.j0().equals(e.c.FOUND)) {
            return k(eVar);
        }
        if (eVar.j0().equals(e.c.MISSING)) {
            return n(eVar);
        }
        throw new IllegalArgumentException("Unknown result case: " + eVar.j0());
    }

    public v7.f o(e0 e0Var) {
        m mVar;
        if (e0Var.v0()) {
            mVar = r(e0Var.n0());
        } else {
            mVar = m.f30717c;
        }
        m mVar2 = mVar;
        ArrayList arrayList = new ArrayList();
        for (p.c h10 : e0Var.t0()) {
            arrayList.add(h(h10));
        }
        int i10 = a.f31089a[e0Var.p0().ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                return new c(l(e0Var.o0()), mVar2);
            }
            if (i10 == 3) {
                return new v7.q(l(e0Var.u0()), mVar2);
            }
            throw b.a("Unknown mutation operation: %d", e0Var.p0());
        } else if (e0Var.y0()) {
            return new v7.l(l(e0Var.r0().l0()), t.g(e0Var.r0().j0()), d(e0Var.s0()), mVar2, arrayList);
        } else {
            return new v7.o(l(e0Var.r0().l0()), t.g(e0Var.r0().j0()), mVar2, arrayList);
        }
    }

    public i p(h0 h0Var, w wVar) {
        w y10 = y(h0Var.h0());
        if (!w.f30653b.equals(y10)) {
            wVar = y10;
        }
        int g02 = h0Var.g0();
        ArrayList arrayList = new ArrayList(g02);
        for (int i10 = 0; i10 < g02; i10++) {
            arrayList.add(h0Var.f0(i10));
        }
        return new i(wVar, arrayList);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public r7.f1 t(java.lang.String r14, p8.z r15) {
        /*
            r13 = this;
            u7.u r14 = r13.s(r14)
            int r0 = r15.s0()
            r1 = 0
            r2 = 0
            r3 = 1
            if (r0 <= 0) goto L_0x0034
            if (r0 != r3) goto L_0x0011
            r0 = 1
            goto L_0x0012
        L_0x0011:
            r0 = 0
        L_0x0012:
            java.lang.Object[] r4 = new java.lang.Object[r2]
            java.lang.String r5 = "StructuredQuery.from with more than one collection is not supported."
            y7.b.d(r0, r5, r4)
            p8.z$c r0 = r15.r0(r2)
            boolean r4 = r0.h0()
            if (r4 == 0) goto L_0x002a
            java.lang.String r0 = r0.i0()
            r5 = r14
            r6 = r0
            goto L_0x0036
        L_0x002a:
            java.lang.String r0 = r0.i0()
            u7.e r14 = r14.a(r0)
            u7.u r14 = (u7.u) r14
        L_0x0034:
            r5 = r14
            r6 = r1
        L_0x0036:
            boolean r14 = r15.B0()
            if (r14 == 0) goto L_0x0045
            p8.z$h r14 = r15.x0()
            java.util.List r14 = r13.j(r14)
            goto L_0x0049
        L_0x0045:
            java.util.List r14 = java.util.Collections.emptyList()
        L_0x0049:
            r7 = r14
            int r14 = r15.v0()
            if (r14 <= 0) goto L_0x0067
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r14)
        L_0x0055:
            if (r2 >= r14) goto L_0x0065
            p8.z$i r4 = r15.u0(r2)
            r7.z0 r4 = r13.q(r4)
            r0.add(r4)
            int r2 = r2 + 1
            goto L_0x0055
        L_0x0065:
            r8 = r0
            goto L_0x006c
        L_0x0067:
            java.util.List r14 = java.util.Collections.emptyList()
            r8 = r14
        L_0x006c:
            r9 = -1
            boolean r14 = r15.z0()
            if (r14 == 0) goto L_0x007d
            com.google.protobuf.a0 r14 = r15.t0()
            int r14 = r14.h0()
            long r9 = (long) r14
        L_0x007d:
            boolean r14 = r15.A0()
            if (r14 == 0) goto L_0x009a
            r7.i r14 = new r7.i
            p8.j r0 = r15.w0()
            java.util.List r0 = r0.g()
            p8.j r2 = r15.w0()
            boolean r2 = r2.j0()
            r14.<init>(r0, r2)
            r11 = r14
            goto L_0x009b
        L_0x009a:
            r11 = r1
        L_0x009b:
            boolean r14 = r15.y0()
            if (r14 == 0) goto L_0x00b7
            r7.i r1 = new r7.i
            p8.j r14 = r15.q0()
            java.util.List r14 = r14.g()
            p8.j r15 = r15.q0()
            boolean r15 = r15.j0()
            r15 = r15 ^ r3
            r1.<init>(r14, r15)
        L_0x00b7:
            r12 = r1
            r7.f1 r14 = new r7.f1
            r4 = r14
            r4.<init>(r5, r6, r7, r8, r9, r11, r12)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: x7.n0.t(java.lang.String, p8.z):r7.f1");
    }

    public f1 u(a0.d dVar) {
        return t(dVar.i0(), dVar.j0());
    }

    public y6.q w(t1 t1Var) {
        return new y6.q(t1Var.j0(), t1Var.i0());
    }

    public w y(t1 t1Var) {
        if (t1Var.j0() == 0 && t1Var.i0() == 0) {
            return w.f30653b;
        }
        return new w(w(t1Var));
    }

    public w z(p8.t tVar) {
        if (tVar.k0() != t.c.TARGET_CHANGE) {
            return w.f30653b;
        }
        if (tVar.l0().k0() != 0) {
            return w.f30653b;
        }
        return y(tVar.l0().h0());
    }
}
