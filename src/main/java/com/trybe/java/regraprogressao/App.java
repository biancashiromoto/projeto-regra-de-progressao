package com.trybe.java.regraprogressao;

import java.util.ArrayList;
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
    int activitiesAmount = scanner.nextInt();
    scanner.nextLine();

    int totalWeights = 0;
    String name;
    double gradesSum = 0;

    for (int i = 1; i <= activitiesAmount; i += 1) {
      System.out.printf("Digite o nome da atividade %s: ", i);
      name = scanner.nextLine();
      System.out.printf("Digite o peso da atividade %s: ", i);
      int weight = scanner.nextInt();
      totalWeights += weight;
      scanner.nextLine();
      System.out.printf("Digite a nota obtida para %s: ", name);
      double grade = scanner.nextDouble();
      gradesSum += weight * grade;
      scanner.nextLine();
    }

    if (totalWeights != 100) {
      System.out.println("A soma dos pesos é diferente de 100!");
    }

    double finalGrade = gradesSum / totalWeights;
    String formattedFinalGrade = String.format("%.1f", finalGrade).replace(',', '.');

    if (finalGrade >= 85) {
      System.out.printf(
          "Parabéns! Você alcançou %s%%! E temos o prazer de informar que você obteve aprovação!",
          formattedFinalGrade);
    } else {
      System.out.printf(
          "Lamentamos informar que, com base na sua pontuação alcançada neste período,"
          + " %s%%, você não atingiu a pontuação mínima necessária para sua aprovação.",
          formattedFinalGrade);
    }
  }
}
