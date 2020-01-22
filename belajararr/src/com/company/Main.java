package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        double C, K, F, R;
        String a = "\u00b0"; 
        String b; //di switch ini saya gunakan string untuk mengatasi ketika ada yang melakukan input dalam bentuk huruf
        char ulang = 'y'; 
        char e = 'y'; //karakter ini untuk perulangan ketika eror
        Scanner rs = new Scanner(System.in); 
        while((ulang == 'y') || (ulang == 'Y')){ 
            e = 'y';
            System.out.println("Pilih salah satu");
            System.out.println("1. Konversi suhu Celcius");
            System.out.println("2. Konversi suhu Reamur");
            System.out.println("3. Konversi suhu Fahrenheit");
            System.out.println("4. Konversi suhu Kelvin");
            b = rs.nextLine(); 
            while (e == 'y') { 
                switch (b) { 
                    case "1": {
                        System.out.println("Masukkan suhu Celcius interval 0-100");
                        C = rs.nextDouble();
                        while ((C < 0) || (C > 100)) { 
                            System.out.println("Masukkan dengan benar, hanya untuk interval 0-100");
                            C = rs.nextDouble();
                        }
                        F = C * 9 / 5 + 32;
                        R = C * 4 / 5;
                        K = C + 273;
                        System.out.printf("Konversi ke \nFahrenheit = %.1f" + a + "F\nReamur = %.1f" + a + "R\nKelvin = %.1fK", F, R, K);
                        e = 'n'; //agar perulangan tak langsung terjadi
                        break;
                    }
                    case "2": {
                        System.out.println("Masukkan suhu Reamur interval 0-80");
                        R = rs.nextDouble();
                        while ((R < 0) || (R > 80)) {
                            System.out.println("Masukkan dengan benar, hanya untuk interval 0-80");
                            R = rs.nextDouble();
                        }
                        C = R * 5 / 4;
                        F = R * 9 / 4 + 32;
                        K = C + 273;
                        System.out.printf("Konversi ke \nCelcius = %.1f" + a + "C\nFahrenheit = %.1f" + a + "F\nKelvin = %.1fK", C, F, K);
                        e = 'n';
                        break;
                    }
                    case "3": {
                        System.out.println("Masukkan suhu Fahrenheit interval 32-212");
                        F = rs.nextDouble();
                        while ((F < 32) || (F > 212)) {
                            System.out.println("Masukkan dengan benar, hanya untuk interval 32-212");
                            F = rs.nextDouble();
                        }
                        C = (F - 32) * 5 / 9;
                        R = (F - 32) * 4 / 9;
                        K = C + 273;
                        System.out.printf("Konversi ke \nCelcius = %.1f" + a + "C\nReamur = %.1f" + a + "F\nKelvin = %.1fK", C, R, K);
                        e = 'n';
                        break;
                    }
                    case "4": {
                        System.out.println("Masukkan suhu kelvin interval 273-373");
                        K = rs.nextDouble();
                        while ((K < 273) || (K > 373)) {
                            System.out.println("Masukkan dengan benar, hanya untuk interval 273-373");
                            K = rs.nextDouble();
                        }
                        F = (K - 273) * 9 / 5 + 32;
                        R = (K - 273) * 4 / 5;
                        C = K - 273;
                        System.out.printf("Konversi ke \nFahrenheit = %.1f" + a + "F\nReamur = %.1f" + a + "R\ncelcius = %.1f"+a+"C", F, R, C);
                        e = 'n';
                        break;
                    }
                    default: //jika input pilihan di luar 1-4
                        System.out.println("Input ulang");
                        e = 'y';
                        b = rs.nextLine();
                }
            }
            System.out.println("\nMau ulang? Tekan y jika ya");
            ulang = rs.next().charAt(0); //input untuk memastikan user ingin menggunakan aplikasi kembali atau tidak
        }
    }
}
