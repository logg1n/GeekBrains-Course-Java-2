package Obstacle;

import Sportsman.*;

import java.util.ArrayList;

public class Course {
    private ArrayList<Obstacle> ObstacleList;

    public Course(Obstacle ... obstacle) {
        ObstacleList = new ArrayList<Obstacle>();

        for (Obstacle o : obstacle)
            ObstacleList.add(o);
    }

    public void Overcoming(Team team) {
        for (Sportsman s : team.getPersonTeamList()) {
            for (int i = 0; i < ObstacleList.size(); i++) {
                Object obj = ObstacleList.get(i);

                if(obj instanceof Water){
                    if (s.swim(((Water) obj).getSize())){
                        s.setDistCheck(true);
                    }
                    else {
                        s.setSlipUp("Water");
                        s.setDistCheck(false);
                        break;
                    }
                }
                else if (obj instanceof Wall){
                    if (s.jump(((Wall) obj).getSize())){
                        s.setDistCheck(true);
                    }
                    else {
                        s.setSlipUp("Wall");
                        s.setDistCheck(false);
                        break;
                    }
                }
                else if (obj instanceof Road){
                    if (s.run(((Road) obj).getSize())){
                        s.setDistCheck(true);
                    }
                    else {
                        s.setSlipUp("Road");
                        s.setDistCheck(false);
                        break;
                    }
                }
            }
        }
    }
}
