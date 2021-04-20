package UTS;

public class SortingdanSearching {

    private static String cari;
   public static void main(String[] args) {
        int[] data = {3,10,4,2,8,13};
        for (int i=0; i<data.length; i++){
            System.out.print(data[i]+" ");
        }
        int k=1;
        while (k<data.length){
            int j = data.length-1;
            while (j>=1){
                if (data[j-1]>data[j]){
                    int temp = data[j];
                    data[j] = data[j-1];
                    data[j-1] = temp;
                }
                j = j-1;
            }
            k = k+1;
        }
        System.out.println("\nBubble Sort");
        for (int i=0; i<data.length; i++){
            System.out.print(data[i]+" ");
        }
       for (int i=0; i<data.length; i++){
         int cari;
            cari = 0;
           if (data[1] ==cari){
                int ketemu = 1;
               System.out.println("data" + cari +"berada di indeks ke-"+1);
           }
       }
        System.out.println("");
        System.out.println("");
       int ketemu = 0;
        if (ketemu ==1)
            System.out.println("kesimpuan data ditemukan");
        else 
            System.out.println("data yang di cari= "+cari);
            System.out.println("kesimpulan data tidak ditemukan");
            
               System.out.println();
        System.out.println("Muhammad Rizky Ikhval Alamsyah");
    }
}