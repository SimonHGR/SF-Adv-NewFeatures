package sealedtypes;

// In a NON-MODULAR program the sealed type and all its
// children must be in the same package
// in a MODULAR system they must all be in the same module.

// final class prevents ANY subtypes
// could make Document package access
// with package access constructor
// then subtypes have to be in the same package
// which might be bad for their usability
///*final */class Document {}
//
//class PDF extends Document {}
//class Email extends Document {}

// simply saying sealed class X {} is a SPECIAL CASE
// only applicable when the parent type and the children
// are all in a SINGLE source file
// in any other case, we MUST enumerate the valid child types
sealed class Document permits PDF, Email, FreeForm {}
// interfaces can absolutely participate in sealed type hierarchies
// additional rules (also for abstracts) as makes sense to non-instantiable stuff
// Leaving out the "permits" clause is a special case, for
// a single source file, and feels like early development
//sealed interface Document {}

sealed class PDF extends /*implements*/ Document {}
final class PDF_V1 extends PDF {}
final class PDF_V2 extends PDF {}

final class Email extends Document {}

non-sealed class FreeForm extends Document {}
class PlainText extends FreeForm{}

public class UseSealedTypes {
  public static void main(String[] args) {
    var var = "Var";
  }
}
