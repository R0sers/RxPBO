
package RobiS_5520124028_PBOPrakP3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class ScanVSBuffR {
    public ScanVSBuffR(){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nama\t: ");
        String nama = input.nextLine();
        
        System.out.print("Masukkan umur\t: ");
        int umur = input.nextInt();
        
        System.out.println("\n=== HASIL DENGAN SCANNER ===");
        System.out.println("Nama\t: " + nama);
        System.out.println("Umur\t: " + umur);
    }
    
    public ScanVSBuffR(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Masukkan nama\t: ");
        String nama = input.readLine();
        
        System.out.print("Masukkan umur\t: ");
        int umur = Integer.parseInt(input.readLine());
        
        System.out.println("\n=== HASIL DENGAN BUFFEREDREADER ===");
        System.out.println("Nama\t: " + nama);
        System.out.println("Umur\t: " + umur);
        
    }
    
    public static void main(String[] args) {
        
        System.out.println("\tSCANNER");
        System.out.println("-Lebih mudah karena langsung bisa membaca \n" +
                           " berbagai tipe data seperti int, double, String, dll.\n" +
                           "\n" +
                           "-Menggunakan method seperti \n" +
                           "nextInt(), nextDouble(), nextLine().\n" +
                           "\n"+
                           "-Lebih lambat karena melakukan parsing dan pemeriksaan token otomatis.");
        System.out.println("");
        
        System.out.println("Scanner input = new Scanner(System.in);\n" +
"        \n" +
"        System.out.print(\"Masukkan nama\\t: \");\n" +
"        String nama = input.nextLine();\n" +
"        \n" +
"        System.out.print(\"Masukkan umur\\t: \");\n" +
"        int umur = input.nextInt();\n" +
"        \n" +
"        System.out.println(\"\\n=== HASIL DENGAN SCANNER ===\");\n" +
"        System.out.println(\"Nama\\t: \" + nama);\n" +
"        System.out.println(\"Umur\\t: \" + umur);\n" +
"    }");
        
        System.out.println("=====================================================");
        
        System.out.println("");
        System.out.println("\tBuff Reader");
        System.out.println("-Harus membaca dalam bentuk String dulu, kemudian \n" +
                           "dikonversi ke tipe data lain dengan parse (misal: Integer.parseInt()).\n" +
                           "Harus membaca dalam bentuk String dulu, \n" +
                           "kemudian dikonversi ke tipe data lain dengan parse (misal: Integer.parseInt()).\n" +
                           "\n" +
                           "-Menggunakan method readLine().\n" +
                           "\n" +
                           "-Lebih cepat karena hanya membaca teks tanpa proses tambahan.");
        System.out.println(" ");
        
        System.out.println("BufferedReader input = new BufferedReader(new InputStreamReader(System.in));\n" +
"        \n" +
"        System.out.print(\"Masukkan nama\\t: \");\n" +
"        String nama = input.readLine();\n" +
"        \n" +
"        System.out.print(\"Masukkan umur\\t: \");\n" +
"        int umur = Integer.parseInt(input.readLine());\n" +
"        \n" +
"        System.out.println(\"\\n=== HASIL DENGAN BUFFEREDREADER ===\");\n" +
"        System.out.println(\"Nama\\t: \" + nama);\n" +
"        System.out.println(\"Umur\\t: \" + umur);\n" +
"        \n" +
"    }");
        
    }
    
    
}
