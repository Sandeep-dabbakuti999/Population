
package Cells;

import java.util.ArrayList;

public class Plato {

    public static void RulesOfSurvival(ArrayList<Integer> cre, ArrayList<Integer> sort) {
        int i = 0;
        for (int s = 0; s < sort.size(); s = s + 2) {

            if (ArrLis.box[sort.get(s)][sort.get(s + 1)] == false && cre.get(i) == 3) {

                ArrLis.box[sort.get(s)][sort.get(s + 1)] = true;
            } else if (ArrLis.box[sort.get(s)][sort.get(s + 1)] == true && cre.get(i) == 3) {
                ArrLis.box[sort.get(s)][sort.get(s + 1)] = true;
            } else if (ArrLis.box[sort.get(s)][sort.get(s + 1)] == false && cre.get(i) < 2) {
                ArrLis.box[sort.get(s)][sort.get(s + 1)] = false;
            } else if (ArrLis.box[sort.get(s)][sort.get(s + 1)] == true && (cre.get(i) == 2 || cre.get(i) == 4 || cre.get(i) == 5)) {
                ArrLis.box[sort.get(s)][sort.get(s + 1)] = true;
            } else if (ArrLis.box[sort.get(s)][sort.get(s + 1)] == false && cre.get(i) > 5) {
                ArrLis.box[sort.get(s)][sort.get(s + 1)] = false;
            }
            i++;
        }
    }
}









