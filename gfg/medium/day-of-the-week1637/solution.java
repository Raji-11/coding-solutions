class Solution {
    public String getDayOfWeek(int[] date) {
        // code here
        int d=date[0];
        int m=date[1];
        int y=date[2];
        
        int t[]={0,3,2,5,0,3,5,1,4,6,2,4};
        
        y-=(m<3)?1:0;
        
        
        int day=(y+y/4-y/100+y/400+t[m-1]+d)%7;
        
        String weekDays[]={
            "Sunday",
            "Monday",
            "Tuesday",
            "Wednesday",
            "Thursday",
            "Friday",
            "Saturday"
        };
        
        return weekDays[day];
    }
}