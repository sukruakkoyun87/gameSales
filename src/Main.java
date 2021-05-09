import adapter.MernisAdapter;
import business.concretes.CampingManager;
import business.concretes.PlayerManager;
import business.concretes.SalesManager;
import business.concretes.UserCheckManager;
import entities.concretes.Camping;
import entities.concretes.Game;
import entities.concretes.Player;

public class Main {

    public static void main(String[] args) {

        Player player=new Player(1,"Şükrü","Akkoyun",1988,"28933866746");
        Game game1=new Game(1,"Counter-Strike: Global Offensive",100);
        Game game2=new Game(2,"PlayerUnknown's Battlegrounds",150);
        Camping camping=new Camping("Yaz İndirimi",0.2);

        System.out.println("------------------------ Kullanıcı Ekle Sil Güncelle ---------------------------");

        PlayerManager playerManager=new PlayerManager(new MernisAdapter());
        playerManager.add(player);
        playerManager.delete(player);
        playerManager.update(player);





        System.out.println("------------------------ Kampanya  Ekle Sil Güncelle ---------------------------");

        CampingManager campingManager=new CampingManager();
        campingManager.add(camping);
        campingManager.delete(camping);
        campingManager.update(camping);


        SalesManager salesManager=new SalesManager();
        System.out.println("------------------------ Normal Satış ---------------------------");
        salesManager.sellGame(player,game1);

        System.out.println("------------------------ Kampanyalı Satış ---------------------------");
        salesManager.campingGame(player,game2,camping);



    }
}
