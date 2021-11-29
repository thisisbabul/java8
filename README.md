# Java 8 new features
1. Lambda expression
2. Functional interface
3. Default methods and static methods
4. Predefine functional interface (Predicate, Function, Consumer, Supplier etc.)
5. Double colon operator (::). Method reference, Constructor reference
6. Streams
7. Date and Time API
8. Optional class
9. Nashron javascript engine

**Lambda expression:** It is an anonymous (Nameless, without return type, without modifiers) function.

    Note: Without curly braces we can't use return keyword. Within curly braces if we return some value, compulsory we should use return statement.
    n -> return n * n; //invalid
    n -> {return n * n;}; //valid
    n -> {return n * n}; //invalid
    n -> {n*n;}; //invalid
    n -> n * n; //valid

**Functional interface:** A functional interface is an interface that contains only a single abstract (unimplemented) method.
    
    Example: Write the points whatever there on the screen in your notes pages with pen.
    Runnable => run()
    Comparable => compareTo()