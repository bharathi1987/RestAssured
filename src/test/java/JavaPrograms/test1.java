package JavaPrograms;

public class test1 {

    public static void main(String[] args) {

        String str= "have a nice day";

        String[] strArray= str.split(" ");

       // System.out.println(strArray[0]);

        for (int i=0;i< strArray.length;i++)
        {
            char[] ch= strArray[i].toCharArray();
            String newSplitted = "";
            for(int j=0;j< ch.length;j++)
            {
                if(j==0)
                {
               ch[j]= Character.toUpperCase(ch[j]);
                }

                newSplitted=newSplitted+ch[j];

            }

            System.out.print(newSplitted +" ");



        }

    }
}
