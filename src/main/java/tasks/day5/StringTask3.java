package main.java.tasks.day5;

public class StringTask3 {
    package main.java.tasks.day5;

import java.util.Arrays;

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
            String[] arrayLog = logs.split(" ");


            for (int i = 1; i < arrayLog.length - 1; i = i + 3) {
                int countGranted = 0;
                int countFailed = 0;
                for (int j = i + 3; j < arrayLog.length - 1; j = j + 3){
                    if (arrayLog[i].equals(arrayLog[j])){
                        if (arrayLog[i + 1].equals("granted")) {
                            String ok = ("ip " + arrayLog[i] + ":" + " ok");
                        } else {
                            String failed = ("ip " + arrayLog[i] + ":" + " failed");
                        }
                    }
                }
                if (arrayLog[i + 1].equals("granted")) {
                    String ok = ("ip " + arrayLog[i] + ":" + " ok");
                    System.out.println(ok);
                } else {
                    String failed = ("ip " + arrayLog[i] + ":" + " failed");
                    System.out.println(failed);
                }
            }


        }
    }
}
