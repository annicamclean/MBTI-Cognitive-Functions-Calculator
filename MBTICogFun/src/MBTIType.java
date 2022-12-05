public class MBTIType {
    private char[] MBTI = new char[4];
    private String[] cogFun = new String[4];
    private String[] split = new String[2];
    private boolean extrovet = false;
    private boolean judger = false;
    private boolean inuitive = false;
    private boolean sensor = false;
    public MBTIType () {}

    public void MBTIArrays(String letters){
        letters = letters.toUpperCase();
        for (int i = 0; i < MBTI.length; i++) {
            MBTI[i] = letters.charAt(i);
            System.out.print(MBTI[i]);
        }
        split[0] = letters.substring(0,2);
        split[1] = letters.substring(2,4);

        firstCogFun();
    }

    public void firstCogFun() {
        if (MBTI[0] == 'E') {
            extrovet = true;
        }

        if (MBTI[3] == 'J') {
            judger = true;
        }

        if (extrovet && judger) {
            ejFunction1();
        } else if (!extrovet && judger) {
            ijFunction2();
        } else if (extrovet) {
            epFunction1();
        } else {
            ipFunction2();
        }
    }

    public void secondCogFun() {
        if (MBTI[1] == 'S') {
            sensor = true;
        }

        if (MBTI[1] == 'N') {
            inuitive = true;
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
}
