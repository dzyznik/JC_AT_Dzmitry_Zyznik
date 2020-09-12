package main.java.tasks.day5;

//имеется текст лога в виде:
//
//access_log.2020.09.07 212.168.101.5 granted
//access_log.2020.09.07 212.168.101.6 denied
//
//написать метод, который выводит список из уникальных IP адресов и количества удачных и неудачных попыток доступа в формате:
//ip 212.168.101.5: ok - 3, failed - 2
public class StringTask3 {
    public static void main(String[] args) {

        String logs = "access_log.2020.09.07 212.168.101.5 granted \naccess_log.2020.09.07 212.168.101.6 denied \naccess_log.2020.09.07 212.168.101.7 denied \naccess_log.2020.09.07 212.168.101.8 granted \naccess_log.2020.09.07 212.168.101.9 granted \naccess_log.2020.09.07 212.168.101.10 denied \naccess_log.2020.09.07 212.168.101.11 granted \naccess_log.2020.09.07 212.168.101.6 denied";
        String[] arrayLog = logs.split("\\n");
        String[][] arrayLogSecond = new String[arrayLog.length][2];
        for (int i = 0; i < arrayLog.length; i++) {
            String[] med = arrayLog[i].split(" ");
            arrayLogSecond[i][0] = med[1];
            arrayLogSecond[i][0] = med[2];
        }

        Object[][] finalLog = new Object[arrayLogSecond.length][3];

        int position = 0;

        for (int i = 0; i < arrayLog.length; i++) {
            for (Object[] el : finalLog) {
                if (null != finalLog[i][0] && finalLog[i][0].equals(arrayLogSecond[i][0])) {
                    if (finalLog[i][0].equals(arrayLogSecond[i][0])) {
                        if (arrayLogSecond[i][1].equalsIgnoreCase("granted")) {
                            int x = (int) finalLog[i][1];
                            x += 1;
                            finalLog[i][1] = x;
                        } else {
                            int x = (int) finalLog[i][1];
                            x += 1;
                            finalLog[i][2] = x;
                        }
                        break;
                    }
            }
                if (null != finalLog[i][0] && finalLog[i][0].equals(arrayLogSecond[i][0])) {
                    if (finalLog[i][0].equals(arrayLogSecond[i][0])) {
                        if (arrayLogSecond[i][1].equalsIgnoreCase("granted")) {
                            int x = (int) finalLog[i][1];
                            x += 1;
                            finalLog[i][1] = x;
                        } else {
                            int x = (int) finalLog[i][1];
                            x += 1;
                            finalLog[i][2] = x;
                        }
                    } else {
                        finalLog[position][0]  = arrayLogSecond[i][0];
//                        el[0] = arrayLogSecond[i][0];
                        if (arrayLogSecond[i][1].equalsIgnoreCase("granted")) {
                           finalLog[position][1] = 1;
                           finalLog[position][2] = 0;
                        } else {
                            finalLog[position][1] = 0;
                            finalLog[position][2] = 1;
                        }
                        position ++;
                    }
                }
//            }

                for (Object[] el : finalLog) {
                    System.out.println(String.format("ip %s: ok - %s, failed - %s", el[0], el[1], el[3]));
                }

            }
        }
    }


//        System.out.println(arrayLog.length);


//            for (int i = 1; i < arrayLog.length - 1; i = i + 3) {
//                for (int j = i + 3; j < arrayLog.length - 1; j = j + 3){
//                    if (arrayLog[i].equals(arrayLog[j])){
//                        if (arrayLog[i + 1].equals("granted")) {
//                            String ok = ("ip " + arrayLog[i] + ":" + " ok");
//                        } else {
//                            String failed = ("ip " + arrayLog[i] + ":" + " failed");
//                        }
//                    }
//                }
//                if (arrayLog[i + 1].equals("granted")) {
//                    String ok = ("ip " + arrayLog[i] + ":" + " ok");
//                    System.out.println(ok);
//                } else {
//                    String failed = ("ip " + arrayLog[i] + ":" + " failed");
//                    System.out.println(failed);
//                }
//            }

