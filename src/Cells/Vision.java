package Cells;

import java.util.ArrayList;

public class Vision  {


        public static void automat(int l, int m, ArrayList<Integer> creation){
            if(l ==0 && m==0)
            {
                if(ArrLis.box[l][m + 1]) {

                   creation.add(l);
                    creation.add(m);
                }
                if(ArrLis.box[l + 1][m]) {
                    creation.add(l);
                    creation.add(m);
                }
                if(ArrLis.box[l + 1][m + 1]) {
                    creation.add(l);
                    creation.add(m);
                }
            }
            else if(l==0 && m==39)
            {
                if(ArrLis.box[l][m - 1]) {
                    creation.add(l);
                    creation.add(m);
                }
                if(ArrLis.box[l + 1][m - 1]) {
                    creation.add(l);
                    creation.add(m);
                }
                if(ArrLis.box[l + 1][m]) {
                    creation.add(l);
                    creation.add(m);
                }
            }
            else if(l==39 && m==0)
            {
                if(ArrLis.box[l - 1][m]) {
                    creation.add(l);
                    creation.add(m);
                }
                if(ArrLis.box[l - 1][m + 1]) {
                    creation.add(l);
                    creation.add(m);
                }
                if(ArrLis.box[l][m + 1]) {
                    creation.add(l);
                    creation.add(m);
                }
            }

            else if(l ==39 && m==39)
            {
                if(ArrLis.box[l - 1][m]) {
                    creation.add(l);
                    creation.add(m);
                }
                if(ArrLis.box[l][m - 1]) {
                    creation.add(l);
                    creation.add(m);
                }
                if(ArrLis.box[l - 1][m - 1]) {
                    creation.add(l);
                    creation.add(m);
                }

            }
            else if(l ==0 && (m!=0||m!=39))
            {
                if(ArrLis.box[l][m - 1]) {
                    creation.add(l);
                    creation.add(m);
                }
                if(ArrLis.box[l][m + 1]) {
                    creation.add(l);
                    creation.add(m);
                }
                if(ArrLis.box[l + 1][m - 1]) {
                    creation.add(l);
                    creation.add(m);

                }
                if(ArrLis.box[l + 1][m]) {
                    creation.add(l);
                    creation.add(m);
                }
                if(ArrLis.box[l + 1][m + 1]) {
                    creation.add(l);
                    creation.add(m);
                }
            }
            else if(m ==39 && (l!=0||l!=39))
            {
                if(ArrLis.box[l - 1][m]) {
                    creation.add(l);
                    creation.add(m);
                }
                if(ArrLis.box[l - 1][m - 1]) {
                    creation.add(l);
                    creation.add(m);
                }
                if(ArrLis.box[l][m - 1]) {
                    creation.add(l);
                    creation.add(m);
                }
                if(ArrLis.box[l + 1][l - 1]) {
                    creation.add(l);
                    creation.add(l);
                }
                if(ArrLis.box[l + 1][m]) {
                    creation.add(l);
                    creation.add(m);
                }
            }
            else if(l ==39 && (m!=0||m!=39))
            {
                if(ArrLis.box[l][m - 1]) {
                    creation.add(l);
                    creation.add(m);
                }
                if(ArrLis.box[l - 1][m - 1]) {
                    creation.add(l);
                    creation.add(m);
                }
                if(ArrLis.box[l - 1][m]) {
                    creation.add(l);
                    creation.add(m);
                }
                if(ArrLis.box[l - 1][m + 1]) {
                    creation.add(l);
                    creation.add(m);
                }
                 if(ArrLis.box[l][m + 1]) {
                     creation.add(l);
                     creation.add(m);
                }
            }
            else if(m ==0 && (l!=0||l!=39))
            {
                if(ArrLis.box[l - 1][m]) {
                    creation.add(l);
                    creation.add(m);
            }
            if(ArrLis.box[l - 1][m + 1]) {
                creation.add(l);
                creation.add(m);
                }
            if(ArrLis.box[l][m + 1]) {
                creation.add(l);
                creation.add(m);
                }
            if(ArrLis.box[l + 1][m + 1]) {
                creation.add(l);
                creation.add(m);
                }
            if(ArrLis.box[l + 1][m]) {
                creation.add(l);
                creation.add(m);
                }
            }
            else
            {if(ArrLis.box[l - 1][m - 1]) {
                creation.add(l);
                creation.add(m);
            }
            if(ArrLis.box[l - 1][m]) {
                creation.add(l);
                creation.add(m);
            }
            if(ArrLis.box[l - 1][m + 1]) {
                creation.add(l);
                creation.add(m);
            }
            if(ArrLis.box[l][m - 1]) {
                creation.add(l);
                creation.add(m);
            }
            if(ArrLis.box[l][m + 1]) {
                creation.add(l);
                creation.add(m);
            }
            if(ArrLis.box[l + 1][m - 1]) {
                creation.add(l);
                creation.add(m);
            }
            if(ArrLis.box[l + 1][m]) {
                creation.add(l);
                creation.add(m);
            }
            if(ArrLis.box[l + 1][m + 1]){
                creation.add(l);
                creation.add(m);
            }

        }





    }
}


