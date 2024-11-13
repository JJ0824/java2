package StudyGroup.Study0402;

import java.util.Arrays;

public class DAS {
    public static void main(String[] args) {

        int[] ArraySeonggyuBirthday = {1, 9, 9, 4, 0, 6, 2, 6};


        System.out.println(Arrays.toString(ArraySeonggyuBirthday));


        int[] ArrayFor = new int[4];

        for(int i = 0; i<ArrayFor.length;i++) {
            ArrayFor[i]=i;
        }
        System.out.println(Arrays.toString(ArrayFor));

        ArraySeonggyuBirthday[0]=2;
        ArraySeonggyuBirthday[1]=0;
        ArraySeonggyuBirthday[2]=2;
        ArraySeonggyuBirthday[3]=4;
        ArraySeonggyuBirthday[4]=0;
        ArraySeonggyuBirthday[5]=4;
        ArraySeonggyuBirthday[6]=0;
        ArraySeonggyuBirthday[7]=2;

        System.out.println(Arrays.toString(ArraySeonggyuBirthday));
    }
}
