package business.concretes;

import business.abstracts.CampingService;
import entities.concretes.Camping;

public class CampingManager implements CampingService {
    @Override
    public void add(Camping camping) {
        System.out.println("New Camping Name : "+camping.getCampingName());
    }

    @Override
    public void update(Camping camping) {
        System.out.println("Update Camping Name : "+camping.getCampingName());
    }

    @Override
    public void delete(Camping camping) {
        System.out.println("Deleted Camping Name : "+camping.getCampingName());
    }
}
