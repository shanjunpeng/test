package chapter02;

public class JavaSampleAppend {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int c = a + b;
	}
}
/*
 * D:\Work\github\test\build\classes>javap -verbose chapter02.JavaSampleAppend
Classfile /D:/Work/github/test/build/classes/chapter02/JavaSampleAppend.class
  Last modified 2014-11-2; size 477 bytes
  MD5 checksum fe70f2575c36f39f552828e064828bcb
  Compiled from "JavaSampleAppend.java"
public class chapter02.JavaSampleAppend
  SourceFile: "JavaSampleAppend.java"
  minor version: 0
  major version: 51
  flags: ACC_PUBLIC, ACC_SUPER
Constant pool:
   #1 = Class              #2             //  chapter02/JavaSampleAppend
   #2 = Utf8               chapter02/JavaSampleAppend
   #3 = Class              #4             //  java/lang/Object
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Utf8               Code
   #8 = Methodref          #3.#9          //  java/lang/Object."<init>":()V
   #9 = NameAndType        #5:#6          //  "<init>":()V
  #10 = Utf8               LineNumberTable
  #11 = Utf8               LocalVariableTable
  #12 = Utf8               this
  #13 = Utf8               Lchapter02/JavaSampleAppend;
  #14 = Utf8               main
  #15 = Utf8               ([Ljava/lang/String;)V
  #16 = Utf8               args
  #17 = Utf8               [Ljava/lang/String;
  #18 = Utf8               a
  #19 = Utf8               I
  #20 = Utf8               b
  #21 = Utf8               c
  #22 = Utf8               SourceFile
  #23 = Utf8               JavaSampleAppend.java
{
  public chapter02.JavaSampleAppend();
    flags: ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #8                  // Method java/lang/Object."<init>
":()V
         4: return
      LineNumberTable:
        line 3: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
               0       5     0  this   Lchapter02/JavaSampleAppend;

  public static void main(java.lang.String[]);
    flags: ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=4, args_size=1
         0: iconst_1
         1: istore_1
         2: iconst_2
         3: istore_2
         4: iload_1
         5: iload_2
         6: iadd
         7: istore_3
         8: return
      LineNumberTable:
        line 5: 0
        line 6: 2
        line 7: 4
        line 8: 8
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
               0       9     0  args   [Ljava/lang/String;
               2       7     1     a   I
               4       5     2     b   I
               8       1     3     c   I
}
 */
