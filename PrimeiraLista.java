/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.primeiralista;

import java.util.Scanner;

public class PrimeiraLista {

    public static void main(String[] args) {
     Ex12 ();
    }
    
    public static void Ex1() {
    Scanner input = new Scanner(System.in);
    
    int anoAtual, anoFuturo, idadeAtual, idadeFuturo, anoDeNascimento;

    System.out.println("Digite o ano de nascimento ");
    anoDeNascimento = input.nextInt();

    System.out.println(" Digite o ano atual");
    anoAtual = input.nextInt();

    System.out.println("Digite o ano que deseja saber sua idade no futuro:");
    anoFuturo = input.nextInt();

    idadeAtual = anoAtual - anoDeNascimento;
    idadeFuturo = anoFuturo - anoDeNascimento;
    System.out.println("");
    System.out.println("Sua idade atual é: " + idadeAtual);
    System.out.println("Sua idade no futuro será:" + idadeFuturo);

    input.close();
  }
    
   
    public static void Ex2() {

    int numero;
    Scanner input = new Scanner(System.in);
    
    System.out.println("Digite o numero que deseja somar");
    numero = input.nextInt ();

    System.out.println(numero + "X 1 = " + numero * 1);
    System.out.println(numero + "X 2 = " + numero * 2);
    System.out.println(numero + "X 3 = " + numero * 3);
    System.out.println(numero + "X 4 = " + numero * 4);
    System.out.println(numero + "X 5 = " + numero * 5);
    System.out.println(numero + "X 6 = " + numero * 6);
    System.out.println(numero + "X 7 = " + numero * 7);
    System.out.println(numero + "X 8 = " + numero * 8);
    System.out.println(numero + "X 9 = " + numero * 9);
    System.out.println(numero + "X 10 = " + numero * 10);
    input.close();
  }
    
    public static void Ex3() {
    Scanner input = new Scanner(System.in);
    
    int cotacaoDolar, valorDolar, valorEmReais;
    System.out.println("Digite a cotação do dólar em reais: ");
    cotacaoDolar = input.nextInt();
    
    System.out.println("Digite o valor em dólares: ");
    valorDolar = input.nextInt();
    valorEmReais = valorDolar * cotacaoDolar;
    
    System.out.println("O valor em reais é: R$" + valorEmReais);
    input.close();
  }
    
    public static void Ex4() {
    Scanner le = new Scanner(System.in);
    
    int nota1, nota2, nota3, media;
    System.out.println("Digite 3 notas");
    nota1 = le.nextInt();
    nota2 = le.nextInt();
    nota3 = le.nextInt();
    media = (nota1 + nota2 + nota3) / 3;
    System.out.println("A media é: " + media);
    le.close();

  }
    public static void Ex5 (){
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Insira o salario atual: ");
    double  salárioAtual = scanner.nextDouble();
    double novoSalário = salárioAtual * 1.25;
    System.out.println("O novo salário é: " + novoSalário);
    }
    
    
   public static void Ex6 (){
   Scanner scanner = new Scanner(System.in);
   
   System.out.println("Digite os coeficientes a, b e c da equação de segundo grau: ");
   double a = scanner.nextDouble();
   double b = scanner.nextDouble();
   double c = scanner.nextDouble();

   double delta = b * b - 4 * a * c;

        if (delta < 0) {
            System.out.println("A equação não possui raízes reais.");
        }else if (delta == 0) {
            double raiz = -b / (2 * a);
            System.out.println("A equação possui uma raiz dupla: " + raiz);
        } else {
            double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("A equação possui duas raízes reais: " + raiz1 + " e " + raiz2);
        }
    }
   
   public static void Ex7 (){
   Scanner scanner = new Scanner(System.in);

   System.out.print("Informe a medida da diagonal maior: ");
   int diagonalMaior = scanner.nextInt();

   System.out.print("Informe a medida da diagonal menor: ");
   int diagonalMenor = scanner.nextInt();

   double area = (double) diagonalMaior * diagonalMenor / 2;

   System.out.printf("A área (em metros quadrados) do losango é: %.2f%n", area);
   }
   
   
   public static void Ex8 (){
   Scanner scanner = new Scanner(System.in);

   System.out.print("Informe a temperatura em Celsius: ");
   double celsius = scanner.nextDouble();

   double fahrenheit = (celsius * 1.8) + 32;
   System.out.printf("A temperatura em Fahrenheit é: %.2f", fahrenheit);
   }
   
   public static void Ex9 (){
   Scanner scanner = new Scanner(System.in);

   System.out.print("Insira o valor do salário mínimo: ");
   double salárioMínimo = scanner.nextDouble();

   System.out.print("Insira o salário do funcionário: ");
   double salário = scanner.nextDouble();

   double númeroDeSaláriosMínimos = salário / salárioMínimo;
   System.out.printf("O funcionário ganha %f vezes o salário mínimo.", númeroDeSaláriosMínimos);
   }
   
   public static void Ex10(){
   Scanner scanner = new Scanner(System.in);
   
   System.out.print("Digite seu peso: ");
   double peso = scanner.nextDouble();
   
   double pesoComGanho = peso + (peso * 0.15);
   System.out.println("Se você ganhar 15%, seu novo peso será: " + pesoComGanho);
        
   double pesoComPerda = peso - (peso * 0.20);
   System.out.println("Se você perder 20%, seu novo peso será: " + pesoComPerda);       
   }
   
   public static void Ex11(){
   Scanner scanner = new Scanner(System.in);
       
   System.out.print("Insira o valor do primeiro cateto: ");
   double cateto1 = scanner.nextDouble();
        
   System.out.print("Insira o valor do segundo cateto: ");
   double cateto2 = scanner.nextDouble();
        
   double hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
   System.out.println("O valor da hipotenusa (lado maior) é: " + hipotenusa);
   }
   
   public static void Ex12(){
   Scanner scanner = new Scanner(System.in);
   double raio;

   System.out.print("Insira o raio da esfera: ");
   raio = scanner.nextDouble();

   double circunferencia = 2 * Math.PI * raio;
   double area = Math.PI * Math.pow(raio, 2);
   double volume = (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);

   System.out.printf("Circunferencia da esfera: %.2f%n", circunferencia);
   System.out.printf("Área da esfera: %.2f%n", area);
   System.out.printf("Volume da esfera: %.2f%n", volume);
   }
    
}
