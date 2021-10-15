package classstructureconstructors;

import java.util.Scanner;

public class StoreMain {
    public static void main(String[] args) {
        Store firstStore = new Store("Palacsinta");
        Scanner scann = new Scanner(System.in);
        System.out.println("Adja meg a palacsinta behozatali mennyiséget: ");
        firstStore.store(scann.nextInt());
        System.out.println("Adja meg a palacsinta kiviteli mennyiséget: ");
        firstStore.dispatch(scann.nextInt());

        Store secondStore = new Store("Paprika");
        System.out.println("Adja meg a paprika behozatali mennyiséget: ");
        secondStore.store(scann.nextInt());
        System.out.println("Adja meg a paprika kiviteli mennyiséget: ");
        secondStore.dispatch(scann.nextInt());

        System.out.println("A palacsinta raktár készlete: " + firstStore.getStock());
        System.out.println("A paprika raktár készlete: " + secondStore.getStock());
    }
}
