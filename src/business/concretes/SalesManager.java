package business.concretes;

import business.abstracts.SalesService;
import entities.concretes.Camping;
import entities.concretes.Game;
import entities.concretes.Player;

public class SalesManager implements SalesService {
    @Override
    public void sellGame(Player player, Game game) {

        System.out.println("Satın Alma İşlemi  : "+player.getFisrtName()+" "+player.getLastName() +" Oyun Adı : "+game.getName()+" Fiyatı : "+game.getPrice());
    }

    @Override
    public void campingGame(Player player, Game game, Camping camping) {
        System.out.println("Kampanyalı Satın Alma İşlemi  : "+player.getFisrtName()+" "+player.getLastName()
                +" Oyun Adı : "+game.getName()+" Kampanyalı Oyun Adı  : "+camping.getCampingName()+" İndirim Oranı : %"+camping.getDiscountRate()*10
                +"  Kampanyalı Oyun Fiyatı : "+(game.getPrice()*(1-camping.getDiscountRate())));
    }
}
