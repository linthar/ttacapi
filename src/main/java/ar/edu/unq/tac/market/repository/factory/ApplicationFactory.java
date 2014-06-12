package ar.edu.unq.tac.market.repository.factory;

import ar.edu.unq.tac.market.domain.Application;
import ar.edu.unq.tac.market.domain.Category;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ApplicationFactory {

    public static List<Application> getApplicationList(String namePrefix, int quantity) {

        List<Application> list = new ArrayList<Application>(quantity);
        Random random = new Random();


        for (int i = quantity; i > 0; i--) {
            Application app = new Application();
            app.setName(namePrefix + " - App " + i);
            app.setDescription("App description " + i);
            //  app.setCurrentVersion("");
            app.setCategory(Category.FREE_TIME);
            app.setRanking(random.nextInt(6));
            list.add(app);
        }
        return list;
    }


}
