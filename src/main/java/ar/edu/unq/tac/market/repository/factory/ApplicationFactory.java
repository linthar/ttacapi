package ar.edu.unq.tac.market.repository.factory;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import ar.edu.unq.tac.market.domain.Application;
import ar.edu.unq.tac.market.domain.Category;

public class ApplicationFactory {

	private static String apps[] = {
		  "Explorer,   Explorador,                      00.png, 1, 4",
		  "LinkedIn,   Red social laboral,              01.png, 1, 4",
		  "Filezilla,  Comparte tus archivos,           02.png, 1, 4",
		  "facebook,   Red social,                      03.png, 1, 4",
		  "Taringa,    Inteligencia colectiva,          04.png, 1, 4",
		  "Gnome,      La mejor interface,              05.png, 1, 4",
		  "Winrar,     Comprime tus archivos,           06.png, 1, 4",
		  "Youtube,    Navegador de videos,             07.png, 1, 4",
		  "WMP,        Super reproductor musica,        08.png, 1, 4",
		  "BMW,        Los mejores autos,               09.png, 1, 4",
		  "Chromiun,   Potente explorador,              10.png, 1, 4",
		  "Whatsapp,   Contate todo,                    11.png, 1, 4",
		  "Suse,       Emulador de Ubuntu,              12.png, 1, 4",
		  "Twiter,     Red social cheta,                13.png, 1, 4",
		  "Mac,        Glamour y un poco de tecnologia, 14.png, 1, 4",
		  "VirtualBox, Todos tus sistemas en uno solo,  15.png, 1, 4",
		  "Firefox,    Explorador muy seguro,           16.png, 1, 4",
	      "VLC,        Reproduce tus videos,            17.png, 1, 4"};
		
		public static int amount(){
			return apps.length;
		}

	    public static List<Application> getApplicationList() {

	        List<Application> list = new LinkedList<Application>();
	        Random random = new Random();
	        
	        for (int i = 0; i < apps.length; i++) {
	        	String app = apps[i];
	            list.add(fromString(app, random));
	            
	        }
	        
	        return list;
	    }

	    private static Application fromString(String app, Random random){
	    	String parserApp[] = parseApp(app);
	    	Application application = new Application();

	        application.setName(parserApp[0]);
	        application.setDescription(parserApp[1]);
	        //  application.setCurrentVersion("");
	        application.setIcon(parserApp[2]);
	        application.setCategory(Category.FREE_TIME);
	        application.setRanking(random.nextInt(6));
	        
	    	return application;
	    }
	    
	    private static String[] parseApp(String app){
	    	String[] splitApp = app.split(",");
	    	for (int i = 0; i < splitApp.length; i++) {
	    		splitApp[i] = splitApp[i].trim();
	        }
	    	return splitApp;
	    }


}
