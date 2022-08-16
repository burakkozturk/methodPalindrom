public class Main {


    public static boolean isPalindrom(int sayi){

        if(sayi<10){
            return true;
        }

        if (sayi>10 && sayi<100){
            if (sayi%11 == 0){
                return true;
            }
            else{
                return false;
            }
        }

        if(sayi>100 && sayi<1000){
            if(sayi%10 == sayi/100){
                return true;
            }
            else{
                return false;
            }
        }

        if(sayi>1000 && sayi<10000){
            int enBuyuk ,kalan, enKucuk , yuzler;
            kalan = sayi % 1000;
            enBuyuk = (sayi-kalan)/1000;
            enKucuk = sayi % 10;
            yuzler = (sayi - enBuyuk*1000) - enKucuk;
            if(enBuyuk == enKucuk && yuzler % 11 == 0) {
                return true;
            }
            else {
                return false;
            }
        }

        return false;
    }



    public static void main(String[] args) {
        System.out.println(isPalindrom(6006));


    }
}