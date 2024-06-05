package kc;

import android.os.Bundle;
import com.unity3d.ads.metadata.MediationMetaData;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import lc.j;
import lc.k;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: TextInputChannel */
public class q {

    /* renamed from: a  reason: collision with root package name */
    public final k f35949a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public f f35950b;

    /* renamed from: c  reason: collision with root package name */
    final k.c f35951c;

    /* compiled from: TextInputChannel */
    class a implements k.c {
        a() {
        }

        public void onMethodCall(j jVar, k.d dVar) {
            Bundle bundle;
            j jVar2 = jVar;
            k.d dVar2 = dVar;
            if (q.this.f35950b != null) {
                String str = jVar2.f36116a;
                Object obj = jVar2.f36117b;
                xb.b.f("TextInputChannel", "Received '" + str + "' message.");
                str.hashCode();
                char c10 = 65535;
                switch (str.hashCode()) {
                    case -1779068172:
                        if (str.equals("TextInput.setPlatformViewClient")) {
                            c10 = 0;
                            break;
                        }
                        break;
                    case -1015421462:
                        if (str.equals("TextInput.setEditingState")) {
                            c10 = 1;
                            break;
                        }
                        break;
                    case -37561188:
                        if (str.equals("TextInput.setClient")) {
                            c10 = 2;
                            break;
                        }
                        break;
                    case 270476819:
                        if (str.equals("TextInput.hide")) {
                            c10 = 3;
                            break;
                        }
                        break;
                    case 270803918:
                        if (str.equals("TextInput.show")) {
                            c10 = 4;
                            break;
                        }
                        break;
                    case 649192816:
                        if (str.equals("TextInput.sendAppPrivateCommand")) {
                            c10 = 5;
                            break;
                        }
                        break;
                    case 1204752139:
                        if (str.equals("TextInput.setEditableSizeAndTransform")) {
                            c10 = 6;
                            break;
                        }
                        break;
                    case 1727570905:
                        if (str.equals("TextInput.finishAutofillContext")) {
                            c10 = 7;
                            break;
                        }
                        break;
                    case 1904427655:
                        if (str.equals("TextInput.clearClient")) {
                            c10 = 8;
                            break;
                        }
                        break;
                    case 2113369584:
                        if (str.equals("TextInput.requestAutofill")) {
                            c10 = 9;
                            break;
                        }
                        break;
                }
                switch (c10) {
                    case 0:
                        try {
                            JSONObject jSONObject = (JSONObject) obj;
                            q.this.f35950b.b(jSONObject.getInt("platformViewId"), jSONObject.optBoolean("usesVirtualDisplay", false));
                            dVar2.success((Object) null);
                            return;
                        } catch (JSONException e10) {
                            dVar2.error("error", e10.getMessage(), (Object) null);
                            return;
                        }
                    case 1:
                        try {
                            q.this.f35950b.e(e.a((JSONObject) obj));
                            dVar2.success((Object) null);
                            return;
                        } catch (JSONException e11) {
                            dVar2.error("error", e11.getMessage(), (Object) null);
                            return;
                        }
                    case 2:
                        try {
                            JSONArray jSONArray = (JSONArray) obj;
                            q.this.f35950b.d(jSONArray.getInt(0), b.a(jSONArray.getJSONObject(1)));
                            dVar2.success((Object) null);
                            return;
                        } catch (NoSuchFieldException | JSONException e12) {
                            dVar2.error("error", e12.getMessage(), (Object) null);
                            return;
                        }
                    case 3:
                        q.this.f35950b.i();
                        dVar2.success((Object) null);
                        return;
                    case 4:
                        q.this.f35950b.show();
                        dVar2.success((Object) null);
                        return;
                    case 5:
                        try {
                            JSONObject jSONObject2 = (JSONObject) obj;
                            String string = jSONObject2.getString("action");
                            String string2 = jSONObject2.getString(JsonStorageKeyNames.DATA_KEY);
                            if (string2 == null || string2.isEmpty()) {
                                bundle = null;
                            } else {
                                bundle = new Bundle();
                                bundle.putString(JsonStorageKeyNames.DATA_KEY, string2);
                            }
                            q.this.f35950b.a(string, bundle);
                            dVar2.success((Object) null);
                            return;
                        } catch (JSONException e13) {
                            dVar2.error("error", e13.getMessage(), (Object) null);
                            return;
                        }
                    case 6:
                        try {
                            JSONObject jSONObject3 = (JSONObject) obj;
                            double d10 = jSONObject3.getDouble("width");
                            double d11 = jSONObject3.getDouble("height");
                            JSONArray jSONArray2 = jSONObject3.getJSONArray("transform");
                            double[] dArr = new double[16];
                            for (int i10 = 0; i10 < 16; i10++) {
                                dArr[i10] = jSONArray2.getDouble(i10);
                            }
                            q.this.f35950b.c(d10, d11, dArr);
                            dVar2.success((Object) null);
                            return;
                        } catch (JSONException e14) {
                            dVar2.error("error", e14.getMessage(), (Object) null);
                            return;
                        }
                    case 7:
                        q.this.f35950b.g(((Boolean) obj).booleanValue());
                        dVar2.success((Object) null);
                        return;
                    case 8:
                        q.this.f35950b.h();
                        dVar2.success((Object) null);
                        return;
                    case 9:
                        q.this.f35950b.f();
                        dVar2.success((Object) null);
                        return;
                    default:
                        dVar.notImplemented();
                        return;
                }
            }
        }
    }

    /* compiled from: TextInputChannel */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f35953a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f35954b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f35955c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f35956d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f35957e;

        /* renamed from: f  reason: collision with root package name */
        public final d f35958f;

        /* renamed from: g  reason: collision with root package name */
        public final c f35959g;

        /* renamed from: h  reason: collision with root package name */
        public final Integer f35960h;

        /* renamed from: i  reason: collision with root package name */
        public final String f35961i;

        /* renamed from: j  reason: collision with root package name */
        public final a f35962j;

        /* renamed from: k  reason: collision with root package name */
        public final String[] f35963k;

        /* renamed from: l  reason: collision with root package name */
        public final b[] f35964l;

        /* compiled from: TextInputChannel */
        public static class a {

            /* renamed from: a  reason: collision with root package name */
            public final String f35965a;

            /* renamed from: b  reason: collision with root package name */
            public final String[] f35966b;

            /* renamed from: c  reason: collision with root package name */
            public final e f35967c;

            /* renamed from: d  reason: collision with root package name */
            public final String f35968d;

            public a(String str, String[] strArr, String str2, e eVar) {
                this.f35965a = str;
                this.f35966b = strArr;
                this.f35968d = str2;
                this.f35967c = eVar;
            }

            public static a a(JSONObject jSONObject) throws JSONException, NoSuchFieldException {
                String string = jSONObject.getString("uniqueIdentifier");
                JSONArray jSONArray = jSONObject.getJSONArray("hints");
                String string2 = jSONObject.isNull("hintText") ? null : jSONObject.getString("hintText");
                JSONObject jSONObject2 = jSONObject.getJSONObject("editingValue");
                String[] strArr = new String[jSONArray.length()];
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    strArr[i10] = b(jSONArray.getString(i10));
                }
                return new a(string, strArr, string2, e.a(jSONObject2));
            }

            /* JADX WARNING: Can't fix incorrect switch cases order */
            /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a3, code lost:
                if (r0.equals("familyName") == false) goto L_0x002d;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            private static java.lang.String b(java.lang.String r16) {
                /*
                    r0 = r16
                    int r1 = android.os.Build.VERSION.SDK_INT
                    r2 = 26
                    if (r1 >= r2) goto L_0x0009
                    return r0
                L_0x0009:
                    r16.hashCode()
                    int r3 = r16.hashCode()
                    java.lang.String r4 = "postalCode"
                    java.lang.String r5 = "postalAddress"
                    java.lang.String r6 = "password"
                    java.lang.String r7 = "newUsername"
                    java.lang.String r8 = "username"
                    java.lang.String r9 = "creditCardExpirationYear"
                    java.lang.String r10 = "creditCardExpirationDate"
                    java.lang.String r11 = "creditCardNumber"
                    java.lang.String r12 = "gender"
                    java.lang.String r13 = "creditCardExpirationDay"
                    java.lang.String r14 = "creditCardSecurityCode"
                    java.lang.String r15 = "newPassword"
                    java.lang.String r1 = "creditCardExpirationMonth"
                    switch(r3) {
                        case -2058889126: goto L_0x01e3;
                        case -1917283616: goto L_0x01d7;
                        case -1844815832: goto L_0x01cd;
                        case -1825589953: goto L_0x01c1;
                        case -1821235109: goto L_0x01b7;
                        case -1757573738: goto L_0x01ad;
                        case -1682373820: goto L_0x01a3;
                        case -1658955742: goto L_0x0197;
                        case -1567118045: goto L_0x018a;
                        case -1476752575: goto L_0x017c;
                        case -1413737489: goto L_0x016e;
                        case -1377792129: goto L_0x0160;
                        case -1249512767: goto L_0x0154;
                        case -1186060294: goto L_0x0146;
                        case -1151034798: goto L_0x013a;
                        case -835992323: goto L_0x012c;
                        case -818219584: goto L_0x011e;
                        case -747304516: goto L_0x0110;
                        case -613980922: goto L_0x0104;
                        case -613352043: goto L_0x00f8;
                        case -549230602: goto L_0x00ea;
                        case -265713450: goto L_0x00de;
                        case 3373707: goto L_0x00d0;
                        case 96619420: goto L_0x00c2;
                        case 253202685: goto L_0x00b4;
                        case 588174851: goto L_0x00a6;
                        case 798554127: goto L_0x009d;
                        case 892233837: goto L_0x0090;
                        case 991032982: goto L_0x0085;
                        case 1069376125: goto L_0x0078;
                        case 1216985755: goto L_0x006d;
                        case 1469046696: goto L_0x0060;
                        case 1662667945: goto L_0x0055;
                        case 1921869058: goto L_0x0048;
                        case 2011152728: goto L_0x003d;
                        case 2011773919: goto L_0x0030;
                        default: goto L_0x002d;
                    }
                L_0x002d:
                    r2 = -1
                    goto L_0x01ee
                L_0x0030:
                    java.lang.String r2 = "birthdayDay"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x0039
                    goto L_0x002d
                L_0x0039:
                    r2 = 35
                    goto L_0x01ee
                L_0x003d:
                    boolean r2 = r0.equals(r4)
                    if (r2 != 0) goto L_0x0044
                    goto L_0x002d
                L_0x0044:
                    r2 = 34
                    goto L_0x01ee
                L_0x0048:
                    java.lang.String r2 = "postalAddressExtended"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x0051
                    goto L_0x002d
                L_0x0051:
                    r2 = 33
                    goto L_0x01ee
                L_0x0055:
                    boolean r2 = r0.equals(r5)
                    if (r2 != 0) goto L_0x005c
                    goto L_0x002d
                L_0x005c:
                    r2 = 32
                    goto L_0x01ee
                L_0x0060:
                    java.lang.String r2 = "givenName"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x0069
                    goto L_0x002d
                L_0x0069:
                    r2 = 31
                    goto L_0x01ee
                L_0x006d:
                    boolean r2 = r0.equals(r6)
                    if (r2 != 0) goto L_0x0074
                    goto L_0x002d
                L_0x0074:
                    r2 = 30
                    goto L_0x01ee
                L_0x0078:
                    java.lang.String r2 = "birthday"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x0081
                    goto L_0x002d
                L_0x0081:
                    r2 = 29
                    goto L_0x01ee
                L_0x0085:
                    boolean r2 = r0.equals(r7)
                    if (r2 != 0) goto L_0x008c
                    goto L_0x002d
                L_0x008c:
                    r2 = 28
                    goto L_0x01ee
                L_0x0090:
                    java.lang.String r2 = "telephoneNumber"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x0099
                    goto L_0x002d
                L_0x0099:
                    r2 = 27
                    goto L_0x01ee
                L_0x009d:
                    java.lang.String r3 = "familyName"
                    boolean r3 = r0.equals(r3)
                    if (r3 != 0) goto L_0x01ee
                    goto L_0x002d
                L_0x00a6:
                    java.lang.String r2 = "birthdayMonth"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x00b0
                    goto L_0x002d
                L_0x00b0:
                    r2 = 25
                    goto L_0x01ee
                L_0x00b4:
                    java.lang.String r2 = "addressState"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x00be
                    goto L_0x002d
                L_0x00be:
                    r2 = 24
                    goto L_0x01ee
                L_0x00c2:
                    java.lang.String r2 = "email"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x00cc
                    goto L_0x002d
                L_0x00cc:
                    r2 = 23
                    goto L_0x01ee
                L_0x00d0:
                    java.lang.String r2 = "name"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x00da
                    goto L_0x002d
                L_0x00da:
                    r2 = 22
                    goto L_0x01ee
                L_0x00de:
                    boolean r2 = r0.equals(r8)
                    if (r2 != 0) goto L_0x00e6
                    goto L_0x002d
                L_0x00e6:
                    r2 = 21
                    goto L_0x01ee
                L_0x00ea:
                    java.lang.String r2 = "telephoneNumberCountryCode"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x00f4
                    goto L_0x002d
                L_0x00f4:
                    r2 = 20
                    goto L_0x01ee
                L_0x00f8:
                    boolean r2 = r0.equals(r9)
                    if (r2 != 0) goto L_0x0100
                    goto L_0x002d
                L_0x0100:
                    r2 = 19
                    goto L_0x01ee
                L_0x0104:
                    boolean r2 = r0.equals(r10)
                    if (r2 != 0) goto L_0x010c
                    goto L_0x002d
                L_0x010c:
                    r2 = 18
                    goto L_0x01ee
                L_0x0110:
                    java.lang.String r2 = "nameSuffix"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x011a
                    goto L_0x002d
                L_0x011a:
                    r2 = 17
                    goto L_0x01ee
                L_0x011e:
                    java.lang.String r2 = "middleName"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x0128
                    goto L_0x002d
                L_0x0128:
                    r2 = 16
                    goto L_0x01ee
                L_0x012c:
                    java.lang.String r2 = "namePrefix"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x0136
                    goto L_0x002d
                L_0x0136:
                    r2 = 15
                    goto L_0x01ee
                L_0x013a:
                    boolean r2 = r0.equals(r11)
                    if (r2 != 0) goto L_0x0142
                    goto L_0x002d
                L_0x0142:
                    r2 = 14
                    goto L_0x01ee
                L_0x0146:
                    java.lang.String r2 = "postalAddressExtendedPostalCode"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x0150
                    goto L_0x002d
                L_0x0150:
                    r2 = 13
                    goto L_0x01ee
                L_0x0154:
                    boolean r2 = r0.equals(r12)
                    if (r2 != 0) goto L_0x015c
                    goto L_0x002d
                L_0x015c:
                    r2 = 12
                    goto L_0x01ee
                L_0x0160:
                    java.lang.String r2 = "addressCity"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x016a
                    goto L_0x002d
                L_0x016a:
                    r2 = 11
                    goto L_0x01ee
                L_0x016e:
                    java.lang.String r2 = "middleInitial"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x0178
                    goto L_0x002d
                L_0x0178:
                    r2 = 10
                    goto L_0x01ee
                L_0x017c:
                    java.lang.String r2 = "countryName"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x0186
                    goto L_0x002d
                L_0x0186:
                    r2 = 9
                    goto L_0x01ee
                L_0x018a:
                    java.lang.String r2 = "telephoneNumberDevice"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x0194
                    goto L_0x002d
                L_0x0194:
                    r2 = 8
                    goto L_0x01ee
                L_0x0197:
                    java.lang.String r2 = "fullStreetAddress"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x01a1
                    goto L_0x002d
                L_0x01a1:
                    r2 = 7
                    goto L_0x01ee
                L_0x01a3:
                    boolean r2 = r0.equals(r13)
                    if (r2 != 0) goto L_0x01ab
                    goto L_0x002d
                L_0x01ab:
                    r2 = 6
                    goto L_0x01ee
                L_0x01ad:
                    boolean r2 = r0.equals(r14)
                    if (r2 != 0) goto L_0x01b5
                    goto L_0x002d
                L_0x01b5:
                    r2 = 5
                    goto L_0x01ee
                L_0x01b7:
                    boolean r2 = r0.equals(r15)
                    if (r2 != 0) goto L_0x01bf
                    goto L_0x002d
                L_0x01bf:
                    r2 = 4
                    goto L_0x01ee
                L_0x01c1:
                    java.lang.String r2 = "telephoneNumberNational"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x01cb
                    goto L_0x002d
                L_0x01cb:
                    r2 = 3
                    goto L_0x01ee
                L_0x01cd:
                    boolean r2 = r0.equals(r1)
                    if (r2 != 0) goto L_0x01d5
                    goto L_0x002d
                L_0x01d5:
                    r2 = 2
                    goto L_0x01ee
                L_0x01d7:
                    java.lang.String r2 = "oneTimeCode"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x01e1
                    goto L_0x002d
                L_0x01e1:
                    r2 = 1
                    goto L_0x01ee
                L_0x01e3:
                    java.lang.String r2 = "birthdayYear"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x01ed
                    goto L_0x002d
                L_0x01ed:
                    r2 = 0
                L_0x01ee:
                    switch(r2) {
                        case 0: goto L_0x0241;
                        case 1: goto L_0x023e;
                        case 2: goto L_0x023d;
                        case 3: goto L_0x023a;
                        case 4: goto L_0x0239;
                        case 5: goto L_0x0238;
                        case 6: goto L_0x0237;
                        case 7: goto L_0x0234;
                        case 8: goto L_0x0231;
                        case 9: goto L_0x022e;
                        case 10: goto L_0x022b;
                        case 11: goto L_0x0228;
                        case 12: goto L_0x0227;
                        case 13: goto L_0x0224;
                        case 14: goto L_0x0223;
                        case 15: goto L_0x0220;
                        case 16: goto L_0x021d;
                        case 17: goto L_0x021a;
                        case 18: goto L_0x0219;
                        case 19: goto L_0x0218;
                        case 20: goto L_0x0215;
                        case 21: goto L_0x0214;
                        case 22: goto L_0x0211;
                        case 23: goto L_0x020e;
                        case 24: goto L_0x020b;
                        case 25: goto L_0x0208;
                        case 26: goto L_0x0205;
                        case 27: goto L_0x0202;
                        case 28: goto L_0x0201;
                        case 29: goto L_0x01fe;
                        case 30: goto L_0x01fd;
                        case 31: goto L_0x01fa;
                        case 32: goto L_0x01f9;
                        case 33: goto L_0x01f6;
                        case 34: goto L_0x01f5;
                        case 35: goto L_0x01f2;
                        default: goto L_0x01f1;
                    }
                L_0x01f1:
                    return r0
                L_0x01f2:
                    java.lang.String r0 = "birthDateDay"
                    return r0
                L_0x01f5:
                    return r4
                L_0x01f6:
                    java.lang.String r0 = "extendedAddress"
                    return r0
                L_0x01f9:
                    return r5
                L_0x01fa:
                    java.lang.String r0 = "personGivenName"
                    return r0
                L_0x01fd:
                    return r6
                L_0x01fe:
                    java.lang.String r0 = "birthDateFull"
                    return r0
                L_0x0201:
                    return r7
                L_0x0202:
                    java.lang.String r0 = "phoneNumber"
                    return r0
                L_0x0205:
                    java.lang.String r0 = "personFamilyName"
                    return r0
                L_0x0208:
                    java.lang.String r0 = "birthDateMonth"
                    return r0
                L_0x020b:
                    java.lang.String r0 = "addressRegion"
                    return r0
                L_0x020e:
                    java.lang.String r0 = "emailAddress"
                    return r0
                L_0x0211:
                    java.lang.String r0 = "personName"
                    return r0
                L_0x0214:
                    return r8
                L_0x0215:
                    java.lang.String r0 = "phoneCountryCode"
                    return r0
                L_0x0218:
                    return r9
                L_0x0219:
                    return r10
                L_0x021a:
                    java.lang.String r0 = "personNameSuffix"
                    return r0
                L_0x021d:
                    java.lang.String r0 = "personMiddleName"
                    return r0
                L_0x0220:
                    java.lang.String r0 = "personNamePrefix"
                    return r0
                L_0x0223:
                    return r11
                L_0x0224:
                    java.lang.String r0 = "extendedPostalCode"
                    return r0
                L_0x0227:
                    return r12
                L_0x0228:
                    java.lang.String r0 = "addressLocality"
                    return r0
                L_0x022b:
                    java.lang.String r0 = "personMiddleInitial"
                    return r0
                L_0x022e:
                    java.lang.String r0 = "addressCountry"
                    return r0
                L_0x0231:
                    java.lang.String r0 = "phoneNumberDevice"
                    return r0
                L_0x0234:
                    java.lang.String r0 = "streetAddress"
                    return r0
                L_0x0237:
                    return r13
                L_0x0238:
                    return r14
                L_0x0239:
                    return r15
                L_0x023a:
                    java.lang.String r0 = "phoneNational"
                    return r0
                L_0x023d:
                    return r1
                L_0x023e:
                    java.lang.String r0 = "smsOTPCode"
                    return r0
                L_0x0241:
                    java.lang.String r0 = "birthDateYear"
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: kc.q.b.a.b(java.lang.String):java.lang.String");
            }
        }

        public b(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, d dVar, c cVar, Integer num, String str, a aVar, String[] strArr, b[] bVarArr) {
            this.f35953a = z10;
            this.f35954b = z11;
            this.f35955c = z12;
            this.f35956d = z13;
            this.f35957e = z14;
            this.f35958f = dVar;
            this.f35959g = cVar;
            this.f35960h = num;
            this.f35961i = str;
            this.f35962j = aVar;
            this.f35963k = strArr;
            this.f35964l = bVarArr;
        }

        public static b a(JSONObject jSONObject) throws JSONException, NoSuchFieldException {
            b[] bVarArr;
            JSONArray jSONArray;
            JSONObject jSONObject2 = jSONObject;
            String string = jSONObject2.getString("inputAction");
            if (string != null) {
                a aVar = null;
                if (!jSONObject2.isNull("fields")) {
                    JSONArray jSONArray2 = jSONObject2.getJSONArray("fields");
                    int length = jSONArray2.length();
                    b[] bVarArr2 = new b[length];
                    for (int i10 = 0; i10 < length; i10++) {
                        bVarArr2[i10] = a(jSONArray2.getJSONObject(i10));
                    }
                    bVarArr = bVarArr2;
                } else {
                    bVarArr = null;
                }
                Integer b10 = b(string);
                ArrayList arrayList = new ArrayList();
                if (jSONObject2.isNull("contentCommitMimeTypes")) {
                    jSONArray = null;
                } else {
                    jSONArray = jSONObject2.getJSONArray("contentCommitMimeTypes");
                }
                if (jSONArray != null) {
                    for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                        arrayList.add(jSONArray.optString(i11));
                    }
                }
                boolean optBoolean = jSONObject2.optBoolean("obscureText");
                boolean optBoolean2 = jSONObject2.optBoolean("autocorrect", true);
                boolean optBoolean3 = jSONObject2.optBoolean("enableSuggestions");
                boolean optBoolean4 = jSONObject2.optBoolean("enableIMEPersonalizedLearning");
                boolean optBoolean5 = jSONObject2.optBoolean("enableDeltaModel");
                d a10 = d.a(jSONObject2.getString("textCapitalization"));
                c a11 = c.a(jSONObject2.getJSONObject("inputType"));
                String string2 = jSONObject2.isNull("actionLabel") ? null : jSONObject2.getString("actionLabel");
                if (!jSONObject2.isNull("autofill")) {
                    aVar = a.a(jSONObject2.getJSONObject("autofill"));
                }
                return new b(optBoolean, optBoolean2, optBoolean3, optBoolean4, optBoolean5, a10, a11, b10, string2, aVar, (String[]) arrayList.toArray(new String[arrayList.size()]), bVarArr);
            }
            throw new JSONException("Configuration JSON missing 'inputAction' property.");
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0072, code lost:
            if (r12.equals("TextInputAction.done") == false) goto L_0x001b;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static java.lang.Integer b(java.lang.String r12) {
            /*
                r12.hashCode()
                int r0 = r12.hashCode()
                r1 = 7
                r2 = 6
                r3 = 5
                r4 = 4
                r5 = 3
                r6 = 2
                r7 = 1
                java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
                r9 = 0
                java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
                r11 = -1
                switch(r0) {
                    case -810971940: goto L_0x0075;
                    case -737377923: goto L_0x006c;
                    case -737089298: goto L_0x0061;
                    case -737080013: goto L_0x0056;
                    case -736940669: goto L_0x004b;
                    case 469250275: goto L_0x0040;
                    case 1241689507: goto L_0x0035;
                    case 1539450297: goto L_0x002a;
                    case 2110497650: goto L_0x001e;
                    default: goto L_0x001b;
                }
            L_0x001b:
                r7 = -1
                goto L_0x007f
            L_0x001e:
                java.lang.String r0 = "TextInputAction.previous"
                boolean r12 = r12.equals(r0)
                if (r12 != 0) goto L_0x0027
                goto L_0x001b
            L_0x0027:
                r7 = 8
                goto L_0x007f
            L_0x002a:
                java.lang.String r0 = "TextInputAction.newline"
                boolean r12 = r12.equals(r0)
                if (r12 != 0) goto L_0x0033
                goto L_0x001b
            L_0x0033:
                r7 = 7
                goto L_0x007f
            L_0x0035:
                java.lang.String r0 = "TextInputAction.go"
                boolean r12 = r12.equals(r0)
                if (r12 != 0) goto L_0x003e
                goto L_0x001b
            L_0x003e:
                r7 = 6
                goto L_0x007f
            L_0x0040:
                java.lang.String r0 = "TextInputAction.search"
                boolean r12 = r12.equals(r0)
                if (r12 != 0) goto L_0x0049
                goto L_0x001b
            L_0x0049:
                r7 = 5
                goto L_0x007f
            L_0x004b:
                java.lang.String r0 = "TextInputAction.send"
                boolean r12 = r12.equals(r0)
                if (r12 != 0) goto L_0x0054
                goto L_0x001b
            L_0x0054:
                r7 = 4
                goto L_0x007f
            L_0x0056:
                java.lang.String r0 = "TextInputAction.none"
                boolean r12 = r12.equals(r0)
                if (r12 != 0) goto L_0x005f
                goto L_0x001b
            L_0x005f:
                r7 = 3
                goto L_0x007f
            L_0x0061:
                java.lang.String r0 = "TextInputAction.next"
                boolean r12 = r12.equals(r0)
                if (r12 != 0) goto L_0x006a
                goto L_0x001b
            L_0x006a:
                r7 = 2
                goto L_0x007f
            L_0x006c:
                java.lang.String r0 = "TextInputAction.done"
                boolean r12 = r12.equals(r0)
                if (r12 != 0) goto L_0x007f
                goto L_0x001b
            L_0x0075:
                java.lang.String r0 = "TextInputAction.unspecified"
                boolean r12 = r12.equals(r0)
                if (r12 != 0) goto L_0x007e
                goto L_0x001b
            L_0x007e:
                r7 = 0
            L_0x007f:
                switch(r7) {
                    case 0: goto L_0x00a3;
                    case 1: goto L_0x009e;
                    case 2: goto L_0x0099;
                    case 3: goto L_0x0098;
                    case 4: goto L_0x0093;
                    case 5: goto L_0x008e;
                    case 6: goto L_0x0089;
                    case 7: goto L_0x0088;
                    case 8: goto L_0x0083;
                    default: goto L_0x0082;
                }
            L_0x0082:
                return r10
            L_0x0083:
                java.lang.Integer r12 = java.lang.Integer.valueOf(r1)
                return r12
            L_0x0088:
                return r8
            L_0x0089:
                java.lang.Integer r12 = java.lang.Integer.valueOf(r6)
                return r12
            L_0x008e:
                java.lang.Integer r12 = java.lang.Integer.valueOf(r5)
                return r12
            L_0x0093:
                java.lang.Integer r12 = java.lang.Integer.valueOf(r4)
                return r12
            L_0x0098:
                return r8
            L_0x0099:
                java.lang.Integer r12 = java.lang.Integer.valueOf(r3)
                return r12
            L_0x009e:
                java.lang.Integer r12 = java.lang.Integer.valueOf(r2)
                return r12
            L_0x00a3:
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: kc.q.b.b(java.lang.String):java.lang.Integer");
        }
    }

    /* compiled from: TextInputChannel */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final g f35969a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f35970b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f35971c;

        public c(g gVar, boolean z10, boolean z11) {
            this.f35969a = gVar;
            this.f35970b = z10;
            this.f35971c = z11;
        }

        public static c a(JSONObject jSONObject) throws JSONException, NoSuchFieldException {
            return new c(g.a(jSONObject.getString(MediationMetaData.KEY_NAME)), jSONObject.optBoolean("signed", false), jSONObject.optBoolean("decimal", false));
        }
    }

    /* compiled from: TextInputChannel */
    public enum d {
        CHARACTERS("TextCapitalization.characters"),
        WORDS("TextCapitalization.words"),
        SENTENCES("TextCapitalization.sentences"),
        NONE("TextCapitalization.none");
        

        /* renamed from: a  reason: collision with root package name */
        private final String f35977a;

        private d(String str) {
            this.f35977a = str;
        }

        static d a(String str) throws NoSuchFieldException {
            for (d dVar : values()) {
                if (dVar.f35977a.equals(str)) {
                    return dVar;
                }
            }
            throw new NoSuchFieldException("No such TextCapitalization: " + str);
        }
    }

    /* compiled from: TextInputChannel */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public final String f35978a;

        /* renamed from: b  reason: collision with root package name */
        public final int f35979b;

        /* renamed from: c  reason: collision with root package name */
        public final int f35980c;

        /* renamed from: d  reason: collision with root package name */
        public final int f35981d;

        /* renamed from: e  reason: collision with root package name */
        public final int f35982e;

        public e(String str, int i10, int i11, int i12, int i13) throws IndexOutOfBoundsException {
            if (!(i10 == -1 && i11 == -1) && (i10 < 0 || i11 < 0)) {
                throw new IndexOutOfBoundsException("invalid selection: (" + String.valueOf(i10) + ", " + String.valueOf(i11) + ")");
            } else if (!(i12 == -1 && i13 == -1) && (i12 < 0 || i12 > i13)) {
                throw new IndexOutOfBoundsException("invalid composing range: (" + String.valueOf(i12) + ", " + String.valueOf(i13) + ")");
            } else if (i13 > str.length()) {
                throw new IndexOutOfBoundsException("invalid composing start: " + String.valueOf(i12));
            } else if (i10 > str.length()) {
                throw new IndexOutOfBoundsException("invalid selection start: " + String.valueOf(i10));
            } else if (i11 <= str.length()) {
                this.f35978a = str;
                this.f35979b = i10;
                this.f35980c = i11;
                this.f35981d = i12;
                this.f35982e = i13;
            } else {
                throw new IndexOutOfBoundsException("invalid selection end: " + String.valueOf(i11));
            }
        }

        public static e a(JSONObject jSONObject) throws JSONException {
            return new e(jSONObject.getString("text"), jSONObject.getInt("selectionBase"), jSONObject.getInt("selectionExtent"), jSONObject.getInt("composingBase"), jSONObject.getInt("composingExtent"));
        }

        public boolean b() {
            int i10 = this.f35981d;
            return i10 >= 0 && this.f35982e > i10;
        }

        public boolean c() {
            return this.f35979b >= 0;
        }
    }

    /* compiled from: TextInputChannel */
    public interface f {
        void a(String str, Bundle bundle);

        void b(int i10, boolean z10);

        void c(double d10, double d11, double[] dArr);

        void d(int i10, b bVar);

        void e(e eVar);

        void f();

        void g(boolean z10);

        void h();

        void i();

        void show();
    }

    /* compiled from: TextInputChannel */
    public enum g {
        f35983b("TextInputType.text"),
        DATETIME("TextInputType.datetime"),
        NAME("TextInputType.name"),
        POSTAL_ADDRESS("TextInputType.address"),
        NUMBER("TextInputType.number"),
        PHONE("TextInputType.phone"),
        MULTILINE("TextInputType.multiline"),
        EMAIL_ADDRESS("TextInputType.emailAddress"),
        URL("TextInputType.url"),
        VISIBLE_PASSWORD("TextInputType.visiblePassword"),
        NONE("TextInputType.none");
        

        /* renamed from: a  reason: collision with root package name */
        private final String f35995a;

        private g(String str) {
            this.f35995a = str;
        }

        static g a(String str) throws NoSuchFieldException {
            for (g gVar : values()) {
                if (gVar.f35995a.equals(str)) {
                    return gVar;
                }
            }
            throw new NoSuchFieldException("No such TextInputType: " + str);
        }
    }

    public q(zb.a aVar) {
        a aVar2 = new a();
        this.f35951c = aVar2;
        k kVar = new k(aVar, "flutter/textinput", lc.g.f36115a);
        this.f35949a = kVar;
        kVar.e(aVar2);
    }

    private static HashMap<Object, Object> c(ArrayList<io.flutter.plugin.editing.e> arrayList) {
        HashMap<Object, Object> hashMap = new HashMap<>();
        JSONArray jSONArray = new JSONArray();
        Iterator<io.flutter.plugin.editing.e> it = arrayList.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().b());
        }
        hashMap.put("deltas", jSONArray);
        return hashMap;
    }

    private static HashMap<Object, Object> d(String str, int i10, int i11, int i12, int i13) {
        HashMap<Object, Object> hashMap = new HashMap<>();
        hashMap.put("text", str);
        hashMap.put("selectionBase", Integer.valueOf(i10));
        hashMap.put("selectionExtent", Integer.valueOf(i11));
        hashMap.put("composingBase", Integer.valueOf(i12));
        hashMap.put("composingExtent", Integer.valueOf(i13));
        return hashMap;
    }

    public void b(int i10, Map<String, Object> map) {
        xb.b.f("TextInputChannel", "Sending 'commitContent' message.");
        this.f35949a.c("TextInputClient.performAction", Arrays.asList(new Object[]{Integer.valueOf(i10), "TextInputAction.commitContent", map}));
    }

    public void e(int i10) {
        xb.b.f("TextInputChannel", "Sending 'done' message.");
        this.f35949a.c("TextInputClient.performAction", Arrays.asList(new Serializable[]{Integer.valueOf(i10), "TextInputAction.done"}));
    }

    public void f(int i10) {
        xb.b.f("TextInputChannel", "Sending 'go' message.");
        this.f35949a.c("TextInputClient.performAction", Arrays.asList(new Serializable[]{Integer.valueOf(i10), "TextInputAction.go"}));
    }

    public void g(int i10) {
        xb.b.f("TextInputChannel", "Sending 'newline' message.");
        this.f35949a.c("TextInputClient.performAction", Arrays.asList(new Serializable[]{Integer.valueOf(i10), "TextInputAction.newline"}));
    }

    public void h(int i10) {
        xb.b.f("TextInputChannel", "Sending 'next' message.");
        this.f35949a.c("TextInputClient.performAction", Arrays.asList(new Serializable[]{Integer.valueOf(i10), "TextInputAction.next"}));
    }

    public void i(int i10) {
        xb.b.f("TextInputChannel", "Sending 'onConnectionClosed' message.");
        this.f35949a.c("TextInputClient.onConnectionClosed", Arrays.asList(new Serializable[]{Integer.valueOf(i10), "TextInputClient.onConnectionClosed"}));
    }

    public void j(int i10, String str, Bundle bundle) {
        HashMap hashMap = new HashMap();
        hashMap.put("action", str);
        if (bundle != null) {
            HashMap hashMap2 = new HashMap();
            for (String str2 : bundle.keySet()) {
                Object obj = bundle.get(str2);
                if (obj instanceof byte[]) {
                    hashMap2.put(str2, bundle.getByteArray(str2));
                } else if (obj instanceof Byte) {
                    hashMap2.put(str2, Byte.valueOf(bundle.getByte(str2)));
                } else if (obj instanceof char[]) {
                    hashMap2.put(str2, bundle.getCharArray(str2));
                } else if (obj instanceof Character) {
                    hashMap2.put(str2, Character.valueOf(bundle.getChar(str2)));
                } else if (obj instanceof CharSequence[]) {
                    hashMap2.put(str2, bundle.getCharSequenceArray(str2));
                } else if (obj instanceof CharSequence) {
                    hashMap2.put(str2, bundle.getCharSequence(str2));
                } else if (obj instanceof float[]) {
                    hashMap2.put(str2, bundle.getFloatArray(str2));
                } else if (obj instanceof Float) {
                    hashMap2.put(str2, Float.valueOf(bundle.getFloat(str2)));
                }
            }
            hashMap.put(JsonStorageKeyNames.DATA_KEY, hashMap2);
        }
        this.f35949a.c("TextInputClient.performPrivateCommand", Arrays.asList(new Serializable[]{Integer.valueOf(i10), hashMap}));
    }

    public void k(int i10) {
        xb.b.f("TextInputChannel", "Sending 'previous' message.");
        this.f35949a.c("TextInputClient.performAction", Arrays.asList(new Serializable[]{Integer.valueOf(i10), "TextInputAction.previous"}));
    }

    public void l() {
        this.f35949a.c("TextInputClient.requestExistingInputState", (Object) null);
    }

    public void m(int i10) {
        xb.b.f("TextInputChannel", "Sending 'search' message.");
        this.f35949a.c("TextInputClient.performAction", Arrays.asList(new Serializable[]{Integer.valueOf(i10), "TextInputAction.search"}));
    }

    public void n(int i10) {
        xb.b.f("TextInputChannel", "Sending 'send' message.");
        this.f35949a.c("TextInputClient.performAction", Arrays.asList(new Serializable[]{Integer.valueOf(i10), "TextInputAction.send"}));
    }

    public void o(f fVar) {
        this.f35950b = fVar;
    }

    public void p(int i10) {
        xb.b.f("TextInputChannel", "Sending 'unspecified' message.");
        this.f35949a.c("TextInputClient.performAction", Arrays.asList(new Serializable[]{Integer.valueOf(i10), "TextInputAction.unspecified"}));
    }

    public void q(int i10, String str, int i11, int i12, int i13, int i14) {
        xb.b.f("TextInputChannel", "Sending message to update editing state: \nText: " + str + "\nSelection start: " + i11 + "\nSelection end: " + i12 + "\nComposing start: " + i13 + "\nComposing end: " + i14);
        HashMap<Object, Object> d10 = d(str, i11, i12, i13, i14);
        this.f35949a.c("TextInputClient.updateEditingState", Arrays.asList(new Serializable[]{Integer.valueOf(i10), d10}));
    }

    public void r(int i10, ArrayList<io.flutter.plugin.editing.e> arrayList) {
        xb.b.f("TextInputChannel", "Sending message to update editing state with deltas: \nNumber of deltas: " + arrayList.size());
        HashMap<Object, Object> c10 = c(arrayList);
        this.f35949a.c("TextInputClient.updateEditingStateWithDeltas", Arrays.asList(new Serializable[]{Integer.valueOf(i10), c10}));
    }

    public void s(int i10, HashMap<String, e> hashMap) {
        xb.b.f("TextInputChannel", "Sending message to update editing state for " + String.valueOf(hashMap.size()) + " field(s).");
        HashMap hashMap2 = new HashMap();
        for (Map.Entry next : hashMap.entrySet()) {
            e eVar = (e) next.getValue();
            hashMap2.put((String) next.getKey(), d(eVar.f35978a, eVar.f35979b, eVar.f35980c, -1, -1));
        }
        this.f35949a.c("TextInputClient.updateEditingStateWithTag", Arrays.asList(new Serializable[]{Integer.valueOf(i10), hashMap2}));
    }
}
