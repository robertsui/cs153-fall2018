package cmm.types;

public class TypeFactory {
  public static final BaseType INT_TYPE = new PrimitiveType.IntType();
  public static final BaseType LONG_TYPE = new PrimitiveType.LongType();
  public static final BaseType FLOAT_TYPE = new PrimitiveType.FloatType();
  public static final BaseType DOUBLE_TYPE = new PrimitiveType.DoubleType();
  public static final BaseType CHAR_TYPE = new PrimitiveType.CharType();
  public static final BaseType VOID_TYPE = new PrimitiveType.VoidType();

  static BaseType fromString(String typename) {
    switch (typename) {
      case "int":
        return INT_TYPE;
      case "long":
        return LONG_TYPE;
      case "float":
        return FLOAT_TYPE;
      case "double":
        return DOUBLE_TYPE;
      case "char":
        return CHAR_TYPE;
      case "void":
        return VOID_TYPE;
    }
    return null;
  }
}
