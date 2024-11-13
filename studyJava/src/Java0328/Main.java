package Java0328;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        InfoCreate.createInfos();

        ArrayList <LectureRegistration> lectureRegistrations = new ArrayList<>();
        LectureRegistration lectureRegistration1 = new LectureRegistration("hero11", 1);
        lectureRegistrations.add(lectureRegistration1);
        LectureRegistration lectureRegistration2 = new LectureRegistration("tommy", 2);
        lectureRegistrations.add(lectureRegistration2);
        LectureRegistration lectureRegistration3 = new LectureRegistration("sue", 1);
        lectureRegistrations.add(lectureRegistration3);
        LectureRegistration lectureRegistration4 = new LectureRegistration("nice", 3);
        lectureRegistrations.add(lectureRegistration4);
        LectureRegistration lectureRegistration5 = new LectureRegistration("goodlife", 1);
        lectureRegistrations.add(lectureRegistration5);

        for(int i=0; i<lectureRegistrations.size(); i++) {
            if (lectureRegistrations.get(i).getLectureId() == 1) {
                System.out.println(lectureRegistrations.get(i).getUserId());
            }
        }
    }
}
