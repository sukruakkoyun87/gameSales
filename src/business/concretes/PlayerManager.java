package business.concretes;

import business.abstracts.BasePlayerManager;
import business.abstracts.PlayerService;
import business.abstracts.UserCheckService;
import entities.concretes.Player;

public class PlayerManager extends BasePlayerManager {

    UserCheckService userCheckService;

    public PlayerManager(UserCheckService userCheckService) {
        this.userCheckService = userCheckService;
    }

    @Override
    public void add(Player player) {
        if (userCheckService.userCheck(player)){
            super.add(player);
        }else{
            System.out.println("Not a valid Person");
        }

    }

}
