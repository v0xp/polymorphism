package ru;

import ru.weapon.*;

public class Player {
    // Указываем тип данных Weapon, который будет храниться в "слотах игрока"
    private Weapon[] weaponSlots;

    public Player() {
        // Снаряжаем нашего игрока
        weaponSlots = new Weapon[]{
                // заполнить слоты оружием
                new Gun(),
                new WaterPistol(),
                new RPG(),
                new AKM()
        };
    }

    public void print() {
        int p = 0;
        for (int i = 0; i < weaponSlots.length; i++) {
            System.out.println(p + " " + weaponSlots[i].getClass().getSimpleName());
            p++;
        }
    }

    public int getSlotsCount() {
        // length - позволяет узнать, сколько всего слотов с оружием у игрока
        return weaponSlots.length;
    }

    public void shotWithWeapon(int slot) {
        if (slot < 0 || slot > weaponSlots.length) {
            System.out.println("Значение не корректно! Введите число в предложенном диапазоне.");
            return;
        }
        // Получаем оружие из выбранного слота
        Weapon weapon = weaponSlots[slot];
        // Огонь!
        weapon.shot();
    }
}
