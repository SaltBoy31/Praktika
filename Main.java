package workpractice;

public class Main {
    public static void main(String[] args) {
        Info info=new Info();
        Uslugi uslugi=new Uslugi();
        Zakaz zakaz=new Zakaz();
        Kvit kvit=new Kvit();
        
        System.out.println("Информация");
        info.infoOut();
        
        System.out.println();
        
        System.out.println("Услуги");
        uslugi.uslugiOut();
        
        System.out.println();
        
        System.out.println("Заказ");
        zakaz.zakazOut();
        
        System.out.println();
        
        System.out.println("Информация");
        kvit.kvitOut();
        
        System.out.println();
        
        
    }
}