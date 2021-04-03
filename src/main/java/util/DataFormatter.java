package util;

public class DataFormatter {
    public static Integer[] parseData(String data){
        data = data.replace("[", "");
        data = data.replace("]", "");

        String[] dataSplit = data.split(",");
        Integer[] result = new Integer[dataSplit.length];

        for(int i = 0; i < dataSplit.length; i++){
            if(dataSplit[i].equals("null")){
                result[i] = null;
            } else {
                result[i] = Integer.valueOf(dataSplit[i]);
            }
        }
        return result;
    }
}
