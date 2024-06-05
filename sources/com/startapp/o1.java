package com.startapp;

import java.lang.reflect.InvocationTargetException;

/* compiled from: Sta */
public class o1 {
    public static Class<?> a(String str) throws ClassNotFoundException {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1808118735:
                if (str.equals("String")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1325958191:
                if (str.equals("double")) {
                    c10 = 1;
                    break;
                }
                break;
            case -891985903:
                if (str.equals("string")) {
                    c10 = 2;
                    break;
                }
                break;
            case 104431:
                if (str.equals("int")) {
                    c10 = 3;
                    break;
                }
                break;
            case 3039496:
                if (str.equals("byte")) {
                    c10 = 4;
                    break;
                }
                break;
            case 3052374:
                if (str.equals("char")) {
                    c10 = 5;
                    break;
                }
                break;
            case 3327612:
                if (str.equals("long")) {
                    c10 = 6;
                    break;
                }
                break;
            case 64711720:
                if (str.equals("boolean")) {
                    c10 = 7;
                    break;
                }
                break;
            case 97526364:
                if (str.equals("float")) {
                    c10 = 8;
                    break;
                }
                break;
            case 109413500:
                if (str.equals("short")) {
                    c10 = 9;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 2:
                return String.class;
            case 1:
                return Double.TYPE;
            case 3:
                return Integer.TYPE;
            case 4:
                return Byte.TYPE;
            case 5:
                return Character.TYPE;
            case 6:
                return Long.TYPE;
            case 7:
                return Boolean.TYPE;
            case 8:
                return Float.TYPE;
            case 9:
                return Short.TYPE;
            default:
                return Class.forName(str);
        }
    }

    public static Object a(Class cls, Object obj) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        if (cls == Byte.TYPE) {
            if (obj instanceof Number) {
                return Byte.valueOf(((Number) obj).byteValue());
            }
        } else if (cls == Short.TYPE) {
            if (obj instanceof Number) {
                return Short.valueOf(((Number) obj).shortValue());
            }
        } else if (cls == Integer.TYPE) {
            if (obj instanceof Number) {
                return Integer.valueOf(((Number) obj).intValue());
            }
        } else if (cls == Long.TYPE) {
            if (obj instanceof Number) {
                return Long.valueOf(((Number) obj).longValue());
            }
        } else if (cls == Float.TYPE) {
            if (obj instanceof Number) {
                return Float.valueOf(((Number) obj).floatValue());
            }
        } else if (cls == Double.TYPE) {
            if (obj instanceof Number) {
                return Double.valueOf(((Number) obj).doubleValue());
            }
        } else if (cls == String.class) {
            if (obj != null) {
                return obj.toString();
            }
        } else if (cls == Boolean.TYPE && (obj instanceof Boolean)) {
            return obj;
        }
        if (obj == null) {
            return null;
        }
        if (cls.isAssignableFrom(obj.getClass())) {
            return cls.cast(obj);
        }
        return cls.getConstructor(new Class[]{obj.getClass()}).newInstance(new Object[]{obj});
    }
}
