import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Q1_IntLİst {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(-5,-8,-2,-12,0,1,12,5,6,9,15,8));
        hepsiniYazdir(list);
        System.out.println("\n***");
        negatifleriYazdir(list);
        System.out.println("\n***");
        System.out.println("pozitifList(list) = " + pozitifList(list));
        System.out.println("\n***");
        System.out.println("kareleriList(list) = " + kareleriList(list));
        System.out.println("\n***");
        System.out.println("kareleriTekrarsizList(list) = " + kareleriTekrarsizList(list));
        System.out.println("\n***");
        kckBykSirala(list);
        System.out.println("\n***");
        bykKckeSirala(list);
        System.out.println("\n***");
        System.out.println("kuplerListe(list) = " + kuplerListe(list));
        System.out.println("\n***");
        System.out.println("karelerSonu5Olmayan(list) = " + karelerSonu5Olmayan(list));
        System.out.println("\n***");
        System.out.println("elemanToplami(list) = " + elemanToplami(list));
        System.out.println("\n***");
        System.out.println("negatifKareleriLİst(list) = " + negatifKareleriLİst(list));
        System.out.println("\n***");
        System.out.println("bestenBykSayiVarMi(list) = " + bestenBykSayiVarMi(list));
        System.out.println("\n***");

    }
    // S1:listi aralarinda bosluk birakarak yazdiriniz //
    public static void hepsiniYazdir(List<Integer> l){
        l.stream().forEach(t->System.out.print(t+" "));
    }



    //S2: sadece negatif olanlari yazdir
    public static void negatifleriYazdir(List<Integer> l){
        l.stream().filter(t->t<0).forEach(t->System.out.print(t+" "));
    }


    //S3: pozitif olanlardan yeni bir liste olustur
    public static List<Integer> pozitifList(List<Integer> l){
       return l.stream().filter(t->t>0).collect(Collectors.toList());
    }


    // S4: list in elemanlarin karelerinden yeni bir list olusturalim

    public static List<Integer> kareleriList(List<Integer> l){
        return l.stream().map(t->t*t).collect(Collectors.toList());
    }

    //S5 : list in elemanlarin karelerinden tekrarsiz yeni bir list olusturalim
    public static List<Integer> kareleriTekrarsizList(List<Integer> l){
        return l.stream().map(t->t*t).distinct().collect(Collectors.toList());
    }


    //S6: listin elemanlarini kucukten buyuge siralayalim
    public static void kckBykSirala(List<Integer> l){
        l.stream().sorted().forEach(t->System.out.print(t+" "));
    }


    //S7: listin elemanlarini buyukten kucuge siralayalim
    public static void bykKckeSirala(List<Integer> l){
        l.stream().sorted(Comparator.reverseOrder()).forEach(t->System.out.print(t+" "));
    }


    // S8: list pozitif elemanlari icn kuplerini bulup birler basamagi 5 olanlardan yeni bir list olusturalim
    public static List<Integer> kuplerListe(List<Integer> l) {
    return l.stream().filter(t->t>0).map(t->t*t*t).filter(t->t%10==5).collect(Collectors.toList());
    }

    //S9: list pozitif elemanlari icn karelerini bulup birler basamagi 5 olmayanlardan yeni bir list olusturalim
    public static List<Integer> karelerSonu5Olmayan(List<Integer> l) {
        return l.stream().filter(t->t>0).map(t->t*t).filter(t->t%10!=5).collect(Collectors.toList());
    }


    // S10 :list elemanlarini toplamini bulalim
    public static int elemanToplami(List<Integer> l) {
        return l.
                stream().
                reduce(0,(x,y)->x+y);
                //reduce(0,Integer::sum);
    }


    // S11 : peek ornegi cozelim - negatiflerin karelerinden list olusturalim
    public static List<Integer> negatifKareleriLİst(List<Integer> l) {
        return l.stream().filter(t->t<0).peek(t->System.out.println("negatifler "+ t)).map(t->t*t).
                peek(t->System.out.println("kareleri : "+t)).filter(t->t%10!=5).collect(Collectors.toList());


    }


    // S12 : listeden 5 den buyuk  sayi var mi?
    public static boolean bestenBykSayiVarMi(List<Integer> l) {
    return l.stream().anyMatch(t->t>5);

    }
        // S13 : listenin tum elemanlari sifirdan kucuk mu?



    // S14: listenin 100 e esit elemani yok mu ?



    // S15: listenin sifira esit elemani yok mu?



    // S16:  listenin ilk 5 elemanini topla?



    //S17: listenin son bes elemaninin  listele



}
