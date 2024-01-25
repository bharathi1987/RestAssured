package JavaPrograms;

public class SubStringProgram1 {
    public static void main(String[] args) {

        String test="baabcfcagggyta";

        int bigLenth=0;
        String highestSequenceBetweenSameChar = null;

        for(int i=0;i<test.length();i++)
        {
            for(int j=i+1;j<test.length();j++)
            {
                if(test.charAt(i)==test.charAt(j))
                {
                    System.out.println(test.substring(i+1,j));
                    int tempLenght= test.substring(i+1,j).length();
                    if(bigLenth<tempLenght)
                    {
                        bigLenth=tempLenght;
                        highestSequenceBetweenSameChar=test.substring(i+1,j);
                        System.out.println("inside loop"+bigLenth);
                    }
                    break;

                }
            }
        }

        System.out.println(bigLenth);
        System.out.println(highestSequenceBetweenSameChar);
    }
}
