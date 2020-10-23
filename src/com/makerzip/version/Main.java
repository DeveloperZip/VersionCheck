package com.makerzip.version;

import java.net.URL;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
   public static void main(String[] args)
   {
   try {
      final String myVersion = "1.0";         //������ �����ϴ� ��
      URL url = new URL("http://gbot.version.kro.kr");
      BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
      String version;
      
      while ((version = in.readLine()) != null)
         switch (version) {
         case myVersion:
            System.out.println("���� �ֽŹ����Դϴ�.");
            break;
         default:
            System.out.println("���ο� ������ �˻� �Ǿ����ϴ�.");
            break;
         } 
      } catch (IOException e) {
         System.out.println("������ �˻����� ���߽��ϴ�.");
      }
   }
}