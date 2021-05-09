package business.abstracts;

import entities.concretes.Player;

public class BasePlayerManager implements PlayerService {
    @Override
    public void add(Player player) {
        System.out.println("Saved to Db : "+player.getFisrtName()+" "+player.getLastName());
    }

    @Override
    public void update(Player player) {
        System.out.println("Updated to Db : "+player.getFisrtName()+" "+player.getLastName());
    }

    @Override
    public void delete(Player player) {
        System.out.println("Deleted to Db : "+player.getFisrtName()+" "+player.getLastName());
    }
}
