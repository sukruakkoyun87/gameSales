package adapter;

import business.abstracts.UserCheckService;
import entities.concretes.Player;
import mernis.NTEKPSPublicSoap;

public class MernisAdapter implements UserCheckService {
    @Override
    public boolean userCheck(Player player) {
        NTEKPSPublicSoap client=new NTEKPSPublicSoap();
        try {
            return client.TCKimlikNoDogrula(Long.parseLong(player.getNationalityId()),
                    player.getFisrtName().toUpperCase(),
                    player.getLastName().toUpperCase(),
                    player.getBirtDateYear() );

        }catch (Exception e){
            System.out.println("Error Message "+e.getMessage());
        }
        return false;
    }
}
