package business.abstracts;

import entities.concretes.Camping;


public interface CampingService {
    void add(Camping camping);
    void update(Camping camping);
    void delete(Camping camping);
}
