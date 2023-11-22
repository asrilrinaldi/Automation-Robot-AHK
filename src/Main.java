import java.awt.*;
import java.awt.event.KeyEvent;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        try {
            combineKey("WINDOWS+R");
            inputKey("chrome.exe");
            keyPress("ENTER");
            Thread.sleep(1000);
            inputKey("https://www.saucedemo.com/");
            keyPress("ENTER");
            Thread.sleep(2000);
            keyPress("TAB");
            inputKey("standard_user");
            keyPress("TAB");
            inputKey("secret_sauce");
            keyPress("ENTER");
            Thread.sleep(2000);
            combineKey("ALT+F4");

            System.out.println("PASSED");


        } catch (Exception e) {
            System.out.println("FAILED");
        }

    }

    public static void inputKey(String data) {
        try {

            String[] arr = data.split("");
            for (Integer i = 0; i < arr.length; i++) {
                //panggil keyPress
                keyPress(arr[i]);
            }
        } catch (Exception e) {
            System.out.println("failed to perform inputKey");
        }
    }

    public static void keyPress(String data) {
        try {
            Robot r = new Robot();

            if (data.equals("a")) {
                r.keyPress(KeyEvent.VK_A);
                r.delay(100);
                r.keyRelease(KeyEvent.VK_A);
            } else if (data.equals("b")) {
                r.keyPress(KeyEvent.VK_B);
                r.delay(100);
                r.keyRelease(KeyEvent.VK_B);
            } else if (data.equals("c")) {
                r.keyPress(KeyEvent.VK_C);
                r.delay(100);
                r.keyRelease(KeyEvent.VK_C);
            } else if (data.equals("d")) {
                r.keyPress(KeyEvent.VK_D);
                r.delay(100);
                r.keyRelease(KeyEvent.VK_D);
            } else if (data.equals("e")) {
                r.keyPress(KeyEvent.VK_E);
                r.delay(100);
                r.keyRelease(KeyEvent.VK_E);
            } else if (data.equals("f")) {
                r.keyPress(KeyEvent.VK_F);
                r.delay(100);
                r.keyRelease(KeyEvent.VK_F);
            } else if (data.equals("g")) {
                r.keyPress(KeyEvent.VK_G);
                r.delay(100);
                r.keyRelease(KeyEvent.VK_G);
            } else if (data.equals("h")) {
                r.keyPress(KeyEvent.VK_H);
                r.delay(100);
                r.keyRelease(KeyEvent.VK_H);
            } else if (data.equals("i")) {
                r.keyPress(KeyEvent.VK_I);
                r.delay(100);
                r.keyRelease(KeyEvent.VK_I);
            } else if (data.equals("j")) {
                r.keyPress(KeyEvent.VK_J);
                r.delay(100);
                r.keyRelease(KeyEvent.VK_J);
            } else if (data.equals("k")) {
                r.keyPress(KeyEvent.VK_K);
                r.delay(100);
                r.keyRelease(KeyEvent.VK_K);
            } else if (data.equals("l")) {
                r.keyPress(KeyEvent.VK_L);
                r.delay(100);
                r.keyRelease(KeyEvent.VK_L);
            } else if (data.equals("m")) {
                r.keyPress(KeyEvent.VK_M);
                r.delay(100);
                r.keyRelease(KeyEvent.VK_M);
            } else if (data.equals("n")) {
                r.keyPress(KeyEvent.VK_N);
                r.delay(100);
                r.keyRelease(KeyEvent.VK_N);
            } else if (data.equals("o")) {
                r.keyPress(KeyEvent.VK_O);
                r.delay(100);
                r.keyRelease(KeyEvent.VK_O);
            } else if (data.equals("p")) {
                r.keyPress(KeyEvent.VK_P);
                r.delay(100);
                r.keyRelease(KeyEvent.VK_P);
            } else if (data.equals("q")) {
                r.keyPress(KeyEvent.VK_Q);
                r.delay(100);
                r.keyRelease(KeyEvent.VK_Q);
            } else if (data.equals("r")) {
                r.keyPress(KeyEvent.VK_R);
                r.delay(100);
                r.keyRelease(KeyEvent.VK_R);
            } else if (data.equals("s")) {
                r.keyPress(KeyEvent.VK_S);
                r.delay(100);
                r.keyRelease(KeyEvent.VK_S);
            } else if (data.equals("t")) {
                r.keyPress(KeyEvent.VK_T);
                r.delay(100);
                r.keyRelease(KeyEvent.VK_T);
            } else if (data.equals("u")) {
                r.keyPress(KeyEvent.VK_U);
                r.delay(100);
                r.keyRelease(KeyEvent.VK_U);
            } else if (data.equals("v")) {
                r.keyPress(KeyEvent.VK_V);
                r.delay(100);
                r.keyRelease(KeyEvent.VK_V);
            } else if (data.equals("w")) {
                r.keyPress(KeyEvent.VK_W);
                r.delay(100);
                r.keyRelease(KeyEvent.VK_W);
            } else if (data.equals("x")) {
                r.keyPress(KeyEvent.VK_X);
                r.delay(100);
                r.keyRelease(KeyEvent.VK_X);
            } else if (data.equals("y")) {
                r.keyPress(KeyEvent.VK_Y);
                r.delay(100);
                r.keyRelease(KeyEvent.VK_Y);
            } else if (data.equals("z")) {
                r.keyPress(KeyEvent.VK_Z);
                r.delay(100);
                r.keyRelease(KeyEvent.VK_Z);
            } else if (data.equals("\\")) {
                r.keyPress(KeyEvent.VK_BACK_SLASH);
                r.delay(100);
                r.keyRelease(KeyEvent.VK_BACK_SLASH);
            } else if (data.equals(":")) {
                r.keyPress(KeyEvent.VK_SHIFT);
                r.keyPress(KeyEvent.VK_SEMICOLON);
                r.delay(100);
                r.keyRelease(KeyEvent.VK_SEMICOLON);
                r.keyRelease(KeyEvent.VK_SHIFT);
            } else if (data.equals("$")) {
                r.keyPress(KeyEvent.VK_SHIFT);
                r.keyPress(KeyEvent.VK_4);
                r.delay(100);
                r.keyRelease(KeyEvent.VK_4);
                r.keyRelease(KeyEvent.VK_SHIFT);
            }
            //ini untuk CAPSLOCK
            else if (data.equals("A")) {
                r.keyPress(KeyEvent.VK_SHIFT);
                r.keyPress(KeyEvent.VK_A);
                r.delay(100);
                r.keyRelease(KeyEvent.VK_SHIFT);
                r.keyRelease(KeyEvent.VK_A);
            } else if (data.equals("B")) {
                r.keyPress(KeyEvent.VK_SHIFT);
                r.keyPress(KeyEvent.VK_B);
                r.delay(100);
                r.keyRelease(KeyEvent.VK_SHIFT);
                r.keyRelease(KeyEvent.VK_B);
            } else if (data.equals("C")) {
                r.keyPress(KeyEvent.VK_SHIFT);
                r.keyPress(KeyEvent.VK_C);
                r.delay(100);
                r.keyRelease(KeyEvent.VK_SHIFT);
                r.keyRelease(KeyEvent.VK_C);
            } else if (data.equals("D")) {
                r.keyPress(KeyEvent.VK_SHIFT);
                r.keyPress(KeyEvent.VK_D);
                r.delay(100);
                r.keyRelease(KeyEvent.VK_SHIFT);
                r.keyRelease(KeyEvent.VK_D);
            } else if (data.equals("E")) {
                r.keyPress(KeyEvent.VK_SHIFT);
                r.keyPress(KeyEvent.VK_E);
                r.delay(100);
                r.keyRelease(KeyEvent.VK_SHIFT);
                r.keyRelease(KeyEvent.VK_E);
            } else if (data.equals("F")) {
                r.keyPress(KeyEvent.VK_SHIFT);
                r.keyPress(KeyEvent.VK_F);
                r.delay(100);
                r.keyRelease(KeyEvent.VK_SHIFT);
                r.keyRelease(KeyEvent.VK_F);
            } else if (data.equals("G")) {
                r.keyPress(KeyEvent.VK_SHIFT);
                r.keyPress(KeyEvent.VK_G);
                r.delay(100);
                r.keyRelease(KeyEvent.VK_SHIFT);
                r.keyRelease(KeyEvent.VK_G);
            } else if (data.equals("H")) {
                r.keyPress(KeyEvent.VK_SHIFT);
                r.keyPress(KeyEvent.VK_H);
                r.delay(100);
                r.keyRelease(KeyEvent.VK_SHIFT);
                r.keyRelease(KeyEvent.VK_H);
            } else if (data.equals("I")) {
                r.keyPress(KeyEvent.VK_SHIFT);
                r.keyPress(KeyEvent.VK_I);
                r.delay(100);
                r.keyRelease(KeyEvent.VK_SHIFT);
                r.keyRelease(KeyEvent.VK_I);
            } else if (data.equals("J")) {
                r.keyPress(KeyEvent.VK_SHIFT);
                r.keyPress(KeyEvent.VK_J);
                r.delay(100);
                r.keyRelease(KeyEvent.VK_SHIFT);
                r.keyRelease(KeyEvent.VK_J);
            } else if (data.equals("K")) {
                r.keyPress(KeyEvent.VK_SHIFT);
                r.keyPress(KeyEvent.VK_K);
                r.delay(100);
                r.keyRelease(KeyEvent.VK_SHIFT);
                r.keyRelease(KeyEvent.VK_K);
            } else if (data.equals("L")) {
                r.keyPress(KeyEvent.VK_SHIFT);
                r.keyPress(KeyEvent.VK_L);
                r.delay(100);
                r.keyRelease(KeyEvent.VK_SHIFT);
                r.keyRelease(KeyEvent.VK_L);
            } else if (data.equals("M")) {
                r.keyPress(KeyEvent.VK_SHIFT);
                r.keyPress(KeyEvent.VK_M);
                r.delay(100);
                r.keyRelease(KeyEvent.VK_SHIFT);
                r.keyRelease(KeyEvent.VK_M);
            } else if (data.equals("N")) {
                r.keyPress(KeyEvent.VK_SHIFT);
                r.keyPress(KeyEvent.VK_N);
                r.delay(100);
                r.keyRelease(KeyEvent.VK_SHIFT);
                r.keyRelease(KeyEvent.VK_N);
            } else if (data.equals("O")) {
                r.keyPress(KeyEvent.VK_SHIFT);
                r.keyPress(KeyEvent.VK_O);
                r.delay(100);
                r.keyRelease(KeyEvent.VK_SHIFT);
                r.keyRelease(KeyEvent.VK_O);
            } else if (data.equals("P")) {
                r.keyPress(KeyEvent.VK_SHIFT);
                r.keyPress(KeyEvent.VK_P);
                r.delay(100);
                r.keyRelease(KeyEvent.VK_SHIFT);
                r.keyRelease(KeyEvent.VK_P);
            } else if (data.equals("Q")) {
                r.keyPress(KeyEvent.VK_SHIFT);
                r.keyPress(KeyEvent.VK_Q);
                r.delay(100);
                r.keyRelease(KeyEvent.VK_SHIFT);
                r.keyRelease(KeyEvent.VK_Q);
            } else if (data.equals("R")) {
                r.keyPress(KeyEvent.VK_SHIFT);
                r.keyPress(KeyEvent.VK_R);
                r.delay(100);
                r.keyRelease(KeyEvent.VK_SHIFT);
                r.keyRelease(KeyEvent.VK_R);
            } else if (data.equals("S")) {
                r.keyPress(KeyEvent.VK_SHIFT);
                r.keyPress(KeyEvent.VK_S);
                r.delay(100);
                r.keyRelease(KeyEvent.VK_SHIFT);
                r.keyRelease(KeyEvent.VK_S);
            } else if (data.equals("T")) {
                r.keyPress(KeyEvent.VK_SHIFT);
                r.keyPress(KeyEvent.VK_T);
                r.delay(100);
                r.keyRelease(KeyEvent.VK_SHIFT);
                r.keyRelease(KeyEvent.VK_T);
            } else if (data.equals("U")) {
                r.keyPress(KeyEvent.VK_SHIFT);
                r.keyPress(KeyEvent.VK_U);
                r.delay(100);
                r.keyRelease(KeyEvent.VK_SHIFT);
                r.keyRelease(KeyEvent.VK_U);
            } else if (data.equals("V")) {
                r.keyPress(KeyEvent.VK_SHIFT);
                r.keyPress(KeyEvent.VK_V);
                r.delay(100);
                r.keyRelease(KeyEvent.VK_SHIFT);
                r.keyRelease(KeyEvent.VK_V);
            } else if (data.equals("W")) {
                r.keyPress(KeyEvent.VK_SHIFT);
                r.keyPress(KeyEvent.VK_W);
                r.delay(100);
                r.keyRelease(KeyEvent.VK_SHIFT);
                r.keyRelease(KeyEvent.VK_W);
            } else if (data.equals("X")) {
                r.keyPress(KeyEvent.VK_SHIFT);
                r.keyPress(KeyEvent.VK_X);
                r.delay(100);
                r.keyRelease(KeyEvent.VK_SHIFT);
                r.keyRelease(KeyEvent.VK_X);
            } else if (data.equals("Y")) {
                r.keyPress(KeyEvent.VK_SHIFT);
                r.keyPress(KeyEvent.VK_Y);
                r.delay(100);
                r.keyRelease(KeyEvent.VK_SHIFT);
                r.keyRelease(KeyEvent.VK_Y);
            } else if (data.equals("Z")) {
                r.keyPress(KeyEvent.VK_SHIFT);
                r.keyPress(KeyEvent.VK_Z);
                r.delay(100);
                r.keyRelease(KeyEvent.VK_SHIFT);
                r.keyRelease(KeyEvent.VK_Z);
            }
            //ini untuk angka
            else if (data.equals("0")) {
                r.keyPress(KeyEvent.VK_0);
                r.delay(100);
                r.keyRelease(KeyEvent.VK_0);
            } else if (data.equals("1")) {
                r.keyPress(KeyEvent.VK_1);
                r.delay(100);
                r.keyRelease(KeyEvent.VK_1);
            } else if (data.equals("2")) {
                r.keyPress(KeyEvent.VK_2);
                r.delay(100);
                r.keyRelease(KeyEvent.VK_2);
            } else if (data.equals("3")) {
                r.keyPress(KeyEvent.VK_3);
                r.delay(100);
                r.keyRelease(KeyEvent.VK_3);
            } else if (data.equals("4")) {
                r.keyPress(KeyEvent.VK_4);
                r.delay(100);
                r.keyRelease(KeyEvent.VK_4);
            } else if (data.equals("5")) {
                r.keyPress(KeyEvent.VK_5);
                r.delay(100);
                r.keyRelease(KeyEvent.VK_5);
            } else if (data.equals("6")) {
                r.keyPress(KeyEvent.VK_6);
                r.delay(100);
                r.keyRelease(KeyEvent.VK_6);
            } else if (data.equals("7")) {
                r.keyPress(KeyEvent.VK_7);
                r.delay(100);
                r.keyRelease(KeyEvent.VK_7);
            } else if (data.equals("8")) {
                r.keyPress(KeyEvent.VK_8);
                r.delay(100);
                r.keyRelease(KeyEvent.VK_8);
            } else if (data.equals("9")) {
                r.keyPress(KeyEvent.VK_9);
                r.delay(100);
                r.keyRelease(KeyEvent.VK_9);
            } else if (data.equals(".")) {
                r.keyPress(KeyEvent.VK_PERIOD);
                r.delay(100);
                r.keyRelease(KeyEvent.VK_PERIOD);
            } else if (data.equals("-")) {
                r.keyPress(KeyEvent.VK_MINUS);
                r.delay(100);
                r.keyRelease(KeyEvent.VK_MINUS);
            } else if (data.equals(" ")) {
                r.keyPress(KeyEvent.VK_SPACE);
                r.delay(100);
                r.keyRelease(KeyEvent.VK_SPACE);
            } else if (data.equals("TAB")) {
                r.keyPress(KeyEvent.VK_TAB);
                r.delay(100);
                r.keyRelease(KeyEvent.VK_TAB);
            } else if (data.equals("_")) {
                r.keyPress(KeyEvent.VK_SHIFT);
                r.keyPress(KeyEvent.VK_MINUS);
                r.delay(100);
                r.keyRelease(KeyEvent.VK_SHIFT);
                r.keyRelease(KeyEvent.VK_MINUS);
            } else if (data.equals("ENTER")) {
                r.keyPress(KeyEvent.VK_ENTER);
                r.delay(100);
                r.keyRelease(KeyEvent.VK_ENTER);
            } else {
                System.out.println("cannot type that character");
            }
        } catch (Exception e) {
            System.out.println("failed to perform pressKey");
        }
    }

    public static void combineKey(String data) {
        try {

            Robot r = new Robot();

            if (data.equals("WINDOWS+R")) {
                r.keyPress(KeyEvent.VK_WINDOWS);
                r.keyPress(KeyEvent.VK_R);
                r.delay(100);
                r.keyRelease(KeyEvent.VK_WINDOWS);
                r.keyRelease(KeyEvent.VK_R);
            } else if (data.equals("ALT+F4")) {
                r.keyPress(KeyEvent.VK_ALT);
                r.keyPress(KeyEvent.VK_F4);
                r.delay(100);
                r.keyRelease(KeyEvent.VK_ALT);
                r.keyRelease(KeyEvent.VK_F4);
            } else {
                System.out.println("cannot type that character");
            }
        } catch (Exception e) {
            System.out.println("failed to perform pressKey");
        }
    }


}