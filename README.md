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

**Lambda expression:** It is an anonymous (Nameless, without return type, without modifiers) function. Lambda expression is applicable only for functional interface.

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
    Comparator => compare

**Anonymous inner class:** Java anonymous inner class is an inner class without a name and for which only a single object created. Anonymous is applicable only for if available multiple abstract method in that interface. 
    
    Thread t = new Thread() {
        //Writing a class that extends Thread class
    };

**Default method | Virtual method | Defender method :** Add a new method to the interface without effecting implementation classes.

**Predefine functional interface:**
    
    - Predicate //for conditional check
    - Function
    - Consumer
    - Supplier   

**Unary Operator:** If input and output are same type then we should go for Unary Operator. It's child of Function<T,T>.

**Collection:** Represent a group of objects as a single entity.

**Stream:** Process objects from the collection.

**Comparator:** compare(obj1, obj2)

    > return -ve if obj1 has to come before obj2
    > return +ve if obj1 has to come after obj2
    > return 0 if obj1 & obj2 are equal
