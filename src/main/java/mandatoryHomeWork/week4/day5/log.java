package mandatoryHomeWork.week4.day5;

class log {
    public int minOperations(String[] logs) {
        int count = 0;
        int length = logs.length;

        for(int i = 0; i < length; i++) {
            if(logs[i].equals("../")) {
                count--;
            } else if(logs[i].equals("./")) {
                continue;
            } else {
                count++;
            }
            if(count <= 0) {
                count = 0;
            }
        }

        return count;
    }
}