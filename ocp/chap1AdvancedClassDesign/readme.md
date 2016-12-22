# Advanced class design

equals => hashcode
hashcode =!> equals
Hashcode should avoid values that can change

Member inner classes are not allowed to contain static members (only static inner classes can)
instanceof does not compile if A is an interface
Enum are not allowed to have public constructor