package com.encore.java; // javac -d . Test.java를 실행하게 되면 클래스 파일을 com.encore.java 디렉토리를 자동으로 생성하면서 만든다.
class Test {
 public static void main(String[] args) {
   System.out.println("Hello");
   System.out.println("Good");
   for (int i=0; i<args.length; i++){
     System.out.println(args[i]);
   }
  }
}