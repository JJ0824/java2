package StudyGroup.Study0521;

import java.util.Scanner;

class Name {
    public String[] strings(String[] studentName) {

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < studentName.length; i++) {
            studentName[i] = scanner.nextLine();
        }
        return studentName;
    }
}