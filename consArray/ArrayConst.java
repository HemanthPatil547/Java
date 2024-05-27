package consArray;

public class ArrayConst {

	public static void main(String[] args) {

		 Subject s[]=new Subject[3];
	        s[0]=new Subject("s101","java",100);
	        s[1]=new Subject("s102","Ds",100);
	        s[2]=new Subject("s103","Os",100);
	        
	        for(Subject s1:s)
	            System.out.println(s1);
	    

	}

}



class Subject
{
    private String subID;
    private String name;
    private int maxMarks;
    private int marksObtains;
    
    public Subject(String sID,String name,int maxMarks)
    {
        this.subID=sID;
        this.name=name;
        this.maxMarks=maxMarks;
    }
    
    public String getSubID()
    {
    	return subID;
    }
    public String getName()
    {
    	return name;
    }
    public int getMaxMarks()
    {
    	return maxMarks;
    }
    public int getMarksObtains()
    {
    	return marksObtains;
    }
    
    public void setMaxMarks(int mm)
    {
        maxMarks=mm;
    }
    
    public void setMarksObtain(int m)
    {
        marksObtains=m;
    }
    
    boolean isQualified()
    {
        return marksObtains>=maxMarks/10*4;
    }
    
    public String toString()
    {
        return"\n SubjectID: "+subID+"\n Name "+name+"\n MarksObtained "+marksObtains;
    }
    
}


    
