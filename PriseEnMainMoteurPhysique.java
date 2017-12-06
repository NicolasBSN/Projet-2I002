package tuto;

public class PriseEnMainMoteurPhysique {

	// Ajout d'Exception liées à la temporisation que l'on ne souhaite pas gérer
	public static void main(String[] args) throws InterruptedException {
        
        // Moteur Physique 2D (vue dessus)
        MoteurPhysique mphys = new MoteurPhysique();
        
        // Création d'une boite = murs
        Mur mur = new Mur(50, 50, 200, 200);
        
        // Création d'une particule
        CerclePhysique particule = new CerclePhysique(100, 100, 10, 1);
        
        Terrain[][] t =(MapFactoryFromFile_Matrix .build("terrain1.trk"));
		Salle s = new Salle(t,10);
        Personne p = new Personne(150.,150., new StrategySauveQuiPeut(s));
        p.setRandomDirectionAndVitesse();
        p.setDir(new Vecteur2D(100.,150.));
        p.setVit(0.05);
        mphys.add(mur);
        mphys.add(p);
        
        // graphiques: PARTIE A FAIRE
        Fenetre mgraph = new Fenetre();
        //Creation des vues associées aux objets physiques
        /*mgraph.add(new VueParticule(p));
        mgraph.add(new VueMur(mur));*/
        /*for (int i = 0;  i  < s.getDimy(); i++) {
        	for (int j = 0; j < s.getDimx(); j++) {
        		if(s.get(i,j)==Terrain.Mur)
        			mgraph.add(new VueMur(Mur);
				
			}
			
		}*/
        // boucle de mouvement + affichage
        for(int iter = 0; iter<2000; iter++) {
            // mouvements
            mphys.updateMovablePosition();
           
            mgraph.repaint();      
           
            Thread.sleep(50);
            
            if(!mphys.isMove()) {
                System.out.println("plus de mouvement => sortie");
                break;
            }
        }
        
        // Attention, le programme ne s'arrête pas, il faut fermer la fenêtre
    }
}
