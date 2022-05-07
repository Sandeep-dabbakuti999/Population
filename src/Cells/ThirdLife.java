package Cells;
import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;
import processing.core.PApplet;
public class ThirdLife extends PApplet{
    public Rectangle r;
    int s, v;
    public static void main(String[] args) {
        ThirdLife mas = new ThirdLife();
        ArrLis Md = new ArrLis();
        Scanner m=new Scanner(System.in);
        Md.create();
        mas.origionals();
        PApplet.main(ThirdLife.class);
        System.out.println("Enter no of iterations:");
        int z=m.nextInt();
        for (int itr=1;itr<=z;itr++) {
            mas.creation();
            Plato.RulesOfSurvival(mas.cre(),mas.sort());
            if(itr == z) {
                PApplet.main(ThirdLife.class);
            }
        }
    }

    ArrayList<Integer> neighbour = new ArrayList<>();
    public ArrayList<Integer> creation(){
        for (int i = 0; i < 39; i++) {
            for (int j = 0; j < 39; j++) {
                if (ArrLis.box[i][j] == false || true) {
                    Vision.automat(i, j,neighbour);
                }
            }
        }
        return neighbour;
    }

    public ArrayList<Integer> cre() {
        ArrayList<Integer> man1 = new ArrayList<>();
        int[] freq = new int[neighbour.size()];
        for (int i = 0; i < neighbour.size(); i++) {
            freq[i] = -1;
        }
        for (s = 0; s < neighbour.size(); s = s + 2) {
            int count = 1;
            for (v = s + 2; v < neighbour.size(); v = v + 2) {
                if ((neighbour.get(s) == neighbour.get(v)) && (neighbour.get(s + 1) == neighbour.get(v + 1))) {
                    count++;
                    freq[v] = 0;
                    freq[v + 1] = 0;

                }
            }
            if (freq[s] != 0 && freq[s + 1] != 0) {
                freq[s] = count;
            }

        }
        for (int i = 0; i < neighbour.size(); i++) {
            if (freq[i] != 0 && freq[i] != -1) {
                man1.add(freq[i]);
            }
        }
        return man1;

    }

    ArrayList<Integer>  sort() {
        ArrayList<Integer> man2 = new ArrayList<>();
        int[] sor = new int[neighbour.size()];
        for (int i = 0; i < neighbour.size(); i++) {
            sor[i] = neighbour.get(i);
        }
        for (int s = 0; s < neighbour.size(); s = s + 2) {
            for (int v = s + 2; v < neighbour.size(); v = v + 2) {
                if ((neighbour.get(s) == (neighbour.get(v))) && neighbour.get(s + 1) == neighbour.get(v + 1)) {
                    sor[v] = 0;
                    sor[v + 1] = 0;
                }
            }
        }
        for (int j = 0; j < neighbour.size(); j++) {
            if (sor[j] != 0 && sor[j] != -1) {
                man2.add(sor[j]);
            }
        }
        return man2;
    }


    public void origionals() {
        int i, j;
        for (i = 0; i < 39; i++) {
            for (j = 0; j < 39; j++) {
                if (i ==19&& j ==18|| i ==20&& j ==18|| i ==20&& j ==19|| i ==21&& j ==18|| i ==21&& j ==19|| i ==21&& j ==20) {
                    ArrLis.box[i][j] = true;

                } else {
                    ArrLis.box[i][j] = false;
                }
            }
        }

    }

    public void settings() {
        size(800,800);
    }
    public void draw() {
        background(100);

        for(int i=0;i<39;i++)
        {
            for(int j=0;j<39;j++)
            {
                r = new Rectangle(i*20,j*20,20,20);
                if(ArrLis.box[j][i] == true)
                {
                    r.draw(Color.BLUE,this);
                }
                else
                {
                    r.draw(Color.YELLOW,this);
                }
            }
        }
    }
}







