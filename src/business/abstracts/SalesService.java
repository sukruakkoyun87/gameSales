package business.abstracts;

import entities.concretes.Camping;
import entities.concretes.Game;
import entities.concretes.Player;

public interface SalesService {
    void sellGame(Player player, Game game);
    void campingGame(Player player, Game game, Camping camping);
}
