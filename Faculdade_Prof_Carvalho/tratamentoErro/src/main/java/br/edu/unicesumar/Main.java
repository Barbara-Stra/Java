package br.edu.unicesumar;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<String> frutas = new ArrayList<String>();


        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite sua idade: ");

        try{
            int valorDigitado = leitor.nextInt();

            if (valorDigitado <= 0) {
                throw new ValorMenorZeroExeption();
            }

            System.out.printf("Sua idade é: %d\n", valorDigitado);

            double resultado = valorDigitado / 0;

            frutas.get(10);

        }catch(InputMismatchException exception){
            System.out.println(exception.toString());

        } catch(ArithmeticException exception){
            System.out.println(exception.toString());

        } catch (ValorMenorZeroExeption e) {
            System.out.println(e.toString());
        }


        System.out.println("Fim do código!");
    }
}