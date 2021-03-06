package midterm;

public class CoreJavaConceptual {
}


    What is programing language?
        A. Programming language is a special language used to built softwares

        What jdk contains or composed of and define each components?
        A. the Java development kit is composed of:
        - Java Runtime Environment (JRE): It combines the Java Virtual Machine (JVM), platform core classes and supporting libraries.
        - An interpreter/loader (java) : program which translates statements of a program into machine code.
        - A compiler (javac)
        - An archiver (jar)
        - A documentation generator (javadoc)
        - Other tools needed in Java development

        What is IDE?
        A. Integrated Development Environment, is a software enable users to write and debug java programs.

        What are the IDEs available in the market to support java?
        A. Eclipse, IntelliJ Idea.

        Explain the entire java life cycle.
        A. Editing the program; Compiling the source code; Executing the byte code.

        what is class?
        A. A class is a blue print of an object.

        What is object?
        A. An object is an instance of class.

        What is the entry point of an application?
        A. Main method.

        Why main is static?
        A. Maim is static because it is called by the JVM before any objects are made.

        Which class is the superclass of all classes?
        The object class, wich is stored in the java.lang

        What is difference between path and classpath variables?
        A.Path refers to system while classpath refers to the develop environment.

        What is the difference between an Interface and Abstract class?
        A.Interface has no defined methods while abstract is a hybrid class that can have abstract methods and define methods.

        Can you make an Object from an Interface and Abstract class ? if not how do you use it ?
        A. No we can not, these two classes used to declare and define methods.

        what is Access Specifier?
        A. Access specifier is keywords in object-oriented languages that set the accessibility of classes, methods, and other members.

        What is OOP ? Define each feature of java OOP.
        A. Object oriented programming - Abstraction, Encapsulation, Inheritance and polymorphism.

        What is Java Package and which package is imported by default?
        A. A package is a namespace that organizes a set of related classes and interfaces. java.lang package is imported by default.

        What is API? Name list of API that you have used so far.
        A. Application Programming Interface, we used java API.

        Does java support multiple inheritance, explain why or why not?
        A. Java does not support the multiple inheritance. instead it supports multi interfaces.

        What is method overloading and when it happens?
        A. Method overloading is a polymorphism aspect that change the logic of the method.

        Explain exceptions in java and how to handle it.
        A. Exception is eventual errors that can operate on java, we handle them by the try/catch method.

        What is static keyword in java? How it has been used in variables and methods ?
        A. The static keyword in java is used for memory management mainly. The static keyword belongs to the class than
instance of the class. ... variable

        What is final and how it has been used variables and methods?
        A. Final is java keyword that makes variables and methods not changeable.

        What is final, finally and finalize?
        A.  - Final is an entity definer
        - Finally is a block to access some block as the closing one.
        - Finalize is a package called by the garbage collector on an object.

        What is a constructor ?
        A. Constructor is a block of code called when an instance of object created.

        Can we have multiple constructors in a class?
        A. Yes.

        If we don't have a constructor declared, what is called during the object creation?
        A. The default constructor.

        What is "this" keyword in java ?
        A. this is a keyword that refers to the reference variable.

        What is "super" keyword in java? How many possible way can you use?
        A. Super is keyword that calls the variables, constructor or methods from the child class to parent class.

        What is JVM stand for ?
        A. Java virtual Machine.

        Is JVM platform independent?
        A. Yes.

        What version of java are you using?
        A. Java 8.

        What is JAR stand for ?
        A. Java Archive.

        What is the difference between JDK and JVM?
        A. JVM is the machine while JDK is the whole java program.

        What is the difference between JVM and JRE?
        A. JRE is the container, JVM is the content.

        What is compile time and run time?
        A. Compile time is the when we write the code and the run time is when we read the code.

        What is heap?
        A. The heap is the runtime data area from which memory for all class instances and arrays is allocated.

        How java manage it's memory?
        A. By collecting garbage once object are not in need anymore.

        What is the difference between String, StringBuffer and StringBuilder?
        A.String once assigned can not be changed. StringBuffer is mutable means one can change the value of the object .

        What is Singleton class?
        A. A class that can be used once.

        What is Serialization and Deserialization?
        A.Serialization is a process of converting an object into a sequence of bytes which can be persisted to a disk or database
        or can be sent through streams. The reverse process of creating object from sequence of bytes is called deserialization.

        when to use transient variable in java?
        A. When the object won't be serialized during serialization.

        Difference between while and do..while loop?
        A.In while loop the condition is checked first, in do while the code executes and then check the condition.

        What is Enum?
        A. Enum is a data type consisting of a set of named values called elements, members, enumeral, or enumerators of the type.

        What is Iterator?
        A. An iterator is an object that enables a programmer to traverse a container, particularly lists.

        Which one will take more memory, an int or Integer?
        A. int = Integer.

        Why is String Immutable in Java?
        A. Because String objects are cached in String pool.

        What is constructor chaining in Java?
        A.Constructors in Java. Constructor chaining is the process of calling one constructor from another constructor with
        respect to current object.

        The difference between Serial and Parallel Garbage Collector?
        A. A serial collector is a default copying collector which uses only one garbage collector thread for the garbage collector
        operation, while a parallel collector uses multiple garbage collection threads for the garbage collection operation.

        What is JIT stands for?
        A. Just I =n Time.

        Explain Java Heap space and Garbage collection?
        A. Garbage collection is the process of freeing space in the heap or the nursery for allocation of new objects.

        Can you guarantee the garbage collection process?
        A. No.

        What is the difference between stack and heap in Java?
        A.Whenever an object is created, it's always stored in the Heap space and stack memory contains the reference to it.
        Stack memory only contains local primitive variables and reference variables to objects in heap space.

        What is reflection in java and why is it useful?
        A. Java Reflection makes it possible to inspect classes, interfaces, fields and methods at runtime, without knowing
        the names of the classes, methods and it is useful because it supports dynamic retrieval of information about classes
        and data structures by name, and allows for their manipulation within an executing Java program.

        what is multithreading in java?
        A.Multithreading in java is a process of executing multiple threads simultaneously. Thread is basically a lightweight
        sub-process, a smallest unit of processing. Multiprocessing and multithreading, both are used to achieve multitasking.

        What is the use of synchronization in Java?
        A. Synchronized keyword in Java is used to provide mutually exclusive access to a shared resource with multiple threads in Java.

        What is Framework?
        A. Framework is a broad software development platforms.

        What are the testing Framework available in java?
        A. Unit, JWalk, Mockito, TestNG, JwebUnit, TagUnit, HTMLUnit, Arquillian.

        Difference between jUnit and testNG?
        A. TestNG is more advance in parameterize testing, dependency testing and suite testing.

        What are the dependencies for this project?
        A.

        what is dependency injection in java?
        A. When dependency injection is used, a Java class can be tested in isolation.

        What is static binding and dynamic binding?
        A. Static binding in Java occurs during compile time while dynamic binding occurs during runtime.
