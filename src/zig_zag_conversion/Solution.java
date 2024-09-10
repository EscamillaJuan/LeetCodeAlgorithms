class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1 || s.length() <= numRows) {
            return s;
        }
        List<StringBuilder> rows = new LinkedList<>();
        for(int i = 0; i < numRows; ++i) {
            rows.add(new StringBuilder());
        }
        int height = 0;
        boolean travelDown = false;
        for(int i = 0; i < s.length(); ++i){
            if(height == 0 || height == numRows -1) travelDown = !travelDown;
            rows.get(height).append(s.charAt(i));
            height += travelDown ? 1 : - 1;
        }

        StringBuilder solutionBuilder = new StringBuilder();
        for(StringBuilder builder : rows){
            solutionBuilder.append(builder);
        }
        return solutionBuilder.toString();
    }
}
