fun useA() {
    var b: A<B> = A(B())
    var c: A<C> = A(C())
    c = b
}