package sameClass;

import java.lang.instrument.Instrumentation;

public class sameClassInheritance {
   // different data type in java

   int a = 4; // capacity of 4 bytes
   double b = 3; // capacity of 8 bytes
   boolean c = true; // value should be true of false
   char d = 'm'; // capacity of 2 bytes

   // declare Instrumentation variable
   private static Instrumentation instrumentation;

   public static void premain(final String args, final Instrumentation inst) {
      instrumentation = inst;
   }

   public static long getObjectSize(Object obj) {
      if (instrumentation == null) {
         throw new IllegalStateException("Instrumentation is not initialized");
      }
      return instrumentation.getObjectSize(obj);
   }

   public static void main(String[] args) {
      System.out.println("Hey This is same class inheritance");

      section s1 = new section();
      s1.helloFromSectionClass();

      sameClassInheritance s2 = new sameClassInheritance();
      double e = s2.a;

      // get the size of data type
      System.out.println("Int : " + (Integer.SIZE / 8));
      System.out.println("Double : " + (Double.SIZE / 8));
      System.out.println("Character : " + (Character.SIZE / 8)); 
      System.out.println(e);

      // System.out.println(getObjectSize(e));

      long sizeA = getObjectSize(s2.a);
      System.out.println(sizeA);
   }
}

class section extends sameClassInheritance {
   void helloFromSectionClass() {
      System.out.println("Hello from section class");
   }
}