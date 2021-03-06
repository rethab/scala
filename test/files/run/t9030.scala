object Test extends App {

  // For these methods, the compiler emits calls to BoxesRuntime.equalsNumNum/equalsNumChar/equalsNumObject directly

  def numNum(a: java.lang.Number, b: java.lang.Number) = assert(a == b)
  def numChar(a: java.lang.Number, b: java.lang.Character) = assert(a == b)
  def numObject(a: java.lang.Number, b: java.lang.Object) = assert(a == b)

  // The compiler doesn't use equalsCharObject directly, but still adding an example for completeness

  def charObject(a: java.lang.Character, b: java.lang.Object) = assert(a == b)

  numNum(Integer.valueOf(1), Integer.valueOf(1))
  numChar(Integer.valueOf(97), Character.valueOf('a'))
  numObject(Integer.valueOf(1), Integer.valueOf(1))
  numObject(Integer.valueOf(97), Character.valueOf('a'))

  charObject(Character.valueOf('a'), Integer.valueOf(97))
}
