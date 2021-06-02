package pkg.inheritence;

public class A {
	int sa;
}

class B extends A {}
class C extends A {}

interface X {}
interface Y {}
interface Z extends X {}

class D extends B implements Z,Y {
	int sd;
}
class E extends C {}

