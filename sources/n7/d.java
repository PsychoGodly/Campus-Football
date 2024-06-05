package n7;

/* compiled from: Protobuf */
public @interface d {

    /* compiled from: Protobuf */
    public enum a {
        DEFAULT,
        SIGNED,
        FIXED
    }

    a intEncoding() default a.DEFAULT;

    int tag();
}
