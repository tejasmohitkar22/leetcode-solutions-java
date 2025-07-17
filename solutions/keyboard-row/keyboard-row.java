class Solution {
    public String[] findWords(String[] words) {

        List<String> list = new ArrayList<String>();

        int row = 0;
        boolean flag = false;

        for(int i = 0; i < words.length; i++){

            row = getRow(words[i].toLowerCase().charAt(0));
            flag = true;

            for(int j = 0; j < words[i].length(); j++){

                if(row != getRow(words[i].toLowerCase().charAt(j))){
                    flag = false;
                    break;
                }
            }
            if(flag){
                list.add(words[i]);
            }
        }
        return list.toArray(new String[0]);

    }

        public int getRow(char ch){
        String firstRow = "qwertyuiop";
        String secondRow = "asdfghjkl";
        String thirdRow = "zxcvbnm";

        if(firstRow.contains(ch+"")){
            return 1;
        }
        if(secondRow.contains(ch+"")){
            return 2;
        }
        if(thirdRow.contains(ch+"")){
            return 3;
        }
        return 0;
    }

}