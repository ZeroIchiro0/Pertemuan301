package pertemuan302;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 * Selasa, 19 Maret 2025
 */
public class Pertemuan302 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int jml = 0;
        Scanner dtIN = new Scanner(System.in);
        System.out.print("Jumlah Pengulangan: ");
        jml = Integer.parseInt(dtIN.nextLine());
        
        for(int i=1;i<=jml;i++){
            System.out.println("Perulangan ke-"+i);
        }
        
        System.out.println("Pertemuan While");
        int awal = 1;
        while(awal<=jml){
            System.out.println("Pertemuan ke-"+awal);
            awal++;
        }
        
        System.out.println("Perulangan Do While");
        awal = 1;
        do{
            System.out.println("Perulangan ke-"+awal);
            awal++;
        }while(awal<=jml);
    }
    
}
