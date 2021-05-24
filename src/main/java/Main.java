
public class Main {
    
    public static void main(String[] args) {
        System.out.print("-----База данных----- \n");
        DataBase Server = new DataBase();
        Server.Rec_Info();
        Server.Data_Stor();
        Server.SendRecInfo();   
    
     System.out.print("-----Контора----- \n");
    Contora Cont= new Contora();
    
    Cont.komp_yslug();
    Cont.Dokument();
    Cont.ContactInfo();
    Cont.Opisyslugi();
    Cont.CreateDogovor();
    
    System.out.print("-----Услуга----- \n");
    Uslugi Usl = new Uslugi();
    
    Usl.OkazUslug();
    Usl.PeredINDataBase();      
    Usl.CvitancOplat();
    
    System.out.print("-----Квитанция----- \n");
    
    Kvitancia Kvit= new Kvitancia();
    Kvit.Usluga();
    Kvit.SummSdel();
    Kvit.DohodSdel();
    Kvit.OpisSdel();
    Kvit.PeredKvitanKlient();
    Kvit.otpravKvitancInDB();
    
    System.out.print("-----Заказчик----- \n");
    
    Zakazchik Zak = new Zakazchik();
    Zak.FIO();
    Zak.VidDeat();
    Zak.Adress();        
    Zak.Tel();        
    Zak.obrechenInContor();        
            
            
}
}
