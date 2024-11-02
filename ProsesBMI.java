/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BMI;

/**
 *
 * @author zhazha
 */

public class ProsesBMI {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // input pembukaan bmi
        System.out.println("welcome to calculator BMI");
        System.out.println(">________________________<");

        // Input berat badan dalam kilogram
        System.out.print("isi berat badan dalam KG: ");
        double beratbadan = scanner.nextDouble();

        // Input tinggi badan dalam meter
        System.out.print("isi tinggi badan dalam M: ");
        double tinggibadan = scanner.nextDouble();

        // Menghitung BMI
        double bmi = beratbadan / (tinggibadan * tinggibadan);

        // Hasil BMI
        System.out.printf("hasil BMI anda : ", bmi);
        
        // Menentukan kategori BMI
        if (bmi < 18.5) {
            System.out.println("Termasuk: ceking");
        } else if (bmi < 24.9) {
            System.out.println("Termasuk: Normal");
        } else if (bmi < 29.9) {
            System.out.println("Termasuk: gemuk");
        } else {
            System.out.println("Termasuk: Obesitas");
        }
        // Menutup scanner
        scanner.close();
    }
}
