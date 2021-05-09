package business.concretes;

import business.abstracts.UserCheckService;
import entities.concretes.Player;

public class UserCheckManager implements UserCheckService {
    @Override
    public boolean userCheck(Player player) {
        return true;
    }
}
