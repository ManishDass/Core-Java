import java.util.*;
class studentLambda {
    public static void main(String[] args) {
        // create ArrayList
        ArrayList<String> sNames = new ArrayList<>();
        sNames.add("Manish");
        sNames.add("Sumit");
        sNames.add("Akash");

        ArrayList<Integer> sID = new ArrayList<>();
        sID.add(12232);
        sID.add(45022);
        sID.add(10923);

        ArrayList<Integer> sMarks = new ArrayList<>();
        sMarks.add(91);
        sMarks.add(87);
        sMarks.add(76);

        sRecord sData = (names,id, marks) -> {
            for(int i=0;i<sNames.size();i++)
            {
                System.out.println("Name: " + names.get(i) + " ID:" + id.get(i) + " Marks:" + marks.get(i)); 
            }
        };

        sData.record(sNames, sID, sMarks);
    }
}

interface sRecord {
    void record(ArrayList<String> sNames,ArrayList<Integer> sID,ArrayList<Integer> sMarks);
}