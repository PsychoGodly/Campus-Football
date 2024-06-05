package v8;

import java.util.List;

/* compiled from: DecodeHintType */
public enum e {
    OTHER(Object.class),
    PURE_BARCODE(Void.class),
    POSSIBLE_FORMATS(List.class),
    TRY_HARDER(Void.class),
    CHARACTER_SET(String.class),
    ALLOWED_LENGTHS(r0),
    ASSUME_CODE_39_CHECK_DIGIT(Void.class),
    ASSUME_GS1(Void.class),
    RETURN_CODABAR_START_END(Void.class),
    NEED_RESULT_POINT_CALLBACK(q.class),
    ALLOWED_EAN_EXTENSIONS(r0);
    

    /* renamed from: a  reason: collision with root package name */
    private final Class<?> f30756a;

    private e(Class<?> cls) {
        this.f30756a = cls;
    }
}
