package first;

import second.MySubClass;

public sealed class SuperClass permits A, B, MySubClass {
}
