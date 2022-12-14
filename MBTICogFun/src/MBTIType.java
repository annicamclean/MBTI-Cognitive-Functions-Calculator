import java.util.Arrays;

public class MBTIType {
    private char[] MBTI = new char[4];
    private String[] cogFun = new String[4];
    private String[] split = new String[2];
    private boolean extrovert = false;
    private boolean judger = false;
    public MBTIType () {}

    public void MBTIArrays(String letters){
        Arrays.fill(MBTI, ' ');
        Arrays.fill(cogFun, "");
        Arrays.fill(split, "");
        letters = letters.toUpperCase();
        split[0] = letters.substring(0,2);
        split[1] = letters.substring(2,4);

        for (int i = 0; i < MBTI.length; i++) {
            MBTI[i] = letters.charAt(i);
        }

        firstCogFun();
    }

    public void firstCogFun() {
        if (MBTI[0] == 'E') {
            extrovert = true;
        }

        if (MBTI[3] == 'J') {
            judger = true;
        }

        if (extrovert && judger) {
            ejFunction1();
        } else if (!extrovert && judger) {
            ijFunction2();
        } else if (extrovert) {
            epFunction1();
        } else {
            ipFunction2();
        }

        for (int i = 0; i < cogFun.length; i++) {
            System.out.print(cogFun[i]);
            if (i != 3) {
                System.out.print("->");
            }
        }
    }

    public void secondCogFun() {

        if (split[0].equals("EN")) {
            enFunction2();
            System.out.println("EN2 WORK");
        } else if (split[0].equals("ES")) {
            esFunction2();
            System.out.println("ES2 WORK");
        } else if (split[0].equals("IN")) {
            inFunction1();
            System.out.println("IN1 WORK");
        } else if (split[0].equals("IS")) {
            isFunction1();
            System.out.println("IS1 WORK");
        } else {
            System.out.println("NOT WORKING");
        }

    }


    public void ejFunction1() {
        if (split[1].equals("TJ")) {
            cogFun[0] = "Te";
            cogFun[3] = "Fi";
        } else {
            cogFun[0] = "Fe";
            cogFun[3] = "Ti";
        }
        secondCogFun();
    }

    public void epFunction1() {
        if (split[0].equals("EN")) {
            cogFun[0] = "Ne";
            cogFun[3] = "Si";
        } else {
            cogFun[0] = "Se";
            cogFun[3] = "Ni";
        }
        secondCogFun();
    }

    public void ijFunction2() {
        if (split[1].equals("TJ")) {
            cogFun[1] = "Te";
            cogFun[2] = "Fi";
        } else {
            cogFun[1] = "Fe";
            cogFun[2] = "Ti";
        }
        secondCogFun();
    }

    public void ipFunction2() {
        if (split[0].equals("IN")) {
            cogFun[1] = "Ne";
            cogFun[2] = "Si";
        } else {
            cogFun[1] = "Se";
            cogFun[2] = "Ni";
        }
        secondCogFun();
    }

    public void enFunction2() {
        if (MBTI[3] == 'J') {
            cogFun[1] = "Ni";
            cogFun[2] = "Se";
        } else if (MBTI[2] == 'F') {
            cogFun[1] = "Fi";
            cogFun[2] = "Te";
        } else {
            cogFun[1] = "Ti";
            cogFun[2] = "Fe";
        }
    }

    public void esFunction2() {
        if (MBTI[3] == 'J') {
            cogFun[1] = "Ni";
            cogFun[2] = "Se";
        } else if (MBTI[2] == 'F') {
            cogFun[1] = "Fi";
            cogFun[2] = "Te";
        } else {
            cogFun[1] = "Ti";
            cogFun[2] = "Fe";
        }
    }

    public void inFunction1() {
        if (MBTI[3] == 'J') {
            cogFun[0] = "Ni";
            cogFun[3] = "Se";
        } else if (MBTI[2] == 'F') {
            cogFun[0] = "Fi";
            cogFun[3] = "Te";
        } else {
            cogFun[0] = "Ti";
            cogFun[3] = "Fe";
        }
    }

    public void isFunction1() {
        if (MBTI[3] == 'J') {
            cogFun[0] = "Si";
            cogFun[3] = "Ne";
        } else if (MBTI[2] == 'F') {
            cogFun[0] = "Fi";
            cogFun[3] = "Te";
        } else {
            cogFun[0] = "Ti";
            cogFun[3] = "Fe";
        }
    }

}
