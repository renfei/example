# AnonymousClassExample

```java
package net.renfei;

import java.util.ArrayList;
import java.util.List;

/**
 * @author renfei
 */
public class AnonymousClassExample {
    public static void main(String[] args) {
        List<String> arrayListAnonymous = new ArrayList<String>(){};
        List<String> arrayList = new ArrayList<>();
        System.out.println(arrayListAnonymous.getClass());
        System.out.println(arrayList.getClass());
    }
}
```
## Class Byte Code

```java
// class version 52.0 (52)
// access flags 0x21
public class net/renfei/AnonymousClassExample {

  // compiled from: AnonymousClassExample.java
  // access flags 0x8
  static INNERCLASS net/renfei/AnonymousClassExample$1 null null

  // access flags 0x1
  public <init>()V
   L0
    LINENUMBER 9 L0
    ALOAD 0
    INVOKESPECIAL java/lang/Object.<init> ()V
    RETURN
   L1
    LOCALVARIABLE this Lnet/renfei/AnonymousClassExample; L0 L1 0
    MAXSTACK = 1
    MAXLOCALS = 1

  // access flags 0x9
  public static main([Ljava/lang/String;)V
    // parameter  args
   L0
    LINENUMBER 11 L0
    NEW net/renfei/AnonymousClassExample$1
    DUP
    INVOKESPECIAL net/renfei/AnonymousClassExample$1.<init> ()V
    ASTORE 1
   L1
    LINENUMBER 12 L1
    NEW java/util/ArrayList
    DUP
    INVOKESPECIAL java/util/ArrayList.<init> ()V
    ASTORE 2
   L2
    LINENUMBER 13 L2
    GETSTATIC java/lang/System.out : Ljava/io/PrintStream;
    ALOAD 1
    INVOKEVIRTUAL java/lang/Object.getClass ()Ljava/lang/Class;
    INVOKEVIRTUAL java/io/PrintStream.println (Ljava/lang/Object;)V
   L3
    LINENUMBER 14 L3
    GETSTATIC java/lang/System.out : Ljava/io/PrintStream;
    ALOAD 2
    INVOKEVIRTUAL java/lang/Object.getClass ()Ljava/lang/Class;
    INVOKEVIRTUAL java/io/PrintStream.println (Ljava/lang/Object;)V
   L4
    LINENUMBER 15 L4
    RETURN
   L5
    LOCALVARIABLE args [Ljava/lang/String; L0 L5 0
    LOCALVARIABLE arrayListAnonymous Ljava/util/List; L1 L5 1
    // signature Ljava/util/List<Ljava/lang/String;>;
    // declaration: arrayListAnonymous extends java.util.List<java.lang.String>
    LOCALVARIABLE arrayList Ljava/util/List; L2 L5 2
    // signature Ljava/util/List<Ljava/lang/String;>;
    // declaration: arrayList extends java.util.List<java.lang.String>
    MAXSTACK = 2
    MAXLOCALS = 3
}
```
