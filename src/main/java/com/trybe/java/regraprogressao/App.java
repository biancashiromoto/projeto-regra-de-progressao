package com.trybe.java.regraprogressao;

import java.util.Scanner;

/**
 * App.
 */
public class App {

  /**
   * Metodo main.
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite a quantidade de atividades para cadastrar: ");
    int activities = scanner.nextInt();
    scanner.nextLine();

    for (int i = 1; i <= activities; i += 1) {
      System.out.printf("Digite o nome da atividade %s: ", i);
      String name = scanner.nextLine();
      System.out.printf("Digite o peso da atividade %s: ", i);
      int weight = scanner.nextInt();
      scanner.nextLine();
      System.out.printf("Digite a nota obtida para %s: ", name);
      int grade = scanner.nextInt();
      scanner.nextLine();
    }
  }
}
