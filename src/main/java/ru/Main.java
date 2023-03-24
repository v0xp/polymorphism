package ru;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player player = new Player();
        // Как настоящие программисты мы имеем в виду, что исчисление начинается с 0
        while (true) {
            System.out.format("У игрока %d слотов с оружием,"
                            + " введите номер, чтобы выстрелить,"
                            + " -1 чтобы выйти%n",
                    player.getSlotsCount()

            );
            player.print();

            int slot;

            // главный цикл игры:
            // запрашивать номер с клавиатуры
            slot = scanner.nextInt();
            if (slot != -1) {
                player.shotWithWeapon(slot);
                continue;
            }
            System.out.println("Game over!");
            break;

        }
    }
}