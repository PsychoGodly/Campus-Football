package d7;

import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class q {
    public static Status a(String str) {
        if (TextUtils.isEmpty(str)) {
            return new Status(17499);
        }
        String[] split = str.split(":", 2);
        split[0] = split[0].trim();
        if (split.length > 1 && split[1] != null) {
            split[1] = split[1].trim();
        }
        List asList = Arrays.asList(split);
        if (asList.size() > 1) {
            return b((String) asList.get(0), (String) asList.get(1));
        }
        return b((String) asList.get(0), (String) null);
    }

    private static Status b(String str, String str2) {
        int i10;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -2130504259:
                if (str.equals("USER_CANCELLED")) {
                    c10 = 0;
                    break;
                }
                break;
            case -2065866930:
                if (str.equals("INVALID_RECIPIENT_EMAIL")) {
                    c10 = 1;
                    break;
                }
                break;
            case -2014808264:
                if (str.equals("WEB_CONTEXT_ALREADY_PRESENTED")) {
                    c10 = 2;
                    break;
                }
                break;
            case -2005236790:
                if (str.equals("INTERNAL_SUCCESS_SIGN_OUT")) {
                    c10 = 3;
                    break;
                }
                break;
            case -2001169389:
                if (str.equals("INVALID_IDP_RESPONSE")) {
                    c10 = 4;
                    break;
                }
                break;
            case -1944433728:
                if (str.equals("DYNAMIC_LINK_NOT_ACTIVATED")) {
                    c10 = 5;
                    break;
                }
                break;
            case -1800638118:
                if (str.equals("QUOTA_EXCEEDED")) {
                    c10 = 6;
                    break;
                }
                break;
            case -1774756919:
                if (str.equals("WEB_NETWORK_REQUEST_FAILED")) {
                    c10 = 7;
                    break;
                }
                break;
            case -1699246888:
                if (str.equals("INVALID_RECAPTCHA_VERSION")) {
                    c10 = 8;
                    break;
                }
                break;
            case -1603818979:
                if (str.equals("RECAPTCHA_NOT_ENABLED")) {
                    c10 = 9;
                    break;
                }
                break;
            case -1587614300:
                if (str.equals("EXPIRED_OOB_CODE")) {
                    c10 = 10;
                    break;
                }
                break;
            case -1584641425:
                if (str.equals("UNAUTHORIZED_DOMAIN")) {
                    c10 = 11;
                    break;
                }
                break;
            case -1583894766:
                if (str.equals("INVALID_OOB_CODE")) {
                    c10 = 12;
                    break;
                }
                break;
            case -1458751677:
                if (str.equals("MISSING_EMAIL")) {
                    c10 = 13;
                    break;
                }
                break;
            case -1421414571:
                if (str.equals("INVALID_CODE")) {
                    c10 = 14;
                    break;
                }
                break;
            case -1345867105:
                if (str.equals("TOKEN_EXPIRED")) {
                    c10 = 15;
                    break;
                }
                break;
            case -1340100504:
                if (str.equals("INVALID_TENANT_ID")) {
                    c10 = 16;
                    break;
                }
                break;
            case -1242922234:
                if (str.equals("ALTERNATE_CLIENT_IDENTIFIER_REQUIRED")) {
                    c10 = 17;
                    break;
                }
                break;
            case -1232010689:
                if (str.equals("INVALID_SESSION_INFO")) {
                    c10 = 18;
                    break;
                }
                break;
            case -1202691903:
                if (str.equals("SECOND_FACTOR_EXISTS")) {
                    c10 = 19;
                    break;
                }
                break;
            case -1112393964:
                if (str.equals("INVALID_EMAIL")) {
                    c10 = 20;
                    break;
                }
                break;
            case -1063710844:
                if (str.equals("ADMIN_ONLY_OPERATION")) {
                    c10 = 21;
                    break;
                }
                break;
            case -974503964:
                if (str.equals("MISSING_OR_INVALID_NONCE")) {
                    c10 = 22;
                    break;
                }
                break;
            case -863830559:
                if (str.equals("INVALID_CERT_HASH")) {
                    c10 = 23;
                    break;
                }
                break;
            case -828507413:
                if (str.equals("NO_SUCH_PROVIDER")) {
                    c10 = 24;
                    break;
                }
                break;
            case -749743758:
                if (str.equals("MFA_ENROLLMENT_NOT_FOUND")) {
                    c10 = 25;
                    break;
                }
                break;
            case -736207500:
                if (str.equals("MISSING_PASSWORD")) {
                    c10 = 26;
                    break;
                }
                break;
            case -646022241:
                if (str.equals("CREDENTIAL_TOO_OLD_LOGIN_AGAIN")) {
                    c10 = 27;
                    break;
                }
                break;
            case -595928767:
                if (str.equals("TIMEOUT")) {
                    c10 = 28;
                    break;
                }
                break;
            case -505579581:
                if (str.equals("INVALID_REQ_TYPE")) {
                    c10 = 29;
                    break;
                }
                break;
            case -406804866:
                if (str.equals("INVALID_LOGIN_CREDENTIALS")) {
                    c10 = 30;
                    break;
                }
                break;
            case -380728810:
                if (str.equals("INVALID_RECAPTCHA_ACTION")) {
                    c10 = 31;
                    break;
                }
                break;
            case -333672188:
                if (str.equals("OPERATION_NOT_ALLOWED")) {
                    c10 = ' ';
                    break;
                }
                break;
            case -294485423:
                if (str.equals("WEB_INTERNAL_ERROR")) {
                    c10 = '!';
                    break;
                }
                break;
            case -217128228:
                if (str.equals("SECOND_FACTOR_LIMIT_EXCEEDED")) {
                    c10 = '\"';
                    break;
                }
                break;
            case -122667194:
                if (str.equals("MISSING_MFA_ENROLLMENT_ID")) {
                    c10 = '#';
                    break;
                }
                break;
            case -75433118:
                if (str.equals("USER_NOT_FOUND")) {
                    c10 = '$';
                    break;
                }
                break;
            case -52772551:
                if (str.equals("CAPTCHA_CHECK_FAILED")) {
                    c10 = '%';
                    break;
                }
                break;
            case -40686718:
                if (str.equals("WEAK_PASSWORD")) {
                    c10 = '&';
                    break;
                }
                break;
            case 15352275:
                if (str.equals("EMAIL_NOT_FOUND")) {
                    c10 = '\'';
                    break;
                }
                break;
            case 210308040:
                if (str.equals("UNSUPPORTED_FIRST_FACTOR")) {
                    c10 = '(';
                    break;
                }
                break;
            case 269327773:
                if (str.equals("INVALID_SENDER")) {
                    c10 = ')';
                    break;
                }
                break;
            case 278802867:
                if (str.equals("MISSING_PHONE_NUMBER")) {
                    c10 = '*';
                    break;
                }
                break;
            case 408411681:
                if (str.equals("INVALID_DYNAMIC_LINK_DOMAIN")) {
                    c10 = '+';
                    break;
                }
                break;
            case 423563023:
                if (str.equals("MISSING_MFA_PENDING_CREDENTIAL")) {
                    c10 = ',';
                    break;
                }
                break;
            case 429251986:
                if (str.equals("UNSUPPORTED_PASSTHROUGH_OPERATION")) {
                    c10 = '-';
                    break;
                }
                break;
            case 483847807:
                if (str.equals("EMAIL_EXISTS")) {
                    c10 = '.';
                    break;
                }
                break;
            case 491979549:
                if (str.equals("INVALID_ID_TOKEN")) {
                    c10 = '/';
                    break;
                }
                break;
            case 492072102:
                if (str.equals("WEB_STORAGE_UNSUPPORTED")) {
                    c10 = '0';
                    break;
                }
                break;
            case 492515765:
                if (str.equals("MISSING_CLIENT_TYPE")) {
                    c10 = '1';
                    break;
                }
                break;
            case 530628231:
                if (str.equals("MISSING_RECAPTCHA_VERSION")) {
                    c10 = '2';
                    break;
                }
                break;
            case 542728406:
                if (str.equals("PASSWORD_LOGIN_DISABLED")) {
                    c10 = '3';
                    break;
                }
                break;
            case 582457886:
                if (str.equals("UNVERIFIED_EMAIL")) {
                    c10 = '4';
                    break;
                }
                break;
            case 605031096:
                if (str.equals("REJECTED_CREDENTIAL")) {
                    c10 = '5';
                    break;
                }
                break;
            case 745638750:
                if (str.equals("INVALID_MFA_PENDING_CREDENTIAL")) {
                    c10 = '6';
                    break;
                }
                break;
            case 786916712:
                if (str.equals("INVALID_VERIFICATION_PROOF")) {
                    c10 = '7';
                    break;
                }
                break;
            case 799258561:
                if (str.equals("INVALID_PROVIDER_ID")) {
                    c10 = '8';
                    break;
                }
                break;
            case 819646646:
                if (str.equals("CREDENTIAL_MISMATCH")) {
                    c10 = '9';
                    break;
                }
                break;
            case 844240628:
                if (str.equals("WEB_CONTEXT_CANCELED")) {
                    c10 = ':';
                    break;
                }
                break;
            case 886186878:
                if (str.equals("REQUIRES_SECOND_FACTOR_AUTH")) {
                    c10 = ';';
                    break;
                }
                break;
            case 895302372:
                if (str.equals("MISSING_CLIENT_IDENTIFIER")) {
                    c10 = '<';
                    break;
                }
                break;
            case 922685102:
                if (str.equals("INVALID_MESSAGE_PAYLOAD")) {
                    c10 = '=';
                    break;
                }
                break;
            case 989000548:
                if (str.equals("RESET_PASSWORD_EXCEED_LIMIT")) {
                    c10 = '>';
                    break;
                }
                break;
            case 1034932393:
                if (str.equals("INVALID_PENDING_TOKEN")) {
                    c10 = '?';
                    break;
                }
                break;
            case 1072360691:
                if (str.equals("INVALID_CUSTOM_TOKEN")) {
                    c10 = '@';
                    break;
                }
                break;
            case 1094975491:
                if (str.equals("INVALID_PASSWORD")) {
                    c10 = 'A';
                    break;
                }
                break;
            case 1107081238:
                if (str.equals("<<Network Error>>")) {
                    c10 = 'B';
                    break;
                }
                break;
            case 1113992697:
                if (str.equals("INVALID_RECAPTCHA_TOKEN")) {
                    c10 = 'C';
                    break;
                }
                break;
            case 1141576252:
                if (str.equals("SESSION_EXPIRED")) {
                    c10 = 'D';
                    break;
                }
                break;
            case 1199811910:
                if (str.equals("MISSING_CODE")) {
                    c10 = 'E';
                    break;
                }
                break;
            case 1226505451:
                if (str.equals("FEDERATED_USER_ID_ALREADY_LINKED")) {
                    c10 = 'F';
                    break;
                }
                break;
            case 1308491624:
                if (str.equals("MISSING_RECAPTCHA_TOKEN")) {
                    c10 = 'G';
                    break;
                }
                break;
            case 1388786705:
                if (str.equals("INVALID_IDENTIFIER")) {
                    c10 = 'H';
                    break;
                }
                break;
            case 1433767024:
                if (str.equals("USER_DISABLED")) {
                    c10 = 'I';
                    break;
                }
                break;
            case 1442968770:
                if (str.equals("INVALID_PHONE_NUMBER")) {
                    c10 = 'J';
                    break;
                }
                break;
            case 1494923453:
                if (str.equals("INVALID_APP_CREDENTIAL")) {
                    c10 = 'K';
                    break;
                }
                break;
            case 1497901284:
                if (str.equals("TOO_MANY_ATTEMPTS_TRY_LATER")) {
                    c10 = 'L';
                    break;
                }
                break;
            case 1803454477:
                if (str.equals("MISSING_CONTINUE_URI")) {
                    c10 = 'M';
                    break;
                }
                break;
            case 1898790704:
                if (str.equals("MISSING_SESSION_INFO")) {
                    c10 = 'N';
                    break;
                }
                break;
            case 2063209097:
                if (str.equals("EMAIL_CHANGE_NEEDS_VERIFICATION")) {
                    c10 = 'O';
                    break;
                }
                break;
            case 2082564316:
                if (str.equals("UNSUPPORTED_TENANT_OPERATION")) {
                    c10 = 'P';
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                i10 = 18001;
                break;
            case 1:
                i10 = 17033;
                break;
            case 2:
                i10 = 17057;
                break;
            case 3:
                i10 = 17091;
                break;
            case 4:
            case 30:
            case '?':
                i10 = 17004;
                break;
            case 5:
                i10 = 17068;
                break;
            case 6:
                i10 = 17052;
                break;
            case 7:
                i10 = 17061;
                break;
            case 8:
                i10 = 17206;
                break;
            case 9:
                i10 = 17200;
                break;
            case 10:
                i10 = 17029;
                break;
            case 11:
                i10 = 17038;
                break;
            case 12:
                i10 = 17030;
                break;
            case 13:
                i10 = 17034;
                break;
            case 14:
                i10 = 17044;
                break;
            case 15:
                i10 = 17021;
                break;
            case 16:
                i10 = 17079;
                break;
            case 17:
                i10 = 18002;
                break;
            case 18:
                i10 = 17046;
                break;
            case 19:
                i10 = 17087;
                break;
            case 20:
            case 'H':
                i10 = 17008;
                break;
            case 21:
                i10 = 17085;
                break;
            case 22:
                i10 = 17094;
                break;
            case 23:
                i10 = 17064;
                break;
            case 24:
                i10 = 17016;
                break;
            case 25:
                i10 = 17084;
                break;
            case 26:
                i10 = 17035;
                break;
            case 27:
                i10 = 17014;
                break;
            case 28:
            case 'B':
                i10 = 17020;
                break;
            case 29:
                i10 = 17207;
                break;
            case 31:
                i10 = 17203;
                break;
            case ' ':
            case '3':
                i10 = 17006;
                break;
            case '!':
                i10 = 17062;
                break;
            case '\"':
                i10 = 17088;
                break;
            case '#':
                i10 = 17082;
                break;
            case '$':
            case '\'':
                i10 = 17011;
                break;
            case '%':
                i10 = 17056;
                break;
            case '&':
                i10 = 17026;
                break;
            case '(':
                i10 = 17089;
                break;
            case ')':
                i10 = 17032;
                break;
            case '*':
                i10 = 17041;
                break;
            case '+':
                i10 = 17074;
                break;
            case ',':
                i10 = 17081;
                break;
            case '-':
                i10 = 17095;
                break;
            case '.':
                i10 = 17007;
                break;
            case '/':
                i10 = 17017;
                break;
            case '0':
                i10 = 17065;
                break;
            case '1':
                i10 = 17204;
                break;
            case '2':
                i10 = 17205;
                break;
            case '4':
                i10 = 17086;
                break;
            case '5':
                i10 = 17075;
                break;
            case '6':
                i10 = 17083;
                break;
            case '7':
                i10 = 17049;
                break;
            case '8':
                i10 = 17071;
                break;
            case '9':
                i10 = 17002;
                break;
            case ':':
                i10 = 17058;
                break;
            case ';':
                i10 = 17078;
                break;
            case '<':
                i10 = 17093;
                break;
            case '=':
                i10 = 17031;
                break;
            case '>':
            case 'L':
                i10 = 17010;
                break;
            case '@':
                i10 = 17000;
                break;
            case 'A':
                i10 = 17009;
                break;
            case 'C':
                i10 = 17202;
                break;
            case 'D':
                i10 = 17051;
                break;
            case 'E':
                i10 = 17043;
                break;
            case 'F':
                i10 = 17025;
                break;
            case 'G':
                i10 = 17201;
                break;
            case 'I':
                i10 = 17005;
                break;
            case 'J':
                i10 = 17042;
                break;
            case 'K':
                i10 = 17028;
                break;
            case 'M':
                i10 = 17040;
                break;
            case 'N':
                i10 = 17045;
                break;
            case 'O':
                i10 = 17090;
                break;
            case 'P':
                i10 = 17073;
                break;
            default:
                i10 = 17499;
                break;
        }
        if (i10 != 17499) {
            return new Status(i10, str2);
        }
        if (str2 == null) {
            return new Status(i10, str);
        }
        return new Status(i10, str + ":" + str2);
    }
}
